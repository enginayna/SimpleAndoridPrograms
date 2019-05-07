package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
private Button button;
private Switch switch1;
private ToggleButton toggleButton;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        switch1 = findViewById(R.id.switch1);
        toggleButton = findViewById(R.id.toggleButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean eventToggle = toggleButton.isChecked();
                boolean eventSwitch = switch1.isChecked();

                Toast.makeText(MainActivity.this, "Toggle Durum : " + eventToggle + "- Wifi Durum : " + eventSwitch, Toast.LENGTH_SHORT).show();
            }
        });
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //switch button = wifi button uzerinde degisiklik oldugunda bu metot icindeki kodlar calisir.
                Toast.makeText(getApplicationContext(), "Wifi : " + isChecked , Toast.LENGTH_SHORT ).show();
            }
        });

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                Toast.makeText(getApplicationContext(), "Toggle event : " + isChecked , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
