package com.habibi.aplikasiinputname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText TxtNama;
    public TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputnama_main);

        TxtNama =(EditText)findViewById(R.id.txt_nama);
        Hasil = (TextView)findViewById(R.id.view_nama);
    }


    public void TampilNama(View v){
        Hasil.setText("Nama Anda : " + TxtNama.getText());

    }
}