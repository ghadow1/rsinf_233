package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
public class class206 extends class540 {
   @ObfuscatedName("af")
   static final int[] field2261 = new int[32];
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   static class412 field2259;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class320 field2258 = new class320(64);
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 391048105
   )
   public int field2260;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1000785497
   )
   public int field2262;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -850328077
   )
   public int field2263;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2261[var1] = var0 - 1;
         var0 += var0;
      }

   }

   class206() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "1264643719"
   )
   void method4501(Buffer var1) {
      while(true) {
         int var2 = var1.method11196();
         if (var2 == 0) {
            return;
         }

         this.method4502(var1, var2);
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lwb;IB)V",
      garbageValue = "18"
   )
   void method4502(Buffer var1, int var2) {
      if (var2 == 1) {
         this.field2260 = var1.readUnsignedShort();
         this.field2262 = var1.method11196();
         this.field2263 = var1.method11196();
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "856085244"
   )
   static final void method4512(String var0) {
      class90.method2893(30, "", var0);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "2112596582"
   )
   public static int method4513(int var0) {
      long var2 = class242.field2968[var0];
      int var1 = (int)(var2 >>> 0 & 127L);
      return var1;
   }
}
