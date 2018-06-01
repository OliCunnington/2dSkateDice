package com.example.eniac.skatedice;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    TextView t1,t2,t3,t4;
    String[] one, two, three, four;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        one = getResources().getStringArray(R.array.dice_one);
        two = getResources().getStringArray(R.array.dice_two);
        three = getResources().getStringArray(R.array.dice_three);
        four = getResources().getStringArray(R.array.dice_four);
        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView2);
        t3 = findViewById(R.id.textView3);
        t4 = findViewById(R.id.textView4);
    }

    public void onClick(View v){
        t1.setText(one[roll()]);
        t2.setText(two[roll()]);
        t3.setText(three[roll()]);
        t4.setText(four[roll()]);
    }

    public int roll(){
        return new Random().nextInt(6);
    }
}
