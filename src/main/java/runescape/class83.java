package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
public class class83 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -656443587
   )
   int field1209;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 97877211
   )
   int field1208;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1814614173
   )
   int field1207;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -522238531
   )
   int field1205;

   class83(int var1, int var2, int var3, int var4) {
      this.field1209 = var1;
      this.field1208 = var2;
      this.field1207 = var3;
      this.field1205 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1399233263"
   )
   int method2781() {
      return this.field1209;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-781841929"
   )
   int method2782() {
      return this.field1208;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2045203339"
   )
   int method2783() {
      return this.field1207;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "87"
   )
   int method2787() {
      return this.field1205;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZB)I",
      garbageValue = "0"
   )
   static int method2795(int var0, class55 var1, boolean var2) {
      class369 var3;
      if (var0 != 1927 && var0 != 2927) {
         int var4;
         if (var0 == 1928) {
            var3 = var2 ? class19.field81 : class141.field1714;
            var4 = class46.field659[--class124.field1569];
            if (var4 >= 1 && var4 <= 10) {
               class83 var12 = new class83(var4, var3.field4144, var3.field4145 * -217986249, var3.field4282);
               class46.field669.add(var12);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else {
            int var5;
            if (var0 == 2928) {
               class124.field1569 -= 3;
               int var9 = class46.field659[class124.field1569];
               var4 = class46.field659[class124.field1569 + 1];
               var5 = class46.field659[class124.field1569 + 2];
               if (var5 >= 1 && var5 <= 10) {
                  class369 var10 = class119.field1554.method7477(var9, var4);
                  if (var10 == null) {
                     throw new RuntimeException();
                  } else {
                     class83 var11 = new class83(var5, var9, var4, var10.field4282);
                     class46.field669.add(var11);
                     return 1;
                  }
               } else {
                  throw new RuntimeException();
               }
            } else if (var0 == 2929) {
               Object[] var14 = class301.method6826();
               class124.field1569 -= 3;
               var4 = class46.field659[class124.field1569];
               var5 = class46.field659[class124.field1569 + 1];
               int var6 = class46.field659[class124.field1569 + 2];
               boolean var7 = true;
               class369 var8 = class119.field1554.method7477(var5, var6);
               if (var8 != null) {
                  int var15 = var8.field4282;
                  class231.method5359(var5, var6, var15, var4, var14);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            } else {
               return 2;
            }
         }
      } else if (class46.field670 >= 10) {
         throw new RuntimeException();
      } else {
         if (var0 >= 2000) {
            var3 = class119.field1554.method7476(class46.field659[--class124.field1569]);
         } else {
            var3 = var2 ? class19.field81 : class141.field1714;
         }

         if (var3.field4270 == null) {
            return 0;
         } else {
            class65 var13 = new class65();
            var13.field893 = var3;
            var13.field898 = var3.field4270;
            var13.field902 = class46.field670 + 1;
            client.field434.method8689(var13);
            return 1;
         }
      }
   }
}
