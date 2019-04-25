package com.example.calculator;


import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edit;
    String x="";
    String s =x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = findViewById(R.id.editText1);
    }


    public void onClick(View v){
        switch(v.getId()){
            case R.id.one:
                s = edit.getText().toString();
                edit.append("1");
                break;
            case R.id.two:
                s = edit.getText().toString();
                edit.append("2");break;
            case R.id.three:
                s = edit.getText().toString();
                edit.append("3");break;
            case R.id.four:
                s = edit.getText().toString();
                edit.append("4");
                break;
            case R.id.five:
                s = edit.getText().toString();
                edit.append("5");
                break;
            case R.id.six:
                s = edit.getText().toString()+R.string._1;
                edit.append("6");
                break;
            case R.id.seven:
                s = edit.getText().toString();
                edit.append("7");
                break;
            case R.id.eight:
                s = edit.getText().toString();
                edit.append("8");
                break;
            case R.id.nine:
                s = edit.getText().toString();
                edit.append("9");
                break;
            case R.id.zero:
                s = edit.getText().toString();
                edit.append("0");
                break;
            case R.id.mul:
                s = edit.getText().toString();
                edit.append("*");
                break;
            case R.id.div:
                s = edit.getText().toString();
                edit.append("/");
                break;
            case R.id.minus:
                s = edit.getText().toString();
                edit.append("-");
                break;
            case R.id.add:
                s = edit.getText().toString();
                edit.append("+");
                break;
            case R.id.dot:
                s = edit.getText().toString();
                edit.append(".");
                break;
            case R.id.equals:
                s = edit.getText().toString();
                Calculate(s);
                break;
            case R.id.ESC:
                edit.setText("");
                break;

        }
    }
    @SuppressLint("SetTextI18n")
    public void Calculate(String input){
        Log.d("*************",input);
        Log.d("*************input len",String.valueOf(input.length()));
        if (input.contains("*")){
            int x = input.indexOf("*");
            Log.d("********** x",String.valueOf(x));
            double n1 = Double.parseDouble(input.substring(0,x));
            Log.d("********** n1",String.valueOf(n1));
            double n2 = Double.parseDouble(input.substring(x+1));
            Log.d("********** n2",String.valueOf(n2));
            String result = String.valueOf(n1*n2);
            Log.d("********** res",result);
            edit.setText(result);
        }else if(input.contains("/")){
            int x = input.indexOf("/");
            Log.d("********** x",String.valueOf(x));
            double n1 = Double.parseDouble(input.substring(0,x));
            double n2 = Double.parseDouble(input.substring(x+1));
            Log.d("********** n1",String.valueOf(n1));
            Log.d("********** n2",String.valueOf(n2));
            double res=n1/n2;
            Log.d("**********",String.valueOf(res));
            String result = String.valueOf(res);
            edit.setText(result);
        }else if(input.contains("+")){
            int x = input.indexOf("+");
            Log.d("************ + ",String.valueOf(x));
            double n1 = Double.parseDouble(input.substring(0,x));
            Log.d("**********",String.valueOf(n1));
            double n2 = Double.parseDouble(input.substring(x+1));
            Log.d("**********",String.valueOf(n2));
            String result = String.valueOf(n1+n2);
            edit.setText(result);
        }else if(input.contains("-")){
            int x = input.indexOf("-");
            double n1 = Double.parseDouble(input.substring(0,x));
            double n2 = Double.parseDouble(input.substring(x+1));
            Log.d("**********",String.valueOf(x));
            Log.d("**********",String.valueOf(n1));
            Log.d("**********",String.valueOf(n2));

            String result = String.valueOf(n1-n2);
            edit.setText(result);
        }else{
            edit.setText(input);
        }
    }
}
