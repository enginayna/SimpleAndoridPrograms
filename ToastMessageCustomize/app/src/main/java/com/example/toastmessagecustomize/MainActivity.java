package com.example.toastmessagecustomize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hazir Toast Mesaj" , Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View design = getLayoutInflater().inflate(R.layout.toastmessage , null);
                TextView textView = design.findViewById(R.id.textView);
                textView.setText("I am Hungry");

                Toast costumize = new Toast(getApplicationContext());
                costumize.setView(design);
                costumize.setDuration(Toast.LENGTH_SHORT);
                costumize.show();
            }
        });
    }
}
