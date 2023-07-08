package com.example.recycle_monthnmae;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyClerAdapter extends RecyclerView.Adapter<RecyClerAdapter.ViewHolder> {
    Context context;
     String data[];

    public RecyClerAdapter(Context context, String[] data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
      View view = layoutInflater.inflate(R.layout.custome_design,parent,false);
      ViewHolder viewHolder = new ViewHolder(view);
      return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {

         holder.textView.setText(data[position]);




    }

    @Override
    public int getItemCount() {
        return data.length;
    }

       public class ViewHolder extends RecyclerView.ViewHolder {
            TextView textView;

            public ViewHolder(@NonNull View itemView) {
               super(itemView);
               textView = itemView . findViewById(R.id.textname);
           }
       }
}
