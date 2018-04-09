package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    int myInt;
    //
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declare a local variable
        //dataType variableName; <-- this is a local variable declaration

        //some examples of primitive types and declarations
        myInt = 100; // int is a Java primitive type
        myInt = 200;
        double myDouble; // double is a Java primitive type
        char myChar = 'A';
        float myFloat;
        boolean myBool;
        long myLong;
        byte myByte;
        // these are classes
        String myString;
        Integer myInt2;
        Float myFloat2;
        Double myDouble2;
        //assign values to these variables
        myString = "This is an awesome string";
        myInt = awesomeMethod(myInt);
        Log.i("info", "myInt");
        myDouble = 5.6;
        myFloat = 5.7f;
        myBool = true;
        myBool = false;

        TextView tvNum1Display = findViewById(R.id.tvNum1Display);
        TextView tvNum2Display = findViewById(R.id.tvNum2Display);

        ImageView iv_stuff;
        Button button;

    }// end of onCreate
// lets try to put a method here
    public int awesomeMethod(int input)
 {
     myInt = 10;
     awesomeMethod2();
     return input + 5;
 }// end of awesomeMethod

 public void awesomeMethod2()
 {
     //myInt
     System.out.println("myInt = " + 3.14159);
 }// end of awesomeMethod2

}// end of MainActivity class

