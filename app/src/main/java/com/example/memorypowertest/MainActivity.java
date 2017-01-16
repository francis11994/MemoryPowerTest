package com.example.memorypowertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random ran = new Random();
        ((TextView) findViewById(R.id.number)).setText(
                String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))
        );
    }

    public void numButton(View v){
        ((EditText) findViewById(R.id.editText1)).setText(
                ((EditText) findViewById(R.id.editText1)).getText().toString() + ((Button) v).getText()
        );
    }
    public void startButton(View v){
        //((TextView) findViewById(R.id.number)).setVisibility(View.INVISIBLE);

        TextView myTmp = (TextView) findViewById(R.id.number);
        myTmp.setVisibility(v.INVISIBLE);
        ((EditText) findViewById(R.id.editText1)).setVisibility(v.VISIBLE);
        ((ImageView) (findViewById(R.id.imageView))).setVisibility(v.INVISIBLE);
        ((Button) (findViewById(R.id.restart))).setVisibility(v.VISIBLE);
        ((Button) (findViewById(R.id.button0))).setVisibility(v.VISIBLE);
        ((Button) (findViewById(R.id.button1))).setVisibility(v.VISIBLE);
        ((Button) (findViewById(R.id.button2))).setVisibility(v.VISIBLE);
        ((Button) (findViewById(R.id.button3))).setVisibility(v.VISIBLE);
        ((Button) (findViewById(R.id.button4))).setVisibility(v.VISIBLE);
        ((Button) (findViewById(R.id.button5))).setVisibility(v.VISIBLE);
        ((Button) (findViewById(R.id.button6))).setVisibility(v.VISIBLE);
        ((Button) (findViewById(R.id.button7))).setVisibility(v.VISIBLE);
        ((Button) (findViewById(R.id.button8))).setVisibility(v.VISIBLE);
        ((Button) (findViewById(R.id.button9))).setVisibility(v.VISIBLE);
        ((Button) (findViewById(R.id.clear))).setVisibility(v.VISIBLE);
        ((Button) (findViewById(R.id.submit))).setVisibility(v.VISIBLE);
    }
    public void submitButton(View v){
        String myAnswer = ((EditText) findViewById(R.id.editText1)).getText().toString();
        String answer = ((TextView) findViewById(R.id.number)).getText().toString();

        if(answer.equals(myAnswer)){
            ((EditText) findViewById(R.id.editText1)).setText("Correct !");
        }else{
            ((EditText) findViewById(R.id.editText1)).setText("Wrong !");
        }
    }
    public void clearButton(View v){
        ((EditText) findViewById(R.id.editText1)).setText("");
    }
    public void restartButton(View v){
        Random ran = new Random();
        ((TextView) findViewById(R.id.number)).setText(
                String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))+
                        String.valueOf(ran.nextInt(10))
        );
        TextView myTmp = (TextView) findViewById(R.id.number);
        myTmp.setVisibility(v.VISIBLE);
        ((EditText) findViewById(R.id.editText1)).setVisibility(v.INVISIBLE);
        ((EditText) findViewById(R.id.editText1)).setText("");
        ((ImageView) (findViewById(R.id.imageView))).setVisibility(v.VISIBLE);
        ((Button) (findViewById(R.id.restart))).setVisibility(v.INVISIBLE);
        ((Button) (findViewById(R.id.button0))).setVisibility(v.INVISIBLE);
        ((Button) (findViewById(R.id.button1))).setVisibility(v.INVISIBLE);
        ((Button) (findViewById(R.id.button2))).setVisibility(v.INVISIBLE);
        ((Button) (findViewById(R.id.button3))).setVisibility(v.INVISIBLE);
        ((Button) (findViewById(R.id.button4))).setVisibility(v.INVISIBLE);
        ((Button) (findViewById(R.id.button5))).setVisibility(v.INVISIBLE);
        ((Button) (findViewById(R.id.button6))).setVisibility(v.INVISIBLE);
        ((Button) (findViewById(R.id.button7))).setVisibility(v.INVISIBLE);
        ((Button) (findViewById(R.id.button8))).setVisibility(v.INVISIBLE);
        ((Button) (findViewById(R.id.button9))).setVisibility(v.INVISIBLE);
        ((Button) (findViewById(R.id.clear))).setVisibility(v.INVISIBLE);
        ((Button) (findViewById(R.id.submit))).setVisibility(v.INVISIBLE);
    }

}
