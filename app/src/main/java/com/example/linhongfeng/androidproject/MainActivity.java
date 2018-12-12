package com.example.linhongfeng.androidproject;

import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.linhongfeng.androidproject.activity.ApplyRightActivity;
import com.example.linhongfeng.androidproject.activity.ChangeWallpaperActivity;

import java.io.IOException;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mChangeWallpaper, mApplyRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //测试数据
        initData();
        //修改测试数据
    }

    private void initData() {

    }

    private void initView() {
        mChangeWallpaper = findViewById(R.id.btn_change_wallpaper);
        mApplyRight = findViewById(R.id.btn_apply_for_right);
        mChangeWallpaper.setOnClickListener(this);
        mApplyRight.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_change_wallpaper:
                Intent intent = new Intent(MainActivity.this, ChangeWallpaperActivity.class);
                startActivity(intent);

                break;
            case R.id.btn_apply_for_right:
                Intent intent1 = new Intent(MainActivity.this, ApplyRightActivity.class);
                startActivity(intent1);
                break;
        }
    }


    private void initSkin() {
        try {
            //使用资源文件  当然你也可以使用其他图片bitmap
            BitmapDrawable bitmap = (BitmapDrawable) getResources().getDrawable(R.drawable.a);
            WallpaperManager manager = WallpaperManager.getInstance(this);
            manager.setBitmap(bitmap.getBitmap());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
