package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
public class class202 extends class540 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   public static class412 field2216;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class320 field2211 = new class320(64);
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -787400753
   )
   int field2213 = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1358036233
   )
   public int field2215;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1090917467
   )
   public int field2212;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1189106491
   )
   public int field2214;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -486363319
   )
   public int field2217;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-23083"
   )
   public void method4443() {
      this.method4430(this.field2213);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lwb;II)V",
      garbageValue = "1517946924"
   )
   public void method4428(Buffer var1, int var2) {
      while(true) {
         int var3 = var1.method11196();
         if (var3 == 0) {
            return;
         }

         this.method4429(var1, var3, var2);
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lwb;IIB)V",
      garbageValue = "40"
   )
   void method4429(Buffer var1, int var2, int var3) {
      if (var2 == 1) {
         this.field2213 = var1.method11278();
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-102250328"
   )
   void method4430(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var10 + var8) / 2.0D;
      if (var8 != var10) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var10 == var4) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0D;
         } else if (var10 == var6) {
            var12 = 4.0D + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0D;
      this.field2212 = (int)(var14 * 256.0D);
      this.field2214 = (int)(var16 * 256.0D);
      if (this.field2212 < 0) {
         this.field2212 = 0;
      } else if (this.field2212 > 255) {
         this.field2212 = 255;
      }

      if (this.field2214 < 0) {
         this.field2214 = 0;
      } else if (this.field2214 > 255) {
         this.field2214 = 255;
      }

      if (var16 > 0.5D) {
         this.field2217 = (int)(512.0D * (1.0D - var16) * var14);
      } else {
         this.field2217 = (int)(512.0D * var16 * var14);
      }

      if (this.field2217 < 1) {
         this.field2217 = 1;
      }

      this.field2215 = (int)((double)this.field2217 * var12);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)Lho;",
      garbageValue = "-2092361840"
   )
   public static class202 method4441(int var0) {
      class202 var1 = (class202)field2211.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = field2216.method8335(1, var0);
         var1 = new class202();
         if (var2 != null) {
            var1.method4428(new Buffer(var2), var0);
         }

         var1.method4443();
         field2211.method7009(var1, (long)var0);
         return var1;
      }
   }
}
