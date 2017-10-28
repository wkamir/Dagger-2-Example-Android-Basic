package at.softwaretailor.dagger2guide.di.activity;

import android.content.Context;
import android.support.v4.app.FragmentManager;

import javax.inject.Inject;

/**
 * Created by wolfg on 27-Oct-17.
 */

public class MainActivityPresenter {

    @Inject
    String someString;

    @Inject
    Context context;

    @Inject
    FragmentManager fragmentManager;

    public Context getContext(){
        return context;
    }

    public FragmentManager getFragmentManager() {
        return fragmentManager;
    }

    public String getSomeString() { return someString; }

    @Inject
    public MainActivityPresenter() {
    }
}
