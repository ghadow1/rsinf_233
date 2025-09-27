package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class338 {
   @ObfuscatedName("af")
   byte[] field3878;
   @ObfuscatedName("aw")
   byte[] field3879;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -604396665
   )
   int field3880;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1797189185
   )
   int field3881;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -43920705
   )
   int field3882;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1997906527
   )
   int field3883;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 897091501
   )
   int field3884;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1251752853
   )
   int field3886;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -299030179
   )
   int field3885;

   class338() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IB)Lia;",
      garbageValue = "10"
   )
   public static class210 method7103(int var0) {
      class210 var1 = (class210)class210.field2290.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class40.field277.method8335(32, var0);
         var1 = new class210();
         if (var2 != null) {
            var1.method4569(new class590(var2));
         }

         class210.field2290.method7009(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "([FIFZFZ[FB)I",
      garbageValue = "1"
   )
   public static int method7104(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var7 = 0.0F;

      for(int var8 = 0; var8 < var1 + 1; ++var8) {
         var7 += Math.abs(var0[var8]);
      }

      float var24 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class134.field1620;
      if (var7 <= var24) {
         return -1;
      } else {
         float[] var9 = new float[var1 + 1];

         int var10;
         for(var10 = 0; var10 < var1 + 1; ++var10) {
            var9[var10] = var0[var10] * (1.0F / var7);
         }

         while(Math.abs(var9[var1]) < var24) {
            --var1;
         }

         var10 = 0;
         if (var1 == 0) {
            return var10;
         } else if (var1 == 1) {
            var6[0] = -var9[0] / var9[1];
            boolean var22 = var3 ? var2 < var24 + var6[0] : var2 < var6[0] - var24;
            boolean var23 = var5 ? var4 > var6[0] - var24 : var4 > var6[0] + var24;
            var10 = var22 && var23 ? 1 : 0;
            if (var10 > 0) {
               if (var3 && var6[0] < var2) {
                  var6[0] = var2;
               } else if (var5 && var6[0] > var4) {
                  var6[0] = var4;
               }
            }

            return var10;
         } else {
            class456 var11 = new class456(var9, var1);
            float[] var12 = new float[var1 + 1];

            for(int var13 = 1; var13 <= var1; ++var13) {
               var12[var13 - 1] = (float)var13 * var9[var13];
            }

            float[] var21 = new float[var1 + 1];
            int var14 = method7104(var12, var1 - 1, var2, false, var4, false, var21);
            if (var14 == -1) {
               return 0;
            } else {
               boolean var15 = false;
               float var17 = 0.0F;
               float var18 = 0.0F;
               float var19 = 0.0F;

               for(int var20 = 0; var20 <= var14; ++var20) {
                  if (var10 > var1) {
                     return var10;
                  }

                  float var16;
                  if (var20 == 0) {
                     var16 = var2;
                     var18 = class445.method8902(var9, var1, var2);
                     if (Math.abs(var18) <= var24 && var3) {
                        var6[var10++] = var2;
                     }
                  } else {
                     var16 = var19;
                     var18 = var17;
                  }

                  if (var14 == var20) {
                     var19 = var4;
                     var15 = false;
                  } else {
                     var19 = var21[var20];
                  }

                  var17 = class445.method8902(var9, var1, var19);
                  if (var15) {
                     var15 = false;
                  } else if (Math.abs(var17) < var24) {
                     if (var14 != var20 || var5) {
                        var6[var10++] = var19;
                        var15 = true;
                     }
                  } else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
                     var6[var10++] = class171.method4084(var11, var16, var19, 0.0F);
                     if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var24) {
                        var6[var10 - 2] = (var6[var10 - 1] + var6[var10 - 2]) * 0.5F;
                        --var10;
                     }
                  }
               }

               return var10;
            }
         }
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-466963377"
   )
   public static boolean method7102(char var0) {
      if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
         return true;
      } else {
         if (var0 != 0) {
            char[] var1 = class443.field5142;

            for(int var2 = 0; var2 < var1.length; ++var2) {
               char var3 = var1[var2];
               if (var0 == var3) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @ObfuscatedName("nb")
   @ObfuscatedSignature(
      descriptor = "([Loi;IB)V",
      garbageValue = "66"
   )
   static final void method7105(class369[] var0, int var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         class369 var3 = var0[var2];
         if (var3 != null) {
            if (var3.field4147 == 0) {
               if (var3.field4286 != null) {
                  method7105(var3.field4286, var1);
               }

               if (var3.field4145 * -217986249 == -1) {
                  class64 var4 = (class64)client.field422.method8623((long)var3.field4144);
                  if (var4 != null) {
                     class142.method3730(var4.field888, var1);
                  }
               }
            }

            class65 var5;
            if (var1 == 0 && var3.field4268 != null) {
               var5 = new class65();
               var5.field893 = var3;
               var5.field898 = var3.field4268;
               class329.method7047(var5);
            }

            if (var1 == 1 && var3.field4269 != null) {
               if (var3.field4145 * -217986249 >= 0) {
                  class369 var6 = class119.field1554.method7476(var3.field4144);
                  if (var6 == null || var6.field4286 == null || var3.field4145 * -217986249 >= var6.field4286.length || var3 != var6.field4286[var3.field4145 * -217986249]) {
                     continue;
                  }
               }

               var5 = new class65();
               var5.field893 = var3;
               var5.field898 = var3.field4269;
               class329.method7047(var5);
            }
         }
      }

   }
}
