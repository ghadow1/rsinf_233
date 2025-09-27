package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
public class class101 {
   @ObfuscatedName("af")
   int field1379;
   @ObfuscatedName("aw")
   int field1385;
   @ObfuscatedName("at")
   int field1381;
   @ObfuscatedName("ac")
   int field1382;
   @ObfuscatedName("ap")
   int field1380;
   @ObfuscatedName("aq")
   int field1384;
   @ObfuscatedName("ao")
   int[] field1383;

   @ObfuscatedSignature(
      descriptor = "(Led;)V"
   )
   class101(class115 var1) {
      this.field1379 = var1.method3467(16);
      this.field1385 = var1.method3467(24);
      this.field1381 = var1.method3467(24);
      this.field1382 = var1.method3467(24) + 1;
      this.field1380 = var1.method3467(6) + 1;
      this.field1384 = var1.method3467(8);
      int[] var2 = new int[this.field1380];

      int var3;
      for(var3 = 0; var3 < this.field1380; ++var3) {
         int var4 = 0;
         int var5 = var1.method3467(3);
         boolean var6 = var1.method3465() != 0;
         if (var6) {
            var4 = var1.method3467(5);
         }

         var2[var3] = var4 << 3 | var5;
      }

      this.field1383 = new int[this.field1380 * 8];

      for(var3 = 0; var3 < this.field1380 * 8; ++var3) {
         this.field1383[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.method3467(8) : -1;
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "([FIZLed;[Leb;)V"
   )
   void method3146(float[] var1, int var2, boolean var3, class115 var4, class107[] var5) {
      int var6;
      for(var6 = 0; var6 < var2; ++var6) {
         var1[var6] = 0.0F;
      }

      if (!var3) {
         var6 = var5[this.field1384].field1418;
         int var7 = this.field1381 - this.field1385;
         int var8 = var7 / this.field1382;
         int[] var9 = new int[var8];

         for(int var10 = 0; var10 < 8; ++var10) {
            int var11 = 0;

            while(var11 < var8) {
               int var12;
               int var13;
               if (var10 == 0) {
                  var12 = var5[this.field1384].method3359(var4);

                  for(var13 = var6 - 1; var13 >= 0; --var13) {
                     if (var11 + var13 < var8) {
                        var9[var11 + var13] = var12 % this.field1380;
                     }

                     var12 /= this.field1380;
                  }
               }

               for(var12 = 0; var12 < var6; ++var12) {
                  var13 = var9[var11];
                  int var14 = this.field1383[var10 + var13 * 8];
                  if (var14 >= 0) {
                     int var15 = var11 * this.field1382 + this.field1385;
                     class107 var16 = var5[var14];
                     int var17;
                     if (this.field1379 == 0) {
                        var17 = this.field1382 / var16.field1418;

                        for(int var21 = 0; var21 < var17; ++var21) {
                           float[] var22 = var16.method3363(var4);

                           for(int var20 = 0; var20 < var16.field1418; ++var20) {
                              var1[var15 + var21 + var20 * var17] += var22[var20];
                           }
                        }
                     } else {
                        var17 = 0;

                        while(var17 < this.field1382) {
                           float[] var18 = var16.method3363(var4);

                           for(int var19 = 0; var19 < var16.field1418; ++var19) {
                              var1[var15 + var17] += var18[var19];
                              ++var17;
                           }
                        }
                     }
                  }

                  ++var11;
                  if (var11 >= var8) {
                     break;
                  }
               }
            }
         }

      }
   }
}
