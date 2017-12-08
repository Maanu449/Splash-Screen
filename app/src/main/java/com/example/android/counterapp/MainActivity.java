package com.example.android.counterapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score=0;

    public void one(View view){
        score+=1;
        display(score);
    }

    public void two(View view){
        score+=2;
        display(score);
    }

    public void three(View view){
        score+=3;
        display(score);
    }

    private void display(int a){
        TextView m = (TextView) findViewById(R.id.points);
        m.setText(Integer.toString(a));
    }
}
