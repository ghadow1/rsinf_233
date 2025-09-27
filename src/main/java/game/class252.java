package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
public final class class252 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Liz;"
   )
   public class233 field3036;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Liz;"
   )
   public class233 field3045;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      longValue = 1018809780381384529L
   )
   public long field3037 = 0L;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1386950097
   )
   int field3041;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1302913785
   )
   int field3039;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1143420041
   )
   int field3040;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -310888395
   )
   int field3046;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -264803905
   )
   int field3042;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1356146427
   )
   int field3043;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 15695633
   )
   int field3044;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 512076447
   )
   int field3047;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1572389463
   )
   int field3035;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1154018501
   )
   int field3038 = 0;

   class252() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1304137704"
   )
   void method5789(int var1, int var2) {
      this.field3043 = var1;
      this.field3044 = var2;
      switch(this.field3046) {
      case 1:
         ++var1;
         break;
      case 2:
         --var2;
      case 3:
      case 5:
      case 6:
      case 7:
      default:
         break;
      case 4:
         --var1;
         break;
      case 8:
         ++var2;
      }

      this.field3047 = var1;
      this.field3035 = var2;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IZI)Ljava/lang/String;",
      garbageValue = "1586972230"
   )
   public static String method5793(int var0, boolean var1) {
      if (var1 && var0 >= 0) {
         int var3 = var0;
         String var2;
         if (var1 && var0 >= 0) {
            int var4 = 2;

            for(int var5 = var0 / 10; var5 != 0; ++var4) {
               var5 /= 10;
            }

            char[] var6 = new char[var4];
            var6[0] = '+';

            for(int var7 = var4 - 1; var7 > 0; --var7) {
               int var8 = var3;
               var3 /= 10;
               int var9 = var8 - var3 * 10;
               if (var9 >= 10) {
                  var6[var7] = (char)(var9 + 87);
               } else {
                  var6[var7] = (char)(var9 + 48);
               }
            }

            var2 = new String(var6);
         } else {
            var2 = Integer.toString(var0, 10);
         }

         return var2;
      } else {
         return Integer.toString(var0);
      }
   }

   @ObfuscatedName("mh")
   @ObfuscatedSignature(
      descriptor = "(Loi;III)V",
      garbageValue = "-1761196560"
   )
   static void method5794(class369 var0, int var1, int var2) {
      if (var0.field4150 == 0) {
         var0.field4158 = var0.field4209;
      } else if (var0.field4150 == 1) {
         var0.field4158 = (var1 - var0.field4160 * 469894397) / 2 + var0.field4209;
      } else if (var0.field4150 == 2) {
         var0.field4158 = var1 - var0.field4160 * 469894397 - var0.field4209;
      } else if (var0.field4150 == 3) {
         var0.field4158 = var0.field4209 * var1 >> 14;
      } else if (var0.field4150 == 4) {
         var0.field4158 = (var0.field4209 * var1 >> 14) + (var1 - var0.field4160 * 469894397) / 2;
      } else {
         var0.field4158 = var1 - var0.field4160 * 469894397 - (var0.field4209 * var1 >> 14);
      }

      if (var0.field4161 == 0) {
         var0.field4204 = var0.field4228;
      } else if (var0.field4161 == 1) {
         var0.field4204 = (var2 - var0.field4149 * 1156037777) / 2 + var0.field4228;
      } else if (var0.field4161 == 2) {
         var0.field4204 = var2 - var0.field4149 * 1156037777 - var0.field4228;
      } else if (var0.field4161 == 3) {
         var0.field4204 = var2 * var0.field4228 >> 14;
      } else if (var0.field4161 == 4) {
         var0.field4204 = (var2 - var0.field4149 * 1156037777) / 2 + (var2 * var0.field4228 >> 14);
      } else {
         var0.field4204 = var2 - var0.field4149 * 1156037777 - (var2 * var0.field4228 >> 14);
      }

   }
}
