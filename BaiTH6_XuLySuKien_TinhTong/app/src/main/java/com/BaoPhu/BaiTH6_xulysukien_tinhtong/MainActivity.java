package com.BaoPhu.BaiTH6_xulysukien_tinhtong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void XuLyCong(View view) {
        //Tim, tham chieu den dieu khien tren tep XML, mapping sang java file
        EditText edtsoA = findViewById(R.id.edtA);
        EditText edtsoB = findViewById(R.id.edtB);
        EditText edtKetQua = findViewById(R.id.edtKQ);
        //Lay du lieu tu dieu khien
        String strA = edtsoA.getText().toString();
        String strB = edtsoB.getText().toString();
        //Chuyen doi du lieu sang so
        int soA = Integer.parseInt(strA);
        int soB = Integer.parseInt(strB);
        //Tinh toan theo yeu cau
        int tong = soA + soB;
        String strTong = String.valueOf(tong);
        edtKetQua.setText(strTong);
    }

}