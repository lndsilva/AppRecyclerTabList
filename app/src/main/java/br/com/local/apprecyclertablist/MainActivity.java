package br.com.local.apprecyclertablist;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView idRecyclerViewFilmes;

    List<Filmes> listaFilmes;

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

        listaFilmes = new ArrayList<>();

        listaFilmes.add(new Filmes("Jogos vorazes", "Ação", "Filme de ação", "4,5", R.drawable.jogos_vorazes));
        listaFilmes.add(new Filmes("Batman", "Ação", "Filme de ação", "4,5", R.drawable.batman));
        listaFilmes.add(new Filmes("Como eu era", "Ação", "Filme de ação", "4,5", R.drawable.como_eu_era));
        listaFilmes.add(new Filmes("Fora do mapa", "Ação", "Filme de ação", "4,5", R.drawable.fora_do_mapa));
        listaFilmes.add(new Filmes("John Wick", "Ação", "Filme de ação", "4,5", R.drawable.john_wick));
        listaFilmes.add(new Filmes("Luta pela fé", "Ação", "Filme de ação", "4,5", R.drawable.luta_pela_fe));
        listaFilmes.add(new Filmes("Missão sobrevivência", "Ação", "Filme de ação", "4,5", R.drawable.missao_sobrevivencia));
        listaFilmes.add(new Filmes("Pinóquio", "Ação", "Filme de ação", "4,5", R.drawable.pinoquio));
        listaFilmes.add(new Filmes("Homem aranha", "Ação", "Filme de ação", "4,5", R.drawable.spider_man));
        listaFilmes.add(new Filmes("Esquema de risco", "Ação", "Filme de ação", "4,5", R.drawable.esquema_risco));

        idRecyclerViewFilmes = findViewById(R.id.idRecyclerViewFilmes);

        AdapterFilmes adapterFilmes = new AdapterFilmes(getApplicationContext(), listaFilmes);

        idRecyclerViewFilmes.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        idRecyclerViewFilmes.setHasFixedSize(true);

        idRecyclerViewFilmes.setAdapter(adapterFilmes);
    }
}