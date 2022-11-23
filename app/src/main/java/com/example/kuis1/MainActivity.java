package com.example.kuis1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button btnSignin;

    TextView textlupapw;
    TextView textregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignin=(Button) findViewById(R.id.signin);

        textlupapw=(TextView) findViewById(R.id.lupapassword);
        textregister=(TextView) findViewById(R.id.register);

        username=(EditText) findViewById(R.id.username);
        password=(EditText) findViewById(R.id.password);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("2041720063") && (password.getText().toString().equals("Password") || password.getText().toString().equals("password"))){
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));
                    Toast.makeText(getApplicationContext(), "Anda berhasil login",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Maaf Username / Password Salah",Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(), "Silahkan coba lagi",Toast.LENGTH_SHORT).show();
                }
            }
        });

        textlupapw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Maaf fitur lupa password belum tersedia",Toast.LENGTH_SHORT).show();
            }
        });

        textregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Maaf fitur register belum tersedia",Toast.LENGTH_SHORT).show();
            }
        });
    }
}