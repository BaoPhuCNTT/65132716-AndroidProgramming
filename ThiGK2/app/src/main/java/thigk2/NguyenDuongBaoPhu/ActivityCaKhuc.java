package thigk2.NguyenDuongBaoPhu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityCaKhuc extends AppCompatActivity {

    ListView lvCaKhuc;

    String[] danhSachCaKhuc = {
            "1. Dáng đứng Bến Tre",
            "2. Chào em cô gái Lam Hồng",
            "3. Bài ca hy vọng",
            "4. Trường Sơn Đông Trường Sơn Tây",
            "5. Cô gái mở đường",
            "6. Năm anh em trên một chiếc xe tăng",
            "7. Tiểu đoàn 307",
            "8. Xuân chiến khu",
            "9. Hát mãi khúc quân hành",
            "10. Nguyễn Dương Bảo Phú"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ca_khuc);

        lvCaKhuc = findViewById(R.id.lvCaKhuc);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                danhSachCaKhuc
        );
        lvCaKhuc.setAdapter(adapter);
    }

    public void QuayVe(View v) {
        Intent iManHinhCHINH = new Intent(this, MainActivity.class);
        startActivity(iManHinhCHINH);
    }
}