package com.example.anuradha.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    Button b1;
    Button b2;
    Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= (EditText) findViewById(R.id.editText);
        e2= (EditText) findViewById(R.id.editText2);
        b1= (Button) findViewById(R.id.button1);
        b2= (Button) findViewById(R.id.button2);
        b3= (Button) findViewById(R.id.button3);
        b1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                String first=e1.getText().toString();
                String second=e2.getText().toString();
                int f1=Integer.parseInt(first);
                int f2=Integer.parseInt(second);
                int f3=f1+f2;

                Toast.makeText(MainActivity.this,"sum is"+f3,Toast.LENGTH_LONG).show();

            }
        });
    }
}
