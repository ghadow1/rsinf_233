package game;

import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
public class class355 {
   @ObfuscatedName("aw")
   public static int[] field4022;
   @ObfuscatedName("at")
   static int[] field4021 = new int[32];

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field4021[var1] = var0 - 1;
         var0 += var0;
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)[Ltz;",
      garbageValue = "-1409044849"
   )
   public static class516[] method7406() {
      return new class516[]{class516.field5483, class516.field5485, class516.field5475, class516.field5476};
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lti;Ljava/lang/Object;IIB)V",
      garbageValue = "1"
   )
   public static void method7409(class519 var0, Object var1, int var2, int var3) {
      class374.method8144(var0);
      if (var2 < 0) {
         var2 = 0;
      }

      int var4 = var3 + var2;
      if (var3 < 0 || var4 < 0 || var4 > var0.method10322()) {
         var4 = var0.method10322();
      }

      if (var0.field5504 == class574.field5820) {
         Arrays.fill(var0.method10318(), var2, var4, (Integer)var1);
      } else if (var0.field5504 == class574.field5816) {
         Arrays.fill(var0.method10320(), var2, var4, (Long)var1);
      } else {
         Arrays.fill(var0.method10321(), var2, var4, var1);
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "215792805"
   )
   static int method7403(int var0, class55 var1, boolean var2) {
      class369 var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = class119.field1554.method7476(class46.field659[--class124.field1569]);
      } else {
         var3 = var2 ? class19.field81 : class141.field1714;
      }

      class89.method2877(var3);
      int var4;
      int var5;
      if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
         if (var0 == 1201) {
            var3.field4192 = 2;
            var3.field4277 = class46.field659[--class124.field1569];
            return 1;
         } else if (var0 == 1202) {
            var3.field4192 = 3;
            var3.field4277 = class76.field1108.field935.method7536();
            return 1;
         } else if (var0 == 1207) {
            boolean var7 = class46.field659[--class124.field1569] == 1;
            var3.method7977(class76.field1108.field935, var7);
            return 1;
         } else if (var0 == 1208) {
            var4 = class46.field659[--class124.field1569];
            if (var3.field4206 == null) {
               throw new RuntimeException("");
            } else {
               var3.field4206.method7541(var4);
               return 1;
            }
         } else if (var0 == 1209) {
            class124.field1569 -= 2;
            var4 = class46.field659[class124.field1569];
            var5 = class46.field659[class124.field1569 + 1];
            if (var3.field4206 == null) {
               throw new RuntimeException("");
            } else {
               var3.field4206.method7533(var4, var5);
               return 1;
            }
         } else if (var0 == 1210) {
            var4 = class46.field659[--class124.field1569];
            if (var3.field4206 == null) {
               throw new RuntimeException("");
            } else {
               var3.field4206.method7562(class76.field1108.field935.field4084, var4);
               return 1;
            }
         } else if (var0 == 1214) {
            var3.field4192 = 8;
            var3.field4277 = class46.field659[--class124.field1569];
            return 1;
         } else if (var0 == 1215) {
            var3.field4192 = 9;
            var3.field4277 = class46.field659[--class124.field1569];
            return 1;
         } else {
            return 2;
         }
      } else {
         class124.field1569 -= 2;
         var4 = class46.field659[class124.field1569];
         var5 = class46.field659[class124.field1569 + 1];
         var3.field4282 = var4;
         var3.field4283 = var5;
         class213 var6 = class84.method2800(var4);
         var3.field4200 = var6.field2424;
         var3.field4235 = var6.field2393;
         var3.field4202 = var6.field2392;
         var3.field4226 = var6.field2378;
         var3.field4199 = var6.field2398;
         var3.field4203 = var6.field2430;
         if (var0 == 1205) {
            var3.field4198 = 0;
         } else if (var0 == 1212 | 1 == var6.field2397) {
            var3.field4198 = 1;
         } else {
            var3.field4198 = 2;
         }

         if (var3.field4152 > 0) {
            var3.field4203 = var3.field4203 * 32 / var3.field4152;
         } else if (var3.field4156 > 0) {
            var3.field4203 = var3.field4203 * 32 / var3.field4156;
         }

         return 1;
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "432950031"
   )
   static void method7408(boolean var0) {
      byte var1 = 0;
      boolean var2 = class36.field239.method2570() >= client.field388;
      if (!var2) {
         var1 = 12;
      } else if (class521.field5519.method799() || class521.field5519.method1413() || class521.field5519.method800()) {
         var1 = 10;
      }

      class78.method2677(var1);
      if (var0) {
         class52.local_password = "";
         class52.field726 = "";
         class38.field257 = 0;
         class464.field5240 = "";
      }

      if (class52.local_password == null || class52.local_password.isEmpty()) {
         if (class36.field239.method2597() != null) {
            class52.local_password = class36.field239.method2597();
            client.field331 = true;
         } else {
            client.field331 = false;
         }
      }

      if (client.field331 && class52.local_password != null && !class52.local_password.isEmpty()) {
         class52.field750 = 1;
      } else {
         class52.field750 = 0;
      }

   }
}
