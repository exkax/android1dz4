package com.example.android1dz5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    ArrayList<Model> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        adapter = new Adapter();
        adapter.updateData(addlist());
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<Model> addlist() {
        list.add(new Model(R.drawable.braziliya,"Бразилия", "Бразилия"));
        list.add(new Model(R.drawable.argentina,"Аргентина", "Буэнос-Айрес"));
        list.add(new Model(R.drawable.columbiya,"Колумбия", "Богота"));
        list.add(new Model(R.drawable.urugvai,"Уругвай", "Монтееидео"));
        list.add(new Model(R.drawable.chili,"Чили", "Сантьяго"));

        return list;
    }
}