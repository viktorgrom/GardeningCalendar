package com.molfar.gardeningcalendar.month;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.molfar.gardeningcalendar.MonthDetailModel;
import com.molfar.gardeningcalendar.R;
import com.molfar.gardeningcalendar.RecyclerviewAdapter;

import java.util.ArrayList;
import java.util.List;

public class SeptemberActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_september3);

        List<MonthDetailModel> mlist = new ArrayList<>();
        mlist.add(new MonthDetailModel("Газон", "У вересні окрім стрижки газону можна внести осінні комплексні добрива з меншим вмісто азоту, а з більшою консентрацією калію, фосфору, магнію. Також, можна провести проколювання грунту на газоні адже від постійного поливу він ущільнюється і зменшується пористість, що погіршує постачання поживних речовин, ріст трави!",R.drawable.img_lower));
        mlist.add(new MonthDetailModel("Квіти", "В вересні в квітниках особливого догляду потребують, астри портулак, хризантеми, рудбеківя для них потрібна прополка, рихлення грунту, полив в суху погоду. В цей період можна проводити пересадку багаторічників. У багатьох багаторічників, на п'ятий рік життя утворюються слабкі стебла, дрібнішають квіти, з'являються захворювання, тому що кожен рік закладаються нові бруньки, наростають кореневища і коріння, що заважають один одному. Більшість квітів-багаторічників - це великі рослини, і з роками грунт під ними все більш виснажується.",R.drawable.flower));
        mlist.add(new MonthDetailModel("Чагарники", "В цей період року проводиться обрізка, підстригання, очистка хвойних рослин від сухої хвої. Внесення комплексного осіннього добрива, обробка від шкідників та хвороб, можна зробити бакову суміш \"хорусу\" та \"актари\".",R.drawable.shrub2));
        mlist.add(new MonthDetailModel("Дерева","У цей період рекомендується зняти ловчі пояси з дерев і прибрати все, що залишилися на землі або гнилі плоди.\n" +
                "Внесіть добрива під кущі та дерева.\n" +
                "Великі (особливо плодоносні) рослини і грунт під ними виснажилися за сезон, а значить, запас поживних речовин потрібно терміново поповнювати. Восени в грунт не вносять азотні добрива, щоб не провокувати зростання листя і пагонів, а роблять упор на калійні та фосфорні. Вам підійдуть мінеральні комплекси з позначкою \"осіннє\", зола, суперфосфат, сірчанокислий і хлористий калій.Внесіть добрива під кущі та дерева.\n" +
                "Обробіть сад від шкідників.\n" +
                "До того, як листя опаде з дерев і кущів, а зимуючі комахи сховаються в грунт, сад потрібно обробити інсектицидами. Вам підійдуть Актара, Інта-Вир або їх аналоги. Не варто відкладати обробку на жовтень - шкідники вже підуть глибоко в землю. Крім того, після листопаду обприскувати дерева потрібно буде вже іншими засобами.",R.drawable.tree3));
        mlist.add(new MonthDetailModel("Овочеві культури", "Якщо ви садили на городі кольорову капусту і брокколі, пора неприбрані рослини відправляти на дорощування: їх прикопують в теплиці або підвал, розміщуючи на 1 кв. метрі по 30-40 штук. Для дорощування необхідно, щоб середньодобова температура трималася в межах +7 … + 11градусів. Слід завершити збирання коренеплодів і закласти їх на зимове зберігання.\n" +
                " А ось культури, що йдуть на вигонку зелені взимку, пора заготовлювати: викопують в городі і прикопують в горщиках або ящиках петрушку, щавель, ревінь, мангольд, селера, шніт-цибуля, батун, цікорний салат (витлуф). Зелень з таких рослин обрізають, ящики з ними тримають при температурі від 0 до +2 C.\n" +
                "Забирають пізню білокачанну капусту. Наводять лад на звільнених грядках, згрібають залишки гички і рослинного сміття, проводять осінню перекопування грунту, при необхідності вносять добрива. Пам'ятайте, що восени рекомендується застосовувати калійні і фосфорні добрива або спеціальні збалансовані осінні склади.",R.drawable.vegetables));
        mlist.add(new MonthDetailModel("Кімнатні рослини", "Протягом осені потреба рослин у воді буде поступово зменшуватися. Тому полив потрібно буде поступово скорочувати, допускаючи навіть періоди повного його припинення. Крім того, завжди слід уникати попадання води на листя - це може викликати появу грибкових захворювань. Підживлення рослини добривами також буде поступово скорочуватися, перевагу бажано віддавати препаратам з невисоким вмістом азоту, але достатньою кількістю калію (він посприяє зміцненню рослинних тканин і зробить їх більш стійкими до атак шкідників, особливо частим в осінній період).\n" +
                "Початок вересня - відмінний час для розмноження герані. Для цього підійдуть живці з чистою лінією відрізу, міцні, взяті, як правило, з центральної і найвищій частині рослини або біля основи. Зрізані живці залишають підсохнути (але тільки не на сонці!) На 24 години. Вкорінені рослини пересаджують в окремі горщики, в яких їм належить зимувати в добре освітленому приміщенні при температурі 10-14 С.Кактуси і сукуленти можуть залишатися в одних і тих же горщиках протягом багатьох років. Однак коли рослина досягне таких значних розмірів, що виникне ризик того, що горщик може перевернутися від його тяжкості, або ж воно перестане поміщатися в ньому, настає час для його пересадки.",R.drawable.plants));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.rv_main);
        RecyclerviewAdapter myAdapter = new RecyclerviewAdapter(this, mlist);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(myAdapter);
    }
}