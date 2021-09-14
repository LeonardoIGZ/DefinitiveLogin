package com.thuganomics.definitivelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText usuario, contrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent data = getIntent();
        User user = (User) data.getParcelableExtra("user");

        usuario = (EditText) findViewById(R.id.txtEmail);
        contrasenia = (EditText) findViewById(R.id.txtPassword);

        if(user != null){
            usuario.setText(user.getEmail());
            contrasenia.setText(user.getContrasenia());
        }
    }

    /**Hago aparecer a mi pantalla de registro*/
    public void register(View view){
        Intent intentRegister = new Intent(this, RegisterScreen.class);
        startActivity(intentRegister);
    }
}