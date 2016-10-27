package com.example.yvtc.test2016102702;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        act = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        String[] data = {"aab","aac","aad","abc","ab1","bb1","bb2","cca"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_spinner_item,
                                data);
        act.setAdapter(adapter);
        act.setThreshold(1);
    }
}
