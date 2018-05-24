package com.neo.firstlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainFirstActivity extends AppCompatActivity {

    private String tag ="two";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(!TextUtils.isEmpty(tag) && tag.equals("one")){
            Toast.makeText(this, "成功了是热修复11111111111111", Toast.LENGTH_SHORT).show();
        }else if(!TextUtils.isEmpty(tag) && tag.equals("two")){
            Toast.makeText(this, "成功了是热修复22222222222222", Toast.LENGTH_SHORT).show();
        }else if(!TextUtils.isEmpty(tag) && tag.equals("three")){
            Toast.makeText(this, "成功了是热修复33333333333333", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "成功了是热修复55555555555555", Toast.LENGTH_SHORT).show();
        }


        Toast.makeText(this, "动态部署结果1", Toast.LENGTH_SHORT).show();
    }

    public void clickNullPoint(View view) {
        Log.e("SSSSS","======new NullPointerException=====");
        //throw new NullPointerException();
    }
}
