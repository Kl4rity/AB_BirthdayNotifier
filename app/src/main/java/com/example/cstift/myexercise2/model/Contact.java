package com.example.cstift.myexercise2.model;

/**
 * Created by cstift on 29.04.18.
 */

import com.google.auto.value.AutoValue;

import java.util.Date;

@AutoValue
public abstract class Contact {

    abstract String name();
    abstract Date birthday();

}
