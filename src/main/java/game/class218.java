package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iw")
public final class class218 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1742420161
   )
   int field2520;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1662479507
   )
   int field2514;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 671669857
   )
   int field2518;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Liz;"
   )
   class233 field2516;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Liz;"
   )
   class233 field2517;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Liz;"
   )
   class233 field2513;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      longValue = 907455366364395703L
   )
   long field2519;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 683028921
   )
   int field2515;

   class218() {
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "-18"
   )
   static final int method4825(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Lti;Lwv;ZI)V",
      garbageValue = "-1160584371"
   )
   static void method4826(class519 var0, class574 var1, boolean var2) {
      if (var0 == null) {
         throw new RuntimeException();
      } else if (var1 != null && var0.field5504 != var1) {
         throw new RuntimeException();
      } else if (var2 && !var0.field5501) {
         throw new RuntimeException();
      }
   }
}
