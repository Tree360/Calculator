package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addFunction(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextNumber4);
        String str = editText.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.editTextNumber5);
        String str2 = editText2.getText().toString();
        int num1 = Integer.valueOf(str);
        int num2 = Integer.valueOf(str2);
        int num = num1 + num2;
        goToActivity2(String.valueOf(num));
    }
    public void subFunction(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextNumber4);
        String str = editText.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.editTextNumber5);
        String str2 = editText2.getText().toString();
        int num1 = Integer.valueOf(str);
        int num2 = Integer.valueOf(str2);
        int num = num1 - num2;
        goToActivity2(String.valueOf(num));
    }
    public void mulFunction(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextNumber4);
        String str = editText.getText().toString();
        EditText editText2 = (EditText) findViewById(R.id.editTextNumber5);
        String str2 = editText2.getText().toString();
        int num1 = Integer.valueOf(str);
        int num2 = Integer.valueOf(str2);
        int num = num1*num2;
        goToActivity2(String.valueOf(num));
    }
        public void divFunction(View view){
            EditText editText = (EditText) findViewById(R.id.editTextNumber4);
            String str = editText.getText().toString();
            EditText editText2 = (EditText) findViewById(R.id.editTextNumber5);
            String str2 = editText2.getText().toString();
            double num1 = Integer.valueOf(str);
            double num2 = Integer.valueOf(str2);
            double num = num1/num2;
            goToActivity2(String.valueOf(num));
        }
    public void goToActivity2(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
}