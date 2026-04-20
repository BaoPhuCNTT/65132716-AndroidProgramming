package thigk2.NguyenDuongBaoPhu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityTiGia extends AppCompatActivity {

    EditText edtSoTien, edtTiGia;
    Button btnDoiTien;
    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ti_gia);

        edtSoTien = findViewById(R.id.edtSoTien);
        edtTiGia = findViewById(R.id.edtTiGia);
        btnDoiTien = findViewById(R.id.btnDoiTien);
        tvKetQua = findViewById(R.id.tvKetQua);

        btnDoiTien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoiSoTien = edtSoTien.getText().toString();
                String chuoiTiGia = edtTiGia.getText().toString();

                if (chuoiSoTien.isEmpty() || chuoiTiGia.isEmpty()) {
                    Toast.makeText(ActivityTiGia.this, "Vui lòng nhập đủ thông tin!", Toast.LENGTH_SHORT).show();
                } else {
                    double soTien = Double.parseDouble(chuoiSoTien);
                    double tiGia = Double.parseDouble(chuoiTiGia);

                    double ketQuaUSD = soTien / tiGia;

                    tvKetQua.setText(String.format("Kết quả: %.2f USD", ketQuaUSD));
                }
            }
        });
    }

    public void QuayVe(View v) {
        Intent iManHinhCHINH = new Intent(this, MainActivity.class);
        startActivity(iManHinhCHINH);
    }
}