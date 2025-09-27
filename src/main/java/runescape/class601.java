package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xg")
public class class601 extends class540 {
   @ObfuscatedName("aj")
   public static int[] field5988;
   @ObfuscatedName("az")
   public static int field5989;
   @ObfuscatedName("bt")
   public static int field5990;
   @ObfuscatedName("bs")
   public static float[] field5987;
   @ObfuscatedName("bu")
   public static int field5992 = 0;
   @ObfuscatedName("bi")
   public static int field5993 = 0;
   @ObfuscatedName("bd")
   public static int field5994 = 0;
   @ObfuscatedName("ba")
   public static int field5995 = 0;

   protected class601() {
   }

   @ObfuscatedName("ed")
   protected static void method11548(int[] var0, int var1, int var2, float[] var3) {
      field5988 = var0;
      field5989 = var1;
      field5990 = var2;
      field5987 = var3;
      method11550(0, 0, var1, var2);
   }

   @ObfuscatedName("ep")
   public static void Rasterizer2D_resetClip() {
      field5994 = 0;
      field5992 = 0;
      field5995 = field5989;
      field5993 = field5990;
   }

   @ObfuscatedName("eq")
   public static void method11550(int var0, int var1, int var2, int var3) {
      if (var0 < 0) {
         var0 = 0;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > field5989) {
         var2 = field5989;
      }

      if (var3 > field5990) {
         var3 = field5990;
      }

      field5994 = var0;
      field5992 = var1;
      field5995 = var2;
      field5993 = var3;
   }

   @ObfuscatedName("eu")
   public static void method11551(int var0, int var1, int var2, int var3) {
      if (field5994 < var0) {
         field5994 = var0;
      }

      if (field5992 < var1) {
         field5992 = var1;
      }

      if (field5995 > var2) {
         field5995 = var2;
      }

      if (field5993 > var3) {
         field5993 = var3;
      }

   }

   @ObfuscatedName("el")
   public static void method11552(int[] var0) {
      var0[0] = field5994;
      var0[1] = field5992;
      var0[2] = field5995;
      var0[3] = field5993;
   }

   @ObfuscatedName("ey")
   public static void method11618(int[] var0) {
      field5994 = var0[0];
      field5992 = var0[1];
      field5995 = var0[2];
      field5993 = var0[3];
   }

   @ObfuscatedName("ea")
   public static void method11554() {
      int var0 = 0;

      int var1;
      for(var1 = field5989 * field5990 - 7; var0 < var1; field5988[var0++] = 0) {
         field5988[var0++] = 0;
         field5988[var0++] = 0;
         field5988[var0++] = 0;
         field5988[var0++] = 0;
         field5988[var0++] = 0;
         field5988[var0++] = 0;
         field5988[var0++] = 0;
      }

      for(var1 += 7; var0 < var1; field5988[var0++] = 0) {
      }

      method11571();
   }

   @ObfuscatedName("ej")
   static void method11555(int var0, int var1, int var2, int var3) {
      if (var2 == 0) {
         method11569(var0, var1, var3);
      } else {
         if (var2 < 0) {
            var2 = -var2;
         }

         int var4 = var1 - var2;
         if (var4 < field5992) {
            var4 = field5992;
         }

         int var5 = var2 + var1 + 1;
         if (var5 > field5993) {
            var5 = field5993;
         }

         int var6 = var4;
         int var7 = var2 * var2;
         int var8 = 0;
         int var9 = var1 - var4;
         int var10 = var9 * var9;
         int var11 = var10 - var9;
         if (var1 > var5) {
            var1 = var5;
         }

         int var12;
         int var13;
         int var14;
         int var15;
         while(var6 < var1) {
            while(var11 <= var7 || var10 <= var7) {
               var10 = var10 + var8 + var8;
               var11 += var8++ + var8;
            }

            var12 = var0 - var8 + 1;
            if (var12 < field5994) {
               var12 = field5994;
            }

            var13 = var0 + var8;
            if (var13 > field5995) {
               var13 = field5995;
            }

            var14 = var12 + var6 * field5989;

            for(var15 = var12; var15 < var13; ++var15) {
               field5988[var14++] = var3;
            }

            ++var6;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
         }

         var8 = var2;
         var9 = var6 - var1;
         var11 = var7 + var9 * var9;
         var10 = var11 - var2;

         for(var11 -= var9; var6 < var5; var10 += var9++ + var9) {
            while(var11 > var7 && var10 > var7) {
               var11 -= var8-- + var8;
               var10 -= var8 + var8;
            }

            var12 = var0 - var8;
            if (var12 < field5994) {
               var12 = field5994;
            }

            var13 = var0 + var8;
            if (var13 > field5995 - 1) {
               var13 = field5995 - 1;
            }

            var14 = var12 + var6 * field5989;

            for(var15 = var12; var15 <= var13; ++var15) {
               field5988[var14++] = var3;
            }

            ++var6;
            var11 = var11 + var9 + var9;
         }

      }
   }

