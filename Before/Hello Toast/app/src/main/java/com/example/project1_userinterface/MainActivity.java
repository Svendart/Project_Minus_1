package com.example.project1_userinterface;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView textViewCount =
                findViewById(R.id.textViewCount);

        Button buttonCount =
                findViewById(R.id.buttonCount);

        Button buttonReset =
                findViewById(R.id.buttonReset);

        buttonCount.setOnClickListener(v -> {

            counter++;

            textViewCount.setText(
                    String.valueOf(counter)
            );

        });

        buttonReset.setOnClickListener(v -> {

            counter = 0;

            textViewCount.setText(
                    String.valueOf(counter)
            );

        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}