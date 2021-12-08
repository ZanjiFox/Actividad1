package com.example.ejemploaplicacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Toast.makeText(this,"Actividad 2",Toast.LENGTH_SHORT).show();
    }

    public void IrAtras(View view){

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}