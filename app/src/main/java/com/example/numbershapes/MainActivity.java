package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    class Number{

        int number;
        public boolean squareNumber(){
            double sqrtnum = Math.sqrt(number);
            if (sqrtnum==Math.floor(sqrtnum)){
                return true;
            } else{
                return false;
            }
        }
        public boolean triangularNumber(){
            int x=0;
            for (int i=1;x<number;i++){
                x+=i;
            }
            if (number==x){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public void checkFunc(View view){

        Number numObj = new Number();
        EditText num = (EditText) findViewById(R.id.numberGiven);
        if (num.getText().toString().isEmpty()){
            Toast.makeText(MainActivity.this,"Please enter a number",Toast.LENGTH_SHORT).show();
        }
        else {
            numObj.number = Integer.parseInt(num.getText().toString());
            if (numObj.triangularNumber() && numObj.squareNumber()) {
                Toast.makeText(MainActivity.this, "It is both triangular and square number", Toast.LENGTH_SHORT).show();
            } else if (numObj.squareNumber()) {
                Toast.makeText(MainActivity.this, "It is a square number", Toast.LENGTH_SHORT).show();
            } else if (numObj.triangularNumber()) {
                Toast.makeText(MainActivity.this, "It is a triangular number", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "It is neither a triangular nor a square number", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
