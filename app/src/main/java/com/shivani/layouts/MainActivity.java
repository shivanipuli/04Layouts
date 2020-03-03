package com.shivani.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int[] layouts = {R.layout.activity_main,R.layout.activity_1, R.layout.activity_2, R.layout.activity_3, R.layout.activity_4, R.layout.activity_6};
    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next(View view) {
        setContentView(layouts[count]);
        count += 1;
        if(count > 6) count = 0;
    }
}
