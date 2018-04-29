package com.example.cstift.myexercise2;

/**
 * Created by cstift on 29.04.18.
 */

import com.google.auto.value.AutoValue;

import java.util.Date;

@AutoValue
public abstract class BirthdayContact {

    public abstract String name();
    public abstract Date birthday();

    public static BirthdayContact create(String name, Date birthday){
        return new AutoValue_BirthdayContact(name, birthday);
    }

}

