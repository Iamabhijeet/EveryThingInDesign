package com.example.abhi.everythingindesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class ServiceMain extends AppCompatActivity {
    TextView tvToggleState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_main);
        ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);
        tvToggleState = (TextView) findViewById(R.id.tvToggleState);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                    tvToggleState.setText("ON");
                } else {
                    // The toggle is disabled
                    tvToggleState.setText("OFF");
                }
            }
        });
        // Lesson 41
//        Intent intent = new Intent(this,TheIntentService.class);
//        startService(intent);
//        // Lesson 42
        Intent service = new Intent(this,MyService.class);
        startService(service);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
