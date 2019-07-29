package com.example.student.lab2project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1;
    TextView text2;

    EditText edit1;
    EditText edit2;

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.textView);
        text1.setText(R.string.num1);

        text2 = findViewById(R.id.textView2);
        text2.setText(R.string.num2);

        button1 = findViewById(R.id.button);
        button1.setText(R.string.ok);

        edit1 = findViewById(R.id.editText);
        edit2 = findViewById(R.id.editText2);





    }

    public void SendNumbers(View view){



        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        String num1= edit1.getText().toString();
        String num2 = edit2.getText().toString();

        intent.putExtra("number1",num1);
        intent.putExtra("number2",num2);
        startActivity(intent);

    }
}
