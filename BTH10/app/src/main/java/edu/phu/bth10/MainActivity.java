package edu.phu.bth10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChuyenManHinh(View v) {
        Intent iManHinhKhac = new Intent(this, SubActivityOne.class);
        startActivity(iManHinhKhac);
    }
}