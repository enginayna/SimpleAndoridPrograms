package com.example.togglebutton_swich;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int randomNumber = random.nextInt(5);
                if (randomNumber==0){
                    imageView.setImageResource(R.drawable.ic_headset_black_24dp);
                }
                else if (randomNumber==1){
                    imageView.setImageResource(R.drawable.ic_drive_eta_black_24dp);
                }else if (randomNumber==2){
                    imageView.setImageResource(R.drawable.ic_hourglass_full_black_24dp);
                }else if (randomNumber==3){
                    imageView.setImageResource(R.drawable.ic_import_contacts_black_24dp);
                }else if (randomNumber==4){
                    imageView.setImageResource(R.drawable.ic_keyboard_black_24dp);
                }
            }
        });


    }
}