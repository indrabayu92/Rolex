package com.example.rolex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Rolex> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(RolexData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListRolexAdapter listRolexAdapter = new ListRolexAdapter(this);
        listRolexAdapter.setListRolex(list);
        rvCategory.setAdapter(listRolexAdapter);
        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedRolex(list.get(position));
            }
        });
    }

    private void showSelectedRolex(Rolex rolex){
        Toast.makeText(this, "Kamu memilih "+rolex.getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
        intent.putExtra("image_url", rolex.getPhoto());
        intent.putExtra("image_name", rolex.getName());
        intent.putExtra("image_description", rolex.getDescription());
        startActivity(intent);
    }

    private void showRecyclerGrid(){
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        GridRolexAdapter gridRolexAdapter = new GridRolexAdapter(this);
        gridRolexAdapter.setListRolex(list);
        rvCategory.setAdapter(gridRolexAdapter);
        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedRolex(list.get(position));
            }
        });
    }

    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewRolexAdapter cardViewRolexAdapter = new CardViewRolexAdapter(this);
        cardViewRolexAdapter.setListRolex(list);
        rvCategory.setAdapter(cardViewRolexAdapter);
        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedRolex(list.get(position));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                showRecyclerCardView();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}