package com.neo.firstlibrary;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/5/17.
 */

public class MyFirstApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Log.e("SSSSSSS","======outside==MyFirstApp==onCreate======");
        Toast.makeText(this, "热修复成功", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "热修复", Toast.LENGTH_SHORT).show();
    }
}
