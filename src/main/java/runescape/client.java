package runescape;

import com.jagex.oldscape.pub.*;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.*;
import java.util.concurrent.Future;

public final class client extends class34 implements class493, OAuthApi, class345 {
    @ObfuscatedName("cq")
    @ObfuscatedSignature(
            descriptor = "Ldz;"
    )
    public static final class92 packetWriter = new class92();
    @ObfuscatedName("fz")
    @ObfuscatedSignature(
            descriptor = "Lco;"
    )
    public static final class73 field333;
    @ObfuscatedName("df")
    @ObfuscatedSignature(
            descriptor = "Lkz;"
    )
    static final class282 field317 = new class282();
    @ObfuscatedName("du")
    static final String field590 = class162.method3992(class382.method8180("com_jagex_auth_desktop_osrs:public"));
    @ObfuscatedName("do")
    static final String field319 = class162.method3992(class382.method8180("com_jagex_auth_desktop_runelite:public"));
    @ObfuscatedName("ew")
    static final int[] field320 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
    @ObfuscatedName("ek")
    static final int[] playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
    @ObfuscatedName("et")
    @ObfuscatedSignature(
            descriptor = "Loz;"
    )
    static final class365 field322 = new class365();
    @ObfuscatedName("fs")
    @ObfuscatedSignature(
            descriptor = "Lbn;"
    )
    static final class40 field323 = new class40();
    @ObfuscatedName("fe")
    @ObfuscatedGetter(
            intValue = -98902411
    )
    public static int worldId = 1;
    @ObfuscatedName("fk")
    public static boolean field326 = false;
    @ObfuscatedName("fj")
    @ObfuscatedGetter(
            intValue = -1422845267
    )
    public static int cycle = 0;
    @ObfuscatedName("hq")
    @ObfuscatedGetter(
            intValue = -2017713217
    )
    public static int field362;
    @ObfuscatedName("hh")
    @ObfuscatedSignature(
            descriptor = "Lkh;"
    )
    public static class274 field551;
    @ObfuscatedName("ig")
    @ObfuscatedGetter(
            intValue = 1430860259
    )
    public static int field432;
    @ObfuscatedName("my")
    @ObfuscatedGetter(
            intValue = -1592588023
    )
    public static int field428;
    @ObfuscatedName("sq")
    @ObfuscatedSignature(
            descriptor = "Loi;"
    )
    public static class369 field612;
    @ObfuscatedName("ff")
    static boolean field427 = true;
    @ObfuscatedName("fo")
    @ObfuscatedGetter(
            intValue = 1412765109
    )
    static int gameState = 0;
    @ObfuscatedName("fm")
    @ObfuscatedSignature(
            descriptor = "Lfq;"
    )
    static class131 field571;
    @ObfuscatedName("fb")
    @ObfuscatedSignature(
            descriptor = "Lwz;"
    )
    static class595 field330;
    @ObfuscatedName("fp")
    static boolean Login_isUsernameRemembered;
    @ObfuscatedName("fx")
    static HashMap field387;
    @ObfuscatedName("gz")
    @ObfuscatedSignature(
            descriptor = "Lqs;"
    )
    static class436 field334;
    @ObfuscatedName("gn")
    @ObfuscatedSignature(
            descriptor = "Ldh;"
    )
    static class88 field335;
    @ObfuscatedName("gj")
    @ObfuscatedGetter(
            intValue = 2024493031
    )
    static int field336;
    @ObfuscatedName("gr")
    @ObfuscatedGetter(
            intValue = 1448913591
    )
    static int field558;
    @ObfuscatedName("gs")
    @ObfuscatedGetter(
            intValue = -751707649
    )
    static int field338;
    @ObfuscatedName("gv")
    @ObfuscatedGetter(
            intValue = -1335059759
    )
    static int field339;
    @ObfuscatedName("ge")
    static boolean showMouseCross;
    @ObfuscatedName("gx")
    @ObfuscatedGetter(
            intValue = -2054334095
    )
    static int field341;
    @ObfuscatedName("gy")
    static boolean field342;
    @ObfuscatedName("gh")
    @ObfuscatedGetter(
            intValue = -968136727
    )
    static int field491;
    @ObfuscatedName("ga")
    @ObfuscatedGetter(
            intValue = 1076558369
    )
    static int field344;
    @ObfuscatedName("gc")
    static String field345;
    @ObfuscatedName("gm")
    @ObfuscatedGetter(
            intValue = -458120041
    )
    static int field346;
    @ObfuscatedName("gf")
    @ObfuscatedGetter(
            intValue = 883771343
    )
    static int field347;
    @ObfuscatedName("gu")
    @ObfuscatedGetter(
            intValue = 306795665
    )
    static int field348;
    @ObfuscatedName("gt")
    static boolean field391;
    @ObfuscatedName("gi")
    @ObfuscatedGetter(
            intValue = 1038526173
    )
    static int field350;
    @ObfuscatedName("gl")
    static int[] field539;
    @ObfuscatedName("gp")
    static int[] field402;
    @ObfuscatedName("gg")
    static int[] field353;
    @ObfuscatedName("hd")
    static int[] field615;
    @ObfuscatedName("hj")
    static boolean field355;
    @ObfuscatedName("ha")
    static boolean field527;
    @ObfuscatedName("hg")
    @ObfuscatedGetter(
            intValue = 1604730771
    )
    static int field357;
    @ObfuscatedName("hs")
    @ObfuscatedSignature(
            descriptor = "Loi;"
    )
    static class369 field358;
    @ObfuscatedName("hc")
    @ObfuscatedGetter(
            longValue = -7548316783498577661L
    )
    static long field359;
    @ObfuscatedName("hm")
    static boolean isResizable;
    @ObfuscatedName("hp")
    @ObfuscatedGetter(
            intValue = -187837221
    )
    static int field361;
    @ObfuscatedName("hz")
    @ObfuscatedSignature(
            descriptor = "Lkj;"
    )
    static class272 field598;
    @ObfuscatedName("ht")
    @ObfuscatedSignature(
            descriptor = "[Lgs;"
    )
    static class162[] field365;
    @ObfuscatedName("hn")
    @ObfuscatedSignature(
            descriptor = "[Lgm;"
    )
    static class171[] field582;
    @ObfuscatedName("ho")
    static short field367;
    @ObfuscatedName("hu")
    static short field368;
    @ObfuscatedName("hv")
    static short field369;
    @ObfuscatedName("hr")
    static short field370;
    @ObfuscatedName("he")
    static short field371;
    @ObfuscatedName("hb")
    static short field364;
    @ObfuscatedName("im")
    static short field419;
    @ObfuscatedName("il")
    static short field382;
    @ObfuscatedName("ia")
    @ObfuscatedGetter(
            intValue = -626292013
    )
    static int field375;
    @ObfuscatedName("if")
    @ObfuscatedGetter(
            intValue = -1852070185
    )
    static int field597;
    @ObfuscatedName("ib")
    @ObfuscatedGetter(
            intValue = 1357272997
    )
    static int field313;
    @ObfuscatedName("is")
    @ObfuscatedGetter(
            intValue = -1897988279
    )
    static int field378;
    @ObfuscatedName("iy")
    @ObfuscatedGetter(
            intValue = -1524432169
    )
    static int field379;
    @ObfuscatedName("iq")
    @ObfuscatedSignature(
            descriptor = "[Lqt;"
    )
    static class421[] field380;
    @ObfuscatedName("iu")
    @ObfuscatedSignature(
            descriptor = "Lbh;"
    )
    static class42 field381;
    @ObfuscatedName("ip")
    @ObfuscatedGetter(
            intValue = 777676787
    )
    static int field316;
    @ObfuscatedName("ih")
    @ObfuscatedGetter(
            intValue = 377494033
    )
    static int field384;
    @ObfuscatedName("in")
    @ObfuscatedGetter(
            intValue = 2124912467
    )
    static int field385;
    @ObfuscatedName("it")
    static String field528;
    @ObfuscatedName("jw")
    @ObfuscatedGetter(
            intValue = -1824175637
    )
    static int field354;
    @ObfuscatedName("jb")
    static boolean field565;
    @ObfuscatedName("jl")
    @ObfuscatedGetter(
            intValue = 1964749319
    )
    static int field388;
    @ObfuscatedName("je")
    @ObfuscatedGetter(
            intValue = -1253426495
    )
    static int clientType;
    @ObfuscatedName("jz")
    @ObfuscatedGetter(
            intValue = 1407927851
    )
    static int field390;
    @ObfuscatedName("jt")
    static boolean field591;
    @ObfuscatedName("ja")
    static boolean field392;
    @ObfuscatedName("jd")
    @ObfuscatedGetter(
            intValue = 2031205381
    )
    static int field567;
    @ObfuscatedName("jy")
    @ObfuscatedGetter(
            longValue = 2032803268009057725L
    )
    static long field394;
    @ObfuscatedName("jf")
    @ObfuscatedGetter(
            intValue = -35742041
    )
    static int field386;
    @ObfuscatedName("js")
    @ObfuscatedGetter(
            intValue = -1725051333
    )
    static int field396;
    @ObfuscatedName("jr")
    @ObfuscatedGetter(
            longValue = -9212293690311687593L
    )
    static long field397;
    @ObfuscatedName("jm")
    static boolean hadFocus;
    @ObfuscatedName("ju")
    @ObfuscatedGetter(
            intValue = 936289107
    )
    static int rebootTimer;
    @ObfuscatedName("jo")
    static boolean field400;
    @ObfuscatedName("jg")
    @ObfuscatedSignature(
            descriptor = "Lca;"
    )
    static class70 field401;
    @ObfuscatedName("jh")
    @ObfuscatedSignature(
            descriptor = "Lku;"
    )
    static class266 js5SocketTask;
    @ObfuscatedName("kw")
    @ObfuscatedGetter(
            intValue = 557022671
    )
    static int js5ConnectState;
    @ObfuscatedName("kx")
    @ObfuscatedGetter(
            intValue = -1515410077
    )
    static int field526;
    @ObfuscatedName("lf")
    @ObfuscatedGetter(
            intValue = -1902543227
    )
    static int field405;
    @ObfuscatedName("lo")
    @ObfuscatedGetter(
            intValue = 380087747
    )
    static int field351;
    @ObfuscatedName("la")
    @ObfuscatedGetter(
            intValue = 970024405
    )
    static int field448;
    @ObfuscatedName("ll")
    @ObfuscatedGetter(
            intValue = 1568972813
    )
    static int field464;
    @ObfuscatedName("lr")
    @ObfuscatedGetter(
            intValue = 975524249
    )
    static int logoutTimer;
    @ObfuscatedName("lu")
    @ObfuscatedGetter(
            intValue = 1218361557
    )
    static int field410;
    @ObfuscatedName("ld")
    @ObfuscatedGetter(
            intValue = 683173837
    )
    static int field411;
    @ObfuscatedName("le")
    @ObfuscatedGetter(
            intValue = 2041456983
    )
    static int field329;
    @ObfuscatedName("lk")
    @ObfuscatedGetter(
            intValue = 1324983587
    )
    static int field413;
    @ObfuscatedName("lz")
    @ObfuscatedGetter(
            intValue = 9248015
    )
    static int field476;
    @ObfuscatedName("ml")
    @ObfuscatedGetter(
            intValue = 33962871
    )
    static int field415;
    @ObfuscatedName("mb")
    @ObfuscatedGetter(
            intValue = -2012695269
    )
    static int field424;
    @ObfuscatedName("mi")
    @ObfuscatedGetter(
            intValue = -708504693
    )
    static int field417;
    @ObfuscatedName("mo")
    @ObfuscatedGetter(
            intValue = -1999461305
    )
    static int field420;
    @ObfuscatedName("mu")
    @ObfuscatedGetter(
            intValue = -1184919319
    )
    static int field515;
    @ObfuscatedName("mq")
    @ObfuscatedGetter(
            intValue = -1324045149
    )
    static int field366;
    @ObfuscatedName("mm")
    @ObfuscatedGetter(
            intValue = 1230015341
    )
    static int rootInterface;
    @ObfuscatedName("mz")
    @ObfuscatedSignature(
            descriptor = "Lqw;"
    )
    static class428 field422;
    @ObfuscatedName("mw")
    @ObfuscatedGetter(
            intValue = 1835977501
    )
    static int field324;
    @ObfuscatedName("mr")
    @ObfuscatedGetter(
            intValue = 951850989
    )
    static int field573;
    @ObfuscatedName("ma")
    @ObfuscatedSignature(
            descriptor = "Loi;"
    )
    static class369 field564;
    @ObfuscatedName("mn")
    @ObfuscatedGetter(
            intValue = -1008879337
    )
    static int field592;
    @ObfuscatedName("me")
    @ObfuscatedGetter(
            intValue = 1358315405
    )
    static int field490;
    @ObfuscatedName("mh")
    @ObfuscatedGetter(
            intValue = -1181390529
    )
    static int field429;
    @ObfuscatedName("mf")
    static boolean field430;
    @ObfuscatedName("mg")
    @ObfuscatedGetter(
            intValue = 276515071
    )
    static int field404;
    @ObfuscatedName("mj")
    @ObfuscatedGetter(
            intValue = 1863335467
    )
    static int field525;
    @ObfuscatedName("mt")
    @ObfuscatedGetter(
            intValue = 168964391
    )
    static int field550;
    @ObfuscatedName("md")
    @ObfuscatedSignature(
            descriptor = "Lqs;"
    )
    static class436 field434;
    @ObfuscatedName("mx")
    @ObfuscatedSignature(
            descriptor = "Lqs;"
    )
    static class436 field435;
    @ObfuscatedName("nz")
    @ObfuscatedSignature(
            descriptor = "Lqs;"
    )
    static class436 field614;
    @ObfuscatedName("nk")
    @ObfuscatedSignature(
            descriptor = "Lqs;"
    )
    static class436 field437;
    @ObfuscatedName("nf")
    @ObfuscatedSignature(
            descriptor = "Lqw;"
    )
    static class428 field438;
    @ObfuscatedName("nr")
    @ObfuscatedGetter(
            intValue = 288419101
    )
    static int field444;
    @ObfuscatedName("nb")
    @ObfuscatedGetter(
            intValue = -1906270399
    )
    static int field440;
    @ObfuscatedName("ne")
    static String field441;
    @ObfuscatedName("nn")
    @ObfuscatedGetter(
            intValue = 1153945257
    )
    static int field442;
    @ObfuscatedName("nj")
    static int[] field443;
    @ObfuscatedName("nl")
    static int[] field511;
    @ObfuscatedName("nd")
    @ObfuscatedGetter(
            longValue = -2084200378230733539L
    )
    static long field466;
    @ObfuscatedName("no")
    static boolean field446;
    @ObfuscatedName("nx")
    @ObfuscatedSignature(
            descriptor = "Lvm;"
    )
    static class558 field399;
    @ObfuscatedName("ni")
    static boolean field474;
    @ObfuscatedName("nv")
    static boolean field449;
    @ObfuscatedName("nw")
    @ObfuscatedSignature(
            descriptor = "Lmu;"
    )
    static class320 field463;
    @ObfuscatedName("na")
    @ObfuscatedSignature(
            descriptor = "Lmu;"
    )
    static class320 field451;
    @ObfuscatedName("nc")
    static boolean field556;
    @ObfuscatedName("ns")
    static boolean field453;
    @ObfuscatedName("ny")
    static boolean field454;
    @ObfuscatedName("nh")
    @ObfuscatedGetter(
            intValue = 580675769
    )
    static int field455;
    @ObfuscatedName("oj")
    @ObfuscatedGetter(
            intValue = 809562193
    )
    static int field456;
    @ObfuscatedName("oz")
    @ObfuscatedGetter(
            intValue = -975593265
    )
    static int field457;
    @ObfuscatedName("oq")
    @ObfuscatedGetter(
            intValue = 2046626993
    )
    static int field458;
    @ObfuscatedName("od")
    @ObfuscatedGetter(
            intValue = -706859121
    )
    static int field459;
    @ObfuscatedName("on")
    @ObfuscatedGetter(
            intValue = 61732740
    )
    static int field460;
    @ObfuscatedName("oi")
    @ObfuscatedGetter(
            intValue = 667009728
    )
    static int field461;
    @ObfuscatedName("om")
    @ObfuscatedGetter(
            intValue = -1073303104
    )
    static int field462;
    @ObfuscatedName("ot")
    @ObfuscatedSignature(
            descriptor = "Ldp;"
    )
    static class84 field340;
    @ObfuscatedName("ov")
    @ObfuscatedSignature(
            descriptor = "Ldp;"
    )
    static class84 field318;
    @ObfuscatedName("of")
    @ObfuscatedSignature(
            descriptor = "Lcf;"
    )
    static class54 field465;
    @ObfuscatedName("or")
    static int[] c_xtea;
    @ObfuscatedName("os")
    static byte[] field472;
    @ObfuscatedName("ox")
    @ObfuscatedGetter(
            intValue = 291921519
    )
    static int field468;
    @ObfuscatedName("oc")
    static int[] field469;
    @ObfuscatedName("oy")
    static boolean hadNetworkError;
    @ObfuscatedName("ol")
    @ObfuscatedSignature(
            descriptor = "Lpa;"
    )
    static class402 timer;
    @ObfuscatedName("pp")
    static int[][][] field423;
    @ObfuscatedName("pm")
    static boolean field473;
    @ObfuscatedName("ph")
    static int[][][] field447;
    @ObfuscatedName("pl")
    @ObfuscatedGetter(
            intValue = 528483789
    )
    static int field475;
    @ObfuscatedName("pw")
    @ObfuscatedGetter(
            intValue = -2086128627
    )
    static int field389;
    @ObfuscatedName("qi")
    @ObfuscatedGetter(
            intValue = -1579415165
    )
    static int field395;
    @ObfuscatedName("qt")
    @ObfuscatedGetter(
            intValue = 1215737263
    )
    static int field478;
    @ObfuscatedName("qr")
    @ObfuscatedGetter(
            intValue = 1238391243
    )
    static int field513;
    @ObfuscatedName("qv")
    @ObfuscatedGetter(
            intValue = 421950669
    )
    static int field328;
    @ObfuscatedName("qf")
    static boolean field343;
    @ObfuscatedName("qo")
    @ObfuscatedGetter(
            intValue = 2086908927
    )
    static int field482;
    @ObfuscatedName("qj")
    @ObfuscatedGetter(
            intValue = -119719139
    )
    static int field599;
    @ObfuscatedName("qc")
    @ObfuscatedGetter(
            intValue = -678540659
    )
    static int field414;
    @ObfuscatedName("qz")
    @ObfuscatedGetter(
            intValue = 1784741237
    )
    static int field548;
    @ObfuscatedName("qh")
    @ObfuscatedGetter(
            intValue = -1566631029
    )
    static int field486;
    @ObfuscatedName("qy")
    static boolean field377;
    @ObfuscatedName("qd")
    @ObfuscatedGetter(
            intValue = -1587427633
    )
    static int field488;
    @ObfuscatedName("qu")
    static boolean field489;
    @ObfuscatedName("qs")
    @ObfuscatedGetter(
            intValue = 331873649
    )
    static int field416;
    @ObfuscatedName("qq")
    @ObfuscatedGetter(
            intValue = 865675167
    )
    static int field409;
    @ObfuscatedName("qn")
    @ObfuscatedGetter(
            intValue = 1975872717
    )
    static int field492;
    @ObfuscatedName("qk")
    static int[] field493;
    @ObfuscatedName("qx")
    static int[] field494;
    @ObfuscatedName("qg")
    static int[] field495;
    @ObfuscatedName("rd")
    static int[] field496;
    @ObfuscatedName("rz")
    static int[] field497;
    @ObfuscatedName("rg")
    static int[] field498;
    @ObfuscatedName("rn")
    static int[][] field586;
    @ObfuscatedName("rf")
    static int[] field500;
    @ObfuscatedName("rt")
    static String[] field393;
    @ObfuscatedName("rq")
    @ObfuscatedGetter(
            intValue = 1067132621
    )
    static int field502;
    @ObfuscatedName("rw")
    @ObfuscatedGetter(
            intValue = -704663783
    )
    static int field503;
    @ObfuscatedName("rk")
    @ObfuscatedGetter(
            intValue = -161613583
    )
    static int field504;
    @ObfuscatedName("rm")
    @ObfuscatedGetter(
            intValue = 1339650577
    )
    static int field505;
    @ObfuscatedName("re")
    @ObfuscatedGetter(
            intValue = 1816258559
    )
    static int field506;
    @ObfuscatedName("rl")
    @ObfuscatedGetter(
            intValue = 1964298724
    )
    static int field485;
    @ObfuscatedName("rj")
    @ObfuscatedGetter(
            intValue = -1852195229
    )
    static int field508;
    @ObfuscatedName("rr")
    @ObfuscatedGetter(
            longValue = 8524252714124657013L
    )
    static long field509;
    @ObfuscatedName("ru")
    @ObfuscatedGetter(
            longValue = -906534219858289697L
    )
    static long field510;
    @ObfuscatedName("ry")
    @ObfuscatedGetter(
            intValue = 211847097
    )
    static int field552;
    @ObfuscatedName("rv")
    @ObfuscatedGetter(
            intValue = 1146048219
    )
    static int field512;
    @ObfuscatedName("rb")
    @ObfuscatedGetter(
            intValue = -1810547151
    )
    static int field337;
    @ObfuscatedName("rs")
    @ObfuscatedGetter(
            intValue = -1962638809
    )
    static int field372;
    @ObfuscatedName("rx")
    static int[] field360;
    @ObfuscatedName("ri")
    static String[] field516;
    @ObfuscatedName("rh")
    static boolean[] field439;
    @ObfuscatedName("rp")
    static int[] defaultRotations;
    @ObfuscatedName("sk")
    @ObfuscatedGetter(
            intValue = -1726867455
    )
    static int field519;
    @ObfuscatedName("sp")
    static boolean field520;
    @ObfuscatedName("sx")
    static boolean isMenuOpen;
    @ObfuscatedName("sc")
    @ObfuscatedSignature(
            descriptor = "Lxx;"
    )
    static class610 field522;
    @ObfuscatedName("sy")
    static boolean field523;
    @ObfuscatedName("ss")
    @ObfuscatedGetter(
            intValue = -1133973033
    )
    static int viewportX;
    @ObfuscatedName("sz")
    @ObfuscatedGetter(
            intValue = -889943229
    )
    static int viewportY;
    @ObfuscatedName("su")
    @ObfuscatedGetter(
            intValue = 403913315
    )
    static int field481;
    @ObfuscatedName("sw")
    @ObfuscatedGetter(
            intValue = -909941041
    )
    static int field426;
    @ObfuscatedName("sf")
    static boolean field529;
    @ObfuscatedName("st")
    @ObfuscatedGetter(
            intValue = 1167624643
    )
    static int field530;
    @ObfuscatedName("sv")
    @ObfuscatedGetter(
            intValue = 290948069
    )
    static int field407;
    @ObfuscatedName("sn")
    static String field374;
    @ObfuscatedName("sm")
    static String field533;
    @ObfuscatedName("sl")
    @ObfuscatedGetter(
            intValue = -1810103421
    )
    static int field534;
    @ObfuscatedName("sj")
    @ObfuscatedSignature(
            descriptor = "Loi;"
    )
    static class369 field536;
    @ObfuscatedName("sr")
    @ObfuscatedGetter(
            intValue = -1669673945
    )
    static int field537;
    @ObfuscatedName("sg")
    @ObfuscatedGetter(
            intValue = 917665723
    )
    static int field557;
    @ObfuscatedName("se")
    @ObfuscatedSignature(
            descriptor = "Loi;"
    )
    static class369 field445;
    @ObfuscatedName("tq")
    static boolean field540;
    @ObfuscatedName("tg")
    @ObfuscatedGetter(
            intValue = 1741851993
    )
    static int field541;
    @ObfuscatedName("td")
    @ObfuscatedGetter(
            intValue = -1398485149
    )
    static int field542;
    @ObfuscatedName("tk")
    static boolean field543;
    @ObfuscatedName("tp")
    @ObfuscatedGetter(
            intValue = -125777565
    )
    static int field544;
    @ObfuscatedName("tl")
    @ObfuscatedGetter(
            intValue = -997930977
    )
    static int field545;
    @ObfuscatedName("tw")
    static boolean field546;
    @ObfuscatedName("tj")
    static int[] field547;
    @ObfuscatedName("tn")
    @ObfuscatedGetter(
            intValue = 1949112271
    )
    static int field452;
    @ObfuscatedName("tm")
    static int[] field549;
    @ObfuscatedName("tt")
    @ObfuscatedGetter(
            intValue = 1927380943
    )
    static int field535;
    @ObfuscatedName("ta")
    static int[] field532;
    @ObfuscatedName("tu")
    @ObfuscatedGetter(
            intValue = -529782765
    )
    static int field332;
    @ObfuscatedName("tf")
    static int[] field538;
    @ObfuscatedName("ts")
    @ObfuscatedGetter(
            intValue = -1787880695
    )
    static int field554;
    @ObfuscatedName("te")
    @ObfuscatedGetter(
            intValue = 469301589
    )
    static int field555;
    @ObfuscatedName("tx")
    @ObfuscatedGetter(
            intValue = 1487779339
    )
    static int field363;
    @ObfuscatedName("to")
    @ObfuscatedGetter(
            intValue = 736785051
    )
    static int field352;
    @ObfuscatedName("tz")
    @ObfuscatedGetter(
            intValue = -1916481829
    )
    static int field484;
    @ObfuscatedName("tv")
    @ObfuscatedGetter(
            intValue = 63095057
    )
    static int field559;
    @ObfuscatedName("tb")
    @ObfuscatedGetter(
            intValue = 657702577
    )
    static int field560;
    @ObfuscatedName("ti")
    @ObfuscatedGetter(
            intValue = -893776771
    )
    static int field561;
    @ObfuscatedName("uy")
    @ObfuscatedSignature(
            descriptor = "Lxp;"
    )
    static class609 field501;
    @ObfuscatedName("up")
    @ObfuscatedGetter(
            intValue = -1222851675
    )
    static int rootWidgetCount;
    @ObfuscatedName("uu")
    @ObfuscatedGetter(
            intValue = 1678776695
    )
    static int field450;
    @ObfuscatedName("ud")
    static boolean[] field436;
    @ObfuscatedName("uc")
    static boolean[] field566;
    @ObfuscatedName("un")
    static boolean[] field356;
    @ObfuscatedName("ul")
    static int[] rootWidgetPos1;
    @ObfuscatedName("ux")
    static int[] rootWidgetPos2;
    @ObfuscatedName("uo")
    static int[] rootWidgetPos3;
    @ObfuscatedName("ui")
    static int[] rootWidgetPos4;
    @ObfuscatedName("ut")
    @ObfuscatedGetter(
            intValue = -66048959
    )
    static int gameDrawingMode;
    @ObfuscatedName("uj")
    static int[] field425;
    @ObfuscatedName("uz")
    static long[] field574;
    @ObfuscatedName("uq")
    @ObfuscatedGetter(
            intValue = 434688723
    )
    static int field575;
    @ObfuscatedName("ub")
    @ObfuscatedGetter(
            intValue = -1415757783
    )
    static int field576;
    @ObfuscatedName("ue")
    @ObfuscatedGetter(
            intValue = 384858289
    )
    static int field577;
    @ObfuscatedName("ug")
    static int[] field578;
    @ObfuscatedName("us")
    static int[] field507;
    @ObfuscatedName("ua")
    @ObfuscatedSignature(
            descriptor = "[Lxt;"
    )
    static class605[] field580;
    @ObfuscatedName("uf")
    @ObfuscatedGetter(
            intValue = 200099919
    )
    static int field581;
    @ObfuscatedName("um")
    @ObfuscatedGetter(
            intValue = -2016141117
    )
    static int field531;
    @ObfuscatedName("uh")
    @ObfuscatedGetter(
            intValue = 182080851
    )
    static int field583;
    @ObfuscatedName("uk")
    @ObfuscatedGetter(
            intValue = -1997385273
    )
    static int field584;
    @ObfuscatedName("vj")
    @ObfuscatedGetter(
            intValue = -71360733
    )
    static int field585;
    @ObfuscatedName("vr")
    static boolean field553;
    @ObfuscatedName("vi")
    static boolean field587;
    @ObfuscatedName("vc")
    static boolean field588;
    @ObfuscatedName("vl")
    @ObfuscatedSignature(
            descriptor = "Lvg;"
    )
    static class551 field589;
    @ObfuscatedName("va")
    @ObfuscatedSignature(
            descriptor = "Lvy;"
    )
    static class550 field514;
    @ObfuscatedName("vq")
    @ObfuscatedSignature(
            descriptor = "Lvy;"
    )
    static class550 field477;
    @ObfuscatedName("ve")
    static boolean[] field610;
    @ObfuscatedName("vw")
    static int[] field593;
    @ObfuscatedName("vp")
    static int[] field594;
    @ObfuscatedName("wa")
    static int[] field595;
    @ObfuscatedName("wo")
    static int[] field406;
    @ObfuscatedName("wv")
    @ObfuscatedGetter(
            intValue = -1575623101
    )
    static int field479;
    @ObfuscatedName("wj")
    @ObfuscatedGetter(
            intValue = 1980250727
    )
    static int field569;
    @ObfuscatedName("ws")
    @ObfuscatedSignature(
            descriptor = "Lvh;"
    )
    static class547 field418;
    @ObfuscatedName("wr")
    @ObfuscatedSignature(
            descriptor = "Lsj;"
    )
    static class490 field603;
    @ObfuscatedName("wu")
    static List field601;
    @ObfuscatedName("wq")
    static ArrayList field602;
    @ObfuscatedName("wi")
    @ObfuscatedGetter(
            intValue = 2664197
    )
    static int field487;
    @ObfuscatedName("wl")
    @ObfuscatedGetter(
            intValue = -1433097675
    )
    static int field604;
    @ObfuscatedName("wm")
    static int[] field605;
    @ObfuscatedName("wk")
    static int[] field606;

