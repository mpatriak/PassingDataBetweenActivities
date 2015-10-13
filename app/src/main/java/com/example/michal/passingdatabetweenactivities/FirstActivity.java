package com.example.michal.passingdatabetweenactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class FirstActivity extends AppCompatActivity
{
    ImageButton subscribeButton;
    EditText name;
    EditText email;
    // Strings to be used as keys in the key-value pairs when passing the Extras.
    public static final String EXTRA_NAME = "com.example.michal.passingdatabetweenactivities.name";
    public static final String EXTRA_EMAIL = "com.example.michal.passingdatabetweenactivities" +
            ".email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Inflates the view.
        setContentView(R.layout.activity_first);
        // Gets a reference to the subscribeButton.
        subscribeButton = (ImageButton) findViewById(R.id.subscribeButton);
        // Creates an anonymous class to handle the button click.
        subscribeButton.setOnClickListener(new View.OnClickListener()
        {
           @Override
           public void onClick(View v)
           {
               // Tells startActivity which activity to start.
               Intent i = new Intent(FirstActivity.this, SecondActivity.class);
               // Gets references for the EditText fields.
               name = (EditText) findViewById(R.id.nameET);
               email = (EditText) findViewById(R.id.mailET);
               // Sets the value of the Extras to be the values of the EditText fields.
               String ETName = name.getText().toString();
               String ETEmail = email.getText().toString();
               // Stores the Extras using key-value pairs.
               i.putExtra(EXTRA_NAME, ETName);
               i.putExtra(EXTRA_EMAIL, ETEmail);
               // Makes the call to start a new activity while passing the Intent to it
               // containing the values of the Extras.
               startActivity(i);
           }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_first, menu);
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
} // End class FirstActivity
