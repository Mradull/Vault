package com.example.Vault;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity {
    Button lgbutton;
    EditText editText;
    TextView textView;
    String Pass= "MRADUL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Typewriter txtView = findViewById(R.id.textView);
        Typewriter txtView1 = findViewById(R.id.textView1);
        Typewriter txtView3 = findViewById(R.id.textView3);
        txtView.setText("");
        txtView.setCharacterDelay(220);
        txtView.aninateText("WELCOME :>");
        txtView1.setText("");
        txtView1.setCharacterDelay(220);
        txtView1.aninateText("ENTER PASSWORD :");
        lgbutton = findViewById(R.id.login_button);
        editText = findViewById(R.id.textView2);


        lgbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String check = editText.getText().toString();
                if (check.equals(Pass)) {
                    txtView3.setText("");
                    txtView3.setCharacterDelay(220);
                    txtView3.aninateText("ACCESS GRANTED :");
                    Intent intent = new Intent(login.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                }
                else{
                    txtView3.setText("");
                    txtView3.setCharacterDelay(220);
                    txtView3.aninateText("ACCESS DENIED :");
                }
            }
        });


    }
}