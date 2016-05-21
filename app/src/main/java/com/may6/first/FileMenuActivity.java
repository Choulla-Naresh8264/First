package com.may6.first;

import android.app.ActionBar;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class FileMenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_menu);
        registerForContextMenu( findViewById(R.id.tvContent));
        ActionBar bar = getActionBar();
        bar.setHomeButtonEnabled(true);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch( item.getItemId())
        {
            case  R.id.optHelp :
                Log.d("First", "Help Selected!");
                return true;
            case  R.id.optAbout :
                Log.d("First", "About Selected!");
                return true;
            default :
                return super.onContextItemSelected(item);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate( R.menu.context_menu, menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.filemenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
         switch( item.getItemId())
         {
             case android.R.id.home :
                 Log.d("First", "Home Selected");
                 return true;
             case  R.id.optOpen :
                 Log.d("First", "Open Selected!");
                 return true;
             case  R.id.optSave :
                 Log.d("First", "Save Selected!");
                 return true;
             default :
                 Log.d("First","Nothing selected!");
                 return false;
         }
    }
}
