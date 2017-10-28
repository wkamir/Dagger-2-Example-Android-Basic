package at.softwaretailor.dagger2guide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

/**
 * Created by wolfg on 27-Oct-17.
 */

public class SomeDialogFragment extends DialogFragment {

    @Inject
    FragmentManager fragmentManager;

    @Inject
    public SomeDialogFragment() { }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_somedialog, container, false);
    }

    public void show() {

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        Fragment prev = fragmentManager.findFragmentByTag("dialog");

        if (prev != null)
            transaction.remove(prev);

        transaction.addToBackStack(null);
        show(transaction, "dialog");
    }
}
