package com.example.floatingactionbutton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton floatingActionButton,floatingActionButton2;
    private TextView textView;
    private int sayi = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatingActionButton = findViewById(R.id.floatingActionButton);
        floatingActionButton2 = findViewById(R.id.floatingActionButton2);
        textView = findViewById(R.id.textView);
         
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             try {
                 sayi = Integer.valueOf(textView.getText().toString());
                 sayi++;
                 textView.setText(String.valueOf(sayi));
             }catch (Exception e) {
                 e.printStackTrace();
             }
            }
        });

        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    sayi = Integer.valueOf(textView.getText().toString());
                    sayi--;
                    if(sayi<0){
                        AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this);
                        ad.setTitle("Uyarı!!!");
                        ad.setMessage("- e düştünüzz..");
                        ad.show();
                    }
                    textView.setText(String.valueOf(sayi));
                }catch (Exception e) {
                    e.printStackTrace();
                }



            }
        });


    }
}
