package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
public class class182 extends class540 {
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   static class412 field1981;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   static class320 field1980 = new class320(64);
   @ObfuscatedName("ku")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field1986;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1095542447
   )
   public int field1982 = 0;

   class182() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-317931426"
   )
   void method4164(Buffer var1) {
      while(true) {
         int var2 = var1.method11196();
         if (var2 == 0) {
            this.method4166();
            return;
         }

         this.method4165(var1, var2);
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lwb;IB)V",
      garbageValue = "-10"
   )
   void method4165(Buffer var1, int var2) {
      if (var2 == 5) {
         this.field1982 = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-7"
   )
   void method4166() {
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "-514564214"
   )
   static int method4175(int var0, class55 var1, boolean var2) {
      class369 var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         int var4 = class46.field659[--class124.field1569];
         var3 = class119.field1554.method7476(var4);
      } else {
         var3 = var2 ? class19.field81 : class141.field1714;
      }

      class369[] var5;
      if (var0 == 1000) {
         class124.field1569 -= 4;
         var3.field4209 = class46.field659[class124.field1569];
         var3.field4228 = class46.field659[class124.field1569 + 1];
         var3.field4150 = class46.field659[class124.field1569 + 2];
         var3.field4161 = class46.field659[class124.field1569 + 3];
         class89.method2877(var3);
         class521.field5519.method962(var3);
         if (var3.field4147 == 0) {
            var5 = var3.field4145 * -217986249 == -1 ? class119.field1554.field4037[var3.field4144 >> 16] : class119.field1554.method7476(var3.field4164).field4286;
            class23.method337(var5, var3, false);
         }

         return 1;
      } else if (var0 == 1001) {
         class124.field1569 -= 4;
         var3.field4156 = class46.field659[class124.field1569];
         var3.field4157 = class46.field659[class124.field1569 + 1];
         var3.field4251 = class46.field659[class124.field1569 + 2];
         var3.field4221 = class46.field659[class124.field1569 + 3];
         class89.method2877(var3);
         class521.field5519.method962(var3);
         if (var3.field4147 == 0) {
            var5 = var3.field4145 * -217986249 == -1 ? class119.field1554.field4037[var3.field4144 >> 16] : class119.field1554.method7476(var3.field4164).field4286;
            class23.method337(var5, var3, false);
         }

         return 1;
      } else if (var0 == 1003) {
         boolean var6 = class46.field659[--class124.field1569] == 1;
         if (var6 != var3.field4166) {
            var3.field4166 = var6;
            class89.method2877(var3);
         }

         return 1;
      } else if (var0 == 1005) {
         var3.field4267 = class46.field659[--class124.field1569] == 1;
         return 1;
      } else if (var0 == 1006) {
         var3.field4297 = class46.field659[--class124.field1569] == 1;
         return 1;
      } else {
         return 2;
      }
   }
}
