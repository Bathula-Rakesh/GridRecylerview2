package com.example.gridrecylerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.CustomFloatAttributes;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recylerview;
    List<CustomModelClass> customModelClasses = new ArrayList<>();
    GridviewAdapter gridviewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recylerview = findViewById(R.id.recyclerview);

        recylerview.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        gridviewAdapter = new GridviewAdapter(getApplicationContext(),customModelClasses);

        recylerview.setAdapter(gridviewAdapter);
        loaddata();
    }

    private void loaddata() {
        customModelClasses.add(new CustomModelClass(R.drawable.ic_launcher_background,"Rakesh"));
        customModelClasses.add(new CustomModelClass(R.drawable.ic_launcher_background,"Ramya"));
        customModelClasses.add(new CustomModelClass(R.drawable.ic_launcher_background,"gopal"));
        customModelClasses.add(new CustomModelClass(R.drawable.ic_launcher_background,"manjula"));
        return;
    }
}