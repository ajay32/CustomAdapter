package com.acmegames.customadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by michael hantler on 1/6/2015.
 */
public class CountingListAdapter extends BaseAdapter{

    private static final int MAX_COUNT = 36;
    private LayoutInflater mInflater;

    public CountingListAdapter(LayoutInflater inflater){
        mInflater = inflater;
    }

    @Override
    public int getCount() {
        return  MAX_COUNT;
    }

    @Override
    public Object getItem(int position) {
        if(position > (MAX_COUNT/2)){
            return position + " down the list";
        }
        else{
            return "This is item: " + position;
        }


    }

    @Override
    public long getItemId(int position) {
        return  position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = mInflater.inflate(R.layout.list_item, parent, false);
        }
       /* ImageView image = (ImageView) convertView.findViewById(R.id.ivIcon);
        image.setImageResource(position%2==0?android.R.drawable.sym_action_call:
                android.R.drawable.sym_action_chat);
        TextView text = (TextView) convertView.findViewById(R.id.tvItem);
        text.setText(String.valueOf(position));
        return convertView;*/

        return  convertView;


    }

}