   @ObfuscatedName("ei")
   public static void method11624(int var0, int var1, int var2, int var3, int var4) {
      if (var4 != 0) {
         if (var4 == 256) {
            method11555(var0, var1, var2, var3);
         } else {
            if (var2 < 0) {
               var2 = -var2;
            }

            int var5 = 256 - var4;
            int var6 = (var3 >> 16 & 255) * var4;
            int var7 = (var3 >> 8 & 255) * var4;
            int var8 = var4 * (var3 & 255);
            int var12 = var1 - var2;
            if (var12 < field5992) {
               var12 = field5992;
            }

            int var13 = var2 + var1 + 1;
            if (var13 > field5993) {
               var13 = field5993;
            }

            int var14 = var12;
            int var15 = var2 * var2;
            int var16 = 0;
            int var17 = var1 - var12;
            int var18 = var17 * var17;
            int var19 = var18 - var17;
            if (var1 > var13) {
               var1 = var13;
            }

            int var9;
            int var10;
            int var11;
            int var20;
            int var21;
            int var22;
            int var23;
            int var24;
            while(var14 < var1) {
               while(var19 <= var15 || var18 <= var15) {
                  var18 = var18 + var16 + var16;
                  var19 += var16++ + var16;
               }

               var20 = var0 - var16 + 1;
               if (var20 < field5994) {
                  var20 = field5994;
               }

               var21 = var0 + var16;
               if (var21 > field5995) {
                  var21 = field5995;
               }

               var22 = var20 + var14 * field5989;

               for(var23 = var20; var23 < var21; ++var23) {
                  var9 = var5 * (field5988[var22] >> 16 & 255);
                  var10 = (field5988[var22] >> 8 & 255) * var5;
                  var11 = var5 * (field5988[var22] & 255);
                  var24 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
                  field5988[var22++] = var24;
               }

               ++var14;
               var18 -= var17-- + var17;
               var19 -= var17 + var17;
            }

            var16 = var2;
            var17 = -var17;
            var19 = var15 + var17 * var17;
            var18 = var19 - var2;

            for(var19 -= var17; var14 < var13; var18 += var17++ + var17) {
               while(var19 > var15 && var18 > var15) {
                  var19 -= var16-- + var16;
                  var18 -= var16 + var16;
               }

               var20 = var0 - var16;
               if (var20 < field5994) {
                  var20 = field5994;
               }

               var21 = var0 + var16;
               if (var21 > field5995 - 1) {
                  var21 = field5995 - 1;
               }

               var22 = var20 + var14 * field5989;

               for(var23 = var20; var23 <= var21; ++var23) {
                  var9 = var5 * (field5988[var22] >> 16 & 255);
                  var10 = (field5988[var22] >> 8 & 255) * var5;
                  var11 = var5 * (field5988[var22] & 255);
                  var24 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
                  field5988[var22++] = var24;
               }

               ++var14;
               var19 = var19 + var17 + var17;
            }

         }
      }
   }

   @ObfuscatedName("ee")
   public static void Rasterizer2D_fillRectangleAlpha(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 < field5994) {
         var2 -= field5994 - var0;
         var0 = field5994;
      }

