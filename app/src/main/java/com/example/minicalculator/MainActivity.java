package com.example.minicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private TextView results;
    private EditText n1 ,n2;
    private Button sum , sub , mul , div ;
    private static final DecimalFormat df=new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.editTextNumberDecimal);
        n2=findViewById(R.id.editTextNumberDecimal2);
        sum=findViewById(R.id.button);
        sub=findViewById(R.id.button2);
        mul=findViewById(R.id.button3);
        div=findViewById(R.id.button4);
        results=findViewById(R.id.textView3);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1=Double.parseDouble(n1.getText().toString());
                double num2=Double.parseDouble(n2.getText().toString());
                double res=num1+num2;
                results.setText("Answer :"+df.format(res));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1=Double.parseDouble(n1.getText().toString());
                double num2=Double.parseDouble(n2.getText().toString());
                double res=num1-num2;
                results.setText("Answer :"+df.format(res));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1=Double.parseDouble(n1.getText().toString());
                double num2=Double.parseDouble(n2.getText().toString());
                double res=num1*num2;
                results.setText("Answer :"+df.format(res));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1=Double.parseDouble(n1.getText().toString());
                double num2=Double.parseDouble(n2.getText().toString());
                double res=num1/num2;
                results.setText("Answer :"+df.format(res));
            }
        });
    }
}