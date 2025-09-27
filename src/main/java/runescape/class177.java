package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class177 extends class540 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   static class412 field1960;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class320 field1959 = new class320(64);
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1990596703
   )
   public int field1961 = 0;

   class177() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "164445609"
   )
   void method4144(Buffer var1) {
      while(true) {
         int var2 = var1.method11196();
         if (var2 == 0) {
            return;
         }

         this.method4154(var1, var2);
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lwb;IB)V",
      garbageValue = "36"
   )
   void method4154(Buffer var1, int var2) {
      if (var2 == 2) {
         this.field1961 = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Lij;",
      garbageValue = "-1942763723"
   )
   public static class215 method4155(int var0) {
      class215 var1 = (class215)class215.field2466.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = UserComparator5.field1611.method8335(12, var0);
         var1 = new class215();
         if (var2 != null) {
            var1.method4759(new Buffer(var2));
         }

         var1.method4761();
         class215.field2466.method7009(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)Lhi;",
      garbageValue = "1207266953"
   )
   public static class187 method4153(int var0) {
      class187 var1 = (class187)class187.field2040.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class187.field2038.method8335(33, var0);
         var1 = new class187();
         var1.field2042 = var0;
         if (var2 != null) {
            var1.method4252(new Buffer(var2));
         }

         class187.field2040.method7009(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Ldr;IIIIIILkb;I)V",
      garbageValue = "820995052"
   )
   static final void method4152(class79 var0, int var1, int var2, int var3, int var4, int var5, int var6, class275 var7) {
      if (!client.field565 || (var0.field1168[0][var2][var3] & 2) != 0 || (var0.field1168[var1][var2][var3] & 16) == 0) {
         if (var1 < class59.field842) {
            class59.field842 = var1;
         }

         class212 var8 = class433.method8669(var4);
         int var9;
         int var10;
         if (var5 != 1 && var5 != 3) {
            var9 = var8.field2329;
            var10 = var8.field2330;
         } else {
            var9 = var8.field2330;
            var10 = var8.field2329;
         }

         int var11;
         int var12;
         if (var9 + var2 <= var0.field1162) {
            var11 = (var9 >> 1) + var2;
            var12 = var2 + (var9 + 1 >> 1);
         } else {
            var11 = var2;
            var12 = var2 + 1;
         }

         int var13;
         int var14;
         if (var3 + var10 <= var0.field1163) {
            var13 = var3 + (var10 >> 1);
            var14 = var3 + (var10 + 1 >> 1);
         } else {
            var13 = var3;
            var14 = var3 + 1;
         }

         int[][] var15 = var0.field1173[var1];
         int var16 = var15[var12][var14] + var15[var11][var14] + var15[var11][var13] + var15[var12][var13] >> 2;
         int var17 = (var2 << 7) + (var9 << 6);
         int var18 = (var3 << 7) + (var10 << 6);
         long var19 = class123.method3544(var1, var2, var3, 2, var8.field2308 == 0, var4, var0.field1172);
         int var21 = (var5 << 6) + var6;
         if (var8.field2354 == 1) {
            var21 += 256;
         }

         if (var8.method4614()) {
            var0.method2685(var1, var2, var3, var8, var5);
         }

         class230 var22 = var0.field1159;
         Object var30;
         if (var6 == 22) {
            if (!client.field565 || var8.field2308 != 0 || var8.field2331 == 1 || var8.field2333) {
               if (var8.field2320 == -1 && var8.field2355 == null) {
                  var30 = var8.method4608(22, var5, var15, var17, var16, var18);
               } else {
                  var30 = new class56(var0, var4, 22, var5, var1, var2, var3, var8.field2320, var8.field2319, (class233)null);
               }

               var22.method5107(var1, var2, var3, var16, (class233)var30, var19, var21);
               if (var8.field2331 == 1 && var7 != null) {
                  var7.method6202(var2, var3);
               }

            }
         } else {
            int var29;
            if (var6 != 10 && var6 != 11) {
               int[] var10000;
               if (var6 >= 12) {
                  if (var8.field2320 == -1 && var8.field2355 == null) {
                     var30 = var8.method4608(var6, var5, var15, var17, var16, var18);
                  } else {
                     var30 = new class56(var0, var4, var6, var5, var1, var2, var3, var8.field2320, var8.field2319, (class233)null);
                  }

                  var22.method5147(var1, var2, var3, var16, 1, 1, (class233)var30, 0, var19, var21);
                  if (var6 >= 12 && var6 <= 17 && var6 != 13 && var1 > 0) {
                     var10000 = class397.field4837[var1][var2];
                     var10000[var3] |= 2340;
                  }

                  if (var8.field2331 != 0 && var7 != null) {
                     var7.method6178(var2, var3, var9, var10, var8.field2332);
                  }

               } else if (var6 == 0) {
                  if (var8.field2320 == -1 && var8.field2355 == null) {
                     var30 = var8.method4608(0, var5, var15, var17, var16, var18);
                  } else {
                     var30 = new class56(var0, var4, 0, var5, var1, var2, var3, var8.field2320, var8.field2319, (class233)null);
                  }

                  var22.method5271(var1, var2, var3, var16, (class233)var30, (class233)null, class59.field839[var5], 0, var19, var21);
                  if (var5 == 0) {
                     if (var8.field2369) {
                        class59.field849[var1][var2][var3] = 50;
                        class59.field849[var1][var2][var3 + 1] = 50;
                     }

                     if (var8.field2336) {
                        var10000 = class397.field4837[var1][var2];
                        var10000[var3] |= 585;
                     }
                  } else if (var5 == 1) {
                     if (var8.field2369) {
                        class59.field849[var1][var2][var3 + 1] = 50;
                        class59.field849[var1][var2 + 1][var3 + 1] = 50;
                     }

                     if (var8.field2336) {
                        var10000 = class397.field4837[var1][var2];
                        var10000[1 + var3] |= 1170;
                     }
                  } else if (var5 == 2) {
                     if (var8.field2369) {
                        class59.field849[var1][var2 + 1][var3] = 50;
                        class59.field849[var1][var2 + 1][var3 + 1] = 50;
                     }

                     if (var8.field2336) {
                        var10000 = class397.field4837[var1][var2 + 1];
                        var10000[var3] |= 585;
                     }
                  } else if (var5 == 3) {
                     if (var8.field2369) {
                        class59.field849[var1][var2][var3] = 50;
                        class59.field849[var1][var2 + 1][var3] = 50;
                     }

                     if (var8.field2336) {
                        var10000 = class397.field4837[var1][var2];
                        var10000[var3] |= 1170;
                     }
                  }

                  if (var8.field2331 != 0 && var7 != null) {
                     var7.method6176(var2, var3, var6, var5, var8.field2332);
                  }

                  if (var8.field2338 != 16) {
                     var22.method5117(var1, var2, var3, var8.field2338);
                  }

               } else if (var6 == 1) {
                  if (var8.field2320 == -1 && var8.field2355 == null) {
                     var30 = var8.method4608(1, var5, var15, var17, var16, var18);
                  } else {
                     var30 = new class56(var0, var4, 1, var5, var1, var2, var3, var8.field2320, var8.field2319, (class233)null);
                  }

                  var22.method5271(var1, var2, var3, var16, (class233)var30, (class233)null, class59.field840[var5], 0, var19, var21);
                  if (var8.field2369) {
                     if (var5 == 0) {
                        class59.field849[var1][var2][var3 + 1] = 50;
                     } else if (var5 == 1) {
                        class59.field849[var1][var2 + 1][var3 + 1] = 50;
                     } else if (var5 == 2) {
                        class59.field849[var1][var2 + 1][var3] = 50;
                     } else if (var5 == 3) {
                        class59.field849[var1][var2][var3] = 50;
                     }
                  }

                  if (var8.field2331 != 0 && var7 != null) {
                     var7.method6176(var2, var3, var6, var5, var8.field2332);
                  }

               } else {
                  int var23;
                  if (var6 == 2) {
                     var23 = var5 + 1 & 3;
                     Object var25;
                     Object var31;
                     if (var8.field2320 == -1 && var8.field2355 == null) {
                        var31 = var8.method4608(2, var5 + 4, var15, var17, var16, var18);
                        var25 = var8.method4608(2, var23, var15, var17, var16, var18);
                     } else {
                        var31 = new class56(var0, var4, 2, var5 + 4, var1, var2, var3, var8.field2320, var8.field2319, (class233)null);
                        var25 = new class56(var0, var4, 2, var23, var1, var2, var3, var8.field2320, var8.field2319, (class233)null);
                     }

                     var22.method5271(var1, var2, var3, var16, (class233)var31, (class233)var25, class59.field839[var5], class59.field839[var23], var19, var21);
                     if (var8.field2336) {
                        if (var5 == 0) {
                           var10000 = class397.field4837[var1][var2];
                           var10000[var3] |= 585;
                           var10000 = class397.field4837[var1][var2];
                           var10000[var3 + 1] |= 1170;
                        } else if (var5 == 1) {
                           var10000 = class397.field4837[var1][var2];
                           var10000[var3 + 1] |= 1170;
                           var10000 = class397.field4837[var1][var2 + 1];
                           var10000[var3] |= 585;
                        } else if (var5 == 2) {
                           var10000 = class397.field4837[var1][var2 + 1];
                           var10000[var3] |= 585;
                           var10000 = class397.field4837[var1][var2];
                           var10000[var3] |= 1170;
                        } else if (var5 == 3) {
                           var10000 = class397.field4837[var1][var2];
                           var10000[var3] |= 1170;
                           var10000 = class397.field4837[var1][var2];
                           var10000[var3] |= 585;
                        }
                     }

                     if (var8.field2331 != 0 && var7 != null) {
                        var7.method6176(var2, var3, var6, var5, var8.field2332);
                     }

                     if (var8.field2338 != 16) {
                        var22.method5117(var1, var2, var3, var8.field2338);
                     }

                  } else if (var6 == 3) {
                     if (var8.field2320 == -1 && var8.field2355 == null) {
                        var30 = var8.method4608(3, var5, var15, var17, var16, var18);
                     } else {
                        var30 = new class56(var0, var4, 3, var5, var1, var2, var3, var8.field2320, var8.field2319, (class233)null);
                     }

                     var22.method5271(var1, var2, var3, var16, (class233)var30, (class233)null, class59.field840[var5], 0, var19, var21);
                     if (var8.field2369) {
                        if (var5 == 0) {
                           class59.field849[var1][var2][var3 + 1] = 50;
                        } else if (var5 == 1) {
                           class59.field849[var1][var2 + 1][var3 + 1] = 50;
                        } else if (var5 == 2) {
                           class59.field849[var1][var2 + 1][var3] = 50;
                        } else if (var5 == 3) {
                           class59.field849[var1][var2][var3] = 50;
                        }
                     }

                     if (var8.field2331 != 0 && var7 != null) {
                        var7.method6176(var2, var3, var6, var5, var8.field2332);
                     }

                  } else if (var6 == 9) {
                     if (var8.field2320 == -1 && var8.field2355 == null) {
                        var30 = var8.method4608(var6, var5, var15, var17, var16, var18);
                     } else {
                        var30 = new class56(var0, var4, var6, var5, var1, var2, var3, var8.field2320, var8.field2319, (class233)null);
                     }

                     var22.method5147(var1, var2, var3, var16, 1, 1, (class233)var30, 0, var19, var21);
                     if (var8.field2331 != 0 && var7 != null) {
                        var7.method6178(var2, var3, var9, var10, var8.field2332);
                     }

                     if (var8.field2338 != 16) {
                        var22.method5117(var1, var2, var3, var8.field2338);
                     }

                  } else if (var6 == 4) {
                     if (var8.field2320 == -1 && var8.field2355 == null) {
                        var30 = var8.method4608(4, var5, var15, var17, var16, var18);
                     } else {
                        var30 = new class56(var0, var4, 4, var5, var1, var2, var3, var8.field2320, var8.field2319, (class233)null);
                     }

                     var22.method5238(var1, var2, var3, var16, (class233)var30, (class233)null, class59.field839[var5], 0, 0, 0, var19, var21);
                  } else {
                     long var24;
                     Object var26;
                     if (var6 == 5) {
                        var23 = 16;
                        var24 = var22.method5127(var1, var2, var3);
                        if (0L != var24) {
                           var23 = class433.method8669(class537.method10539(var24)).field2338;
                        }

                        if (var8.field2320 == -1 && var8.field2355 == null) {
                           var26 = var8.method4608(4, var5, var15, var17, var16, var18);
                        } else {
                           var26 = new class56(var0, var4, 4, var5, var1, var2, var3, var8.field2320, var8.field2319, (class233)null);
                        }

                        var22.method5238(var1, var2, var3, var16, (class233)var26, (class233)null, class59.field839[var5], 0, var23 * class59.field841[var5], var23 * class59.field843[var5], var19, var21);
                     } else if (var6 == 6) {
                        var23 = 8;
                        var24 = var22.method5127(var1, var2, var3);
                        if (var24 != 0L) {
                           var23 = class433.method8669(class537.method10539(var24)).field2338 / 2;
                        }

                        if (var8.field2320 == -1 && var8.field2355 == null) {
                           var26 = var8.method4608(4, var5 + 4, var15, var17, var16, var18);
                        } else {
                           var26 = new class56(var0, var4, 4, var5 + 4, var1, var2, var3, var8.field2320, var8.field2319, (class233)null);
                        }

                        var22.method5238(var1, var2, var3, var16, (class233)var26, (class233)null, 256, var5, var23 * class59.field851[var5], var23 * class59.field838[var5], var19, var21);
                     } else if (var6 == 7) {
                        var29 = var5 + 2 & 3;
                        if (var8.field2320 == -1 && var8.field2355 == null) {
                           var30 = var8.method4608(4, var29 + 4, var15, var17, var16, var18);
                        } else {
                           var30 = new class56(var0, var4, 4, var29 + 4, var1, var2, var3, var8.field2320, var8.field2319, (class233)null);
                        }

                        var22.method5238(var1, var2, var3, var16, (class233)var30, (class233)null, 256, var29, 0, 0, var19, var21);
                     } else if (var6 == 8) {
                        var23 = 8;
                        var24 = var22.method5127(var1, var2, var3);
                        if (0L != var24) {
                           var23 = class433.method8669(class537.method10539(var24)).field2338 / 2;
                        }

                        int var28 = var5 + 2 & 3;
                        Object var27;
                        if (var8.field2320 == -1 && var8.field2355 == null) {
                           var26 = var8.method4608(4, var5 + 4, var15, var17, var16, var18);
                           var27 = var8.method4608(4, var28 + 4, var15, var17, var16, var18);
                        } else {
                           var26 = new class56(var0, var4, 4, var5 + 4, var1, var2, var3, var8.field2320, var8.field2319, (class233)null);
                           var27 = new class56(var0, var4, 4, var28 + 4, var1, var2, var3, var8.field2320, var8.field2319, (class233)null);
                        }

                        var22.method5238(var1, var2, var3, var16, (class233)var26, (class233)var27, 256, var5, var23 * class59.field851[var5], var23 * class59.field838[var5], var19, var21);
                     }
                  }
               }
            } else {
               if (var8.field2320 == -1 && var8.field2355 == null) {
                  var30 = var8.method4608(10, var5, var15, var17, var16, var18);
               } else {
                  var30 = new class56(var0, var4, 10, var5, var1, var2, var3, var8.field2320, var8.field2319, (class233)null);
               }

               if (var30 != null && var22.method5147(var1, var2, var3, var16, var9, var10, (class233)var30, var6 == 11 ? 256 : 0, var19, var21) && var8.field2369) {
                  var29 = 15;
                  if (var30 instanceof class241) {
                     var29 = ((class241)var30).method5461() / 4;
                     if (var29 > 30) {
                        var29 = 30;
                     }
                  }

                  for(int var32 = 0; var32 <= var9; ++var32) {
                     for(int var33 = 0; var33 <= var10; ++var33) {
                        if (var29 > class59.field849[var1][var32 + var2][var3 + var33]) {
                           class59.field849[var1][var32 + var2][var3 + var33] = (byte)var29;
                        }
                     }
                  }
               }

               if (var8.field2331 != 0 && var7 != null) {
                  var7.method6178(var2, var3, var9, var10, var8.field2332);
               }

            }
         }
      }
   }
}
