package io.quicksave.android;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;


public class MainActivity extends FragmentActivity implements IntentItemFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new IntentItemFragment())
                    .commit();
        }
    }

    @Override
    public void onFragmentInteraction(Intent intent) {
            startActivity(intent);
    }
}
