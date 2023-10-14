package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editNilaiA, editNilaiB;
    Button buttonTambah, buttonKurang, buttonKali, buttonBagi;
    TextView textHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNilaiA = (EditText) findViewById(R.id.editNilaiA);
        editNilaiB = (EditText) findViewById(R.id.editNilaiB);
        textHasil = (TextView) findViewById(R.id.textHasil);
        buttonTambah = (Button) findViewById(R.id.buttonTambah);
        buttonKurang = (Button) findViewById(R.id.buttonKurang);
        buttonKali = (Button) findViewById(R.id.buttonKali);
        buttonBagi = (Button) findViewById(R.id.buttonBagi);

        buttonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(editNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(editNilaiB.getText().toString());

                int hasil = nilaiA + nilaiB;
                textHasil.setText(String.valueOf(hasil));
            }
        });

        buttonKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(editNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(editNilaiB.getText().toString());

                int hasil = nilaiA - nilaiB;
                textHasil.setText(String.valueOf(hasil));
            }
        });

        buttonKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(editNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(editNilaiB.getText().toString());

                int hasil = nilaiA * nilaiB;
                textHasil.setText(String.valueOf(hasil));
            }
        });

        buttonBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(editNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(editNilaiB.getText().toString());

                int hasil = nilaiA / nilaiB;
                textHasil.setText((String.valueOf(hasil)));
            }
        });
    }
}