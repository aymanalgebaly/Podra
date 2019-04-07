package com.example.android.podra.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.android.podra.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity {

    @BindView(R.id.full_name)
    EditText fullName;
    @BindView(R.id.view1)
    View view1;
    @BindView(R.id.email)
    EditText email;
    @BindView(R.id.view2)
    View view2;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.view3)
    View view3;
    @BindView(R.id.phone_num)
    EditText phoneNum;
    @BindView(R.id.view4)
    View view4;
    @BindView(R.id.lin_one)
    RadioGroup linOne;
    @BindView(R.id.RV_OR)
    RelativeLayout RVOR;
    @BindView(R.id.text_qs)
    TextView textQs;
    @BindView(R.id.text_login)
    TextView textLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.text_login)
    public void onViewClicked() {
        startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
    }
}
