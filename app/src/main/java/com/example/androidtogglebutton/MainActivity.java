package com.example.androidtogglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView =  findViewById(R.id.textView);
        ToggleButton toggleButton  = findViewById(R.id.toggleButton);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true)
                {
                    textView.setText("Toggle Button state is On");
                    Toast.makeText(MainActivity.this, "Toggle Button state is On", Toast.LENGTH_SHORT).show();
                }
                else 
                {
                    textView.setText("Toggle Button state is OFF");
                    Toast.makeText(MainActivity.this, "Toggle Button state is Off", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
