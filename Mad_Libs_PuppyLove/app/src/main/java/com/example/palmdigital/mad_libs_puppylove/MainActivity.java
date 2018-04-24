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

        EditText et_bodyPart = findViewById(R.id.et_bodyPart);
        String bodyPartStr = et_bodyPart.getText().toString();

        EditText et_noun1 = findViewById(R.id.et_noun);
        String noun1Str = et_noun1.getText().toString();

        EditText et_verb1 = findViewById(R.id.et_verb);
        String verb1Str = et_verb1.getText().toString();

        EditText et_adjective1 = findViewById(R.id.et_adjective);
        String adjective1Str = et_adjective1.getText().toString();

        EditText et_adjective2 = findViewById(R.id.et_adjective2);
        String adjective2Str = et_adjective2.getText().toString();

        EditText et_verb2 = findViewById(R.id.et_verb2);
        String verb2Str = et_verb2.getText().toString();

        EditText et_noun2 = findViewById(R.id.et_noun2);
        String noun2Str = et_noun2.getText().toString();

        EditText et_noun3 = findViewById(R.id.et_noun3);
        String noun3Str = et_noun3.getText().toString();

        String story = "Today I saw him again. When he looks at me with those " + color1Str + " eyes, it makes my " + bodyPartStr + " go pitterpat, and I feel as if I have " + noun1Str + " in my stomach. When he scrunches his nose, I want to " + verb1Str + " him softly. He is so " + adjective1Str + " and " +  adjective2Str + "." + " Tomorrow he will be mine. For now he " + verb2Str + " in the store " + noun2Str + " looking at me. " + noun3Str + " love is hard to resist.";

        TextView output = findViewById(R.id.tvStory);
        output.setText(story);
    }
}
