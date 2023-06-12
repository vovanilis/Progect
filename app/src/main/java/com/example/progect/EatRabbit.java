package com.example.progect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class EatRabbit extends AppCompatActivity {
    private String[] arrayList = {"Питание\n" +
            "Кролики - травоядные животные, именно поэтому 80% рациона должно состоять из сена или свежей травы. Помимо этого их желудочно кишечный тракт нуждается в постоянной обеспечении бактерий клетчаткой, так как именно они расщепляют пищу. Кролик постоянно жуёт. В этом есть большая необходимость из-за беспрерывного роста зубов.\n" +
            "\n" +
            "Это может быть неограниченное количество сена, меньшее количество листовых зеленых овощей, в том числе салат ромэн, ботву моркови, эндивий, базилик, капусту,  радиккио, ростки пшеницы, кабачки, брюссельскую капусту, также петрушка, одуванчик и стручки гороха (не насыпной).\n" +
            "\n" +
            "Хотя сено люцерны подходит для молодых растущих кроликов, а также беременных или кормящих кроликов, сено из люцерны обычно не рекомендуется взрослым кроликам по мере приближения к годовалому возрасту, поскольку в нем слишком много кальция и калорий.\n" +
            "\n" +
            "Чтобы кролики получали все необходимые им микроэлементы, им следует давать ограниченное количество кроличьих гранул (комбикорма) на основе  сена с высоким содержанием клетчатки  (не более ½ стакана на 4-5 фунтов веса кролика в день). Стоит помнить, что чрезмерное количество гранул может привести к диарее или ожирению.\n" +
            "\n" +
            "Кролики не способны на переваривания продуктов с высоким содержанием жира: орехи, семечки и зёрна. При проглатывании эти продукты могут вызвать расстройство желудочно-кишечного тракта и увеличение веса.\n" +
            "\n" +
            "Сладкие овощи и фрукты нужно давать в небольших и ограниченных количествах, лучше всего в формате лакомства. Потому что если включить в постоянный рацион это может привести к сахарному диабету. К таким продуктам относятся: яблоко, груша, слива, персик, морковь.\n" +
            "\n" +
            "Кроликам также следует ежедневно давать свежую желательно фильтрованную воду как в бутылочке, так и в миске, поскольку разные кролики предпочитают методы питья."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_rabbit);
        ListView List = findViewById(R.id.List);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        List.setAdapter(adapter);
        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RabbitActivity.class);
                startActivity(intent);
            }
        });
    }
}