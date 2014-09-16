package com.renal128.demo.recyclerviewdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.renal128.demo.recyclerviewdemo.R;
import com.renal128.demo.recyclerviewdemo.adapter.RecyclerViewAdapter;
import com.renal128.demo.recyclerviewdemo.model.Record;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        List<Record> records = new ArrayList<Record>();
        populateRecords(records);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(records);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(itemAnimator);
    }

    private void populateRecords(List<Record> records){
        for (int i = 0; i<50; i++){
            Record record = new Record();
            record.setName("Item №" + i);
            record.setType(Record.Type.values()[i%3]);
            records.add(record);
        }
    }

}
