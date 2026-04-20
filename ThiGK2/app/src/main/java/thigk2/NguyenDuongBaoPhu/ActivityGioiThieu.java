package thigk2.NguyenDuongBaoPhu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityGioiThieu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gioi_thieu);


    }

    public void QuayVe(View v) {
        Intent iManHinhCHINH = new Intent(this, MainActivity.class);
        startActivity(iManHinhCHINH);
    }
}