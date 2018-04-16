package com.example.palmdigital.mad_libs_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        EditText et_adj1 = findViewById(R.id.et_adjective1);
        String adj1Str = et_adj1.getText().toString();

        EditText et_nationallity = findViewById(R.id.et_nationallity1);
        String nationallityStr = et_nationallity.getText().toString();

        EditText et_name = findViewById(R.id.et_name1);
        String nameStr = et_name.getText().toString();

        String story = "Pizza was invented by a ";
        story = story + adj1Str;
        story = story + " " + nationallityStr;

        TextView output = findViewById(R.id.tvStory);
        output.setText(story);
    }
}
