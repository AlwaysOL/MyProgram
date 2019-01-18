package com.yanjia.myprogram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.yanjia.nativelibrary.HelloCpp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_native =findViewById(R.id.tv_native);
        tv_native.setText(HelloCpp.getAA());

    }
}
