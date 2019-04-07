package com.example.android.podra.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.podra.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.mail_login)
    EditText mailLogin;
    @BindView(R.id.view5)
    View view5;
    @BindView(R.id.editText)
    EditText editText;
    @BindView(R.id.RV_LOGIN)
    RelativeLayout RVLOGIN;
    @BindView(R.id.RV_LOg)
    RelativeLayout RVLOg;
    @BindView(R.id.text_forgot_pass)
    TextView textForgotPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.text_forgot_pass)
    public void onViewClicked() {
        startActivity(new Intent(LoginActivity.this,ForgotpasswordActivity.class));
    }
}
