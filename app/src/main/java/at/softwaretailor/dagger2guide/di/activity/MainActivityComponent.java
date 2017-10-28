package at.softwaretailor.dagger2guide.di.activity;

import at.softwaretailor.dagger2guide.MainActivity;
import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * Created by wolfg on 27-Oct-17.
 */

@Subcomponent(modules = { MainActivityModule.class } )
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance Builder someString(String someString);
        @BindsInstance Builder mainActivity(MainActivity mainActivity);

        Builder mainActivityModule(MainActivityModule mainActivityModule);

        MainActivityComponent build();
    }

}
