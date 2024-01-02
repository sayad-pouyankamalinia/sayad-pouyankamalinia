package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class listsimpleActivity extends AppCompatActivity {

    ListView mListView;
    String[] mobileBrands;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listsimple);


        mListView = findViewById(R.id.product_list_view);


        mobileBrands = new String[] {"LG", "Samsung", "Apple", "Sony", "Huawei",
                "HTC", "Motorola","xiaomi"};

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this,
                R.layout.list_item, R.id.text_view, mobileBrands);

        mListView.setAdapter(mAdapter);





    }
}