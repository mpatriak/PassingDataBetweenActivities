package com.example.michal.passingdatabetweenactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{

    TextView textView;
    private String name;
    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflate the view.
        setContentView(R.layout.activity_second);
        // Retrieves the Extras from the Intent using the key from the key-value pair.
        name = getIntent().getStringExtra(FirstActivity.EXTRA_NAME);
        email = getIntent().getStringExtra(FirstActivity.EXTRA_EMAIL);
        // Gets a reference for the TextView.
        textView = (TextView) findViewById(R.id.secText);
        // Sets the text on the TextView  using the Extras passed from FirstActivity through its
        // Intent.
        textView.setText("Hello " + name + ", You have been added to our subscriber list. You " +
                "will receive the latest updates to the following Email: " + email);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
} // End class SecondActivity.
