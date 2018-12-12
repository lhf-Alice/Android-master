package com.example.linhongfeng.androidproject.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.linhongfeng.androidproject.R;

import java.util.List;

/**
 * @author lhf
 * @create 2018/11/29
 * @Describe
 */
public class GeneralAdapter extends RecyclerView.Adapter<GeneralAdapter.MyViewHolder> {

    private Context mContext;
    //RecyclerView填充Item数据的List对象
    List<String> datas;

    public GeneralAdapter(Context context,List<String> datas){
        this.mContext = context;
        this.datas = datas;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup mViewGroup, int mI) {
        View inflate = View.inflate(mContext, R.layout.recycllerview_item_apply, null);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder mMyViewHolder, int mI) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
