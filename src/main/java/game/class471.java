package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
public class class471 extends class477 {
   @ObfuscatedSignature(
      descriptor = "(Lsi;)V"
   )
   public class471(class477 var1) {
      super(var1);
      super.field5303 = "SwapSongTask";
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "40"
   )
   public boolean vmethod9673() {
      if (class339.field3890.size() > 1 && class339.field3890.get(0) != null && ((class351)class339.field3890.get(0)).field4012.method7146() && class339.field3890.get(1) != null && ((class351)class339.field3890.get(1)).field4012.method7146()) {
         class351 var1 = (class351)class339.field3890.get(0);
         class339.field3890.set(0, class339.field3890.get(1));
         class339.field3890.set(1, var1);
      }

      return true;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "-1918308418"
   )
   static int method9643(int var0, class55 var1, boolean var2) {
      class369 var3;
      if (var0 == 2700) {
         var3 = class119.field1554.method7476(class46.field659[--class124.field1569]);
         class46.field659[++class124.field1569 - 1] = var3.field4282;
         return 1;
      } else if (var0 == 2701) {
         var3 = class119.field1554.method7476(class46.field659[--class124.field1569]);
         if (var3.field4282 != -1) {
            class46.field659[++class124.field1569 - 1] = var3.field4283;
         } else {
            class46.field659[++class124.field1569 - 1] = 0;
         }

         return 1;
      } else {
         int var7;
         if (var0 == 2702) {
            var7 = class46.field659[--class124.field1569];
            class64 var10 = (class64)client.field422.method8623((long)var7);
            if (var10 != null) {
               class46.field659[++class124.field1569 - 1] = 1;
            } else {
               class46.field659[++class124.field1569 - 1] = 0;
            }

            return 1;
         } else if (var0 == 2703) {
            class124.field1569 -= 3;
            var7 = class46.field659[class124.field1569];
            class369 var8 = class119.field1554.method7477(class46.field659[class124.field1569 + 1], class46.field659[class124.field1569 + 2]);
            class208 var9 = class97.method3080(var7);
            if (var9.method4524()) {
               class46.field660[++class46.field658 - 1] = var8.method8004(var7, var9.field2269);
            } else {
               class46.field659[++class124.field1569 - 1] = var8.method7951(var7, var9.field2273);
            }

            return 1;
         } else if (var0 == 2704) {
            class124.field1569 -= 3;
            var3 = class119.field1554.method7477(class46.field659[class124.field1569], class46.field659[class124.field1569 + 1]);
            int var4 = class46.field659[class124.field1569 + 2];
            Object var5 = class60.method2082(var4);
            int var6 = class46.field659[--class124.field1569];
            var3.method7952(var6, var5);
            return 1;
         } else if (var0 == 2706) {
            class46.field659[++class124.field1569 - 1] = client.field421;
            return 1;
         } else if (var0 == 2707) {
            var3 = class119.field1554.method7476(class46.field659[--class124.field1569]);
            class46.field659[++class124.field1569 - 1] = var3.method8100() ? 1 : 0;
            return 1;
         } else if (var0 == 2708) {
            var3 = class119.field1554.method7476(class46.field659[--class124.field1569]);
            return class324.method7032(var3);
         } else if (var0 == 2709) {
            var3 = class119.field1554.method7476(class46.field659[--class124.field1569]);
            return class178.method4156(var3);
         } else {
            return 2;
         }
      }
   }
}
