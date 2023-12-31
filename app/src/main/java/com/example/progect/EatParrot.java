package com.example.progect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class EatParrot extends AppCompatActivity {
    private String[] arrayList = {"Питание попугаев\n" +
            "\n" +
            " Качественное, сбалансированное питание составляет основу правильного ухода и содержания попугая. Это напрямую влияет на состояние его здоровья и продолжительность жизни.\n" +
            " У этих пернатых температура тела больше, чем у людей, потому у них более быстрый обмен веществ, особенно это касается маленьких видов попугаев. Не стоит делать слишком большие промежутки между едой.\n" +
            " Однако нельзя и закармливать — многие пернатые склонны к ожирению, потому корм должен даваться в небольших количествах. Тем более, если в кормушке будет лежать слишком много корма, попугай смешает его с шелухой и не сможет находить зерна.\n" +
            " Кормят птиц дважды в день. Попугаи, в основном, зерноядные питомцы, потому основу их рациона составляют зерновые смеси, куда входят:\n" +
            " овес;\n" +
            " различные виды проса;\n" +
            " канареечное, льняное и конопляное семя;\n" +
            " кунжут;\n" +
            " семена дикорастущих трав;\n" +
            " в небольших количествах можно давать сырые семечки подсолнечника.\n" +
            " Если вы покупаете готовые зерносмеси в магазинах, нужно позаботиться об их качестве. Лучше выбирайте продукт в прозрачной упаковке, чтобы визуально отметить, нет ли в нем плесени, потемневших зерен. Потом попробуйте прорастить это зерно: залейте небольшое количество теплой водой и подержите в тепле пару дней. Качественное зерно за это время должно прорасти.\n" +
            " Обязательно каждый день попугаи должны получать влажный корм — свежие овощи, фрукты, ягоды, зелень:\n" +
            " морковь, капусту, кабачки, свеклу, тыкву, сладкий перец, кукурузу, зеленый горошек, огурцы (сезонные, не покупные), репу, фасоль, помидоры;\n" +
            " яблоки, абрикосы, сливы, груши, виноград, цитрусовые, бананы, дыню, гранаты, киви, персики, ананасы (изредка и понемногу);\n" +
            " клубнику, смородину, арбузы, вишни, малину, землянику, черешню, клюкву, бруснику, шиповник, облепиху;\n" +
            " листья салата, шпинат, свекольную и морковную ботву, клевер, листья одуванчиков и подорожника, ошпаренные кипятком листья крапивы, виноградную лозу, побеги и молодые веточки кустарников и фруктовых деревьев.\n" +
            " Влажный корм не должен лежать в кормушке целый день. Через 4 часа он уже должен убираться. Некоторые фрукты и овощи нужно будет очищать от кожуры, некоторые разрезать на ломтики или кусочки. Все продукты должны быть чистыми, свежими, недопустимо кормить попугая подпорченной едой.\n" +
            " Разрешенные для птиц ветки деревьев и кустарников:\n" +
            " березовые, липовые, кленовые, каштановые, ольховые, ясеневые, буковые, вербовые;\n" +
            " сливовые, вишневые, рябиновые, грушевые, цитрусовые;\n" +
            " смородиновые, малиновые, калиновые, веточки орешника и боярышника.\n" +
            " Не чаще одного-двух раз в неделю попугаям можно давать проростки пшеницы и овса, немного орехов, нежирного творога, вареных куриных яиц.\n" +
            " Под запретом для попугаев такие продукты:\n" +
            " пряные травы и острые продукты (петрушка, кинза, чеснок, лук, сельдерей, укроп, редис, редька);\n" +
            " баклажаны;\n" +
            " хурма, манго, авокадо, папайя;\n" +
            " ветки черемухи, сирени, дуба, бузины, акации, тополя и хвойных деревьев;\n" +
            " еда с человеческого стола (сахар, соль, жирные и жареные продукты, колбасы, чипсы, кофе, шоколад, алкоголь и т.п.).\n" +
            " Качественный уход за попугаем предполагает регулярную подпитку витаминами и минералами, особенно в период линьки, болезни или гнездования.\n" +
            " Минеральные подкормки улучшают состояние костей, перьев, клюва, нормализуют работу пищеварения, а также улучшают яйценоскость и помогают воспитать здоровое потомство. К таким подкормкам относятся: песок, скорлупа яиц, березовый (древесный) уголь, глюконат кальция (1 таблетка в день), костная мука, мел.\n" +
            " Витамины можно покупать в специализированной аптеке (ветеринарный врач порекомендует какие), либо можно капать в воду прямо в поилку (в 100 мл) две-три капли сока лимона или три-четыре капли жидкого меда.\n" +
            " Правильное содержание попугаев предполагает постоянное наличие свежей воды в поильнике. Воду лучше всего давать сырую отстоянную, не кипяченую. Во время болезней попугаев отпаивают детской бутилированной водой, еще подойдет фильтрованная."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_parrot);
        ListView List = findViewById(R.id.List);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        List.setAdapter(adapter);
        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ParrotActivity.class);
                startActivity(intent);
            }
        });
    }
}