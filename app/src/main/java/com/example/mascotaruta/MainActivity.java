package com.example.mascotaruta;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btnRescatista = findViewById(R.id.button_rescatista);

        Button btnAdoptante = findViewById(R.id.button_adoptante);

        Button btnCasaTemporal = findViewById(R.id.button_temporal);


        btnRescatista.setOnClickListener((V -> abrirFormulario


        private void abrirFormulario() {
        Intent intent = new Intent(MainActivity.this, RegistrarMascotaActivity.class);






        };

    }





    }







}