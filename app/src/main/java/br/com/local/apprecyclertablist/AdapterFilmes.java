package br.com.local.apprecyclertablist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterFilmes extends RecyclerView.Adapter<AdapterFilmes.ViewHolder> {
    private Context context;
    private List<Filmes> lstFilmes;

    public AdapterFilmes(Context context, List<Filmes> lstFilmes) {
        this.context = context;
        this.lstFilmes = lstFilmes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.modelo_filmes, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtModeloTituloFilmes.setText(lstFilmes.get(position).getTitulo());
        holder.imgModeloFilmes.setImageResource(lstFilmes.get(position).getImgFilmes());

    }

    @Override
    public int getItemCount() {
        return lstFilmes.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtModeloTituloFilmes;
        ImageView imgModeloFilmes;
        CardView cardModeloFilmes;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtModeloTituloFilmes = itemView.findViewById(R.id.txtModeloTituloFilmes);
            imgModeloFilmes = itemView.findViewById(R.id.imgModeloFilmes);
            cardModeloFilmes = itemView.findViewById(R.id.cardModeloFilmes);
        }
    }
}