package game;

import java.awt.Font;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class class190 extends class540 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   static class412 field2070;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class320 field2066 = new class320(64);
   @ObfuscatedName("ah")
   static Font field2077;
   @ObfuscatedName("at")
   public char field2067;
   @ObfuscatedName("ac")
   public char field2068;
   @ObfuscatedName("ap")
   public String field2069 = "null";
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1626468919
   )
   public int field2071;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -598220801
   )
   public int field2075 = 0;
   @ObfuscatedName("as")
   public int[] field2072;
   @ObfuscatedName("al")
   public int[] field2073;
   @ObfuscatedName("au")
   public String[] field2074;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lti;"
   )
   class519 field2065;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lti;"
   )
   class519 field2076;

   class190() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-1136687181"
   )
   void method4298(class590 var1) {
      while(true) {
         int var2 = var1.method11196();
         if (var2 == 0) {
            return;
         }

         this.method4288(var1, var2);
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lwb;II)V",
      garbageValue = "1773897561"
   )
   void method4288(class590 var1, int var2) {
      if (var2 == 1) {
         this.field2067 = (char)var1.method11196();
      } else if (var2 == 2) {
         this.field2068 = (char)var1.method11196();
      } else if (var2 == 3) {
         this.field2069 = var1.method11207();
      } else if (var2 == 4) {
         this.field2071 = var1.method11202();
      } else {
         int var3;
         if (var2 == 5) {
            this.field2075 = var1.method11198();
            this.field2072 = new int[this.field2075];
            this.field2074 = new String[this.field2075];

            for(var3 = 0; var3 < this.field2075; ++var3) {
               this.field2072[var3] = var1.method11202();
               this.field2074[var3] = var1.method11207();
            }
         } else if (var2 == 6) {
            this.field2075 = var1.method11198();
            this.field2072 = new int[this.field2075];
            this.field2073 = new int[this.field2075];

            for(var3 = 0; var3 < this.field2075; ++var3) {
               this.field2072[var3] = var1.method11202();
               this.field2073[var3] = var1.method11202();
            }
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1961250368"
   )
   public int method4289() {
      return this.field2075;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)Lti;",
      garbageValue = "2075308221"
   )
   public class519 method4290() {
      if (this.field2065 == null) {
         int[] var2 = this.field2072;
         class519 var3 = new class519(class574.field5820, false);
         var3.field5505 = var2;
         var3.field5502 = var2.length * -698619497;
         var3.field5503 = var2.length;
         this.field2065 = var3;
      }

      return this.field2065;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)Lti;",
      garbageValue = "657796052"
   )
   public class519 method4287() {
      if (this.field2076 == null) {
         if (this.field2068 == 's') {
            this.field2076 = class306.method6858(this.field2074);
         } else {
            int[] var2 = this.field2073;
            class519 var3 = new class519(class574.field5820, false);
            var3.field5505 = var2;
            var3.field5502 = var2.length * -698619497;
            var3.field5503 = var2.length;
            this.field2076 = var3;
         }
      }

      return this.field2076;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)I",
      garbageValue = "134409544"
   )
   public static int method4308(CharSequence var0) {
      return class387.method8195(var0, 10, true);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Lwb;S)V",
      garbageValue = "-16659"
   )
   static void method4307(class590 var0) {
      while(true) {
         int var1 = var0.method11198();
         if (var1 != 0) {
            if (var1 != 1) {
               if (var1 <= 49) {
                  var0.method11452();
               }
               continue;
            }

            var0.method11196();
         }

         return;
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(FFFFIIIB)V",
      garbageValue = "-22"
   )
   static final void method4304(float var0, float var1, float var2, float var3, int var4, int var5, int var6) {
      if (!class242.field2957) {
         float var11 = 50.0F;
         float var12 = (float)class228.method5050();
         float var13 = var11 * (float)(class242.field2964 - var4) / (float)var6;
         float var14 = (float)(class242.field2965 - var5) * var11 / (float)var6;
         float var15 = (float)(class242.field2964 - var4) * var12 / (float)var6;
         float var16 = (float)(class242.field2965 - var5) * var12 / (float)var6;
         float var18 = var11 * var0 + var1 * var14;
         var11 = class265.method5963(var14, var11, var1, var0);
         float var19 = var1 * var16 + var12 * var0;
         var12 = class265.method5963(var16, var12, var1, var0);
         float var17 = class100.method3130(var13, var11, var3, var2);
         float var20 = var2 * var13 + var3 * var11;
         var13 = var17;
         var17 = class100.method3130(var15, var12, var3, var2);
         float var21 = var15 * var2 + var12 * var3;
         class405.method8273((int)var13, (int)var18, (int)var20, (int)var17, (int)var19, (int)var21);
      }
   }

   @ObfuscatedName("lf")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "1650531523"
   )
   static final void method4306(int var0, int var1, int var2) {
      class72.method2337(class484.field5343, var0, var1, var2);
   }

   @ObfuscatedName("nx")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1739685858"
   )
   static final int method4305() {
      float var0 = 200.0F * ((float)class36.field239.method2566() - 0.5F);
      return 100 - Math.round(var0);
   }
}
