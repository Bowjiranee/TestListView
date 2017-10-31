package com.example.user.testlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.testlistview.model.Animal;

public class AnimalDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_details);

        ImageView animalImageView = (ImageView) findViewById(R.id.animal_image_view);
        TextView nameTextView = (TextView) findViewById(R.id.name_text_view);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position",0);

        AnimalData animalData = AnimalData.getInstance();
        Animal animal = animalData.animalList.get(position);

        String s = "";
        if(animal.name == "แมว (Cat)"){
            s = getString(R.string.details_cat);
        }if(animal.name == "หมา (Dog)"){
            s = getString(R.string.details_dog);
        }if(animal.name == "โลมา (Dolphin)"){
            s = getString(R.string.details_dolphin);
        }if(animal.name == "นกฮูก (Owl)"){
            s = getString(R.string.details_owl);
        }if(animal.name == "โคอาลา (Koala)"){
            s = getString(R.string.details_koala);
        }if(animal.name == "กระต่าย (Rabbit)"){
            s = getString(R.string.details_rabbit);
        }if(animal.name == "เพนกวิน (Penguin)"){
            s = getString(R.string.details_penguin);
        }if(animal.name == "เสือ (Tiger)"){
            s = getString(R.string.details_tiger);
        }if(animal.name == "สิงโต (Lion)"){
            s = getString(R.string.details_lion);
        }if(animal.name == "หมู (Pig)"){
            s = getString(R.string.details_pig);
        }

        nameTextView.setText(s);
        animalImageView.setImageResource(animal.picture);

        getSupportActionBar().setTitle(animal.name);



    }
}
