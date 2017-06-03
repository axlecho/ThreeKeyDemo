package onyx.lineage.com.threekeydemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class ThreeKeyReciver extends BroadcastReceiver {

    private static final String TAG = "ThreeKeyReciver";

    @Override
    public void onReceive(Context context, Intent intent) {
        int state = intent.getIntExtra("state", -1);
        Log.d(TAG, "[onReceive] get three key change msg" + state);
    }
}