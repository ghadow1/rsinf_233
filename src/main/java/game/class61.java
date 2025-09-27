package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
public class class61 {
   @ObfuscatedName("nt")
   static boolean field860;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   final class409 field859;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1091941097
   )
   final int field864;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1815336057
   )
   int field861 = 0;

   @ObfuscatedSignature(
      descriptor = "(Lpw;Ljava/lang/String;)V"
   )
   class61(class409 var1, String var2) {
      this.field859 = var1;
      this.field864 = var1.method8344();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-310205211"
   )
   boolean method2088() {
      this.field861 = 0;

      for(int var1 = 0; var1 < this.field864; ++var1) {
         if (!this.field859.method8298(var1) || this.field859.method8297(var1)) {
            ++this.field861;
         }
      }

      return this.field861 >= this.field864;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "57"
   )
   static void method2094() {
      class565 var0 = null;

      try {
         var0 = class33.method501("", class429.field5084.field4419, true);
         class590 var1 = class36.field239.method2632();
         var0.method10909(var1.index, 0, var1.buffer * 1216585693);
      } catch (Exception var3) {
      }

      try {
         if (var0 != null) {
            var0.method10892(true);
         }
      } catch (Exception var2) {
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "22196"
   )
   static void method2093() {
      class59.field842 = 99;
      class39.field270 = new short[4][104][104];
      class59.field846 = new short[4][104][104];
      class59.field847 = new byte[4][104][104];
      class59.field848 = new byte[4][104][104];
      class397.field4837 = new int[4][105][105];
      class59.field849 = new byte[4][105][105];
      class159.field1828 = new int[105][105];
      class124.field1568 = new int[104];
      class256.field3083 = new int[104];
      class59.field844 = new int[104];
      class59.field850 = new int[104];
      class235.field2814 = new int[104];
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1138437912"
   )
   public static int method2087(int var0) {
      return var0 >> 1 & 3;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lpx;Ljava/lang/String;Ljava/lang/String;I)Lxc;",
      garbageValue = "-230403327"
   )
   public static class604 method2092(class412 var0, String var1, String var2) {
      if (!var0.method8355(var1, var2)) {
         return null;
      } else {
         int var3 = var0.method8361(var1);
         int var4 = var0.method8354(var3, var2);
         return class342.method7322(var0, var3, var4);
      }
   }

   @ObfuscatedName("kd")
   @ObfuscatedSignature(
      descriptor = "(Ldr;IIIIII)V",
      garbageValue = "-2035876549"
   )
   static void method2091(class79 var0, int var1, int var2, int var3, int var4, int var5) {
      class436 var6 = var0.field1167[var1][var2][var3];
      if (var6 != null) {
         for(class85 var7 = (class85)var6.method8690(); var7 != null; var7 = (class85)var6.method8692()) {
            if ((var4 & 32767) == var7.field1221) {
               var7.method2802(var5);
               break;
            }
         }
      }

   }
}
