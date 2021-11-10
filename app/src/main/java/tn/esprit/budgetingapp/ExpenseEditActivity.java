package tn.esprit.budgetingapp;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

import tn.esprit.budgetingapp.fragments.ExpenseEditFragment;


public class ExpenseEditActivity extends BaseFragmentActivity {

    /* Important: use onCreate(Bundle savedInstanceState)
     * instead of onCreate(Bundle savedInstanceState, PersistableBundle persistentState) */
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fragment c = new ExpenseEditFragment();
        insertFragment(c);
        setupActionBar();
    }


    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // Show the Up button in the action bar (toolbar).
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
