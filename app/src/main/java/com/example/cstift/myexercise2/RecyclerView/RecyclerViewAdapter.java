package com.example.cstift.myexercise2.RecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cstift on 27.04.18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter {

    private ArrayList<Contact> birthdayContacts = new ArrayList<Contact>();

    public void updateDataSet(ArrayList<Contact> newData){
        birthdayContacts = newData;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // TODO Set the data to the Views in the item.
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return birthdayContacts.size();
    }

    public boolean noContactsToShow(){
        return birthdayContacts.isEmpty();
    }
}
