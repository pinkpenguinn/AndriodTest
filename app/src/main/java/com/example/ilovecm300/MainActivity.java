package com.example.ilovecm300;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick (View view) {
        EditText editName = (EditText) findViewById(R.id.editText);
        TextView textDisplay = (TextView) findViewById(R.id.textViewDisplay);
        String nameToDisplay = editName.getText().toString();
        textDisplay.setText("Hello " + nameToDisplay);
    }
}
