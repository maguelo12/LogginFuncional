package com.maguelo.logginfuncional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario;
    EditText password;
    Button proximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario=(EditText)findViewById(R.id.eUsuario);
        password=(EditText)findViewById(R.id.ePassword);

        proximo=(Button)findViewById(R.id.entrar);

        proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombreUsuario;
                String contrasenaUsuario;
                nombreUsuario=usuario.getText().toString();
                contrasenaUsuario=password.getText().toString();

                if(nombreUsuario.equals("admin") && (contrasenaUsuario.equals("12345"))){

                    Intent proximo=new Intent(MainActivity.this, principal.class);
                    startActivity(proximo);

                }else{

                    Toast.makeText(  MainActivity.this,  "Error de Login", Toast.LENGTH_LONG).show();

                }


            }
        });

    }
}