// On my honor, I have neither received nor given any unauthorized assistance on this assignment. Isaac Figueroa

// payment
// social media
// google play
// work on device
// database



package com.IsaacFigueroa.NJFTRUS;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity {


    ArrayList<String> zipcodesArr;


    EditText enterZip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        zipcodesArr = new ArrayList<>();

        zipcodesArr.add("07001");
        zipcodesArr.add("07002");
        zipcodesArr.add("07003");
        zipcodesArr.add("07004");
        zipcodesArr.add("07005");
        zipcodesArr.add("07006");
        zipcodesArr.add("07007");
        zipcodesArr.add("07008");
        zipcodesArr.add("07009");
        zipcodesArr.add("07010");
        zipcodesArr.add("07011");
        zipcodesArr.add("07012");
        zipcodesArr.add("07013");
        zipcodesArr.add("07014");
        zipcodesArr.add("07015");
        zipcodesArr.add("07016");
        zipcodesArr.add("07017");
        zipcodesArr.add("07018");
        zipcodesArr.add("07019");
        zipcodesArr.add("07020");
        zipcodesArr.add("07021");
        zipcodesArr.add("07022");
        zipcodesArr.add("07023");
        zipcodesArr.add("07024");
        zipcodesArr.add("07026");
        zipcodesArr.add("07027");
        zipcodesArr.add("07028");
        zipcodesArr.add("07029");
        zipcodesArr.add("07030");
        zipcodesArr.add("07031");
        zipcodesArr.add("07032");
        zipcodesArr.add("07033");
        zipcodesArr.add("07034");
        zipcodesArr.add("07035");
        zipcodesArr.add("07036");
        zipcodesArr.add("07039");
        zipcodesArr.add("07040");
        zipcodesArr.add("07041");
        zipcodesArr.add("07042");
        zipcodesArr.add("07043");
        zipcodesArr.add("07044");
        zipcodesArr.add("07045");
        zipcodesArr.add("07046");
        zipcodesArr.add("07047");
        zipcodesArr.add("07050");
        zipcodesArr.add("07051");
        zipcodesArr.add("07052");
        zipcodesArr.add("07054");
        zipcodesArr.add("07055");
        zipcodesArr.add("07057");
        zipcodesArr.add("07058");
        zipcodesArr.add("07059");
        zipcodesArr.add("07060");
        zipcodesArr.add("07061");
        zipcodesArr.add("07062");
        zipcodesArr.add("07063");
        zipcodesArr.add("07064");
        zipcodesArr.add("07065");
        zipcodesArr.add("07066");
        zipcodesArr.add("07067");
        zipcodesArr.add("07068");
        zipcodesArr.add("07069");
        zipcodesArr.add("07070");
        zipcodesArr.add("07071");
        zipcodesArr.add("07072");
        zipcodesArr.add("07073");
        zipcodesArr.add("07074");
        zipcodesArr.add("07075");
        zipcodesArr.add("07076");
        zipcodesArr.add("07077");
        zipcodesArr.add("07078");
        zipcodesArr.add("07079");
        zipcodesArr.add("07080");
        zipcodesArr.add("07081");
        zipcodesArr.add("07082");
        zipcodesArr.add("07083");
        zipcodesArr.add("07086");
        zipcodesArr.add("07087");
        zipcodesArr.add("07088");
        zipcodesArr.add("07090");
        zipcodesArr.add("07091");
        zipcodesArr.add("07092");
        zipcodesArr.add("07093");
        zipcodesArr.add("07094");
        zipcodesArr.add("07095");
        zipcodesArr.add("07096");
        zipcodesArr.add("07097");
        zipcodesArr.add("07099");
        zipcodesArr.add("07101");
        zipcodesArr.add("07102");
        zipcodesArr.add("07103");
        zipcodesArr.add("07104");
        zipcodesArr.add("07105");
        zipcodesArr.add("07106");
        zipcodesArr.add("07107");
        zipcodesArr.add("07108");
        zipcodesArr.add("07109");
        zipcodesArr.add("07110");
        zipcodesArr.add("07111");
        zipcodesArr.add("07112");
        zipcodesArr.add("07114");
        zipcodesArr.add("07175");
        zipcodesArr.add("07182");
        zipcodesArr.add("07184");
        zipcodesArr.add("07188");
        zipcodesArr.add("07189");
        zipcodesArr.add("07191");
        zipcodesArr.add("07192");
        zipcodesArr.add("07193");
        zipcodesArr.add("07194");
        zipcodesArr.add("07195");
        zipcodesArr.add("07198");
        zipcodesArr.add("07199");
        zipcodesArr.add("07201");
        zipcodesArr.add("07202");
        zipcodesArr.add("07203");
        zipcodesArr.add("07204");
        zipcodesArr.add("07205");
        zipcodesArr.add("07206");
        zipcodesArr.add("07207");
        zipcodesArr.add("07208");
        zipcodesArr.add("07302");
        zipcodesArr.add("07303");
        zipcodesArr.add("07304");
        zipcodesArr.add("07305");
        zipcodesArr.add("07306");
        zipcodesArr.add("07307");
        zipcodesArr.add("07308");
        zipcodesArr.add("07309");
        zipcodesArr.add("07310");
        zipcodesArr.add("07311");
        zipcodesArr.add("07395");
        zipcodesArr.add("07399");
        zipcodesArr.add("07401");
        zipcodesArr.add("07403");
        zipcodesArr.add("07405");
        zipcodesArr.add("07407");
        zipcodesArr.add("07410");
        zipcodesArr.add("07416");
        zipcodesArr.add("07417");
        zipcodesArr.add("07418");
        zipcodesArr.add("07419");
        zipcodesArr.add("07420");
        zipcodesArr.add("07421");
        zipcodesArr.add("07422");
        zipcodesArr.add("07423");
        zipcodesArr.add("07424");
        zipcodesArr.add("07428");
        zipcodesArr.add("07430");
        zipcodesArr.add("07432");
        zipcodesArr.add("07435");
        zipcodesArr.add("07436");
        zipcodesArr.add("07438");
        zipcodesArr.add("07439");
        zipcodesArr.add("07440");
        zipcodesArr.add("07442");
        zipcodesArr.add("07444");
        zipcodesArr.add("07446");
        zipcodesArr.add("07450");
        zipcodesArr.add("07451");
        zipcodesArr.add("07452");
        zipcodesArr.add("07456");
        zipcodesArr.add("07457");
        zipcodesArr.add("07458");
        zipcodesArr.add("07460");
        zipcodesArr.add("07461");
        zipcodesArr.add("07462");
        zipcodesArr.add("07463");
        zipcodesArr.add("07465");
        zipcodesArr.add("07470");
        zipcodesArr.add("07474");
        zipcodesArr.add("07477");
        zipcodesArr.add("07480");
        zipcodesArr.add("07481");
        zipcodesArr.add("07495");
        zipcodesArr.add("07501");
        zipcodesArr.add("07502");
        zipcodesArr.add("07503");
        zipcodesArr.add("07504");
        zipcodesArr.add("07505");
        zipcodesArr.add("07506");
        zipcodesArr.add("07507");
        zipcodesArr.add("07508");
        zipcodesArr.add("07509");
        zipcodesArr.add("07510");
        zipcodesArr.add("07511");
        zipcodesArr.add("07512");
        zipcodesArr.add("07513");
        zipcodesArr.add("07514");
        zipcodesArr.add("07522");
        zipcodesArr.add("07524");
        zipcodesArr.add("07533");
        zipcodesArr.add("07538");
        zipcodesArr.add("07543");
        zipcodesArr.add("07544");
        zipcodesArr.add("07601");
        zipcodesArr.add("07602");
        zipcodesArr.add("07603");
        zipcodesArr.add("07604");
        zipcodesArr.add("07605");
        zipcodesArr.add("07606");
        zipcodesArr.add("07607");
        zipcodesArr.add("07608");
        zipcodesArr.add("07620");
        zipcodesArr.add("07621");
        zipcodesArr.add("07624");
        zipcodesArr.add("07626");
        zipcodesArr.add("07627");
        zipcodesArr.add("07628");
        zipcodesArr.add("07630");
        zipcodesArr.add("07631");
        zipcodesArr.add("07632");
        zipcodesArr.add("07640");
        zipcodesArr.add("07641");
        zipcodesArr.add("07642");
        zipcodesArr.add("07643");
        zipcodesArr.add("07644");
        zipcodesArr.add("07645");
        zipcodesArr.add("07646");
        zipcodesArr.add("07647");
        zipcodesArr.add("07648");
        zipcodesArr.add("07649");
        zipcodesArr.add("07650");
        zipcodesArr.add("07652");
        zipcodesArr.add("07653");
        zipcodesArr.add("07656");
        zipcodesArr.add("07657");
        zipcodesArr.add("07660");
        zipcodesArr.add("07661");
        zipcodesArr.add("07662");
        zipcodesArr.add("07663");
        zipcodesArr.add("07666");
        zipcodesArr.add("07670");
        zipcodesArr.add("07675");
        zipcodesArr.add("07677");
        zipcodesArr.add("07699");
        zipcodesArr.add("07701");
        zipcodesArr.add("07702");
        zipcodesArr.add("07703");
        zipcodesArr.add("07704");
        zipcodesArr.add("07709");
        zipcodesArr.add("07710");
        zipcodesArr.add("07711");
        zipcodesArr.add("07712");
        zipcodesArr.add("07715");
        zipcodesArr.add("07716");
        zipcodesArr.add("07717");
        zipcodesArr.add("07718");
        zipcodesArr.add("07719");
        zipcodesArr.add("07720");
        zipcodesArr.add("07721");
        zipcodesArr.add("07722");
        zipcodesArr.add("07723");
        zipcodesArr.add("07724");
        zipcodesArr.add("07726");
        zipcodesArr.add("07727");
        zipcodesArr.add("07728");
        zipcodesArr.add("07730");
        zipcodesArr.add("07731");
        zipcodesArr.add("07732");
        zipcodesArr.add("07733");
        zipcodesArr.add("07734");
        zipcodesArr.add("07735");
        zipcodesArr.add("07737");
        zipcodesArr.add("07738");
        zipcodesArr.add("07739");
        zipcodesArr.add("07740");
        zipcodesArr.add("07746");
        zipcodesArr.add("07747");
        zipcodesArr.add("07748");
        zipcodesArr.add("07750");
        zipcodesArr.add("07751");
        zipcodesArr.add("07752");
        zipcodesArr.add("07753");
        zipcodesArr.add("07754");
        zipcodesArr.add("07755");
        zipcodesArr.add("07756");
        zipcodesArr.add("07758");
        zipcodesArr.add("07760");
        zipcodesArr.add("07762");
        zipcodesArr.add("07763");
        zipcodesArr.add("07764");
        zipcodesArr.add("07765");
        zipcodesArr.add("07799");
        zipcodesArr.add("07801");
        zipcodesArr.add("07802");
        zipcodesArr.add("07803");
        zipcodesArr.add("07806");
        zipcodesArr.add("07820");
        zipcodesArr.add("07821");
        zipcodesArr.add("07822");
        zipcodesArr.add("07823");
        zipcodesArr.add("07825");
        zipcodesArr.add("07826");
        zipcodesArr.add("07827");
        zipcodesArr.add("07828");
        zipcodesArr.add("07829");
        zipcodesArr.add("07830");
        zipcodesArr.add("07831");
        zipcodesArr.add("07832");
        zipcodesArr.add("07833");
        zipcodesArr.add("07834");
        zipcodesArr.add("07836");
        zipcodesArr.add("07837");
        zipcodesArr.add("07838");
        zipcodesArr.add("07839");
        zipcodesArr.add("07842");
        zipcodesArr.add("07843");
        zipcodesArr.add("07844");
        zipcodesArr.add("07845");
        zipcodesArr.add("07846");
        zipcodesArr.add("07847");
        zipcodesArr.add("07848");
        zipcodesArr.add("07849");
        zipcodesArr.add("07850");
        zipcodesArr.add("07851");
        zipcodesArr.add("07852");
        zipcodesArr.add("07853");
        zipcodesArr.add("07855");
        zipcodesArr.add("07856");
        zipcodesArr.add("07857");
        zipcodesArr.add("07860");
        zipcodesArr.add("07863");
        zipcodesArr.add("07865");
        zipcodesArr.add("07866");
        zipcodesArr.add("07869");
        zipcodesArr.add("07870");
        zipcodesArr.add("07871");
        zipcodesArr.add("07874");
        zipcodesArr.add("07875");
        zipcodesArr.add("07876");
        zipcodesArr.add("07877");
        zipcodesArr.add("07878");
        zipcodesArr.add("07880");
        zipcodesArr.add("07881");
        zipcodesArr.add("07882");
        zipcodesArr.add("07885");
        zipcodesArr.add("07890");
        zipcodesArr.add("07901");
        zipcodesArr.add("07902");
        zipcodesArr.add("07920");
        zipcodesArr.add("07921");
        zipcodesArr.add("07922");
        zipcodesArr.add("07924");
        zipcodesArr.add("07926");
        zipcodesArr.add("07927");
        zipcodesArr.add("07928");
        zipcodesArr.add("07930");
        zipcodesArr.add("07931");
        zipcodesArr.add("07932");
        zipcodesArr.add("07933");
        zipcodesArr.add("07934");
        zipcodesArr.add("07935");
        zipcodesArr.add("07936");
        zipcodesArr.add("07938");
        zipcodesArr.add("07939");
        zipcodesArr.add("07940");
        zipcodesArr.add("07945");
        zipcodesArr.add("07946");
        zipcodesArr.add("07950");
        zipcodesArr.add("07961");
        zipcodesArr.add("07962");
        zipcodesArr.add("07963");
        zipcodesArr.add("07970");
        zipcodesArr.add("07974");
        zipcodesArr.add("07976");
        zipcodesArr.add("07977");
        zipcodesArr.add("07978");
        zipcodesArr.add("07979");
        zipcodesArr.add("07980");
        zipcodesArr.add("07981");
        zipcodesArr.add("07983");
        zipcodesArr.add("07999");
        zipcodesArr.add("08001");
        zipcodesArr.add("08002");
        zipcodesArr.add("08003");
        zipcodesArr.add("08004");
        zipcodesArr.add("08005");
        zipcodesArr.add("08006");
        zipcodesArr.add("08007");
        zipcodesArr.add("08009");
        zipcodesArr.add("08010");
        zipcodesArr.add("08011");
        zipcodesArr.add("08012");
        zipcodesArr.add("08014");
        zipcodesArr.add("08015");
        zipcodesArr.add("08016");
        zipcodesArr.add("08018");
        zipcodesArr.add("08019");
        zipcodesArr.add("08020");
        zipcodesArr.add("08021");
        zipcodesArr.add("08023");
        zipcodesArr.add("08025");
        zipcodesArr.add("08026");
        zipcodesArr.add("08029");
        zipcodesArr.add("08030");
        zipcodesArr.add("08031");
        zipcodesArr.add("08032");
        zipcodesArr.add("08033");
        zipcodesArr.add("08034");
        zipcodesArr.add("08035");
        zipcodesArr.add("08036");
        zipcodesArr.add("08037");
        zipcodesArr.add("08038");
        zipcodesArr.add("08039");
        zipcodesArr.add("08041");
        zipcodesArr.add("08042");
        zipcodesArr.add("08043");
        zipcodesArr.add("08045");
        zipcodesArr.add("08046");
        zipcodesArr.add("08048");
        zipcodesArr.add("08049");
        zipcodesArr.add("08050");
        zipcodesArr.add("08051");
        zipcodesArr.add("08052");
        zipcodesArr.add("08053");
        zipcodesArr.add("08054");
        zipcodesArr.add("08055");
        zipcodesArr.add("08056");
        zipcodesArr.add("08057");
        zipcodesArr.add("00859");
        zipcodesArr.add("08060");
        zipcodesArr.add("08061");
        zipcodesArr.add("08062");
        zipcodesArr.add("08063");
        zipcodesArr.add("08064");
        zipcodesArr.add("08065");
        zipcodesArr.add("08066");
        zipcodesArr.add("08067");
        zipcodesArr.add("08068");
        zipcodesArr.add("08070");
        zipcodesArr.add("08071");
        zipcodesArr.add("08072");
        zipcodesArr.add("08073");
        zipcodesArr.add("08074");
        zipcodesArr.add("08075");
        zipcodesArr.add("08076");
        zipcodesArr.add("08077");
        zipcodesArr.add("08078");
        zipcodesArr.add("08079");
        zipcodesArr.add("08080");
        zipcodesArr.add("08081");
        zipcodesArr.add("08083");
        zipcodesArr.add("08084");
        zipcodesArr.add("08085");
        zipcodesArr.add("08086");
        zipcodesArr.add("08087");
        zipcodesArr.add("08088");
        zipcodesArr.add("08089");
        zipcodesArr.add("08090");
        zipcodesArr.add("08091");
        zipcodesArr.add("08092");
        zipcodesArr.add("08093");
        zipcodesArr.add("08094");
        zipcodesArr.add("08095");
        zipcodesArr.add("08096");
        zipcodesArr.add("08097");
        zipcodesArr.add("08098");
        zipcodesArr.add("08099");
        zipcodesArr.add("08101");
        zipcodesArr.add("08102");
        zipcodesArr.add("08103");
        zipcodesArr.add("08104");
        zipcodesArr.add("08105");
        zipcodesArr.add("08106");
        zipcodesArr.add("08107");
        zipcodesArr.add("08108");
        zipcodesArr.add("08109");
        zipcodesArr.add("08110");
        zipcodesArr.add("08201");
        zipcodesArr.add("08202");
        zipcodesArr.add("08203");
        zipcodesArr.add("08204");
        zipcodesArr.add("08205");
        zipcodesArr.add("08210");
        zipcodesArr.add("08212");
        zipcodesArr.add("08213");
        zipcodesArr.add("08214");
        zipcodesArr.add("08215");
        zipcodesArr.add("08217");
        zipcodesArr.add("08218");
        zipcodesArr.add("08219");
        zipcodesArr.add("08220");
        zipcodesArr.add("08221");
        zipcodesArr.add("08223");
        zipcodesArr.add("08224");
        zipcodesArr.add("08225");
        zipcodesArr.add("08226");
        zipcodesArr.add("08230");
        zipcodesArr.add("08231");
        zipcodesArr.add("08232");
        zipcodesArr.add("08234");
        zipcodesArr.add("08240");
        zipcodesArr.add("08241");
        zipcodesArr.add("08242");
        zipcodesArr.add("08243");
        zipcodesArr.add("08244");
        zipcodesArr.add("08245");
        zipcodesArr.add("08246");
        zipcodesArr.add("08247");
        zipcodesArr.add("08248");
        zipcodesArr.add("08250");
        zipcodesArr.add("08251");
        zipcodesArr.add("08252");
        zipcodesArr.add("08260");
        zipcodesArr.add("08270");
        zipcodesArr.add("08302");
        zipcodesArr.add("08310");
        zipcodesArr.add("08311");
        zipcodesArr.add("08312");
        zipcodesArr.add("08314");
        zipcodesArr.add("08315");
        zipcodesArr.add("08316");
        zipcodesArr.add("08317");
        zipcodesArr.add("08318");
        zipcodesArr.add("08319");
        zipcodesArr.add("08320");
        zipcodesArr.add("08321");
        zipcodesArr.add("08322");
        zipcodesArr.add("08323");
        zipcodesArr.add("08324");
        zipcodesArr.add("08326");
        zipcodesArr.add("08327");
        zipcodesArr.add("08328");
        zipcodesArr.add("08329");
        zipcodesArr.add("08330");
        zipcodesArr.add("08332");
        zipcodesArr.add("08340");
        zipcodesArr.add("08341");
        zipcodesArr.add("08342");
        zipcodesArr.add("08343");
        zipcodesArr.add("08344");
        zipcodesArr.add("08345");
        zipcodesArr.add("08346");
        zipcodesArr.add("08347");
        zipcodesArr.add("08348");
        zipcodesArr.add("08349");
        zipcodesArr.add("08350");
        zipcodesArr.add("08352");
        zipcodesArr.add("08353");
        zipcodesArr.add("08360");
        zipcodesArr.add("08361");
        zipcodesArr.add("08362");
        zipcodesArr.add("08401");
        zipcodesArr.add("08402");
        zipcodesArr.add("08403");
        zipcodesArr.add("08404");
        zipcodesArr.add("08405");
        zipcodesArr.add("08406");
        zipcodesArr.add("08501");
        zipcodesArr.add("08502");
        zipcodesArr.add("08504");
        zipcodesArr.add("08505");
        zipcodesArr.add("08510");
        zipcodesArr.add("08511");
        zipcodesArr.add("08512");
        zipcodesArr.add("08514");
        zipcodesArr.add("08515");
        zipcodesArr.add("08518");
        zipcodesArr.add("08520");
        zipcodesArr.add("08525");
        zipcodesArr.add("08526");
        zipcodesArr.add("08527");
        zipcodesArr.add("08528");
        zipcodesArr.add("08530");
        zipcodesArr.add("08533");
        zipcodesArr.add("08534");
        zipcodesArr.add("08535");
        zipcodesArr.add("08536");
        zipcodesArr.add("08540");
        zipcodesArr.add("08541");
        zipcodesArr.add("08542");
        zipcodesArr.add("08543");
        zipcodesArr.add("08544");
        zipcodesArr.add("08551");
        zipcodesArr.add("08554");
        zipcodesArr.add("08555");
        zipcodesArr.add("08557");
        zipcodesArr.add("08558");
        zipcodesArr.add("08559");
        zipcodesArr.add("08560");
        zipcodesArr.add("08561");
        zipcodesArr.add("08601");
        zipcodesArr.add("08602");
        zipcodesArr.add("08603");
        zipcodesArr.add("08604");
        zipcodesArr.add("08605");
        zipcodesArr.add("08607");
        zipcodesArr.add("08608");
        zipcodesArr.add("08609");
        zipcodesArr.add("08610");
        zipcodesArr.add("08611");
        zipcodesArr.add("08618");
        zipcodesArr.add("08620");
        zipcodesArr.add("08625");
        zipcodesArr.add("08628");
        zipcodesArr.add("08629");
        zipcodesArr.add("08641");
        zipcodesArr.add("08644");
        zipcodesArr.add("08645");
        zipcodesArr.add("08646");
        zipcodesArr.add("08647");
        zipcodesArr.add("08648");
        zipcodesArr.add("08650");
        zipcodesArr.add("08666");
        zipcodesArr.add("08690");
        zipcodesArr.add("08691");
        zipcodesArr.add("08695");
        zipcodesArr.add("08701");
        zipcodesArr.add("08720");
        zipcodesArr.add("08721");
        zipcodesArr.add("08722");
        zipcodesArr.add("08723");
        zipcodesArr.add("08724");
        zipcodesArr.add("08730");
        zipcodesArr.add("08731");
        zipcodesArr.add("08734");
        zipcodesArr.add("08735");
        zipcodesArr.add("08736");
        zipcodesArr.add("08738");
        zipcodesArr.add("08739");
        zipcodesArr.add("08740");
        zipcodesArr.add("08741");
        zipcodesArr.add("08742");
        zipcodesArr.add("08750");
        zipcodesArr.add("08751");
        zipcodesArr.add("08752");
        zipcodesArr.add("08753");
        zipcodesArr.add("08754");
        zipcodesArr.add("08755");
        zipcodesArr.add("08756");
        zipcodesArr.add("08757");
        zipcodesArr.add("08758");
        zipcodesArr.add("08759");
        zipcodesArr.add("08801");
        zipcodesArr.add("08802");
        zipcodesArr.add("08803");
        zipcodesArr.add("08804");
        zipcodesArr.add("08805");
        zipcodesArr.add("08807");
        zipcodesArr.add("08808");
        zipcodesArr.add("08809");
        zipcodesArr.add("08810");
        zipcodesArr.add("08812");
        zipcodesArr.add("08816");
        zipcodesArr.add("08817");
        zipcodesArr.add("08818");
        zipcodesArr.add("08820");
        zipcodesArr.add("08823");
        zipcodesArr.add("08824");
        zipcodesArr.add("08825");
        zipcodesArr.add("08826");
        zipcodesArr.add("08827");
        zipcodesArr.add("08828");
        zipcodesArr.add("08829");
        zipcodesArr.add("08830");
        zipcodesArr.add("08831");
        zipcodesArr.add("08832");
        zipcodesArr.add("08833");
        zipcodesArr.add("08834");
        zipcodesArr.add("08835");
        zipcodesArr.add("08836");
        zipcodesArr.add("08837");
        zipcodesArr.add("08840");
        zipcodesArr.add("08844");
        zipcodesArr.add("08846");
        zipcodesArr.add("08848");
        zipcodesArr.add("08850");
        zipcodesArr.add("08852");
        zipcodesArr.add("08853");
        zipcodesArr.add("08854");
        zipcodesArr.add("08855");
        zipcodesArr.add("08857");
        zipcodesArr.add("08858");
        zipcodesArr.add("08859");
        zipcodesArr.add("08861");
        zipcodesArr.add("08862");
        zipcodesArr.add("08863");
        zipcodesArr.add("08865");
        zipcodesArr.add("08867");
        zipcodesArr.add("08868");
        zipcodesArr.add("08869");
        zipcodesArr.add("08871");
        zipcodesArr.add("08872");
        zipcodesArr.add("08873");
        zipcodesArr.add("08875");
        zipcodesArr.add("08876");
        zipcodesArr.add("08879");
        zipcodesArr.add("08880");
        zipcodesArr.add("08882");
        zipcodesArr.add("08884");
        zipcodesArr.add("08885");
        zipcodesArr.add("08886");
        zipcodesArr.add("08887");
        zipcodesArr.add("08888");
        zipcodesArr.add("08889");
        zipcodesArr.add("08890");
        zipcodesArr.add("08899");
        zipcodesArr.add("08901");
        zipcodesArr.add("08902");
        zipcodesArr.add("08903");
        zipcodesArr.add("08904");
        zipcodesArr.add("08905");
        zipcodesArr.add("08906");
        zipcodesArr.add("08922");
        zipcodesArr.add("08988");
        zipcodesArr.add("08989");

        enterZip = (EditText) findViewById(R.id.enterZip);


        Button button = findViewById(R.id.find);
        Button button1 = findViewById(R.id.schedules);
        Button button3 = findViewById(R.id.foodmenu);
        Button button4 = findViewById(R.id.realfoodmenu);
        Button button5 = findViewById(R.id.food);
        Button button6 = findViewById(R.id.schedulesb);


        button.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {

                switch (view.getId()) {

                    case R.id.find:


                        String passedZip = enterZip.getText().toString();

                        boolean userIsFounded = false;
                        for (int i = 0; i <= zipcodesArr.size() - 1; i++) {
                            if (enterZip.getText().toString().equals(zipcodesArr.get(i))) {

                                //print finding trucks near you.
                                Toast.makeText(HomeScreen.this, "Click on your Zip Code origin to find trucks close to you!!!", Toast.LENGTH_SHORT).show();

                                Intent intent = new Intent(HomeScreen.this, MapsActivity.class);
                                intent.putExtra("keyzip", passedZip);
                                startActivity(intent);


                                break;


                                //if user gives wrong input.
                            } else if (!enterZip.equals(""))
                                Toast.makeText(HomeScreen.this, "Click on your Zip Code origin to find trucks close to you!!!", Toast.LENGTH_SHORT).show();


                        }

                }

            }

            ;

        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeScreen.this, TruckDetailsActivity.class);
                startActivity(intent);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeScreen.this, FoodMenu.class);
                startActivity(intent);

            }
        });

         button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeScreen.this, MainActivity.class);
                startActivity(intent);

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeScreen.this, FoodTruckA.class);
                startActivity(intent);

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeScreen.this, MainData.class);
                startActivity(intent);

            }
        });

    }
}