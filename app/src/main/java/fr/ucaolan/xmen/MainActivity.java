package fr.ucaolan.xmen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.List;

import fr.ucaolan.xmen.databinding.ActivityMainBinding;

import fr.ucaolan.xmen.XMenViewHolder;
import fr.ucaolan.xmentp6.R;

public class MainActivity extends AppCompatActivity {
    // interface de l'utilisateur
    private ActivityMainBinding ui;
    private List<XMen> liste;
    private XMenAdapter adapter;


    private void setOnItemClickListener(int position) {

        // récupérer le XMen Concerné

        XMen xmen = liste.get(position);

        // Changer l'image de XMen

        xmen.setIdImage(R.drawable.undef);

        // signaler à l'adaptateur que l'élément a changer

        adapter.notifyItemChanged(position);
        adapter.notifyItemInserted(position);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // mise en place de l'interface
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        // obtenir la liste
        XMenApplication application = (XMenApplication) getApplication();
        List<XMen> liste = application.getListe();

        // créer l'adaptateur
        XMenAdapter adapter = new XMenAdapter(liste);

        // fournir l'adaptateur au recycler
        ui.recycler.setAdapter(adapter);

        // dimensions constantes
        ui.recycler.setHasFixedSize(true);

        // layout manager
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        ui.recycler.setLayoutManager(lm);

        // ligne de separation entre items
        // seprateurs
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(
                this, DividerItemDecoration.VERTICAL);
        ui.recycler.addItemDecoration(dividerItemDecoration);

        // Creation de l'ecouteur sur le click

        //adapter.setOnItemClickListener(this);

    }

    public boolean OnCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }



}