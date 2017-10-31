package com.example.user.testlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.user.testlistview.adapter.AnimalListAdapter;
import com.example.user.testlistview.model.Animal;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView mlistView;
    //   private ArrayList<Animal> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlistView = (ListView)findViewById(R.id.list_view);

        final AnimalData animalData = AnimalData.getInstance();
        animalData.animalList = new ArrayList<>();

        animalData.animalList.add(new Animal("แมว (Cat)", R.drawable.cat));
        animalData.animalList.add(new Animal("หมา (Dog)", R.drawable.dog));
        animalData.animalList.add(new Animal("โลมา (Dolphin)", R.drawable.dolphin));
        animalData.animalList.add(new Animal("โคอาลา (Koala)", R.drawable.koala));
        animalData.animalList.add(new Animal("นกฮูก (Owl)", R.drawable.owl));
        animalData.animalList.add(new Animal("กระต่าย (Rabbit)", R.drawable.rabbit));
        animalData.animalList.add(new Animal("เพนกวิน (Penguin)", R.drawable.penguin));
        animalData.animalList.add(new Animal("เสือ (Tiger)", R.drawable.tiger));
        animalData.animalList.add(new Animal("หมู (Pig)", R.drawable.pig));
        animalData.animalList.add(new Animal("สิงโต (Lion)", R.drawable.lion));

        AnimalListAdapter adapter = new AnimalListAdapter(
                this,
                R.layout.item,
                animalData.animalList
        );
        mlistView.setAdapter(adapter);
        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Animal animal = animalData.animalList.get(i);
                Toast.makeText(MainActivity.this, animal.name, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, AnimalDetailsActivity.class);
             //   intent.putExtra("name",animal.name);
               // intent.putExtra("picture",animal.picture);
                intent.putExtra("position", i);
                startActivity(intent);
            }
        });
    }
}
