package com.example.palmdigital.mad_libs_puppylove;

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
        EditText et_color = findViewById(R.id.et_color);
        String color1Str = et_color.getText().toString();

        String story = "Today I saw him again. When he looks at me with those ";
        story = story + color1Str;

        TextView output = findViewById(R.id.tvStory);
        output.setText(story);
    }
}
