package at.softwaretailor.dagger2guide;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;

import javax.inject.Inject;

import at.softwaretailor.dagger2guide.di.activity.MainActivityPresenter;
import at.softwaretailor.dagger2guide.di.app.AppComponent;
import dagger.Lazy;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainActivityPresenter mPresenter;

    @Inject
    Lazy<SomeDialogFragment> someDialogFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppComponent appComponent = App.getAppComponent();

        appComponent.mainActivityComponentBuilder()
                    .mainActivity(this)
                    .someString("Some SCHTRING")
                    .build()
                    .inject(this);

        Context appContext = getApplicationContext();
        Log.i("drugs", mPresenter.getContext() == appContext ? "jo" : "nope");
        Log.i("drugs", mPresenter.getFragmentManager() == this.getSupportFragmentManager() ? "jo" : "nope");
        Log.i("drugs", mPresenter.getSomeString());

        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> someDialogFragment.get().show());
    }
}
