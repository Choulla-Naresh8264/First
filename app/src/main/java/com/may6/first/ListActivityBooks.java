package com.may6.first;


import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ListActivityBooks extends ListActivity {

    ArrayList<String> books = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // bind listview with books

        books.add("Android in Action");
        books.add("Java Complete  Ref");
        books.add("Learn Android");
        books.add("Spring in Action");

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_single_choice,
                        books);

        this.getListView().setAdapter(adapter);


    }

}
