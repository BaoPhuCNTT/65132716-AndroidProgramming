package edu.phu.usingrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class LandscapeAdapter extends RecyclerView.Adapter<LandscapeAdapter.ItemLandHolder> {
    private final Context context;
    private final ArrayList<Landscape> listData; // Sửa LandScape thành Landscape

    public LandscapeAdapter(Context context, ArrayList<Landscape> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_land, parent, false);
        return new ItemLandHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        Landscape ls = listData.get(position); // Sửa LandScape thành Landscape

        // Sửa getLandCaption() thành getCaption() theo file Landscape.java
        holder.tvCaption.setText(ls.getCaption());

        String packageName = context.getPackageName();

        // Sửa getLandImageFileName() thành getImageFileName()
        int imageId = context.getResources().getIdentifier(ls.getImageFileName(), "mipmap", packageName);
        holder.ivLand.setImageResource(imageId);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ItemLandHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvCaption;
        ImageView ivLand;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCaption);
            ivLand = itemView.findViewById(R.id.imageViewLand);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getBindingAdapterPosition();
            if (position != RecyclerView.NO_POSITION) {
                Landscape item = listData.get(position); // Sửa LandScape thành Landscape
                Toast.makeText(context, "Bạn vừa click vào: " + item.getCaption(), Toast.LENGTH_SHORT).show();
            }
        }
    }
}