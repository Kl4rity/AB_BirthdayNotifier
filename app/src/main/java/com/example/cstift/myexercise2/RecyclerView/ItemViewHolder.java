package com.example.cstift.myexercise2.RecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.cstift.myexercise2.BirthdayContact;
import com.example.cstift.myexercise2.R;

/**
 * Created by cstift on 27.04.18.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder {

    public TextView birthday;
    public TextView name;

    public ItemViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.name);
        birthday = (TextView) itemView.findViewById(R.id.birthday);
    }

    public void update(BirthdayContact contact){
        name.setText(contact.name());
        birthday.setText(contact.birthday().toString());
    }
}
