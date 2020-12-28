package com.molfar.gardeningcalendar;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolder> {

    private Context mContext;
    private List<MonthDetailModel> mData;

    public RecyclerviewAdapter(Context mContext, List<MonthDetailModel> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecyclerviewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.card_view_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewAdapter.MyViewHolder holder, int position) {

        holder.tv_title.setText(mData.get(position).getTitle());
        holder.tv_desc.setText(mData.get(position).getDescription());
        holder.img_def.setImageResource(mData.get(position).getImage());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra("title", mData.get(position).getTitle());
                intent.putExtra("description", mData.get(position).getDescription());
                intent.putExtra("Type_work", mData.get(position).getImage());
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_title, tv_desc;
        ImageView img_def;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_title = (TextView) itemView.findViewById(R.id.txt_title_def);
            tv_desc = (TextView) itemView.findViewById(R.id.txt_descr_def);
            img_def = (ImageView) itemView.findViewById(R.id.img_def);
            cardView = (CardView) itemView.findViewById(R.id.card_id);
        }
    }
}
