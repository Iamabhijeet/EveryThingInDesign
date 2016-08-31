package com.example.abhi.everythingindesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class WidgetsMain extends AppCompatActivity {
    RadioButton radioButton;
    TextView textView;
    CheckBox checkBox;
    ToggleButton toggleButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets_main);
        radioButton=(RadioButton)findViewById(R.id.rButton);
        textView=(TextView)findViewById(R.id.tvText);
        checkBox=(CheckBox)findViewById(R.id.cBox);
        toggleButton=(ToggleButton)findViewById(R.id.toggleButton);

        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something when the corky is clicked
                textView.setText("Radio Button Clicked!!");
            }
        });

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something when the corky is clicked
                textView.setText("Toggle Button Clicked!!");
            }
        });

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do something when the corky is clicked
                textView.setText("Check Box Button Clicked!!");
            }
        });



    }
}
