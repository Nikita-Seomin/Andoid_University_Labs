package com.example.lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Конфигурации экрана изменены!", Toast.LENGTH_SHORT);
        toast.show();
    }


    public void onButtonClick2(View view){
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        Intent returnIntent = new Intent();
        returnIntent.setType("text/plain");
        returnIntent.putExtra("age",messageText);
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }
}