package com.example.cstift.myexercise2;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.cstift.myexercise2.RecyclerView.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mainRecyclerView;
    private FloatingActionButton mainFab;
    private TextView mainEmptyText;

    private ArrayList<BirthdayContact> testData = new ArrayList<BirthdayContact>();

    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mainRecyclerView = (RecyclerView) findViewById(R.id.RecyclerViewMain);
        mainFab = (FloatingActionButton) findViewById(R.id.fab);
        mainEmptyText = (TextView) findViewById(R.id.TextWhenEmpty);

        adapter = new RecyclerViewAdapter();

        mainRecyclerView.setHasFixedSize(true);
        // Set a Layout Manager for the Recycler View
        mainRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Set the adapter I created
        mainRecyclerView.setAdapter(adapter);

        // TODO Attach the holder for the items to the RecyclerView --> where?

        mainFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                testData.add(BirthdayContact.create("Bob Dylan", new GregorianCalendar(1965, 4, 16).getTime()));
                testData.add(BirthdayContact.create("Clemens Stift", new GregorianCalendar(1992, 2, 22).getTime()));
                testData.add(BirthdayContact.create("Elisabeth Bergler", new GregorianCalendar(1996, 10, 14).getTime()));
                testData.add(BirthdayContact.create("Axel Böhm", new GregorianCalendar(1991, 11, 20).getTime()));

                //TODO Ask for permission to load data - separate class. + Add it to the manifest.

                //Push data into recyclerView.
                adapter.updateDataSet(testData);

                // If data is loaded, hide the empty text
                if (((RecyclerViewAdapter) mainRecyclerView.getAdapter()).ContactsToShow() == false){
                    mainEmptyText.setVisibility(View.GONE);
                }
            }
        });

    }
}
