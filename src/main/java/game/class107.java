package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class class107 {
   @ObfuscatedName("af")
   int field1418;
   @ObfuscatedName("aw")
   int field1420;
   @ObfuscatedName("at")
   int[] field1423;
   @ObfuscatedName("ac")
   int[] field1421;
   @ObfuscatedName("ap")
   float[][] field1422;
   @ObfuscatedName("aq")
   int[] field1419;

   @ObfuscatedSignature(
      descriptor = "(Led;)V"
   )
   class107(class115 var1) {
      var1.method3467(24);
      this.field1418 = var1.method3467(16);
      this.field1420 = var1.method3467(24);
      this.field1423 = new int[this.field1420];
      boolean var2 = var1.method3465() != 0;
      int var3;
      int var4;
      int var6;
      if (var2) {
         var3 = 0;

         for(var4 = var1.method3467(5) + 1; var3 < this.field1420; ++var4) {
            int var5 = var1.method3467(class511.method10164(this.field1420 - var3));

            for(var6 = 0; var6 < var5; ++var6) {
               this.field1423[var3++] = var4;
            }
         }
      } else {
         boolean var15 = var1.method3465() != 0;

         for(var4 = 0; var4 < this.field1420; ++var4) {
            if (var15 && var1.method3465() == 0) {
               this.field1423[var4] = 0;
            } else {
               this.field1423[var4] = var1.method3467(5) + 1;
            }
         }
      }

      this.method3358();
      var3 = var1.method3467(4);
      if (var3 > 0) {
         float var16 = class110.method3401(var1.method3467(32));
         float var17 = class110.method3401(var1.method3467(32));
         var6 = var1.method3467(4) + 1;
         boolean var7 = var1.method3465() != 0;
         int var8;
         if (var3 == 1) {
            var8 = method3357(this.field1420, this.field1418);
         } else {
            var8 = this.field1420 * this.field1418;
         }

         this.field1421 = new int[var8];

         int var9;
         for(var9 = 0; var9 < var8; ++var9) {
            this.field1421[var9] = var1.method3467(var6);
         }

         this.field1422 = new float[this.field1420][this.field1418];
         float var10;
         int var11;
         int var12;
         if (var3 == 1) {
            for(var9 = 0; var9 < this.field1420; ++var9) {
               var10 = 0.0F;
               var11 = 1;

               for(var12 = 0; var12 < this.field1418; ++var12) {
                  int var13 = var9 / var11 % var8;
                  float var14 = (float)this.field1421[var13] * var17 + var16 + var10;
                  this.field1422[var9][var12] = var14;
                  if (var7) {
                     var10 = var14;
                  }

                  var11 *= var8;
               }
            }
         } else {
            for(var9 = 0; var9 < this.field1420; ++var9) {
               var10 = 0.0F;
               var11 = var9 * this.field1418;

               for(var12 = 0; var12 < this.field1418; ++var12) {
                  float var18 = (float)this.field1421[var11] * var17 + var16 + var10;
                  this.field1422[var9][var12] = var18;
                  if (var7) {
                     var10 = var18;
                  }

                  ++var11;
               }
            }
         }
      }

   }

   @ObfuscatedName("aw")
   void method3358() {
      int[] var1 = new int[this.field1420];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.field1420; ++var3) {
         var4 = this.field1423[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var12;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var12 = var2[var8];
                  if (var12 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if ((var12 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var12 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var12 = var2[var8];
               if (var12 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.field1419 = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.field1420; ++var3) {
         var4 = this.field1423[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.field1419[var6] == 0) {
                     this.field1419[var6] = var11;
                  }

                  var6 = this.field1419[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.field1419.length) {
                  int[] var9 = new int[this.field1419.length * 2];

                  for(var10 = 0; var10 < this.field1419.length; ++var10) {
                     var9[var10] = this.field1419[var10];
                  }

                  this.field1419 = var9;
               }

               var8 >>>= 1;
            }

            this.field1419[var6] = ~var3;
            if (var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Led;)I"
   )
   int method3359(class115 var1) {
      int var2;
      for(var2 = 0; this.field1419[var2] >= 0; var2 = var1.method3465() != 0 ? this.field1419[var2] : var2 + 1) {
      }

      return ~this.field1419[var2];
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Led;)[F"
   )
   float[] method3363(class115 var1) {
      return this.field1422[this.method3359(var1)];
   }

   @ObfuscatedName("af")
   static int method3357(int var0, int var1) {
      int var2;
      for(var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; class145.method3751(var2, var1) > var0; --var2) {
      }

      return var2;
   }
}
