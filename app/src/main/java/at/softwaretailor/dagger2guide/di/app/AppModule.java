package at.softwaretailor.dagger2guide.di.app;

import android.content.Context;

import at.softwaretailor.dagger2guide.App;
import dagger.Module;
import dagger.Provides;

/**
 * Created by wolfg on 27-Oct-17.
 */

@Module
public class AppModule {
    private App mApp;

    public AppModule(App app) {
        mApp = app;
    }

    @Provides
    Context providesContext() { return mApp.getApplicationContext(); }

}
