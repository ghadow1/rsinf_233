package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wr")
public class class579 extends class540 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   public static class412 field5839;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   static class320 field5842 = new class320(64);
   @ObfuscatedName("at")
   Object[][] field5841;
   @ObfuscatedName("ac")
   int[][] field5840;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -278345135
   )
   public int field5843 = -1;

   class579() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-456392655"
   )
   void method11067(class590 var1) {
      while(true) {
         int var2 = var1.method11196();
         if (var2 == 0) {
            return;
         }

         this.method11069(var1, var2);
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)[Ljava/lang/Object;",
      garbageValue = "20"
   )
   public Object[] method11068(int var1) {
      return this.field5841 == null ? null : this.field5841[var1];
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lwb;II)V",
      garbageValue = "-1115236363"
   )
   void method11069(class590 var1, int var2) {
      if (var2 == 3) {
         int var3 = var1.method11196();
         if (this.field5841 == null) {
            this.field5841 = new Object[var3][];
            this.field5840 = new int[var3][];
         }

         for(int var4 = var1.method11196(); var4 != 255; var4 = var1.method11196()) {
            int var5 = var1.method11196();
            int[] var6 = new int[var5];

            for(int var7 = 0; var7 < var5; ++var7) {
               var6[var7] = var1.method11212();
            }

            Object[][] var16 = this.field5841;
            int var10 = var1.method11212();
            Object[] var11 = new Object[var6.length * var10];

            for(int var12 = 0; var12 < var10; ++var12) {
               for(int var13 = 0; var13 < var6.length; ++var13) {
                  int var14 = var13 + var6.length * var12;
                  class574 var15 = class491.method9850(var6[var13]);
                  var11[var14] = var15.method11020(var1);
               }
            }

            var16[var4] = var11;
            this.field5840[var4] = var6;
         }
      } else if (var2 == 4) {
         this.field5843 = var1.method11218();
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-448016434"
   )
   void method11070() {
   }
}
