package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
public enum class67 implements class430 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lcl;"
   )
   field920(0, -1),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lcl;"
   )
   field915(1, 1),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lcl;"
   )
   field916(2, 7),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lcl;"
   )
   field922(3, 8),
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lcl;"
   )
   field914(4, 9);

   @ObfuscatedName("av")
   public static byte[][][] ByteArrayPool_arrays;
   @ObfuscatedName("lg")
   @ObfuscatedGetter(
      intValue = -1034470859
   )
   static int field918;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1899899125
   )
   final int field919;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1965814625
   )
   final int field921;

   class67(int var3, int var4) {
      this.field919 = var3;
      this.field921 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1935172756"
   )
   public int vmethod11658() {
      return this.field921;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpx;I)V",
      garbageValue = "1508982215"
   )
   public static void method2156(class412 var0) {
      class181.field1977 = var0;
   }

   @ObfuscatedName("ml")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "1443965317"
   )
   static final void method2160(int var0, int var1, int var2, int var3) {
      if (client.field357 == 0 && !client.field529) {
         class304.method6832(var0 - var2, var1 - var3);
      }

      long var4 = -1L;
      int var6 = 0;
      long var7 = -1L;
      int var9 = 0;

      while(true) {
         int var11 = class242.field2967;
         if (var9 >= var11) {
            if (-1L != var4) {
               var9 = (int)(var4 >>> 0 & 127L);
               var11 = class144.method3737(var4);
               class69 var12 = (class69)class333.field3836.field1169.method8567((long)client.field519);
               class121.method3518(var12, client.field519, var9, var11, var6);
            }

            return;
         }

         long var31 = class242.field2968[var9];
         if (var31 != var7) {
            label517: {
               var7 = var31;
               int var16 = class206.method4513(var9);
               int var17 = class144.method3737(class242.field2968[var9]);
               int var18 = var17;
               int var19 = class454.method9179(var9);
               int var20 = class213.method4735(var9);
               int var21 = class123.method3543(var9);
               class505 var22 = null;
               class79 var23 = null;
               var22 = (class505)class333.field3836.field1171.method8596((long)var21);
               if (var21 >= 0 && var22 != null) {
                  if (var22.method10065()) {
                     break label517;
                  }

                  var23 = var22.field5429;
               } else if (var21 == -1) {
                  var22 = null;
                  var23 = class333.field3836;
               }

               if (var23 != null) {
                  int var24 = class122.method3535(var21, var22, var23);
                  if (var24 != -1) {
                     label496: {
                        int var28;
                        String[] var42;
                        if (var19 == 2 && var23.field1159.method5169(var24, var16, var17, var31) >= 0) {
                           class212 var25 = class433.method8669(var20);
                           if (var25.field2355 != null) {
                              var25 = var25.method4611();
                           }

                           if (var25 == null) {
                              break label496;
                           }

                           class74 var26 = null;

                           for(class74 var27 = (class74)var23.field1158.method8690(); var27 != null; var27 = (class74)var23.field1158.method8692()) {
                              if (var24 == var27.field1026 && var16 == var27.field1022 && var18 == var27.field1036 && var20 == var27.field1027) {
                                 var26 = var27;
                                 break;
                              }
                           }

                           if (!class304.field3470 && client.field357 == 1) {
                              class423.method8546("Use", client.field528 + " " + "->" + " " + class134.method3619(65535) + var25.field2337, 1, var20, var16, var18, -1, false, var21);
                           } else if (client.field529) {
                              if (!class304.field3470 && (class337.field3865 & 4) == 4) {
                                 class423.method8546(client.field374, client.field533 + " " + "->" + " " + class134.method3619(65535) + var25.field2337, 2, var20, var16, var18, -1, false, var21);
                              }
                           } else {
                              var42 = var25.field2341;
                              if (var42 != null) {
                                 for(var28 = 4; var28 >= 0; --var28) {
                                    if (!class304.field3470 && (var26 == null || var26.method2400(var28))) {
                                       String var29 = var42[var28];
                                       if (var26 != null && var26.method2408(var28)) {
                                          var29 = var26.method2402(var28);
                                       }

                                       if (var29 != null) {
                                          short var30 = 0;
                                          if (var28 == 0) {
                                             var30 = 3;
                                          }

                                          if (var28 == 1) {
                                             var30 = 4;
                                          }

                                          if (var28 == 2) {
                                             var30 = 5;
                                          }

                                          if (var28 == 3) {
                                             var30 = 6;
                                          }

                                          if (var28 == 4) {
                                             var30 = 1001;
                                          }

                                          class423.method8546(var29, class134.method3619(65535) + var25.field2337, var30, var20, var16, var18, -1, false, var21);
                                       }
                                    }
                                 }
                              }

                              class423.method8546("Examine", class134.method3619(65535) + var25.field2337, 1002, var25.field2321, var16, var18, -1, false, var21);
                           }
                        }

                        int var33;
                        class81 var43;
                        int[] var44;
                        class69 var46;
                        if (var19 == 1) {
                           class81 var36 = (class81)var23.field1160.method8567((long)var20);
                           if (var36 == null) {
                              break label496;
                           }

                           if (var36.field1184.field2111 == 1 && (var36.field1055 & 127) == 64 && (var36.field1056 & 127) == 64) {
                              for(var33 = 0; var33 < var23.field1161.method9790(); ++var33) {
                                 var43 = (class81)var23.field1160.method8567((long)var23.field1161.method9787(var33));
                                 if (var43 != null && var36 != var43 && var43.field1184.field2111 == 1 && var36.field1055 == var43.field1055 && var36.field1056 == var43.field1056) {
                                    class34.method665(var43, var43.field1103, var16, var18, var21);
                                 }
                              }

                              var33 = client.field335.field1254;
                              var44 = client.field335.field1243;

                              for(var28 = 0; var28 < var33; ++var28) {
                                 var46 = (class69)var23.field1169.method8567((long)var44[var28]);
                                 if (var46 != null && var36.field1055 == var46.field1055 && var46.field1056 == var36.field1056) {
                                    class121.method3518(var46, var44[var28], var16, var18, var21);
                                 }
                              }
                           }

                           class34.method665(var36, var20, var16, var18, var21);
                        }

                        if (var19 == 0) {
                           class69 var37 = (class69)var23.field1169.method8567((long)var20);
                           if (var37 == null) {
                              break label496;
                           }

                           if ((var37.field1055 & 127) == 64 && (var37.field1056 & 127) == 64) {
                              for(var33 = 0; var33 < var23.field1161.method9790(); ++var33) {
                                 var43 = (class81)var23.field1160.method8567((long)var23.field1161.method9787(var33));
                                 if (var43 != null && var43.field1184.field2111 == 1 && var43.field1055 == var37.field1055 && var37.field1056 == var43.field1056) {
                                    class34.method665(var43, var23.field1161.method9787(var33), var16, var18, var21);
                                 }
                              }

                              var33 = client.field335.field1254;
                              var44 = client.field335.field1243;

                              for(var28 = 0; var28 < var33; ++var28) {
                                 var46 = (class69)var23.field1169.method8567((long)var44[var28]);
                                 if (var46 != null && var46 != var37 && var37.field1055 == var46.field1055 && var46.field1056 == var37.field1056) {
                                    class121.method3518(var46, var44[var28], var16, var18, var21);
                                 }
                              }
                           }

                           if (var20 != client.field519) {
                              class121.method3518(var37, var20, var16, var18, var21);
                           } else {
                              var4 = var31;
                              var6 = var21;
                           }
                        }

                        if (var19 == 3) {
                           class436 var38 = var23.field1167[var24][var16][var18];
                           if (var38 != null) {
                              for(class85 var39 = (class85)var38.method8691(); var39 != null; var39 = (class85)var38.method8693()) {
                                 class213 var45 = class84.method2800(var39.field1221);
                                 if (!class61.field860 && client.field357 == 1) {
                                    class423.method8546("Use", client.field528 + " " + "->" + " " + class134.method3619(16748608) + var45.field2428, 16, var39.field1221, var16, var18, -1, false, var21);
                                 } else if (client.field529) {
                                    if (!class61.field860 && (class337.field3865 & 1) == 1) {
                                       class423.method8546(client.field374, client.field533 + " " + "->" + " " + class134.method3619(16748608) + var45.field2428, 17, var39.field1221, var16, var18, -1, false, var21);
                                    }
                                 } else {
                                    String[] var35 = var45.field2403;

                                    for(int var34 = 4; var34 >= 0; --var34) {
                                       if (!class61.field860 && var39.method2820(var34)) {
                                          if (var35 != null && var35[var34] != null) {
                                             byte var47 = 0;
                                             if (var34 == 0) {
                                                var47 = 18;
                                             }

                                             if (var34 == 1) {
                                                var47 = 19;
                                             }

                                             if (var34 == 2) {
                                                var47 = 20;
                                             }

                                             if (var34 == 3) {
                                                var47 = 21;
                                             }

                                             if (var34 == 4) {
                                                var47 = 22;
                                             }

                                             class423.method8546(var35[var34], class134.method3619(16748608) + var45.field2428, var47, var39.field1221, var16, var18, -1, false, var21);
                                          } else if (var34 == 2) {
                                             class423.method8546("Take", class134.method3619(16748608) + var45.field2428, 20, var39.field1221, var16, var18, -1, false, var21);
                                          }
                                       }
                                    }

                                    class423.method8546("Examine", class134.method3619(16748608) + var45.field2428, 1004, var39.field1221, var16, var18, -1, false, var21);
                                 }
                              }
                           }
                        }

                        if (var19 == 4) {
                           class505 var40 = (class505)var23.field1171.method8596((long)var20);
                           if (var40 != null) {
                              class203 var41 = var40.field5425;
                              if (client.field357 == 1) {
                                 class423.method8546("Use", client.field528 + " " + "->" + " " + class134.method3619(65280) + var41.field2233, 61, var20, var16, var18, -1, false, var21);
                              } else if (!client.field529) {
                                 var42 = var41.field2234;
                                 if (var42 != null) {
                                    for(var28 = 4; var28 >= 0; --var28) {
                                       if (var40.method10076(var28) && var42[var28] != null) {
                                          byte var48 = 0;
                                          if (var28 == 0) {
                                             var48 = 63;
                                          }

                                          if (var28 == 1) {
                                             var48 = 64;
                                          }

                                          if (var28 == 2) {
                                             var48 = 65;
                                          }

                                          if (var28 == 3) {
                                             var48 = 66;
                                          }

                                          if (var28 == 4) {
                                             var48 = 67;
                                          }

                                          class423.method8546(var42[var28], class134.method3619(65280) + var41.field2233, var48, var20, var16, var18, -1, false, var21);
                                       }
                                    }
                                 }

                                 class423.method8546("Examine", class134.method3619(65280) + var41.field2233, 1013, var41.method4447(), var16, var18, -1, false, var21);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         ++var9;
      }
   }

   @ObfuscatedName("pq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1715705103"
   )
   static void method2155() {
      if (client.field377 && class76.field1108 != null) {
         int var0 = class76.field1108.field1039[0];
         int var1 = class76.field1108.field1107[0];
         if (var0 < 0 || 104 <= var0 || var1 < 0 || 104 <= var1) {
            return;
         }

         class172.field1930 = class76.field1108.field1055;
         int var2 = class413.method8434(class333.field3836, class76.field1108.field1055, class76.field1108.field1056, class333.field3836.field1170) - client.field558;
         if (var2 < class191.field2078) {
            class191.field2078 = var2;
         }

         class129.field1584 = class76.field1108.field1056;
         client.field377 = false;
      }

   }
}
