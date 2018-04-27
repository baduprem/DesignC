package com.example.prem.designc;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Prem on 4/25/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {



    private List<ListItem> ListItems;
    private Context context;

    public MyAdapter(List<ListItem> listItem, Context context) {
        ListItems = listItem;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ListItem listItem = ListItems.get(position);

        holder.textViewHead.setText(listItem.getHead());
        holder.textVIewDesc.setText(listItem.getDesc());
    }

    @Override
    public int getItemCount() {

        return ListItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewHead;
        public TextView textVIewDesc;


        public ViewHolder(View itemView) {
            super(itemView);
            textViewHead= (TextView) itemView.findViewById(R.id.textViewHead);
            textVIewDesc= (TextView) itemView.findViewById(R.id.textViewDesc);
        }
    }
}
