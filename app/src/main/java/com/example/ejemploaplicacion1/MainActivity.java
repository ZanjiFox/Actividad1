package com.example.ejemploaplicacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"Actividad 1",Toast.LENGTH_SHORT).show();


    }

    public void IrSiguiente(View view){

        Intent intent = new Intent(this, SegundaActivity.class);
        startActivity(intent);

    }



}