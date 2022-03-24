package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    Context context;
    ArrayList<contactmodel> contact_array;
    public RecyclerContactAdapter(Context context, ArrayList<contactmodel> contact_array){
        this.context = context;
        this.contact_array = contact_array;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.contacts, parent, false);
        ViewHolder viewholder = new ViewHolder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.img.setImageResource(contact_array.get(position).img);
        holder.txtName.setText(contact_array.get(position).name);
        holder.txtNumber.setText(contact_array.get(position).contnum);

    }

    @Override
    public int getItemCount() {
        return contact_array.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtName, txtNumber;
        ImageView img;
        public ViewHolder(View itemView){
            super(itemView);

            txtName = itemView.findViewById(R.id.con);
            txtNumber = itemView.findViewById(R.id.connum);
            img = itemView.findViewById(R.id.imgcontact);
        }

    }
}
