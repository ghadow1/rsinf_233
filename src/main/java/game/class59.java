package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
public final class class59 {
   @ObfuscatedName("ac")
   static final int[] field839 = new int[]{1, 2, 4, 8};
   @ObfuscatedName("ap")
   static final int[] field840 = new int[]{16, 32, 64, 128};
   @ObfuscatedName("aq")
   static final int[] field841 = new int[]{1, 0, -1, 0};
   @ObfuscatedName("ao")
   static final int[] field843 = new int[]{0, -1, 0, 1};
   @ObfuscatedName("as")
   static final int[] field851 = new int[]{1, -1, -1, 1};
   @ObfuscatedName("al")
   static final int[] field838 = new int[]{-1, -1, 1, 1};
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1996777565
   )
   static int field842 = 99;
   @ObfuscatedName("aa")
   static short[][][] field846;
   @ObfuscatedName("am")
   static byte[][][] field847;
   @ObfuscatedName("an")
   static byte[][][] field848;
   @ObfuscatedName("ar")
   static byte[][][] field849;
   @ObfuscatedName("ag")
   static int[] field844;
   @ObfuscatedName("av")
   static int[] field850;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 1767658815
   )
   static int field852 = (int)(Math.random() * 17.0D) - 8;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 2134811767
   )
   static int field853 = (int)(Math.random() * 33.0D) - 16;

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Loi;IZLcg;I)V",
      garbageValue = "-851479729"
   )
   static void method2081(class369 var0, int var1, boolean var2, class55 var3) {
      if (var0.field4286 == null) {
         var0.field4286 = new class369[var1 + 1];
      }

      if (var0.field4286.length <= var1) {
         class369[] var4 = new class369[var1 + 1];
         System.arraycopy(var0.field4286, 0, var4, 0, var0.field4286.length);
         var0.field4286 = var4;
      } else {
         class369 var5 = var0.field4286[var1];
         if (var5 != null) {
            if (var2) {
               throw new RuntimeException("");
            }

            class296.method6771(var5, var0);
         }
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Ldr;[BIIIIIII)V"
   )
   static final void method2034(class79 var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class590 var9 = new class590(var1);
      int var10 = -1;

      while(true) {
         int var11 = var9.method11214();
         if (var11 == 0) {
            return;
         }

         var10 += var11;
         int var12 = 0;

         while(true) {
            int var13 = var9.method11212();
            if (var13 == 0) {
               break;
            }

            var12 += var13 - 1;
            int var14 = var12 & 63;
            int var15 = var12 >> 6 & 63;
            int var16 = var12 >> 12;
            int var17 = var9.method11196();
            int var18 = var17 >> 2;
            int var19 = var17 & 3;
            if (var5 == var16 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < var7 + 8) {
               class212 var20 = class433.method8669(var10);
               int var23 = var15 & 7;
               int var24 = var14 & 7;
               int var26 = var20.field2329;
               int var27 = var20.field2330;
               int var28;
               if ((var19 & 1) == 1) {
                  var28 = var26;
                  var26 = var27;
                  var27 = var28;
               }

               int var25 = var8 & 3;
               int var22;
               if (var25 == 0) {
                  var22 = var23;
               } else if (var25 == 1) {
                  var22 = var24;
               } else if (var25 == 2) {
                  var22 = 7 - var23 - (var26 - 1);
               } else {
                  var22 = 7 - var24 - (var27 - 1);
               }

               var28 = var22 + var3;
               int var31 = var15 & 7;
               int var32 = var14 & 7;
               int var34 = var20.field2329;
               int var35 = var20.field2330;
               int var36;
               if ((var19 & 1) == 1) {
                  var36 = var34;
                  var34 = var35;
                  var35 = var36;
               }

               int var33 = var8 & 3;
               int var30;
               if (var33 == 0) {
                  var30 = var32;
               } else if (var33 == 1) {
                  var30 = 7 - var31 - (var34 - 1);
               } else if (var33 == 2) {
                  var30 = 7 - var32 - (var35 - 1);
               } else {
                  var30 = var31;
               }

               var36 = var4 + var30;
               if (var28 > 0 && var36 > 0 && var28 < var0.field1162 - 1 && var36 < var0.field1163 - 1) {
                  int var37 = var2;
                  if ((var0.field1168[1][var28][var36] & 2) == 2) {
                     var37 = var2 - 1;
                  }

                  class275 var38 = null;
                  if (var37 >= 0 && var0.field1175 != null) {
                     var38 = var0.field1175[var37];
                  }

                  class177.method4152(var0, var2, var28, var36, var10, var19 + var8 & 3, var18, var38);
               }
            }
         }
      }
   }

   @ObfuscatedName("kl")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1842616526"
   )
   static final void method2066() {
      for(class74 var0 = (class74)class333.field3836.field1158.method8690(); var0 != null; var0 = (class74)class333.field3836.field1158.method8692()) {
         if (var0.field1032 == -1) {
            var0.field1031 = 0;
            class108.method3388(class333.field3836, var0);
         } else {
            var0.vmethod10557();
         }
      }

   }
}
