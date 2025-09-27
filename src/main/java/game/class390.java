package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pz")
public class class390 {
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Lti;ILjava/lang/Object;I)V",
      garbageValue = "-1936454229"
   )
   public static void method8218(class519 var0, int var1, Object var2) {
      class374.method8144(var0);
      if (var1 >= 0 && var1 <= var0.field5502 * -1549457881) {
         var0.method10355(var0.field5502 * -1549457881 + 1);
         if (var1 < var0.field5502 * -1549457881) {
            class82.method2773(var0, var1, var0, var1 + 1, var0.field5502 * -1549457881 - var1);
         }

         var0.method10363(var1, var2);
         var0.field5502 += -698619497;
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZS)I",
      garbageValue = "25325"
   )
   static int method8217(int var0, class55 var1, boolean var2) {
      int var3;
      if (var0 == 6600) {
         var3 = class333.field3836.field1170;
         int var15 = (class76.field1108.field1055 >> 7) + class333.field3836.field1164;
         int var8 = (class76.field1108.field1056 >> 7) + class333.field3836.field1165;
         class232.method5361().method10649(var3, var15, var8, true);
         return 1;
      } else {
         class289 var9;
         if (var0 == 6601) {
            var3 = class46.field659[--class124.field1569];
            String var16 = "";
            var9 = class232.method5361().method10668(var3);
            if (var9 != null) {
               var16 = var9.method6430();
            }

            class46.field660[++class46.field658 - 1] = var16;
            return 1;
         } else if (var0 == 6602) {
            var3 = class46.field659[--class124.field1569];
            class232.method5361().method10650(var3);
            return 1;
         } else if (var0 == 6603) {
            class46.field659[++class124.field1569 - 1] = class232.method5361().method10751();
            return 1;
         } else if (var0 == 6604) {
            var3 = class46.field659[--class124.field1569];
            class232.method5361().method10796(var3);
            return 1;
         } else if (var0 == 6605) {
            class46.field659[++class124.field1569 - 1] = class232.method5361().method10667() ? 1 : 0;
            return 1;
         } else {
            class356 var14;
            if (var0 == 6606) {
               var14 = new class356(class46.field659[--class124.field1569]);
               class232.method5361().method10669(var14.field4026, var14.field4025);
               return 1;
            } else if (var0 == 6607) {
               var14 = new class356(class46.field659[--class124.field1569]);
               class232.method5361().method10797(var14.field4026, var14.field4025);
               return 1;
            } else if (var0 == 6608) {
               var14 = new class356(class46.field659[--class124.field1569]);
               class232.method5361().method10756(var14.field4027, var14.field4026, var14.field4025);
               return 1;
            } else if (var0 == 6609) {
               var14 = new class356(class46.field659[--class124.field1569]);
               class232.method5361().method10757(var14.field4027, var14.field4026, var14.field4025);
               return 1;
            } else if (var0 == 6610) {
               class46.field659[++class124.field1569 - 1] = class232.method5361().method10673();
               class46.field659[++class124.field1569 - 1] = class232.method5361().method10722();
               return 1;
            } else {
               class289 var11;
               if (var0 == 6611) {
                  var3 = class46.field659[--class124.field1569];
                  var11 = class232.method5361().method10668(var3);
                  if (var11 == null) {
                     class46.field659[++class124.field1569 - 1] = 0;
                  } else {
                     class46.field659[++class124.field1569 - 1] = var11.method6440().method7421();
                  }

                  return 1;
               } else if (var0 == 6612) {
                  var3 = class46.field659[--class124.field1569];
                  var11 = class232.method5361().method10668(var3);
                  if (var11 == null) {
                     class46.field659[++class124.field1569 - 1] = 0;
                     class46.field659[++class124.field1569 - 1] = 0;
                  } else {
                     class46.field659[++class124.field1569 - 1] = (var11.method6455() - var11.method6433() + 1) * 64;
                     class46.field659[++class124.field1569 - 1] = (var11.method6436() - var11.method6435() + 1) * 64;
                  }

                  return 1;
               } else if (var0 == 6613) {
                  var3 = class46.field659[--class124.field1569];
                  var11 = class232.method5361().method10668(var3);
                  if (var11 == null) {
                     class46.field659[++class124.field1569 - 1] = 0;
                     class46.field659[++class124.field1569 - 1] = 0;
                     class46.field659[++class124.field1569 - 1] = 0;
                     class46.field659[++class124.field1569 - 1] = 0;
                  } else {
                     class46.field659[++class124.field1569 - 1] = var11.method6433() * 64;
                     class46.field659[++class124.field1569 - 1] = var11.method6435() * 64;
                     class46.field659[++class124.field1569 - 1] = var11.method6455() * 64 + 64 - 1;
                     class46.field659[++class124.field1569 - 1] = var11.method6436() * 64 + 64 - 1;
                  }

                  return 1;
               } else if (var0 == 6614) {
                  var3 = class46.field659[--class124.field1569];
                  var11 = class232.method5361().method10668(var3);
                  if (var11 == null) {
                     class46.field659[++class124.field1569 - 1] = -1;
                  } else {
                     class46.field659[++class124.field1569 - 1] = var11.method6432();
                  }

                  return 1;
               } else if (var0 == 6615) {
                  var14 = class232.method5361().method10822();
                  if (var14 == null) {
                     class46.field659[++class124.field1569 - 1] = -1;
                     class46.field659[++class124.field1569 - 1] = -1;
                  } else {
                     class46.field659[++class124.field1569 - 1] = var14.field4026;
                     class46.field659[++class124.field1569 - 1] = var14.field4025;
                  }

                  return 1;
               } else if (var0 == 6616) {
                  class46.field659[++class124.field1569 - 1] = class232.method5361().method10651();
                  return 1;
               } else if (var0 == 6617) {
                  var14 = new class356(class46.field659[--class124.field1569]);
                  var11 = class232.method5361().method10642();
                  if (var11 == null) {
                     class46.field659[++class124.field1569 - 1] = -1;
                     class46.field659[++class124.field1569 - 1] = -1;
                     return 1;
                  } else {
                     int[] var12 = var11.method6424(var14.field4027, var14.field4026, var14.field4025);
                     if (var12 == null) {
                        class46.field659[++class124.field1569 - 1] = -1;
                        class46.field659[++class124.field1569 - 1] = -1;
                     } else {
                        class46.field659[++class124.field1569 - 1] = var12[0];
                        class46.field659[++class124.field1569 - 1] = var12[1];
                     }

                     return 1;
                  }
               } else {
                  class356 var5;
                  if (var0 == 6618) {
                     var14 = new class356(class46.field659[--class124.field1569]);
                     var11 = class232.method5361().method10642();
                     if (var11 == null) {
                        class46.field659[++class124.field1569 - 1] = -1;
                        class46.field659[++class124.field1569 - 1] = -1;
                        return 1;
                     } else {
                        var5 = var11.method6425(var14.field4026, var14.field4025);
                        if (var5 == null) {
                           class46.field659[++class124.field1569 - 1] = -1;
                        } else {
                           class46.field659[++class124.field1569 - 1] = var5.method7421();
                        }

                        return 1;
                     }
                  } else {
                     class356 var10;
                     if (var0 == 6619) {
                        class124.field1569 -= 2;
                        var3 = class46.field659[class124.field1569];
                        var10 = new class356(class46.field659[class124.field1569 + 1]);
                        class265.method5990(var3, var10, false);
                        return 1;
                     } else if (var0 == 6620) {
                        class124.field1569 -= 2;
                        var3 = class46.field659[class124.field1569];
                        var10 = new class356(class46.field659[class124.field1569 + 1]);
                        class265.method5990(var3, var10, true);
                        return 1;
                     } else if (var0 == 6621) {
                        class124.field1569 -= 2;
                        var3 = class46.field659[class124.field1569];
                        var10 = new class356(class46.field659[class124.field1569 + 1]);
                        var9 = class232.method5361().method10668(var3);
                        if (var9 == null) {
                           class46.field659[++class124.field1569 - 1] = 0;
                           return 1;
                        } else {
                           class46.field659[++class124.field1569 - 1] = var9.method6422(var10.field4027, var10.field4026, var10.field4025) ? 1 : 0;
                           return 1;
                        }
                     } else if (var0 == 6622) {
                        class46.field659[++class124.field1569 - 1] = class232.method5361().method10675();
                        class46.field659[++class124.field1569 - 1] = class232.method5361().method10723();
                        return 1;
                     } else if (var0 == 6623) {
                        var14 = new class356(class46.field659[--class124.field1569]);
                        var11 = class232.method5361().method10648(var14.field4027, var14.field4026, var14.field4025);
                        if (var11 == null) {
                           class46.field659[++class124.field1569 - 1] = -1;
                        } else {
                           class46.field659[++class124.field1569 - 1] = var11.method6438();
                        }

                        return 1;
                     } else if (var0 == 6624) {
                        class232.method5361().method10677(class46.field659[--class124.field1569]);
                        return 1;
                     } else if (var0 == 6625) {
                        class232.method5361().method10736();
                        return 1;
                     } else if (var0 == 6626) {
                        class232.method5361().method10679(class46.field659[--class124.field1569]);
                        return 1;
                     } else if (var0 == 6627) {
                        class232.method5361().method10789();
                        return 1;
                     } else {
                        boolean var13;
                        if (var0 == 6628) {
                           var13 = class46.field659[--class124.field1569] == 1;
                           class232.method5361().method10681(var13);
                           return 1;
                        } else if (var0 == 6629) {
                           var3 = class46.field659[--class124.field1569];
                           class232.method5361().method10682(var3);
                           return 1;
                        } else if (var0 == 6630) {
                           var3 = class46.field659[--class124.field1569];
                           class232.method5361().method10684(var3);
                           return 1;
                        } else if (var0 == 6631) {
                           class232.method5361().method10836();
                           return 1;
                        } else if (var0 == 6632) {
                           var13 = class46.field659[--class124.field1569] == 1;
                           class232.method5361().method10814(var13);
                           return 1;
                        } else {
                           boolean var7;
                           if (var0 == 6633) {
                              class124.field1569 -= 2;
                              var3 = class46.field659[class124.field1569];
                              var7 = class46.field659[class124.field1569 + 1] == 1;
                              class232.method5361().method10685(var3, var7);
                              return 1;
                           } else if (var0 == 6634) {
                              class124.field1569 -= 2;
                              var3 = class46.field659[class124.field1569];
                              var7 = class46.field659[class124.field1569 + 1] == 1;
                              class232.method5361().method10686(var3, var7);
                              return 1;
                           } else if (var0 == 6635) {
                              class46.field659[++class124.field1569 - 1] = class232.method5361().method10687() ? 1 : 0;
                              return 1;
                           } else if (var0 == 6636) {
                              var3 = class46.field659[--class124.field1569];
                              class46.field659[++class124.field1569 - 1] = class232.method5361().method10689(var3) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6637) {
                              var3 = class46.field659[--class124.field1569];
                              class46.field659[++class124.field1569 - 1] = class232.method5361().method10690(var3) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6638) {
                              class124.field1569 -= 2;
                              var3 = class46.field659[class124.field1569];
                              var10 = new class356(class46.field659[class124.field1569 + 1]);
                              var5 = class232.method5361().method10693(var3, var10);
                              if (var5 == null) {
                                 class46.field659[++class124.field1569 - 1] = -1;
                              } else {
                                 class46.field659[++class124.field1569 - 1] = var5.method7421();
                              }

                              return 1;
                           } else {
                              class307 var6;
                              if (var0 == 6639) {
                                 var6 = class232.method5361().method10700();
                                 if (var6 == null) {
                                    class46.field659[++class124.field1569 - 1] = -1;
                                    class46.field659[++class124.field1569 - 1] = -1;
                                 } else {
                                    class46.field659[++class124.field1569 - 1] = var6.vmethod6870();
                                    class46.field659[++class124.field1569 - 1] = var6.field3491.method7421();
                                 }

                                 return 1;
                              } else if (var0 == 6640) {
                                 var6 = class232.method5361().method10664();
                                 if (var6 == null) {
                                    class46.field659[++class124.field1569 - 1] = -1;
                                    class46.field659[++class124.field1569 - 1] = -1;
                                 } else {
                                    class46.field659[++class124.field1569 - 1] = var6.vmethod6870();
                                    class46.field659[++class124.field1569 - 1] = var6.field3491.method7421();
                                 }

                                 return 1;
                              } else {
                                 class184 var4;
                                 if (var0 == 6693) {
                                    var3 = class46.field659[--class124.field1569];
                                    var4 = class198.method4395(var3);
                                    if (var4.field1995 == null) {
                                       class46.field660[++class46.field658 - 1] = "";
                                    } else {
                                       class46.field660[++class46.field658 - 1] = var4.field1995;
                                    }

                                    return 1;
                                 } else if (var0 == 6694) {
                                    var3 = class46.field659[--class124.field1569];
                                    var4 = class198.method4395(var3);
                                    class46.field659[++class124.field1569 - 1] = var4.field2006;
                                    return 1;
                                 } else if (var0 == 6695) {
                                    var3 = class46.field659[--class124.field1569];
                                    var4 = class198.method4395(var3);
                                    if (var4 == null) {
                                       class46.field659[++class124.field1569 - 1] = -1;
                                    } else {
                                       class46.field659[++class124.field1569 - 1] = var4.field2004;
                                    }

                                    return 1;
                                 } else if (var0 == 6696) {
                                    var3 = class46.field659[--class124.field1569];
                                    var4 = class198.method4395(var3);
                                    if (var4 == null) {
                                       class46.field659[++class124.field1569 - 1] = -1;
                                    } else {
                                       class46.field659[++class124.field1569 - 1] = var4.field1993;
                                    }

                                    return 1;
                                 } else if (var0 == 6697) {
                                    class46.field659[++class124.field1569 - 1] = class235.field2810.field3512;
                                    return 1;
                                 } else if (var0 == 6698) {
                                    class46.field659[++class124.field1569 - 1] = class235.field2810.field3510.method7421();
                                    return 1;
                                 } else if (var0 == 6699) {
                                    class46.field659[++class124.field1569 - 1] = class235.field2810.field3511.method7421();
                                    return 1;
                                 } else {
                                    return 2;
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

   @ObfuscatedName("jb")
   @ObfuscatedSignature(
      descriptor = "(Ldr;IZI)V",
      garbageValue = "-944000169"
   )
   static void method8219(class79 var0, int var1, boolean var2) {
      class69 var3 = (class69)var0.field1169.method8567((long)var1);
      if (var3 != null && var3.vmethod2740() && !var3.field954) {
         int var4 = var3.field933;
         var3.field952 = false;
         if ((client.field565 && client.field335.field1254 > 50 || client.field335.field1254 > 200) && var2 && var3.method2416() == var3.field1060) {
            var3.field952 = true;
         }

         int var5 = var3.field1055 >> 7;
         int var6 = var3.field1056 >> 7;
         if (0 <= var5 && var5 < 104 && 0 <= var6 && var6 < 104) {
            long var7 = class123.method3544(0, 0, 0, 0, false, var3.field1103, var0.field1172);
            if (var3.field947 != null && client.field412 >= var3.field942 && client.field412 < var3.field943) {
               var3.field952 = false;
               var3.field941 = class255.method5812(var0, var3.field1055, var3.field1056, var4, var3.vmethod2763());
               var3.field941 -= var3.method2417();
               var3.field1087 = client.field412;
               var0.field1159.method5113(var4, var3.field1055, var3.field1056, var3.field941, 60, var3, var3.field1057, var7, var3.field948, var3.field949, var3.field953, var3.field946);
            } else {
               if ((var3.field1055 & 127) == 64 && (var3.field1056 & 127) == 64) {
                  if (var0.field1166[var5][var6] == client.field502) {
                     return;
                  }

                  var0.field1166[var5][var6] = client.field502;
               }

               var3.field941 = class255.method5812(var0, var3.field1055, var3.field1056, var4, var3.vmethod2763());
               var3.field941 -= var3.method2417();
               var3.field1087 = client.field412;
               var0.field1159.method5112(var4, var3.field1055, var3.field1056, var3.field941, 60, var3, var3.field1057, var7, var3.field1058);
            }
         }
      }

   }
}
