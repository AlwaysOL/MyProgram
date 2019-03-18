package com.yanjia.myprogram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.yanjia.nativelibrary.HelloCpp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_native =findViewById(R.id.tv_native);
        tv_native.setText(HelloCpp.getAA());

        ((TextView)findViewById(R.id.hello_jni)).setText(HelloCpp.getBB());

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SoftHeightActivity.class);
                startActivity(intent);
            }
        });


    }
}
