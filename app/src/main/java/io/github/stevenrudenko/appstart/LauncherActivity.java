package io.github.stevenrudenko.appstart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class LauncherActivity extends AppCompatActivity {
    /** Log tag. */
    private static final String TAG = LauncherActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Consts.TAG, TAG + ":onCreate()");
        startActivity(new Intent(this, MainActivity.class));
    }

}
