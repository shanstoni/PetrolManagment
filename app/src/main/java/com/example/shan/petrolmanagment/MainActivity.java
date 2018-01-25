package com.example.shan.petrolmanagment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button EnterButton;
    //EditText password;
   // EditText nickname;

    String nick = "aaa";
    String pass = "bbb";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nickname = (EditText) findViewById(R.id.nicknameEditText);
        final EditText password = (EditText) findViewById(R.id.passwordEditText);
        EnterButton = (Button) findViewById(R.id.buttonLogIn);
        EnterButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if((nickname.getText().toString().equals(nick)) && (password.getText().toString().equals(pass))){
                    Toast.makeText(getApplicationContext(),"OK", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, TankListActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(),"Wrong nickname or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
