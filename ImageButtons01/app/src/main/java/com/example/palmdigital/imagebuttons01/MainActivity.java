package com.example.palmdigital.imagebuttons01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cookieClickedBoi(View v) {
        Toast.makeText(this, "Cookie Clicked", Toast.LENGTH_SHORT).show();
        Log.d("cookie", "clicked boi");

    }
}
