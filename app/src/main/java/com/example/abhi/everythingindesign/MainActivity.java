package com.example.abhi.everythingindesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] items = {"Recycler", "Text_Image_Checkbox_switch_etc", "My Services","Timer Thread","French Talking App"};
        ListAdapter mainActivityAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        ListView lvMain_Activity = (ListView) findViewById(R.id.lvMain_Activity);
        lvMain_Activity.setAdapter(mainActivityAdapter);

        lvMain_Activity.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String item = String.valueOf(parent.getItemAtPosition(position));
                        //int P = (int) parent.getItemAtPosition(position);
                        Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG).show();


                        switch (item) {

                            case "Recycler" :
                                Intent intent = new Intent(MainActivity.this, MyRecyclerMain.class);
                                startActivity(intent);
                                break;

                            case "Text_Image_Checkbox_switch_etc":
                                Intent t = new Intent(MainActivity.this, WidgetsMain.class);
                                startActivity(t);
                                break;

                            case "My Services":
                                Intent b = new Intent(MainActivity.this, ServiceMain.class);
                                startActivity(b);
                                break;
                            case "Timer Thread":
                                Intent c = new Intent(MainActivity.this, ThreadTimer.class);
                                startActivity(c);
                                break;
                            case "French Talking App":
                                Intent d = new Intent(MainActivity.this, FrechTalkingApp.class);
                                startActivity(d);
                                break;
                        }
                    }
                }

        );
    }
}


