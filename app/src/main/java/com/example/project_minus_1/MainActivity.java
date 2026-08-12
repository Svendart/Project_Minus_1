package com.example.project_minus_1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Tambahkan variabel textmu di textview ke java dulu
    TextView text;
    // Tambahkan variabel countmu di int dulu
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            // Tambahkan perintah untuk mencari id text di java
            text = findViewById(R.id.text);

            return insets;
        });
    }

    public void showToast(View view) {

        Toast.makeText(this, "Halo Ahsan :)", Toast.LENGTH_SHORT).show();


    }

    // Fungsi ini dipanggil saat tombol HITUNG diklik
    public void countUp(View view) {
        count++; // Menambah angka
        text.setText(count + ""); // Menampilkan ke layar
    }


}