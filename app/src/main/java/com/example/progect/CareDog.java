package com.example.progect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class CareDog extends AppCompatActivity {

    private String[] arrayList = {"Уход\n"+
            "Квартира\n" +
            "Многоквартирный дом – не лучшее место для собак крупных пород. Для содержания в квартире лучше всего выбирать уравновешенных собак среднего размера, вам подойдут породы:\n" +
            "\n" +
            " пудель;\n" +
            " такса;\n" +
            " французский бульдог;\n" +
            " померанский шпиц;\n" +
            " йоркширский терьер.\n" +
            "Они отличаются небольшим размером и не нуждаются в большом пространстве для своей активности. Отдавайте предпочтение тихим породам, которые не станут лишний раз тревожить соседей, и не оставляйте их одних в квартире надолго.\n" +
            "\n" +
            "Убирайте все хрупкие предметы подальше, не оставляйте мелкие вещи на полу, прячьте бытовую химию, острые предметы, лекарства. Некоторые растения ядовиты для собак, поэтому лучше их разместить на возвышении. Если дома живет щенок или гиперактивный питомец, заклейте острые углы.\n" +
            "Частный дом"+"\n" +
            "Если вы живете в частном секторе и планируете держать питомца в доме, воспользуйтесь вышеприведенной информацией. Также ваша задача позаботиться о том, чтобы пес не мог убежать с участка (перепрыгнуть или разломать забор).\n" +
            "\n" +
            "Для содержания в частном доме подойдут такие породы:\n" +
            "\n" +
            "итальянский мастиф;\n" +
            " доберман;\n" +
            " немецкая овчарка;\n" +
            " московская сторожевая;\n" +
            " алабай.\n" +
            "Если вы планируете держать собаку на улице, помните, что она не может сидеть на привязи все время. Вы обязаны заботиться о ее регулярном выгуле, чтобы питомец мог размять конечности, порезвиться, эмоционально отдохнуть и пообщаться с вами. Более того – вы должны сделать вольер и теплую будку. Если не позаботиться об этом, пес будет страдать от непогоды и холода и может заболеть.\n"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_care_dog);
        ListView List = findViewById(R.id.List);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        List.setAdapter(adapter);

        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DogActivity.class);
                startActivity(intent);
            }
        });
    }
}