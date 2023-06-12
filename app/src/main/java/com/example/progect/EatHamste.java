package com.example.progect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class EatHamste extends AppCompatActivity {
    private String[] arrayList = {"Чем кормить хомяка\n" +
            "Специализированные гранулированные корма насытят хомяка и дадут ему максимум питательных веществ и витаминов. Маленьким грызунам требуется 1/8-1/3 миски гранул в день.\n" +
            "\n" +
            "В рацион маленьких грызунов также могут входить фрукты и овощи, но они не должны составлять основу диеты. Хомяки любят:\n" +
            "- зелень\n" +
            "- семена\n" +
            "- морковь\n" +
            "- яблоки\n" +
            "- изюм\n" +
            "- горох\n" +
            "- перец\n" +
            "- огурцы\n" +
            "\n" +
            "Резкие изменения в питании могут привести к расстройству кишечника или диареи, и даже смерти. Поэтому добавляйте новые продукты в рацион хомяка постепенно, один вид за раз.\n" +
            "\n" +
            "Не перекармливайте хомяков, они любят запасать. Всегда следите, чтобы в поилке была свежая чистая вода. Идеально подойдут вертикальные поилки для грызунов со стеклянным или металлическим носиком.\n" +
            "\n" +
            "Противопоказаны хомякам молочные продукты, хлеб и другие человеческие блюда: они вызывают сильный запор или диарею, которые могут привести к печальным последствиям.\n" +
            "\n" +
            "Список запрещенных продуктов: картофель, капуста, лук, чеснок, щавель, мята, макароны, сухие завтраки и мюсли, арбуз, цитрусовые, экзотические фрукты, грибы, желуди, красная фасоль, ветки хвойных деревьев, косточки абрикоса, персика, сливы, вишни, мед."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_hamste);
        ListView List = findViewById(R.id.List);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        List.setAdapter(adapter);
        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HamsterActivity.class);
                startActivity(intent);
            }
        });
    }
}