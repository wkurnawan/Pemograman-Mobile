package com.wawan.profilku;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class ProfileActivity extends AppCompatActivity {

    TextView hasilPesan;
    TextView hasilPesan2;
    TextView hasilPesan3;
    TextView hasilPesan4;
    TextView hasilPesan5;

    @SuppressLint({"QueryPermissionsNeeded", "WrongViewCast", "CutPasteId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        hasilPesan = findViewById(R.id.hasilPesan);
        hasilPesan2 = findViewById(R.id.hasilPesan2);
        hasilPesan3 = findViewById(R.id.hasilPesan3);
        hasilPesan4 = findViewById(R.id.hasilPesan4);
        hasilPesan5 = findViewById(R.id.hasilPesan5);

        hasilPesan.setText(getIntent().getStringExtra("PESANEMAIL"));
        hasilPesan2.setText(getIntent().getStringExtra("PESANNAME"));
        hasilPesan3.setText(getIntent().getStringExtra("PESANPHONE"));
        hasilPesan4.setText(getIntent().getStringExtra("PESANADD"));
        hasilPesan5.setText(getIntent().getStringExtra("PESANBIO"));
    }

    public void pushcall(View view) {
        Uri uri = Uri.parse("tel:" + Uri.decode(String.valueOf(hasilPesan3)));
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
    }
}