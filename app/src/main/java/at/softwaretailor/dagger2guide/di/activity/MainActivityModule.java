package at.softwaretailor.dagger2guide.di.activity;

import android.support.v4.app.FragmentManager;

import at.softwaretailor.dagger2guide.MainActivity;
import dagger.Module;
import dagger.Provides;

/**
 * Created by wolfg on 27-Oct-17.
 */

@Module
public class MainActivityModule {

//    private MainActivity mainActivity;
//
//    @Inject
//    public MainActivityModule(MainActivity mainActivity) {
//        this.mainActivity = mainActivity;
//    }

    @Provides
    FragmentManager fragmentManager(MainActivity mainActivity) {
        return mainActivity.getSupportFragmentManager();
    }

}
