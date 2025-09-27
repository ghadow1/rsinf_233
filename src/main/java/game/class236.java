package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
public final class class236 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1942311071
   )
   int field2829;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -803319375
   )
   int field2816;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1030563503
   )
   int field2822;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 2133961185
   )
   int field2818;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 753330381
   )
   int field2819;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1134792567
   )
   int field2815;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 344670591
   )
   int field2821;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1813630749
   )
   int field2825;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -968611377
   )
   int field2834;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 754158615
   )
   int field2824;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1259682761
   )
   int field2830;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1586443513
   )
   int field2826;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1510671523
   )
   int field2827;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 487184861
   )
   int field2828;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -2084873843
   )
   int field2817;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1125511533
   )
   int field2833;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -736166349
   )
   int field2831;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1715814317
   )
   int field2832;

   class236() {
   }

   @ObfuscatedName("kh")
   @ObfuscatedSignature(
      descriptor = "(Ldr;IIIIII)V",
      garbageValue = "752206861"
   )
   static void method5384(class79 var0, int var1, int var2, int var3, int var4, int var5) {
      class436 var6 = var0.field1167[var1][var2][var3];
      if (var6 != null) {
         for(class85 var7 = (class85)var6.method8690(); var7 != null; var7 = (class85)var6.method8692()) {
            if ((var4 & 32767) == var7.field1221 && var5 == var7.field1222) {
               var7.vmethod10557();
               break;
            }
         }

         if (var6.method8690() == null) {
            var0.field1167[var1][var2][var3] = null;
         }

         class72.method2337(var0, var1, var2, var3);
      }

   }
}
