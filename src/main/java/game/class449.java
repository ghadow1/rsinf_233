package game;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public class class449 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "[Lrw;"
   )
   public static class449[] field5164 = new class449[0];
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 636525271
   )
   static int field5157 = 8;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 292874865
   )
   public static int field5161;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -50774795
   )
   public int field5160;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -660429583
   )
   public int field5159;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -952635521
   )
   public int field5162;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 747239103
   )
   public int field5163;

   static {
      field5164 = new class449[8];
      field5161 = 0;
   }

   public class449(int var1, int var2, int var3, int var4) {
      this.method8942(var1, var2);
      this.method8943(var3, var4);
   }

   public class449(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-1"
   )
   public void method8941() {
      synchronized(field5164) {
         if (field5161 < field5157) {
            field5164[++field5161 - 1] = this;
         }

      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "102"
   )
   public void method8942(int var1, int var2) {
      this.field5160 = var1;
      this.field5159 = var2;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1670106959"
   )
   public void method8943(int var1, int var2) {
      this.field5162 = var1;
      this.field5163 = var2;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-1642465505"
   )
   public boolean method8976(int var1, int var2) {
      return var1 >= this.field5160 && var1 < this.field5162 + this.field5160 && var2 >= this.field5159 && var2 < this.field5159 + this.field5163;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lrw;I)Z",
      garbageValue = "-1498497084"
   )
   public boolean method8944(class449 var1) {
      return this.field5160 <= var1.method8948() && var1.field5160 <= this.method8948() && this.field5159 <= var1.method8949() && var1.field5159 <= this.method8949();
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lrw;Lrw;I)V",
      garbageValue = "674770577"
   )
   public void method8945(class449 var1, class449 var2) {
      this.method8959(var1, var2);
      this.method8946(var1, var2);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lrw;Lrw;B)V",
      garbageValue = "4"
   )
   void method8959(class449 var1, class449 var2) {
      var2.field5160 = this.field5160;
      var2.field5162 = this.field5162;
      if (this.field5160 < var1.field5160) {
         var2.field5162 -= var1.field5160 - this.field5160;
         var2.field5160 = var1.field5160;
      }

      if (var2.method8948() > var1.method8948()) {
         var2.field5162 -= var2.method8948() - var1.method8948();
      }

      if (var2.field5162 < 0) {
         var2.field5162 = 0;
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Lrw;Lrw;I)V",
      garbageValue = "1378406993"
   )
   void method8946(class449 var1, class449 var2) {
      var2.field5159 = this.field5159;
      var2.field5163 = this.field5163;
      if (this.field5159 < var1.field5159) {
         var2.field5163 -= var1.field5159 - this.field5159;
         var2.field5159 = var1.field5159;
      }

      if (var2.method8949() > var1.method8949()) {
         var2.field5163 -= var2.method8949() - var1.method8949();
      }

      if (var2.field5163 < 0) {
         var2.field5163 = 0;
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "82"
   )
   int method8948() {
      return this.field5162 + this.field5160;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-95"
   )
   int method8949() {
      return this.field5163 + this.field5159;
   }

   public String toString() {
      return null;
   }

   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-557356187"
   )
   static final void method8979(int var0, int var1, int var2, int var3) {
      ++client.field502;
      class333.field3836.field1159.field2709 = client.field412;
      if (class76.field1108.field1055 >> 7 == client.field581 && class76.field1108.field1056 >> 7 == client.field531) {
         client.field581 = 0;
      }

      class512.method10222(class333.field3836);
      class79 var4 = class333.field3836;
      int var5 = client.field522.field6052 - 1;
      int var7;
      if (var4 == class333.field3836 && var5 >= 0 && client.field522.field6055[var5] == 60) {
         var7 = client.field522.field6064[var5] * 128;
         class36.method731(var4, var7, class289.field3341);
      }

      class79 var29 = class333.field3836;
      if (client.field391) {
         class390.method8219(var29, client.field491, false);
      }

      class79 var30 = class333.field3836;
      if (client.field519 >= 0 && var30.field1169.method8567((long)client.field519) != null) {
         class390.method8219(var30, client.field519, false);
      }

      class79 var31 = class333.field3836;
      class505 var8 = (class505)var31.field1171.method8596((long)client.field346);
      if (var8 != null) {
         class192.method4314(var31, var8, false);
      }

      class209.method4564(class333.field3836, class394.field4797);
      class209.method4564(class333.field3836, class394.field4796);
      class433.method8666(class333.field3836, class197.field2163);
      class81.method2772(class333.field3836);
      class433.method8666(class333.field3836, class197.field2162);
      class433.method8666(class333.field3836, class197.field2164);
      class62.method2120();
      class79 var38 = class333.field3836;

      for(class48 var9 = (class48)var38.field1174.method8690(); var9 != null; var9 = (class48)var38.field1174.method8692()) {
         if (var38.field1170 == var9.field690 && !var9.method1874()) {
            if (client.field412 >= var9.field689) {
               var9.method1875(client.field389);
               if (var9.method1874()) {
                  var9.vmethod10557();
               } else {
                  var38.field1159.method5112(var9.field690, var9.field691, var9.field692, var9.field696, 60, var9, 0, -1L, false);
               }
            }
         } else {
            var9.vmethod10557();
         }
      }

      class209.method4564(class333.field3836, class394.field4801);
      class297.method6783(var0, var1, var2, var3, true);
      int var32 = client.field375;
      var5 = client.field597;
      int var6 = client.field313;
      var7 = client.field378;
      class601.method11550(var32, var5, var32 + var6, var7 + var5);
      class225.method4934();
      class601.method11571();
      int var33 = client.field415;
      if (client.field416 / 256 > var33) {
         var33 = client.field416 / 256;
      }

      if (client.field610[4] && client.field594[4] + 128 > var33) {
         var33 = client.field594[4] + 128;
      }

      int var34 = client.field424 & 2047;
      int var10 = class172.field1930;
      int var11 = class191.field2078;
      int var12 = class129.field1584;
      int var15 = var33 * 3 + 600;
      class395.method8228(var10, var11, var12, var33, var34, var15, var7);
      int var16;
      int var17;
      int var18;
      int var19;
      int var20;
      if (!client.field474) {
         var16 = class20.method306();
      } else {
         if (class36.field239.method2672()) {
            var17 = class333.field3836.field1170;
         } else {
            var18 = class187.field2052 >> 7;
            var19 = class10.field46 >> 7;
            if (var18 >= 0 && 104 > var18 && var19 >= 0 && 104 > var19) {
               var20 = class413.method8434(class333.field3836, class187.field2052, class10.field46, class333.field3836.field1170);
               if (var20 - class174.field1940 < 800 && (class333.field3836.field1168[class333.field3836.field1170][var18][var19] & 4) != 0) {
                  var17 = class333.field3836.field1170;
               } else {
                  var17 = 3;
               }
            } else {
               var17 = class333.field3836.field1170;
            }
         }

         var16 = var17;
      }

      var17 = class187.field2052;
      var18 = class174.field1940;
      var19 = class10.field46;
      var20 = class401.field4855;
      int var21 = class302.field3460;

      int var22;
      int var23;
      for(var22 = 0; var22 < 5; ++var22) {
         if (client.field610[var22]) {
            var23 = (int)(Math.random() * (double)(client.field593[var22] * 2 + 1) - (double)client.field593[var22] + Math.sin((double)client.field406[var22] * ((double)client.field595[var22] / 100.0D)) * (double)client.field594[var22]);
            if (var22 == 0) {
               class187.field2052 += var23;
            }

            if (var22 == 1) {
               class174.field1940 += var23;
            }

            if (var22 == 2) {
               class10.field46 += var23;
            }

            if (var22 == 3) {
               class302.field3460 = var23 + class302.field3460 & 2047;
            }

            if (var22 == 4) {
               class401.field4855 += var23;
               if (class401.field4855 < 128) {
                  class401.field4855 = 128;
               }

               if (class401.field4855 > 383) {
                  class401.field4855 = 383;
               }
            }
         }
      }

      var22 = class35.field231;
      var23 = class35.field220;
      int var24;
      if (var22 >= var32 && var22 < var6 + var32 && var23 >= var5 && var23 < var7 + var5) {
         var24 = var22 - var32;
         int var25 = var23 - var5;
         class242.field2964 = var24;
         class242.field2965 = var25;
         class242.field2953 = true;
         class242.field2967 = 0;
         class242.field2957 = false;
         Iterator var26 = client.field333.iterator();

         while(var26.hasNext()) {
            class79 var27 = (class79)var26.next();
            var27.field1159.method5140(var27.field1170, var22 - var32, var23 - var5);
         }
      } else {
         class242.field2953 = false;
         class242.field2967 = 0;
      }

      class125.method3557();
      class601.method11558(var32, var5, var6, var7, 0);
      class125.method3557();
      var24 = class225.method4938();
      class225.method4927(class521.field5519.field206);
      class225.field2632.field3005 = client.field379;
      class217 var35 = client.field346 == -1 ? class217.field2512 : class217.field2511;
      class333.field3836.field1159.method5139(var35);
      class333.field3836.field1159.method5163(class187.field2052, class174.field1940, class10.field46, class401.field4855, class302.field3460, var16, client.field552, client.field337, client.field474);
      class225.method4927(false);
      if (client.field400) {
         class601.method11607();
      }

      class225.field2632.field3005 = var24;
      class125.method3557();
      class303.method6830(class333.field3836, var32, var5, var6, var7);

      for(int var36 = 0; var36 < class333.field3836.field1176.method9790(); ++var36) {
         class505 var41 = (class505)class333.field3836.field1171.method8596((long)class333.field3836.field1176.method9787(var36));
         if (var41 != null) {
            class303.method6830(var41.field5429, var32, var5, var6, var7);
         }
      }

      class79 var40 = class333.field3836;
      if (client.field455 == 2) {
         int var37 = client.field461 * 64 + (client.field458 - var40.field1164 << 7);
         int var28 = client.field462 * 64 + (client.field459 - var40.field1165 << 7);
         class41.method774(var40, var37, var28, var37, var28, client.field460 * 2, 0);
         if (client.field503 > -1 && client.field412 % 20 < 10) {
            class400.field4848[0].method11705(var32 + client.field503 - 12, var5 + client.field504 - 28);
         }
      }

      ((class237)class225.field2632.field3010).method5406(client.field389);
      class60.method2086(var32, var5, var6, var7);
      class187.field2052 = var17;
      class174.field1940 = var18;
      class10.field46 = var19;
      class401.field4855 = var20;
      class302.field3460 = var21;
      if (client.field392 && class297.field3418.method8443(true, false) == 0) {
         client.field392 = false;
      }

      if (client.field392) {
         class601.method11558(var32, var5, var6, var7, 0);
         class464.method9402("Loading - please wait.", false);
      }

      class333.field3836.field1159.method5115();

      for(var33 = 0; var33 < class333.field3836.field1176.method9790(); ++var33) {
         class505 var39 = (class505)class333.field3836.field1171.method8596((long)class333.field3836.field1176.method9787(var33));
         if (var39 != null) {
            var39.field5429.field1159.method5115();
         }
      }

   }
}
