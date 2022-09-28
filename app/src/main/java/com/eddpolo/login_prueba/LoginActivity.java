package com.eddpolo.login_prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView email = findViewById(R.id.emailEditText);
        TextView password = findViewById(R.id.passwordEditText);
        Button loginbtn = (Button) findViewById(R.id.loginButton);

        //user: admin@macropay.mx
        //pass: Admin1

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("admin@macropay.mx") && password.getText().toString().equals("Admin1")){
                    //login correct
                    //enviar parametros de registro
                    Bundle enviaDatos = new Bundle();
                    enviaDatos.putString("keyRegistry", email.getText().toString());

                    Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                    i.putExtras(enviaDatos);
                    startActivity(i);

                    //notificacion
                    Toast.makeText(LoginActivity.this, "Datos correctos", Toast.LENGTH_SHORT).show();
                }else{
                    //login incorrect
                    Toast.makeText(LoginActivity.this, "Datos incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}