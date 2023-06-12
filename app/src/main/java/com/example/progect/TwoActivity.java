package com.example.progect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Button dog = findViewById(R.id.dog);
        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DogActivity.class);
                startActivity(intent);
            }
        });
        Button cat = findViewById(R.id.cat);
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CatActivity.class);
                startActivity(intent);
            }
        });
        Button snake = findViewById(R.id.snake);
        snake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SnakeActivity.class);
                startActivity(intent);
            }
        });
        Button hamster = findViewById(R.id.hamster);
        hamster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HamsterActivity.class);
                startActivity(intent);
            }
        });
        Button parrot = findViewById(R.id.parrot);
        parrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ParrotActivity.class);
                startActivity(intent);
            }
        });
        Button lizard = findViewById(R.id.lizard);
        lizard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LizardActivity.class);
                startActivity(intent);
            }
        });
        Button rabbit = findViewById(R.id.rabbit);
        rabbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RabbitActivity.class);
                startActivity(intent);
            }
        });


    }
}