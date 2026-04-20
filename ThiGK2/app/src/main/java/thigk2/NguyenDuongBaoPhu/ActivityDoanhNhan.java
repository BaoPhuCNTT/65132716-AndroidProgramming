package thigk2.NguyenDuongBaoPhu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ActivityDoanhNhan extends AppCompatActivity {

    ListView lvDoanhNhan;
    ArrayList<DoanhNhan> mangDoanhNhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_doanh_nhan);

        lvDoanhNhan = findViewById(R.id.lvDoanhNhan);
        mangDoanhNhan = new ArrayList<>();

        mangDoanhNhan.add(new DoanhNhan("Phạm Nhật Vượng", "Quê quán: Hà Tĩnh", R.mipmap.ic_launcher));
        mangDoanhNhan.add(new DoanhNhan("Trần Đình Long", "Quê quán: Hải Dương", R.mipmap.ic_launcher));
        mangDoanhNhan.add(new DoanhNhan("Nguyễn Thị Phương Thảo", "Quê quán: Hà Nội", R.mipmap.ic_launcher));
        mangDoanhNhan.add(new DoanhNhan("Đoàn Nguyên Đức", "Quê quán: Bình Định", R.mipmap.ic_launcher));
        mangDoanhNhan.add(new DoanhNhan("Trần Bá Dương", "Quê quán: Thừa Thiên Huế", R.mipmap.ic_launcher));

        DoanhNhanAdapter adapter = new DoanhNhanAdapter();
        lvDoanhNhan.setAdapter(adapter);
    }

    public void QuayVe(View v) {
        Intent iManHinhCHINH = new Intent(this, MainActivity.class);
        startActivity(iManHinhCHINH);
    }

    class DoanhNhan {
        String ten;
        String queQuan;
        int hinhAnh;

        public DoanhNhan(String ten, String queQuan, int hinhAnh) {
            this.ten = ten;
            this.queQuan = queQuan;
            this.hinhAnh = hinhAnh;
        }
    }

    class DoanhNhanAdapter extends ArrayAdapter<DoanhNhan> {
        public DoanhNhanAdapter() {
            super(ActivityDoanhNhan.this, R.layout.item_doanh_nhan, mangDoanhNhan);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if (convertView == null) {
                LayoutInflater inflater = getLayoutInflater();
                convertView = inflater.inflate(R.layout.item_doanh_nhan, null);
            }

            ImageView imgDN = convertView.findViewById(R.id.imgDoanhNhan);
            TextView tvTen = convertView.findViewById(R.id.tvTenDoanhNhan);
            TextView tvQue = convertView.findViewById(R.id.tvQueQuan);

            DoanhNhan dn = mangDoanhNhan.get(position);

            tvTen.setText(dn.ten);
            tvQue.setText(dn.queQuan);
            imgDN.setImageResource(dn.hinhAnh);

            return convertView;
        }
    }
}