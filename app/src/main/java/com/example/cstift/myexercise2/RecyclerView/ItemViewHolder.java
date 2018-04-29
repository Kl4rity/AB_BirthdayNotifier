package com.example.cstift.myexercise2.RecyclerView;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.cstift.myexercise2.BirthdayContact;
import com.example.cstift.myexercise2.R;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by cstift on 27.04.18.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder {

    public TextView birthday;
    public TextView name;
    private SimpleDateFormat displayDateFormat;

    public ItemViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.name);
        birthday = (TextView) itemView.findViewById(R.id.birthday);

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(name, name.getText() + "clicked", Snackbar.LENGTH_LONG);
            }
        });

        birthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(birthday, name.getText() + "'s birthday is on the" + birthday.getText(), Snackbar.LENGTH_LONG);
            }
        });
    }

    public void update(BirthdayContact contact){
        name.setText(contact.name());
        birthday.setText(formatDate(contact.birthday()));
    }

    public String formatDate(Date date){
        displayDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return displayDateFormat.format(date);
    }
}
