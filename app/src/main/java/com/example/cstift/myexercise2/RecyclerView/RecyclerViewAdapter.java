package com.example.cstift.myexercise2.RecyclerView;

import android.content.ClipData;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cstift.myexercise2.R;
import com.example.cstift.myexercise2.RecyclerView.ItemViewHolder;
import com.example.cstift.myexercise2.BirthdayContact;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by cstift on 27.04.18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private ArrayList<BirthdayContact> birthdayContacts = new ArrayList<BirthdayContact>();


    public void updateDataSet(ArrayList<BirthdayContact> newData){
        birthdayContacts = newData;
        notifyDataSetChanged();
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ItemViewHolder(listItemView);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.update(birthdayContacts.get(position));
    }

    @Override
    public int getItemCount() {
        return birthdayContacts.size();
    }

    public boolean ContactsToShow(){
        return birthdayContacts.isEmpty();
    }
}