    static {
        field571 = class131.field1596;
        field330 = class595.field5970;
        Login_isUsernameRemembered = false;
        field387 = new HashMap();
        field333 = new class73();
        field334 = new class436();
        field335 = new class88();
        field336 = 0;
        field558 = 50;
        field338 = 12;
        field339 = 6;
        showMouseCross = true;
        field341 = 0;
        field342 = true;
        field491 = -1;
        field344 = 0;
        field345 = "";
        field346 = -1;
        field347 = -1;
        field348 = -1;
        field391 = true;
        field350 = 0;
        field539 = new int[25];
        field402 = new int[25];
        field353 = new int[25];
        field615 = new int[25];
        field355 = false;
        field527 = true;
        field357 = 0;
        field358 = null;
        field359 = 0L;
        isResizable = true;
        field361 = 600;
        field362 = field361 / class34.field190;
        field551 = new class274();
        field598 = new class272();
        field365 = new class162[4];
        field582 = new class171[4];
        field367 = 256;
        field368 = 205;
        field369 = 256;
        field370 = 320;
        field371 = 1;
        field364 = 32767;
        field419 = 1;
        field382 = 32767;
        field375 = 0;
        field597 = 0;
        field313 = 0;
        field378 = 0;
        field379 = 0;
        field380 = new class421[8];
        field381 = new class42();
        field316 = -1;
        field432 = -1;
        field384 = 30;
        field385 = 0;
        field354 = 0;
        field565 = false;
        field388 = -1;
        clientType = -1;
        field390 = -1;
        field591 = false;
        field392 = true;
        field567 = 0;
        field394 = 1L;
        field386 = -1;
        field396 = -1;
        field397 = -1L;
        hadFocus = true;
        rebootTimer = 0;
        field400 = false;
        field401 = class70.field969;
        js5ConnectState = 0;
        field526 = 0;
        field405 = 0;
        field351 = 0;
        field448 = 0;
        field464 = 0;
        logoutTimer = 0;
        field410 = 0;
        field411 = 1;
        field329 = 0;
        field413 = 1;
        field476 = 0;
        field415 = 128;
        field424 = 0;
        field417 = 0;
        field420 = 0;
        field515 = 0;
        field366 = 0;
        rootInterface = -1;
        field422 = new class428(8);
        field324 = 0;
        field573 = -1;
        field564 = null;
        field592 = 0;
        field490 = 0;
        field428 = 0;
        field429 = -1;
        field430 = false;
        field404 = 1;
        field525 = 0;
        field550 = 0;
        field434 = new class436();
        field435 = new class436();
        field614 = new class436();
        field437 = new class436();
        field438 = new class428(512);
        field444 = 0;
        field440 = 0;
        field441 = "";
        field442 = 0;
        field443 = new int[128];
        field511 = new int[128];
        field466 = -1L;
        field446 = false;
        field399 = new class558();
        field474 = false;
        field449 = false;
        field463 = new class320(64);
        field451 = new class320(64);
        field556 = false;
        field453 = false;
        field454 = false;
        field455 = 0;
        field456 = 0;
        field457 = 0;
        field458 = 0;
        field459 = 0;
        field460 = 0;
        field461 = 0;
        field462 = 0;
        field340 = class84.field1213;
        field318 = class84.field1213;
        field465 = new class54();
        c_xtea = new int[4];
        field472 = null;
        field468 = 0;
        field469 = new int[250];
        hadNetworkError = false;
        timer = new class402();
        field423 = new int[4][13][13];
        field473 = false;
        field447 = new int[4][13][13];
        field475 = -1;
        field389 = 0;
        field395 = 2301979;
        field478 = 5063219;
        field513 = 3353893;
        field328 = 7759444;
        field343 = false;
        field482 = 0;
        field599 = 0;
        field414 = 0;
        field548 = 0;
        field486 = 0;
        field377 = false;
        field488 = 0;
        field489 = false;
        field416 = 0;
        field409 = 0;
        field492 = 50;
        field493 = new int[field492];
        field494 = new int[field492];
        field495 = new int[field492];
        field496 = new int[field492];
        field497 = new int[field492];
        field498 = new int[field492];
        field586 = new int[field492][];
        field500 = new int[field492];
        field393 = new String[field492];
        field502 = 0;
        field503 = -1;
        field504 = -1;
        field505 = 0;
        field506 = 0;
        field485 = 0;
        field508 = 0;
        field509 = -1L;
        field510 = -1L;
        field552 = 0;
        field512 = 0;
        field337 = 0;
        field372 = 0;
        field360 = new int[1000];
        field516 = new String[8];
        field439 = new boolean[8];
        defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
        field519 = -1;
        field520 = false;
        isMenuOpen = false;
        field522 = new class610(true);
        field523 = false;
        viewportX = -1;
        viewportY = -1;
        field481 = 0;
        field426 = 50;
        field528 = null;
        field529 = false;
        field530 = -1;
        field407 = -1;
        field374 = null;
        field533 = null;
        field534 = 0;
        field612 = null;
        field536 = null;
        field537 = 0;
        field557 = 0;
        field445 = null;
        field540 = false;
        field541 = -1;
        field542 = -1;
        field543 = false;
        field544 = -1;
        field545 = -1;
        field546 = false;
        field547 = new int[32];
        field452 = 0;
        field549 = new int[32];
        field535 = 0;
        field532 = new int[32];
        field332 = 0;
        field538 = new int[32];
        field554 = 0;
        field555 = 0;
        field363 = 0;
        field352 = 0;
        field484 = 0;
        field559 = 0;
        field560 = 0;
        field561 = 0;
        field501 = new class609();
        rootWidgetCount = 0;
        field450 = -2;
        field436 = new boolean[100];
        field566 = new boolean[100];
        field356 = new boolean[100];
        rootWidgetPos1 = new int[100];
        rootWidgetPos2 = new int[100];
        rootWidgetPos3 = new int[100];
        rootWidgetPos4 = new int[100];
        gameDrawingMode = 0;
        field425 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
        field574 = new long[100];
        field575 = 0;
        field576 = -1;
        field577 = 0;
        field578 = new int[1000];
        field507 = new int[1000];
        field580 = new class605[1000];
        field581 = 0;
        field531 = 0;
        field583 = -1;
        field584 = 0;
        field585 = 0;
        field553 = false;
        field587 = false;
        field588 = false;
        field589 = null;
        field514 = null;
        field477 = null;
        field610 = new boolean[5];
        field593 = new int[5];
        field594 = new int[5];
        field595 = new int[5];
        field406 = new int[5];
        field479 = -1;
        field569 = -1;
        field418 = new class545();
        field603 = new class490(8, Players.field5351);
        field601 = new ArrayList();
        field602 = new ArrayList(10);
        field487 = 0;
        field604 = 0;
        field605 = new int[50];
        field606 = new int[50];
        class585.field5890 = 233;
    }

    @ObfuscatedName("wn")
    String field607;
    @ObfuscatedName("wf")
    @ObfuscatedSignature(
            descriptor = "Lar;"
    )
    InterfaceParent field608;
    @ObfuscatedName("wb")
    @ObfuscatedSignature(
            descriptor = "Lag;"
    )
    class18 field609;
    @ObfuscatedName("wt")
    OtlTokenRequester field480;
    @ObfuscatedName("wy")
    Future field611;
    @ObfuscatedName("we")
    boolean field349 = false;
    @ObfuscatedName("wp")
    @ObfuscatedGetter(
            intValue = 1648047689
    )
    int field600 = 0;
    @ObfuscatedName("wz")
    @ObfuscatedSignature(
            descriptor = "Lag;"
    )
    class18 field483;
    @ObfuscatedName("wh")
    RefreshAccessTokenRequester field562;
    @ObfuscatedName("ww")
    Future field616;
    @ObfuscatedName("xf")
    @ObfuscatedSignature(
            descriptor = "Lwb;"
    )
    Buffer field617;
    @ObfuscatedName("xw")
    @ObfuscatedSignature(
            descriptor = "Las;"
    )
    class7 field618;
    @ObfuscatedName("xv")
    @ObfuscatedGetter(
            longValue = 5950739475798124899L
    )
    long field619 = -1L;

