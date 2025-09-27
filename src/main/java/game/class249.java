package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class class249 {
   @ObfuscatedName("ie")
   @ObfuscatedGetter(
      intValue = -46711549
   )
   static int field3021;

   class249() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lcq;Lcg;IIB)V",
      garbageValue = "31"
   )
   static void method5775(class65 var0, class55 var1, int var2, int var3) {
      Object[] var4 = var0.field898;
      class124.field1569 = 0;
      class46.field658 = 0;
      int var5 = -1;
      int[] var6 = var1.field796;
      int[] var7 = var1.field801;
      byte var8 = -1;
      class46.field662 = 0;
      class46.field667 = false;
      boolean var9 = false;
      class46.field653 = 0;
      boolean var26 = false;

      label907: {
         label908: {
            try {
               int var12;
               try {
                  var26 = true;
                  class279.field3277 = new int[var1.field799];
                  int var10 = 0;
                  class46.field671 = new Object[var1.field797];
                  int var11 = 0;

                  int var13;
                  String var19;
                  for(var12 = 1; var12 < var4.length; ++var12) {
                     if (var4[var12] instanceof Integer) {
                        var13 = (Integer)var4[var12];
                        if (var13 == -2147483647) {
                           var13 = var0.field900;
                        }

                        if (var13 == -2147483646) {
                           var13 = var0.field895;
                        }

                        if (var13 == -2147483645) {
                           var13 = var0.field893 != null ? var0.field893.field4144 : -1;
                        }

                        if (var13 == -2147483644) {
                           var13 = var0.field891;
                        }

                        if (var13 == -2147483643) {
                           var13 = var0.field893 != null ? var0.field893.field4145 * -217986249 : -1;
                        }

                        if (var13 == -2147483642) {
                           var13 = var0.field896 != null ? var0.field896.field4144 : -1;
                        }

                        if (var13 == -2147483641) {
                           var13 = var0.field896 != null ? var0.field896.field4145 * -217986249 : -1;
                        }

                        if (var13 == -2147483640) {
                           var13 = var0.field892;
                        }

                        if (var13 == -2147483639) {
                           var13 = var0.field894;
                        }

                        if (var13 == -2147483638) {
                           var13 = var0.field897;
                        }

                        class279.field3277[var10++] = var13;
                     } else if (var4[var12] instanceof String) {
                        var19 = (String)var4[var12];
                        if (var19.equals("event_opbase")) {
                           var19 = var0.field901;
                        }

                        class46.field671[var11++] = var19;
                     } else if (var4[var12] instanceof class519) {
                        class46.field671[var11++] = var4[var12];
                     }
                  }

                  class46.field670 = var0.field902;

                  label896:
                  while(true) {
                     ++class46.field653;
                     if (class46.field653 > var2) {
                        throw new RuntimeException();
                     }

                     ++var5;
                     int var29 = var6[var5];
                     if (var29 < 100) {
                        if (var29 == 0) {
                           class46.field659[++class124.field1569 - 1] = var7[var5];
                        } else if (var29 == 1) {
                           var12 = var7[var5];
                           class46.field659[++class124.field1569 - 1] = class355.field4022[var12];
                        } else if (var29 == 2) {
                           var12 = var7[var5];
                           class355.field4022[var12] = class46.field659[--class124.field1569];
                           class371.method8125(var12);
                        } else if (var29 == 3) {
                           class46.field660[++class46.field658 - 1] = var1.field798[var5];
                        } else if (var29 == 6) {
                           var5 += var7[var5];
                        } else if (var29 == 7) {
                           class124.field1569 -= 2;
                           if (class46.field659[class124.field1569] != class46.field659[class124.field1569 + 1]) {
                              var5 += var7[var5];
                           }
                        } else if (var29 == 8) {
                           class124.field1569 -= 2;
                           if (class46.field659[class124.field1569] == class46.field659[class124.field1569 + 1]) {
                              var5 += var7[var5];
                           }
                        } else if (var29 == 9) {
                           class124.field1569 -= 2;
                           if (class46.field659[class124.field1569] < class46.field659[class124.field1569 + 1]) {
                              var5 += var7[var5];
                           }
                        } else if (var29 == 10) {
                           class124.field1569 -= 2;
                           if (class46.field659[class124.field1569] > class46.field659[class124.field1569 + 1]) {
                              var5 += var7[var5];
                           }
                        } else if (var29 == 21) {
                           if (class46.field662 == 0) {
                              var26 = false;
                              break label908;
                           }

                           class38 var37 = class46.field663[--class46.field662];
                           var1 = var37.field259;
                           var6 = var1.field796;
                           var7 = var1.field801;
                           var5 = var37.field255;
                           class279.field3277 = var37.field258;
                           class46.field671 = var37.field254;
                        } else if (var29 == 25) {
                           var12 = var7[var5];
                           class46.field659[++class124.field1569 - 1] = class281.method6324(var12);
                        } else if (var29 == 27) {
                           var12 = var7[var5];
                           class220.method4911(var12, class46.field659[--class124.field1569]);
                        } else if (var29 == 31) {
                           class124.field1569 -= 2;
                           if (class46.field659[class124.field1569] <= class46.field659[class124.field1569 + 1]) {
                              var5 += var7[var5];
                           }
                        } else if (var29 == 32) {
                           class124.field1569 -= 2;
                           if (class46.field659[class124.field1569] >= class46.field659[class124.field1569 + 1]) {
                              var5 += var7[var5];
                           }
                        } else if (var29 == 33) {
                           class46.field659[++class124.field1569 - 1] = class279.field3277[var7[var5]];
                        } else if (var29 == 34) {
                           class279.field3277[var7[var5]] = class46.field659[--class124.field1569];
                        } else if (var29 == 35) {
                           class46.field660[++class46.field658 - 1] = class46.field671[var7[var5]];
                        } else if (var29 == 36) {
                           class46.field671[var7[var5]] = class46.field660[--class46.field658];
                        } else if (var29 == 37) {
                           var12 = var7[var5];
                           class46.field658 -= var12;
                           var19 = class85.method2824(class46.field660, class46.field658, var12);
                           class46.field660[++class46.field658 - 1] = var19;
                        } else if (var29 == 38) {
                           --class124.field1569;
                        } else if (var29 == 39) {
                           --class46.field658;
                        } else if (var29 == 40) {
                           if (class46.field662 == 50) {
                              throw new RuntimeException();
                           }

                           var12 = var7[var5];
                           class55 var33 = class324.method7033(var12);
                           int[] var14 = new int[var33.field799];
                           Object[] var15 = new Object[var33.field797];
                           if (var33.field802 >= 0) {
                              System.arraycopy(class46.field659, class124.field1569 - var33.field802 + 0, var14, 0, var33.field802);
                           }

                           if (var33.field804 >= 0) {
                              System.arraycopy(class46.field660, class46.field658 - var33.field804 + 0, var15, 0, var33.field804);
                           }

                           class124.field1569 -= var33.field802;
                           class46.field658 -= var33.field804;
                           class38 var16 = new class38();
                           var16.field259 = var1;
                           var16.field255 = var5;
                           var16.field258 = class279.field3277;
                           var16.field254 = class46.field671;
                           class46.field663[++class46.field662 - 1] = var16;
                           var1 = var33;
                           var6 = var33.field796;
                           var7 = var33.field801;
                           var5 = -1;
                           class279.field3277 = var14;
                           class46.field671 = var15;
                        } else if (var29 == 42) {
                           class46.field659[++class124.field1569 - 1] = class516.field5478.method2916(var7[var5]);
                        } else if (var29 == 43) {
                           class516.field5478.method2881(var7[var5], class46.field659[--class124.field1569]);
                        } else if (var29 == 44) {
                           var12 = var7[var5] >> 16;
                           var13 = var7[var5] & '\uffff';
                           int var21 = class46.field659[--class124.field1569];
                           if (var21 < 0 || var21 > 5000) {
                              throw new RuntimeException();
                           }

                           if (var13 == 115) {
                              class46.field671[var12] = new class519(class574.field5824, "", var21, var21);
                           } else if (var13 != 105 && var13 != 49) {
                              class46.field671[var12] = new class519(class574.field5820, -1, var21, var21);
                           } else {
                              class46.field671[var12] = new class519(class574.field5820, 0, var21, var21);
                           }
                        } else {
                           class519 var20;
                           if (var29 == 45) {
                              var20 = class382.method8181(var7[var5], class46.field671[var7[var5]]);
                              var13 = class46.field659[--class124.field1569];
                              class517.method10309(var20, var13);
                              if (var20.field5504 == class574.field5820) {
                                 class46.field659[++class124.field1569 - 1] = var20.method10318()[var13];
                              } else {
                                 class46.field660[++class46.field658 - 1] = var20.method10321()[var13];
                              }
                           } else if (var29 == 46) {
                              var20 = class382.method8181(var7[var5], class46.field671[var7[var5]]);
                              if (!var20.field5501) {
                                 throw new RuntimeException();
                              }

                              if (var20.field5504 == class574.field5820) {
                                 class124.field1569 -= 2;
                                 var13 = class46.field659[class124.field1569];
                                 class517.method10309(var20, var13);
                                 var20.method10318()[var13] = class46.field659[class124.field1569 + 1];
                              } else {
                                 var13 = class46.field659[--class124.field1569];
                                 class517.method10309(var20, var13);
                                 var20.method10321()[var13] = class46.field660[--class46.field658];
                              }
                           } else if (var29 == 49) {
                              String var34 = class516.field5478.method2884(var7[var5]);
                              class46.field660[++class46.field658 - 1] = var34;
                           } else if (var29 == 50) {
                              class516.field5478.method2883(var7[var5], (String)class46.field660[--class46.field658]);
                           } else if (var29 == 60) {
                              class426 var35 = var1.field794[var7[var5]];
                              class543 var32 = (class543)var35.method8596((long)class46.field659[--class124.field1569]);
                              if (var32 != null) {
                                 var5 += var32.field5597;
                              }
                           } else if (var29 == 63) {
                              class46.field660[++class46.field658 - 1] = null;
                           } else {
                              Integer var36;
                              if (var29 == 74) {
                                 var36 = class234.field2805.method3968(var7[var5]);
                                 if (var36 == null) {
                                    class46.field659[++class124.field1569 - 1] = -1;
                                 } else {
                                    class46.field659[++class124.field1569 - 1] = var36;
                                 }
                              } else {
                                 if (var29 != 76) {
                                    throw new IllegalStateException();
                                 }

                                 var36 = class256.field3085.method10439(var7[var5]);
                                 if (var36 == null) {
                                    class46.field659[++class124.field1569 - 1] = -1;
                                 } else {
                                    class46.field659[++class124.field1569 - 1] = var36;
                                 }
                              }
                           }
                        }
                     } else {
                        boolean var30 = var1.field801[var5] == 1;
                        var13 = class198.method4393(var29, var1, var30);
                        switch(var13) {
                        case 0:
                           var26 = false;
                           break label896;
                        case 1:
                        default:
                           break;
                        case 2:
                           throw new IllegalStateException();
                        }
                     }
                  }
               } catch (Exception var27) {
                  var9 = true;
                  StringBuilder var23 = new StringBuilder(30);
                  var23.append("").append(var1.field5600).append(" ");

                  for(var12 = class46.field662 - 1; var12 >= 0; --var12) {
                     var23.append("").append(class46.field663[var12].field259.field5600).append(" ");
                  }

                  var23.append("").append(var8);
                  class508.method10161(var23.toString(), var27);
                  var26 = false;
                  break label907;
               }
            } finally {
               if (var26) {
                  while(!class46.field669.isEmpty()) {
                     class83 var18 = (class83)class46.field669.remove(0);
                     class311.method6928(var18.method2781(), var18.method2782(), var18.method2783(), var18.method2787(), "");
                  }

                  if (class46.field667) {
                     class46.field667 = false;
                     class10.method104();
                  }

                  if (!var9 && var3 > 0 && class46.field653 >= var3) {
                     class508.method10161("Warning: Script " + var1.field795 + " finished at op count " + class46.field653 + " of max " + var2, (Throwable)null);
                  }

               }
            }

            while(!class46.field669.isEmpty()) {
               class83 var31 = (class83)class46.field669.remove(0);
               class311.method6928(var31.method2781(), var31.method2782(), var31.method2783(), var31.method2787(), "");
            }

            if (class46.field667) {
               class46.field667 = false;
               class10.method104();
            }

            if (!var9 && var3 > 0 && class46.field653 >= var3) {
               class508.method10161("Warning: Script " + var1.field795 + " finished at op count " + class46.field653 + " of max " + var2, (Throwable)null);
            }

            return;
         }

         while(!class46.field669.isEmpty()) {
            class83 var38 = (class83)class46.field669.remove(0);
            class311.method6928(var38.method2781(), var38.method2782(), var38.method2783(), var38.method2787(), "");
         }

         if (class46.field667) {
            class46.field667 = false;
            class10.method104();
         }

         if (!var9 && var3 > 0 && class46.field653 >= var3) {
            class508.method10161("Warning: Script " + var1.field795 + " finished at op count " + class46.field653 + " of max " + var2, (Throwable)null);
         }

         return;
      }

      while(!class46.field669.isEmpty()) {
         class83 var22 = (class83)class46.field669.remove(0);
         class311.method6928(var22.method2781(), var22.method2782(), var22.method2783(), var22.method2787(), "");
      }

      if (class46.field667) {
         class46.field667 = false;
         class10.method104();
      }

      if (!var9 && var3 > 0 && class46.field653 >= var3) {
         class508.method10161("Warning: Script " + var1.field795 + " finished at op count " + class46.field653 + " of max " + var2, (Throwable)null);
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "([I[IIII)V",
      garbageValue = "2071091239"
   )
   public static void method5777(int[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         int var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;
         int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

         for(int var9 = var2; var9 < var3; ++var9) {
            if (var0[var9] < (var9 & var8) + var6) {
               int var10 = var0[var9];
               var0[var9] = var0[var5];
               var0[var5] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var5];
               var1[var5++] = var11;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         method5777(var0, var1, var2, var5 - 1);
         method5777(var0, var1, var5 + 1, var3);
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "874983861"
   )
   public static boolean method5776(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }
}
