package com.example.palmdigital.simplecalcv02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    TextView textViewNum1Display;
    TextView tvNum2Display;
    TextView textViewOutput;
    int num1;
    int num2;
    int result;
    int oper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNum1Display=findViewById(R.id.tvNum1Display);
        tvNum2Display=findViewById(R.id.tvNum2Display);
        textViewOutput=findViewById(R.id.tv_output);
        //create a reference to the ImageView XML UI elements
        ImageView imageView1 = findViewById(R.id.imageView_1);
        ImageView imageView2 = findViewById(R.id.imageView_2);
        ImageView imageView3 = findViewById(R.id.imageView_3);
        ImageView imageView4 = findViewById(R.id.imageView_4);
        ImageView imageView5 = findViewById(R.id.imageView_5);
        ImageView imageView6 = findViewById(R.id.imageView_6);
        ImageView imageViewEquals = findViewById(R.id.imageView_Equals);
        ImageView imageViewPlusSign = findViewById(R.id.imageView_plus_sign);
        ImageView imageViewMinusSign = findViewById(R.id.imageView_minus_sign);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageViewEquals.setOnClickListener(this);
        imageViewPlusSign.setOnClickListener(this);
        imageViewMinusSign.setOnClickListener(this);

    }//end of onCreate

    public void onClick(View v)
    {
        if (v.getId() == R.id.imageView_1)
        {
            textViewNum1Display.setText("1");
            num1 = 1;
        }
        else if (v.getId()==R.id.imageView_2)
        {
            textViewNum1Display.setText("2");
            num1 = 2;
        }
        else if (v.getId() == R.id.imageView_3)
        {
            textViewNum1Display.setText("3");
            num1 = 3;
        }
        else if (v.getId() == R.id.imageView_4)
        {
            tvNum2Display.setText("4");
            num2 = 4;
        }
        else if (v.getId() == R.id.imageView_5)
        {
            tvNum2Display.setText("5");
            num2 = 5;
        }
        else if (v.getId()==R.id.imageView_6)
        {
            tvNum2Display.setText("6");
            num2 = 6;
        }
        else if (v.getId() == R.id.imageView_plus_sign)
        {
            oper = 0;
        }
        else if (v.getId() == R.id.imageView_minus_sign)
        {
            oper = 1;
        }
        else if (v.getId() == R.id.imageView_Equals) {
            if (oper == 0) {
                result = num1 + num2;
            }
            if (oper == 1)
            {
                result = num1 - num2;
            }
            textViewOutput.setText("" + result);
        }


}
}
