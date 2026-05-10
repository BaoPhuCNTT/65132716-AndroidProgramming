package edu.phu.vieccanlam;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<TASKS> lstVCL;
    TaskRVadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Tạo danh sách
        lstVCL = new ArrayList<>();
        // Kết nối Firebase
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = database.getReference("TASKS");
        // Lắng nghe dữ liệu
        ValueEventListener ngheFB;
        databaseReference.addValueEventListener(ngheFB);
        // Tìm dieu khien
        RecyclerView recycleView = findViewById(R.id.rcvVCL);
        LinerLayoutManager linerLayoutManager = new LinerLayoutManager(this);
        recyclerView.setLayoutManager(linerLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        adapter = new TaskRVadapter(lstVCL);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
    //
    new ValueEventListener() {

        @Override
        public void onDataChange(
                @NonNull DataSnapshot snapshot
                    ) {

            lstVCL.clear();

            for (DataSnapshot obj :
                    snapshot.getChildren()) {

                TASKS task =
                        obj.getValue(TASKS.class);

                if (task != null) {

                    lstVCL.add(task);

                    Log.w(
                            "VCL APP",
                            "Tên việc cần làm: "
                                    + task.getName()
                    );
                }
            }
        }

        @Override
        public void onCancelled(
                @NonNull DatabaseError error
                    ) {
        }
    }
        );
}