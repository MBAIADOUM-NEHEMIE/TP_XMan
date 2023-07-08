package fr.ucaolan.xmen;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import fr.ucaolan.xmen.databinding.XMenBinding;


import android.view.View;


public class XMenViewHolder extends RecyclerView.ViewHolder {
    private final XMenBinding ui ;

    private XMenAdapter.OnItemClickListener onItemClickListener;

    public XMenViewHolder (@NonNull XMenBinding ui ){
        super(ui.getRoot());
        this.ui = ui ;

    }

    public void setXMen(XMen xmen){
        ui.image.setImageResource(xmen.getIdImage());
        ui.nom.setText(xmen.getNom());
        ui.alias.setText(xmen.getAlias());
        ui.description.setText(xmen.getDescription());
        ui.pouvoirs.setText(xmen.getPouvoirs());

        itemView.setOnClickListener(this::onClick);

    }

    public void setOnItemClickListener(XMenAdapter.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    private void onClick(View v){
         if (onItemClickListener != null)
             onItemClickListener.onItemClick(getAdapterPosition());
    }
}
