package runescape;

import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public final class class333 {
   @ObfuscatedName("at")
   static final HashMap field3832 = new HashMap();
   @ObfuscatedName("fl")
   @ObfuscatedSignature(
      descriptor = "Lrv;"
   )
   public static class461 field3831;
   @ObfuscatedName("fr")
   @ObfuscatedSignature(
      descriptor = "Ldr;"
   )
   public static class79 field3836;
   @ObfuscatedName("ow")
   @ObfuscatedSignature(
      descriptor = "Lbk;"
   )
   static class43 loginState;

   static {
      Calendar.getInstance(method7058("Europe/London"));
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/util/TimeZone;",
      garbageValue = "-812050058"
   )
   static TimeZone method7058(String var0) {
      synchronized(field3832) {
         TimeZone var2 = (TimeZone)field3832.get(var0);
         if (var2 == null) {
            var2 = TimeZone.getTimeZone(var0);
            field3832.put(var0, var2);
         }

         return var2;
      }
   }

   @ObfuscatedName("kv")
   @ObfuscatedSignature(
      descriptor = "(Ldr;IIIIIIIIB)V",
      garbageValue = "-11"
   )
   static final void method7056(class79 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class230 var9 = var0.field1159;
      if (var3 >= 1 && var4 >= 1 && var3 <= var0.field1162 - 1 && var4 <= var0.field1163 - 1) {
         if (client.field565 && var0.field1170 != var1) {
            return;
         }

         class233 var10 = null;
         class233 var11 = null;
         int var12 = -1;
         long var13 = 0L;
         boolean var15 = false;
         boolean var16 = false;
         if (var2 == 0) {
            var13 = var9.method5127(var1, var3, var4);
         }

         if (var2 == 1) {
            var13 = var9.method5128(var1, var3, var4);
         }

         if (var2 == 2) {
            var13 = var9.method5341(var1, var3, var4);
         }

         if (var2 == 3) {
            var13 = var9.method5215(var1, var3, var4);
         }

         int var17;
         if (var13 != 0L) {
            var17 = var9.method5169(var1, var3, var4, var13);
            var12 = class537.method10539(var13);
            int var44 = var17 & 31;
            int var45 = var17 >> 6 & 3;
            class212 var18 = class433.method8669(var12);
            var0.method2687(var1, var3, var4, var18, var45);
            if (var2 == 0) {
               class250 var19 = var9.method5123(var1, var3, var4);
               var10 = var19.field3032;
               var11 = var19.field3024;
               var9.method5118(var1, var3, var4);
               if (var18.field2331 != 0) {
                  var0.field1175[var1].method6198(var3, var4, var44, var45, var18.field2332);
               }
            }

            if (var2 == 1) {
               class252 var47 = var9.method5261(var1, var3, var4);
               var10 = var47.field3036;
               var11 = var47.field3045;
               var9.method5119(var1, var3, var4);
            }

            if (var2 == 2) {
               var10 = var9.method5226(var1, var3, var4).field3062;
               var9.method5120(var1, var3, var4);
               if (var3 + var18.field2329 > var0.field1162 - 1 || var4 + var18.field2329 > var0.field1163 - 1 || var3 + var18.field2330 > var0.field1162 - 1 || var4 + var18.field2330 > var0.field1163 - 1) {
                  return;
               }

               if (var18.field2331 != 0) {
                  var0.field1175[var1].method6181(var3, var4, var18.field2329, var18.field2330, var45, var18.field2332);
               }
            }

            if (var2 == 3) {
               var10 = var9.method5126(var1, var3, var4).field2573;
               var9.method5121(var1, var3, var4);
               if (var18.field2331 == 1) {
                  var0.field1175[var1].method6183(var3, var4);
               }
            }
         }

         if (var5 >= 0) {
            var17 = var1;
            if (var1 < 3 && (var0.field1168[1][var3][var4] & 2) == 2) {
               var17 = var1 + 1;
            }

            if (var5 != var12) {
               var10 = null;
               var11 = null;
            }

            class275 var46 = var0.field1175[var1];
            class212 var48 = class433.method8669(var5);
            int var20 = var8 >= 0 ? var8 : var48.field2320;
            int var21;
            int var22;
            if (var6 != 1 && var6 != 3) {
               var21 = var48.field2329;
               var22 = var48.field2330;
            } else {
               var21 = var48.field2330;
               var22 = var48.field2329;
            }

            int var23;
            int var24;
            if (var3 + var21 <= var0.field1162) {
               var23 = var3 + (var21 >> 1);
               var24 = var3 + (var21 + 1 >> 1);
            } else {
               var23 = var3;
               var24 = var3 + 1;
            }

            int var25;
            int var26;
            if (var22 + var4 <= var0.field1163) {
               var25 = (var22 >> 1) + var4;
               var26 = (var22 + 1 >> 1) + var4;
            } else {
               var25 = var4;
               var26 = var4 + 1;
            }

            int[][] var27 = var0.field1173[var17];
            int var28 = var27[var24][var26] + var27[var23][var26] + var27[var23][var25] + var27[var24][var25] >> 2;
            int var29 = (var3 << 7) + (var21 << 6);
            int var30 = (var4 << 7) + (var22 << 6);
            class230 var31 = var0.field1159;
            long var32 = class123.method3544(var1, var3, var4, 2, var48.field2308 == 0, var5, var0.field1172);
            int var34 = (var6 << 6) + var7;
            if (var48.field2354 == 1) {
               var34 += 256;
            }

            Object var42;
            if (var7 == 22) {
               if (var20 == -1 && var48.field2355 == null) {
                  var42 = var48.method4652(22, var6, var27, var29, var28, var30);
               } else {
                  var42 = new class56(var0, var5, 22, var6, var17, var3, var4, var20, var48.field2319, var10);
               }

               var31.method5107(var1, var3, var4, var28, (class233)var42, var32, var34);
               if (var48.field2331 == 1 && var46 != null) {
                  var46.method6202(var3, var4);
               }
            } else if (var7 != 10 && var7 != 11) {
               if (var7 >= 12) {
                  if (var20 == -1 && var48.field2355 == null) {
                     var42 = var48.method4652(var7, var6, var27, var29, var28, var30);
                  } else {
                     var42 = new class56(var0, var5, var7, var6, var17, var3, var4, var20, var48.field2319, var10);
                  }

                  var31.method5147(var1, var3, var4, var28, 1, 1, (class233)var42, 0, var32, var34);
                  if (var48.field2331 != 0 && var46 != null) {
                     var46.method6178(var3, var4, var21, var22, var48.field2332);
                  }
               } else if (var7 == 0) {
                  if (var20 == -1 && var48.field2355 == null) {
                     var42 = var48.method4652(0, var6, var27, var29, var28, var30);
                  } else {
                     var42 = new class56(var0, var5, 0, var6, var17, var3, var4, var20, var48.field2319, var10);
                  }

                  var31.method5271(var1, var3, var4, var28, (class233)var42, (class233)null, class59.field839[var6], 0, var32, var34);
                  if (var48.field2331 != 0 && var46 != null) {
                     var46.method6176(var3, var4, var7, var6, var48.field2332);
                  }
               } else if (var7 == 1) {
                  if (var20 == -1 && var48.field2355 == null) {
                     var42 = var48.method4652(1, var6, var27, var29, var28, var30);
                  } else {
                     var42 = new class56(var0, var5, 1, var6, var17, var3, var4, var20, var48.field2319, var10);
                  }

                  var31.method5271(var1, var3, var4, var28, (class233)var42, (class233)null, class59.field840[var6], 0, var32, var34);
                  if (var48.field2331 != 0 && var46 != null) {
                     var46.method6176(var3, var4, var7, var6, var48.field2332);
                  }
               } else {
                  int var35;
                  if (var7 == 2) {
                     var35 = var6 + 1 & 3;
                     Object var37;
                     Object var43;
                     if (var20 == -1 && var48.field2355 == null) {
                        var43 = var48.method4652(2, var6 + 4, var27, var29, var28, var30);
                        var37 = var48.method4652(2, var35, var27, var29, var28, var30);
                     } else {
                        var43 = new class56(var0, var5, 2, var6 + 4, var17, var3, var4, var20, var48.field2319, var10);
                        var37 = new class56(var0, var5, 2, var35, var17, var3, var4, var20, var48.field2319, var11);
                     }

                     var31.method5271(var1, var3, var4, var28, (class233)var43, (class233)var37, class59.field839[var6], class59.field839[var35], var32, var34);
                     if (var48.field2331 != 0 && var46 != null) {
                        var46.method6176(var3, var4, var7, var6, var48.field2332);
                     }
                  } else if (var7 == 3) {
                     if (var20 == -1 && var48.field2355 == null) {
                        var42 = var48.method4652(3, var6, var27, var29, var28, var30);
                     } else {
                        var42 = new class56(var0, var5, 3, var6, var17, var3, var4, var20, var48.field2319, var10);
                     }

                     var31.method5271(var1, var3, var4, var28, (class233)var42, (class233)null, class59.field840[var6], 0, var32, var34);
                     if (var48.field2331 != 0 && var46 != null) {
                        var46.method6176(var3, var4, var7, var6, var48.field2332);
                     }
                  } else if (var7 == 9) {
                     if (var20 == -1 && var48.field2355 == null) {
                        var42 = var48.method4652(var7, var6, var27, var29, var28, var30);
                     } else {
                        var42 = new class56(var0, var5, var7, var6, var17, var3, var4, var20, var48.field2319, var10);
                     }

                     var31.method5147(var1, var3, var4, var28, 1, 1, (class233)var42, 0, var32, var34);
                     if (var48.field2331 != 0 && var46 != null) {
                        var46.method6178(var3, var4, var21, var22, var48.field2332);
                     }
                  } else if (var7 == 4) {
                     if (var20 == -1 && var48.field2355 == null) {
                        var42 = var48.method4652(4, var6, var27, var29, var28, var30);
                     } else {
                        var42 = new class56(var0, var5, 4, var6, var17, var3, var4, var20, var48.field2319, var10);
                     }

                     var31.method5238(var1, var3, var4, var28, (class233)var42, (class233)null, class59.field839[var6], 0, 0, 0, var32, var34);
                  } else {
                     long var36;
                     Object var38;
                     if (var7 == 5) {
                        var35 = 16;
                        var36 = var31.method5127(var1, var3, var4);
                        if (0L != var36) {
                           var35 = class433.method8669(class537.method10539(var36)).field2338;
                        }

                        if (var20 == -1 && var48.field2355 == null) {
                           var38 = var48.method4652(4, var6, var27, var29, var28, var30);
                        } else {
                           var38 = new class56(var0, var5, 4, var6, var17, var3, var4, var20, var48.field2319, var10);
                        }

                        var31.method5238(var1, var3, var4, var28, (class233)var38, (class233)null, class59.field839[var6], 0, class59.field841[var6] * var35, class59.field843[var6] * var35, var32, var34);
                     } else if (var7 == 6) {
                        var35 = 8;
                        var36 = var31.method5127(var1, var3, var4);
                        if (0L != var36) {
                           var35 = class433.method8669(class537.method10539(var36)).field2338 / 2;
                        }

                        if (var20 == -1 && var48.field2355 == null) {
                           var38 = var48.method4652(4, var6 + 4, var27, var29, var28, var30);
                        } else {
                           var38 = new class56(var0, var5, 4, var6 + 4, var17, var3, var4, var20, var48.field2319, var10);
                        }

                        var31.method5238(var1, var3, var4, var28, (class233)var38, (class233)null, 256, var6, class59.field851[var6] * var35, class59.field838[var6] * var35, var32, var34);
                     } else if (var7 == 7) {
                        int var41 = var6 + 2 & 3;
                        if (var20 == -1 && var48.field2355 == null) {
                           var42 = var48.method4652(4, var41 + 4, var27, var29, var28, var30);
                        } else {
                           var42 = new class56(var0, var5, 4, var41 + 4, var17, var3, var4, var20, var48.field2319, var10);
                        }

                        var31.method5238(var1, var3, var4, var28, (class233)var42, (class233)null, 256, var41, 0, 0, var32, var34);
                     } else if (var7 == 8) {
                        var35 = 8;
                        var36 = var31.method5127(var1, var3, var4);
                        if (var36 != 0L) {
                           var35 = class433.method8669(class537.method10539(var36)).field2338 / 2;
                        }

                        int var40 = var6 + 2 & 3;
                        Object var39;
                        if (var20 == -1 && var48.field2355 == null) {
                           var38 = var48.method4652(4, var6 + 4, var27, var29, var28, var30);
                           var39 = var48.method4652(4, var40 + 4, var27, var29, var28, var30);
                        } else {
                           var38 = new class56(var0, var5, 4, var6 + 4, var17, var3, var4, var20, var48.field2319, var10);
                           var39 = new class56(var0, var5, 4, var40 + 4, var17, var3, var4, var20, var48.field2319, var11);
                        }

                        var31.method5238(var1, var3, var4, var28, (class233)var38, (class233)var39, 256, var6, class59.field851[var6] * var35, class59.field838[var6] * var35, var32, var34);
                     }
                  }
               }
            } else {
               if (var20 == -1 && var48.field2355 == null) {
                  var42 = var48.method4652(10, var6, var27, var29, var28, var30);
               } else {
                  var42 = new class56(var0, var5, 10, var6, var17, var3, var4, var20, var48.field2319, var10);
               }

               if (var42 != null) {
                  var31.method5147(var1, var3, var4, var28, var21, var22, (class233)var42, var7 == 11 ? 256 : 0, var32, var34);
               }

               if (var48.field2331 != 0 && var46 != null) {
                  var46.method6178(var3, var4, var21, var22, var48.field2332);
               }
            }

            var48 = class433.method8669(var5);
            if (var48 != null && var48.method4614()) {
               var0.method2685(var17, var3, var4, var48, var6);
            }
         }
      }

   }
}
