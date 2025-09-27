package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("we")
public final class class593 {
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lwy;"
   )
   static class592 field5968 = new class592();

   @ObfuscatedName("af")
   public static int method11477(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      synchronized(field5968) {
         field5968.field5942 = var2;
         field5968.field5932 = var4;
         field5968.field5958 = var0;
         field5968.field5935 = 0;
         field5968.field5936 = var1;
         field5968.field5925 = 0;
         field5968.field5954 = 0;
         field5968.field5933 = 0;
         field5968.field5937 = 0;
         method11479(field5968);
         var1 -= field5968.field5936;
         field5968.field5942 = null;
         field5968.field5958 = null;
         return var1;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lwy;)V"
   )
   static void method11478(class592 var0) {
      byte var2 = var0.field5938;
      int var3 = var0.field5939;
      int var4 = var0.field5947;
      int var5 = var0.field5945;
      int[] var6 = class409.field4911;
      int var7 = var0.field5944;
      byte[] var8 = var0.field5958;
      int var9 = var0.field5935;
      int var10 = var0.field5936;
      int var12 = var0.field5960 + 1;

      label73:
      while(true) {
         if (var3 > 0) {
            while(true) {
               if (var10 == 0) {
                  break label73;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label73;
                  }

                  var8[var9] = var2;
                  ++var9;
                  --var10;
                  break;
               }

               var8[var9] = var2;
               --var3;
               ++var9;
               --var10;
            }
         }

         while(var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            ++var4;
            if (var1 != var5) {
               var5 = var1;
               if (var10 == 0) {
                  var3 = 1;
                  break label73;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            } else {
               if (var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  ++var4;
                  if (var4 != var12) {
                     if (var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        ++var4;
                        if (var4 != var12) {
                           if (var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                           }
                        }
                     }
                  }
                  continue label73;
               }

               if (var10 == 0) {
                  var3 = 1;
                  break label73;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.field5937;
      var0.field5937 += var10 - var10;
      if (var0.field5937 < var13) {
      }

      var0.field5938 = var2;
      var0.field5939 = var3;
      var0.field5947 = var4;
      var0.field5945 = var5;
      class409.field4911 = var6;
      var0.field5944 = var7;
      var0.field5958 = var8;
      var0.field5935 = var9;
      var0.field5936 = var10;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lwy;)V"
   )
   static void method11479(class592 var0) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.field5940 = 1410065408;
      if (class409.field4911 == null) {
         class409.field4911 = new int[500000];
      }

      boolean var26 = true;

      while(true) {
         while(var26) {
            byte var1 = method11480(var0);
            if (var1 == 23) {
               return;
            }

            var1 = method11480(var0);
            var1 = method11480(var0);
            var1 = method11480(var0);
            var1 = method11480(var0);
            var1 = method11480(var0);
            var1 = method11480(var0);
            var1 = method11480(var0);
            var1 = method11480(var0);
            var1 = method11480(var0);
            var1 = method11481(var0);
            if (var1 != 0) {
            }

            var0.field5923 = 0;
            var1 = method11480(var0);
            var0.field5923 = var0.field5923 << 8 | var1 & 255;
            var1 = method11480(var0);
            var0.field5923 = var0.field5923 << 8 | var1 & 255;
            var1 = method11480(var0);
            var0.field5923 = var0.field5923 << 8 | var1 & 255;

            int var36;
            for(var36 = 0; var36 < 16; ++var36) {
               var1 = method11481(var0);
               if (var1 == 1) {
                  var0.field5951[var36] = true;
               } else {
                  var0.field5951[var36] = false;
               }
            }

            for(var36 = 0; var36 < 256; ++var36) {
               var0.field5950[var36] = false;
            }

            int var37;
            for(var36 = 0; var36 < 16; ++var36) {
               if (var0.field5951[var36]) {
                  for(var37 = 0; var37 < 16; ++var37) {
                     var1 = method11481(var0);
                     if (var1 == 1) {
                        var0.field5950[var37 + var36 * 16] = true;
                     }
                  }
               }
            }

            method11476(var0);
            int var39 = var0.field5949 + 2;
            int var40 = method11499(3, var0);
            int var41 = method11499(15, var0);

            for(var36 = 0; var36 < var41; ++var36) {
               var37 = 0;

               while(true) {
                  var1 = method11481(var0);
                  if (var1 == 0) {
                     var0.field5930[var36] = (byte)var37;
                     break;
                  }

                  ++var37;
               }
            }

            byte[] var27 = new byte[6];

            byte var29;
            for(var29 = 0; var29 < var40; var27[var29] = var29++) {
            }

            for(var36 = 0; var36 < var41; ++var36) {
               var29 = var0.field5930[var36];

               byte var28;
               for(var28 = var27[var29]; var29 > 0; --var29) {
                  var27[var29] = var27[var29 - 1];
               }

               var27[0] = var28;
               var0.field5929[var36] = var28;
            }

            int var38;
            for(var38 = 0; var38 < var40; ++var38) {
               int var50 = method11499(5, var0);

               for(var36 = 0; var36 < var39; ++var36) {
                  while(true) {
                     var1 = method11481(var0);
                     if (var1 == 0) {
                        var0.field5955[var38][var36] = (byte)var50;
                        break;
                     }

                     var1 = method11481(var0);
                     if (var1 == 0) {
                        ++var50;
                     } else {
                        --var50;
                     }
                  }
               }
            }

            for(var38 = 0; var38 < var40; ++var38) {
               byte var2 = 32;
               byte var3 = 0;

               for(var36 = 0; var36 < var39; ++var36) {
                  if (var0.field5955[var38][var36] > var3) {
                     var3 = var0.field5955[var38][var36];
                  }

                  if (var0.field5955[var38][var36] < var2) {
                     var2 = var0.field5955[var38][var36];
                  }
               }

               method11483(var0.field5956[var38], var0.field5957[var38], var0.field5941[var38], var0.field5955[var38], var2, var3, var39);
               var0.field5959[var38] = var2;
            }

            int var42 = var0.field5949 + 1;
            int var43 = -1;
            byte var44 = 0;

            for(var36 = 0; var36 <= 255; ++var36) {
               var0.field5946[var36] = 0;
            }

            int var56 = 4095;

            int var35;
            int var55;
            for(var35 = 15; var35 >= 0; --var35) {
               for(var55 = 15; var55 >= 0; --var55) {
                  var0.field5943[var56] = (byte)(var55 + var35 * 16);
                  --var56;
               }

               var0.field5924[var35] = var56 + 1;
            }

            int var47 = 0;
            byte var54;
            if (var44 == 0) {
               ++var43;
               var44 = 50;
               var54 = var0.field5929[var43];
               var22 = var0.field5959[var54];
               var23 = var0.field5956[var54];
               var25 = var0.field5941[var54];
               var24 = var0.field5957[var54];
            }

            int var45 = var44 - 1;
            int var51 = var22;

            int var52;
            byte var53;
            for(var52 = method11499(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) {
               ++var51;
               var53 = method11481(var0);
            }

            int var46 = var25[var52 - var24[var51]];

            while(true) {
               int[] var10000;
               int var10002;
               while(var46 != var42) {
                  if (var46 != 0 && var46 != 1) {
                     int var33 = var46 - 1;
                     int var30;
                     if (var33 < 16) {
                        var30 = var0.field5924[0];

                        for(var1 = var0.field5943[var30 + var33]; var33 > 3; var33 -= 4) {
                           int var34 = var30 + var33;
                           var0.field5943[var34] = var0.field5943[var34 - 1];
                           var0.field5943[var34 - 1] = var0.field5943[var34 - 2];
                           var0.field5943[var34 - 2] = var0.field5943[var34 - 3];
                           var0.field5943[var34 - 3] = var0.field5943[var34 - 4];
                        }

                        while(var33 > 0) {
                           var0.field5943[var30 + var33] = var0.field5943[var30 + var33 - 1];
                           --var33;
                        }

                        var0.field5943[var30] = var1;
                     } else {
                        int var31 = var33 / 16;
                        int var32 = var33 % 16;
                        var30 = var0.field5924[var31] + var32;

                        for(var1 = var0.field5943[var30]; var30 > var0.field5924[var31]; --var30) {
                           var0.field5943[var30] = var0.field5943[var30 - 1];
                        }

                        for(var10002 = var0.field5924[var31]++; var31 > 0; --var31) {
                           var10002 = var0.field5924[var31]--;
                           var0.field5943[var0.field5924[var31]] = var0.field5943[var0.field5924[var31 - 1] + 16 - 1];
                        }

                        var10002 = var0.field5924[0]--;
                        var0.field5943[var0.field5924[0]] = var1;
                        if (var0.field5924[0] == 0) {
                           var56 = 4095;

                           for(var35 = 15; var35 >= 0; --var35) {
                              for(var55 = 15; var55 >= 0; --var55) {
                                 var0.field5943[var56] = var0.field5943[var0.field5924[var35] + var55];
                                 --var56;
                              }

                              var0.field5924[var35] = var56 + 1;
                           }
                        }
                     }

                     var10002 = var0.field5946[var0.field5927[var1 & 255] & 255]++;
                     class409.field4911[var47] = var0.field5927[var1 & 255] & 255;
                     ++var47;
                     if (var45 == 0) {
                        ++var43;
                        var45 = 50;
                        var54 = var0.field5929[var43];
                        var22 = var0.field5959[var54];
                        var23 = var0.field5956[var54];
                        var25 = var0.field5941[var54];
                        var24 = var0.field5957[var54];
                     }

                     --var45;
                     var51 = var22;

                     for(var52 = method11499(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) {
                        ++var51;
                        var53 = method11481(var0);
                     }

                     var46 = var25[var52 - var24[var51]];
                  } else {
                     int var48 = -1;
                     int var49 = 1;

                     do {
                        if (var46 == 0) {
                           var48 += var49;
                        } else if (var46 == 1) {
                           var48 += var49 * 2;
                        }

                        var49 *= 2;
                        if (var45 == 0) {
                           ++var43;
                           var45 = 50;
                           var54 = var0.field5929[var43];
                           var22 = var0.field5959[var54];
                           var23 = var0.field5956[var54];
                           var25 = var0.field5941[var54];
                           var24 = var0.field5957[var54];
                        }

                        --var45;
                        var51 = var22;

                        for(var52 = method11499(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) {
                           ++var51;
                           var53 = method11481(var0);
                        }

                        var46 = var25[var52 - var24[var51]];
                     } while(var46 == 0 || var46 == 1);

                     ++var48;
                     var1 = var0.field5927[var0.field5943[var0.field5924[0]] & 255];
                     var10000 = var0.field5946;

                     for(var10000[var1 & 255] += var48; var48 > 0; --var48) {
                        class409.field4911[var47] = var1 & 255;
                        ++var47;
                     }
                  }
               }

               var0.field5939 = 0;
               var0.field5938 = 0;
               var0.field5948[0] = 0;

               for(var36 = 1; var36 <= 256; ++var36) {
                  var0.field5948[var36] = var0.field5946[var36 - 1];
               }

               for(var36 = 1; var36 <= 256; ++var36) {
                  var10000 = var0.field5948;
                  var10000[var36] += var0.field5948[var36 - 1];
               }

               for(var36 = 0; var36 < var47; ++var36) {
                  var1 = (byte)(class409.field4911[var36] & 255);
                  var10000 = class409.field4911;
                  int var10001 = var0.field5948[var1 & 255];
                  var10000[var10001] |= var36 << 8;
                  var10002 = var0.field5948[var1 & 255]++;
               }

               var0.field5944 = class409.field4911[var0.field5923] >> 8;
               var0.field5947 = 0;
               var0.field5944 = class409.field4911[var0.field5944];
               var0.field5945 = (byte)(var0.field5944 & 255);
               var0.field5944 >>= 8;
               ++var0.field5947;
               var0.field5960 = var47;
               method11478(var0);
               if (var0.field5960 + 1 == var0.field5947 && var0.field5939 == 0) {
                  var26 = true;
                  break;
               }

               var26 = false;
               break;
            }
         }

         return;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lwy;)B"
   )
   static byte method11480(class592 var0) {
      return (byte)method11499(8, var0);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lwy;)B"
   )
   static byte method11481(class592 var0) {
      return (byte)method11499(1, var0);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ILwy;)I"
   )
   static int method11499(int var0, class592 var1) {
      while(var1.field5925 < var0) {
         var1.field5954 = var1.field5954 << 8 | var1.field5942[var1.field5932] & 255;
         var1.field5925 += 8;
         ++var1.field5932;
         ++var1.field5933;
         if (var1.field5933 == 0) {
         }
      }

      int var2 = var1.field5954 >> var1.field5925 - var0 & (1 << var0) - 1;
      var1.field5925 -= var0;
      return var2;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lwy;)V"
   )
   static void method11476(class592 var0) {
      var0.field5949 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (var0.field5950[var1]) {
            var0.field5927[var0.field5949] = (byte)var1;
            ++var0.field5949;
         }
      }

   }

   @ObfuscatedName("as")
   static void method11483(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if (var8 == var3[var9]) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }
}
