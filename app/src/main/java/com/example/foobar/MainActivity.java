package com.example.foobar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        Button signin;

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         signin = findViewById(R.id.signin);

         signin.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

               //  Intent intent = new Intent(MainActivity.this, HomePage.class);

                 // startActivity(intent);
                 Toast.makeText(MainActivity.this,
                         "Hello World!",
                         Toast.LENGTH_SHORT).show();

             }
         });



    }
}