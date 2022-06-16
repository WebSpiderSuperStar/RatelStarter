package com.payne.ratelstarter;

import android.util.Log;

import com.virjar.ratel.api.rposed.IRposedHookLoadPackage;
import com.virjar.ratel.api.rposed.callbacks.RC_LoadPackage;

public class HookEntry implements IRposedHookLoadPackage {
    private static final String TAG = "payne";

    @Override
    public void handleLoadPackage(RC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        Log.d(TAG, "handleLoadPackage: ");
    }
}
