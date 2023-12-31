package com.example.progect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class CareRabbit extends AppCompatActivity {
    private String[] arrayList = {"Место для обитания\n" +
            "\n" +
            "Как и большинству домашних животных, кроликам требуются особые условия для проживания. Такие питомцы любят простор и свободу, поэтому клетка должна быть крупных размеров, лучшего всего около 1 м2, высота должна позволять колику встать на задние лапы. Поддон клетки должен быть сплошным. Кролики не умеют комфортно передвигаться по решетчатым поддонам.\n" +
            "\n" +
            "\n" +
            "Также они не нуждаются в уличных прогулках, но частые выходы по дому - это необходимость. Как и все живые существа должны двигаться для правильного обмена веществ и здорового состояния организма. В идеале животному нужно выделить комнату или огородить место в помещении, которое можно исследовать.\n" +
            "\n" +
            "Но выпускать кролика без присмотра - плохая идея, в том случае если вы переживаете за свою дорогую мебель или повреждение проводов, которые могут нанести вред и питомцу (удар током может привести к смерти).\n" +
            "\n" +
            "Содержимое клетки:\n" +
            "\n" +
            "внутренний домик служит для кролика дополнительным защитным укрытием, где он всегда может спрятаться, если его что-то напугало. Лучше всего выбирать натуральные материалы, например, дерево.\n" +
            "кормушка, чтобы кролик ее не переворачивал, можно купить керамическую емкость или металлическую навесную кормушку.\n" +
            "поилка, обратите внимание на стеклянные поилки капельного типа. Кроликам лучше давать фильтрованную воду, ежедневно ее меняя, и время от времени стерилизуя поилку.\n" +
            "лоток для похода в туалет, декоративные кролики чистюли и быстро приучаются к определённому месту для похода в туалет. Но если в лотке не убрано, животные будут искать другое.\n" +
            "предметы для гигиены, камень из минеральной породы и специальные древесные палочки помогут стачивать резцы кроликам. Зубы постоянно растут, если их во время не стачивать, придётся ходить на стачивание к ветеринару.\n" +
            "игрушки, кролики очень социальны, требуют к себе много внимания, могут тосковать и даже заболеть от одиночества, поэтому не жалейте игрушек и своего времени для них.\n" +
            "наполнитель для клетки, лучше всего покрывать дно клетки опилками или соломой.\n" +
            "Кролики не любят резкие перепады температур, поэтому при проветривании комнаты лучше забрать кролика с собой. Также прямые лучи солнца могут нанести тепловой удар, следите за тем, чтобы они не попадали на животного. Также клетка должна находится в дали от входных дверей, кондиционера, батареи или обогревателя. Лучше всего температура 18-25 градусов по Цельсию. Кролики не пахнут при правильном уходе, если во время убирать клетку.\n",
            "Гигиена и уход\n" +
                    "\n" +
                    "Кролики очень чистоплотны сами по себе, поэтому не нуждаются в купании. Тем более водные процедуры могут принести вред, а именно переохлаждение и после болезнь. Мыть только в случае, если животное сильно испачкалось из-за несварения, только загрязнённых зону, без использования шампуней и попадания воды в уши и на голову. Вода чуть выше комнатной температуры и не в коем случае не сушить феном.\n" +
                    "\n" +
                    "Шерсть кролика должна ежедневно вычёсываться с помощью специальных расчёсок. Особенно актуально для длинношерстных пород, если этого не делать, то со временем шерсть начёт сбиваться в комки. Лучше всего это делать 1-2 раза в неделю.\n" +
                    "\n" +
                    "Ещё одна важная вещь - уход за когтями декоративных кроликов. Если не делать подстрижку вовремя, произойдет следующее:\n" +
                    "\n" +
                    "пальцы животного вывернутся из-за дискомфорта при ходьбе. Они останутся в таком положении даже после стрижки;\n" +
                    "осанка деформируется, так как нагрузка на тело распределяется неправильно;\n" +
                    "коготь может вырваться после того, как за что-либо зацепиться.\n" +
                    "Для подстрижки используют либо когтерезку, либо обычные педикюрные кусачки. Первую подстрижку нужно сделать в возрасте 1,5-2 месяцев. В дальнейшем рекомендуется проводить процедуру каждые 3-4 недели. Ее можно проводить собственноручно или отводить питомца к ветеринару. Подстрижка проводится быстро и стоит немного.\n" +
                    "\n" +
                    "Зубы всех кроликов — как передние, так и задние — растут непрерывно. Таким образом, важно, чтобы у них было неограниченное количество сена, а также безопасные игрушки для кроликов, такие как твердые деревянные бруски и палки (например, имеющиеся в продаже ветки яблони), которые можно жевать, чтобы стачивать зубы.\n" +
                    "\n" +
                    "Если кролики не снабжены безопасными предметами для жевания, они будут грызть мебель, молдинги, дверные рамы, ковры, пол, провода и другие неподходящие предметы. Таким образом, кролики должны находиться под постоянным присмотром, когда они находятся вне клеток, и все области, к которым они имеют доступ, должны быть заранее защищены от кроликов.\n" +
                    "\n" +
                    "Приучить к лотку такого питомца можно буквально за неделю. Причем, если он свободно ходит по дому, пойти сходить в туалет в клетку для него не проблема. Менять кролику туалет не обязательно каждый день. Если купить хороший наполнитель, его хватает 3-4 дня."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_care_rabbit);
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