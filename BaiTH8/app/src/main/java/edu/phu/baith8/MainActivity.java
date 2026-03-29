package edu.phu.baith8;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            // Tìm listview
        ListView lvDSMonAn =(ListView) findViewById(R.id.lvDSMonAn);

        // Chuẩn bị nguồn dữ liệu
        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();

        dsMonAn.add(new MonAn("Cơm Gà",25000, "Mô tả ở đây",R.drawable.cg));
        dsMonAn.add(new MonAn("Cơm Tấm",30000, "Mô tả ở đây",R.drawable.cs));
        dsMonAn.add(new MonAn("Cơm Sườn",50000, "Mô tả ở đây",R.drawable.cs));
        dsMonAn.add(new MonAn("Cơm Tổng Hợp",20000, "Mô tả ở đây",R.drawable.cth));
        dsMonAn.add(new MonAn("Cơm Phần",25000, "Mô tả ở đây",R.drawable.cp));
        //
        MonAnAdapter adapter = new MonAnAdapter(this, dsMonAn);
        lvDSMonAn.setAdapter(adapter);
        // Bắt xử lí sự kiện
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                // Lấy  phần từ được chạm
                MonAn monAnChon = dsMonAn.get(i);

                Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    }