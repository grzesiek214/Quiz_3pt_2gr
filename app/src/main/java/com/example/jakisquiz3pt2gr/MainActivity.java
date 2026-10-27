package com.example.jakisquiz3pt2gr;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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
    private TextView textView;
    private ImageView imageView;
    private Button buttonTak;
    private Button buttonNie;
    private Button buttonDalej;

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

        dodajPytania();
        textView = findViewById(R.id.textViewPytanie);
        buttonTak = findViewById(R.id.button5);
        buttonNie = findViewById(R.id.button6);
        buttonDalej = findViewById(R.id.button8);
        imageView = findViewById(R.id.imageView2);
        wypiszPytanie(0);
    }

    private void wypiszPytanie(int ktore) {
        Pytanie pytanie = pytania.get(ktore);
        textView.setText(pytanie.getTrescPytania());
        imageView.setImageResource((int)pytanie.getIdZdjecia());
    }

    private void dodajPytania() {
        pytania = new ArrayList<>();
        pytania.add(new Pytanie(R.drawable.krowa, "Czy krowa jest królem zwierząt?", true));
        pytania.add(new Pytanie(R.drawable.kot, "Czy kot jest odmianą szynszyla", false));
        pytania.add(new Pytanie(R.drawable.slon, "Czy to słonie dżwigają ziemię na latającym zółwiu?", true));
        pytania.add(new Pytanie(R.drawable.sledz, "Czy śledź to ssak", false));
    }
}