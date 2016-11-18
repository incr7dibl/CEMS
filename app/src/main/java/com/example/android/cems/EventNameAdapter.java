package com.example.android.cems;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Harsh Local on 20-Sep-16.
 */
public class EventNameAdapter extends ArrayAdapter<EventName> {
    public EventNameAdapter(Context context,ArrayList<EventName> eventNames) {
        super(context,0,eventNames);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
      EventName eventName=getItem(position);
        if (convertView==null) {
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);


        }
        TextView event_name=(TextView)convertView.findViewById(R.id.event_name_text_view);
        event_name.setText(eventName.event_name);
        return convertView;
    }
}
