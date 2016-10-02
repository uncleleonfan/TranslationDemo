package com.itheima.translationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private TextView mTranslateInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.tv);
        mTranslateInfo = (TextView) findViewById(R.id.translate_info);
    }

    public void onTranslate(View view) {
        mTextView.setTranslationX(100);

        mTranslateInfo.setText("left: " + mTextView.getLeft() + "top: " + mTextView.getTop() + " right: "
                + mTextView.getRight() + " bottom: " + mTextView.getBottom());
    }

    public void onScrollBy(View view) {
        mTextView.scrollBy(-100, 0);
    }
}
