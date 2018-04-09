package com.example.palmdigital.chooseyourownadventurev01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ToiletActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet);

        Button yesObject = findViewById(R.id.leftButtonYes);
        yesObject.setOnClickListener(this);
        Button heckYesObject = findViewById(R.id.rightButtonHeckYes);
        heckYesObject.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        if(v.getId() == R.id.leftButtonYes)
        {
            Intent i = new Intent(this, YesActivity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.rightButtonHeckYes)
        {
            Intent i = new Intent(this, YesActivity.class);
            startActivity(i);
        }
    }
}
