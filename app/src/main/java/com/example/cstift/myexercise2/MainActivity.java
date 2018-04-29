package com.example.cstift.myexercise2;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.cstift.myexercise2.RecyclerView.RecyclerViewAdapter;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mainRecyclerView;
    private FloatingActionButton mainFab;
    private TextView mainEmptyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mainRecyclerView = (RecyclerView) findViewById(R.id.RecyclerViewMain);
        mainFab = (FloatingActionButton) findViewById(R.id.fab);
        mainEmptyText = (TextView) findViewById(R.id.TextWhenEmpty);

        // Set a Layout Manager for the Recycler View
        mainRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Set the adapter I created
        mainRecyclerView.setAdapter(new RecyclerViewAdapter());

        // TODO Attach the holder for the items to the RecyclerView --> where?

        mainFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Load data

                // If data is loaded, hide the empty text
                if (((RecyclerViewAdapter) mainRecyclerView.getAdapter()).noContactsToShow() == false){
                    mainEmptyText.setVisibility(View.GONE);
                }
            }
        });

    }
}
