package com.example.palmdigital.fizzbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView fb = findViewById(R.id.i);

    }

    public void onClick (View v)
    {
        for (int i = 1; i < 101; i++)
        {
            if (i % 15 == 0)
            {
                System.out.println();
            }
        }
    }

}