      if (var1 < field5992) {
         var3 -= field5992 - var1;
         var1 = field5992;
      }

      if (var0 + var2 > field5995) {
         var2 = field5995 - var0;
      }

      if (var3 + var1 > field5993) {
         var3 = field5993 - var1;
      }

      var4 = (var5 * (var4 & 16711935) >> 8 & 16711935) + (var5 * (var4 & '\uff00') >> 8 & '\uff00');
      int var6 = 256 - var5;
      int var7 = field5989 - var2;
      int var8 = var0 + field5989 * var1;

      for(int var9 = 0; var9 < var3; ++var9) {
         for(int var10 = -var2; var10 < 0; ++var10) {
            int var11 = field5988[var8];
            var11 = ((var11 & 16711935) * var6 >> 8 & 16711935) + (var6 * (var11 & '\uff00') >> 8 & '\uff00');
            field5988[var8++] = var11 + var4;
         }

         var8 += var7;
      }

   }

   @ObfuscatedName("ex")
   public static void method11558(int var0, int var1, int var2, int var3, int var4) {
      if (var0 < field5994) {
         var2 -= field5994 - var0;
         var0 = field5994;
      }

      if (var1 < field5992) {
         var3 -= field5992 - var1;
         var1 = field5992;
      }

      if (var0 + var2 > field5995) {
         var2 = field5995 - var0;
      }

      if (var3 + var1 > field5993) {
         var3 = field5993 - var1;
      }

      int var5 = field5989 - var2;
      int var6 = var0 + field5989 * var1;

      for(int var7 = -var3; var7 < 0; ++var7) {
         for(int var8 = -var2; var8 < 0; ++var8) {
            field5988[var6++] = var4;
         }

         var6 += var5;
      }

   }

   @ObfuscatedName("em")
   public static void method11559(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var2 > 0 && var3 > 0) {
         int var6 = 0;
         int var7 = 65536 / var3;
         if (var0 < field5994) {
            var2 -= field5994 - var0;
            var0 = field5994;
         }

         if (var1 < field5992) {
            var6 += (field5992 - var1) * var7;
            var3 -= field5992 - var1;
            var1 = field5992;
         }

         if (var0 + var2 > field5995) {
            var2 = field5995 - var0;
         }

         if (var3 + var1 > field5993) {
            var3 = field5993 - var1;
         }

         int var8 = field5989 - var2;
         int var9 = var0 + field5989 * var1;

         for(int var10 = -var3; var10 < 0; ++var10) {
            int var11 = 65536 - var6 >> 8;
            int var12 = var6 >> 8;
            int var13 = (var12 * (var5 & 16711935) + var11 * (var4 & 16711935) & -16711936) + (var12 * (var5 & '\uff00') + var11 * (var4 & '\uff00') & 16711680) >>> 8;

            for(int var14 = -var2; var14 < 0; ++var14) {
               field5988[var9++] = var13;
            }

            var9 += var8;
            var6 += var7;
         }

      }
   }

   @ObfuscatedName("et")
   public static void method11560(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var2 > 0 && var3 > 0) {
         int var8 = 0;
         int var9 = 65536 / var3;
         if (var0 < field5994) {
            var2 -= field5994 - var0;
            var0 = field5994;
         }

         if (var1 < field5992) {
            var8 += (field5992 - var1) * var9;
            var3 -= field5992 - var1;
            var1 = field5992;
         }

         if (var0 + var2 > field5995) {
            var2 = field5995 - var0;
         }

         if (var3 + var1 > field5993) {
            var3 = field5993 - var1;
         }

         int var10 = field5989 - var2;
         int var11 = var0 + field5989 * var1;

         for(int var12 = -var3; var12 < 0; ++var12) {
            int var13 = 65536 - var8 >> 8;
            int var14 = var8 >> 8;
            int var15 = (var13 * var6 + var14 * var7 & '\uff00') >>> 8;
            if (var15 == 0) {
               var11 += field5989;
               var8 += var9;
            } else {
               int var16 = (var14 * (var5 & 16711935) + var13 * (var4 & 16711935) & -16711936) + (var14 * (var5 & '\uff00') + var13 * (var4 & '\uff00') & 16711680) >>> 8;
               int var17 = 255 - var15;
               int var18 = ((var16 & 16711935) * var15 >> 8 & 16711935) + (var15 * (var16 & '\uff00') >> 8 & '\uff00');

               for(int var19 = -var2; var19 < 0; ++var19) {
                  int var20 = field5988[var11];
                  if (var20 == 0) {
                     field5988[var11++] = var18;
                  } else {
                     var20 = ((var20 & 16711935) * var17 >> 8 & 16711935) + (var17 * (var20 & '\uff00') >> 8 & '\uff00');
                     field5988[var11++] = var18 + var20;
                  }
               }

               var11 += var10;
               var8 += var9;
            }
         }

      }
   }

   @ObfuscatedName("eh")
   @ObfuscatedSignature(
      descriptor = "(IIIIII[BIZ)V",
      garbageValue = "1"
   )
   public static void method11606(int var0, int var1, int var2, int var3, int var4, int var5, byte[] var6, int var7) {
      if (var0 + var2 >= 0 && var3 + var1 >= 0) {
         if (var0 < field5989 && var1 < field5990) {
            int var8 = 0;
            int var9 = 0;
            if (var0 < 0) {
               var8 -= var0;
               var2 += var0;
            }

            if (var1 < 0) {
               var9 -= var1;
               var3 += var1;
            }

            if (var0 + var2 > field5989) {
               var2 = field5989 - var0;
            }

            if (var3 + var1 > field5990) {
               var3 = field5990 - var1;
            }

            int var10 = var6.length / var7;
            int var11 = field5989 - var2;
            int var12 = var4 >>> 24;
            int var13 = var5 >>> 24;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            if (var12 == 255 && var13 == 255) {
               var14 = var0 + var8 + (var9 + var1) * field5989;

               for(var15 = var9 + var1; var15 < var3 + var9 + var1; ++var15) {
                  for(var16 = var0 + var8; var16 < var0 + var8 + var2; ++var16) {
                     var17 = (var15 - var1) % var10;
                     var18 = (var16 - var0) % var7;
                     if (var6[var18 + var17 * var7] != 0) {
                        field5988[var14++] = var5;
                     } else {
                        field5988[var14++] = var4;
                     }
                  }

                  var14 += var11;
               }
            } else {
               var14 = var0 + var8 + (var9 + var1) * field5989;

               for(var15 = var9 + var1; var15 < var3 + var9 + var1; ++var15) {
                  for(var16 = var0 + var8; var16 < var0 + var8 + var2; ++var16) {
                     var17 = (var15 - var1) % var10;
                     var18 = (var16 - var0) % var7;
                     int var19 = var4;
                     if (var6[var18 + var17 * var7] != 0) {
                        var19 = var5;
                     }

                     int var20 = var19 >>> 24;
                     int var21 = 255 - var20;
                     int var22 = field5988[var14];
                     int var23 = ((var19 & 16711935) * var20 + (var22 & 16711935) * var21 & -16711936) + (var20 * (var19 & '\uff00') + var21 * (var22 & '\uff00') & 16711680) >> 8;
                     field5988[var14++] = var23;
                  }

                  var14 += var11;
               }
            }

         }
      }
   }

   @ObfuscatedName("ev")
   public static void method11562(int var0, int var1, int var2, int var3, int var4) {
      method11561(var0, var1, var2, var4);
      method11561(var0, var3 + var1 - 1, var2, var4);
      method11566(var0, var1, var3, var4);
      method11566(var0 + var2 - 1, var1, var3, var4);
   }

   @ObfuscatedName("fv")
   public static void method11612(int var0, int var1, int var2, int var3, int var4, int var5) {
      method11565(var0, var1, var2, var4, var5);
      method11565(var0, var3 + var1 - 1, var2, var4, var5);
      if (var3 >= 3) {
         method11567(var0, var1 + 1, var3 - 2, var4, var5);
         method11567(var0 + var2 - 1, var1 + 1, var3 - 2, var4, var5);
      }

   }

   @ObfuscatedName("fq")
   public static void method11561(int var0, int var1, int var2, int var3) {
      if (var1 >= field5992 && var1 < field5993) {
         if (var0 < field5994) {
            var2 -= field5994 - var0;
            var0 = field5994;
         }

         if (var0 + var2 > field5995) {
            var2 = field5995 - var0;
         }

         int var4 = var0 + field5989 * var1;

         for(int var5 = 0; var5 < var2; ++var5) {
            field5988[var4 + var5] = var3;
         }

      }
   }

   @ObfuscatedName("fi")
   static void method11565(int var0, int var1, int var2, int var3, int var4) {
      if (var1 >= field5992 && var1 < field5993) {
         if (var0 < field5994) {
            var2 -= field5994 - var0;
            var0 = field5994;
         }

         if (var0 + var2 > field5995) {
            var2 = field5995 - var0;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = var4 * (var3 & 255);
         int var12 = var0 + field5989 * var1;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = var5 * (field5988[var12] >> 16 & 255);
            int var10 = (field5988[var12] >> 8 & 255) * var5;
            int var11 = var5 * (field5988[var12] & 255);
            int var14 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
            field5988[var12++] = var14;
         }

      }
   }

   @ObfuscatedName("fd")
   public static void method11566(int var0, int var1, int var2, int var3) {
      if (var0 >= field5994 && var0 < field5995) {
         if (var1 < field5992) {
            var2 -= field5992 - var1;
            var1 = field5992;
         }

         if (var2 + var1 > field5993) {
            var2 = field5993 - var1;
         }

         int var4 = var0 + field5989 * var1;

         for(int var5 = 0; var5 < var2; ++var5) {
            field5988[var4 + var5 * field5989] = var3;
         }

      }
   }

   @ObfuscatedName("ft")
   static void method11567(int var0, int var1, int var2, int var3, int var4) {
      if (var0 >= field5994 && var0 < field5995) {
         if (var1 < field5992) {
            var2 -= field5992 - var1;
            var1 = field5992;
         }

         if (var2 + var1 > field5993) {
            var2 = field5993 - var1;
         }

         int var5 = 256 - var4;
         int var6 = (var3 >> 16 & 255) * var4;
         int var7 = (var3 >> 8 & 255) * var4;
         int var8 = var4 * (var3 & 255);
         int var12 = var0 + field5989 * var1;

         for(int var13 = 0; var13 < var2; ++var13) {
            int var9 = var5 * (field5988[var12] >> 16 & 255);
            int var10 = (field5988[var12] >> 8 & 255) * var5;
            int var11 = var5 * (field5988[var12] & 255);
            int var14 = (var8 + var11 >> 8) + (var6 + var9 >> 8 << 16) + (var7 + var10 >> 8 << 8);
            field5988[var12] = var14;
            var12 += field5989;
         }

      }
   }

   @ObfuscatedName("fa")
   public static void method11563(int var0, int var1, int var2, int var3, int var4) {
      var2 -= var0;
      var3 -= var1;
      if (var3 == 0) {
         if (var2 >= 0) {
            method11561(var0, var1, var2 + 1, var4);
         } else {
            method11561(var0 + var2, var1, -var2 + 1, var4);
         }

      } else if (var2 == 0) {
         if (var3 >= 0) {
            method11566(var0, var1, var3 + 1, var4);
         } else {
            method11566(var0, var3 + var1, -var3 + 1, var4);
         }

      } else {
         if (var3 + var2 < 0) {
            var0 += var2;
            var2 = -var2;
            var1 += var3;
            var3 = -var3;
         }

         int var5;
         int var6;
         if (var2 > var3) {
            var1 <<= 16;
            var1 += 32768;
            var3 <<= 16;
            var5 = (int)Math.floor((double)var3 / (double)var2 + 0.5D);
            var2 += var0;
            if (var0 < field5994) {
               var1 += var5 * (field5994 - var0);
               var0 = field5994;
            }

            if (var2 >= field5995) {
               var2 = field5995 - 1;
            }

            while(var0 <= var2) {
               var6 = var1 >> 16;
               if (var6 >= field5992 && var6 < field5993) {
                  field5988[var0 + var6 * field5989] = var4;
               }

               var1 += var5;
               ++var0;
            }
         } else {
            var0 <<= 16;
            var0 += 32768;
            var2 <<= 16;
            var5 = (int)Math.floor((double)var2 / (double)var3 + 0.5D);
            var3 += var1;
            if (var1 < field5992) {
               var0 += (field5992 - var1) * var5;
               var1 = field5992;
            }

            if (var3 >= field5993) {
               var3 = field5993 - 1;
            }

            while(var1 <= var3) {
               var6 = var0 >> 16;
               if (var6 >= field5994 && var6 < field5995) {
                  field5988[var6 + field5989 * var1] = var4;
               }

               var0 += var5;
               ++var1;
            }
         }

      }
   }

   @ObfuscatedName("fs")
   static void method11569(int var0, int var1, int var2) {
      if (var0 >= field5994 && var1 >= field5992 && var0 < field5995 && var1 < field5993) {
         field5988[var0 + field5989 * var1] = var2;
      }
   }

   @ObfuscatedName("fy")
   public static void method11570(int var0, int var1, int var2, int[] var3, int[] var4) {
      int var5 = var0 + field5989 * var1;

      for(var1 = 0; var1 < var3.length; ++var1) {
         int var6 = var5 + var3[var1];

         for(var0 = -var4[var1]; var0 < 0; ++var0) {
            field5988[var6++] = var2;
         }

         var5 += field5989;
      }

   }

   @ObfuscatedName("ff")
   public static void method11571() {
      if (field5987 != null) {
         int var0;
         int var1;
         int var2;
         if (field5994 == 0 && field5995 == field5989 && field5992 == 0 && field5993 == field5990) {
            var0 = field5987.length;
            var1 = var0 - (var0 & 7);

            for(var2 = 0; var2 < var1; field5987[var2++] = 0.0F) {
               field5987[var2++] = 0.0F;
               field5987[var2++] = 0.0F;
               field5987[var2++] = 0.0F;
               field5987[var2++] = 0.0F;
               field5987[var2++] = 0.0F;
               field5987[var2++] = 0.0F;
               field5987[var2++] = 0.0F;
            }

            while(var2 < var0) {
               field5987[var2++] = 0.0F;
            }
         } else {
            var0 = field5995 - field5994;
            var1 = field5993 - field5992;
            var2 = field5989 - var0;
            int var3 = field5992 * field5989 + field5994;
            int var4 = var0 >> 3;
            int var5 = var0 & 7;
            var0 = var3 - 1;

            for(int var7 = -var1; var7 < 0; ++var7) {
               int var6;
               if (var4 > 0) {
                  var6 = var4;

                  do {
                     ++var0;
                     field5987[var0] = 0.0F;
                     ++var0;
                     field5987[var0] = 0.0F;
                     ++var0;
                     field5987[var0] = 0.0F;
                     ++var0;
                     field5987[var0] = 0.0F;
                     ++var0;
                     field5987[var0] = 0.0F;
                     ++var0;
                     field5987[var0] = 0.0F;
                     ++var0;
                     field5987[var0] = 0.0F;
                     ++var0;
                     field5987[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               if (var5 > 0) {
                  var6 = var5;

                  do {
                     ++var0;
                     field5987[var0] = 0.0F;
                     --var6;
                  } while(var6 > 0);
               }

               var0 += var2;
            }
         }

      }
   }

   @ObfuscatedName("fe")
   public static void method11607() {
      if (field5987 != null) {
         int var0 = field5987.length;

         for(int var1 = 0; var1 < var0; ++var1) {
            if (var1 % field5989 < field5989 / 2 && field5987[var1] > 0.0F) {
               float var3 = field5987[var1];
               float var4 = 150.75377F / (var3 - 1.0100503F);
               float var2 = var4 / 14925.0F / 1.0100503F;
               int var5 = (int)(255.0F * var2);
               field5988[var1] = var5 << 16 | var5 << 8 | var5;
            }
         }

      }
   }
}
