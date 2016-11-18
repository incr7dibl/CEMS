package com.example.android.cems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Button kshitij=(Button)findViewById(R.id.khitij);
        kshitij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePage.this,KshitijActivity.class);
                startActivity(intent);
            }
        });

        Button virtuosic=(Button)findViewById(R.id.virtuosic);
        virtuosic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePage.this,VirtuosicActivity.class);
                startActivity(intent);
            }
        });


        Button csa=(Button)findViewById(R.id.csa);
        csa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePage.this,CsaActivity.class);
                startActivity(intent);
            }
        });


        Button mesa=(Button)findViewById(R.id.mesa);
        mesa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePage.this,MesaActivity.class);
                startActivity(intent);
            }
        });


        Button esa=(Button)findViewById(R.id.esa);
        esa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePage.this,EsaActivity.class);
                startActivity(intent);
            }
        });


        Button other=(Button)findViewById(R.id.other);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomePage.this,OtherActivity.class);
                startActivity(intent);
            }
        });


    }
}
