package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class login2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        Button btnlogin =findViewById(R.id.btnlogin);
        Button btnRegisterLogin =findViewById(R.id.btnRegisterLogin);

        btnRegisterLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(login2Activity.this, registerActivity.class);
                startActivity(intent);
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                EditText editUsername=findViewById(R.id.editUsername);
                EditText editPassword=findViewById(R.id.editPassword);

                String  username=editUsername.getText().toString();
                String  password=editPassword.getText().toString();

                if (username.isEmpty())
                {
                    Toast
                            .makeText(getApplicationContext(),"Username must have value."
                                    ,Toast.LENGTH_LONG).show();
                    return;

                }
                if (password.isEmpty())
                {
                    Toast
                            .makeText(getApplicationContext(),"password must have value."
                                    ,Toast.LENGTH_LONG).show();
                    return;

                }

                if (username.length()>20 || username.length()<8 )
                {
                    Toast
                            .makeText(getApplicationContext(),"Username must be 8 to 20 characters length"
                                    ,Toast.LENGTH_LONG).show();
                    return;

                }


            }
        });

    }
}