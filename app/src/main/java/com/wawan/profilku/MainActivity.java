package com.wawan.profilku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextInputEditText pesanemail;
    TextInputEditText pesanname;
    TextInputEditText pesanphone;
    TextInputEditText pesanadd;
    TextInputEditText pesanbio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pesanemail = findViewById(R.id.pesanemail);
        pesanname = findViewById(R.id.pesanname);
        pesanphone = findViewById(R.id.pesanphone);
        pesanadd = findViewById(R.id.pesanadd);
        pesanbio = findViewById(R.id.pesanbio);



        Button btnKirim = findViewById(R.id.kirimPesan);
        btnKirim.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("PESANEMAIL", Objects.requireNonNull(pesanemail.getText()).toString());
            intent.putExtra("PESANNAME", Objects.requireNonNull(pesanname.getText()).toString());
            intent.putExtra("PESANPHONE", Objects.requireNonNull(pesanphone.getText()).toString());
            intent.putExtra("PESANADD", Objects.requireNonNull(pesanadd.getText()).toString());
            intent.putExtra("PESANBIO", Objects.requireNonNull(pesanbio.getText()).toString());
            startActivity(intent);
        });
    }
}