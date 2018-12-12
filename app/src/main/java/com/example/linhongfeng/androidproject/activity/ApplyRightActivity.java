package com.example.linhongfeng.androidproject.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.linhongfeng.androidproject.R;

/**
 * 申请权限
 */
public class ApplyRightActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_right);
        initView();
    }

    /**
     * 初始化view
     */
    private void initView() {
        mRecyclerView = findViewById(R.id.recyclerview_apply_right);


    }
}