    @ObfuscatedName("af")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "-1720609329"
    )
    public static void method1114() {
        class179.field1968.method7011();
    }

    @ObfuscatedName("aw")
    @ObfuscatedSignature(
            descriptor = "(IB)Liy;",
            garbageValue = "2"
    )
    public static class214 method1287(int var0) {
        class214 var1 = (class214) class214.field2443.method7018((long) var0);
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = class181.field1977.method8335(4, var0);
            var1 = new class214();
            if (var2 != null) {
                var1.method4751(new Buffer(var2), var0);
            }

            var1.method4737();
            class214.field2443.method7009(var1, (long) var0);
            return var1;
        }
    }

    @ObfuscatedName("aw")
    @ObfuscatedSignature(
            descriptor = "(IB)I",
            garbageValue = "-13"
    )
    public static int method1134(int var0) {
        return class336.field3845[var0];
    }

    @ObfuscatedName("ag")
    @ObfuscatedSignature(
            descriptor = "(B)V",
            garbageValue = "19"
    )
    protected final void resizeGame() {
        field359 = class189.method4284() + 500L;
        this.resizeJS();
        if (rootInterface != -1) {
            this.resizeRoot(true);
        }

    }

    @ObfuscatedName("ba")
    @ObfuscatedSignature(
            descriptor = "(B)V",
            garbageValue = "0"
    )
    protected final void setUp() {
        int[] var1 = new int[]{20, 260, 10000};
        int[] var2 = new int[]{1000, 100, 500};
        if (var1 != null && var2 != null) {
            class482.ByteArrayPool_alternativeSizes = var1;
            class476.ByteArrayPool_altSizeArrayCounts = new int[var1.length];
            class67.ByteArrayPool_arrays = new byte[var1.length][][];

            for (int var3 = 0; var3 < class482.ByteArrayPool_alternativeSizes.length; ++var3) {
                class67.ByteArrayPool_arrays[var3] = new byte[var2[var3]][];
                class482.field5331.add(var1[var3]);
            }

            Collections.sort(class482.field5331);
        } else {
            class482.ByteArrayPool_alternativeSizes = null;
            class476.ByteArrayPool_altSizeArrayCounts = null;
            class67.ByteArrayPool_arrays = null;
            class482.field5331.clear();
            class482.field5331.add(100);
            class482.field5331.add(5000);
            class482.field5331.add(10000);
            class482.field5331.add(30000);
        }

        class509.isBetaBuild = class505.method10134(field385, class582.field5865);
        class431.field5089 = field354 == 0 ? 'ꩊ' : worldId + '鱀';
        class545.field5606 = field354 == 0 ? 443 : worldId + '썐';
        class151.field1770 = class431.field5089;
        class30.field149 = class367.field4125;
        class365.field4074 = class367.field4120;
        class365.field4075 = class367.field4119;
        class365.field4076 = class367.field4121;
        class114.field1507 = new class120(this.field349, 233);
        this.method512();
        this.method517();
        class146.field1728 = this.method663();
        this.method547(field598, 0);
        this.method547(field551, 1);
        this.method511();
        class75.field1073 = new class515(255, class260.field3111, class260.field3108, 750000);
        class565 var4 = null;
        class78 var5 = new class78();

        try {
            var4 = class33.method501("", StudioGame.field5084.field4419, false);
            byte[] var6 = new byte[(int) var4.method10905()];

            int var8;
            for (int var7 = 0; var7 < var6.length; var7 += var8) {
                var8 = var4.method10894(var6, var7, var6.length - var7);
                if (var8 == -1) {
                    throw new IOException();
                }
            }

            var5 = new class78(new Buffer(var6));
        } catch (Exception var11) {
        }

        try {
            if (var4 != null) {
                var4.method10891();
            }
        } catch (Exception var10) {
        }

        class36.clientPreferences = var5;
        String var12 = class34.field180;
        class31.field158 = this;
        if (var12 != null) {
            class31.field159 = var12;
        }

        class208.setWindowedMode(class36.clientPreferences.method2574());
        class40.field279 = new FriendSystem(class92.loginType);
        this.field608 = new InterfaceParent("tokenRequest", 1, 1);
        class184.method4205(this);
        field317.method6343();
        class219 var13 = new class219(3, 1, 0);
        var13.method4840(-64, -8, 64);
        var13.method4840(64, -8, 64);
        var13.method4840(0, -8, -24);
        var13.method4841(0, 2, 1, (byte) 1, (byte) -1, (short) 10173, (short) -1);
        class289.field3341 = var13.method4854(1, 32, 0, -128, 0);
        class556.field5748 = var13.method4854(64, 850, -30, -50, -30);
    }

    @ObfuscatedName("bb")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "-746677036"
    )
    protected final void process() {
        ++cycle;
        this.method809();

        while (true) {
            class407 var1;
            synchronized (class408.field4904) {
                var1 = (class407) class408.field4908.method8716();
            }

            if (var1 == null) {
                boolean var5 = false;
                boolean var6 = false;
                if (!class339.field3892.isEmpty()) {
                    System.out.println(" midi section ");

                    class477 var4 = (class477) class339.field3892.get(0);
                    if (var4 == null) {
                        class339.field3892.remove(0);
                    } else if (var4.vmethod9673()) {
                        if (var4.method9658()) {
                            System.out.println("Error in midimanager.service: " + var4.method9662());
                            var5 = true;
                        } else {
                            if (var4.method9664() != null) {
                                class339.field3892.add(1, var4.method9664());
                            }

                            var6 = var4.method9661();
                        }

                        class339.field3892.remove(0);
                    } else {
                        var6 = var4.method9661();
                    }
                }

                if (var5) {
                    class339.field3892.clear();
                    class231.method5344();
                }

                if (var6 && field446 && class70.field963 != null) {
                    class70.field963.method3050();
                }

                class125.method3557();
                field551.method6120();
                this.method664();
                class180.method4161();
                if (class146.field1728 != null) {
                    int var9 = class146.field1728.vmethod5934();
                    field550 = var9;
                }

                if (gameState == 0) {
                    FriendSystem.method1534();
                    class144.method3738();
                } else if (gameState == 5) {
                    class267.method6042(class342.field3947, class463.field5239);
                    FriendSystem.method1534();
                    class144.method3738();
                } else if (gameState != 10 && gameState != 11) {
                    //..System.out.println("Not 10 or 11 ");
                    if (gameState == 20) {
                        //..System.out.println("Hit 20 ");
                        class267.method6042(class342.field3947, class463.field5239);
                        this.doCycleLoggedOut();
                    } else if (gameState == 50) {
                        //..System.out.println("Hit 50 ");
                        class267.method6042(class342.field3947, class463.field5239);
                        this.doCycleLoggedOut();
                    } else if (gameState == 25) {
                        //..Doesnt ever really get here yet
                        //..System.out.println("IN GAME STATE 25 checking field field556: " + field556);
                        if (field556) {
                            class475.method9655();
                        }

                        //..System.out.println("IN GAME STATE 25 checking field field453: " + field453);
                        if (field453) {
                            class422.method8537(class243.field2978);
                        }

                        if (!field453 && !field556) {
                            System.out.println("SETTING FIELD 30 " + field453);
                            class121.updateGameState(30);
                        }
                    }
                } else {
                    class267.method6042(class342.field3947, class463.field5239);
                }

                if (gameState == 30) {
                    System.out.println("game cycle");
                    this.doCycleLoggedIn();
                } else if (gameState == 40 || gameState == 45) {
                    System.out.println("login cycle");
                    this.doCycleLoggedOut();
                }

                return;
            }

            var1.field4899.method8286(var1.field4897, (int) var1.field5600, var1.field4896, false);
        }
    }

    @ObfuscatedName("bo")
    @ObfuscatedSignature(
            descriptor = "(ZI)V",
            garbageValue = "2034911949"
    )
    protected final void draw(boolean var1) {
        class195.method4381();
        if ((gameState == 10 || gameState == 20 || gameState == 30) && 0L != field359 && class189.method4284() > field359) {
            System.out.println("Setting window mode to " + class35.getWindowedMode());
            class208.setWindowedMode(class35.getWindowedMode());
        }

        int var2;
        if (var1) {
            for (var2 = 0; var2 < 100; ++var2) {
                field436[var2] = true;
            }
        }

        if (gameState == 0) {
            this.drawInitial(class52.field733, class52.field730, var1, class55.field793);
        } else if (gameState == 5) {
            class505.drawLoadingScreen(class333.field3831, class342.field3947, class463.field5239);
        } else if (gameState != 10 && gameState != 11) {
            if (gameState == 20) {
                class505.drawLoadingScreen(class333.field3831, class342.field3947, class463.field5239);
            } else if (gameState == 50) {
                class505.drawLoadingScreen(class333.field3831, class342.field3947, class463.field5239);
            } else if (gameState == 25) {
                if (field556) {
                    if (field476 == 1) {
                        if (field410 > field411) {
                            field411 = field410;
                        }

                        var2 = (field411 * 50 - field410 * 50) / field411;
                        class464.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
                    } else if (field476 == 2) {
                        if (field329 > field413) {
                            field413 = field329;
                        }

                        var2 = (field413 * 50 - field329 * 50) / field413 + 50;
                        class464.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var2 + "%" + ")", false);
                    } else {
                        class464.drawLoadingMessage("Loading - please wait.", false);
                    }
                }
            } else if (gameState == 30) {
                this.drawLoggedIn();
            } else if (gameState == 40) {
                class464.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
            } else if (gameState == 45) {
                class464.drawLoadingMessage("Please wait...", false);
            }
        } else {
            class505.drawLoadingScreen(class333.field3831, class342.field3947, class463.field5239);
        }

        if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
            for (var2 = 0; var2 < rootWidgetCount; ++var2) {
                if (field566[var2]) {
                    class34.rasterProvider.draw(rootWidgetPos1[var2], rootWidgetPos2[var2], rootWidgetPos3[var2], rootWidgetPos4[var2]);
                    field566[var2] = false;
                }
            }
        } else if (gameState > 0) {
            class34.rasterProvider.drawFull(0, 0);

            for (var2 = 0; var2 < rootWidgetCount; ++var2) {
                field566[var2] = false;
            }
        }

    }

    @ObfuscatedName("bl")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "1798389214"
    )
    protected final void isRunning() {
        if (class516.varcs != null && class516.varcs.hasUnwrittenChanges()) {
            class516.varcs.write();
        }

        if (class398.mouseRecorder != null) {
            class398.mouseRecorder.isRunning = false;
        }

        class398.mouseRecorder = null;
        packetWriter.close();
        if (class35.field226 != null) {
            synchronized (class35.field226) {
                class35.field226 = null;
            }
        }

        class146.field1728 = null;
        if (class70.field963 != null) {
            class70.field963.method3051();
        }

        class297.field3418.method8454();
        class137.method3667();
        if (class114.field1507 != null) {
            class114.field1507.method3504();
            class114.field1507 = null;
        }

        class22.method326();
        this.field608.method177();
    }

    @ObfuscatedName("bv")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "6314826"
    )
    protected final void vmethod793() {
    }

    @ObfuscatedName("pb")
    @ObfuscatedSignature(
            descriptor = "(I)Z",
            garbageValue = "2146188991"
    )
    boolean method796() {
        return this.field600 == 1;
    }

    @ObfuscatedName("pe")
    @ObfuscatedSignature(
            descriptor = "(I)Z",
            garbageValue = "-1275121860"
    )
    boolean method799() {
        return class274.field3221 != null && !class274.field3221.trim().isEmpty() && class263.field3124 != null && !class263.field3124.trim().isEmpty();
    }

    @ObfuscatedName("pl")
    @ObfuscatedSignature(
            descriptor = "(I)Z",
            garbageValue = "987459253"
    )
    boolean method800() {
        return class304.field3472 != null && !class304.field3472.trim().isEmpty() && class186.field2025 != null && !class186.field2025.trim().isEmpty();
    }

    @ObfuscatedName("pw")
    @ObfuscatedSignature(
            descriptor = "(I)Z",
            garbageValue = "-1900067826"
    )
    boolean method1413() {
        return this.field480 != null;
    }

    @ObfuscatedName("py")
    @ObfuscatedSignature(
            descriptor = "(Ljava/lang/String;I)V",
            garbageValue = "1032461645"
    )
    void method910(String var1) throws IOException {
        HashMap var2 = new HashMap();
        var2.put("grant_type", "refresh_token");
        var2.put("scope", "gamesso.token.create");
        var2.put("refresh_token", var1);
        URL var3 = new URL(UserComparator5.field1615 + "shield/oauth/token" + (new class534(var2)).method10508());
        class484 var4 = new class484();
        if (this.method796()) {
            var4.method9750(field319);
        } else {
            var4.method9750(field590);
        }

        var4.method9741("Host", (new URL(UserComparator5.field1615)).getHost());
        var4.method9747(class531.field5555);
        class9 var5 = class9.field34;
        RefreshAccessTokenRequester var6 = this.field562;
        if (var6 != null) {
            this.field616 = var6.request(var5.method69(), var3, var4.method9740(), "");
        } else {
            class10 var7 = new class10(var3, var5, var4, this.field349);
            this.field483 = this.field608.method182(var7);
        }
    }

    @ObfuscatedName("pn")
    @ObfuscatedSignature(
            descriptor = "(Ljava/lang/String;I)V",
            garbageValue = "-427787375"
    )
    void method803(String var1) throws IOException {
        URL var2 = new URL(UserComparator5.field1615 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
        class484 var3 = new class484();
        var3.method9744(var1);
        class9 var4 = class9.field30;
        OtlTokenRequester var5 = this.field480;
        if (var5 != null) {
            this.field611 = var5.request(var4.method69(), var2, var3.method9740(), "");
        } else {
            class10 var6 = new class10(var2, var4, var3, this.field349);
            this.field609 = this.field608.method182(var6);
        }
    }

    @ObfuscatedName("px")
    @ObfuscatedSignature(
            descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
            garbageValue = "-37"
    )
    void method804(String var1, String var2) throws IOException, JSONException {
        URL var3 = new URL(class276.field3255 + "game-session/v1/tokens");
        class10 var4 = new class10(var3, class9.field34, this.field349);
        var4.method105().method9744(var1);
        var4.method105().method9747(class531.field5555);
        JSONObject var5 = new JSONObject();
        var5.method11962("accountId", var2);
        var4.method87(new class533(var5));
        this.field609 = this.field608.method182(var4);
    }

    @ObfuscatedName("pk")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "-2109219510"
    )
    void method809() {
        if (gameState != 1000) {
            boolean var1 = class297.field3418.method8445();
            if (!var1) {
                this.method951();
            }

        }
    }

    @ObfuscatedName("pf")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "433360115"
    )
    void method951() {
        if (class297.field3418.crcMissmatch >= 4) {
            this.method542("js5crc");
            class121.updateGameState(1000);
        } else {
            if (class297.field3418.ioException >= 4) {
                if (gameState <= 5) {
                    this.method542("js5io");
                    class121.updateGameState(1000);
                    return;
                }

                field526 = 3000;
                class297.field3418.ioException = 3;
            }

            if (--field526 + 1 <= 0) {
                try {
                    if (js5ConnectState == 0) {
                        js5SocketTask = class122.field1566.newSocketTask(class35.worldHost, class151.field1770);
                        ++js5ConnectState;
                    }

                    if (js5ConnectState == 1) {
                        if (js5SocketTask.status == 2) {
                            this.js5Error(-1);
                            return;
                        }

                        if (js5SocketTask.status == 1) {
                            ++js5ConnectState;
                        }
                    }

                    if (js5ConnectState == 2) {
                        Socket var2 = (Socket) js5SocketTask.field3155;
                        class512 var1 = new class512(var2, 40000, 5000);
                        class114.field1503 = var1;
                        Buffer var3 = new Buffer(class331.field3811.field3820 + 1);
                        var3.writeByte(class331.field3811.field3819);
                        var3.writeIntBigEndian(233);
                        var3.writeIntBigEndian(c_xtea[0]);
                        var3.writeIntBigEndian(c_xtea[1]);
                        var3.writeIntBigEndian(c_xtea[2]);
                        var3.writeIntBigEndian(c_xtea[3]);
                        class114.field1503.vmethod10197(var3.array, 0, class331.field3811.field3820 + 1);
                        ++js5ConnectState;
                        class179.field1970 = class189.method4284();
                    }

                    if (js5ConnectState == 3) {
                        if (class114.field1503.available() > 0) {
                            int var4 = class114.field1503.readUnsignedByte();
                            if (var4 != 0) {
                                this.js5Error(var4);
                                return;
                            }

                            ++js5ConnectState;
                        } else if (class189.method4284() - class179.field1970 > 30000L) {
                            this.js5Error(-2);
                            return;
                        }
                    }

                    if (js5ConnectState == 4) {
                        class297.field3418.method8451(class114.field1503, gameState > 20);
                        js5SocketTask = null;
                        class114.field1503 = null;
                        js5ConnectState = 0;
                        field405 = 0;
                    }
                } catch (IOException var5) {
                    this.js5Error(-3);
                }

            }
        }
    }

    @ObfuscatedName("pv")
    @ObfuscatedSignature(
            descriptor = "(II)V",
            garbageValue = "-987634463"
    )
    void js5Error(int var1) {
        js5SocketTask = null;
        class114.field1503 = null;
        js5ConnectState = 0;
        if (class431.field5089 == class151.field1770) {
            class151.field1770 = class545.field5606;
        } else {
            class151.field1770 = class431.field5089;
        }

        ++field405;
        if (field405 >= 2 && (var1 == 7 || var1 == 9)) {
            if (gameState <= 5) {
                this.method542("js5connect_full");
                class121.updateGameState(1000);
            } else {
                field526 = 3000;
            }
        } else if (field405 >= 2 && var1 == 6) {
            this.method542("js5connect_outofdate");
            class121.updateGameState(1000);
        } else if (field405 >= 4) {
            if (gameState <= 5) {
                this.method542("js5connect");
                class121.updateGameState(1000);
            } else {
                field526 = 3000;
            }
        }

    }

    @ObfuscatedName("ql")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "718805315"
    )
    final void doCycleLoggedOut() {
        Object var1 = packetWriter.getSocket(); //..AbstractSocket
        PacketBuffer var2 = packetWriter.packetBuffer;

        try {
            System.out.println("Doing logged out cycle @ state: " + (class333.loginState.hashCode()));

            if (class333.loginState == class43.field296/* 1209294598 */) {
                System.out.println("[Outgoing] Hit logged out state: class43.field296 - " + class43.field296.hashCode());
                if (class121.field1561 == null && (field465.method1975() || field351 > 250)) {
                    class121.field1561 = field465.method1976();
                    field465.method1973();
                    field465 = null;
                }

                HitSplatDefinition.method10432(class43.field288);

                if (class121.field1561 != null) {
                    System.out.println("Hit here 99999999");

                    if (var1 != null) {
                        ((class511) var1).vmethod10196();
                        var1 = null;
                    }

                    class412.field4979 = null;
                    hadNetworkError = false;
                    field351 = 0;
                    if (field330.method11512()) {
                        System.out.println("9283928928323 method11512");
                        if (this.method799()) {
                            try {
                                this.method910(class263.field3124);
                                HitSplatDefinition.method10432(class43.field309);
                            } catch (Throwable var23) {
                                class508.RunException_sendStackTrace((String) null, var23);
                                class211.loginResponse(65);
                                return;
                            }
                        } else {
                            if (!this.method800()) {
                                class211.loginResponse(65);
                                return;
                            }

                            try {
                                this.method804(class304.field3472, class186.field2025);
                                HitSplatDefinition.method10432(class43.field308);
                            } catch (Exception var22) {
                                class508.RunException_sendStackTrace((String) null, var22);
                                class211.loginResponse(65);
                                return;
                            }
                        }
                    } else {
                        HitSplatDefinition.method10432(class43.field288);
                    }
                }
            }

            class20 var25;
            if (class43.field309 == class333.loginState) {
                System.out.println("[Outgoing] Hit logged out state: class43.field309 - " + class43.field309.hashCode());

                if (this.field616 != null) {
                    if (!this.field616.isDone()) {
                        return;
                    }

                    if (this.field616.isCancelled()) {
                        class211.loginResponse(65);
                        this.field616 = null;
                        return;
                    }

                    try {
                        RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse) this.field616.get();
                        if (!var3.isSuccess()) {
                            System.out.println("Returning bad token response");
                            class211.loginResponse(65);
                            this.field616 = null;
                            return;
                        }

                        class274.field3221 = var3.getAccessToken();
                        class263.field3124 = var3.getRefreshToken();
                        this.field616 = null;
                    } catch (Exception var21) {
                        class508.RunException_sendStackTrace((String) null, var21);
                        class211.loginResponse(65);
                        this.field616 = null;
                        return;
                    }
                } else {
                    System.out.println("Hit here 12121212121212");

                    if (this.field483 == null) {
                        class211.loginResponse(65);
                        return;
                    }

                    if (!this.field483.method277()) {
                        return;
                    }

                    if (this.field483.method276()) {
                        class508.RunException_sendStackTrace(this.field483.method274(), (Throwable) null);
                        class211.loginResponse(65);
                        this.field483 = null;
                        return;
                    }

                    var25 = this.field483.method280();
                    if (var25.method301() != 200) {
                        class211.loginResponse(65);
                        this.field483 = null;
                        return;
                    }

                    field351 = 0;
                    class533 var4 = new class533(var25.method308());

                    try {
                        System.out.println("lgin Parsing access tokens");

                        class274.field3221 = var4.method10493().getString("access_token");
                        class263.field3124 = var4.method10493().getString("refresh_token");
                    } catch (Exception var20) {
                        System.out.println("Error parsing tokens");

                        class508.RunException_sendStackTrace("Error parsing tokens", var20);
                        class211.loginResponse(65);
                        this.field483 = null;
                        return;
                    }
                }

                this.method803(class274.field3221);
                HitSplatDefinition.method10432(class43.field308);
            }

            if (class333.loginState == class43.field308) {
                System.out.println("[Outgoing] Hit logged out state: class43.field308 - " + class43.field308.hashCode());

                if (this.field611 != null) {
                    if (!this.field611.isDone()) {
                        return;
                    }

                    if (this.field611.isCancelled()) {
                        class211.loginResponse(65);
                        this.field611 = null;
                        return;
                    }

                    try {
                        OtlTokenResponse var26 = (OtlTokenResponse) this.field611.get();
                        if (!var26.isSuccess()) {
                            class211.loginResponse(65);
                            this.field611 = null;
                            return;
                        }

                        this.field607 = var26.getToken();
                        this.field611 = null;
                    } catch (Exception var19) {
                        class508.RunException_sendStackTrace((String) null, var19);
                        class211.loginResponse(65);
                        this.field611 = null;
                        return;
                    }
                } else {
                    if (this.field609 == null) {
                        class211.loginResponse(65);
                        return;
                    }

                    if (!this.field609.method277()) {
                        return;
                    }

                    if (this.field609.method276()) {
                        class508.RunException_sendStackTrace(this.field609.method274(), (Throwable) null);
                        class211.loginResponse(65);
                        this.field609 = null;
                        return;
                    }

                    var25 = this.field609.method280();
                    if (var25.method301() != 200) {
                        class508.RunException_sendStackTrace("Login authentication error. Response code: " + var25.method301() + " " + var25.method302() + " Response body: " + var25.method308(), (Throwable) null);
                        class211.loginResponse(65);
                        this.field609 = null;
                        return;
                    }

                    List var28 = (List) var25.method300().get("Content-Type");
                    if (var28 != null && var28.contains(class531.field5555.method10477())) {
                        try {
                            JSONObject var5 = new JSONObject(var25.method308());
                            this.field607 = var5.getString("token");
                        } catch (JSONException var18) {
                            class508.RunException_sendStackTrace((String) null, var18);
                            class211.loginResponse(65);
                            this.field609 = null;
                            return;
                        }
                    } else {
                        this.field607 = var25.method308();
                    }

                    this.field609 = null;
                }

                field351 = 0;
                HitSplatDefinition.method10432(class43.field288);
            }

            if (class333.loginState == class43.field288/* 1519056913 */) {
                System.out.println("[Outgoing] Hit logged out state: class43.field288 - " + class43.field288.hashCode());

                if (class412.field4979 == null) {
                    class412.field4979 = class122.field1566.newSocketTask(class35.worldHost, class151.field1770);
                }

                if (class412.field4979.status == 2) {
                    throw new IOException();
                }

                if (class412.field4979.status == 1) {
                    System.out.println("class412.field4979.field3154 == 1");
                    Socket var29 = (Socket) class412.field4979.field3155;
                    class512 var27 = new class512(var29, 40000, 5000);
                    var1 = var27;
                    packetWriter.method2951(var27);
                    class412.field4979 = null;
                    HitSplatDefinition.method10432(class43.field310);
                }
            }

            class329 var31;
            if (class43.field310 == class333.loginState) {
                System.out.println("[Outgoing] Hit logged out state: class43.field310 - " + class43.field310.hashCode());

                packetWriter.method2936();
                if (class329.field3661 == 0) {
                    var31 = new class329();
                } else {
                    var31 = class329.field3662[--class329.field3661];
                }

                var31.clientPacket = null;
                var31.clientPacketLength = 0;
                var31.out = new PacketBuffer(5000);
                var31.out.writeByte(class331.field3821.field3819);
                System.out.println("writing opcode ? " + class331.field3821.field3819);
                packetWriter.addNode(var31);
                packetWriter.flush();
                var2.offset = 0;
                HitSplatDefinition.method10432(class43.field290);
            }

            int var13;
            if (class333.loginState == class43.field290) {
                System.out.println("[Outgoing] Hit logged out state: class43.field290 - " + class43.field290.hashCode());

                if (class70.field963 != null) {
                    class70.field963.method3049();
                }

                if (((class511) var1).vmethod10194(1)) {
                    var13 = ((class511) var1).readUnsignedByte();
                    if (class70.field963 != null) {
                        class70.field963.method3049();
                    }

                    if (var13 != 0) {
                        //..
                        System.out.println("NO LOGIN RETURNING RESPONSE CODE ");
                        class211.loginResponse(var13);
                        return;
                    }

                    var2.offset = 0;
                    HitSplatDefinition.method10432(class43.field291);
                }
            }

            if (class333.loginState == class43.field291) {
                System.out.println("[Outgoing] Hit logged out state: class43.field291 - " + class43.field291.hashCode());
                if (var2.offset * 1216585693 < 8) {
                    var13 = ((class511) var1).available();
                    if (var13 > 8 - var2.offset * 1216585693) {
                        var13 = 8 - var2.offset * 1216585693;
                    }

                    if (var13 > 0) {
                        ((class511) var1).read(var2.array, var2.offset * 1216585693, var13);
                        var2.offset += var13 * -290410379;
                    }
                }

                if (var2.offset * 1216585693 == 8) {
                    var2.offset = 0;
                    class237.field2846 = var2.method11203();
                    HitSplatDefinition.method10432(class43.soemOtherGameState);
                }
            }

            //..Login block
            if (class43.soemOtherGameState == class333.loginState) {
                System.out.println("[Outgoing] Hit logged out state: class43.soemOtherGameState - " + class43.soemOtherGameState.hashCode());
                packetWriter.packetBuffer.offset = 0;
                packetWriter.method2936();
                PacketBuffer rsa_buffer = new PacketBuffer(500);
                int[] xtea = new int[]{class121.field1561.nextInt(), class121.field1561.nextInt(), class121.field1561.nextInt(), class121.field1561.nextInt()};
                rsa_buffer.offset = 0;
                rsa_buffer.writeByte(1);

                rsa_buffer.writeIntBigEndian(xtea[0]);
                rsa_buffer.writeIntBigEndian(xtea[1]);
                rsa_buffer.writeIntBigEndian(xtea[2]);
                rsa_buffer.writeIntBigEndian(xtea[3]);

                rsa_buffer.method11182(class237.field2846); //..Seed?
                System.out.println("Sending seed : " + class237.field2846);

                if (gameState == 40) {
                    System.out.println("Sending 40 block");
                    rsa_buffer.writeIntBigEndian(c_xtea[0]);
                    rsa_buffer.writeIntBigEndian(c_xtea[1]);
                    rsa_buffer.writeIntBigEndian(c_xtea[2]);
                    rsa_buffer.writeIntBigEndian(c_xtea[3]);
                } else {
                    if (gameState == 50) {
                        System.out.println("Sending 50 block");
                        rsa_buffer.writeByte(class131.field1595.vmethod11658());
                        rsa_buffer.writeIntBigEndian(class563.field5778);
                    } else {
                        //..Auth type?
                        rsa_buffer.writeByte(field571.vmethod11658());
                        System.out.println("Sending Auth type? " + field571.vmethod11658());

                        switch (field571.field1599) {
                            case 0:
                            case 4:
                                rsa_buffer.writeTriByte(class38.field257);
                                rsa_buffer.offset += -290410379;
                                break;
                            case 1:
                                rsa_buffer.writeIntBigEndian(class36.clientPreferences.method2581(class52.local_username));
                                break;
                            case 2:
                                rsa_buffer.offset += -1161641516;
                            case 3:
                        }
                    }

                    if (field330.method11512()) {
                        System.out.println("*** WARNING! *** Beta data sent instead");
                        rsa_buffer.writeByte(class595.field5974.vmethod11658());
                        rsa_buffer.writeNullTermString(this.field607);
                    } else {
                        rsa_buffer.writeByte(class595.field5970.vmethod11658());
                        System.out.println("RSA Login Information : Writing Empty Byte = " + class595.field5970.vmethod11658());
                        rsa_buffer.writeNullTermString(class52.field726);
                        System.out.println("RSA Login Information : Writing Password = " + class52.field726);
                    }
                }

                //..Enable the RSA BLOCKS
                rsa_buffer.enableRSA(class51.RSA_EXPONENT, class51.RSA_MODULUS);
                c_xtea = xtea;
                class329 var6;
                if (class329.field3661 == 0) {
                    var6 = new class329();
                } else {
                    var6 = class329.field3662[--class329.field3661];
                }
                var6.clientPacket = null;
                var6.clientPacketLength = 0;
                var6.out = new PacketBuffer(5000);
                var6.out.offset = 0;

                //..Seed
                if (gameState == 40) {
                    System.out.println("Sending block 40 res 1 : " + class331.field3812.field3819);
                    var6.out.writeByte(class331.field3813.field3819);
                } else {
                    System.out.println("Sending block 40 res 2 : " + class331.field3812.field3819);
                    var6.out.writeByte(class331.field3812.field3819);
                }

                var6.out.writeShortBigEndian(0); //..0
                int var14 = var6.out.offset * 1216585693;

                var6.out.writeIntBigEndian(233); //..Revision
                var6.out.writeIntBigEndian(1); // 1 none

                if (class585.field5890 >= 232) {
                    System.out.println("Sending the >= 232 / " + class585.field5890);
                    var6.out.writeIntBigEndian(class585.field5890);
                }

                var6.out.writeByte(clientType);
                System.out.println("Sending the clientType " + clientType);

                var6.out.writeByte(field390);
                System.out.println("Sending the byte field390" + field390);

                //..Password
                byte var8 = 0;
                var6.out.writeByte(var8);
                var6.out.copyArray(rsa_buffer.array, 0, rsa_buffer.offset * 1216585693);
                int var9 = var6.out.offset * 1216585693;

                var6.out.writeNullTermString(class52.local_username);
                //..Client view settings
                var6.out.writeByte((isResizable ? 1 : 0) << 1 | (field565 ? 1 : 0));
                var6.out.writeShortBigEndian(class34.screenWidth);
                var6.out.writeShortBigEndian(class396.screenHeight);
                class19.method295(var6.out);

                //..Get the session token
                var6.out.writeNullTermString(class99.sessionToken1);
                System.out.println("Sending the sessionToken1 " + class99.sessionToken1);
                //..Fetch the affiliate id
                var6.out.writeIntBigEndian(class293.affiliateID);
                System.out.println("Sending the affiliateID " + class293.affiliateID);
                //..Replaced random bytes from previous builds
                var6.out.writeByte(0);
                System.out.println("Sending the empty byte");

                //..Platform information
                Buffer plat_buffer = new Buffer(Occluder.platformInfo.method10578());

                //..Write platform information
                Occluder.platformInfo.write(plat_buffer);
                var6.out.copyArray(plat_buffer.array, 0, plat_buffer.array.length);
                var6.out.writeByte(clientType);
                var6.out.writeIntBigEndian(0);

                //..Check beta status and send data accordingly
                if (class509.isBetaBuild) {
                    System.out.println("Using beta login methods");
                    class145.method3748(var6);
                } else {
                    System.out.println("Using normal login methods");
                    var6.out.putIntCustomEndian234(class27.field130.field4959); //..1
                    System.out.println("Using normal login 1 : "+class27.field130.field4959);
                    var6.out.putIntLittleEndian(class115.field1514.field4959); //..2
                    System.out.println("Using normal login 2 : "+class115.field1514.field4959);
                    var6.out.putIntCustomEndian234(class551.field5661.field4959); //..3
                    System.out.println("Using normal login 3 : "+class551.field5661.field4959);
                    var6.out.putIntLittleEndian(class311.field3506.field4959); //..4
                    System.out.println("Using normal login 4 : "+class311.field3506.field4959);

                    var6.out.writeIntBigEndian(class418.field5030.field4959); //..5
                    System.out.println("Using normal login 5 : "+class418.field5030.field4959);
                    var6.out.putIntLittleEndian(0); //..6
                    System.out.println("Using normal login 6 : "+0);

                    var6.out.putIntCustomEndian234(class149.field1760.field4959); //..7
                    System.out.println("Using normal login 7 : "+class149.field1760.field4959);
                    var6.out.writeIntBigEndian(class159.field1830.field4959); //..8
                    System.out.println("Using normal login 8 : "+class159.field1830.field4959);
                    var6.out.writeIntBigEndian(class48.field688.field4959); //..9
                    System.out.println("Using normal login 9 : "+class48.field688.field4959);
                    var6.out.putIntCustomEndian(class182.field1986.field4959); //..10
                    System.out.println("Using normal login 10 : "+class182.field1986.field4959);
                    var6.out.putIntCustomEndian234(class416.field5019.field4959); //..11
                    System.out.println("Using normal login 11 : "+class416.field5019.field4959);
                    var6.out.putIntCustomEndian(class286.field3302.field4959); //..12
                    System.out.println("Using normal login 12 : "+class286.field3302.field4959);

                    var6.out.putIntCustomEndian234(class145.field1726.field4959); //..13
                    System.out.println("Using normal login 13 : "+class145.field1726.field4959);
                    var6.out.putIntCustomEndian(class193.field2091.field4959); //..14
                    System.out.println("Using normal login 14 : "+class193.field2091.field4959);
                    var6.out.putIntLittleEndian(class334.field3841.field4959); //..15
                    System.out.println("Using normal login 15 : "+class334.field3841.field4959);
                    var6.out.putIntLittleEndian(class259.field3100.field4959); //..16
                    System.out.println("Using normal login 16 : "+class259.field3100.field4959);
                    var6.out.putIntLittleEndian(class66.field913.field4959); //..17
                    System.out.println("Using normal login 17 : "+class66.field913.field4959);
                    var6.out.putIntCustomEndian234(class273.field3204.field4959); //..18
                    System.out.println("Using normal login 18 : "+class273.field3204.field4959);
                }

                //..Writes two 32-bit integer (int var1) into a byte array
                var6.out.xteaEncrytion(xtea, var9, var6.out.offset * 1216585693);
                //..Writes a 16-bit (2-byte) unsigned short integer into a byte array in big-endian
                var6.out.putUnsignedShortBigEndian(var6.out.offset * 1216585693 - var14);
                packetWriter.addNode(var6);
                packetWriter.flush();

                //..Issac Cipher
                packetWriter.isaacCipher = new IsaacCipher(xtea);
                int[] var11 = new int[4];

                for (int var12 = 0; var12 < 4; ++var12) {
                    var11[var12] = xtea[var12] + 50;
                }
                var2.newIsaacCipher(var11);

                HitSplatDefinition.method10432(class43.field301);
                System.out.println("Passing login block? ");
            }

            int var15;
            if (class333.loginState == class43.field301 && ((class511) var1).available() > 0) {
                System.out.println("[Outgoing] Hit logged out state: class43.field301 - " + class43.field301.hashCode());

                var13 = ((class511) var1).readUnsignedByte();
                if (var13 == 61) {
                    var15 = ((class511) var1).available();
                    class563.field5781 = var15 == 1 && ((class511) var1).readUnsignedByte() == 1;
                    HitSplatDefinition.method10432(class43.soemOtherGameState);
                }

                if (var13 == 21 && gameState == 20) {
                    System.out.println("testing 34343434");
                    HitSplatDefinition.method10432(class43.field305);
                } else if (var13 == 2) {
                    if (class509.isBetaBuild) {
                        HitSplatDefinition.method10432(class43.field304);
                    } else {
                        HitSplatDefinition.method10432(class43.field298);
                    }
                } else if (var13 == 15 && gameState == 40) {
                    packetWriter.serverPacketLength = -1;
                    HitSplatDefinition.method10432(class43.field307);
                } else if (var13 == 64) {
                    HitSplatDefinition.method10432(class43.field297);
                } else if (var13 == 23 && field448 < 1) {
                    ++field448;
                    HitSplatDefinition.method10432(class43.field296);
                } else if (var13 == 29) {
                    HitSplatDefinition.method10432(class43.field287);
                } else {
                    if (var13 != 69) {
                        System.out.println("DOES NOT EQUAL 69 var13: " + var13);
                        class211.loginResponse(var13);
                        return;
                    }

                    HitSplatDefinition.method10432(class43.field294);
                }
            }

            if (class333.loginState == class43.field304) {
                System.out.println("[Outgoing] Hit logged out state: class43.field304 - " + class43.field304.hashCode());

                class55.field793 = true;
                class68.method2161(class70.field962);
                class121.updateGameState(0);
            }

            if (class43.field294 == class333.loginState && ((class511) var1).available() >= 2) {
                System.out.println("[Outgoing] Hit logged out state: class43.field294 - " + class43.field294.hashCode());

                ((class511) var1).read(var2.array, 0, 2);
                var2.offset = 0;
                class235.field2812 = var2.readUnsignedShort();
                HitSplatDefinition.method10432(class43.field312);
            }

            if (class43.field312 == class333.loginState && ((class511) var1).available() >= class235.field2812) {
                System.out.println("[Outgoing] Hit logged out state: class43.field312 - " + class43.field312.hashCode());

                var2.offset = 0;
                ((class511) var1).read(var2.array, var2.offset * 1216585693, class235.field2812);
                class6[] var32 = new class6[]{class6.field14};
                class6 var39 = var32[var2.method11196()];

                try {
                    switch (var39.field15) {
                        case 0:
                            class0 var33 = new class0();
                            this.field618 = new class7(var2, var33);
                            HitSplatDefinition.method10432(class43.field293);
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var17) {
                    class211.loginResponse(22);
                    return;
                }
            }

            if (class333.loginState == class43.field293 && this.field618.method43()) {
                System.out.println("[Outgoing] Hit logged out state: class43.field293 - " + class43.field293.hashCode());

                this.field617 = this.field618.method54();
                this.field618.method52();
                this.field618 = null;
                if (this.field617 == null) {
                    class211.loginResponse(22);
                    return;
                }

                packetWriter.method2936();
                if (class329.field3661 == 0) {
                    var31 = new class329();
                } else {
                    var31 = class329.field3662[--class329.field3661];
                }

                var31.clientPacket = null;
                var31.clientPacketLength = 0;
                var31.out = new PacketBuffer(5000);
                var31.out.writeByte(class331.field3814.field3819);
                var31.out.writeShortBigEndian(this.field617.offset * 1216585693);
                var31.out.method11188(this.field617);
                packetWriter.addNode(var31);
                packetWriter.flush();
                this.field617 = null;
                HitSplatDefinition.method10432(class43.field301);
            }

            if (class333.loginState == class43.field297 && ((class511) var1).available() > 0) {
                System.out.println("[Outgoing] Hit logged out state: class43.field297 - " + class43.field297.hashCode());

                class108.field1425 = ((class511) var1).readUnsignedByte();
                HitSplatDefinition.method10432(class43.field299);
            }

            if (class43.field299 == class333.loginState && ((class511) var1).available() >= class108.field1425) {
                System.out.println("[Outgoing] Hit logged out state: class43.field299 - " + class43.field299.hashCode());

                ((class511) var1).read(var2.array, 0, class108.field1425);
                var2.offset = 0;
                HitSplatDefinition.method10432(class43.field301);
            }

            if (class333.loginState == class43.field305 && ((class511) var1).available() > 0) {
                System.out.println("[Outgoing] Hit logged out state: class43.field305 - " + class43.field305.hashCode());

                field464 = (((class511) var1).readUnsignedByte() + 3) * 60;
                HitSplatDefinition.method10432(class43.field300);
            }

            if (class333.loginState == class43.field300) {
                System.out.println("[Outgoing] Hit logged out state: class43.field300 - " + class43.field300.hashCode());

                field351 = 0;
                class66.method2147("You have only just left another world.", "Your profile will be transferred in:", field464 / 60 + " seconds.");
                if (--field464 <= 0) {
                    HitSplatDefinition.method10432(class43.field296);
                }

            } else if (class333.loginState == class43.field311) {
                System.out.println("[Outgoing] Hit logged out state: class43.field311 - " + class43.field311.hashCode());

                if (class329.field3661 == 0) {
                    var31 = new class329();
                } else {
                    var31 = class329.field3662[--class329.field3661];
                }

                var31.clientPacket = null;
                var31.clientPacketLength = 0;
                var31.out = new PacketBuffer(5000);
                var31.out.writeByte(class331.field3817.field3819);
                var31.out.writeShortBigEndian(class331.field3817.field3820);
                var31.out.writeIntBigEndian(class182.field1986.field4959);
                var31.out.writeIntBigEndian(class286.field3302.field4959);
                var31.out.putIntLittleEndian(class40.field280.field4959);
                var31.out.putIntCustomEndian234(class176.field1956.field4959);
                var31.out.putIntLittleEndian(class416.field5019.field4959);
                var31.out.putIntCustomEndian234(class273.field3204.field4959);
                var31.out.putIntCustomEndian(class418.field5030.field4959);
                var31.out.putIntCustomEndian234(class149.field1760.field4959);
                var31.out.writeIntBigEndian(class334.field3841.field4959);
                var31.out.putIntLittleEndian(class66.field913.field4959);
                var31.out.putIntLittleEndian(class485.field5345.field4959);
                var31.out.putIntLittleEndian(class259.field3100.field4959);
                var31.out.putIntCustomEndian(class311.field3506.field4959);
                var31.out.putIntCustomEndian234(class551.field5661.field4959);
                var31.out.writeIntBigEndian(class48.field688.field4959);
                var31.out.putIntCustomEndian(0);
                packetWriter.addNode(var31);
                packetWriter.flush();
                HitSplatDefinition.method10432(class43.field298);

            } else {
                //..READING (ABOVE WRITING)

                //..13
                if (class333.loginState == class43.field298 && ((class511) var1).available() >= 1) {
                    System.out.println("[Incoming] Hit logged out state: class43.field298 - " + class43.field298.hashCode());

                    class67.field918 = ((class511) var1).readUnsignedByte();
                    System.out.println("Incoming 13, is class67.field918 : " + class67.field918 + ",  !=  class331.field3816.field3820 : " + class331.field3816.field3820);
                    if (class67.field918 != class331.field3816.field3820) {
                        System.out.println("Invalid login - returning response code " + class67.field918);
                        class211.loginResponse(class67.field918);
                        return;
                    }

                    System.out.println("PASSED STATE 13");
                    HitSplatDefinition.method10432(class43.field302);
                }

                //..State 15?
                if (class333.loginState == class43.field302 && ((class511) var1).available() >= class67.field918) {
                    System.out.println("[Incoming] Hit logged out state: class43.field302 - " + class43.field302.hashCode());

                    boolean saveLoginInformation = ((class511) var1).readUnsignedByte() == 1;
                    ((class511) var1).read(var2.array, 0, 4);
                    var2.offset = 0;

                    boolean var42 = false;
                    if (saveLoginInformation) {
                        var15 = var2.readByteIsaac() << 24;
                        var15 |= var2.readByteIsaac() << 16;
                        var15 |= var2.readByteIsaac() << 8;
                        var15 |= var2.readByteIsaac();
                        class36.clientPreferences.put(class52.local_username, var15);
                    }

                    if (Login_isUsernameRemembered) {
                        class36.clientPreferences.method2588(class52.local_username);
                    } else {
                        class36.clientPreferences.method2588(null);
                    }

                    //..Incoming server response
                    class61.savePreferences();
                    field428 = ((class511) var1).readUnsignedByte();
                    field430 = ((class511) var1).readUnsignedByte() == 1;
                    field491 = ((class511) var1).readUnsignedByte();
                    field491 <<= 8;
                    field491 += ((class511) var1).readUnsignedByte();
                    field344 = ((class511) var1).readUnsignedByte();
                    ((class511) var1).read(var2.array, 0, 8);
                    var2.offset = 0;
                    this.field619 = var2.method11203();
                    ((class511) var1).read(var2.array, 0, 8);
                    var2.offset = 0;
                    field509 = var2.method11203();
                    ((class511) var1).read(var2.array, 0, 8);
                    var2.offset = 0;
                    field510 = var2.method11203();
                    class259.method5905().method5984(this.field349);
                    HitSplatDefinition.method10432(class43.field303);
                }

                if (class333.loginState == class43.field303 && ((class511) var1).available() >= packetWriter.serverPacketLength) {
                    System.out.println("[Incoming] Hit logged out state: class43.field303 - " + class43.field303.hashCode());

                    ((class511) var1).read(var2.array, 0, 1);
                    var2.offset = 0;
                    if (var2.method11142()) {
                        ((class511) var1).read(var2.array, 1, 1);
                        var2.offset = 0;
                    }

                    ServerPackets[] var34 = class174.method4107();
                    var15 = var2.method11136();
                    if (var15 < 0 || var15 >= var34.length) {
                        throw new IOException("Invalid ServerProt: " + var15 + " at " + var2.offset * 1216585693);
                    }

                    packetWriter.serverPacket = var34[var15];
                    packetWriter.serverPacketLength = packetWriter.serverPacket.length;
                    ((class511) var1).read(var2.array, 0, 2);
                    var2.offset = 0;
                    packetWriter.serverPacketLength = var2.readUnsignedShort();

                    try {
                        client var35 = class521.field5519;
                        JSObject.getWindow(var35).call("zap", (Object[]) null);
                    } catch (Throwable var16) {
                    }

                    HitSplatDefinition.method10432(class43.field289);
                }

                if (class333.loginState == class43.field289) {
                    System.out.println("[Incoming] Hit logged out state: class43.field289 - " + class43.field289.hashCode());

                    if (((class511) var1).available() >= packetWriter.serverPacketLength) {
                        var2.offset = 0;
                        ((class511) var1).read(var2.array, 0, packetWriter.serverPacketLength);
                        timer.method8250();
                        class365.method7601();
                        field335.method2850(var2);
                        class295.method6747();
                        class269.field3187 = -1;
                        class124.method3552(false, var2);
                        packetWriter.serverPacket = null;
                        field454 = false;
                    }

                } else {
                    if (class43.field287 == class333.loginState && ((class511) var1).available() >= 2) {
                        System.out.println("[Incoming] Hit logged out state: class43.field287 - " + class43.field287.hashCode());

                        var2.offset = 0;
                        ((class511) var1).read(var2.array, 0, 2);
                        var2.offset = 0;
                        class131.field1601 = var2.readUnsignedShort();
                        HitSplatDefinition.method10432(class43.field306);
                    }

                    if (class333.loginState == class43.field306 && ((class511) var1).available() >= class131.field1601) {
                        System.out.println("[Incoming] Hit logged out state: class43.field306 - " + class43.field306.hashCode());

                        var2.offset = 0;
                        ((class511) var1).read(var2.array, 0, class131.field1601);
                        var2.offset = 0;
                        String var36 = var2.method11207();
                        String var40 = var2.method11207();
                        String var38 = var2.method11207();
                        class66.method2147(var36, var40, var38);
                        class121.updateGameState(10);
                        if (field330.method11512()) {
                            class78.method2677(9);
                        }
                    }

                    if (class43.field307 == class333.loginState) {
                        System.out.println("[Incoming] Hit logged out state: class43.field307 - " + class43.field307.hashCode());

                        if (packetWriter.serverPacketLength == -1) {
                            if (((class511) var1).available() < 2) {
                                return;
                            }

                            ((class511) var1).read(var2.array, 0, 2);
                            var2.offset = 0;
                            packetWriter.serverPacketLength = var2.readUnsignedShort();
                        }

                        if (((class511) var1).available() >= packetWriter.serverPacketLength) {
                            ((class511) var1).read(var2.array, 0, packetWriter.serverPacketLength);
                            var2.offset = 0;
                            var13 = packetWriter.serverPacketLength;
                            timer.method8252();
                            class298.method6784();
                            field335.method2850(var2);
                            if (var13 != var2.offset * 1216585693) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        ++field351;
                        if (field351 > 2000) {
                            if (field448 < 1) {
                                if (class431.field5089 == class151.field1770) {
                                    class151.field1770 = class545.field5606;
                                } else {
                                    class151.field1770 = class431.field5089;
                                }

                                ++field448;
                                HitSplatDefinition.method10432(class43.field296);
                            } else {
                                class211.loginResponse(-3);
                            }
                        }
                    }
                }
            }
        } catch (IOException var24) {
            if (field448 < 1) {
                if (class431.field5089 == class151.field1770) {
                    class151.field1770 = class545.field5606;
                } else {
                    class151.field1770 = class431.field5089;
                }

                ++field448;
                HitSplatDefinition.method10432(class43.field296);
            } else {
                class211.loginResponse(-2);
            }
        }
    }

    @ObfuscatedName("qb")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "-716844505"
    )
    final void doCycleLoggedIn() {
        if (rebootTimer > 1) {
            --rebootTimer;
        }

        if (logoutTimer > 0) {
            --logoutTimer;
        }

        if (hadNetworkError) {
            hadNetworkError = false;
            class361.method7512();
            System.out.println("Encountered network error");
        } else {
            if (!isMenuOpen) {
                InterfaceParent.addCancelMenuEntry();
            }
            System.out.println("sdfsdf");
            this.incomingServerPackets();

            if (gameState == 30) {
                while (true) {
                    class37 var2 = (class37) class36.field241.method8748();
                    boolean var1;
                    if (var2 == null) {
                        var1 = false;
                    } else {
                        var1 = true;
                    }

                    int var3;
                    class329 var46;
                    if (!var1) {
                        class329 var27;
                        if (timer.field4865) {
                            var27 = EnumComposition.getPacketBufferNode(ClientPackets.field3553, packetWriter.isaacCipher);
                            var27.out.writeByte(0);
                            int var28 = var27.out.offset * 1216585693;
                            timer.write(var27.out);
                            var27.out.method11191(var27.out.offset * 1216585693 - var28);
                            packetWriter.addNode(var27);
                            timer.method8253();
                        }

                        int var4;
                        int var5;
                        int var6;
                        int var7;
                        int var8;
                        int var9;
                        int var10;
                        int var11;
                        int var12;
                        PacketBuffer var10000;
                        synchronized (class398.mouseRecorder.lock) {
                            if (!field427) {
                                class398.mouseRecorder.index = 0;
                            } else if (class35.lastButton != 0 || class398.mouseRecorder.index >= 40) {
                                var46 = null;
                                var3 = 0;
                                var4 = 0;
                                var5 = 0;
                                var6 = 0;

                                for (var7 = 0; var7 < class398.mouseRecorder.index && (var46 == null || var46.out.offset * 1216585693 - var3 < 246); ++var7) {
                                    var4 = var7;
                                    var8 = class398.mouseRecorder.field910[var7];
                                    if (var8 < -1) {
                                        var8 = -1;
                                    } else if (var8 > 65534) {
                                        var8 = 65534;
                                    }

                                    var9 = class398.mouseRecorder.field908[var7];
                                    if (var9 < -1) {
                                        var9 = -1;
                                    } else if (var9 > 65534) {
                                        var9 = 65534;
                                    }

                                    if (var9 != field386 || var8 != field396) {
                                        if (var46 == null) {
                                            var46 = EnumComposition.getPacketBufferNode(ClientPackets.field3544, packetWriter.isaacCipher);
                                            var46.out.writeByte(0);
                                            var3 = var46.out.offset * 1216585693;
                                            var10000 = var46.out;
                                            var10000.offset += -580820758;
                                            var5 = 0;
                                            var6 = 0;
                                        }

                                        if (-1L != field397) {
                                            var10 = var9 - field386;
                                            var11 = var8 - field396;
                                            var12 = (int) ((class398.mouseRecorder.field912[var7] - field397) / 20L);
                                            var5 = (int) ((long) var5 + (class398.mouseRecorder.field912[var7] - field397) % 20L);
                                        } else {
                                            var10 = var9;
                                            var11 = var8;
                                            var12 = Integer.MAX_VALUE;
                                        }

                                        field386 = var9;
                                        field396 = var8;
                                        if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                            var10 += 32;
                                            var11 += 32;
                                            var46.out.writeShortBigEndian((var12 << 12) + var11 + (var10 << 6));
                                        } else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
                                            var10 += 128;
                                            var11 += 128;
                                            var46.out.writeByte(var12 + 128);
                                            var46.out.writeShortBigEndian(var11 + (var10 << 8));
                                        } else if (var12 < 32) {
                                            var46.out.writeByte(var12 + 192);
                                            if (var9 != -1 && var8 != -1) {
                                                var46.out.writeIntBigEndian(var9 | var8 << 16);
                                            } else {
                                                var46.out.writeIntBigEndian(Integer.MIN_VALUE);
                                            }
                                        } else {
                                            var46.out.writeShortBigEndian((var12 & 8191) + '\ue000');
                                            if (var9 != -1 && var8 != -1) {
                                                var46.out.writeIntBigEndian(var9 | var8 << 16);
                                            } else {
                                                var46.out.writeIntBigEndian(Integer.MIN_VALUE);
                                            }
                                        }

                                        ++var6;
                                        field397 = class398.mouseRecorder.field912[var7];
                                    }
                                }

                                if (var46 != null) {
                                    var46.out.method11191(var46.out.offset * 1216585693 - var3);
                                    var7 = var46.out.offset * 1216585693;
                                    var46.out.offset = var3 * -290410379;
                                    var46.out.writeByte(var5 / var6);
                                    var46.out.writeByte(var5 % var6);
                                    var46.out.offset = var7 * -290410379;
                                    packetWriter.addNode(var46);
                                }

                                if (var4 >= class398.mouseRecorder.index) {
                                    class398.mouseRecorder.index = 0;
                                } else {
                                    class66 var73 = class398.mouseRecorder;
                                    var73.index -= var4;
                                    System.arraycopy(class398.mouseRecorder.field908, var4, class398.mouseRecorder.field908, 0, class398.mouseRecorder.index);
                                    System.arraycopy(class398.mouseRecorder.field910, var4, class398.mouseRecorder.field910, 0, class398.mouseRecorder.index);
                                    System.arraycopy(class398.mouseRecorder.field912, var4, class398.mouseRecorder.field912, 0, class398.mouseRecorder.index);
                                }
                            }
                        }

                        this.method832();
                        if (field550 != 0) {
                            var27 = EnumComposition.getPacketBufferNode(ClientPackets.field3572, packetWriter.isaacCipher);
                            var27.out.writeShortBigEndian(field550);
                            packetWriter.addNode(var27);
                        }

                        var1 = class34.field193.method375();
                        if (var1) {
                            var46 = EnumComposition.getPacketBufferNode(ClientPackets.field3576, packetWriter.isaacCipher);
                            var46.out.writeShortBigEndian(0);
                            var3 = var46.out.offset * 1216585693;
                            long var29 = class189.method4284();

                            for (var6 = 0; var6 < field551.field3206; ++var6) {
                                long var31 = var29 - field466;
                                if (var31 > 16777215L) {
                                    var31 = 16777215L;
                                }

                                field466 = var29;
                                var46.out.method11245((int) var31);
                                var46.out.writeMedium(field551.field3207[var6]);
                            }

                            var46.out.putUnsignedShortBigEndian(var46.out.offset * 1216585693 - var3);
                            packetWriter.addNode(var46);
                        }

                        if (field488 > 0) {
                            --field488;
                        }

                        if (field551.method6138(96) || field551.method6138(97) || field551.method6138(98) || field551.method6138(99)) {
                            field489 = true;
                        }

                        if (field489 && field488 <= 0) {
                            field488 = 20;
                            field489 = false;
                            var46 = EnumComposition.getPacketBufferNode(ClientPackets.field3603, packetWriter.isaacCipher);
                            var46.out.writeIntME(field424);
                            var46.out.writeShortBigEndian(field415);
                            packetWriter.addNode(var46);
                        }

                        if (class34.hasFocus && !hadFocus) {
                            hadFocus = true;
                            var46 = EnumComposition.getPacketBufferNode(ClientPackets.field3577, packetWriter.isaacCipher);
                            var46.out.writeByte(1);
                            packetWriter.addNode(var46);
                        }

                        if (!class34.hasFocus && hadFocus) {
                            hadFocus = false;
                            var46 = EnumComposition.getPacketBufferNode(ClientPackets.field3577, packetWriter.isaacCipher);
                            var46.out.writeByte(0);
                            packetWriter.addNode(var46);
                        }

                        if (class56.field816 != null) { // L: 3207
                            class56.field816.method10639();
                        }

                        if (class159.field1829) {
                            if (class22.field90 != null) {
                                class22.field90.method10010();
                            }

                            ClientPackets.method7036();
                            class159.field1829 = false;
                        }

                        class63.method2123();
                        if (field576 != class333.field3836.field1170) {
                            field576 = class333.field3836.field1170;
                            class85.method2823(class333.field3836.field1170);
                        }

                        if (gameState != 30) {
                            System.out.println("CLIENT STATE NOT 30 RETURNING");
                            return;
                        }

                        class150.method3816();

                        int var14;
                        int var10002;
                        int var35;
                        for (int var47 = 0; var47 < class58.field836; ++var47) {
                            var10002 = class58.field831[var47]--;
                            if (class58.field831[var47] < -10) {
                                class185.method4216(var47);
                                --var47;
                            } else {
                                class94 var48 = class58.field832[var47];
                                if (var48 == null) {
                                    var3 = class115.field1514.method8347(class58.field834[var47]) - 1;
                                    var10000 = null;
                                    var48 = class94.method2996(class115.field1514, class58.field834[var47], var3);
                                    if (var48 == null) {
                                        continue;
                                    }

                                    int[] var74 = class58.field831;
                                    var74[var47] += var48.method2997();
                                    class58.field832[var47] = var48;
                                }

                                if (class58.field831[var47] < 0) {
                                    if (class58.field833[var47] != 0) {
                                        var4 = class356.method7417(class58.field833[var47] & 255);
                                        var5 = class58.field833[var47] >> 16 & 255;
                                        var6 = class58.field833[var47] >> 8 & 255;
                                        var7 = class58.field828[var47];
                                        class79 var33 = field333.method2350(var7);
                                        class452 var34 = class56.method2010(var33, class356.method7417(var5), class356.method7417(var6));
                                        var11 = (int) var34.field5175;
                                        var10 = var11 >> 7;
                                        var14 = (int) var34.field5169;
                                        var35 = var14 >> 7;
                                        var34.method8992();
                                        class452 var16 = field333.method2361();
                                        int var17 = Math.abs(class356.method7416(var10) - (int) var16.field5175);
                                        int var18 = Math.abs(class356.method7416(var35) - (int) var16.field5169);
                                        var16.method8992();
                                        int var19 = Math.max(var17 + var18 - 128, 0);
                                        int var20 = Math.max(class356.method7417((class58.field829[var47] & 31) - 1), 0);
                                        class505 var21 = field333.method2347();
                                        class505 var22 = field333.method2346(var7);
                                        boolean var23 = class58.field835[var47];
                                        boolean var24;
                                        if (var22 == var21) {
                                            var24 = true;
                                        } else if (var22 == null) {
                                            var24 = true;
                                        } else if (var21 == null) {
                                            var24 = false;
                                        } else {
                                            var24 = var23;
                                        }

                                        if (var19 >= var4 || !var24) {
                                            class58.field831[var47] = -100;
                                            continue;
                                        }

                                        float var26 = var20 < var4 ? Math.min(Math.max((float) (var4 - var19) / (float) (var4 - var20), 0.0F), 1.0F) : 1.0F;
                                        var3 = (int) (var26 * (float) class36.clientPreferences.method2673());
                                    } else {
                                        var3 = class36.clientPreferences.method2618();
                                    }

                                    if (var3 > 0) {
                                        class95 var36 = var48.method3013(class36.clientPreferences.method2586());
                                        class103 var37 = class103.method3153(var36, 100, var3);
                                        if (var37 != null) {
                                            var37.method3173(class58.field830[var47] - 1);
                                            class28.field144.method2958(var37);
                                        }
                                    }

                                    class58.field831[var47] = -100;
                                }
                            }
                        }

                        if (field446 && !class223.method4924()) {
                            if (class36.clientPreferences.method2568() != 0) {
                                var1 = !class339.field3889.isEmpty();
                                if (var1) {
                                    class166.method4028(class358.field4042, class36.clientPreferences.method2568());
                                }
                            }

                            field446 = false;
                        }

                        ++packetWriter.field1297;
                        if (packetWriter.field1297 > 750) {
                            class361.method7512();
                            return;
                        }

                        class453.method9084();
                        Iterator var56 = field333.iterator();

                        class79 var52;
                        while (var56.hasNext()) {
                            var52 = (class79) var56.next();
                            Iterator var38 = var52.field1160.iterator();

                            while (var38.hasNext()) {
                                class81 var58 = (class81) var38.next();
                                if (var58 != null) {
                                    class304.method6831(var52, var58, var58.field1184.field2111);
                                }
                            }
                        }

                        var56 = field333.iterator();

                        while (var56.hasNext()) {
                            var52 = (class79) var56.next();

                            for (var3 = 0; var3 < var52.field1176.method9790(); ++var3) {
                                var4 = var52.field1176.method9787(var3);
                                class505 var61 = (class505) var52.field1171.method8596((long) var4);
                                if (var61 != null) {
                                    var61.method10083(cycle);
                                }
                            }
                        }

                        class119.method3491();
                        ++field389;
                        if (field508 != 0) {
                            field485 = field485 * 400 + 400;
                            if (field485 * 20 >= 400) {
                                field508 = 0;
                            }
                        }

                        if (field584 > 0) {
                            --field584;
                        }

                        class369 var57 = class343.field3950;
                        class369 var53 = class134.field1624;
                        class343.field3950 = null;
                        class134.field1624 = null;
                        field445 = null;
                        field543 = false;
                        field540 = false;
                        field442 = 0;

                        Iterator var62;
                        while (field551.method6121() && field442 < 128) {
                            if (field428 >= 2 && field551.method6138(82) && field551.field3212 == 66) {
                                StringBuilder var59 = new StringBuilder();

                                class39 var39;
                                for (var62 = class91.field1287.iterator(); var62.hasNext(); var59.append(var39.field271).append('\n')) {
                                    var39 = (class39) var62.next();
                                    if (var39.field264 != null && !var39.field264.isEmpty()) {
                                        var59.append(var39.field264).append(':');
                                    }
                                }

                                String var64 = var59.toString();
                                class521.field5519.method559(var64);
                            } else if (field336 != 1 || field551.field3215 <= 0) {
                                field511[field442] = field551.field3212;
                                field443[field442] = field551.field3215;
                                ++field442;
                            }
                        }

                        boolean var49 = field428 >= 2;
                        if (var49 && field551.method6138(82) && field551.method6138(81) && field550 != 0) {
                            var4 = class76.field1108.field933 - field550;
                            if (var4 < 0) {
                                var4 = 0;
                            } else if (var4 > 3) {
                                var4 = 3;
                            }

                            if (var4 != class76.field1108.field933) {
                                class297.method6782(class76.field1108.field1039[0] + class333.field3836.field1164, class76.field1108.field1107[0] + class333.field3836.field1165, var4, false);
                            }

                            field550 = 0;
                        }

                        if (rootInterface != -1) {
                            class286.method6368(rootInterface, 0, 0, class34.screenWidth, class396.screenHeight, 0, 0);
                        }

                        ++field404;

                        while (true) {
                            class65 var60;
                            class369 var63;
                            class369 var66;
                            do {
                                var60 = (class65) field435.method8716();
                                if (var60 == null) {
                                    while (true) {
                                        do {
                                            var60 = (class65) field614.method8716();
                                            if (var60 == null) {
                                                while (true) {
                                                    do {
                                                        var60 = (class65) field434.method8716();
                                                        if (var60 == null) {
                                                            boolean var50 = false;

                                                            while (true) {
                                                                class273 var65 = (class273) field437.method8716();
                                                                if (var65 == null) {
                                                                    if (!var50 && class35.lastButton == 1) {
                                                                        field598.method6085();
                                                                    }

                                                                    this.method1205();
                                                                    class393.method8221();
                                                                    if (field612 != null) {
                                                                        this.method907();
                                                                    }

                                                                    var62 = field333.iterator();

                                                                    while (var62.hasNext()) {
                                                                        class79 var68 = (class79) var62.next();
                                                                        class230 var40 = var68.field1159;
                                                                        if (var40.method5160()) {
                                                                            var8 = var40.field2720;
                                                                            var9 = var40.field2683;
                                                                            class329 var41 = EnumComposition.getPacketBufferNode(ClientPackets.field3630, packetWriter.isaacCipher);
                                                                            var41.out.writeByte(5);
                                                                            var41.out.writeByte(field551.method6138(82) ? (field551.method6138(81) ? 2 : 1) : 0);
                                                                            var41.out.method11238(var8 + var68.field1164);
                                                                            var41.out.method11238(var9 + var68.field1165);
                                                                            packetWriter.addNode(var41);
                                                                            field505 = class35.field221;
                                                                            field506 = class35.field224;
                                                                            field508 = 1;
                                                                            field485 = 0;
                                                                            field581 = var8;
                                                                            field531 = var9;
                                                                            var40.method5162();
                                                                        }
                                                                    }

                                                                    if (var57 != class343.field3950) {
                                                                        if (var57 != null) {
                                                                            class89.method2877(var57);
                                                                        }

                                                                        if (class343.field3950 != null) {
                                                                            class89.method2877(class343.field3950);
                                                                        }
                                                                    }

                                                                    if (var53 != class134.field1624 && field426 == field481) {
                                                                        if (var53 != null) {
                                                                            class89.method2877(var53);
                                                                        }

                                                                        if (class134.field1624 != null) {
                                                                            class89.method2877(class134.field1624);
                                                                        }
                                                                    }

                                                                    if (class134.field1624 != null) {
                                                                        if (field481 < field426) {
                                                                            ++field481;
                                                                            if (field481 == field426) {
                                                                                class89.method2877(class134.field1624);
                                                                            }
                                                                        }
                                                                    } else if (field481 > 0) {
                                                                        --field481;
                                                                    }

                                                                    if (field336 == 0) {
                                                                        class79 var67 = field333.method2350(field347);
                                                                        if (var67 == null) {
                                                                            var67 = class333.field3836;
                                                                        }

                                                                        Object var70 = null;
                                                                        switch (class4.field7.field4399) {
                                                                            case 0:
                                                                                var70 = (class598) var67.field1169.method8567((long) field348);
                                                                                break;
                                                                            case 1:
                                                                                var70 = (class598) var67.field1160.method8567((long) field348);
                                                                                break;
                                                                            case 2:
                                                                                var70 = (class598) var67.field1171.method8596((long) field348);
                                                                        }

                                                                        if (var70 == null) {
                                                                            var70 = class76.field1108;
                                                                        }

                                                                        field552 = ((class598) var70).vmethod11534();
                                                                        field337 = ((class598) var70).vmethod11529();
                                                                        if (var67 != class333.field3836) {
                                                                            class452 var69 = class56.method2010(var67, ((class598) var70).vmethod11534(), ((class598) var70).vmethod11529());
                                                                            field552 = (int) var69.field5175;
                                                                            field337 = (int) var69.field5169;
                                                                            var69.method8992();
                                                                        }

                                                                        var7 = ((class598) var70).vmethod11530();
                                                                        if (class172.field1930 - field552 >= -500 && class172.field1930 - field552 <= 500 && class129.field1584 - field337 >= -500 && class129.field1584 - field337 <= 500) {
                                                                            if (class172.field1930 != field552) {
                                                                                class172.field1930 += (field552 - class172.field1930) / 16;
                                                                            }

                                                                            if (field337 != class129.field1584) {
                                                                                class129.field1584 += (field337 - class129.field1584) / 16;
                                                                            }
                                                                        } else {
                                                                            class172.field1930 = field552;
                                                                            class129.field1584 = field337;
                                                                        }

                                                                        var8 = class172.field1930 >> 7;
                                                                        var9 = class129.field1584 >> 7;
                                                                        var10 = class413.method8434(class333.field3836, class172.field1930, class129.field1584, var7);
                                                                        var11 = 0;
                                                                        int var15;
                                                                        if (var8 > 3 && var9 > 3 && var8 < 100 && var9 < 100) {
                                                                            for (var12 = var8 - 4; var12 <= var8 + 4; ++var12) {
                                                                                for (var35 = var9 - 4; var35 <= var9 + 4; ++var35) {
                                                                                    var14 = var7;
                                                                                    if (var7 < 3 && (class333.field3836.field1168[1][var12][var35] & 2) == 2) {
                                                                                        var14 = var7 + 1;
                                                                                    }

                                                                                    var15 = var10 - class333.field3836.field1173[var14][var12][var35];
                                                                                    if (var15 > var11) {
                                                                                        var11 = var15;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }

                                                                        var12 = var11 * 192;
                                                                        if (var12 > 98048) {
                                                                            var12 = 98048;
                                                                        }

                                                                        if (var12 < 32768) {
                                                                            var12 = 32768;
                                                                        }

                                                                        if (var12 > field416) {
                                                                            field416 += (var12 - field416) / 24;
                                                                        } else if (var12 < field416) {
                                                                            field416 += (var12 - field416) / 80;
                                                                        }

                                                                        var14 = ((class598) var70).vmethod11534();
                                                                        var15 = ((class598) var70).vmethod11529();
                                                                        int var42 = class413.method8434(var67, var14, var15, var7);
                                                                        class505 var43 = (class505) class333.field3836.field1171.method8596((long) var67.field1172);
                                                                        if (var43 != null) {
                                                                            var42 += class413.method8434(class333.field3836, var43.vmethod11534(), var43.vmethod11529(), var43.vmethod11530());
                                                                        }

                                                                        field512 = var42;
                                                                        class191.field2078 = field512 - field558;
                                                                    } else if (field336 == 1) {
                                                                        class67.method2155();
                                                                        short var51 = -1;
                                                                        if (field551.method6138(33)) {
                                                                            var51 = 0;
                                                                        } else if (field551.method6138(49)) {
                                                                            var51 = 1024;
                                                                        }

                                                                        if (field551.method6138(48)) {
                                                                            if (var51 == 0) {
                                                                                var51 = 1792;
                                                                            } else if (var51 == 1024) {
                                                                                var51 = 1280;
                                                                            } else {
                                                                                var51 = 1536;
                                                                            }
                                                                        } else if (field551.method6138(50)) {
                                                                            if (var51 == 0) {
                                                                                var51 = 256;
                                                                            } else if (var51 == 1024) {
                                                                                var51 = 768;
                                                                            } else {
                                                                                var51 = 512;
                                                                            }
                                                                        }

                                                                        byte var54 = 0;
                                                                        if (field551.method6138(35)) {
                                                                            var54 = -1;
                                                                        } else if (field551.method6138(51)) {
                                                                            var54 = 1;
                                                                        }

                                                                        var7 = 0;
                                                                        if (var51 >= 0 || var54 != 0) {
                                                                            var7 = field551.method6138(81) ? field339 : field338;
                                                                            var7 *= 16;
                                                                            field414 = var51;
                                                                            field548 = var54;
                                                                        }

                                                                        if (field599 < var7) {
                                                                            field599 += var7 / 8;
                                                                            if (field599 > var7) {
                                                                                field599 = var7;
                                                                            }
                                                                        } else if (field599 > var7) {
                                                                            field599 = field599 * 9 / 10;
                                                                        }

                                                                        if (field599 > 0) {
                                                                            var8 = field599 / 16;
                                                                            if (field414 >= 0) {
                                                                                var5 = field414 - class302.field3460 & 2047;
                                                                                var9 = class225.field2637[var5];
                                                                                var10 = class225.field2636[var5];
                                                                                class172.field1930 += var9 * var8 / 65536;
                                                                                class129.field1584 += var8 * var10 / 65536;
                                                                            }

                                                                            if (field548 != 0) {
                                                                                class191.field2078 += var8 * field548;
                                                                                if (class191.field2078 > 0) {
                                                                                    class191.field2078 = 0;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            field414 = -1;
                                                                            field548 = -1;
                                                                        }

                                                                        char var55 = '耀';
                                                                        if (var55 > field416) {
                                                                            field416 += (var55 - field416) / 24;
                                                                        } else if (var55 < field416) {
                                                                            field416 += (var55 - field416) / 80;
                                                                        }

                                                                        if (field551.method6138(13)) {
                                                                            packetWriter.addNode(EnumComposition.getPacketBufferNode(ClientPackets.field3611, packetWriter.isaacCipher));
                                                                            field336 = 0;
                                                                        }
                                                                    }

                                                                    if (class35.field218 == 4 && class423.field5058) {
                                                                        var5 = class35.field220 - field366;
                                                                        field420 = var5 * 2;
                                                                        field366 = var5 != -1 && var5 != 1 ? (field366 + class35.field220) / 2 : class35.field220;
                                                                        var6 = field515 - class35.field231;
                                                                        field417 = var6 * 2;
                                                                        field515 = var6 != -1 && var6 != 1 ? (class35.field231 + field515) / 2 : class35.field231;
                                                                    } else {
                                                                        if (field551.method6138(96)) {
                                                                            field417 += (-24 - field417) / 2;
                                                                        } else if (field551.method6138(97)) {
                                                                            field417 += (24 - field417) / 2;
                                                                        } else {
                                                                            field417 /= 2;
                                                                        }

                                                                        if (field551.method6138(98)) {
                                                                            field420 += (12 - field420) / 2;
                                                                        } else if (field551.method6138(99)) {
                                                                            field420 += (-12 - field420) / 2;
                                                                        } else {
                                                                            field420 /= 2;
                                                                        }

                                                                        field366 = class35.field220;
                                                                        field515 = class35.field231;
                                                                    }

                                                                    field424 = field417 / 2 + field424 & 2047;
                                                                    field415 += field420 / 2;
                                                                    if (field415 < 128) {
                                                                        field415 = 128;
                                                                    }

                                                                    if (field415 > 383) {
                                                                        field415 = 383;
                                                                    }

                                                                    if (field449) {
                                                                        class302.method6829(class257.field3087, class114.field1510, class401.field4853);
                                                                        class171.method4066(class63.field884, class165.field1886);
                                                                        if (class187.field2052 == class257.field3087 && class174.field1940 == class114.field1510 && class401.field4853 == class10.field46 && class63.field884 == class401.field4855 && class302.field3460 == class165.field1886) {
                                                                            field449 = false;
                                                                            field474 = false;
                                                                            field553 = false;
                                                                            field587 = false;
                                                                            class169.field1909 = 0;
                                                                            class227.field2654 = 0;
                                                                            class503.field5413 = 0;
                                                                            class47.field687 = 0;
                                                                            class145.field1725 = 0;
                                                                            class282.field3290 = 0;
                                                                            class265.field3150 = 0;
                                                                            class25.field114 = 0;
                                                                            class215.field2487 = 0;
                                                                            class421.field5046 = 0;
                                                                            field589 = null;
                                                                            field477 = null;
                                                                            field514 = null;
                                                                        }
                                                                    } else if (field474) {
                                                                        class27.method409();
                                                                    }

                                                                    for (var5 = 0; var5 < 5; ++var5) {
                                                                        var10002 = field406[var5]++;
                                                                    }

                                                                    class516.varcs.method2895();
                                                                    var5 = class464.method9404();
                                                                    var6 = class79.method2701();
                                                                    class329 var71;
                                                                    if (var5 > 15000 && var6 > 15000) {
                                                                        logoutTimer = 250;
                                                                        class37.method740(14500);
                                                                        var71 = EnumComposition.getPacketBufferNode(ClientPackets.field3573, packetWriter.isaacCipher);
                                                                        packetWriter.addNode(var71);
                                                                    }

                                                                    class40.field279.method1562();

                                                                    for (var7 = 0; var7 < field601.size(); ++var7) {
                                                                        var9 = (Integer) field601.get(var7);
                                                                        class146 var72 = class120.method3516(var9);
                                                                        if (var72 == null) {
                                                                            var8 = 2;
                                                                        } else {
                                                                            var8 = var72.method3754() ? 0 : 1;
                                                                        }

                                                                        if (var8 != 2) {
                                                                            field601.remove(var7);
                                                                            --var7;
                                                                        }
                                                                    }

                                                                    ++packetWriter.field1298;
                                                                    if (packetWriter.field1298 > 50) {
                                                                        var71 = EnumComposition.getPacketBufferNode(ClientPackets.field3639, packetWriter.isaacCipher);
                                                                        packetWriter.addNode(var71);
                                                                    }

                                                                    try {
                                                                        packetWriter.flush();
                                                                    } catch (IOException var44) {
                                                                        class361.method7512();
                                                                    }

                                                                    class259.method5905().method5968();
                                                                    return;
                                                                }

                                                                if (var65.field3196.field4147 == 12) {
                                                                    var50 = true;
                                                                }

                                                                class146.method3781(var65);
                                                            }
                                                        }

                                                        var63 = var60.field893;
                                                        if (var63.field4145 * -217986249 < 0) {
                                                            break;
                                                        }

                                                        var66 = class119.field1554.method7476(var63.field4164);
                                                    } while (var66 == null || var66.field4286 == null || var63.field4145 * -217986249 >= var66.field4286.length || var63 != var66.field4286[var63.field4145 * -217986249]);

                                                    class329.method7047(var60);
                                                }
                                            }

                                            var63 = var60.field893;
                                            if (var63.field4145 * -217986249 < 0) {
                                                break;
                                            }

                                            var66 = class119.field1554.method7476(var63.field4164);
                                        } while (var66 == null || var66.field4286 == null || var63.field4145 * -217986249 >= var66.field4286.length || var63 != var66.field4286[var63.field4145 * -217986249]);

                                        class329.method7047(var60);
                                    }
                                }

                                var63 = var60.field893;
                                if (var63.field4145 * -217986249 < 0) {
                                    break;
                                }

                                var66 = class119.field1554.method7476(var63.field4164);
                            } while (var66 == null || var66.field4286 == null || var63.field4145 * -217986249 >= var66.field4286.length || var63 != var66.field4286[var63.field4145 * -217986249]);

                            class329.method7047(var60);
                        }
                    }

                    var46 = EnumComposition.getPacketBufferNode(ClientPackets.field3555, packetWriter.isaacCipher);
                    var46.out.writeByte(0);
                    var3 = var46.out.offset * 1216585693;
                    class242.method5611(var46.out);
                    var46.out.method11191(var46.out.offset * 1216585693 - var3);
                    packetWriter.addNode(var46);
                }
            }
        }
    }

    @ObfuscatedName("qp")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "1175201789"
    )
    void method832() {
        if (class35.lastButton == 1 || !class423.field5058 && class35.lastButton == 4 || class35.lastButton == 2) {
            long var1 = class35.field219 - field394 * -1L;
            if (var1 > 32767L) {
                var1 = 32767L;
            }

            field394 = class35.field219 * -1L;
            int var3 = class35.field224;
            if (var3 < 0) {
                var3 = 0;
            } else if (var3 > class396.screenHeight) {
                var3 = class396.screenHeight;
            }

            int var4 = class35.field221;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > class34.screenWidth) {
                var4 = class34.screenWidth;
            }

            int var5 = (int) var1;
            class329 var6;
            if (class585.field5890 >= 232) {
                var6 = EnumComposition.getPacketBufferNode(ClientPackets.field3632, packetWriter.isaacCipher);
                var6.out.method11238(var4);
                var6.out.writeShortBigEndian((class35.lastButton == 2 ? 1 : 0) + (var5 << 1));
                var6.out.writeIntME(var3);
                var6.out.method11228(0);
                packetWriter.addNode(var6);
            } else {
                var6 = EnumComposition.getPacketBufferNode(ClientPackets.field3551, packetWriter.isaacCipher);
                var6.out.writeShortBigEndian((var5 << 1) + (class35.lastButton == 2 ? 1 : 0));
                var6.out.writeShortBigEndian(var4);
                var6.out.writeShortBigEndian(var3);
                packetWriter.addNode(var6);
            }
        }

    }

    @ObfuscatedName("qe")
    @ObfuscatedSignature(
            descriptor = "(IIB)V",
            garbageValue = "1"
    )
    public void vmethod7338(int var1, int var2) {
        if (packetWriter != null && packetWriter.isaacCipher != null) {
            if (var1 > -1 && class36.clientPreferences.method2568() > 0 && !field446) {
                class329 var3 = EnumComposition.getPacketBufferNode(ClientPackets.field3547, packetWriter.isaacCipher);
                var3.out.writeIntBigEndian(var1);
                packetWriter.addNode(var3);
            }

        }
    }

    @ObfuscatedName("qi")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "-2029993689"
    )
    void resizeJS() {
        int var1 = class34.screenWidth;
        int var2 = class396.screenHeight;
        if (super.field197 < var1) {
            var1 = super.field197;
        }

        if (super.field198 < var2) {
            var2 = super.field198;
        }

        if (class36.clientPreferences != null) {
            try {
                class26.method406(class521.field5519, "resize", new Object[]{class35.getWindowedMode()});
            } catch (Throwable var4) {
            }
        }

    }

    @ObfuscatedName("qt")
    @ObfuscatedSignature(
            descriptor = "(B)V",
            garbageValue = "0"
    )
    final void drawLoggedIn() {
        if (rootInterface != -1) {
            class185.method4215(rootInterface);
        }

        int var1;
        for (var1 = 0; var1 < rootWidgetCount; ++var1) {
            if (field436[var1]) {
                field566[var1] = true;
            }

            field356[var1] = field436[var1];
            field436[var1] = false;
        }

        field450 = cycle;
        viewportX = -1;
        viewportY = -1;
        if (rootInterface != -1) {
            rootWidgetCount = 0;
            class164.drawWidgets(rootInterface, 0, 0, class34.screenWidth, class396.screenHeight, 0, 0, -1);
        }

        class601.Rasterizer2D_resetClip();
        if (showMouseCross) {
            if (field508 == 1) {
                class195.field2156[field485 * 20 / 100].method11705(field505 - 8, field506 - 8);
            }

            if (field508 == 2) {
                class195.field2156[field485 * 20 / 100 + 4].method11705(field505 - 8, field506 - 8);
            }
        }

        if (!isMenuOpen) {
            if (viewportX != -1) {
                var1 = viewportX;
                int var2 = viewportY;
                if ((field522.field6052 >= 2 || field357 != 0 || field529) && field527) {
                    int var3 = field522.field6052 - 1;
                    String var5;
                    if (field357 == 1 && field522.field6052 < 2) {
                        var5 = "Use" + " " + field528 + " " + "->";
                    } else if (field529 && field522.field6052 < 2) {
                        var5 = field374 + " " + field533 + " " + "->";
                    } else {
                        var5 = field522.method11859(var3);
                    }

                    if (field522.field6052 > 2) {
                        var5 = var5 + class134.method3619(16777215) + " " + '/' + " " + (field522.field6052 - 2) + " more options";
                    }

                    class333.field3831.method9468(var5, var1 + 4, var2 + 15, 16777215, 0, cycle / 1000);
                }
            }
        } else {
            field522.method11877();
        }

        if (gameDrawingMode == 3) {
            for (var1 = 0; var1 < rootWidgetCount; ++var1) {
                if (field356[var1]) {
                    class601.Rasterizer2D_fillRectangleAlpha(rootWidgetPos1[var1], rootWidgetPos2[var1], rootWidgetPos3[var1], rootWidgetPos4[var1], 16711935, 128);
                } else if (field566[var1]) {
                    class601.Rasterizer2D_fillRectangleAlpha(rootWidgetPos1[var1], rootWidgetPos2[var1], rootWidgetPos3[var1], rootWidgetPos4[var1], 16711680, 128);
                }
            }
        }

        this.method818();
    }

    @ObfuscatedName("qr")
    @ObfuscatedSignature(
            descriptor = "(S)V",
            garbageValue = "22523"
    )
    void method818() {
        class452 var1 = field333.method2361();
        class505 var2 = field333.method2347();
        int var3 = (int) var1.field5176;
        int var4 = (int) var1.field5175;
        int var5 = (int) var1.field5169;
        int var6 = field389;
        Iterator var7 = field333.iterator();

        while (var7.hasNext()) {
            class79 var8 = (class79) var7.next();

            for (class72 var9 = (class72) var8.method2684().method8690(); var9 != null; var9 = (class72) var8.method2684().method8692()) {
                var9.method2242(var2, var3, var4, var5, var6);
            }
        }

        var1.method8992();
        field389 = 0;
    }

    @ObfuscatedName("qv")
    @ObfuscatedSignature(
            descriptor = "(Ldz;B)Z",
            garbageValue = "-62"
    )
    boolean method819(class92 var1) {
        if (var1.serverPacketLength == 0) {
            class22.field90 = null;
        } else {
            if (class22.field90 == null) {
                class22.field90 = new class495(class92.loginType, class521.field5519);
            }

            class22.field90.method9886(var1.packetBuffer);
        }

        field363 = field404;
        class159.field1829 = true;
        var1.serverPacket = null;
        return true;
    }

    @ObfuscatedName("qf")
    @ObfuscatedSignature(
            descriptor = "(Ldz;I)Z",
            garbageValue = "1657765967"
    )
    boolean method1047(class92 var1) {
        if (class22.field90 != null) {
            class22.field90.method9887(var1.packetBuffer);
        }

        field363 = field404;
        class159.field1829 = true;
        var1.serverPacket = null;
        return true;
    }

    @ObfuscatedName("qo")
    @ObfuscatedSignature(
            descriptor = "(I)V",
            garbageValue = "-425772092"
    )
    void incomingServerPackets() {
        System.out.println("idk ");
        int var1 = 0;
        boolean var2 = packetWriter.field1289 > 0;

        for (int var3 = packetWriter.field1300; var1 < 100 || var2; var2 = packetWriter.field1289 > 0) {
            boolean var4 = this.packetHandle(packetWriter);
            if (var2) {
                int var5 = packetWriter.field1300 - var3;
                class92 var10000 = packetWriter;
                var10000.field1289 -= var5;
            }

            if (!var4) {
                break;
            }

            ++var1;
            var3 = packetWriter.field1300;
        }

    }

    @ObfuscatedName("qm")
    @ObfuscatedSignature(
            descriptor = "(Ldz;I)Z",
            garbageValue = "-1032348597"
    )
    final boolean packetHandle(class92 var1) {
        System.out.println("Here server incomingServerPackets decoding");
        class511 var2 = var1.getSocket();
        PacketBuffer var3 = var1.packetBuffer;
        if (var2 == null) {
            System.out.println("SDAD");
            return false;
        } else {
            String var23;
            int var24;
            try {
                if (var1.field1289 > 0 && !var2.vmethod10194(var1.field1289)) {
                    return false;
                }

                int var5;
                if (var1.serverPacket == null) {
                    if (var1.field1296) {
                        if (!var2.vmethod10194(1)) {
                            return false;
                        }

                        var1.field1300 += var2.read(var1.packetBuffer.array, 0, 1);
                        var1.field1297 = 0;
                        var1.field1296 = false;
                    }

                    var3.offset = 0;
                    if (var3.method11142()) {
                        if (!var2.vmethod10194(1)) {
                            return false;
                        }

                        var1.field1300 += var2.read(var1.packetBuffer.array, 1, 1);
                        var1.field1297 = 0;
                    }

                    var1.field1296 = true;
                    ServerPackets[] var4 = class174.method4107();
                    var5 = var3.method11136();
                    if (var5 < 0 || var5 >= var4.length) {
                        throw new IOException(var5 + " " + var3.offset * 1216585693);
                    }

                    var1.serverPacket = var4[var5];
                    var1.serverPacketLength = var1.serverPacket.length;
                }

                if (var1.serverPacketLength == -1) {
                    if (!var2.vmethod10194(1)) {
                        return false;
                    }

                    var1.field1300 += var2.read(var3.array, 0, 1);
                    var1.serverPacketLength = var3.array[0] & 255;
                }

                if (var1.serverPacketLength == -2) {
                    if (!var2.vmethod10194(2)) {
                        return false;
                    }

                    var1.field1300 += var2.read(var3.array, 0, 2);
                    var3.offset = 0;
                    var1.serverPacketLength = var3.readUnsignedShort();
                }

                if (!var2.vmethod10194(var1.serverPacketLength)) {
                    return false;
                }

                var3.offset = 0;
                var1.field1300 += var2.read(var3.array, 0, var1.serverPacketLength);
                var1.field1297 = 0;
                timer.method8246();
                var1.field1306 = var1.field1302;
                var1.field1302 = var1.field1295;
                var1.field1295 = var1.serverPacket;
                if (ServerPackets.LOGOUT_TRANSFER == var1.serverPacket) {
                    class44 var58 = new class44();
                    var58.field634 = var3.method11207();
                    var58.field640 = var3.readUnsignedShort();
                    var5 = var3.read32BitArray();
                    var58.field632 = var5;
                    if (var58.method1470()) {
                        var58.field638 = "beta";
                        class509.isBetaBuild = true;
                    } else {
                        class509.isBetaBuild = false;
                    }

                    class121.updateGameState(45);
                    var2.vmethod10196();
                    var2 = null;
                    class198.method4391(var58);
                    var1.serverPacket = null;
                    return false;
                }

                byte var96;
                if (ServerPackets.CLANSETTINGS_DELTA == var1.serverPacket) {
                    class62.method2122();
                    var96 = var3.method11197();
                    class154 var100 = new class154(var3);
                    class162 var84;
                    if (var96 >= 0) {
                        var84 = field365[var96];
                    } else {
                        var84 = class483.field5333;
                    }

                    if (var84 == null) {
                        this.method831(var96);
                        var1.serverPacket = null;
                        return true;
                    }

                    if (var100.field1787 > var84.field1870) {
                        this.method831(var96);
                        var1.serverPacket = null;
                        return true;
                    }

                    if (var100.field1787 < var84.field1870) {
                        var1.serverPacket = null;
                        return true;
                    }

                    var100.method3839(var84);
                    var1.serverPacket = null;
                    return true;
                }

                int var22;
                class369 var98;
                if (ServerPackets.IF_SETPLAYERHEAD == var1.serverPacket) {
                    var22 = var3.method11252();
                    var98 = class119.field1554.method7476(var22);
                    var98.field4192 = 3;
                    var98.field4277 = class76.field1108.field935.method7536();
                    class89.method2877(var98);
                    var1.serverPacket = null;
                    return true;
                }

                int var7;
                class81 var63;
                if (ServerPackets.NPC_HEADICON_SPECIFIC == var1.serverPacket) {
                    short var112 = (short) var3.method11445();
                    var5 = var3.method11254();
                    var24 = var3.method11422();
                    var7 = var3.method11196();
                    var63 = (class81) class484.field5343.field1160.method8567((long) var24);
                    if (var63 != null) {
                        var63.method2726(var7, var5, var112);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.SET_ACTIVE_WORLD_V2 == var1.serverPacket) {
                    var22 = var3.method11452();
                    var5 = var3.method11196();
                    if (var22 == -1) {
                        class333.field3836.field1170 = var5;
                        class484.field5343 = class333.field3836;
                    } else {
                        class505 var83 = (class505) class333.field3836.field1171.method8596((long) var22);
                        if (var83 == null) {
                            throw new RuntimeException("No valid ClientWorldEntity with ID " + var22);
                        }

                        var83.field5429.field1170 = var5;
                        class484.field5343 = var83.field5429;
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.SEND_PING == var1.serverPacket) {
                    var22 = var3.read32BitArray();
                    var5 = var3.read32BitArray();
                    var24 = class264.method5960();
                    class329 var101 = EnumComposition.getPacketBufferNode(ClientPackets.field3616, packetWriter.isaacCipher);
                    var101.out.writeMedium(class34.field179);
                    var101.out.putIntCustomEndian(var22);
                    var101.out.writeIntBigEndian(var5);
                    var101.out.method11228(var24);
                    packetWriter.addNode(var101);
                    var1.serverPacket = null;
                    return true;
                }

                class369 var6;
                String var52;
                if (ServerPackets.IF_SETTEXT == var1.serverPacket) {
                    var52 = var3.method11207();
                    var5 = var3.method11252();
                    var6 = class119.field1554.method7476(var5);
                    if (!var52.equals(var6.field4211)) {
                        var6.field4211 = var52;
                        class89.method2877(var6);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.OBJ_ADD == var1.serverPacket) {
                    class211.method4600(class328.field3645);
                    var1.serverPacket = null;
                    return true;
                }

                int var9;
                int var26;
                if (ServerPackets.IF_SETCOLOUR == var1.serverPacket) {
                    var22 = var3.method11422();
                    var5 = var3.method11252();
                    var24 = var22 >> 10 & 31;
                    var7 = var22 >> 5 & 31;
                    var26 = var22 & 31;
                    var9 = (var7 << 11) + (var24 << 19) + (var26 << 3);
                    class369 var75 = class119.field1554.method7476(var5);
                    if (var9 != var75.field4173) {
                        var75.field4173 = var9;
                        class89.method2877(var75);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                class369 var25;
                if (ServerPackets.IF_SETPOSITION == var1.serverPacket) {
                    var22 = var3.method11452();
                    var5 = var3.method11254();
                    var24 = var3.method11452();
                    var25 = class119.field1554.method7476(var5);
                    if (var24 != var25.field4209 || var22 != var25.field4228 || var25.field4150 != 0 || var25.field4161 != 0) {
                        var25.field4209 = var24;
                        var25.field4228 = var22;
                        var25.field4150 = 0;
                        var25.field4161 = 0;
                        class89.method2877(var25);
                        this.method962(var25);
                        if (var25.field4147 == 0) {
                            class23.method337(class119.field1554.field4037[var5 >> 16], var25, false);
                        }
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.NPC_ANIM_SPECIFIC == var1.serverPacket) {
                    var5 = var3.method11181();
                    var24 = var3.method11230();
                    var22 = var3.method11241();
                    if (var5 == 65535) {
                        var5 = -1;
                    }

                    class81 var97 = (class81) class484.field5343.field1160.method8567((long) var22);
                    if (var97 != null) {
                        class215 var71 = var97.field1074.method9581();
                        if (var5 == var97.method2484() && var5 != -1) {
                            var9 = var71.field2489;
                            if (var9 == 1) {
                                var97.field1074.method9572();
                                var97.field1102 = var24;
                            } else if (var9 == 2) {
                                var97.field1074.method9589();
                            }
                        } else if (var5 == -1 || var71 == null || class177.method4155(var5).field2480 >= var71.field2480) {
                            var97.field1074.method9573(var5);
                            var97.field1074.method9572();
                            var97.field1102 = var24;
                            var97.field1040 = var97.field1100;
                        }
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.IF_CLEARINV == var1.serverPacket) {
                    var22 = var3.read32BitArray();
                    var98 = class119.field1554.method7476(var22);

                    for (var24 = 0; var24 < var98.field4259.length; ++var24) {
                        var98.field4259[var24] = -1;
                        var98.field4259[var24] = 0;
                    }

                    class89.method2877(var98);
                    var1.serverPacket = null;
                    return true;
                }

                int var27;
                if (ServerPackets.CAM_LOOKAT == var1.serverPacket) {
                    field474 = true;
                    field449 = false;
                    field587 = false;
                    class169.field1909 = var3.method11196();
                    class227.field2654 = var3.method11196();
                    class503.field5413 = var3.readUnsignedShort();
                    class47.field687 = var3.method11196();
                    class145.field1725 = var3.method11196();
                    if (class145.field1725 >= 100) {
                        var22 = class356.method7416(class169.field1909);
                        var5 = class356.method7416(class227.field2654);
                        var24 = class413.method8434(class333.field3836, var22, var5, class333.field3836.field1170) - class503.field5413;
                        var7 = var22 - class187.field2052;
                        var26 = var24 - class174.field1940;
                        var9 = var5 - class10.field46;
                        var27 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
                        class401.field4855 = (int) (Math.atan2((double) var26, (double) var27) * 325.9490051269531D) & 2047;
                        class302.field3460 = (int) (Math.atan2((double) var7, (double) var9) * -325.9490051269531D) & 2047;
                        if (class401.field4855 < 128) {
                            class401.field4855 = 128;
                        }

                        if (class401.field4855 > 383) {
                            class401.field4855 = 383;
                        }
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.CAM_ROTATEBY == var1.serverPacket) {
                    field474 = true;
                    field449 = false;
                    field587 = true;
                    var22 = var3.method11452();
                    var5 = var3.method11452();
                    var24 = class274.method6161(var5 + class401.field4855 & 2027);
                    var7 = var22 + class302.field3460;
                    var26 = var3.readUnsignedShort();
                    var9 = var3.method11196();
                    field477 = new class550(class401.field4855, var24, var26, var9);
                    field514 = new class550(class302.field3460, var7, var26, var9);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.CLANCHANNEL_DELTA == var1.serverPacket) {
                    field484 = field404;
                    var96 = var3.method11197();
                    class168 var95 = new class168(var3);
                    class171 var81;
                    if (var96 >= 0) {
                        var81 = field582[var96];
                    } else {
                        var81 = class86.field1229;
                    }

                    if (var81 == null) {
                        this.method830(var96);
                        var1.serverPacket = null;
                        return true;
                    }

                    if (var95.field1898 > var81.field1922) {
                        this.method830(var96);
                        var1.serverPacket = null;
                        return true;
                    }

                    if (var95.field1898 < var81.field1922) {
                        var1.serverPacket = null;
                        return true;
                    }

                    var95.method4044(var81);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.RUNCLIENTSCRIPT == var1.serverPacket) {
                    var52 = var3.method11207();
                    Object[] var94 = new Object[var52.length() + 1];

                    for (var24 = var52.length() - 1; var24 >= 0; --var24) {
                        class519 var68;
                        switch (var52.charAt(var24)) {
                            case 'W':
                                var7 = var3.method11218();
                                var68 = new class519(class574.field5820, 0, var7, var7);
                                int[] var106 = var68.method10318();

                                for (var27 = 0; var27 < var7; ++var27) {
                                    var106[var27] = var3.method11231();
                                }

                                var94[var24 + 1] = var68;
                                break;
                            case 'X':
                                var7 = var3.method11218();
                                var68 = new class519(class574.field5824, (Object) null, var7, var7);
                                Object[] var104 = var68.method10321();

                                for (var27 = 0; var27 < var7; ++var27) {
                                    var104[var27] = var3.method11207();
                                }

                                var94[var24 + 1] = var68;
                                break;
                            case 's':
                                var94[var24 + 1] = var3.method11207();
                                break;
                            default:
                                var94[var24 + 1] = new Integer(var3.read32BitArray());
                        }
                    }

                    var94[0] = new Integer(var3.read32BitArray());
                    class65 var80 = new class65();
                    var80.field898 = var94;
                    class329.method7047(var80);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.PLAYER_INFO == var1.serverPacket) {
                    field335.method2854(var3, var1.serverPacketLength);
                    class259.method5907();
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.CAM_SHAKE == var1.serverPacket) {
                    var22 = var3.method11196();
                    var5 = var3.method11196();
                    var24 = var3.method11196();
                    var7 = var3.method11196();
                    field610[var22] = true;
                    field593[var22] = var5;
                    field594[var22] = var24;
                    field595[var22] = var7;
                    field406[var22] = 0;
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.CLANCHANNEL_FULL == var1.serverPacket) {
                    field484 = field404;
                    var96 = var3.method11197();
                    if (var1.serverPacketLength == 1) {
                        if (var96 >= 0) {
                            field582[var96] = null;
                        } else {
                            class86.field1229 = null;
                        }

                        var1.serverPacket = null;
                        return true;
                    }

                    if (var96 >= 0) {
                        field582[var96] = new class171(var3);
                    } else {
                        class86.field1229 = new class171(var3);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                int var11;
                class64 var90;
                if (ServerPackets.IF_RESYNC_V2 == var1.serverPacket) {
                    var22 = var3.offset * 1216585693 + var1.serverPacketLength;
                    var5 = var3.readUnsignedShort();
                    if (var5 == 65535) {
                        var5 = -1;
                    }

                    var24 = var3.readUnsignedShort();
                    if (var5 != rootInterface) {
                        rootInterface = var5;
                        this.resizeRoot(false);
                        class1.method10(rootInterface);
                        StudioGame.method8640(rootInterface);

                        for (var7 = 0; var7 < 100; ++var7) {
                            field436[var7] = true;
                        }
                    }

                    class64 var70;
                    for (; var24-- > 0; var70.field887 = true) {
                        var7 = var3.read32BitArray();
                        var26 = var3.readUnsignedShort();
                        var9 = var3.method11196();
                        var70 = (class64) field422.method8623((long) var7);
                        if (var70 != null && var26 != var70.field888) {
                            class279.method6318(var70, true);
                            var70 = null;
                        }

                        if (var70 == null) {
                            var70 = class143.method3733(var7, var26, var9);
                        }
                    }

                    for (var90 = (class64) field422.method8626(); var90 != null; var90 = (class64) field422.method8627()) {
                        if (var90.field887) {
                            var90.field887 = false;
                        } else {
                            class279.method6318(var90, true);
                        }
                    }

                    field438 = new class428(512);

                    while (var3.offset * 1216585693 < var22) {
                        var7 = var3.read32BitArray();
                        var26 = var3.readUnsignedShort();
                        var9 = var3.readUnsignedShort();
                        var27 = var3.read32BitArray();
                        var11 = var3.read32BitArray();
                        class359 var73 = class342.method7325((class359) null, var26, var9, var27, var11);
                        field438.method8625(var73, (long) var7);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.SERVER_TICK_END == var1.serverPacket) {
                    ++field567;
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.OBJ_COUNT == var1.serverPacket) {
                    class211.method4600(class328.field3643);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.IF_SETNPCHEAD == var1.serverPacket) {
                    var22 = var3.method11181();
                    var5 = var3.method11252();
                    var6 = class119.field1554.method7476(var5);
                    if (var6.field4192 != 2 || var22 != var6.field4277) {
                        var6.field4192 = 2;
                        var6.field4277 = var22;
                        class89.method2877(var6);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.CAM_MOVETO == var1.serverPacket) {
                    field474 = true;
                    field449 = false;
                    field553 = false;
                    class25.field114 = var3.method11196();
                    class215.field2487 = var3.method11196();
                    class421.field5046 = var3.readUnsignedShort();
                    class265.field3150 = var3.method11196();
                    class282.field3290 = var3.method11196();
                    if (class282.field3290 >= 100) {
                        class187.field2052 = class356.method7416(class25.field114);
                        class10.field46 = class356.method7416(class215.field2487);
                        class174.field1940 = class413.method8434(class333.field3836, class187.field2052, class10.field46, class333.field3836.field1170) - class421.field5046;
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.OBJ_UNCUSTOMISE == var1.serverPacket) {
                    class211.method4600(class328.field3644);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.SET_NPC_UPDATE_ORIGIN == var1.serverPacket) {
                    class23.field94 = var3.method11196();
                    class274.field3224 = var3.method11196();
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.NPC_INFO_SMALL_V5 == var1.serverPacket) {
                    class301.method6827(class484.field5343, false, var3);
                    var1.serverPacket = null;
                    return true;
                }

                int var13;
                int var15;
                int var16;
                int var17;
                int var29;
                int var82;
                if (ServerPackets.PROJANIM_SPECIFIC_V4 == var1.serverPacket) {
                    var22 = var3.method11252();
                    var5 = class356.method7413(var22);
                    var24 = class356.method7424(var22);
                    var7 = class356.method7415(var22);
                    var26 = var3.method11181();
                    var9 = var3.readUnsignedShort();
                    var27 = var3.method11241();
                    var11 = var3.method11295();
                    var29 = class356.method7413(var11);
                    var13 = class356.method7424(var11);
                    var82 = class356.method7415(var11);
                    var15 = var3.method11281();
                    var16 = var3.method11181();
                    var17 = var3.method11247();
                    int var18 = var3.method11248();
                    int var19 = var3.readUnsignedShort();
                    int var20 = var3.method11241();
                    if (var27 != 65535) {
                        class53 var21 = new class53(var5, var24, var7, var26, var17, var29, var13, var82, var9, var18, var27, var16 + cycle, var20 + cycle, var15, var19);
                        field334.method8689(var21);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                boolean var108;
                if (ServerPackets.IF_SETPLAYERMODEL_SELF == var1.serverPacket) {
                    var108 = var3.method11196() == 1;
                    var5 = var3.method11295();
                    var6 = class119.field1554.method7476(var5);
                    var6.method7977(class76.field1108.field935, var108);
                    class89.method2877(var6);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.REFLECTION_CHECKER == var1.serverPacket) {
                    class71.method2239(var3, var1.serverPacketLength);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.LOC_ADD_CHANGE_V2 == var1.serverPacket) {
                    class211.method4600(class328.field3654);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UPDATE_UID192 == var1.serverPacket) {
                    var3.offset += 458443980;
                    if (var3.method11242()) {
                        class270.method6064(var3, var3.offset * 1216585693 - 28);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.IF_OPENSUB == var1.serverPacket) {
                    var22 = var3.method11241();
                    var5 = var3.method11252();
                    var24 = var3.method11196();
                    var90 = (class64) field422.method8623((long) var5);
                    if (var90 != null) {
                        class279.method6318(var90, var22 != var90.field888);
                    }

                    class143.method3733(var5, var22, var24);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UPDATE_TRADINGPOST == var1.serverPacket) {
                    var108 = var3.method11196() == 1;
                    if (var108) {
                        class371.field4311 = class189.method4284() - var3.method11203();
                        class477.field5305 = new class414(var3, true);
                    } else {
                        class477.field5305 = null;
                    }

                    field560 = field404;
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.OBJ_DEL == var1.serverPacket) {
                    class211.method4600(class328.field3646);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.MIDI_SWAP == var1.serverPacket) {
                    var7 = var3.method11422();
                    var22 = var3.readUnsignedShort();
                    var5 = var3.method11422();
                    var24 = var3.method11181();
                    class173.method4098(var22, var5, var24, var7);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.FRIENDLIST_LOADED == var1.serverPacket) {
                    class40.field279.method1536();
                    field555 = field404;
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.IF_CLOSESUB == var1.serverPacket) {
                    var22 = var3.read32BitArray();
                    class64 var93 = (class64) field422.method8623((long) var22);
                    if (var93 != null) {
                        class279.method6318(var93, true);
                    }

                    if (field564 != null) {
                        class89.method2877(field564);
                        field564 = null;
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.SET_MAP_FLAG == var1.serverPacket) {
                    field581 = var3.method11196();
                    if (field581 == 255) {
                        field581 = 0;
                    }

                    field531 = var3.method11196();
                    if (field531 == 255) {
                        field531 = 0;
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.CHAT_FILTER_SETTINGS == var1.serverPacket) {
                    field440 = var3.method11281();
                    field444 = var3.method11281();
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.MIDI_SONG_V2 == var1.serverPacket) {
                    var24 = var3.readUnsignedShort();
                    var7 = var3.method11422();
                    var26 = var3.method11241();
                    var22 = var3.method11241();
                    var5 = var3.readUnsignedShort();
                    if (var22 == 65535) {
                        var22 = -1;
                    }

                    ArrayList var103 = new ArrayList();
                    var103.add(var22);
                    class568.method10970(var103, var5, var24, var7, var26);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.MAP_ANIM_SPECIFIC == var1.serverPacket) {
                    var24 = var3.method11278();
                    var22 = var24 >> 16;
                    var5 = var24 >> 8 & 255;
                    var7 = var22 + (var24 >> 4 & 7);
                    var26 = var5 + (var24 & 7);
                    var9 = var3.readUnsignedShort();
                    var11 = var3.method11241();
                    var27 = var3.method11196();
                    if (var7 >= 0 && var26 >= 0 && var7 < class484.field5343.field1162 && var26 < class484.field5343.field1163) {
                        var7 = class356.method7416(var7);
                        var26 = class356.method7416(var26);
                        class48 var72 = new class48(class484.field5343, var9, class484.field5343.field1170, var7, var26, class413.method8434(class484.field5343, var7, var26, class484.field5343.field1170) - var27, var11, cycle);
                        class484.field5343.field1174.method8689(var72);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.RESET_INTERACTION_MODE == var1.serverPacket) {
                    var22 = var3.method11452();
                    field333.method2393(var22);
                    var1.serverPacket = null;
                    return true;
                }

                long var30;
                long var32;
                long var34;
                String var39;
                if (ServerPackets.MESSAGE_FRIENDCHANNEL == var1.serverPacket) {
                    var52 = var3.method11207();
                    var30 = var3.method11203();
                    var32 = (long) var3.readUnsignedShort();
                    var34 = (long) var3.method11278();
                    class397 var109 = (class397) class173.findEnumerated(class446.method8926(), var3.method11196());
                    long var110 = var34 + (var32 << 32);
                    boolean var85 = false;

                    for (var15 = 0; var15 < 100; ++var15) {
                        if (var110 == field574[var15]) {
                            var85 = true;
                            break;
                        }
                    }

                    if (var109.field4819 && class40.field279.method1541(new class613(var52, class92.loginType))) {
                        var85 = true;
                    }

                    if (!var85 && field341 == 0) {
                        field574[field575] = var110;
                        field575 = (field575 + 1) % 100;
                        var39 = class465.method9500(class372.method8130(class65.method2145(var3)));
                        if (var109.field4815 != -1) {
                            class109.method3399(9, class57.method2014(var109.field4815) + var52, var39, class189.method4285(var30));
                        } else {
                            class109.method3399(9, var52, var39, class189.method4285(var30));
                        }
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.MIDI_SONG_WITHSECONDARY == var1.serverPacket) {
                    var24 = var3.method11181();
                    var26 = var3.method11422();
                    var7 = var3.method11181();
                    var22 = var3.method11422();
                    if (var22 == 65535) {
                        var22 = -1;
                    }

                    var9 = var3.readUnsignedShort();
                    var5 = var3.readUnsignedShort();
                    if (var5 == 65535) {
                        var5 = -1;
                    }

                    ArrayList var69 = new ArrayList();
                    var69.add(var22);
                    var69.add(var5);
                    class568.method10970(var69, var24, var7, var26, var9);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.IF_SETROTATESPEED == var1.serverPacket) {
                    var22 = var3.method11241();
                    var5 = var3.method11252();
                    var24 = var3.method11181();
                    var25 = class119.field1554.method7476(var5);
                    var25.field4205 = var24 + (var22 << 16);
                    var1.serverPacket = null;
                    return true;
                }

                String var40;
                boolean var74;
                if (ServerPackets.MESSAGE_CLANCHANNEL_SYSTEM == var1.serverPacket) {
                    var96 = var3.method11197();
                    var30 = (long) var3.readUnsignedShort();
                    var32 = (long) var3.method11278();
                    var34 = (var30 << 32) + var32;
                    var74 = false;
                    class171 var12 = var96 >= 0 ? field582[var96] : class86.field1229;
                    if (var12 == null) {
                        var74 = true;
                    } else {
                        for (var13 = 0; var13 < 100; ++var13) {
                            if (field574[var13] == var34) {
                                var74 = true;
                                break;
                            }
                        }
                    }

                    if (!var74) {
                        field574[field575] = var34;
                        field575 = (field575 + 1) % 100;
                        var40 = class65.method2145(var3);
                        var82 = var96 >= 0 ? 43 : 46;
                        class109.method3399(var82, "", var40, var12.field1919);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.CAM_LOOKAT_EASED_COORD == var1.serverPacket) {
                    field474 = true;
                    field449 = false;
                    field587 = true;
                    class169.field1909 = var3.method11196();
                    class227.field2654 = var3.method11196();
                    class503.field5413 = var3.readUnsignedShort();
                    var22 = var3.readUnsignedShort();
                    var5 = var3.method11196();
                    var24 = class356.method7416(class169.field1909);
                    var7 = class356.method7416(class227.field2654);
                    var26 = class413.method8434(class333.field3836, var24, var7, class333.field3836.field1170) - class503.field5413;
                    var9 = var24 - class187.field2052;
                    var27 = var26 - class174.field1940;
                    var11 = var7 - class10.field46;
                    double var37 = Math.sqrt((double) (var9 * var9 + var11 * var11));
                    var82 = class274.method6161((int) (Math.atan2((double) var27, var37) * 325.9490051269531D) & 2047);
                    var15 = class216.method4818((int) (Math.atan2((double) var9, (double) var11) * -325.9490051269531D) & 2047);
                    field477 = new class550(class401.field4855, var82, var22, var5);
                    field514 = new class550(class302.field3460, var15, var22, var5);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
                    var22 = var3.method11196();
                    if (var3.method11196() == 0) {
                        field380[var22] = new class421();
                        var3.offset += -932419526;
                    } else {
                        var3.offset -= -290410379;
                        field380[var22] = new class421(var3, false);
                    }

                    field559 = field404;
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UPDATE_RUNENERGY == var1.serverPacket) {
                    class39.method768();
                    field592 = var3.readUnsignedShort();
                    field561 = field404;
                    var1.serverPacket = null;
                    return true;
                }

                class79 var111;
                if (ServerPackets.OBJ_CUSTOMISE_SPECIFIC == var1.serverPacket) {
                    var22 = var3.method11452();
                    var5 = var3.method11243();
                    var24 = var3.method11241();
                    var7 = var3.method11254();
                    var26 = var3.method11252();
                    var9 = var3.method11422();
                    short var107 = (short) var3.method11445();
                    short var77 = (short) var3.method11244();
                    var29 = class356.method7413(var26);
                    var13 = class356.method7424(var26);
                    var82 = class356.method7415(var26);
                    var111 = field333.method2345(var13, var82);
                    var16 = var13 - var111.field1164;
                    var17 = var82 - var111.field1165;
                    if (var16 >= 0 && var17 >= 0 && var16 < var111.field1162 && var17 < var111.field1163) {
                        class114.method3459(var111, var29, var16, var17, var9, var7, var107, var22, var77, var5, var24);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.WORLDENTITY_INFO_V6 == var1.serverPacket) {
                    class156.method3864(class484.field5343, var3, 6);
                    var1.serverPacket = null;
                    return true;
                }

                class369 var8;
                if (ServerPackets.IF_MOVESUB == var1.serverPacket) {
                    var22 = var3.method11295();
                    var5 = var3.read32BitArray();
                    class64 var76 = (class64) field422.method8623((long) var22);
                    var90 = (class64) field422.method8623((long) var5);
                    if (var90 != null) {
                        class279.method6318(var90, var76 == null || var90.field888 != var76.field888);
                    }

                    if (var76 != null) {
                        var76.vmethod10557();
                        field422.method8625(var76, (long) var5);
                    }

                    var8 = class119.field1554.method7476(var22);
                    if (var8 != null) {
                        class89.method2877(var8);
                    }

                    var8 = class119.field1554.method7476(var5);
                    if (var8 != null) {
                        class89.method2877(var8);
                        class23.method337(class119.field1554.field4037[var8.field4144 >>> 16], var8, true);
                    }

                    if (rootInterface != -1) {
                        class142.method3730(rootInterface, 1);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
                    class163.field1873 = var3.method11196();
                    class148.field1756 = var3.method11281();
                    field475 = var3.method11281();

                    for (var22 = class148.field1756; var22 < class148.field1756 + 8; ++var22) {
                        for (var5 = class163.field1873; var5 < class163.field1873 + 8; ++var5) {
                            if (class484.field5343.field1167[field475][var22][var5] != null) {
                                class484.field5343.field1167[field475][var22][var5] = null;
                                class190.method4306(field475, var22, var5);
                            }
                        }
                    }

                    for (class74 var56 = (class74) class484.field5343.field1158.method8690(); var56 != null; var56 = (class74) class484.field5343.field1158.method8692()) {
                        if (var56.field1022 >= class148.field1756 && var56.field1022 < class148.field1756 + 8 && var56.field1036 >= class163.field1873 && var56.field1036 < class163.field1873 + 8 && var56.field1026 == field475) {
                            var56.field1032 = 0;
                        }
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.CLANSETTINGS_FULL == var1.serverPacket) {
                    class62.method2122();
                    var96 = var3.method11197();
                    if (var1.serverPacketLength == 1) {
                        if (var96 >= 0) {
                            field365[var96] = null;
                        } else {
                            class483.field5333 = null;
                        }

                        var1.serverPacket = null;
                        return true;
                    }

                    if (var96 >= 0) {
                        field365[var96] = new class162(var3);
                    } else {
                        class483.field5333 = new class162(var3);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.VARP_RESET == var1.serverPacket) {
                    for (var22 = 0; var22 < class4.field8; ++var22) {
                        class182 var92 = class75.method2508(var22);
                        if (var92 != null) {
                            class422.field5047[var22] = 0;
                            class355.field4022[var22] = 0;
                        }
                    }

                    class39.method768();
                    field452 += 32;
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.LOC_ANIM == var1.serverPacket) {
                    class211.method4600(class328.field3653);
                    var1.serverPacket = null;
                    return true;
                }

                boolean var105;
                if (ServerPackets.CAM_MOVETO_ARC == var1.serverPacket) {
                    field474 = true;
                    field449 = false;
                    field553 = true;
                    class25.field114 = var3.method11196();
                    class215.field2487 = var3.method11196();
                    var22 = var3.readUnsignedShort();
                    var5 = class356.method7416(var3.method11196());
                    var24 = class356.method7416(var3.method11196());
                    var7 = var3.readUnsignedShort();
                    field588 = var3.method11412();
                    var26 = var3.method11196();
                    var9 = class356.method7416(class25.field114);
                    var27 = class356.method7416(class215.field2487);
                    var74 = false;
                    var105 = false;
                    if (field588) {
                        var11 = class174.field1940;
                        var29 = class413.method8434(class333.field3836, var9, var27, class333.field3836.field1170) - var22;
                    } else {
                        var11 = class413.method8434(class333.field3836, class187.field2052, class10.field46, class333.field3836.field1170) - class174.field1940;
                        var29 = var22;
                    }

                    field589 = new class548(class187.field2052, class10.field46, var11, var9, var27, var29, var5, var24, var7, var26);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.IF_SETOBJECT == var1.serverPacket) {
                    var22 = var3.readUnsignedShort();
                    if (var22 == 65535) {
                        var22 = -1;
                    }

                    var5 = var3.method11295();
                    var24 = var3.method11254();
                    var25 = class119.field1554.method7476(var5);
                    class213 var64;
                    if (!var25.field4143) {
                        if (var22 == -1) {
                            var25.field4192 = 0;
                            var1.serverPacket = null;
                            return true;
                        }

                        var64 = class84.method2800(var22).method4663(var24);
                        var25.field4192 = 4;
                        var25.field4277 = var22;
                        var25.field4200 = var64.field2424;
                        var25.field4235 = var64.field2393;
                        var25.field4203 = var64.field2430 * 100 / var24;
                        class89.method2877(var25);
                    } else {
                        var25.field4282 = var22;
                        var25.field4283 = var24;
                        var64 = class84.method2800(var22).method4663(var24);
                        var25.field4200 = var64.field2424;
                        var25.field4235 = var64.field2393;
                        var25.field4202 = var64.field2392;
                        var25.field4226 = var64.field2378;
                        var25.field4199 = var64.field2398;
                        var25.field4203 = var64.field2430;
                        if (var64.field2397 == 1) {
                            var25.field4198 = 1;
                        } else {
                            var25.field4198 = 2;
                        }

                        if (var25.field4152 > 0) {
                            var25.field4203 = var25.field4203 * 32 / var25.field4152;
                        } else if (var25.field4156 > 0) {
                            var25.field4203 = var25.field4203 * 32 / var25.field4156;
                        }

                        class89.method2877(var25);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.SET_HEATMAP_ENABLED == var1.serverPacket) {
                    var108 = var3.method11412();
                    if (var108) {
                        if (class153.field1780 == null) {
                            class153.field1780 = new class423();
                        }
                    } else {
                        class153.field1780 = null;
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UPDATE_STAT_V2 == var1.serverPacket) {
                    class39.method768();
                    var22 = var3.method11281();
                    var5 = var3.method11281();
                    var24 = var3.read32BitArray();
                    var7 = var3.method11232();
                    field353[var22] = var24;
                    field539[var22] = var7;
                    field402[var22] = 1;
                    field615[var22] = var5;

                    for (var26 = 0; var26 < 98; ++var26) {
                        if (var24 >= class379.field4369[var26]) {
                            field402[var22] = var26 + 2;
                        }
                    }

                    field532[++field332 - 1 & 31] = var22;
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.CHAT_FILTER_SETTINGS_PRIVATECHAT == var1.serverPacket) {
                    class184.field2013 = class297.method6780(var3.method11196());
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UPDATE_RUNWEIGHT == var1.serverPacket) {
                    class39.method768();
                    field490 = var3.method11452();
                    field561 = field404;
                    var1.serverPacket = null;
                    return true;
                }

                class79 var10;
                if (ServerPackets.OBJ_UNCUSTOMISE_SPECIFIC == var1.serverPacket) {
                    var22 = var3.method11254();
                    var5 = var3.method11422();
                    var24 = var3.method11252();
                    var7 = class356.method7413(var22);
                    var26 = class356.method7424(var22);
                    var9 = class356.method7415(var22);
                    var10 = field333.method2345(var26, var9);
                    var11 = var26 - var10.field1164;
                    var29 = var9 - var10.field1165;
                    if (var11 >= 0 && var29 >= 0 && var11 < var10.field1162 && var29 < var10.field1163) {
                        ClientPackets.method7040(var10, var7, var11, var29, var5, var24);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.SYNTH_SOUND == var1.serverPacket) {
                    var22 = var3.readUnsignedShort();
                    var5 = var3.method11196();
                    var24 = var3.readUnsignedShort();
                    class574.method11033(var22, var5, var24);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.VARP_SYNC == var1.serverPacket) {
                    for (var22 = 0; var22 < class355.field4022.length; ++var22) {
                        if (class422.field5047[var22] != class355.field4022[var22]) {
                            class355.field4022[var22] = class422.field5047[var22];
                            class371.method8125(var22);
                            field547[++field452 - 1 & 31] = var22;
                        }
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.IF_OPENTOP == var1.serverPacket) {
                    var22 = var3.method11422();
                    if (var22 == 65535) {
                        var22 = -1;
                    }

                    rootInterface = var22;
                    this.resizeRoot(false);
                    class1.method10(var22);
                    StudioGame.method8640(rootInterface);

                    for (var5 = 0; var5 < 100; ++var5) {
                        field436[var5] = true;
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.NPC_SPOTANIM_SPECIFIC == var1.serverPacket) {
                    var5 = var3.method11254();
                    var24 = var3.method11422();
                    var22 = var3.method11241();
                    var63 = (class81) class484.field5343.field1160.method8567((long) var22);
                    var7 = var3.method11196();
                    if (var63 != null) {
                        var63.method2452(var7, var24, var5 >> 16, var5 & '\uffff');
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.LOGOUT == var1.serverPacket) {
                    class386.method8194();
                    var1.serverPacket = null;
                    return false;
                }

                if (ServerPackets.OBJ_CUSTOMISE == var1.serverPacket) {
                    class211.method4600(class328.field3650);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.VARP_SMALL == var1.serverPacket) {
                    var96 = var3.method11259();
                    var5 = var3.method11422();
                    class422.field5047[var5] = var96;
                    if (class355.field4022[var5] != var96) {
                        class355.field4022[var5] = var96;
                    }

                    class371.method8125(var5);
                    field547[++field452 - 1 & 31] = var5;
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.WORLDENTITY_INFO_V5 == var1.serverPacket) {
                    class156.method3864(class484.field5343, var3, 5);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.IF_SETHIDE == var1.serverPacket) {
                    var108 = var3.method11281() == 1;
                    var5 = var3.method11254();
                    var6 = class119.field1554.method7476(var5);
                    if (var108 != var6.field4166) {
                        var6.field4166 = var108;
                        class89.method2877(var6);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.CAM_TARGET_V3 == var1.serverPacket) {
                    class4.field7 = (class384) class173.findEnumerated(class77.method2550(), var3.method11196());
                    field347 = var3.method11452();
                    field348 = var3.readUnsignedShort();
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.LOC_MERGE == var1.serverPacket) {
                    class211.method4600(class328.field3647);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UPDATE_FRIENDCHAT_CHANNEL_SINGLEUSER == var1.serverPacket) {
                    return this.method1047(var1);
                }

                String var62;
                if (ServerPackets.URL_OPEN == var1.serverPacket) {
                    byte[] var55 = new byte[var1.serverPacketLength];
                    var3.method11137(var55, 0, var55.length);
                    Buffer var91 = new Buffer(var55);
                    var62 = var91.method11207();
                    class22.method330(var62, true, false);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.OCULUS_SYNC == var1.serverPacket) {
                    var22 = var3.read32BitArray();
                    if (var22 != field486) {
                        field486 = var22;
                        class34.method533();
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.IF_SETMODEL == var1.serverPacket) {
                    var22 = var3.method11181();
                    var5 = var3.method11252();
                    var6 = class119.field1554.method7476(var5);
                    if (var6.field4192 != 1 || var22 != var6.field4277) {
                        var6.field4192 = 1;
                        var6.field4277 = var22;
                        class89.method2877(var6);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UPDATE_FRIENDLIST == var1.serverPacket) {
                    class40.field279.method1592(var3, var1.serverPacketLength);
                    field555 = field404;
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UPDATE_INV_PARTIAL == var1.serverPacket) {
                    var22 = var3.read32BitArray();
                    var5 = var3.readUnsignedShort();
                    if (var22 < -70000) {
                        var5 += 32768;
                    }

                    if (var22 >= 0) {
                        var6 = class119.field1554.method7476(var22);
                    } else {
                        var6 = null;
                    }

                    for (; var3.offset * 1216585693 < var1.serverPacketLength; class115.method3470(var5, var7, var26 - 1, var9)) {
                        var7 = var3.method11212();
                        var26 = var3.readUnsignedShort();
                        var9 = 0;
                        if (var26 != 0) {
                            var9 = var3.method11196();
                            if (var9 == 255) {
                                var9 = var3.read32BitArray();
                            }
                        }

                        if (var6 != null && var7 >= 0 && var7 < var6.field4259.length) {
                            var6.field4259[var7] = var26;
                            var6.field4281[var7] = var9;
                        }
                    }

                    if (var6 != null) {
                        class89.method2877(var6);
                    }

                    class39.method768();
                    field549[++field535 - 1 & 31] = var5 & 32767;
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.IF_SETEVENTS_V2 == var1.serverPacket) {
                    var22 = var3.method11295();
                    var5 = var3.readUnsignedShort();
                    if (var5 == 65535) {
                        var5 = -1;
                    }

                    var24 = var3.method11181();
                    if (var24 == 65535) {
                        var24 = -1;
                    }

                    var7 = var3.method11252();
                    var26 = var3.method11254();
                    class359 var102 = (class359) field438.method8623((long) var7);
                    if (var102 != null) {
                        var102.vmethod10557();
                    }

                    var102 = class342.method7325(var102, var24, var5, var22, var26);
                    field438.method8625(var102, (long) var7);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.MAP_ANIM == var1.serverPacket) {
                    class211.method4600(class328.field3655);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.REBUILD_REGION == var1.serverPacket) {
                    class124.method3552(true, var1.packetBuffer);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.MESSAGE_GAME == var1.serverPacket) {
                    var22 = var3.method11212();
                    boolean var79 = var3.method11196() == 1;
                    var62 = "";
                    boolean var67 = false;
                    if (var79) {
                        var62 = var3.method11207();
                        if (class40.field279.method1541(new class613(var62, class92.loginType))) {
                            var67 = true;
                        }
                    }

                    String var61 = var3.method11207();
                    if (!var67) {
                        class90.method2893(var22, var62, var61);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.SET_PLAYER_OP == var1.serverPacket) {
                    var22 = var3.method11281();
                    var5 = var3.method11281();
                    var62 = var3.method11207();
                    if (var22 >= 1 && var22 <= 8) {
                        if (var62.equalsIgnoreCase("null")) {
                            var62 = null;
                        }

                        field516[var22 - 1] = var62;
                        field439[var22 - 1] = var5 == 0;
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.REBUILD_WORLDENTITY_V3 == var1.serverPacket) {
                    class232.method5360(class333.field3836, var3);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.IF_SETPLAYERMODEL_BASECOLOUR == var1.serverPacket) {
                    var22 = var3.method11281();
                    var5 = var3.method11254();
                    var24 = var3.method11196();
                    var25 = class119.field1554.method7476(var5);
                    var25.field4206.method7533(var24, var22);
                    class89.method2877(var25);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.CAM_SMOOTHRESET == var1.serverPacket && field474) {
                    field449 = true;
                    field587 = false;
                    field553 = false;

                    for (var22 = 0; var22 < 5; ++var22) {
                        field610[var22] = false;
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.PACKET_GROUP_START == var1.serverPacket) {
                    var1.field1289 = var3.method11452();
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.VARCLAN_DISABLE == var1.serverPacket) {
                    class256.field3085 = null;
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.MIDI_SONG_STOP == var1.serverPacket) {
                    var5 = var3.method11181();
                    var22 = var3.method11422();
                    class257.method5884(var22, var5);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.OBJ_ENABLED_OPS_SPECIFIC == var1.serverPacket) {
                    var22 = var3.method11196();
                    var5 = var3.method11422();
                    var24 = var3.method11295();
                    var7 = class356.method7413(var24);
                    var26 = class356.method7424(var24);
                    var9 = class356.method7415(var24);
                    var10 = field333.method2345(var26, var9);
                    var11 = var26 - var10.field1164;
                    var29 = var9 - var10.field1165;
                    if (var11 >= 0 && var29 >= 0 && var11 < var10.field1162 && var29 < var10.field1163) {
                        class61.method2091(var10, var7, var11, var29, var5, var22);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.CAM_ROTATETO == var1.serverPacket) {
                    field474 = true;
                    field449 = false;
                    field587 = true;
                    var22 = class216.method4818(var3.method11452() & 2027);
                    var5 = class274.method6161(var3.method11452() & 2027);
                    var24 = var3.readUnsignedShort();
                    var7 = var3.method11196();
                    field477 = new class550(class401.field4855, var5, var24, var7);
                    field514 = new class550(class302.field3460, var22, var24, var7);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.HIDEOBJOPS == var1.serverPacket) {
                    class61.field860 = var3.method11412();
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UPDATE_ZONE_PARTIAL_FOLLOWS == var1.serverPacket) {
                    class163.field1873 = var3.method11196();
                    class148.field1756 = var3.method11281();
                    field475 = var3.method11196();
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
                    var52 = var3.method11207();
                    var23 = class465.method9500(class372.method8130(class65.method2145(var3)));
                    class90.method2893(6, var52, var23);
                    var1.serverPacket = null;
                    return true;
                }

                boolean var99;
                if (ServerPackets.CAM_MOVETO_CYCLES == var1.serverPacket) {
                    field474 = true;
                    field449 = false;
                    field553 = true;
                    class25.field114 = var3.method11196();
                    class215.field2487 = var3.method11196();
                    var22 = var3.readUnsignedShort();
                    var5 = var3.readUnsignedShort();
                    field588 = var3.method11412();
                    var24 = var3.method11196();
                    var7 = class356.method7416(class25.field114);
                    var26 = class356.method7416(class215.field2487);
                    boolean var66 = false;
                    var99 = false;
                    if (field588) {
                        var9 = class174.field1940;
                        var27 = class413.method8434(class333.field3836, var7, var26, class333.field3836.field1170) - var22;
                    } else {
                        var9 = class413.method8434(class333.field3836, class187.field2052, class10.field46, class333.field3836.field1170) - class174.field1940;
                        var27 = var22;
                    }

                    field589 = new class549(class187.field2052, class10.field46, var9, var7, var26, var27, var5, var24);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.LOC_DEL == var1.serverPacket) {
                    class211.method4600(class328.field3648);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.LOC_ANIM_SPECIFIC == var1.serverPacket) {
                    var9 = var3.method11281();
                    var27 = var9 >> 2;
                    var11 = var9 & 3;
                    var29 = field320[var27];
                    var13 = var3.readUnsignedShort();
                    var24 = var3.method11278();
                    var22 = var24 >> 16;
                    var5 = var24 >> 8 & 255;
                    var7 = var22 + (var24 >> 4 & 7);
                    var26 = var5 + (var24 & 7);
                    if (0 <= var7 && var7 < 103 && 0 <= var26 && var26 < 103) {
                        class172.method4086(var7, var26, var27, var11, var29, var13);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UPDATE_FRIENDCHAT_CHANNEL_FULL_V2 == var1.serverPacket) {
                    return this.method819(var1);
                }

                if (ServerPackets.HIDENPCOPS == var1.serverPacket) {
                    class498.field5394 = var3.method11412();
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.NPC_INFO_LARGE_V5 == var1.serverPacket) {
                    class301.method6827(class484.field5343, true, var3);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.IF_SETNPCHEAD_ACTIVE == var1.serverPacket) {
                    var22 = var3.method11295();
                    var5 = var3.method11422();
                    var6 = class119.field1554.method7476(var22);
                    if (var6.field4192 != 6 || var5 != var6.field4277) {
                        var6.field4192 = 6;
                        var6.field4277 = var5;
                        class89.method2877(var6);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.SET_INTERACTION_MODE == var1.serverPacket) {
                    System.out.println("Incoming server incomingServerPackets 45");
                    var22 = var3.method11452();
                    class518 var89 = (class518) class173.findEnumerated(class500.method9969(), var3.method11196());
                    class516 var60 = (class516) class173.findEnumerated(class355.method7406(), var3.method11196());
                    if (var22 == -2) {
                        field333.method2362(var89, var60);
                    } else {
                        field333.method2351(var22, var89, var60);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.CAM_MODE == var1.serverPacket) {
                    var22 = var3.method11196();
                    class378.method8170(var22);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.HINT_ARROW == var1.serverPacket) {
                    field455 = var3.method11196();
                    if (field455 == 1) {
                        field456 = var3.readUnsignedShort();
                    }

                    if (field455 >= 2 && field455 <= 6) {
                        if (field455 == 2) {
                            field461 = 4096;
                            field462 = 4096;
                        }

                        if (field455 == 3) {
                            field461 = 0;
                            field462 = 4096;
                        }

                        if (field455 == 4) {
                            field461 = 8192;
                            field462 = 4096;
                        }

                        if (field455 == 5) {
                            field461 = 4096;
                            field462 = 0;
                        }

                        if (field455 == 6) {
                            field461 = 4096;
                            field462 = 8192;
                        }

                        field455 = 2;
                        field458 = var3.readUnsignedShort();
                        field459 = var3.readUnsignedShort();
                        field460 = var3.method11196() * 4;
                    }

                    if (field455 == 10) {
                        field457 = var3.readUnsignedShort();
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UPDATE_INV_FULL == var1.serverPacket) {
                    var22 = var3.read32BitArray();
                    var5 = var3.readUnsignedShort();
                    if (var22 < -70000) {
                        var5 += 32768;
                    }

                    if (var22 >= 0) {
                        var6 = class119.field1554.method7476(var22);
                    } else {
                        var6 = null;
                    }

                    if (var6 != null) {
                        for (var7 = 0; var7 < var6.field4259.length; ++var7) {
                            var6.field4259[var7] = 0;
                            var6.field4281[var7] = 0;
                        }
                    }

                    class7.method58(var5);
                    var7 = var3.readUnsignedShort();

                    for (var26 = 0; var26 < var7; ++var26) {
                        var9 = var3.method11181();
                        var27 = var3.method11281();
                        if (var27 == 255) {
                            var27 = var3.read32BitArray();
                        }

                        if (var6 != null && var26 < var6.field4259.length) {
                            var6.field4259[var26] = var9;
                            var6.field4281[var26] = var27;
                        }

                        class115.method3470(var5, var26, var9 - 1, var27);
                    }

                    if (var6 != null) {
                        class89.method2877(var6);
                    }

                    class39.method768();
                    field549[++field535 - 1 & 31] = var5 & 32767;
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.OBJ_ADD_SPECIFIC == var1.serverPacket) {
                    var22 = var3.method11281();
                    var5 = var3.readUnsignedShort();
                    var24 = var3.method11252();
                    var7 = var3.method11232();
                    var26 = var3.method11241();
                    var9 = var3.method11254();
                    var99 = var3.method11281() == 1;
                    var11 = var3.readUnsignedShort();
                    var29 = class356.method7413(var9);
                    var13 = class356.method7424(var9);
                    var82 = class356.method7415(var9);
                    var111 = field333.method2345(var13, var82);
                    var16 = var13 - var111.field1164;
                    var17 = var82 - var111.field1165;
                    if (var16 >= 0 && var17 >= 0 && var16 < var111.field1162 && var17 < var111.field1163) {
                        class234.method5375(var111, var29, var16, var17, var5, var24, var7, var11, var26, var22, var99);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.PLAYER_SPOTANIM_SPECIFIC == var1.serverPacket) {
                    var24 = var3.method11295();
                    var22 = var3.readUnsignedShort();
                    class69 var59;
                    if (var22 == field491) {
                        var59 = class76.field1108;
                    } else {
                        var59 = (class69) class484.field5343.field1169.method8567((long) var22);
                    }

                    var5 = var3.method11422();
                    var7 = var3.method11196();
                    if (var59 != null) {
                        var59.method2452(var7, var5, var24 >> 16, var24 & '\uffff');
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.IF_SETPLAYERMODEL_OBJ == var1.serverPacket) {
                    var22 = var3.read32BitArray();
                    var5 = var3.read32BitArray();
                    var6 = class119.field1554.method7476(var22);
                    var6.field4206.method7541(var5);
                    class89.method2877(var6);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.PLAYER_ANIM_SPECIFIC == var1.serverPacket) {
                    var22 = var3.method11181();
                    var5 = var3.method11281();
                    if (var22 == 65535) {
                        var22 = -1;
                    }

                    class163.method3993(class76.field1108, var22, var5);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.MESSAGE_CLANCHANNEL == var1.serverPacket) {
                    var96 = var3.method11197();
                    var23 = var3.method11207();
                    long var41 = (long) var3.readUnsignedShort();
                    long var43 = (long) var3.method11278();
                    class397 var65 = (class397) class173.findEnumerated(class446.method8926(), var3.method11196());
                    long var45 = (var41 << 32) + var43;
                    boolean var78 = false;
                    class171 var47 = null;
                    var47 = var96 >= 0 ? field582[var96] : class86.field1229;
                    if (var47 == null) {
                        var78 = true;
                    } else {
                        var15 = 0;

                        while (true) {
                            if (var15 >= 100) {
                                if (var65.field4819 && class40.field279.method1541(new class613(var23, class92.loginType))) {
                                    var78 = true;
                                }
                                break;
                            }

                            if (field574[var15] == var45) {
                                var78 = true;
                                break;
                            }

                            ++var15;
                        }
                    }

                    if (!var78) {
                        field574[field575] = var45;
                        field575 = (field575 + 1) % 100;
                        var39 = class465.method9500(class65.method2145(var3));
                        var16 = var96 >= 0 ? 41 : 44;
                        if (var65.field4815 != -1) {
                            class109.method3399(var16, class57.method2014(var65.field4815) + var23, var39, var47.field1919);
                        } else {
                            class109.method3399(var16, var23, var39, var47.field1919);
                        }
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UPDATE_INV_STOPTRANSMIT == var1.serverPacket) {
                    var22 = var3.method11241();
                    class184.method4204(var22);
                    field549[++field535 - 1 & 31] = var22 & 32767;
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.OBJ_ENABLED_OPS == var1.serverPacket) {
                    class211.method4600(class328.field3649);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.HIDELOCOPS == var1.serverPacket) {
                    class304.field3470 = var3.method11412();
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.IF_SETANIM == var1.serverPacket) {
                    var22 = var3.method11252();
                    var5 = var3.method11445();
                    var6 = class119.field1554.method7476(var22);
                    if (var5 != var6.field4196 || var5 == -1) {
                        var6.field4196 = var5;
                        var6.field4284 = 0;
                        var6.field4135 = 0;
                        class89.method2877(var6);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UPDATE_IGNORELIST == var1.serverPacket) {
                    class40.field279.field645.method9859(var3, var1.serverPacketLength);
                    class19.method296();
                    field555 = field404;
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.REBUILD_NORMAL == var1.serverPacket) {
                    class124.method3552(false, var1.packetBuffer);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.VARP_LARGE == var1.serverPacket) {
                    var22 = var3.method11241();
                    var5 = var3.read32BitArray();
                    class422.field5047[var22] = var5;
                    if (class355.field4022[var22] != var5) {
                        class355.field4022[var22] = var5;
                    }

                    class371.method8125(var22);
                    field547[++field452 - 1 & 31] = var22;
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.MIDI_JINGLE == var1.serverPacket) {
                    var22 = var3.method11422();
                    if (var22 == 65535) {
                        var22 = -1;
                    }

                    var5 = var3.method11421();
                    class175.method4117(var22, var5);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.CAM_RESET == var1.serverPacket) {
                    field449 = false;
                    field474 = false;
                    field553 = false;
                    field587 = false;
                    class169.field1909 = 0;
                    class227.field2654 = 0;
                    class503.field5413 = 0;
                    field588 = false;
                    class47.field687 = 0;
                    class145.field1725 = 0;
                    class282.field3290 = 0;
                    class265.field3150 = 0;
                    class25.field114 = 0;
                    class215.field2487 = 0;
                    class421.field5046 = 0;
                    field589 = null;
                    field477 = null;
                    field514 = null;

                    for (var22 = 0; var22 < 5; ++var22) {
                        field610[var22] = false;
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.ACCOUNT_FLAGS == var1.serverPacket) {
                    var3.method11203();
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.VARCLAN_ENABLE == var1.serverPacket) {
                    class256.field3085 = new class525(class56.field817);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UPDATE_REBOOT_TIMER == var1.serverPacket) {
                    rebootTimer = var3.readUnsignedShort() * 30;
                    field561 = field404;
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.SITE_SETTINGS == var1.serverPacket) {
                    class352.method7391(var3.method11207());
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.MINIMAP_TOGGLE == var1.serverPacket) {
                    field585 = var3.method11196();
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UNKNOWN_STRING == var1.serverPacket) {
                    field345 = var3.method11207();
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.IF_SETSCROLLPOS == var1.serverPacket) {
                    var22 = var3.method11254();
                    var5 = var3.method11241();
                    var6 = class119.field1554.method7476(var22);
                    if (var6 != null && var6.field4147 == 0) {
                        if (var5 > var6.field4172 - var6.field4149 * 1156037777) {
                            var5 = var6.field4172 - var6.field4149 * 1156037777;
                        }

                        if (var5 < 0) {
                            var5 = 0;
                        }

                        if (var5 != var6.field4170) {
                            var6.field4170 = var5;
                            class89.method2877(var6);
                        }
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.VARCLAN == var1.serverPacket) {
                    if (class256.field3085 == null) {
                        class256.field3085 = new class525(class56.field817);
                    }

                    class600 var54 = class56.field817.method10449(var3);
                    class256.field3085.field5548.vmethod10878(var54.field5986, var54.field5985);
                    field538[++field554 - 1 & 31] = var54.field5986;
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.LOGOUT_WITHREASON == var1.serverPacket) {
                    var22 = var3.method11196();
                    class361.method7513(var22);
                    var1.serverPacket = null;
                    return false;
                }

                if (ServerPackets.RESET_ANIMS == var1.serverPacket) {
                    Iterator var53 = class484.field5343.field1169.iterator();

                    while (var53.hasNext()) {
                        class69 var87 = (class69) var53.next();
                        var87.method2472();
                    }

                    Iterator var88 = class484.field5343.field1160.iterator();

                    while (var88.hasNext()) {
                        class81 var57 = (class81) var88.next();
                        var57.method2472();
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.IF_SETPLAYERMODEL_BODYTYPE == var1.serverPacket) {
                    var22 = var3.method11252();
                    var5 = var3.method11230();
                    var6 = class119.field1554.method7476(var22);
                    var6.field4206.method7562(class76.field1108.field935.field4084, var5);
                    class89.method2877(var6);
                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.TRIGGER_ONDIALOGABORT == var1.serverPacket) {
                    if (rootInterface != -1) {
                        class142.method3730(rootInterface, 0);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
                    class148.field1756 = var3.method11232();
                    class163.field1873 = var3.method11232();
                    field475 = var3.method11281();

                    while (var3.offset * 1216585693 < var1.serverPacketLength) {
                        var22 = var3.method11196();
                        class328 var86 = class287.method6393()[var22];
                        class211.method4600(var86);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.OBJ_DEL_SPECIFIC == var1.serverPacket) {
                    var22 = var3.method11252();
                    var5 = var3.method11252();
                    var24 = var3.readUnsignedShort();
                    var7 = class356.method7413(var5);
                    var26 = class356.method7424(var5);
                    var9 = class356.method7415(var5);
                    var10 = field333.method2345(var26, var9);
                    var11 = var26 - var10.field1164;
                    var29 = var9 - var10.field1165;
                    if (0 <= var11 && var11 < var10.field1162 && 0 <= var29 && var29 < var10.field1163) {
                        class236.method5384(var10, var7, var11, var29, var24, var22);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.IF_SETANGLE == var1.serverPacket) {
                    var22 = var3.method11422();
                    var5 = var3.method11241();
                    var24 = var3.method11181();
                    var7 = var3.read32BitArray();
                    var8 = class119.field1554.method7476(var7);
                    if (var22 != var8.field4200 || var5 != var8.field4235 || var24 != var8.field4203) {
                        var8.field4200 = var22;
                        var8.field4235 = var5;
                        var8.field4203 = var24;
                        class89.method2877(var8);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.MESSAGE_PRIVATE == var1.serverPacket) {
                    var52 = var3.method11207();
                    var30 = (long) var3.readUnsignedShort();
                    var32 = (long) var3.method11278();
                    class397 var28 = (class397) class173.findEnumerated(class446.method8926(), var3.method11196());
                    long var48 = (var30 << 32) + var32;
                    var105 = false;

                    for (var13 = 0; var13 < 100; ++var13) {
                        if (var48 == field574[var13]) {
                            var105 = true;
                            break;
                        }
                    }

                    if (class40.field279.method1541(new class613(var52, class92.loginType))) {
                        var105 = true;
                    }

                    if (!var105 && field341 == 0) {
                        field574[field575] = var48;
                        field575 = (field575 + 1) % 100;
                        var40 = class465.method9500(class372.method8130(class65.method2145(var3)));
                        byte var14;
                        if (var28.field4833) {
                            var14 = 7;
                        } else {
                            var14 = 3;
                        }

                        if (var28.field4815 != -1) {
                            class90.method2893(var14, class57.method2014(var28.field4815) + var52, var40);
                        } else {
                            class90.method2893(var14, var52, var40);
                        }
                    }

                    var1.serverPacket = null;
                    return true;
                }

                if (ServerPackets.OBJ_COUNT_SPECIFIC == var1.serverPacket) {
                    var22 = var3.method11422();
                    var5 = var3.read32BitArray();
                    var24 = var3.method11252();
                    var7 = var3.method11295();
                    var26 = class356.method7413(var24);
                    var9 = class356.method7424(var24);
                    var27 = class356.method7415(var24);
                    class79 var36 = field333.method2345(var9, var27);
                    var29 = var9 - var36.field1164;
                    var13 = var27 - var36.field1165;
                    if (var29 >= 0 && var13 >= 0 && var29 < var36.field1162 && var13 < var36.field1163) {
                        class81.method2771(var36, var26, var29, var13, var22, var5, var7);
                    }

                    var1.serverPacket = null;
                    return true;
                }

                class508.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.field3808 : -1) + "," + (var1.field1302 != null ? var1.field1302.field3808 : -1) + "," + (var1.field1306 != null ? var1.field1306.field3808 : -1) + "," + var1.serverPacketLength, (Throwable) null);
                class386.method8194();
            } catch (IOException var50) {
                class361.method7512();
            } catch (Exception var51) {
                var23 = "" + (var1.serverPacket != null ? var1.serverPacket.field3808 : -1) + "," + (var1.field1302 != null ? var1.field1302.field3808 : -1) + "," + (var1.field1306 != null ? var1.field1306.field3808 : -1) + "," + var1.serverPacketLength + "," + (class76.field1108.field1039[0] + class333.field3836.field1164) + "," + (class76.field1108.field1107[0] + class333.field3836.field1165) + ",";

                for (var24 = 0; var24 < var1.serverPacketLength && var24 < 50; ++var24) {
                    var23 = var23 + var3.array[var24] + ",";
                }

                class508.RunException_sendStackTrace(var23, var51);
                class386.method8194();
            }

            return true;
        }
    }

    @ObfuscatedName("qa")
    @ObfuscatedSignature(
            descriptor = "(B)V",
            garbageValue = "4"
    )
    final void method1205() {
        class610 var1 = field522;
        boolean var2 = false;

        int var3;
        while (!var2) {
            var2 = true;

            for (var3 = 0; var3 < var1.field6052 - 1; ++var3) {
                if (var1.field6055[var3] < 1000 && var1.field6055[var3 + 1] > 1000) {
                    String var9 = var1.field6062[var3];
                    var1.field6062[var3] = var1.field6062[var3 + 1];
                    var1.field6062[var3 + 1] = var9;
                    String var5 = var1.field6056[var3];
                    var1.field6056[var3] = var1.field6056[var3 + 1];
                    var1.field6056[var3 + 1] = var5;
                    class610 var6 = var1.field6061[var3];
                    var1.field6061[var3] = var1.field6061[var3 + 1];
                    var1.field6061[var3 + 1] = var6;
                    int var7 = var1.field6055[var3];
                    var1.field6055[var3] = var1.field6055[var3 + 1];
                    var1.field6055[var3 + 1] = var7;
                    var7 = var1.field6067[var3];
                    var1.field6067[var3] = var1.field6067[var3 + 1];
                    var1.field6067[var3 + 1] = var7;
                    var7 = var1.field6054[var3];
                    var1.field6054[var3] = var1.field6054[var3 + 1];
                    var1.field6054[var3 + 1] = var7;
                    var7 = var1.field6064[var3];
                    var1.field6064[var3] = var1.field6064[var3 + 1];
                    var1.field6064[var3 + 1] = var7;
                    var7 = var1.field6057[var3];
                    var1.field6057[var3] = var1.field6057[var3 + 1];
                    var1.field6057[var3 + 1] = var7;
                    var7 = var1.field6060[var3];
                    var1.field6060[var3] = var1.field6060[var3 + 1];
                    var1.field6060[var3 + 1] = var7;
                    boolean var8 = var1.field6051[var3];
                    var1.field6051[var3] = var1.field6051[var3 + 1];
                    var1.field6051[var3 + 1] = var8;
                    var2 = false;
                }
            }
        }

        if (field612 == null) {
            int var10 = class35.lastButton;
            if (isMenuOpen) {
                if (var10 != 1 && (class423.field5058 || var10 != 4) && !field522.method11900(class35.field231, class35.field220)) {
                    isMenuOpen = false;
                    field522.method11867();
                }

                if (var10 == 1 || !class423.field5058 && var10 == 4) {
                    field522.method11865(class35.field221, class35.field224);
                    isMenuOpen = false;
                    field522.method11867();
                }
            } else if (field522.field6052 > 0) {
                var3 = field522.field6052 - 1;
                if ((var10 == 1 || !class423.field5058 && var10 == 4) && this.method984(field522.field6055[var3], field522.field6051[var3])) {
                    var10 = 2;
                }

                if (var10 == 1 || !class423.field5058 && var10 == 4) {
                    field522.method11863(var3);
                }

                if (var10 == 2) {
                    this.method825(class35.field221, class35.field224);
                }
            }

        }
    }

    @ObfuscatedName("qw")
    @ObfuscatedSignature(
            descriptor = "(IZI)Z",
            garbageValue = "2004399093"
    )
    final boolean method984(int var1, boolean var2) {
        return (field520 && field522.field6052 > 2 || class458.method9209(var1)) && !var2;
    }

    @ObfuscatedName("qj")
    @ObfuscatedSignature(
            descriptor = "(III)V",
            garbageValue = "-947741171"
    )
    final void method825(int var1, int var2) {
        field522.method11868(var1, var2);
        Iterator var3 = field333.iterator();

        while (var3.hasNext()) {
            class79 var4 = (class79) var3.next();
            var4.field1159.method5292(false);
        }

        isMenuOpen = true;
        field522.method11888();
    }

    @ObfuscatedName("qc")
    @ObfuscatedSignature(
            descriptor = "(ZI)V",
            garbageValue = "-331950936"
    )
    final void resizeRoot(boolean var1) {
        class382.method8179(rootInterface, class34.screenWidth, class396.screenHeight, var1);
    }

    @ObfuscatedName("qz")
    @ObfuscatedSignature(
            descriptor = "(Loi;B)V",
            garbageValue = "-124"
    )
    void method962(class369 var1) {
        class369 var4 = var1.field4164 == -1 ? null : class119.field1554.method7477(var1.field4164, var1.field4165);
        int var2;
        int var3;
        if (var4 == null) {
            var2 = class34.screenWidth;
            var3 = class396.screenHeight;
        } else {
            var2 = var4.field4160 * 469894397;
            var3 = var4.field4149 * 1156037777;
        }

        class354.method7399(var1, var2, var3, false);
        class252.method5794(var1, var2, var3);
    }

    @ObfuscatedName("qh")
    @ObfuscatedSignature(
            descriptor = "(B)V",
            garbageValue = "117"
    )
    final void method907() {
        class89.method2877(field612);
        ++class74.field1037;
        int var1;
        int var2;
        if (field543 && field540) {
            var1 = class35.field231;
            var2 = class35.field220;
            var1 -= field537;
            var2 -= field557;
            if (var1 < field541) {
                var1 = field541;
            }

            if (var1 + field612.field4160 * 469894397 > field536.field4160 * 469894397 + field541) {
                var1 = field536.field4160 * 469894397 + field541 - field612.field4160 * 469894397;
            }

            if (var2 < field542) {
                var2 = field542;
            }

            if (var2 + field612.field4149 * 1156037777 > field536.field4149 * 1156037777 + field542) {
                var2 = field536.field4149 * 1156037777 + field542 - field612.field4149 * 1156037777;
            }

            int var3 = var1 - field544;
            int var4 = var2 - field545;
            int var5 = field612.field4232;
            if (class74.field1037 > field612.field4285 && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
                field546 = true;
            }

            int var6 = var1 - field541 + field536.field4260;
            int var7 = var2 - field542 + field536.field4170;
            class65 var8;
            if (field612.field4291 != null && field546) {
                var8 = new class65();
                var8.field893 = field612;
                var8.field900 = var6;
                var8.field895 = var7;
                var8.field898 = field612.field4291;
                class329.method7047(var8);
            }

            if (class35.field218 == 0) {
                if (field546) {
                    if (field612.field4288 != null) {
                        var8 = new class65();
                        var8.field893 = field612;
                        var8.field900 = var6;
                        var8.field895 = var7;
                        var8.field896 = field445;
                        var8.field898 = field612.field4288;
                        class329.method7047(var8);
                    }

                    if (field445 != null && class207.method4518(field612) != null) {
                        class329 var13 = EnumComposition.getPacketBufferNode(ClientPackets.field3582, packetWriter.isaacCipher);
                        var13.out.method11238(field612.field4282);
                        var13.out.putIntLittleEndian(field612.field4144);
                        var13.out.method11238(field445.field4145 * -217986249);
                        var13.out.method11325(field612.field4145 * -217986249);
                        var13.out.writeIntME(field445.field4282);
                        var13.out.putIntCustomEndian(field445.field4144);
                        packetWriter.addNode(var13);
                    }
                } else if (class537.field5586 != null && !this.method984(class537.field5586.field711, class537.field5586.field720)) {
                    if (field522.field6052 > 0) {
                        int var11 = field537 + field544;
                        int var9 = field557 + field545;
                        class50 var10 = class537.field5586;
                        if (var10 != null) {
                            class482.method9729(var10.field713, var10.field712, var10.field711, var10.field714, var10.field715, var10.field719, var10.field717, var10.field716, var11, var9);
                        }

                        class537.field5586 = null;
                    }
                } else {
                    this.method825(field537 + field544, field557 + field545);
                }

                field612 = null;
            }

        } else {
            if (class74.field1037 > 1) {
                if (!field546 && field522.field6052 > 0) {
                    var1 = field537 + field544;
                    var2 = field557 + field545;
                    class50 var12 = class537.field5586;
                    if (var12 != null) {
                        class482.method9729(var12.field713, var12.field712, var12.field711, var12.field714, var12.field715, var12.field719, var12.field717, var12.field716, var1, var2);
                    }

                    class537.field5586 = null;
                }

                field612 = null;
            }

        }
    }

    @ObfuscatedName("qy")
    @ObfuscatedSignature(
            descriptor = "(I)Lxa;",
            garbageValue = "-768699461"
    )
    public class613 vmethod9864() {
        return class76.field1108 != null ? class76.field1108.field934 : null;
    }

    @ObfuscatedName("qd")
    @ObfuscatedSignature(
            descriptor = "(IB)V",
            garbageValue = "8"
    )
    void method830(int var1) {
        class329 var2 = EnumComposition.getPacketBufferNode(ClientPackets.field3624, packetWriter.isaacCipher);
        var2.out.writeByte(var1);
        packetWriter.addNode(var2);
    }

    @ObfuscatedName("qu")
    @ObfuscatedSignature(
            descriptor = "(II)V",
            garbageValue = "1104271505"
    )
    void method831(int var1) {
        class329 var2 = EnumComposition.getPacketBufferNode(ClientPackets.field3634, packetWriter.isaacCipher);
        var2.out.writeByte(var1);
        packetWriter.addNode(var2);
    }

    public final void init() {
        try {
            if (this.checkHost()) {
                for (int var1 = 0; var1 <= 28; ++var1) {
                    String var2 = this.getParameter(Integer.toString(var1));
                    if (var2 != null) {
                        switch (var1) {
                            case 3:
                                if (var2.equalsIgnoreCase("true")) {
                                    field326 = true;
                                } else {
                                    field326 = false;
                                }
                                break;
                            case 4:
                                if (clientType == -1) {
                                    clientType = Integer.parseInt(var2);
                                }
                                break;
                            case 5:
                                field385 = Integer.parseInt(var2);
                                break;
                            case 6:
                                class242.field2970 = class432.method8648(Integer.parseInt(var2));
                                break;
                            case 7:
                                Players.field5353 = class19.method299(Integer.parseInt(var2));
                                break;
                            case 8:
                                if (var2.equalsIgnoreCase("true")) {
                                }
                                break;
                            case 9:
                                class99.sessionToken1 = var2;
                                break;
                            case 10:
                                StudioGame.field5084 = (class387) class173.findEnumerated(class68.method2166(), Integer.parseInt(var2));
                                if (class387.field4424 == StudioGame.field5084) {
                                    class92.loginType = LoginType.oldscape;
                                } else {
                                    class92.loginType = LoginType.field5769;
                                }
                                break;
                            case 11:
                                UserComparator5.field1615 = var2;
                                break;
                            case 12:
                                worldId = Integer.parseInt(var2);
                            case 13:
                            case 16:
                            case 18:
                            case 19:
                            case 20:
                            case 23:
                            case 24:
                            default:
                                break;
                            case 14:
                                class293.affiliateID = Integer.parseInt(var2);
                                break;
                            case 15:
                                field354 = Integer.parseInt(var2);
                                break;
                            case 17:
                                class268.field3179 = var2;
                                break;
                            case 21:
                                field388 = Integer.parseInt(var2);
                                break;
                            case 22:
                                class276.field3255 = var2;
                                break;
                            case 25:
                                int var3 = var2.indexOf(".");
                                if (var3 == -1) {
                                    class585.field5890 = Integer.parseInt(var2);
                                } else {
                                    class585.field5890 = Integer.parseInt(var2.substring(0, var3));
                                    Integer.parseInt(var2.substring(var3 + 1));
                                }
                        }
                    }
                }

                SecureRandomFuture.method4057();
                class35.worldHost = this.getCodeBase().getHost();
                class297.field3418 = new class413();
                String var4 = Players.field5353.name;
                byte var5 = 0;
                if ((field385 & class582.field5865.vmethod11658()) != 0) {
                    class184.field1997 = "beta";
                }

                try {
                    class27.method412("oldschool", class184.field1997, var4, var5, 25);
                } catch (Exception var7) {
                    class508.RunException_sendStackTrace((String) null, var7);
                }

                class521.field5519 = this;
                class616.field6089 = clientType;
                InterfaceParent.method188();
                if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
                    this.field349 = true;
                }

                if (field390 == -1) {
                    if (!this.method799() && !this.method800()) {
                        field390 = 0;
                    } else {
                        field390 = 5;
                    }
                }

                this.startThread(765, 503, 233, 1);
            }
        } catch (RuntimeException var8) {
            throw class16.method219(var8, "runescape.client.init(" + ')');
        }
    }

    public void setOtlTokenRequester(OtlTokenRequester var1) {
        if (var1 != null) {
            this.field480 = var1;
            class78.method2677(10);
        }
    }

    public boolean isOnLoginScreen() {
        return gameState == 10;
    }

    public long getAccountHash() {
        return this.field619;
    }

    public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
        if (var1 != null) {
            this.field562 = var1;
        }
    }

    protected void finalize() throws Throwable {
        class339.field3893.remove(this);
        super.finalize();
    }

    public void setClient(int var1) {
        this.field600 = var1;
    }
}
