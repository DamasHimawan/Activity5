package com.example.constrainlayout1;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama) {
            case "Tito":
                tvnama.setText("Tito");
                tvnomor.setText("0812222222222");
                break;
            case "Rama":
                tvnama.setText("Rama");
                tvnomor.setText("0812222222223");
                break;
            case "Yuli":
                tvnama.setText("Yuli");
                tvnomor.setText("0812222222224");
                break;
            case "nando":
                tvnama.setText("nando");
                tvnomor.setText("0812222222225");
                break;
            case "Ganang":
                tvnama.setText("Ganang");
                tvnomor.setText("0812222222226");
                break;
            case "Wahyu":
                tvnama.setText("Wahyu");
                tvnomor.setText("081222222227");
                break;
            case "Pamungkas":
                tvnama.setText("Pamungkas");
                tvnomor.setText("0812222222228");
                break;
            case "Budi":
                tvnama.setText("Budi");
                tvnomor.setText("0812222222229");
                break;
            case "Kiki":
                tvnama.setText("Kiki");
                tvnomor.setText("0812222222210");
                break;
            case "Endoy":
                tvnama.setText("Endoy");
                tvnomor.setText("0812222222211");
                break;
        }
    }
}
