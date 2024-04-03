package com.example.navdrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterPenyanyi extends RecyclerView.Adapter<AdapterPenyanyi.MyViewHolder> {
    Context context;
    List<ModelPenyanyi> modelPenyanyis;
    private ItemClickListener mClickListener;

    public AdapterPenyanyi(Context context, List<ModelPenyanyi> modelPenyanyis){
        this.context = context;
        this.modelPenyanyis = modelPenyanyis;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.content_layout, parent, false);

        return new AdapterPenyanyi.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textName.setText(modelPenyanyis.get(position).getName());
        holder.imageView.setImageResource(modelPenyanyis.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return modelPenyanyis.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;
        TextView textName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textName = itemView.findViewById(R.id.textName);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }
    public ModelPenyanyi getItem(int id) {return  modelPenyanyis.get(id);}
    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
