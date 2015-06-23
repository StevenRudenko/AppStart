package io.github.stevenrudenko.appstart;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

import java.util.List;

/** Application. */
public class App extends Application {
    /** Log tag. */
    private static final String TAG = App.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(Consts.TAG, TAG + ":onCreate()");

        final ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            final List<ActivityManager.AppTask> tasks = am.getAppTasks();
            for (ActivityManager.AppTask task : tasks) {
                final Intent i = task.getTaskInfo().baseIntent;
                Log.d(Consts.TAG, TAG + ":intent:" + i.getAction());
                if (i.getAction().equals(Intent.ACTIONg_MAIN)) {
                    Log.d(Consts.TAG, "HOORAY!   We started by click on dashboard icon!");
                }
            }
        } else {
            final List<ActivityManager.RunningTaskInfo> tasks = am.getRunningTasks(1);
            for (ActivityManager.RunningTaskInfo task : tasks) {
                Log.d(Consts.TAG, TAG + ":intent:" + task.baseActivity.getClassName());
                if (task.baseActivity.getClassName().equals(LauncherActivity.class.getName())) {
                    Log.d(Consts.TAG, "HOORAY!   We started by click on dashboard icon!");
                }
            }
        }
    }
}
