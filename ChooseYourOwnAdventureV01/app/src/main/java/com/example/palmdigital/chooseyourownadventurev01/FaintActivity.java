package com.example.palmdigital.chooseyourownadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FaintActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faint);

        Button startOverObject = findViewById(R.id.startOver);
        startOverObject.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
       if (view.getId() == R.id.startOver)
       {
           Intent i = new Intent(this, MainActivity.class);
           startActivity(i);
       }
    }
}
