package com.example.palmdigital.scope02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void myAwesomeMethod()
    {
        int myInt = 1;
        Double myDouble = 4.0;
        String myString = "Hello World";
        TextView myTv = null;
        ImageView myIv = null;
        Button myButton = findViewById(R.id.top);
    }

    public void myAwesomeMethod2()
    {
        int myInt2 = 2;
        Double myDouble2 = 2.0;
        String myString2 = "Hello World Again";
        TextView myTv2 = null;
        ImageView myIv2 = null;
        Button myButton2 = findViewById(R.id.button_top_middle);
    }

    public void myAwesomeMethod3()
    {
        int myInt3 = 3;
        Double myDouble3 = 3.0;
        String myString3 = "Hello Worlds";
        TextView myTv3 = null;
        ImageView myIv3 = null;
        Button myButton3 = findViewById(R.id.middle);
    }

    public void myAwesomeMethod4()
    {
        int myInt4 = 4;
        Double myDouble4 = 4.0;
        String myString4 = "Hello Worlds Again";
        TextView myTv4 = null;
        ImageView myIv4 = null;
        Button mybutton4 = findViewById(R.id.button_middle_bottom);
    }

    public void myAwesomeMethod5()
    {

        int myInt5 = 5;
        Double myDouble5 = 5.0;
        String myString5 = "Goodbye World";
        TextView myTv5 = null;
        ImageView myIv5 = null;
        Button myButton5 = findViewById(R.id.button_bottom);
    }

}
