package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
public final class class74 extends class544 {
   @ObfuscatedName("tr")
   @ObfuscatedGetter(
      intValue = -692034665
   )
   static int field1037;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1807644487
   )
   int field1026;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 173220327
   )
   int field1021;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1300241925
   )
   int field1022;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1520132353
   )
   int field1036;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1896493323
   )
   int field1024;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1577127295
   )
   int field1025;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1243384765
   )
   int field1035;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1768533279
   )
   int field1027;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 954740903
   )
   int field1028;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -857369257
   )
   int field1029;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1354974779
   )
   int field1023;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 594717283
   )
   int field1031 = 0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 316804587
   )
   int field1032 = -1;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -756842331
   )
   int field1033 = 31;
   @ObfuscatedName("ae")
   String[] field1020;

   class74() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2059192484"
   )
   void method2398(int var1) {
      this.field1033 = var1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;I)V",
      garbageValue = "449920500"
   )
   void method2399(String[] var1) {
      this.field1020 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1968487390"
   )
   boolean method2400(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field1033 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "119"
   )
   boolean method2408(int var1) {
      return this.field1020 != null && var1 >= 0 && var1 < this.field1020.length && this.field1020[var1] != null;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "-1562991786"
   )
   String method2402(int var1) {
      return this.field1020 != null && var1 >= 0 && var1 < this.field1020.length ? this.field1020[var1] : null;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Lrl;",
      garbageValue = "-1192431635"
   )
   public static class453 method2414() {
      synchronized(class453.field5178) {
         if (class22.field91 == 0) {
            return new class453();
         } else {
            class453.field5178[--class22.field91].method9058();
            return class453.field5178[class22.field91];
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lre;Lre;I)F",
      garbageValue = "-1676431985"
   )
   public static final float method2413(class452 var0, class452 var1) {
      return var0.method8999(var1);
   }

   @ObfuscatedName("mm")
   @ObfuscatedSignature(
      descriptor = "([Loi;IIIIIIIIIIII)V",
      garbageValue = "1219865577"
   )
   static final void method2409(class369[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      class601.method11550(var5, var6, var7, var8);
      class225.method4934();

      for(int var12 = var1; var12 <= var2; ++var12) {
         class369 var13 = var0[var12];
         if (var13 != null && (var3 == var13.field4164 && var4 == var13.field4165 || var3 == -1412584499 && var13 == client.field612)) {
            int var14;
            if (var11 == -1) {
               client.rootWidgetPos1[client.rootWidgetCount] = var9 + var13.field4158;
               client.rootWidgetPos2[client.rootWidgetCount] = var10 + var13.field4204;
               client.rootWidgetPos3[client.rootWidgetCount] = var13.field4160 * 469894397;
               client.rootWidgetPos4[client.rootWidgetCount] = var13.field4149 * 1156037777;
               var14 = ++client.rootWidgetCount - 1;
            } else {
               var14 = var11;
            }

            var13.field4293 = var14;
            var13.field4294 = client.cycle;
            if (!var13.field4143 || !class364.method7524(var13)) {
               if (var13.field4168 > 0) {
                  class537.method10544(var13);
               }

               int var15 = var9 + var13.field4158;
               int var16 = var10 + var13.field4204;
               int var17 = var13.field4179;
               int var18;
               int var19;
               if (var13 == client.field612) {
                  if (var3 != -1412584499 && !var13.field4234) {
                     class152.field1777 = var0;
                     class163.field1872 = var9;
                     class291.field3375 = var10;
                     continue;
                  }

                  if (client.field546 && client.field540) {
                     var18 = class35.field231;
                     var19 = class35.field220;
                     var18 -= client.field537;
                     var19 -= client.field557;
                     if (var18 < client.field541) {
                        var18 = client.field541;
                     }

                     if (var18 + var13.field4160 * 469894397 > client.field536.field4160 * 469894397 + client.field541) {
                        var18 = client.field536.field4160 * 469894397 + client.field541 - var13.field4160 * 469894397;
                     }

                     if (var19 < client.field542) {
                        var19 = client.field542;
                     }

                     if (var13.field4149 * 1156037777 + var19 > client.field542 + client.field536.field4149 * 1156037777) {
                        var19 = client.field536.field4149 * 1156037777 + client.field542 - var13.field4149 * 1156037777;
                     }

                     var15 = var18;
                     var16 = var19;
                  }

                  if (!var13.field4234) {
                     var17 = 128;
                  }
               }

               int var20;
               int var21;
               int var22;
               int var23;
               int var24;
               int var25;
               if (var13.field4147 == 9) {
                  var22 = var15;
                  var23 = var16;
                  var24 = var15 + var13.field4160 * 469894397;
                  var25 = var13.field4149 * 1156037777 + var16;
                  if (var24 < var15) {
                     var22 = var24;
                     var24 = var15;
                  }

                  if (var25 < var16) {
                     var23 = var25;
                     var25 = var16;
                  }

                  ++var24;
                  ++var25;
                  var18 = var22 > var5 ? var22 : var5;
                  var19 = var23 > var6 ? var23 : var6;
                  var20 = var24 < var7 ? var24 : var7;
                  var21 = var25 < var8 ? var25 : var8;
               } else {
                  var22 = var15 + var13.field4160 * 469894397;
                  var23 = var13.field4149 * 1156037777 + var16;
                  var18 = var15 > var5 ? var15 : var5;
                  var19 = var16 > var6 ? var16 : var6;
                  var20 = var22 < var7 ? var22 : var7;
                  var21 = var23 < var8 ? var23 : var8;
               }

               if (!var13.field4143 || var18 < var20 && var19 < var21) {
                  if (var13.field4168 != 0) {
                     if (var13.field4168 == 1336) {
                        if (class36.clientPreferences.method2562()) {
                           var16 += 15;
                           class463.field5239.method9477("Fps:" + class34.field179, var15 + var13.field4160 * 469894397, var16, 16776960, -1);
                           var16 += 15;
                           Runtime var45 = Runtime.getRuntime();
                           var23 = (int)((var45.totalMemory() - var45.freeMemory()) / 1024L);
                           var24 = 16776960;
                           if (var23 > 327680 && !client.field565) {
                              var24 = 16711680;
                           }

                           class463.field5239.method9477("Mem:" + var23 + "k", var15 + var13.field4160 * 469894397, var16, var24, -1);
                           var16 += 15;
                        }
                        continue;
                     }

                     if (var13.field4168 == 1337) {
                        client.viewportX = var15;
                        client.viewportY = var16;
                        class449.method8979(var15, var16, var13.field4160 * 469894397, var13.field4149 * 1156037777);
                        client.field436[var13.field4293] = true;
                        class601.method11550(var5, var6, var7, var8);
                        continue;
                     }

                     if (var13.field4168 == 1338) {
                        class19.method298(var13, var15, var16, var14);
                        class601.method11550(var5, var6, var7, var8);
                        continue;
                     }

                     if (var13.field4168 == 1339) {
                        class452.method9051(var13, var15, var16, var14);
                        class601.method11550(var5, var6, var7, var8);
                        continue;
                     }

                     if (var13.field4168 == 1400) {
                        class56.field816.method10708(var15, var16, var13.field4160 * 469894397, var13.field4149 * 1156037777, client.cycle, class36.clientPreferences.method2566());
                     }

                     if (var13.field4168 == 1401) {
                        class56.field816.method10661(var15, var16, var13.field4160 * 469894397, var13.field4149 * 1156037777);
                     }

                     if (var13.field4168 == 1402) {
                        class155.field1803.method2518(var15, client.cycle);
                     }
                  }

                  if (var13.field4147 == 0) {
                     if (!var13.field4143 && class364.method7524(var13) && var13 != class343.field3950) {
                        continue;
                     }

                     if (!var13.field4143) {
                        if (var13.field4170 > var13.field4172 - var13.field4149 * 1156037777) {
                           var13.field4170 = var13.field4172 - var13.field4149 * 1156037777;
                        }

                        if (var13.field4170 < 0) {
                           var13.field4170 = 0;
                        }
                     }

                     method2409(var0, var13.field4248, var13.field4214, var13.field4144, var13.field4145 * -217986249, var18, var19, var20, var21, var15 - var13.field4260, var16 - var13.field4170, var14);
                     if (var13.field4286 != null) {
                        method2409(var13.field4286, 0, var13.field4286.length - 1, var13.field4144, -1, var18, var19, var20, var21, var15 - var13.field4260, var16 - var13.field4170, var14);
                     }

                     if (var13.field4145 * -217986249 == -1) {
                        class64 var32 = (class64)client.field422.method8623((long)var13.field4144);
                        if (var32 != null) {
                           class164.drawWidgets(var32.field888, var18, var19, var20, var21, var15, var16, var14);
                        }
                     }

                     class601.method11550(var5, var6, var7, var8);
                     class225.method4934();
                  } else if (var13.field4147 == 11) {
                     if (class364.method7524(var13) && var13 != class343.field3950) {
                        continue;
                     }

                     if (var13.field4286 != null) {
                        method2409(var13.field4286, 0, var13.field4286.length - 1, var13.field4144, -1, var18, var19, var20, var21, var15 - var13.field4260, var16 - var13.field4170, var14);
                     }

                     class601.method11550(var5, var6, var7, var8);
                     class225.method4934();
                  }

                  if (client.isResizable || client.field356[var14] || client.gameDrawingMode > 1) {
                     if (var13.field4147 == 0 && !var13.field4143 && var13.field4172 > var13.field4149 * 1156037777) {
                        class39.method743(var15 + var13.field4160 * 469894397, var16, var13.field4170, var13.field4149 * 1156037777, var13.field4172);
                     }

                     if (var13.field4147 != 1) {
                        if (var13.field4147 == 3) {
                           if (class262.method5937(var13)) {
                              var22 = var13.field4174;
                              if (var13 == class343.field3950 && var13.field4246 != 0) {
                                 var22 = var13.field4246;
                              }
                           } else {
                              var22 = var13.field4173;
                              if (var13 == class343.field3950 && var13.field4175 != 0) {
                                 var22 = var13.field4175;
                              }
                           }

                           if (var13.field4177) {
                              switch(var13.field4178.field6003) {
                              case 1:
                                 class601.method11559(var15, var16, var13.field4160 * 469894397, var13.field4149 * 1156037777, var13.field4173, var13.field4174);
                                 break;
                              case 2:
                                 class601.method11560(var15, var16, var13.field4160 * 469894397, var13.field4149 * 1156037777, var13.field4173, var13.field4174, 255 - (var13.field4179 & 255), 255 - (var13.field4180 & 255));
                                 break;
                              default:
                                 if (var17 == 0) {
                                    class601.method11558(var15, var16, var13.field4160 * 469894397, var13.field4149 * 1156037777, var22);
                                 } else {
                                    class601.Rasterizer2D_fillRectangleAlpha(var15, var16, var13.field4160 * 469894397, var13.field4149 * 1156037777, var22, 256 - (var17 & 255));
                                 }
                              }
                           } else if (var17 == 0) {
                              class601.method11562(var15, var16, var13.field4160 * 469894397, var13.field4149 * 1156037777, var22);
                           } else {
                              class601.method11612(var15, var16, var13.field4160 * 469894397, var13.field4149 * 1156037777, var22, 256 - (var17 & 255));
                           }
                        } else if (var13.field4147 == 4) {
                           class461 var44 = var13.method7943(class119.field1554);
                           if (var44 == null) {
                              if (class369.field4142) {
                                 class89.method2877(var13);
                              }
                           } else {
                              String var43 = var13.field4211;
                              if (class262.method5937(var13)) {
                                 var23 = var13.field4174;
                                 if (var13 == class343.field3950 && var13.field4246 != 0) {
                                    var23 = var13.field4246;
                                 }

                                 if (!var13.field4212.isEmpty()) {
                                    var43 = var13.field4212;
                                 }
                              } else {
                                 var23 = var13.field4173;
                                 if (var13 == class343.field3950 && var13.field4175 != 0) {
                                    var23 = var13.field4175;
                                 }
                              }

                              if (var13.field4143 && var13.field4282 != -1) {
                                 class213 var46 = class84.method2800(var13.field4282);
                                 var43 = var46.field2428;
                                 if (var43 == null) {
                                    var43 = "null";
                                 }

                                 if ((var46.field2397 == 1 || var13.field4283 != 1) && var13.field4283 != -1) {
                                    var43 = class134.method3619(16748608) + var43 + "</col>" + " " + 'x' + class446.method8925(var13.field4283);
                                 }
                              }

                              if (var13 == client.field564) {
                                 var43 = "Please wait...";
                                 var23 = var13.field4173;
                              }

                              if (!var13.field4143) {
                                 var43 = class128.method3581(var43, var13);
                              }

                              var44.method9425(var43, var15, var16, var13.field4160 * 469894397, var13.field4149 * 1156037777, var23, var13.field4216 ? 0 : -1, class537.method10535(var13.field4179), var13.field4167, var13.field4215, var13.field4213);
                           }
                        } else {
                           int var27;
                           int var28;
                           if (var13.field4147 == 5) {
                              class605 var42;
                              if (!var13.field4143) {
                                 var42 = var13.method7938(class119.field1554, class262.method5937(var13), class114.field1507);
                                 if (var42 != null) {
                                    var42.method11705(var15, var16);
                                 } else if (class369.field4142) {
                                    class89.method2877(var13);
                                 }
                              } else {
                                 if (var13.field4282 != -1) {
                                    var42 = class187.method4273(var13.field4282, var13.field4283, var13.field4188, var13.field4134, var13.field4198, false, Math.max(36, var13.field4160 * 469894397), Math.max(32, var13.field4149 * 1156037777));
                                 } else {
                                    var42 = var13.method7938(class119.field1554, false, class114.field1507);
                                 }

                                 if (var42 == null) {
                                    if (class369.field4142) {
                                       class89.method2877(var13);
                                    }
                                 } else {
                                    var23 = var42.field6022;
                                    var24 = var42.field6024;
                                    if (!var13.field4187) {
                                       var25 = var13.field4160 * 542101504 / var23;
                                       if (var13.field4201 != 0) {
                                          var42.method11715(var15 + var13.field4160 * 469894397 / 2, var16 + var13.field4149 * 1156037777 / 2, var13.field4201, var25);
                                       } else if (var17 != 0) {
                                          var42.method11709(var15, var16, var13.field4160 * 469894397, var13.field4149 * 1156037777, 256 - (var17 & 255));
                                       } else if (var23 == var13.field4160 * 469894397 && var13.field4149 * 1156037777 == var24) {
                                          var42.method11705(var15, var16);
                                       } else {
                                          var42.method11750(var15, var16, var13.field4160 * 469894397, var13.field4149 * 1156037777);
                                       }
                                    } else {
                                       class601.method11551(var15, var16, var15 + var13.field4160 * 469894397, var13.field4149 * 1156037777 + var16);
                                       var25 = (var13.field4160 * 469894397 + (var23 - 1)) / var23;
                                       int var26 = (var13.field4149 * 1156037777 + (var24 - 1)) / var24;

                                       for(var27 = 0; var27 < var25; ++var27) {
                                          for(var28 = 0; var28 < var26; ++var28) {
                                             if (var13.field4201 != 0) {
                                                var42.method11715(var23 / 2 + var15 + var23 * var27, var24 / 2 + var16 + var28 * var24, var13.field4201, 4096);
                                             } else if (var17 != 0) {
                                                var42.method11708(var15 + var23 * var27, var16 + var28 * var24, 256 - (var17 & 255));
                                             } else {
                                                var42.method11705(var15 + var23 * var27, var16 + var28 * var24);
                                             }
                                          }
                                       }

                                       class601.method11550(var5, var6, var7, var8);
                                    }
                                 }
                              }
                           } else {
                              int var29;
                              int var30;
                              if (var13.field4147 == 6) {
                                 class215 var41 = null;
                                 var23 = -1;
                                 boolean var39 = class262.method5937(var13);
                                 if (var39) {
                                    var25 = var13.field4197;
                                 } else {
                                    var25 = var13.field4196;
                                 }

                                 if (var25 != -1) {
                                    var41 = class177.method4155(var25);
                                    var23 = var13.field4284;
                                 }

                                 class241 var48 = null;
                                 var27 = 0;
                                 if (var13.field4282 != -1) {
                                    class213 var37 = class84.method2800(var13.field4282);
                                    if (var37 != null) {
                                       var37 = var37.method4663(var13.field4283);
                                       var48 = var37.method4719(1);
                                       if (var48 != null) {
                                          var48.method5459();
                                          var27 = var48.field2801 / 2;
                                       } else {
                                          class89.method2877(var13);
                                       }
                                    }
                                 } else if (var13.field4192 == 5) {
                                    if (var13.field4277 == 0) {
                                       var48 = client.field322.method7599((class215)null, -1, (class215)null, -1);
                                    } else {
                                       var48 = class76.field1108.vmethod5365();
                                    }
                                 } else if (var13.field4192 == 7) {
                                    var48 = var13.field4206.method7599((class215)null, -1, class177.method4155(class76.field1108.field1060), class76.field1108.field1083.method9565());
                                 } else if (var13.field4192 == 8) {
                                    if (var13.field4277 != -1) {
                                       class212 var47 = class433.method8669(var13.field4277);
                                       var48 = var47.method4609(10, 0, (int[][])null, 0, 0, 0, var41, var23);
                                    }
                                 } else {
                                    class195 var49;
                                    if (var13.field4192 == 9) {
                                       if (var13.field4277 != -1) {
                                          var49 = class63.method2129(var13.field4277);
                                          var48 = var49.method4327(var41, var23, (class215)null, -1, (class194)null);
                                       }
                                    } else {
                                       var49 = null;
                                       class194 var38 = null;
                                       if (var13.field4192 == 6) {
                                          var30 = var13.field4277;
                                          if (var30 >= 0) {
                                             class81 var31 = (class81)class333.field3836.field1160.method8567((long)var30);
                                             if (var31 != null && var31.field1184 != null) {
                                                var49 = var31.field1184;
                                                if (var49.field2099 != null) {
                                                   var49 = var49.method4365();
                                                }

                                                var38 = var31.method2729();
                                             }
                                          }
                                       } else if (var13.field4192 == 2) {
                                          var30 = var13.field4277;
                                          var49 = class63.method2129(var30);
                                          if (var49.field2099 != null) {
                                             var49 = var49.method4365();
                                          }
                                       }

                                       var48 = var13.method8071(class119.field1554, var41, var23, var39, class76.field1108.field935, var49, var38);
                                       if (var48 == null && class369.field4142) {
                                          class89.method2877(var13);
                                       }
                                    }
                                 }

                                 class225.method4981(var15 + var13.field4160 * 469894397 / 2, var13.field4149 * 1156037777 / 2 + var16);
                                 var28 = class225.field2637[var13.field4200] * var13.field4203 >> 16;
                                 var29 = class225.field2636[var13.field4200] * var13.field4203 >> 16;
                                 if (var48 != null) {
                                    class225.method4927(false);
                                    if (!var13.field4143) {
                                       var48.method5565(0, var13.field4235, 0, var13.field4200, 0, var28, var29);
                                    } else {
                                       var48.method5459();
                                       if (var13.field4207) {
                                          var48.method5507(0, var13.field4235, var13.field4202, var13.field4200, var13.field4226, var28 + var27 + var13.field4199, var29 + var13.field4199, var13.field4203);
                                       } else {
                                          var48.method5565(0, var13.field4235, var13.field4202, var13.field4200, var13.field4226, var28 + var27 + var13.field4199, var29 + var13.field4199);
                                       }
                                    }
                                 }

                                 class225.method5011();
                              } else {
                                 class461 var34;
                                 if (var13.field4147 == 8) {
                                    if (var13 == class134.field1624 && client.field426 == client.field481) {
                                       var22 = 0;
                                       var23 = 0;
                                       var34 = class463.field5239;
                                       String var35 = var13.field4211;

                                       String var36;
                                       for(var35 = class128.method3581(var35, var13); !var35.isEmpty(); var23 = var23 + var34.field5251 + 1) {
                                          var27 = var35.indexOf("<br>");
                                          if (var27 != -1) {
                                             var36 = var35.substring(0, var27);
                                             var35 = var35.substring(var27 + 4);
                                          } else {
                                             var36 = var35;
                                             var35 = "";
                                          }

                                          var28 = var34.method9415(var36);
                                          if (var28 > var22) {
                                             var22 = var28;
                                          }
                                       }

                                       var22 += 6;
                                       var23 += 7;
                                       var27 = var15 + var13.field4160 * 469894397 - 5 - var22;
                                       var28 = var13.field4149 * 1156037777 + var16 + 5;
                                       if (var27 < var15 + 5) {
                                          var27 = var15 + 5;
                                       }

                                       if (var22 + var27 > var7) {
                                          var27 = var7 - var22;
                                       }

                                       if (var28 + var23 > var8) {
                                          var28 = var8 - var23;
                                       }

                                       class601.method11558(var27, var28, var22, var23, 16777120);
                                       class601.method11562(var27, var28, var22, var23, 0);
                                       var35 = var13.field4211;
                                       var29 = var28 + var34.field5251 + 2;

                                       for(var35 = class128.method3581(var35, var13); !var35.isEmpty(); var29 = var29 + var34.field5251 + 1) {
                                          var30 = var35.indexOf("<br>");
                                          if (var30 != -1) {
                                             var36 = var35.substring(0, var30);
                                             var35 = var35.substring(var30 + 4);
                                          } else {
                                             var36 = var35;
                                             var35 = "";
                                          }

                                          var34.method9420(var36, var27 + 3, var29, 0, -1);
                                       }
                                    }
                                 } else if (var13.field4147 == 9) {
                                    if (var13.field4182) {
                                       var22 = var15;
                                       var23 = var13.field4149 * 1156037777 + var16;
                                       var24 = var15 + var13.field4160 * 469894397;
                                       var25 = var16;
                                    } else {
                                       var22 = var15;
                                       var23 = var16;
                                       var24 = var15 + var13.field4160 * 469894397;
                                       var25 = var13.field4149 * 1156037777 + var16;
                                    }

                                    if (var13.field4181 == 1) {
                                       class601.method11563(var22, var23, var24, var25, var13.field4173);
                                    } else {
                                       class199.method4399(var22, var23, var24, var25, var13.field4173, var13.field4181);
                                    }
                                 } else if (var13.field4147 == 12) {
                                    class366 var40 = var13.method7971();
                                    class360 var33 = var13.method8088();
                                    if (var40 != null && var33 != null && var40.method7658()) {
                                       var34 = var13.method7943(class119.field1554);
                                       if (var34 != null) {
                                          client.field501.method11846(var15, var16, var13.field4160 * 469894397, var13.field4149 * 1156037777, var40.method7792(), var40.method7660(), var40.method7656(), var40.method7857(), var40.method7655());
                                          var25 = var13.field4216 ? var13.field4134 : -1;
                                          if (!var40.method7839() && var40.method7650().method9338()) {
                                             client.field501.method11850(var33.field4055, var25, var33.field4052, var33.field4053);
                                             client.field501.method11848(var40.method7651(), var34);
                                          } else {
                                             client.field501.method11850(var13.field4173, var25, var33.field4052, var33.field4053);
                                             client.field501.method11848(var40.method7650(), var34);
                                          }

                                          class601.method11550(var5, var6, var7, var8);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }
}
