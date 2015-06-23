package io.github.stevenrudenko.appstart;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/** Test service. */
public class TestService extends IntentService {
    /** Log tag. */
    private static final String TAG = TestService.class.getSimpleName();

    /** Creates an IntentService.  Invoked by your subclass's constructor. */
    public TestService() {
        super(TAG);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(Consts.TAG, TAG + ":onCreate()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(Consts.TAG, TAG + ":onDestroy()");
    }

    @Override
    protected void onHandleIntent(final Intent intent) {
        Log.d(Consts.TAG, TAG + ":onHandleIntent()");
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
