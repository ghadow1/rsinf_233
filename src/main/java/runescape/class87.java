package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
final class class87 implements class357 {
   @ObfuscatedName("pu")
   static int[][] field1235;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   final class369 val$item;

   @ObfuscatedSignature(
      descriptor = "(Loi;)V"
   )
   class87(class369 var1) {
      this.val$item = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-8197"
   )
   public void vmethod7474() {
      if (this.val$item.method7974().field4067 != null) {
         class65 var1 = new class65();
         var1.method2136(this.val$item);
         var1.method2143(this.val$item.method7974().field4067);
         class161.method3912().method8689(var1);
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "8"
   )
   static int method2829(int var0, int var1) {
      class214 var2 = client.method1287(var0);
      if (var2 == null) {
         return var1;
      } else {
         int var4;
         int var5;
         int var6;
         int var7;
         int var8;
         if (var2.field2453 >= 0) {
            var4 = var2.field2451;
            var5 = var2.field2452;
            var6 = var2.field2446;
            if (var6 > 179) {
               var5 /= 2;
            }

            if (var6 > 192) {
               var5 /= 2;
            }

            if (var6 > 217) {
               var5 /= 2;
            }

            if (var6 > 243) {
               var5 /= 2;
            }

            var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10);
            var8 = class340.method7268(var7, 96);
            return class225.field2639[var8] | -16777216;
         } else if (var2.field2445 >= 0) {
            int var3 = class340.method7268(class225.field2632.field3010.vmethod5779(var2.field2445), 96);
            return class225.field2639[var3] | -16777216;
         } else if (var2.field2444 == 16711935) {
            return var1;
         } else {
            var4 = var2.field2448;
            var5 = var2.field2449;
            var6 = var2.field2450;
            if (var6 > 179) {
               var5 /= 2;
            }

            if (var6 > 192) {
               var5 /= 2;
            }

            if (var6 > 217) {
               var5 /= 2;
            }

            if (var6 > 243) {
               var5 /= 2;
            }

            var7 = (var5 / 32 << 7) + var6 / 2 + (var4 / 4 << 10);
            var8 = class340.method7268(var7, 96);
            return class225.field2639[var8] | -16777216;
         }
      }
   }

   @ObfuscatedName("nn")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1242444243"
   )
   static void method2833(int var0) {
      class537.field5586 = new class50();
      class537.field5586.field713 = client.field522.field6067[var0];
      class537.field5586.field712 = client.field522.field6054[var0];
      class537.field5586.field711 = client.field522.field6055[var0];
      class537.field5586.field714 = client.field522.field6064[var0];
      class537.field5586.field715 = client.field522.field6057[var0];
      class537.field5586.field717 = client.field522.field6056[var0];
      class537.field5586.field716 = client.field522.field6062[var0];
      class537.field5586.field719 = client.field522.field6060[var0];
      class537.field5586.field720 = client.field522.field6051[var0];
   }
}
