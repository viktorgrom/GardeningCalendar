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

public class MayActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_may3);

        List<MonthDetailModel> mlist = new ArrayList<>();
        mlist.add(new MonthDetailModel("Газон", "Травень це період активного росту трави, тому на початку травня потрібно запустити систему поливу, потрібно провести першу стрижку трави. Якщо у вас ще нема газону, саме час його створити, зверніть увагу на підбір насіння: воно має бути якісне краще німецького виробництва, і підходити Вашим грунтово кліматичним умовам.",R.drawable.img_lower));
        mlist.add(new MonthDetailModel("Квіти", "В травні можна висівати у відкритий грунт однорічні квіти. В цей част можна висаджувати у відкритий грунт розсаду яку ми посіяли взимку. Також, можна розділити і пересадити багаторічники, провести прибирання в клумбах. В цей період розпочинається активний ріст бур'яну, тому потрібно з ним боротись як мехенічно тобто ручним прополуванням, так і гербіцидами . Якщо нема дощу клумби потрібно поливати.",R.drawable.flower));
        mlist.add(new MonthDetailModel("Чагарники", "Після цвітяння потрібно обробити інсектицидом \"Енжіо\". Обкопати навколо кущів для пористості грунту та замульчувати лунки. Внести комплексні добрива. Якщо в травні буде висока вологість можна обробити фенгіцидом \"скор\". Поки не зав'язались плоди.",R.drawable.shrub2));
        mlist.add(new MonthDetailModel("Дерева","В травні потрібно внести весняні комплексні добрива для кращого росту рослин. Після цвітяння потрібно обробити інсектицидом \"Енжіо\". Обкопати навколо дерев для пористості грунту та замульчувати лунки. \nМожна підстригти хвойні рослини. Якщо міжряддя саду знаходяться під задернінням, відразу після цвітіння і потім через 2 тижні підгодуйте плодові дерева розчином сечовини (40–50 г на 10 л води), витрачаючи по відру на два–три дорослих дерева. Регулярно викошуйте траву, залишайте її на місці. На піщаних і торф'яних ґрунтах внесіть разом з азотом і калій з розрахунку 9–12 г аміачної селітри і 8–10 г хлористого калію на 1 м2 пристовбурного кола. Сіянці, зимові та весняні щеплення після рясного поливу, підгодуйте розчином гною (1 частина коров'яку на 10 частин води) або пташиного посліду (1: 20).",R.drawable.tree3));
        mlist.add(new MonthDetailModel("Овочеві культури", "Продовжуємо посіви: у відкритий грунт висівають горох, боби, петрушку, коріандр, салат, редис, ріпу і літню редьку, буряк, морква, шпинат. Не забуваємо при цьому про сівозміну і сумісність рослин на грядці. Висаджуємо в грунт розсаду ранньої капусти (з 5-6 листям), а ось з висадкою розсади теплолюбних культур - перцю, баклажанів і томатів - краще не поспішати, поки не встановиться стабільна тепло. Підібрати вірні терміни допоможе стаття Коли висаджувати овочеву розсаду в грунт і в теплиці.До речі, поки посіви не завершені, можна ще щось змінити в городі - наприклад, спорудити теплі грядки, урізноманітнити їх зовні, зробити більш зручними і практичними.\n" +
                "Початок травня - пора боротьби з шкідниками, які вже починають свою руйнівну діяльність, для бородьби з ними можна використати \"актару\".",R.drawable.vegetables));
        mlist.add(new MonthDetailModel("Кімнатні рослини", "В цей період є можливість винести кімнатні рослини на вулицю тому поливають кімнатні рясно в травні рано вранці, при необхідності - другий раз ввечері, так як на вулиці субстрат в горщиках висихає швидше, ніж в кімнаті. Листя і стебла періодично обмивають водою з лійки або обприскують з пульверизатора - чисті рослини в меншій мірі піддаються нападу шкідників.\n" +
                "Пересаджувати рослини в свіжу грунт не пізно і в травні.\n" +
                "Рослини захищають від сонячних променів, поливають помірно, щодня обприскують, поки не відновляться (не почнуть працювати) коріння (на це йде приблизно два тижні).",R.drawable.plants));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.rv_main);
        RecyclerviewAdapter myAdapter = new RecyclerviewAdapter(this, mlist);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(myAdapter);
    }
}