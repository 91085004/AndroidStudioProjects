package com.example.palmdigital.buttontotextview01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject1 = findViewById(R.id.button1);
        buttonObject1.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        TextView tvoObject = findViewById(R.id.textView1);
        String text = tvoObject.getText().toString();
        if(text == "On")
        {
            tvoObject.setText("Off");
        }
        else {
            tvoObject.setText("On");

        }
    }
}
