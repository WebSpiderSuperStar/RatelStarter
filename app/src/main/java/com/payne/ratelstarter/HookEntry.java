package com.payne.ratelstarter;

import android.util.Log;
import com.virjar.ratel.api.rposed.IRposedHookLoadPackage;
import com.virjar.ratel.api.rposed.callbacks.RC_LoadPackage;

public class HookEntry implements IRposedHookLoadPackage {

  private static final String TAG = "payne";
  private static final String PackageName = "PackageName";

  @Override
  public void handleLoadPackage(RC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
    if (lpparam.packageName.equals(PackageName)) {
      Log.d(TAG, "handleLoadPackage: Hook successfully" + lpparam.packageName);
    }
  }
}
