package com.example.funky;

import static com.example.funky.R.drawable.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imv = findViewById(R.id.imageView1);
        Button btn = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               float rot = imv.getRotation();
               imv.setRotation(rot + 25f);
            }
      });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float rot = imv.getRotation();
                imv.setRotation(rot - 25f);
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("started", "start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("stopped", "stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("destroy", "destroyed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("pause", "paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("res", "resumed");

    }
}