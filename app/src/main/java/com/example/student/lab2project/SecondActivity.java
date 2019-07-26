package com.example.student.lab2project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView text3;
    TextView text4;

    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
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

    }
}
