package com.BaoPhu.Baith5_xulysukien1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai bao doi tuong
    EditText edtSoA;
    EditText edtSoB;
    EditText edtKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Gan bo lang nghe su kien va code xu ly cho tung nut
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XULY_CONG();
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);

        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XULY_TRU();
            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XULY_NHAN();
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XULY_CHIA();
            }
        });
    }
    void TimDieuKhien(){
        edtSoA = (EditText) findViewById(R.id.edtA);
        edtSoB = (EditText) findViewById(R.id.edtB);
        edtKQ = (EditText) findViewById(R.id.edtKQ);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }

    void XULY_CONG() {
        //Lay du lieu
        String soA = edtSoA.getText().toString();
        String soB = edtSoB.getText().toString();
        float  so1 = Float.parseFloat(soA);
        float  so2 = Float.parseFloat(soB);
        float tong = so1 + so2;
        String chuoiKQ = String.valueOf(tong);
        edtKQ.setText(chuoiKQ);
    }
    void XULY_TRU(){
        //Lay du lieu
        String soA = edtSoA.getText().toString();
        String soB = edtSoB.getText().toString();
        float  so1 = Float.parseFloat(soA);
        float  so2 = Float.parseFloat(soB);
        float hieu = so1 - so2;
        String chuoiKQ = String.valueOf(hieu);
        edtKQ.setText(chuoiKQ);
    }
    void XULY_NHAN(){
//Lay du lieu
        String soA = edtSoA.getText().toString();
        String soB = edtSoB.getText().toString();
        float  so1 = Float.parseFloat(soA);
        float  so2 = Float.parseFloat(soB);
        float tich = so1 * so2;
        String chuoiKQ = String.valueOf(tich);
        edtKQ.setText(chuoiKQ);
    }
    void XULY_CHIA(){
        //Lay du lieu
        String soA = edtSoA.getText().toString();
        String soB = edtSoB.getText().toString();
        float  so1 = Float.parseFloat(soA);
        float  so2 = Float.parseFloat(soB);
        float thuong = so1 / so2;
        String chuoiKQ = String.valueOf(thuong);
        edtKQ.setText(chuoiKQ);
    }
}