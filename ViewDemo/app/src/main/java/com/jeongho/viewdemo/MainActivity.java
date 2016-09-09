package com.jeongho.viewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jeongho.viewdemo.toolbar.ToolbarActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mToolbarBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbarBtn = (Button) findViewById(R.id.btn_toolbar);
        mToolbarBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_toolbar:
                ToolbarActivity.startAction(this);
                break;
        }
    }
}
