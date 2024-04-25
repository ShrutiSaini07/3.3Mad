package com.example.ws9;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Initialize other components or perform additional setup here
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.new_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.itm1) {
            // Handle menu item 1 click (e.g., show Settings)
            Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.itm2) {
            // Handle menu item 2 click (e.g., show About Us)
            Toast.makeText(this, "About Us clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.itm3) {
            // Handle menu item 3 click (e.g., perform Log Out)
            Toast.makeText(this, "Log Out clicked", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}