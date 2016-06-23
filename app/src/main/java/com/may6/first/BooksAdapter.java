package com.may6.first;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.ArrayList;


public class BooksAdapter extends BaseAdapter {
    private Context ctx;
    private ArrayList<Book> books;

    public BooksAdapter(Context ctx, ArrayList<Book> books) {
        this.ctx = ctx;
        this.books = books;
    }
    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Object getItem(int position) {
        return books.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
    //    if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(ctx);
            convertView = inflater.inflate(R.layout.book_layout, null);

            final Book book = books.get(position);

            TextView textTitle = (TextView) convertView
                    .findViewById(R.id.textTitle);
            textTitle.setText(book.getTitle());

            CheckBox cbSelected = (CheckBox) convertView.findViewById(R.id.chkSelected);
            cbSelected.setChecked(book.isSelected());
            cbSelected.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                     book.setSelected(b);
                     // Log.d("First",book.getTitle() +  (b ? " selected " : " unselected "));
                     BooksAdapterActivity activity = (BooksAdapterActivity) ctx;
                     activity.getTotal();
                }
            });


        //}
        return convertView;
    }

}
