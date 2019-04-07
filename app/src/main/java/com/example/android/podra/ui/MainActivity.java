package com.example.android.podra.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.android.podra.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.BTN_signUp)
    Button BTNSignUp;
    @BindView(R.id.BTN_signIn)
    Button BTNSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.BTN_signUp, R.id.BTN_signIn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.BTN_signUp:
                startActivity(new Intent(MainActivity.this,RegisterActivity.class));
                break;
            case R.id.BTN_signIn:
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
                break;
        }
    }
}
