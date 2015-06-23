package io.github.stevenrudenko.appstart;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/** Test receiver */
public class TestReceiver extends BroadcastReceiver {
    /** Log tag. */
    private static final String TAG = TestReceiver.class.getSimpleName();

    @Override
    public void onReceive(final Context context, final Intent intent) {
        Log.d(Consts.TAG, TAG + ":onReceive()");
        context.startService(new Intent(context, TestService.class));
    }

}
