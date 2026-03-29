package edu.phu.BTH7_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> dsTenTinhThanhVN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Khai báo và khởi tạo danh sách
        dsTenTinhThanhVN = new ArrayList<>();

        // Thêm dữ liệu
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Nha Trang");

        // Tạo adapter
        ArrayAdapter<String> adapterTinhThanh = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dsTenTinhThanhVN
        );

        // Tìm ListView
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);

        // Gắn adapter
        lvTenTinhThanh.setAdapter(adapterTinhThanh);

        // Gắn sự kiện click
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);
    }

    // Bộ lắng nghe và xử lý sự kiện
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            // Lấy tên tỉnh theo vị trí
            String tenTinh = dsTenTinhThanhVN.get(i);

            // Hiển thị thông báo
            // Lấy giá trị của phần tử thứ i
         String strTenTinhChon=  dsTenTinhThanhVN.get(i);
            Toast.makeText(
                    MainActivity.this,
                    strTenTinhChon,
                    Toast.LENGTH_LONG
            ).show();
        }
    };
}