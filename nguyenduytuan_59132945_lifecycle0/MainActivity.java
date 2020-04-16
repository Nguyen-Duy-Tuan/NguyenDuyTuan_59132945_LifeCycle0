package com.example.nguyenduytuan_59132945_lifecycle0;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity
{
    TextView txtTG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Life Cycle", "onCreate Called");
        Toast.makeText(getApplicationContext(),"Tuan",Toast.LENGTH_SHORT).show();
        txtTG = findViewById(R.id.txtTG);
        SimpleDateFormat spF = new SimpleDateFormat("HH:mm:ss");
        String date = spF.format(new Date());
        txtTG.setText(date);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life Cycle", "onRestart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life Cycle", "onResume Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life Cycle", "onStart Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life Cycle", "onPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life Cycle", "onStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life Cycle", "onDestroy Called");
    }
}
