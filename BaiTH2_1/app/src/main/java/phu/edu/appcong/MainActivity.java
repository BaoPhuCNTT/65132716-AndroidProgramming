package phu.edu.appcong;

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
    // Bộ lắng nghe và xử lý sự kiện click lên nút tính tổng
    public void XuLyCong(View view) {
        // Tìm,tham chiếu đến điều khiển trên tệp XML, mapping sang java file
        EditText editTestSoA = findViewById(R.id.edtA);
        EditText editTestSoB = findViewById(R.id.edtB);
        EditText editTestKetQua = findViewById(R.id.edtKQ);
        // Lấy dữ liệu số A
        String strA = editTestSoA.getText().toString();
        // Lấy dữ liệu số B
        String strB = editTestSoB.getText().toString();
        // Chuyển dữ liệu sang số
        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);
        // Tính toán theo yêu cầu
        int tong = so_A + so_B;
        String strTong = String.valueOf(tong);     // Chuyển sang dạng chuỗi
        // Hiện ra màn hình
        editTestKetQua.setText(strTong);
    }
}