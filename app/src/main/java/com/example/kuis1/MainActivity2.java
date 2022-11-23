package com.example.kuis1;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button btnLogout;
    ImageButton btnKartuTabungan;
    ImageButton btnKartuBelanja;
    ImageButton btnKeranjangBelanja;

    ImageButton btnRekapSimpanan;
    ImageButton btnRekapPinjaman;
    ImageButton btnRekapSHU;
    ImageButton btnInfoKPRI;
    TextView textlogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textlogout=(TextView) findViewById(R.id.textlogout);

        btnKartuTabungan=(ImageButton) findViewById(R.id.btnkartutabungan);
        btnKartuBelanja=(ImageButton) findViewById(R.id.btnkartubelanja);
        btnKeranjangBelanja=(ImageButton) findViewById(R.id.btnkeranjangbelanja);

        btnRekapSimpanan=(ImageButton) findViewById(R.id.btnrekapsimpanan);
        btnRekapPinjaman=(ImageButton) findViewById(R.id.btnrekappinjaman);
        btnRekapSHU=(ImageButton) findViewById(R.id.btnrekapshu);
        btnInfoKPRI=(ImageButton) findViewById(R.id.btninfokpri);

        textlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
                Toast.makeText(getApplicationContext(), "Berhasil logout, silahkan kembali lagi nanti",Toast.LENGTH_SHORT).show();
            }
        });

        btnKartuTabungan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Kartu Tabungan",Toast.LENGTH_SHORT).show();
            }
        });

        btnKartuBelanja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Kartu Belanja",Toast.LENGTH_SHORT).show();
            }
        });

        btnKeranjangBelanja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Keranjang Belanja",Toast.LENGTH_SHORT).show();
            }
        });

        btnRekapSimpanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Rekap Simpanan",Toast.LENGTH_SHORT).show();
            }
        });

        btnRekapPinjaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Rekap Pinjaman",Toast.LENGTH_SHORT).show();
            }
        });

        btnRekapSHU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Rekap SHU",Toast.LENGTH_SHORT).show();
            }
        });

        btnInfoKPRI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Info KPRI Polinema Pay",Toast.LENGTH_SHORT).show();
            }
        });

        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);
    }
}