package runescape;

import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
public class class192 extends class540 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   static class320 field2084 = new class320(64);

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lpx;Lpx;Lud;ZII)V",
      garbageValue = "-1143323137"
   )
   static void method4313(class412 var0, class412 var1, class523 var2, boolean var3, int var4) {
      if (class4.field9) {
         if (var4 == 4) {
            class78.method2677(4);
         }

      } else {
         if (var4 == 0) {
            class355.method7408(var3);
         } else {
            class78.method2677(var4);
         }

         class601.method11554();
         byte[] var5 = var0.method8371("title.jpg", "");
         class53.field772 = class179.method4160(var5);
         class406.field4894 = class53.field772.method11694();
         class125.method3559(var1, client.field385);
         class478.field5307 = class61.method2092(var1, "titlebox", "");
         class199.field2175 = class61.method2092(var1, "titlebutton", "");
         class44.field625 = class61.method2092(var1, "titlebutton_large", "");
         class205.field2257 = class61.method2092(var1, "play_now_text", "");
         class61.method2092(var1, "titlebutton_wide42,1", "");
         class447.field5149 = class168.method4040(var1, "runes", "");
         class39.field273 = class168.method4040(var1, "title_mute", "");
         class289.field3340 = class61.method2092(var1, "options_radio_buttons,0", "");
         class386.field4416 = class61.method2092(var1, "options_radio_buttons,4", "");
         class199.field2173 = class61.method2092(var1, "options_radio_buttons,2", "");
         class178.field1964 = class61.method2092(var1, "options_radio_buttons,6", "");
         class33.field174 = class289.field3340.field6007;
         class537.field5577 = class289.field3340.field6010;
         class155.field1803 = new class77(class447.field5149, var2.field5535);
         if (var3) {
            class52.local_username = "";
            class52.field726 = "";
            class52.field739 = new String[8];
            class52.field738 = 0;
         }

         class38.field257 = 0;
         class464.field5240 = "";
         class52.field743 = true;
         class52.field740 = false;
         if (class36.clientPreferences.method2559()) {
            class257.method5884(0, 0);
         } else {
            class257.method5884(0, 0);
            ArrayList var6 = new ArrayList();
            var6.add(new class351(class358.field4042, "scape main", "", 255, false));
            class271.method6081(var6, 0, 0, 0, 100, false);
         }

         class159.method3892();
         class413 var7 = class297.field3418;
         var7.method8436(false);
         class4.field9 = true;
         class52.field731 = (class34.screenWidth - 765) / 2;
         class52.field741 = class52.field731 + 202;
         class294.field3397 = class52.field741 + 180;
         class53.field772.method11704(class52.field731, 0);
         class406.field4894.method11704(class52.field731 + 382, 0);
         class139.field1686.method11667(class52.field731 + 382 - class139.field1686.field6007 / 2, 18);
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Loi;I[B[BI)V",
      garbageValue = "1415544479"
   )
   static final void method4315(class369 var0, int var1, byte[] var2, byte[] var3) {
      if (var0.field4223 == null) {
         if (var2 == null) {
            return;
         }

         var0.field4223 = new byte[11][];
         var0.field4224 = new byte[11][];
         var0.field4220 = new int[11];
         var0.field4233 = new int[11];
      }

      var0.field4223[var1] = var2;
      if (var2 != null) {
         var0.field4222 = true;
      } else {
         var0.field4222 = false;

         for(int var4 = 0; var4 < var0.field4223.length; ++var4) {
            if (var0.field4223[var4] != null) {
               var0.field4222 = true;
               break;
            }
         }
      }

      var0.field4224[var1] = var3;
   }

   @ObfuscatedName("jp")
   @ObfuscatedSignature(
      descriptor = "(Ldr;Ltj;ZI)V",
      garbageValue = "245502513"
   )
   static void method4314(class79 var0, class505 var1, boolean var2) {
      boolean var3 = var1.field5425.field2245 && !var2;
      long var4 = 0L;
      boolean var6 = var1.field5429.field1172 == client.field346;
      class398 var7 = var1.method10073(var6);
      boolean var8;
      if (var7 == class398.field4841) {
         var4 = class123.method3544(0, 0, 0, 5, false, 0, 0);
      } else if (var3 && var7 != class398.field4839) {
         var8 = var7 == class398.field4840;
         int var9 = var1.vmethod11530();
         int var11 = var1.vmethod11534();
         int var10 = var11 >> 7;
         int var14 = var1.vmethod11529();
         int var13 = var14 >> 7;
         var4 = class123.method3544(var9, var10, var13, 4, !var8, var1.field5421, var0.field1172);
      }

      var1.field5422.method6294(class413.method8434(var0, var1.vmethod11534(), var1.vmethod11529(), var0.field1170));
      var1.field5429.field1159.field2709 = client.cycle;
      var1.method10063(var2);
      var8 = var0.field1159.method5112(var0.field1170, var1.vmethod11534(), var1.vmethod11529(), var1.method10066(), 60, var1.field5429.field1159, var1.method10110(), var4, false);
      if (var8 && !var2) {
         class79 var15 = var1.field5429;
         if (client.field391) {
            class390.method8219(var15, client.field491, false);
         }

         class79 var16 = var1.field5429;
         if (client.field519 >= 0 && var16.field1169.method8567((long)client.field519) != null) {
            class390.method8219(var16, client.field519, false);
         }

         class433.method8666(var1.field5429, class197.field2163);
         class81.method2772(var1.field5429);
         class433.method8666(var1.field5429, class197.field2162);
         class433.method8666(var1.field5429, class197.field2164);
         class79 var17 = var1.field5429;

         for(class48 var18 = (class48)var17.field1174.method8690(); var18 != null; var18 = (class48)var17.field1174.method8692()) {
            if (var17.field1170 == var18.field690 && !var18.method1874()) {
               if (client.cycle >= var18.field689) {
                  var18.method1875(client.field389);
                  if (var18.method1874()) {
                     var18.vmethod10557();
                  } else {
                     var17.field1159.method5112(var18.field690, var18.field691, var18.field692, var18.field696, 60, var18, 0, -1L, false);
                  }
               }
            } else {
               var18.vmethod10557();
            }
         }
      }

   }
}
