package at.softwaretailor.dagger2guide.di.app;

import at.softwaretailor.dagger2guide.di.activity.MainActivityComponent;
import dagger.Component;

/**
 * Created by wolfg on 27-Oct-17.
 */

@Component(modules = { AppModule.class })
public interface AppComponent {

    MainActivityComponent.Builder mainActivityComponentBuilder();

    //MainActivityComponent mainActivityComponent(MainActivityModule mainActivityModule);

}
