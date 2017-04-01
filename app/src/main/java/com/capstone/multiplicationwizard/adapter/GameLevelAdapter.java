package com.capstone.multiplicationwizard.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.capstone.multiplicationwizard.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Madhuri on 2/22/2017.
 */
public class GameLevelAdapter extends ArrayAdapter {
    private Context context;
    private int layoutResourceId;
    private ArrayList data;

    public GameLevelAdapter(Context context, int layoutResourceId, ArrayList data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        RecyclerView.ViewHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            Integer level = (Integer)data.get(position);
            if(level > 0) {
                row.findViewById(R.id.iv_lock).setVisibility(View.GONE);
                TextView tv_level = (TextView)row.findViewById(R.id.tv_level);
                tv_level.setVisibility(View.VISIBLE);
                tv_level.setText(level.toString());
            }
        }
        return row;
    }

}
