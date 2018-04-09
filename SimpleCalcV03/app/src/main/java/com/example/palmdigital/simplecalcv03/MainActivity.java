package com.example.palmdigital.simplecalcv03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

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

        textViewNum1Display = findViewById(R.id.tvNum1Display);
        tvNum2Display = findViewById(R.id.tvNum2Display);
        textViewOutput = findViewById(R.id.tv_output);
        ImageView imageView1 = findViewById(R.id.number0_1);
        ImageView imageView2 = findViewById(R.id.number1_1);
        ImageView imageView3 = findViewById(R.id.number2_1);
        ImageView imageView4 = findViewById(R.id.number3_1);
        ImageView imageView5 = findViewById(R.id.number4_1);
        ImageView imageView6 = findViewById(R.id.number5_1);
        ImageView imageView7 = findViewById(R.id.number6_1);
        ImageView imageView8 = findViewById(R.id.number7_1);
        ImageView imageView9 = findViewById(R.id.number8_1);
        ImageView imageView10 = findViewById(R.id.number9_1);
        ImageView imageView11 = findViewById(R.id.number0_2);
        ImageView imageView12 = findViewById(R.id.number1_2);
        ImageView imageView13 = findViewById(R.id.number2_2);
        ImageView imageView14 = findViewById(R.id.number3_2);
        ImageView imageView15 = findViewById(R.id.number4_2);
        ImageView imageView16 = findViewById(R.id.number5_2);
        ImageView imageView17 = findViewById(R.id.number6_2);
        ImageView imageView18 = findViewById(R.id.number7_2);
        ImageView imageView19 = findViewById(R.id.number8_2);
        ImageView imageView20 = findViewById(R.id.number9_2);
        ImageView imageView21 = findViewById(R.id.plus_sign);
        ImageView imageView22 = findViewById(R.id.minus_sign);
        ImageView imageView23 = findViewById(R.id.multiplication_sign);
        ImageView imageView24 = findViewById(R.id.division_sign);
        ImageView imageview25 = findViewById(R.id.equal_sign);
        ImageView imageView26 = findViewById(R.id.exponent);
        ImageView imageView27 = findViewById(R.id.clear);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);
        imageView9.setOnClickListener(this);
        imageView10.setOnClickListener(this);
        imageView11.setOnClickListener(this);
        imageView12.setOnClickListener(this);
        imageView12.setOnClickListener(this);
        imageView13.setOnClickListener(this);
        imageView14.setOnClickListener(this);
        imageView15.setOnClickListener(this);
        imageView16.setOnClickListener(this);
        imageView17.setOnClickListener(this);
        imageView18.setOnClickListener(this);
        imageView19.setOnClickListener(this);
        imageView20.setOnClickListener(this);
        imageView21.setOnClickListener(this);
        imageView22.setOnClickListener(this);
        imageView23.setOnClickListener(this);
        imageView24.setOnClickListener(this);
        imageview25.setOnClickListener(this);
        imageView26.setOnClickListener(this);
        imageView27.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        String currNum1Val = textViewNum1Display.getText().toString();
        String currNum2Val = tvNum2Display.getText().toString();
        //Log.i("info", "current value of top textView is " + currNum1Val);
        if(currNum1Val.equals("0"))
            currNum1Val = "";
        if (currNum2Val.equals("0"))
            currNum2Val = "";

        if (view.getId() == R.id.clear)
    {
        textViewNum1Display.setText("0");
        tvNum2Display.setText("0");
        textViewOutput.setText("");
        num1 = 0;
        num2 = 0;
    }
    else if (view.getId() == R.id.number0_1)
    {
        textViewNum1Display.setText(currNum1Val + "0");
        int temp = Integer.parseInt(currNum1Val + "0");
        num1 = temp;
    }
    else if (view.getId() == R.id.number1_1)
    {
        textViewNum1Display.setText(currNum1Val + "1");
        int temp = Integer.parseInt(currNum1Val + "1");
        num1 = temp;
    }
    else if (view.getId() == R.id.number2_1)
    {
        textViewNum1Display.setText(currNum1Val + "2");
        int temp = Integer.parseInt(currNum1Val + "2");
        num1 = temp;
    }
    else if (view.getId() == R.id.number3_1)
    {
        textViewNum1Display.setText(currNum1Val + "3");
        int temp = Integer.parseInt(currNum1Val + "3");
        num1 = temp;
    }
    else if (view.getId() == R.id.number4_1)
    {
        textViewNum1Display.setText(currNum1Val + "4");
        int temp = Integer.parseInt(currNum1Val + "4");
        num1 = temp;
    }
    else if (view.getId() == R.id.number5_1)
    {
        textViewNum1Display.setText(currNum1Val + "5");
        int temp = Integer.parseInt(currNum1Val + "5");
        num1 = temp;
    }
    else if (view.getId() == R.id.number6_1)
    {
        textViewNum1Display.setText(currNum1Val + "6");
        int temp = Integer.parseInt(currNum1Val + "6");
        num1 = temp;
    }
    else if (view.getId() == R.id.number7_1)
    {
        textViewNum1Display.setText(currNum1Val + "7");
        int temp = Integer.parseInt(currNum1Val + "7");
        num1 = temp;
    }
    else if (view.getId() == R.id.number8_1)
    {
        textViewNum1Display.setText(currNum1Val + "8");
        int temp = Integer.parseInt(currNum1Val + "8");
        num1 = temp;
    }
    else if (view.getId() == R.id.number9_1)
    {
        textViewNum1Display.setText(currNum1Val + "9");
        int temp = Integer.parseInt(currNum1Val + "9");
        num1 = temp;
    }
    else if (view.getId() == R.id.number0_2)
    {
        tvNum2Display.setText(currNum2Val + "0");
        int temp2 = Integer.parseInt(currNum2Val + "0");
        num2 = temp2;
    }
    else if (view.getId() == R.id.number1_2)
    {
        tvNum2Display.setText(currNum2Val + "1");
        int temp2 = Integer.parseInt(currNum2Val + "1");
        num2 = temp2;
    }
    else if (view.getId() == R.id.number2_2)
    {
        tvNum2Display.setText(currNum2Val + "2");
        int temp2 = Integer.parseInt(currNum2Val + "2");
        num2 = temp2;
    }
    else if (view.getId() == R.id.number3_2)
    {
        tvNum2Display.setText(currNum2Val + "3");
        int temp2 = Integer.parseInt(currNum2Val + "3");
        num2 = temp2;
    }
    else if (view.getId() == R.id.number4_2)
    {
        tvNum2Display.setText(currNum2Val + "4");
        int temp2 = Integer.parseInt(currNum2Val + "4");
        num2 = temp2;
    }
    else if (view.getId() == R.id.number5_2)
    {
        tvNum2Display.setText(currNum2Val +"5");
        int temp2 = Integer.parseInt(currNum2Val + "5");
        num2 = temp2;
    }
    else if (view.getId() == R.id.number6_2)
    {
        tvNum2Display.setText(currNum2Val + "6");
        int temp2 = Integer.parseInt(currNum2Val + "6");
        num2 = temp2;
    }
    else if (view.getId() == R.id.number7_2)
    {
        tvNum2Display.setText(currNum2Val + "7");
        int temp2 = Integer.parseInt(currNum2Val + "7");
        num2 = temp2;
    }
    else if (view.getId() == R.id.number8_2)
    {
        tvNum2Display.setText(currNum2Val + "8");
        int temp2 = Integer.parseInt(currNum2Val + "8");
        num2 = temp2;
    }
    else if (view.getId() == R.id.number9_2)
    {
        tvNum2Display.setText(currNum2Val + "9");
        int temp2 = Integer.parseInt(currNum2Val + "9");
        num2 = temp2;
    }
    else if (view.getId() == R.id.clear)
    {
        textViewNum1Display.setText("0");
        tvNum2Display.setText("0");
        textViewOutput.setText("");
    }
    else if (view.getId() == R.id.plus_sign)
    {
        oper = 1;
    }
    else if (view.getId() == R.id.minus_sign)
    {
        oper = 2;
    }
    else if (view.getId() == R.id.multiplication_sign)
    {
        oper = 3;
    }
    else if (view.getId() == R.id.division_sign)
    {
        oper = 4;
        }
    else if (view.getId() == R.id.exponent)
    {
        oper = 5;
    }
    else if (view.getId() == R.id.equal_sign)
    {

        if (oper == 1) {
            result = num1 + num2;
        }
        if (oper == 2) {
            result = num1 - num2;
        }
        if (oper == 3) {
            result = num1 * num2;
        }
        if (oper == 4) {
            if (num2 == 0)
            {
                Toast.makeText(this,"Division by 0 not accepted",Toast.LENGTH_SHORT).show();
            }
            else
            {
                result = num1/num2;
            }
        }
        if (oper == 5) {
            result = exp(num1, num2);
        }
        textViewOutput.setText("" + result);
    }
    }//end of onClick
    public int exp(int base, int exponent)
    {
        int product = 1;
        for (int i = 0; i < exponent; i++)
        {
            product = product * base;
        }
        return product;
    }

}//end of class