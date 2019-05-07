package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> names = new ArrayList<>();
    private ArrayAdapter<String> dataAdapter;
    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);

        names.add("Engin");
        names.add("Veli");
        names.add("Cevher");
        names.add("Kemal");
        names.add("Kuzey");
        names.add("Jordan");
        names.add("Cafer");
        names.add("Kamil");

        dataAdapter = new ArrayAdapter<String>(MainActivity.this , android.R.layout.simple_list_item_1 ,
                android.R.id.text1 , names);
        list.setAdapter(dataAdapter);
    }
}
