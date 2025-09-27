package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
public class class225 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lih;"
   )
   static final class228 field2635;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lih;"
   )
   static final class228 field2631;
   @ObfuscatedName("at")
   public static int[] field2639 = new int[65536];
   @ObfuscatedName("ac")
   static int[] field2633 = new int[512];
   @ObfuscatedName("ap")
   static int[] field2634 = new int[2048];
   @ObfuscatedName("aq")
   public static int[] field2637 = new int[2048];
   @ObfuscatedName("ao")
   public static int[] field2636 = new int[2048];
   @ObfuscatedName("as")
   static float[] field2630 = new float[2048];
   @ObfuscatedName("al")
   static float[] field2638 = new float[2048];
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Ljd;"
   )
   public static class247 field2632;
   @ObfuscatedName("ai")
   static double field2640;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lih;"
   )
   static class228 field2641;

   static {
      int var0;
      for(var0 = 1; var0 < 512; ++var0) {
         field2633[var0] = '耀' / var0;
      }

      for(var0 = 1; var0 < 2048; ++var0) {
         field2634[var0] = 65536 / var0;
      }

      for(var0 = 0; var0 < 2048; ++var0) {
         double var1 = Math.sin((double)var0 * 0.0030679615D);
         double var3 = Math.cos((double)var0 * 0.0030679615D);
         field2637[var0] = (int)(65536.0D * var1);
         field2636[var0] = (int)(65536.0D * var3);
         field2630[var0] = (float)var1;
         field2638[var0] = (float)var3;
      }

      field2632 = new class247();
      field2635 = new class246(field2632);
      field2631 = new class248(field2632);
      field2641 = field2635;
   }

   @ObfuscatedName("af")
   public static void method4927(boolean var0) {
      if (var0 && class601.field5987 != null) {
         field2641 = field2631;
      } else {
         field2641 = field2635;
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljs;)V"
   )
   public static void method4928(class251 var0) {
      field2632.field3010 = var0;
   }

   @ObfuscatedName("at")
   public static void method4929(double var0) {
      method4970(var0, 0, 512);
   }

   @ObfuscatedName("ac")
   static void method4970(double var0, int var2, int var3) {
      int var4 = var2 * 128;

      for(int var5 = var2; var5 < var3; ++var5) {
         double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D;
         double var8 = (double)(var5 & 7) / 8.0D + 0.0625D;

         for(int var10 = 0; var10 < 128; ++var10) {
            double var11 = (double)var10 / 128.0D;
            double var13 = var11;
            double var15 = var11;
            double var17 = var11;
            if (var8 != 0.0D) {
               double var19;
               if (var11 < 0.5D) {
                  var19 = var11 * (1.0D + var8);
               } else {
                  var19 = var11 + var8 - var11 * var8;
               }

               double var21 = 2.0D * var11 - var19;
               double var23 = var6 + 0.3333333333333333D;
               if (var23 > 1.0D) {
                  --var23;
               }

               double var27 = var6 - 0.3333333333333333D;
               if (var27 < 0.0D) {
                  ++var27;
               }

               if (6.0D * var23 < 1.0D) {
                  var13 = var21 + (var19 - var21) * 6.0D * var23;
               } else if (2.0D * var23 < 1.0D) {
                  var13 = var19;
               } else if (3.0D * var23 < 2.0D) {
                  var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
               } else {
                  var13 = var21;
               }

               if (6.0D * var6 < 1.0D) {
                  var15 = var21 + (var19 - var21) * 6.0D * var6;
               } else if (2.0D * var6 < 1.0D) {
                  var15 = var19;
               } else if (3.0D * var6 < 2.0D) {
                  var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
               } else {
                  var15 = var21;
               }

               if (6.0D * var27 < 1.0D) {
                  var17 = var21 + (var19 - var21) * 6.0D * var27;
               } else if (2.0D * var27 < 1.0D) {
                  var17 = var19;
               } else if (3.0D * var27 < 2.0D) {
                  var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
               } else {
                  var17 = var21;
               }
            }

            int var29 = (int)(var13 * 256.0D);
            int var20 = (int)(var15 * 256.0D);
            int var30 = (int)(var17 * 256.0D);
            int var22 = var30 + (var20 << 8) + (var29 << 16);
            var22 = method4992(var22, var0);
            if (var22 == 0) {
               var22 = 1;
            }

            field2639[var4++] = var22;
         }
      }

   }

   @ObfuscatedName("ap")
   static int method4992(int var0, double var1) {
      field2640 = var1;
      double var3 = (double)(var0 >> 16) / 256.0D;
      double var5 = (double)(var0 >> 8 & 255) / 256.0D;
      double var7 = (double)(var0 & 255) / 256.0D;
      var3 = Math.pow(var3, var1);
      var5 = Math.pow(var5, var1);
      var7 = Math.pow(var7, var1);
      int var9 = (int)(var3 * 256.0D);
      int var10 = (int)(var5 * 256.0D);
      int var11 = (int)(var7 * 256.0D);
      return var11 + (var10 << 8) + (var9 << 16);
   }

   @ObfuscatedName("aq")
   public static double method4932() {
      return field2640;
   }

   @ObfuscatedName("ao")
   static int method4933() {
      return field2632.field3003;
   }

   @ObfuscatedName("as")
   static int method4946() {
      return field2632.field3008;
   }

   @ObfuscatedName("al")
   static int method4931() {
      return field2632.field3011;
   }

   @ObfuscatedName("au")
   static int method5010() {
      return field2632.field3012;
   }

   @ObfuscatedName("ai")
   static int method4935() {
      return field2632.field3014;
   }

   @ObfuscatedName("aa")
   static int method4937() {
      return field2632.field3013;
   }

   @ObfuscatedName("am")
   public static int method4938() {
      return field2632.field3005;
   }

   @ObfuscatedName("an")
   static int method4939() {
      return field2632.field2997;
   }

   @ObfuscatedName("ar")
   static boolean method4940() {
      return field2641.vmethod5713();
   }

   @ObfuscatedName("ae")
   public static void method4941(int[] var0, int var1, int var2, float[] var3) {
      if (var3 == null && field2641 == field2631) {
         field2641 = field2635;
      }

      field2641.method5054(var0, var1, var2, var3);
   }

   @ObfuscatedName("ay")
   public static void method4934() {
      method4943(class601.field5994, class601.field5992, class601.field5995, class601.field5993);
   }

   @ObfuscatedName("ad")
   static void method4943(int var0, int var1, int var2, int var3) {
      field2632.field2997 = var2 - var0;
      field2632.field3009 = var3 - var1;
      method5011();
      if (field2632.field3015.length < field2632.field3009) {
         field2632.field3015 = new int[class165.method4019(field2632.field3009)];
      }

      int var4 = var0 + class601.field5989 * var1;

      for(int var5 = 0; var5 < field2632.field3009; ++var5) {
         field2632.field3015[var5] = var4;
         var4 += class601.field5989;
      }

   }

   @ObfuscatedName("ag")
   public static void method5011() {
      field2632.method5695();
   }

   @ObfuscatedName("av")
   public static void method4981(int var0, int var1) {
      int var2 = field2632.field3015[0];
      int var3 = var2 / class601.field5989;
      int var4 = var2 - var3 * class601.field5989;
      field2632.method5694(var0, var4, var1, var3);
   }

   @ObfuscatedName("ah")
   public static void method4969(int var0, int var1, int var2) {
      field2632.method5697(var0, var1, var2);
   }

   @ObfuscatedName("ab")
   static void method4945(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      field2641.vmethod5712(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ObfuscatedName("ax")
   public static void method4948(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      field2641.vmethod5717(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   @ObfuscatedName("ak")
   static void method4949(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      field2641.vmethod5726(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   @ObfuscatedName("aj")
   static void method4950(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      field2641.vmethod5766(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   @ObfuscatedName("az")
   static void method5005(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      field2641.method5059(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   @ObfuscatedName("bt")
   static void method4952(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      field2641.method5055(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }
}
