package com.may6.first;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BooksListViewActivity extends Activity {
    ListView listBooks;
    ArrayList<String> books = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        listBooks = (ListView) findViewById(R.id.LvBooks);

        Map<String, String> b1 = new HashMap<>();
        b1.put("title", "Android in Action");
        b1.put("price", "500");


        Map<String, String> b2 = new HashMap<>();
        b2.put("title", "Java Complete Ref.");
        b2.put("price", "660");

        Map<String, String> b3 = new HashMap<>();
        b3.put("title", "Spring in Action");
        b3.put("price", "700");

        List<Map<String, String>> data = new ArrayList<>();
        data.add(b1);
        data.add(b2);
        data.add(b3);

        SimpleAdapter sa = new SimpleAdapter(this, data, R.layout.horizontal_book,
                new String[]{"title", "price"},
                new int[]{R.id.tvTitle, R.id.tvPrice});

        listBooks.setAdapter(sa);

    }

}