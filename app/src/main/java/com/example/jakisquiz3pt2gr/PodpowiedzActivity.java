package com.example.jakisquiz3pt2gr;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class PodpowiedzActivity extends AppCompatActivity {
    private ImageView imageViewPodp;
    private TextView textViewPodp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_podpowiedz);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageViewPodp = findViewById(R.id.imageView3);
        textViewPodp = findViewById(R.id.textView);

        List<Pytanie> pytania = MainActivity.dodajPytania();
        Intent intent = getIntent();
        int ktore = intent.getIntExtra("NR", 0);
        Toast.makeText(this, pytania.get(ktore).getPodpowiedz(), Toast.LENGTH_SHORT).show();

        textViewPodp.setText(pytania.get(ktore).getPodpowiedz());
        imageViewPodp.setImageResource((int)pytania.get(ktore).getIdZdjecia());
    }
}