package com.example.constrainlayout1;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class ActivityKedua extends AppCompatActivity {
    TextView txEmail, txPassword;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txEmail = findViewById(R.id.tvEmail);

        txPassword = findViewById(R.id.tvPassword);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("a");

        String pass = bundle.getString("b");

        txEmail.setText(email);

        txPassword.setText(pass);
    }
}
