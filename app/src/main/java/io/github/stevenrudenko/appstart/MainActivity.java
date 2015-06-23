package io.github.stevenrudenko.appstart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    /** Log tag. */
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Consts.TAG, TAG + ":onCreate()");
        setContentView(R.layout.activity_main);
    }

}
