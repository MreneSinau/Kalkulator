package com.mrenesinau.kalkulator2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnBagi,btnC,btnKali,btnKurang,btnTambah;
    private TextView txtHasil;
    private EditText txtAngkaP,txtAngkaD;
    private double angka1,angka2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAngkaP=(EditText)findViewById(R.id.txtAngkaP);
        txtAngkaD=(EditText)findViewById(R.id.txtAngkaD);
        txtHasil=(TextView)findViewById(R.id.txtHasil);
        btnTambah=(Button)findViewById(R.id.btnTambah);
        btnKurang=(Button)findViewById(R.id.btnKurang);
        btnKali=(Button)findViewById(R.id.btnKali);
        btnBagi=(Button)findViewById(R.id.btnBagi);
        btnC=(Button)findViewById(R.id.btnC);


        //Digunakan Untuk Onclik
        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HasilTambah();
            }
        });
        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HasilKurang();
            }
        });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HasilKali();
            }
        });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hasilbagi();
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Hapus();
            }
        });
    }

    public  void HasilTambah(){
        if(!txtAngkaP.getText().toString().isEmpty()){
            Toast.makeText(this, "Angka Pertama Belum Diisi", Toast.LENGTH_SHORT).show();
        }
        if(!txtAngkaD.getText().toString().isEmpty()){
            Toast.makeText(this, "Angka Kedua Belum Diisi", Toast.LENGTH_SHORT).show();
        }
        try{
            angka1 = Double.parseDouble(txtAngkaP.getText().toString());
        }catch (Exception e){
            Toast.makeText(this, "Angka Pertama Belum Diisi", Toast.LENGTH_SHORT).show();
        }
        try{
            angka2=Double.parseDouble(txtAngkaD.getText().toString());
        }catch (Exception e){
            Toast.makeText(this, "Angka Kedua Belum Diisi", Toast.LENGTH_SHORT).show();
        }
        Double hasil=angka1+angka2;
        txtHasil.setText(String.valueOf(hasil));
    }

    public  void HasilKurang(){
        if(!txtAngkaP.getText().toString().isEmpty()){
            Toast.makeText(this, "Angka Pertama Belum Diisi", Toast.LENGTH_SHORT).show();
        }
        if(!txtAngkaD.getText().toString().isEmpty()){
            Toast.makeText(this, "Angka Kedua Belum Diisi", Toast.LENGTH_SHORT).show();
        }
        try{
            angka1 = Double.parseDouble(txtAngkaP.getText().toString());
        }catch (Exception e){
            Toast.makeText(this, "Angka Pertama Belum Diisi", Toast.LENGTH_SHORT).show();
        }
        try{
            angka2=Double.parseDouble(txtAngkaD.getText().toString());
        }catch (Exception e){
            Toast.makeText(this, "Angka Kedua Belum Diisi", Toast.LENGTH_SHORT).show();
        }
        Double hasil=angka1-angka2;
        txtHasil.setText(String.valueOf(hasil));
    }

    public  void HasilKali(){
        if(!txtAngkaP.getText().toString().isEmpty()){
            Toast.makeText(this, "Angka Pertama Belum Diisi", Toast.LENGTH_SHORT).show();
        }
        if(!txtAngkaD.getText().toString().isEmpty()){
            Toast.makeText(this, "Angka Kedua Belum Diisi", Toast.LENGTH_SHORT).show();
        }
        try{
            angka1 = Double.parseDouble(txtAngkaP.getText().toString());
        }catch (Exception e){
            Toast.makeText(this, "Angka Pertama Belum Diisi", Toast.LENGTH_SHORT).show();
        }
        try{
            angka2=Double.parseDouble(txtAngkaD.getText().toString());
        }catch (Exception e){
            Toast.makeText(this, "Angka Kedua Belum Diisi", Toast.LENGTH_SHORT).show();
        }
        Double hasil=angka1*angka2;
        txtHasil.setText(String.valueOf(hasil));
    }

    public  void Hasilbagi(){
        if(!txtAngkaP.getText().toString().isEmpty()){
            Toast.makeText(this, "Angka Pertama Belum Diisi", Toast.LENGTH_SHORT).show();
        }
        if(!txtAngkaD.getText().toString().isEmpty()){
            Toast.makeText(this, "Angka Kedua Belum Diisi", Toast.LENGTH_SHORT).show();
        }
        try{
            angka1 = Double.parseDouble(txtAngkaP.getText().toString());
        }catch (Exception e){
            Toast.makeText(this, "Angka Pertama Belum Diisi", Toast.LENGTH_SHORT).show();
        }
        try{
            angka2=Double.parseDouble(txtAngkaD.getText().toString());
        }catch (Exception e){
            Toast.makeText(this, "Angka Kedua Belum Diisi", Toast.LENGTH_SHORT).show();
        }
        Double hasil=angka1/angka2;
        txtHasil.setText(String.valueOf(hasil));
    }

    private void Hapus(){
        Intent balikan=new Intent(this, MainActivity.class);
        startActivity(balikan);
        this.finish();
    }

}
