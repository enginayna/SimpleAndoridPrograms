package com.example.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private Spinner spinner;
private Button button;
private ArrayList<String> names = new ArrayList<>();
private ArrayAdapter<String> dataAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        spinner = findViewById(R.id.spinner);

        names.add("Mirror");
        names.add("Eraser");
        names.add("Pencil");
        names.add("Paper");
        names.add("Keyboard");
        names.add("Mouse");
        names.add("Calculater");
        names.add("Computer");

        dataAdapter = new ArrayAdapter<String>(MainActivity.this , android.R.layout.simple_list_item_1,
                android.R.id.text1, names);
        spinner.setAdapter(dataAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = spinner.getSelectedItem().toString();

                Toast.makeText(MainActivity.this , data + " secildi" , Toast.LENGTH_SHORT).show();
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String data = names.get(position);
                Toast.makeText(getApplicationContext(), "Secilen " + data , Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
