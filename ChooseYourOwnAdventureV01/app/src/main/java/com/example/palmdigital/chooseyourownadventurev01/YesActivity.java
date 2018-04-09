package com.example.palmdigital.chooseyourownadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YesActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yes);

        Button startOverAgain = findViewById(R.id.startOver2);
        startOverAgain.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
       if (view.getId() == R.id.startOver2)
       {
           Intent i = new Intent(this, MainActivity.class);
           startActivity(i);
       }
    }
}
