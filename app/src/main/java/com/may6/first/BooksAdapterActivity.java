package com.may6.first;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class BooksAdapterActivity extends Activity {

	private  ArrayList<Book>  books;
	private  ListView lvBooks;
	private  TextView tvTotal;

	
	@Override
	protected void onCreate(Bundle data) {
		super.onCreate(data);
		setContentView(R.layout.activity_booksadapter);

		lvBooks = (ListView) findViewById(R.id.lvBooks);
		tvTotal = (TextView) findViewById(R.id.tvTotal);

		if (data == null ) {
			books = new ArrayList<Book>();
			books.add(new Book("Java Comp. Ref", 660));
			books.add(new Book("Learning Android", 560));
			books.add(new Book("Android in Action", 500));
			books.add(new Book("Spring in Action", 760));
			books.add(new Book("Angular JS", 450));
		}
		else {
			books = (ArrayList<Book>) data.getSerializable("books");
			tvTotal.setText(data.getString("total"));
		}

		
		BooksAdapter adapter = new BooksAdapter(this,books);
		lvBooks.setAdapter(adapter);
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putSerializable("books",books);
		outState.putString("total", tvTotal.getText().toString());
	}

	public void getTotal() {
		int total = 0;
		for(Book b : books)
		{
			if ( b.isSelected())
				total += b.getPrice();
		}

		tvTotal.setText( String.valueOf(total));
	}
	
	
	
}


