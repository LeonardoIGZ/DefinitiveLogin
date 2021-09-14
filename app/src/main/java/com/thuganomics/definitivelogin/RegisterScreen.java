package com.thuganomics.definitivelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterScreen extends AppCompatActivity {
    EditText nombre, tel, email, contrasenia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);
    }

    ///Hago aparecer al layout principal por el botón cancelar
    public void cancel(View view){
        Intent intentMainClass = new Intent(this, MainActivity.class);
        startActivity(intentMainClass);
    }

    public void singUp(View view){
        nombre = (EditText) findViewById(R.id.txtNameS);
        tel = (EditText) findViewById(R.id.txtPhone);
        email = (EditText) findViewById(R.id.txtEmailS);
        contrasenia = (EditText) findViewById(R.id.txtPasswordS);

        String n = nombre.getText().toString();
        String t = tel.getText().toString();
        String e = email.getText().toString();
        String c = contrasenia.getText().toString();

        User u = new User(n, t, e, c);

        Intent sign = new Intent(this, MainActivity.class);
        sign.putExtra("user", u);
        startActivity(sign);
    }
}