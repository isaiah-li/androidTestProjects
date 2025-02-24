package com.example.demoone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //声明控件
    private Button mBtnLogin;
    private EditText mEtUser;
    private EditText mEtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //找到控件
        mBtnLogin = findViewById(R.id.bt_1);
        mEtUser = findViewById(R.id.et_1);
        mEtPassword = findViewById(R.id.et_2);

/*        //实现直接跳转 ---方法一
        mBtnLogin.setOnClickListener(new View.OnClickListener(){
            
            public void onClick(View v){
                Intent intent = null;
                intent = new Intent(MainActivity.this,FunctionActivity.class);
                startActivity(intent);
            }
        });*/
            mBtnLogin.setOnClickListener(this);
        }
    public void onClick(View v){
        //需要获取输入的用户名和密码
        String username = mEtUser.getText().toString();
        String password = mEtPassword.getText().toString();
        Intent intent = null;
        if(username.equals("ljc") && password.equals("123456")){
            //如果正确，进行跳转
            intent = new Intent(MainActivity.this,FunctionActivity.class);
            startActivity(intent);
        }
        else{
            //不正确，登录失败
        }


    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}