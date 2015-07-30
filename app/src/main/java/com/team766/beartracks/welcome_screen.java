package com.team766.beartracks;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.firebase.client.Firebase;

/**
 * Created by tommypacker on 7/29/15.
 */
public class welcome_screen extends AppCompatActivity {

    public static final String PREFS_NAME = "MyPrefsFile";
    public BroadcastReceiver receiver;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);

        SharedPreferences settings = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);

        if (settings.getBoolean("hasLoggedIn", false)) {
            moveToHome();
        }

        setContentView(R.layout.welcome_sreen);

        Toolbar toolbar = (Toolbar) findViewById(R.id.Toolbar);
        setSupportActionBar(toolbar);
        setTitle("Welcome");
    }

    public void existingLogin(View view){
        Intent intent = new Intent(getApplicationContext(), login_activity.class);
        startActivity(intent);
    }

    public void createNewAccount(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.team766.com"));
        startActivity(intent);
    }


    public void moveToHome(){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        this.finish();
    }

}
