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
        mlist.add(new MonthDetailModel("Газон", "Травень це період активного росту трави, тому на початку травня потрібно запустити систему поливу, потрібно провести першу стрижку трави при відростанні на висоту 8-10 см проведіть покіс, залишаючи 5-6 см і обов'язково газонокосаркою з травозбірником. Не залишайте рослинні залишки на поверхні - це може привести до загнивання, і не косіть занадто низько - дайте газону відновитися після зими. Якщо після фертикуляции в квітні змін на краще не спостерігається, а після внесення підгодівлі і першого укосу трава як і раніше уражена, то виникає необхідність проведення радикальних заходів по оздоровленню газону. Проведіть максимально низьке скошування на ураженій ділянці. Глибоко, до 15 - 20 см, розпушите верхній шар грунту (бажано перекопати з оборотом пласта). Дайте грунту відпочити і через 7-10 днів проведіть посів тієї ж травосуміші. При необхідності термінового ремонту газону використайте швидко відростаючі травосуміші. Якщо у вас ще нема газону, саме час його створити, зверніть увагу на підбір насіння: воно має бути якісне краще німецького виробництва, і повинно підходити Вашим грунтово кліматичним умовам.",R.drawable.img_lower));
        mlist.add(new MonthDetailModel("Квіти", "В травні можна висівати у відкритий грунт однорічні квіти. В цей част можна висаджувати у відкритий грунт розсаду яку ми посіяли взимку. Також, можна розділити і пересадити багаторічники, провести прибирання в клумбах. В цей період розпочинається активний ріст бур'яну, тому потрібно з ним боротись як мехенічно тобто ручним прополуванням, так і гербіцидами. Якщо нема дощу клумби потрібно поливати. З початку травня можна сіяти насіння волошки, календули, ешшольції, космеї, резеди, декоративних маків. З другої половини травня можна сіяти такі квіти як цинія, настурція, чорнобривці, лаватера. В кінці травня настає слушний час для посіву дворічних квітів і багаторічних квітів. Це насіння краще не садити на постійне місце, а висадити на окрему грядочку, а після сходів і появи 2-3 справжніх листочків вже пересадити на їх майбутнє місце в квітнику. Так висаджують віолу, маргаритки, незабудку, гвоздику турецьку, дзвоник середній, наперстянку. У наступні роки дворічники будуть давати самосів, тому у вас навесні будуть маленькі рослинки, які в травні добре буде розсаджувати на нові клумби. На жаль, в перше літо ці рослини дадуть тільки поодинокі квіточки, зате вже в наступному році вони будуть рясно цвісти все літо. Чорнобривці – всім відомий і багатьма дуже улюблений однорічник. При посіві у відкритий грунт зацвіте в липні. Календула – просто чемпіон по невибагливості серед квітів. Волошка – двухрічна рослина, сіяти її потрібно в травні, але зацвіте вона тільки наступного літа. Агератум – багаторічна рослина, яка цвіте з червня до самих заморозків. Його пухнасті суцвіття можуть бути найрізноманітніших забарвлень – рожеві, блакитні, сині, фіолетові, білі. Гвоздика турецька – дворічна рослина квітами білого, рожевого, або червоного забарвлення, сіється насінням в кінці травня. Геленіум – ще один невибагливий багаторічник. Це чудові жовто-червоні «ромашки», квітучі все літо. Люпин – зараз виведено багато сортів з красивим забарвленням квіток – білий, рожевий, і блакитний. Але, на жаль, при самосіві в подальшому втрачає цей сортовий колір і сіянці наступного року будуть з синіми квіточками. Маргаритка – теж всім знайома улюблениця багатьох садівників. Просто приголомшливо невибаглива рослина.",R.drawable.flower));
        mlist.add(new MonthDetailModel("Чагарники", "Після цвітяння потрібно обробити інсектицидом \"Енжіо\", обкопати навколо кущів для пористості грунту та замульчувати лунки. Внести комплексні добрива. Якщо в травні буде висока вологість можна обробити фунгіцидом \"скор\". Поки не зав'язались плоди. В кінці травня - початку червня наріжте живці: еластичні зелені пагони повинні бути середньої довжини (6-15 см) і мати по кілька листів кожен. Нижній зріз робіть на 1-1,5 см нижче нирки, так, щоб діагональний зріз був спрямований у бік, протилежний вічка. Верхній зріз повинен розташовуватися над ниркою. Видаліть 1-2 нижніх листа, а верхні обріжте наполовину. Потім нижню частину черешків обробіть препаратом, що стимулює коренеутворення: замочіть на 10-12 годин в розчині гетероауксину (2 таблетки розведіть в 1 л гарячої води, потім остудіть розчин і занурте живці на 1/3 висоти). Контейнер наповніть піском або легким ґрунтом і висадіть живці під кутом 30 градусів. Регулярно зволожуйте грунт.",R.drawable.shrub2));
        mlist.add(new MonthDetailModel("Дерева","В якщо ви не зробили це раніше то в травні потрібно внести весняні комплексні добрива для кращого росту рослин. У травні вже добре видно замерзлі взимку пагони, їх потрібно постаратися обрізати до початку цвітіння, а зрізи діаметром більше 1 см ретельно замазують садовим варом. Після цвітяння потрібно обробити інсектицидом \"Енжіо\".Під час цвітінь часто бувають нічні зворотні весняні заморозки, які згубно впливають на квітки, так як вже при температурі -1,7 С маточки і тичинки квіток гинуть. Тоді проводять димлення, використовуючи завчасно заготовлені купки соломи або сухого листя, розкладіть їх рівномірно по ділянці і в нічні години проводьте димлення. Воно допоможе підвищити температуру повітря на 1-2 градуси. Можна обкопати навколо дерев для пористості грунту та замульчувати лунки. Потрібно підстригти хвойні рослини. Якщо міжряддя саду знаходяться під задернінням, відразу після цвітіння і потім через 2 тижні підгодуйте плодові дерева розчином сечовини (40–50 г на 10 л води), витрачаючи по відру на два–три дорослих дерева. Регулярно викошуйте траву, залишайте її на місці. На піщаних і торф'яних ґрунтах внесіть разом з азотом і калій з розрахунку 9–12 г аміачної селітри і 8–10 г хлористого калію на 1 м2 пристовбурного кола. Саджанці зимового та весняного щеплення після рясного поливу, підгодуйте розчином гною (1 частина коров'яку на 10 частин води) або пташиного посліду (1: 20). Якщо стоїть суха погода, то слід обов'язково поливати і рихлити ґрунт на новосадках і посівних грядках, а при дуже жаркій погоді - в пристовбурних кругах у дорослих рослин. Для зручності цієї операції можна зробити наступне. Взяти металеву стрічку шириною 15 см і довжиною близько 2 м (або декоративну пластикову), рівномірно обігнути нею пристовбурні кола і злегка заглибити в грунту. В період інтенсивного сокоруху на стовбурах дерев спостерігається розтріскування живої кори під тиском внутрішніх тканин,що розростаються і викликаного цим виділенням соку. Такі глибокі поздовжні тріщини спостерігаються як на молодих деревах, саджанцях та щеплення, так і на плодоносних деревах. Для їх попередження зробіть борознування кори на штамбі та скелетних гілках - садовим ножем проведіть по корі суцільні борозенки в 2-3 місцях по колу штамба. При покупці сортів плодово-ягідних рослин в першу чергу звертають увагу на стійкість до найбільш шкідливим об'єктів, боротьба з якими часто складна: наприклад, до парші яблуні та груші осінньо-зимових сортів. Надлишок зав'язей на плодових молодих деревах знижує якість врожаю. Плодові культури самі скидають зайві зав'язі, на дозрівання плодів з яких у них не вистачає сил. Зазвичай масове опадання зав'язей трапляється в червні, тому краще заздалегідь оглянути яблуні та груші. Якщо садівник виявляє, що зав'язей залишається ще дуже багато, доцільно прорідити їх вручну. На думку фахівців, у великоплідних сортів яблуні та груші краще залишити зовсім невелика кількість плодів, тоді вони будуть більш високої якості. У дрібноплідних культур, наприклад, у сливи, плодів залишають набагато більше.",R.drawable.tree3));
        mlist.add(new MonthDetailModel("Овочеві культури", "Продовжуємо посіви: у відкритий грунт висівають горох, боби, петрушку, коріандр, салат, редис, ріпу і літню редьку, буряк, морква, шпинат. Не забуваємо при цьому про сівозміну і сумісність рослин на грядці. Висаджуємо в грунт розсаду ранньої капусти (з 5-6 листям), а ось з висадкою розсади теплолюбних культур - перцю, баклажанів і томатів - краще не поспішати, поки не встановиться стабільна тепло. Підібрати вірні терміни допоможе стаття Коли висаджувати овочеву розсаду в грунт і в теплиці. До речі, поки посіви не завершені, можна ще щось змінити в городі - наприклад, спорудити теплі грядки, урізноманітнити їх зовні, зробити більш зручними і практичними.\n" +
                "Початок травня - пора боротьби з шкідниками, які вже починають свою руйнівну діяльність, для бородьби з ними можна використати \"актару\".",R.drawable.vegetables));
        mlist.add(new MonthDetailModel("Кімнатні рослини", "В цей період є можливість винести кімнатні рослини на вулицю тому поливають кімнатні рясно в травні рано вранці, при необхідності - другий раз ввечері, так як на вулиці субстрат в горщиках висихає швидше, ніж в кімнаті. Листя і стебла періодично обмивають водою з лійки або обприскують з пульверизатора - чисті рослини в меншій мірі піддаються нападу шкідників.\n" +
                "Пересаджувати рослини в свіжу грунт не пізно і в травні.\n" +
                "Рослини захищають від сонячних променів, поливають помірно, щодня обприскують, поки не відновляться (не почнуть працювати) корені (на це йде приблизно два тижні).",R.drawable.plants));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.rv_main);
        RecyclerviewAdapter myAdapter = new RecyclerviewAdapter(this, mlist);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(myAdapter);
    }
}