package edu.phu.usingrecyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Landscape> recyclerViewData;
    LandscapeAdapter landscapeAdapter;
    RecyclerView recyclerViewLand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewData = getListData();
        recyclerViewLand = findViewById(R.id.recyclerLand);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerViewLand.setLayoutManager(layoutManager);

        landscapeAdapter = new LandscapeAdapter(this, recyclerViewData);
        recyclerViewLand.setAdapter(landscapeAdapter);
    }

    private ArrayList<Landscape> getListData() {
        ArrayList<Landscape> list = new ArrayList<>();
        list.add(new Landscape("hanoi", "Cột cờ Hà Nội"));
        list.add(new Landscape("buckingham", "Cung điện Buckingham"));
        list.add(new Landscape("statue", "Tượng thần tự do"));
        return list;
    }
}