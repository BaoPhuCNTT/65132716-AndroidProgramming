package edu.phu.baith8;

import static android.view.View.inflate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
      private  ArrayList<MonAn> dsMonAn;
    private  LayoutInflater layoutInflater;
    private   Context context;

    public MonAnAdapter(Context context ,ArrayList<MonAn> dsMonAn ) {
        this.dsMonAn = dsMonAn;
        this.context = _context;
        this.layoutInflater= LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int i ){
        return dsMonAn.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        // View item hiện hành
        View viewHienHanh = view;
        // Kiểm tra
        if(viewHienHanh == null)
            viewHienHanh   layoutInflater.inflate(R.layout.item_monan,null);
        // Lấy dữ liệu
        MonAn monAnHienTai = dsMonAn.get(i);
         // Gán lên các điều khiển

        // Tìm điều khiển
        TextView textView_TenMon = (TextView) viewHienHanh.findViewById(R.id.tvTenMonAnh);
        TextView textView_DonGia = (TextView) viewHienHanh.findViewById(R.id.tvDonGia);
        TextView textView_MoTa = (TextView) viewHienHanh.findViewById(R.id.tvMoTa);
        ImageView imageView_Anh = (TextView) viewHienHanh.findViewById(R.id.imAnhDaiDien);
        //Set lên
        textView_TenMon.setText(monAnHienTai.getTenMonAn());
        textView_DonGia.setText(String.valueOf(monAnHienTai.getDonGia()));
        textView_MoTa = viewHienHanh.findViewById(R.id.tvMoTa);
        imageView_Anh = viewHienHanh.findViewById(R.id.imAnhDaiDien);

        return viewHienHanh;


    }
}
