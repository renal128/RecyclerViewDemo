package com.renal128.demo.recyclerviewdemo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.renal128.demo.recyclerviewdemo.R;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showRecycleView(View view) {
        Intent intent = new Intent(this, RecyclerViewActivity.class);
        startActivity(intent);
    }

    public void showCardView(View view) {
        Intent intent = new Intent(this, CardViewActivity.class);
        startActivity(intent);
    }

}
