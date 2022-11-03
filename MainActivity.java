package com.example.listpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtVw; // To Show the content
    ListView lstVw; // Connect with listView in xml
    String[] listItem; // To store list items

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtVw = findViewById(R.id.textView);
        lstVw = findViewById(R.id.lstVw);
        listItem = getResources().getStringArray(R.array.array_technology);

        // We will use this to connect the list items from strings.xml to listItem array
        ArrayAdapter <String> myAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listItem);
        lstVw.setAdapter(myAdapter);


    }
}