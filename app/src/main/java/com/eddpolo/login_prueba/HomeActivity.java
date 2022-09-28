package com.eddpolo.login_prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView usuario = findViewById(R.id.user);

        Bundle recibeDatos = getIntent().getExtras();
        String dato = recibeDatos.getString("keyRegistry");

        usuario.setText(dato);
    }
}