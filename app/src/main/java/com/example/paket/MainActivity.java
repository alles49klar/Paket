package com.example.paket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eTPersonName,eTPersonNachname;
    String isim,soyisim;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eTPersonName= (EditText) findViewById(R.id.eTPersonName);
        eTPersonNachname= (EditText) findViewById(R.id.eTPersonNachname);
        buttonLogin= (Button) findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isim=eTPersonName.getText().toString();
                soyisim=eTPersonNachname.getText().toString();
                Intent loginIntent=new Intent(getApplicationContext(),LoginActivity.class);
                loginIntent.putExtra("name",isim);
                loginIntent.putExtra("surname",soyisim);
                startActivity(loginIntent);
            }
        });
    }
}