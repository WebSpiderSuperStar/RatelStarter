package com.payne.ratelstarter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.virjar.ratel.api.RatelToolKit;
import com.virjar.ratel.api.rposed.IRposedHookLoadPackage;
import com.virjar.ratel.api.rposed.RC_MethodHook;
import com.virjar.ratel.api.rposed.RposedHelpers;
import com.virjar.ratel.api.rposed.callbacks.RC_LoadPackage;

public class HookEntry implements IRposedHookLoadPackage {

  private static final String TAG = "payne";
  private static final String PackageName = "PackageName";

  @Override
  public void handleLoadPackage(RC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
    if (lpparam.packageName.equals(PackageName)) {
      Log.d(TAG, "handleLoadPackage: Hook successfully" + PackageName);
    }
  }
}
