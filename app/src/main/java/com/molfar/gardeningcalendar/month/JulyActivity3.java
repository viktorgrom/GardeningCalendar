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

public class JulyActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_july3);

        List<MonthDetailModel> mlist = new ArrayList<>();
        mlist.add(new MonthDetailModel("Газон", "В липні догляд суттєво не відрізняється від червня, активний полив, але дивіться щоб не було перезволоження, можна внести ще азотних добрив якщо ваша трава слабко росте! Стрижка на рівні 6–7 см для захисту від спеки молодих паростків. Якщо ви побачили ознаки грибкових хвороб то обприскайте газон фунгіцидом «фундазол». З мурахами боремся препаратом «актара» змішаною з цукром. У жаркі літні дні зменшити випар вологи з поверхні газону Ви зможете, провівши не нижче (5 - 7 см) скошування газону косаркою без бункера. Залишайте скошену траву на газоні не більше 3 - 7 днів. У міру використання газону грунт поступово ущільнюється, що утрудняє проникнення кисню повітря до кореневої системи і створює умови для накопичення вуглекислого газу у верхньому шарі грунту. Усе це уповільнює зростання і розвиток трав. Для підтримки оптимального газообміну обробляйте газон зубовим або різальним аератором, можете також використати садові вила. Робіть це навесні і літом. Кількість обробок в сезон залежить від міри ущільнення грунту. Не обов'язково обробляти усю ділянку, можете проробляти це тільки в помітно ущільнених місцях.",R.drawable.img_lower));
        mlist.add(new MonthDetailModel("Квіти", "Липень це період коли можуть з'явитись грибкові захворювання, тому рослини можна обробити системним фунгіцидом \"Скор\".В цей час потрібно зайнятись активно боротьбою з бур'янами. Якщо побачите тлю на трояндах то потрібно використати інсектициди загальної дії такі як \"актара\". Це період коли можна висівати у відкритий грунт дворічники: наперстянка, мальва, маргаритки, фіалки, гвоздику турецьку. Не забуваємо оновити мульчу навколо посадок. Вона не тільки допоможе в боротьбі з бур'янами, але і збереже вологу в ґрунті. З другої половини липня слід припинити внесення азотних добрив під плодові кущі, дерева і багаторічники. В середині літа активно розмножуються шкідники і розвиваються хвороби. У липні рослини важливо обробити профілактичними засобами. Підійде для посадки в липні і іпомея. Цей однорічник цвіте в саду з весни до пізньої осені, так що у нього є час показати себе у всій красі. По суті це ліана, яку називають в'юн. Немає рослини краще, якщо вам потрібно в короткий термін створити живу зелену квітучу стіну. Буквально на очах буде рости рудбекія. Вона дуже витривала, світлолюбна. За короткий термін сягає двох метрів.",R.drawable.flower));
        mlist.add(new MonthDetailModel("Чагарники", "В липні так як і вчерні потрібен полив посушливим літом, ягідні кущі від недостатньої вологості можуть скинути частину плодів чи ягід, закласти недостатньо плодових бруньок для врожаю наступного року. Але постійно тримати прикореневе коло дерев вологим теж небезпечно, особливо для саджанців 1-2 років, оскільки через брак повітря в грунті коріння може згнити. Старі, добре сформовані сади варто поливати лише під час тривалої посухи чи в період дозрівання врожаю, – завдяки розвинутій кореневій системі дорослі дерева не потребують частих поливів. Специфічного поливу потребує виноград. Цій культурі вода необхідна до появи бутонів, а згодом зайві поливи можуть спровокувати осипання цвіту. Тому на момент розкриття бутонів поливи необхідно припинити та продовжити тільки по завершенні цвітіння. Теж не рекомендують поливати виноград в останній період дозрівання врожаю. В липні на грунті через посуху практично одразу формується щільна корка. Для того, щоб грунт не втрачав повітро- та вологопроникність, рослини не страждали від ущільнення грунту розпушування варто проводити частіше. В ідеалі – після кожного поливу та після опадів. Але якщо часу та сил бракую – вспушуйте грунт хоча б раз на два тижні. Провести необхідно бротьбу із бур'янами та рихлення грунту. Якщо з'явиться попелиця то рослини потрібно обробити препаратом \"актофіт\". Також, можна підстригти ще не доглянуті кущі та внести азотні добрива. Потрібно підв\\'язати рослини які розрослись. В цей період можна зробити обрізання відцвівших квітів. Зазвичай літню обрізку строгих огорож та всіх садових зелених скульптур, зокрема, самшитових бордюрів та сфер проводять саме в липні. В рослин вкорочують лише молоді пагони, не зачіпаючи скелетне та старе гілля, використовуючи для формовки свіжий приріст. Зазвичай, липнева обрізка є поверхневою, проводиться для загущення та досягнення ідеальних контурів та текстур.",R.drawable.shrub2));
        mlist.add(new MonthDetailModel("Дерева","В міжряддя саду в першій половині липня можна посіяти сидерати (гірчицю, фацелію, горох) для збагачення грунту органічними речовинами. Вони особливо корисні на перезволожених ділянках, так як підсушують їх і припиняють зростання дерев, що сприяє кращій підготовці їх до зими. У цьому місяці, так само як і в попередньому, на плодовому ділянці рихліть грунт в пристовбурних колах, прополювати бур'яни, поливайте нові посадки.\nПротягом літа збирайте і спалюйте опале з зелених живців листя (щоб знищити інфекцію грибкових захворювань).\nНе допускайте розростання бур'яну, в ньому живуть шкідники. З середини липня для підживлення рослин, окрім літників, не варто використовувати азот. Для стимулювання другої хвилі цвітіння чи його продовження, підтриманні рясності суцвіть, використовуйте фосфорно-калійні суміші. При цьому кількість фосфору в грунті саме липні досягає максимуму, тож його традиційно вносять менше, аніж калію. В липні на грунті через посуху практично одразу формується щільна корка. Для того, щоб грунт не втрачав повітро- та вологопроникність, рослини не страждали від ущільнення грунту розпушування варто проводити частіше. В ідеалі – після кожного поливу та після опадів. Але якщо часу та сил бракую – вспушуйте грунт хоча б раз на два тижні. Якщо все ж ріст пагонів активно триває, то ближче до серпня їх варто прищипнути або вкоротити, так вони краще визріють. Якщо на великих деревах зробити це складно і, чесно кажучи, для них це не є критичним (ну, втратиться частина гілок), то на молодих саджанцях втрата приростів може відбитися серйозно. У липні постійно стежимо і видаляємо вовчки і кореневу поросль. Забираючи багато сил у дерев і кущів, вони не принесуть нам ніякої користі. Починається період, коли можна робити найпростіше з щеплень – окулірування. Цей вид щеплення доступний навіть садівникам-початківцям. Головне, визначити підходящий момент, коли йде активний рух соку. Спробуйте зробити невеликий надріз кори на гілці, і перевірте, чи добре відшаровується кора. Якщо легко, то саме час робити. Щеплені вічка вже через 2-3 тижні можна перевірити і зрозуміти – прижилися вони чи ні. Якщо щось пішло не так, і вічко засохло, у вас ще достатньо часу (до кінця серпня) для повтору. Як можна частіше збирати опалі, особливо уражені плодожеркою фрукти плодових дерев. На нижню частину дерев яблуні, груші, сливи накладайте ловчі пояси з мішковини, гофрованої або газетного паперу шириною 10-15 см, обв’язуючи шпагатом, щоб краї нещільно прилягали до штамбу і служили притулком для лялькування гусениць. Захистіть свій урожай від птахів. В липні вже дозріли черешні і вишні. До цього ж часу встигає підрости і набратися сил молоде покоління птахів. Вберегти врожай від пернатих сусідів допоможуть прапорці з фольги, які розвіваються на вітру або накинута на чагарник стара рибацька сітка.",R.drawable.tree3));
        mlist.add(new MonthDetailModel("Овочеві культури", "Поверхневе розпушування рекомендується проводити після кожного дощу або поливу. Ця нескладна операція допомагає зберегти вологу, поліпшити повітрообмін; перешкоджає утворенню кірки на поверхні грунту; сприяє знищенню сходів бур'янів. Продовжуємо розпочаті в червні роботи по формуванню томата, перцю, огірка і не забуваємо про полив цих рослин. У липні приходить час пожинати плоди своєї праці. По мірі збирання врожаю на городі звільняються грядки, які засівають сидератами або скоростиглими овочевими, зеленими культурами. У липні можна сіяти повторно редис, ріпу, петрушку, салати. У липні для багатьох городників стають особливо актуальними питання боротьби з фітофторозом томатів і картоплі їх можна пролити розчиненим у воді деревним вугіллям. Активна боротьба з колорадським жуком препаратом Актофіт, Ридоміл Голд, Квадріс, Ревус.",R.drawable.vegetables));
        mlist.add(new MonthDetailModel("Кімнатні рослини", "Поливати рослини в липні слід чистою дощовою водою або відстояною водопровідною (можна кип'яченою). Рослини, розміщені в балконних ящиках, можна поливати звичайною проточною водою без кип'ятіння. Частоту поливу підбирають в залежності від потреб рослин. В середньому, в жарку пору зволожувати грунт в квіткових горщиках слід щодня вранці і ввечері. Квіти, що знаходяться влітку в стані спокою (цикламени, кали, гіппеаструми. У кімнатних садах часто зустрічаються молоді рослини, вирощені з насіння або живців. До літа їм, як правило, стає тісно в ємностях, в яких вони жили з весни: коріння освоюють весь земляний кому і навіть переглядають через дренажні отвори. Таким рослинам потрібна пересадка, яку проводять методом перевалки. Для перевалки не слід підбирати дуже великі горщики. Нове \"житло\" має бути більше попереднього на 2-3 см.\n" +
                "При появі на листках рослин плям, слід перевірити, чи не пошкоджена рослина шкідниками. Про наявність комах може свідчити пожовтіння листя. Такі екземпляри слід ізолювати від інших рослин. Якщо на них дійсно з'явилися шкідники, позбутися від них можна наступним чином: змити водою зі спиртом, обробити настоєм тютюну з господарським милом, або препаратом \"актофіт\".",R.drawable.plants));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.rv_main);
        RecyclerviewAdapter myAdapter = new RecyclerviewAdapter(this, mlist);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(myAdapter);
    }
}