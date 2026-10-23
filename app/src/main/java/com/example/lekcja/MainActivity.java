package com.example.lekcja;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button buttonPlus;
    Button buttonMinus;
    TextView textView;
    int punkty = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.i("CYKL" , "Uruchomiona metoda onCreate");
         buttonPlus = findViewById(R.id.button);
         buttonMinus = findViewById(R.id.button2);
         textView = findViewById(R.id.TextView);
         if(savedInstanceState != null)
         {
             punkty = savedInstanceState.getInt("PUNKTY", 0);
         }
         textView.setText(String.valueOf(punkty));
         buttonPlus.setOnClickListener(
                 new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         punkty++;
                         textView.setText(punkty + "");
                         textView.setText(String.valueOf(punkty));
                         textView.setText(Integer.toString(punkty));

                     }
                 }
         );
         buttonMinus.setOnClickListener(
                 new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                         punkty--;
                         textView.setText(punkty + "");
                         textView.setText(String.valueOf(punkty));
                         textView.setText(Integer.toString(punkty));
                     }
                 }
         );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CYKL" , "Uruchomiona metoda onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CYKL","Uruchomiona metoda onResume");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("CYKL","Uruchomiona metoda onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CYKL","Uruchomiona metoda onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CYKL","Uruchomiona metoda onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CYKL","Uruchomiona metoda onDestroy");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("CYKL","Uruchomiona metoda onSave");
        outState.putInt("PUNKTY" , punkty);
    }

}