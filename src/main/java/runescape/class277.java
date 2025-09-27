package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kc")
public abstract class class277 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -906535551
   )
   public int field3260;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1024531605
   )
   public int field3257;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 876794791
   )
   public int field3258;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1893902693
   )
   public int field3259;

   protected class277() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIILkb;I)Z",
      garbageValue = "164670435"
   )
   protected abstract boolean vmethod6240(int var1, int var2, int var3, class275 var4);

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIIB)J",
      garbageValue = "93"
   )
   static long method6239(int var0, int var1, int var2) {
      return (long)(var2 << 16 | var0 << 8 | var1);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Ldr;B)V",
      garbageValue = "0"
   )
   static final void method6233(class79 var0) {
      int var1 = var0.field1162;
      int var2 = var0.field1163;
      int[][][] var3 = var0.field1173;
      byte[][][] var4 = var0.field1168;
      class230 var5 = var0.field1159;
      class275[] var6 = var0.field1175;

      int var7;
      int var8;
      for(var7 = 0; var7 < 4; ++var7) {
         for(var8 = 0; var8 < var1; ++var8) {
            for(int var9 = 0; var9 < var2; ++var9) {
               if ((var0.field1168[var7][var8][var9] & 1) == 1) {
                  int var10 = var7;
                  if ((var0.field1168[1][var8][var9] & 2) == 2) {
                     var10 = var7 - 1;
                  }

                  if (var10 >= 0 && var6 != null) {
                     var6[var10].method6179(var8, var9);
                  }
               }
            }
         }
      }

      class59.field852 += (int)(Math.random() * 5.0D) - 2;
      if (class59.field852 < -8) {
         class59.field852 = -8;
      }

      if (class59.field852 > 8) {
         class59.field852 = 8;
      }

      class59.field853 += (int)(Math.random() * 5.0D) - 2;
      if (class59.field853 < -16) {
         class59.field853 = -16;
      }

      if (class59.field853 > 16) {
         class59.field853 = 16;
      }

      for(var7 = 0; var7 < 4; ++var7) {
         byte[][] var48 = class59.field849[var7];
         boolean var54 = true;
         boolean var55 = true;
         boolean var11 = true;
         boolean var12 = true;
         boolean var13 = true;
         int var14 = (int)Math.sqrt(5100.0D);
         int var15 = var14 * 768 >> 8;

         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         int var25;
         int var49;
         for(var16 = 1; var16 < var2 - 1; ++var16) {
            for(var17 = 1; var17 < var1 - 1; ++var17) {
               var49 = var3[var7][var17 + 1][var16] - var3[var7][var17 - 1][var16];
               var19 = var3[var7][var17][var16 + 1] - var3[var7][var17][var16 - 1];
               var20 = (int)Math.sqrt((double)(var49 * var49 + var19 * var19 + 65536));
               var21 = (var49 << 8) / var20;
               var22 = 65536 / var20;
               var23 = (var19 << 8) / var20;
               var24 = (var23 * -50 + var21 * -50 + var22 * -10) / var15 + 96;
               var25 = (var48[var17][var16 + 1] >> 3) + (var48[var17 - 1][var16] >> 2) + (var48[var17][var16 - 1] >> 2) + (var48[var17 + 1][var16] >> 3) + (var48[var17][var16] >> 1);
               class159.field1828[var17][var16] = var24 - var25;
            }
         }

         for(var16 = 0; var16 < var2; ++var16) {
            class124.field1568[var16] = 0;
            class256.field3083[var16] = 0;
            class59.field844[var16] = 0;
            class59.field850[var16] = 0;
            class235.field2814[var16] = 0;
         }

         for(var16 = -5; var16 < var1 + 5; ++var16) {
            int[] var10000;
            for(var17 = 0; var17 < var2; ++var17) {
               var49 = var16 + 5;
               int var10002;
               if (var49 >= 0 && var49 < var1) {
                  var19 = (int)class473.method9649(15);
                  var20 = class39.field270[var7][var49][var17] & var19;
                  if (var20 > 0) {
                     class202 var50 = class202.method4441(var20 - 1);
                     var10000 = class124.field1568;
                     var10000[var17] += var50.field2215;
                     var10000 = class256.field3083;
                     var10000[var17] += var50.field2212;
                     var10000 = class59.field844;
                     var10000[var17] += var50.field2214;
                     var10000 = class59.field850;
                     var10000[var17] += var50.field2217;
                     var10002 = class235.field2814[var17]++;
                  }
               }

               var19 = var16 - 5;
               if (var19 >= 0 && var19 < var1) {
                  var20 = (int)class473.method9649(15);
                  var21 = class39.field270[var7][var19][var17] & var20;
                  if (var21 > 0) {
                     var23 = var21 - 1;
                     class202 var51 = (class202)class202.field2211.method7018((long)var23);
                     class202 var53;
                     if (var51 != null) {
                        var53 = var51;
                     } else {
                        byte[] var52 = class202.field2216.method8335(1, var23);
                        var51 = new class202();
                        if (var52 != null) {
                           var51.method4428(new Buffer(var52), var23);
                        }

                        var51.method4443();
                        class202.field2211.method7009(var51, (long)var23);
                        var53 = var51;
                     }

                     var10000 = class124.field1568;
                     var10000[var17] -= var53.field2215;
                     var10000 = class256.field3083;
                     var10000[var17] -= var53.field2212;
                     var10000 = class59.field844;
                     var10000[var17] -= var53.field2214;
                     var10000 = class59.field850;
                     var10000[var17] -= var53.field2217;
                     var10002 = class235.field2814[var17]--;
                  }
               }
            }

            if (var16 >= 1 && var16 < var1 - 1) {
               var17 = 0;
               var49 = 0;
               var19 = 0;
               var20 = 0;
               var21 = 0;

               for(var22 = -5; var22 < var2 + 5; ++var22) {
                  var23 = var22 + 5;
                  if (var23 >= 0 && var23 < var2) {
                     var17 += class124.field1568[var23];
                     var49 += class256.field3083[var23];
                     var19 += class59.field844[var23];
                     var20 += class59.field850[var23];
                     var21 += class235.field2814[var23];
                  }

                  var24 = var22 - 5;
                  if (var24 >= 0 && var24 < var2) {
                     var17 -= class124.field1568[var24];
                     var49 -= class256.field3083[var24];
                     var19 -= class59.field844[var24];
                     var20 -= class59.field850[var24];
                     var21 -= class235.field2814[var24];
                  }

                  if (var22 >= 1 && var22 < var2 - 1 && (!client.field565 || (var4[0][var16][var22] & 2) != 0 || (var4[var7][var16][var22] & 16) == 0)) {
                     if (var7 < class59.field842) {
                        class59.field842 = var7;
                     }

                     var25 = (int)class473.method9649(15);
                     int var26 = class39.field270[var7][var16][var22] & var25;
                     int var27 = class59.field846[var7][var16][var22] & var25;
                     if (var26 > 0 || var27 > 0) {
                        int var28 = var3[var7][var16][var22];
                        int var29 = var3[var7][var16 + 1][var22];
                        int var30 = var3[var7][var16 + 1][var22 + 1];
                        int var31 = var3[var7][var16][var22 + 1];
                        int var32 = class159.field1828[var16][var22];
                        int var33 = class159.field1828[var16 + 1][var22];
                        int var34 = class159.field1828[var16 + 1][var22 + 1];
                        int var35 = class159.field1828[var16][var22 + 1];
                        int var36 = -1;
                        int var37 = -1;
                        int var38;
                        int var39;
                        if (var26 > 0) {
                           var38 = var17 * 256 / var20;
                           var39 = var49 / var21;
                           int var40 = var19 / var21;
                           var36 = ClientPackets.method7039(var38, var39, var40);
                           var38 = var38 + class59.field852 & 255;
                           var40 += class59.field853;
                           if (var40 < 0) {
                              var40 = 0;
                           } else if (var40 > 255) {
                              var40 = 255;
                           }

                           var37 = ClientPackets.method7039(var38, var39, var40);
                        }

                        if (var7 > 0) {
                           boolean var56 = true;
                           if (var26 == 0 && class59.field847[var7][var16][var22] != 0) {
                              var56 = false;
                           }

                           if (var27 > 0 && !client.method1287(var27 - 1).field2439) {
                              var56 = false;
                           }

                           if (var56 && var28 == var29 && var28 == var30 && var31 == var28) {
                              var10000 = class397.field4837[var7][var16];
                              var10000[var22] |= 2340;
                           }
                        }

                        var38 = 0;
                        if (var37 != -1) {
                           var38 = class225.field2639[class218.method4825(var37, 96)];
                        }

                        if (var27 == 0) {
                           var5.method5187(var7, var16, var22, 0, 0, -1, var28, var29, var30, var31, class218.method4825(var36, var32), class218.method4825(var36, var33), class218.method4825(var36, var34), class218.method4825(var36, var35), 0, 0, 0, 0, var38, 0);
                        } else {
                           var39 = class59.field847[var7][var16][var22] + 1;
                           byte var57 = class59.field848[var7][var16][var22];
                           class214 var41 = client.method1287(var27 - 1);
                           int var42 = var41.field2445;
                           int var43;
                           int var44;
                           int var45;
                           int var46;
                           if (var42 >= 0) {
                              var44 = class225.field2632.field3010.vmethod5779(var42);
                              var43 = -1;
                           } else if (var41.field2444 == 16711935) {
                              var43 = -2;
                              var42 = -1;
                              var44 = -2;
                           } else {
                              var43 = ClientPackets.method7039(var41.field2448, var41.field2449, var41.field2450);
                              var45 = var41.field2448 + class59.field852 & 255;
                              var46 = var41.field2450 + class59.field853;
                              if (var46 < 0) {
                                 var46 = 0;
                              } else if (var46 > 255) {
                                 var46 = 255;
                              }

                              var44 = ClientPackets.method7039(var45, var41.field2449, var46);
                           }

                           var45 = 0;
                           if (var44 != -2) {
                              var45 = class225.field2639[class312.method6970(var44, 96)];
                           }

                           if (var41.field2453 != -1) {
                              var46 = var41.field2451 + class59.field852 & 255;
                              int var47 = var41.field2446 + class59.field853;
                              if (var47 < 0) {
                                 var47 = 0;
                              } else if (var47 > 255) {
                                 var47 = 255;
                              }

                              var44 = ClientPackets.method7039(var46, var41.field2452, var47);
                              var45 = class225.field2639[class312.method6970(var44, 96)];
                           }

                           var5.method5187(var7, var16, var22, var39, var57, var42, var28, var29, var30, var31, class218.method4825(var36, var32), class218.method4825(var36, var33), class218.method4825(var36, var34), class218.method4825(var36, var35), class312.method6970(var43, var32), class312.method6970(var43, var33), class312.method6970(var43, var34), class312.method6970(var43, var35), var38, var45);
                        }
                     }
                  }
               }
            }
         }

         for(var16 = 1; var16 < var2 - 1; ++var16) {
            for(var17 = 1; var17 < var1 - 1; ++var17) {
               if ((var0.field1168[var7][var17][var16] & 8) != 0) {
                  var22 = 0;
               } else if (var7 > 0 && (var0.field1168[1][var17][var16] & 2) != 0) {
                  var22 = var7 - 1;
               } else {
                  var22 = var7;
               }

               var5.method5223(var7, var17, var16, var22);
            }
         }

         class39.field270[var7] = null;
         class59.field846[var7] = null;
         class59.field847[var7] = null;
         class59.field848[var7] = null;
         class59.field849[var7] = null;
      }

      var5.method5132(-50, -10, -50);

      for(var7 = 0; var7 < var1; ++var7) {
         for(var8 = 0; var8 < var2; ++var8) {
            if ((var4[1][var7][var8] & 2) == 2) {
               var5.method5103(var7, var8);
            }
         }
      }

      if (var0.method2691()) {
         ClientPackets.method7037(var0);
      }

   }

   @ObfuscatedName("ln")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "1219347614"
   )
   public static final void method6236(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < client.rootWidgetCount; ++var4) {
         if (client.rootWidgetPos3[var4] + client.rootWidgetPos1[var4] > var0 && client.rootWidgetPos1[var4] < var0 + var2 && client.rootWidgetPos4[var4] + client.rootWidgetPos2[var4] > var1 && client.rootWidgetPos2[var4] < var3 + var1) {
            client.field436[var4] = true;
         }
      }

   }
}
