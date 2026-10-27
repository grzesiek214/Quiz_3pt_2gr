package com.example.jakisquiz3pt2gr;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Pytanie> pytania;

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
    }

    private void dodajPytania() {
        pytania = new ArrayList<>();
        pytania.add(new Pytanie(R.drawable.krowa, "Czy krowa jest królem zwierząt?", true));
        pytania.add(new Pytanie(R.drawable.kot, "Czy kot jest odmianą szynszyla", false));
        pytania.add(new Pytanie(R.drawable.slon, "Czy to słonie dżwigają ziemię na latającym zółwiu?", true));
        pytania.add(new Pytanie(R.drawable.sledz, "Czy śledź to ssak", false));
    }
}