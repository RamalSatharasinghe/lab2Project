package com.example.student.lab2project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView text3;
    TextView text4;

    TextView text5;
    TextView text6;

    TextView text7;

    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;

    Integer add1;

    Integer Mul;

    Integer sub1;

    Double divi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text3 = findViewById(R.id.textView3);
        text3.setText(R.string.num1);

        text4 = findViewById(R.id.textView4);
        text4.setText(R.string.num2);

        btn2 = findViewById(R.id.button2);
        btn2.setText(R.string.sum);

        btn3 = findViewById(R.id.button3);
        btn3.setText(R.string.sub);

        btn4 = findViewById(R.id.button4);
        btn4.setText(R.string.mul);

        btn5 = findViewById(R.id.button5);
        btn5.setText(R.string.div);


        text5 = findViewById(R.id.textView5);
        text6 = findViewById(R.id.textView6);

        text7 = findViewById(R.id.ans);

        Intent intent1 = getIntent();

        String no1 = intent1.getStringExtra("number1");
        String no2 = intent1.getStringExtra("number2");


        text5.setText(no1);
        text6.setText(no2);









    }
    public void Add(View view){


        add1 = Integer.parseInt(String.valueOf(text5)) + Integer.parseInt(String.valueOf(text6));

        String answer = String.valueOf(add1);

        text7.setText(answer);
    }

    public void Sub(View view){

        sub1 = Integer.parseInt(String.valueOf(text5)) - Integer.parseInt(String.valueOf(text6));


        String answer = String.valueOf(sub1);

        text7.setText(answer);

    }

    public  void Mul(View view){


        Mul = Integer.parseInt(String.valueOf(text5)) * Integer.parseInt(String.valueOf(text6));


        String answer = String.valueOf(Mul);

        text7.setText(answer);
    }

    public void Div(View view){

        divi = Double.parseDouble(String.valueOf(text5)) / Double.parseDouble(String.valueOf(text6));


        String answer = String.valueOf(divi);

        text7.setText(answer);
    }

}
