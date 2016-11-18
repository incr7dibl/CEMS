package com.example.android.cems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MesaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_list);
        ArrayList<EventName> eventNames=new ArrayList<EventName>();
        eventNames.add(new EventName("Mesa Event 1"));
        eventNames.add(new EventName("Mesa Event 2"));
        eventNames.add(new EventName("Mesa Event 3"));
        eventNames.add(new EventName("Mesa Event 4"));
        eventNames.add(new EventName("Mesa Event 5"));

        EventNameAdapter eventNameAdapter=new EventNameAdapter(this,eventNames);
        ListView listView=(ListView)findViewById(R.id.MyListView);
        listView.setAdapter(eventNameAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                View eventname=(view).findViewById(R.id.event_name_text_view);
                TextView eventname1=(TextView)eventname;
                String eventname2=eventname1.getText().toString();
                switch (i) {
                    case 0:
                        Intent intent=new Intent(MesaActivity.this,EventMain.class);
                        intent.putExtra("key",eventname2);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1=new Intent(MesaActivity.this,EventMain.class);
                        intent1.putExtra("key",eventname2);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(MesaActivity.this,EventMain.class);
                        intent2.putExtra("key",eventname2);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3=new Intent(MesaActivity.this,EventMain.class);
                        intent3.putExtra("key",eventname2);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4=new Intent(MesaActivity.this,EventMain.class);
                        intent4.putExtra("key",eventname2);
                        startActivity(intent4);
                        break;


                }
            }
        });
    }
}
