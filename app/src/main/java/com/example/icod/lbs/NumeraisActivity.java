package com.example.icod.lbs;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class NumeraisActivity extends AppCompatActivity {

    private NumeraisActivity.ViewHolder mViewHolder = new NumeraisActivity.ViewHolder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numerais);


        this.mViewHolder.imageNumerais = findViewById(R.id.imageNumerais);
        this.mViewHolder.buttonZero = findViewById(R.id.buttonZero);
        this.mViewHolder.buttonUm = findViewById(R.id.buttonUm);
        this.mViewHolder.buttonDois = findViewById(R.id.buttonDois);
        this.mViewHolder.buttonTres = findViewById(R.id.buttonTres);
        this.mViewHolder.buttonQuatro= findViewById(R.id.buttonQuatro);
        this.mViewHolder.buttonCinco = findViewById(R.id.buttonCinco);
        this.mViewHolder.buttonSeis = findViewById(R.id.buttonSeis);
        this.mViewHolder.buttonSete = findViewById(R.id.buttonSete);
        this.mViewHolder.buttonOito = findViewById(R.id.buttonOito);
        this.mViewHolder.buttonNove = findViewById(R.id.buttonNove);


        this.mViewHolder.buttonZero.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                mViewHolder.imageNumerais.setImageResource(R.drawable.0);
                mViewHolder.imageNumerais.setVisibility(View.VISIBLE);
                //Button botao = (Button) findViewById(R.id.btnQ);
                //botao.setBackgroundResource(R.color.colorPrimary);
            }
        });

    }

    private static class ViewHolder{
        ImageView imageNumerais;
        Button buttonZero;
        Button buttonUm;
        Button buttonDois;
        Button buttonTres;
        Button buttonQuatro;
        Button buttonCinco;
        Button buttonSeis;
        Button buttonSete;
        Button buttonOito;
        Button buttonNove;