package game;

import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
public class class30 {
   @ObfuscatedName("at")
   public static short[] field149;

   static {
      ImageIO.setUseCache(false);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lxt;IIIB)V",
      garbageValue = "32"
   )
   static void method467(class605 var0, int var1, int var2, int var3) {
      class290.field3345.method6977(var0, class277.method6239(var1, var2, var3), var0.field6018.length * 4);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;II)I",
      garbageValue = "-110213457"
   )
   public static int method469(CharSequence var0, int var1) {
      return class387.method8195(var0, var1, true);
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "11"
   )
   public static int method472(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "-394401110"
   )
   static int method473(int var0, class55 var1, boolean var2) {
      class369 var3 = var2 ? class19.field81 : class141.field1714;
      if (var0 == 1700) {
         class46.field659[++class124.field1569 - 1] = var3.field4282;
         return 1;
      } else if (var0 == 1701) {
         if (var3.field4282 != -1) {
            class46.field659[++class124.field1569 - 1] = var3.field4283;
         } else {
            class46.field659[++class124.field1569 - 1] = 0;
         }

         return 1;
      } else if (var0 == 1702) {
         class46.field659[++class124.field1569 - 1] = var3.field4145 * -217986249;
         return 1;
      } else {
         int var4;
         if (var0 == 1703) {
            var4 = class46.field659[--class124.field1569];
            class208 var7 = class97.method3080(var4);
            if (var7.method4524()) {
               class46.field660[++class46.field658 - 1] = var3.method8004(var4, var7.field2269);
            } else {
               class46.field659[++class124.field1569 - 1] = var3.method7951(var4, var7.field2273);
            }

            return 1;
         } else if (var0 == 1704) {
            var4 = class46.field659[--class124.field1569];
            Object var5 = class60.method2082(var4);
            int var6 = class46.field659[--class124.field1569];
            var3.method7952(var6, var5);
            return 1;
         } else if (var0 == 1707) {
            class46.field659[++class124.field1569 - 1] = var3.method8100() ? 1 : 0;
            return 1;
         } else if (var0 == 1708) {
            return class324.method7032(var3);
         } else {
            return var0 == 1709 ? class178.method4156(var3) : 2;
         }
      }
   }
}
