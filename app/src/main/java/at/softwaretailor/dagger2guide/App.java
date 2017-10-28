package at.softwaretailor.dagger2guide;

import android.app.Application;

import at.softwaretailor.dagger2guide.di.app.AppComponent;
import at.softwaretailor.dagger2guide.di.app.AppModule;
import at.softwaretailor.dagger2guide.di.app.DaggerAppComponent;

/**
 * Created by wolfg on 27-Oct-17.
 */

public class App extends Application {

    private static AppComponent appComponent;

    public static AppComponent getAppComponent() { return appComponent; }

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                                         .appModule(new AppModule(this))
                                         .build();
    }
}
