package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
public class class183 extends class540 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class320 field1988 = new class320(64);

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpx;Lpx;ZLrv;I)V",
      garbageValue = "-1353466985"
   )
   public static void method4177(class412 var0, class412 var1, boolean var2, class461 var3) {
      class142.field1720 = var0;
      class170.field1914 = var1;
      class303.field3465 = var2;
      class213.field2436 = class142.field1720.method8347(10);
      class213.field2394 = var3;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "0"
   )
   static int method4178(int var0, int var1) {
      for(int var2 = 0; var2 < 8; ++var2) {
         if (var1 <= var0 + 30) {
            return var2;
         }

         var0 += 30;
         var0 += var2 != 1 && var2 != 3 ? 5 : 20;
      }

      return 0;
   }

   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "827465654"
   )
   static int method4176(int var0, class55 var1, boolean var2) {
      class519 var8;
      class519 var9;
      if (var0 == 8000) {
         class46.field658 -= 2;
         var9 = class473.method9647(class46.field660[class46.field658], (String)null);
         var8 = (class519)class46.field660[class46.field658 + 1];
         class122.method3537(var9, var8);
         return 1;
      } else {
         int var3;
         int var4;
         class519 var5;
         if (var0 == 8001) {
            class124.field1569 -= 2;
            var3 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            var5 = class473.method9647(class46.field660[--class46.field658], (String)null);
            class516.method10308(var5, var3, var4);
            return 1;
         } else if (var0 == 8002) {
            var9 = (class519)class46.field660[--class46.field658];
            class46.field659[++class124.field1569 - 1] = var9 == null ? 1 : 0;
            return 1;
         } else if (var0 == 8003) {
            var9 = (class519)class46.field660[--class46.field658];
            class46.field659[++class124.field1569 - 1] = var9 != null ? var9.method10322() : 0;
            return 1;
         } else if (var0 == 8004) {
            class46.field658 -= 2;
            var9 = (class519)class46.field660[class46.field658];
            var8 = (class519)class46.field660[class46.field658 + 1];
            class46.field659[++class124.field1569 - 1] = class383.method8183(var9, var8);
            return 1;
         } else {
            class519 var7;
            int var10;
            Object var13;
            if (var0 == 8005) {
               class124.field1569 -= 3;
               var3 = class46.field659[class124.field1569];
               var4 = class46.field659[class124.field1569 + 1];
               var10 = class46.field659[class124.field1569 + 2];
               var13 = class60.method2082(var10);
               var7 = (class519)class46.field660[--class46.field658];
               class46.field659[++class124.field1569 - 1] = var7 != null ? class307.method6894(var7, var13, var3, var4) : -1;
               return 1;
            } else if (var0 == 8006) {
               class124.field1569 -= 3;
               var3 = class46.field659[class124.field1569];
               var4 = class46.field659[class124.field1569 + 1];
               var10 = class46.field659[class124.field1569 + 2];
               var13 = class60.method2082(var10);
               var7 = (class519)class46.field660[--class46.field658];
               class46.field659[++class124.field1569 - 1] = var7 != null ? class38.method741(var7, var13, var3, var4) : -1;
               return 1;
            } else if (var0 == 8007) {
               class124.field1569 -= 3;
               var3 = class46.field659[class124.field1569];
               var4 = class46.field659[class124.field1569 + 1];
               var10 = class46.field659[class124.field1569 + 2];
               var13 = class60.method2082(var10);
               var7 = (class519)class46.field660[--class46.field658];
               class46.field659[++class124.field1569 - 1] = var7 != null ? class336.method7098(var7, var13, var3, var4) : 0;
               return 1;
            } else {
               String var14;
               if (var0 == 8008) {
                  var9 = class473.method9647(class46.field660[--class46.field658], (String)null);
                  var4 = class556.method10842(var9);
                  if (var9.field5504 == class574.field5820) {
                     class46.field659[++class124.field1569 - 1] = var4 >= 0 ? var9.method10318()[var4] : -1;
                  } else {
                     if (var9.field5504 != class574.field5824) {
                        throw new IllegalStateException();
                     }

                     var14 = (String)((String)(var4 >= 0 ? var9.method10321()[var4] : null));
                     class46.field660[++class46.field658 - 1] = var14 != null ? var14 : "";
                  }

                  return 1;
               } else if (var0 == 8009) {
                  var9 = class473.method9647(class46.field660[--class46.field658], (String)null);
                  var4 = class158.method3884(var9);
                  if (var9.field5504 == class574.field5820) {
                     class46.field659[++class124.field1569 - 1] = var4 >= 0 ? var9.method10318()[var4] : -1;
                  } else {
                     if (var9.field5504 != class574.field5824) {
                        throw new IllegalStateException();
                     }

                     var14 = (String)((String)(var4 >= 0 ? var9.method10321()[var4] : null));
                     class46.field660[++class46.field658 - 1] = var14 != null ? var14 : "";
                  }

                  return 1;
               } else if (var0 == 8010) {
                  class124.field1569 -= 3;
                  var3 = class46.field659[class124.field1569];
                  var4 = class46.field659[class124.field1569 + 1];
                  var10 = class46.field659[class124.field1569 + 2];
                  var13 = class60.method2082(var10);
                  var7 = class473.method9647(class46.field660[--class46.field658], (String)null);
                  class355.method7409(var7, var13, var3, var4);
                  return 1;
               } else {
                  class519 var6;
                  if (var0 == 8011) {
                     class124.field1569 -= 3;
                     var3 = class46.field659[class124.field1569];
                     var4 = class46.field659[class124.field1569 + 1];
                     var10 = class46.field659[class124.field1569 + 2];
                     var6 = class473.method9647(class46.field660[--class46.field658], (String)null);
                     class280.method6323(var6, var3, 1, var4, var10);
                     return 1;
                  } else if (var0 == 8012) {
                     var9 = class473.method9647(class46.field660[--class46.field658], (String)null);
                     class186.method4250(var9);
                     return 1;
                  } else if (var0 == 8013) {
                     var3 = class46.field659[--class124.field1569];
                     var8 = class473.method9647(class46.field660[--class46.field658], (String)null);
                     class272.method6110(var8, var3);
                     return 1;
                  } else if (var0 == 8014) {
                     class124.field1569 -= 2;
                     var3 = class46.field659[class124.field1569];
                     var4 = class46.field659[class124.field1569 + 1];
                     var5 = class473.method9647(class46.field660[--class46.field658], (String)null);
                     class31.method478(var5, var3, var4);
                     return 1;
                  } else if (var0 == 8015) {
                     class124.field1569 -= 3;
                     var3 = class46.field659[class124.field1569];
                     var4 = class46.field659[class124.field1569 + 1];
                     var10 = class46.field659[class124.field1569 + 2];
                     class46.field658 -= 2;
                     var6 = class473.method9647(class46.field660[class46.field658], (String)null);
                     var7 = class473.method9647(class46.field660[class46.field658 + 1], (String)null);
                     class447.method8929(var6, var7, var3, var4, var10);
                     return 1;
                  } else if (var0 == 8016) {
                     var9 = class473.method9647(class46.field660[--class46.field658], (String)null);
                     class46.field659[++class124.field1569 - 1] = (int)class159.method3891(var9);
                     return 1;
                  } else if (var0 == 8017) {
                     var9 = class473.method9647(class46.field660[--class46.field658], (String)null);
                     var4 = class46.field659[--class124.field1569];
                     class46.field659[++class124.field1569 - 1] = class99.method3116(var9, var4);
                     return 1;
                  } else {
                     String var17;
                     if (var0 == 8018) {
                        class46.field658 -= 2;
                        String var16 = (String)class46.field660[class46.field658];
                        var17 = (String)class46.field660[class46.field658 + 1];
                        class46.field660[++class46.field658 - 1] = class271.method6073(var16, var17);
                        return 1;
                     } else if (var0 == 8019) {
                        class46.field658 -= 2;
                        var9 = class473.method9647(class46.field660[class46.field658], (String)null);
                        var17 = (String)class46.field660[class46.field658 + 1];
                        class46.field660[++class46.field658 - 1] = class73.method2396(var9, var17);
                        return 1;
                     } else {
                        class190 var12;
                        if (var0 == 8020) {
                           class124.field1569 -= 2;
                           var3 = class46.field659[class124.field1569];
                           var4 = class46.field659[class124.field1569 + 1];
                           var12 = class185.method4211(var4);
                           if (var3 != var12.field2067) {
                              throw new RuntimeException();
                           } else {
                              class46.field660[++class46.field658 - 1] = var12.method4290();
                              return 1;
                           }
                        } else if (var0 == 8021) {
                           class124.field1569 -= 2;
                           var3 = class46.field659[class124.field1569];
                           var4 = class46.field659[class124.field1569 + 1];
                           var12 = class185.method4211(var4);
                           if (var3 != var12.field2068) {
                              throw new RuntimeException();
                           } else {
                              class46.field660[++class46.field658 - 1] = var12.method4287();
                              return 1;
                           }
                        } else if (var0 == 8022) {
                           class124.field1569 -= 3;
                           var3 = class46.field659[class124.field1569];
                           var4 = class46.field659[class124.field1569 + 1];
                           var10 = class46.field659[class124.field1569 + 2];
                           if (var10 < var4) {
                              var10 = var4;
                           }

                           if (var4 >= 0 && var4 <= 5000 && var10 >= 0 && var10 <= 5000) {
                              if (var3 == 115) {
                                 class46.field660[++class46.field658 - 1] = new class519(class574.field5824, "", var4, var10);
                              } else if (var3 != 105 && var3 != 49) {
                                 class46.field660[++class46.field658 - 1] = new class519(class574.field5820, -1, var4, var10);
                              } else {
                                 class46.field660[++class46.field658 - 1] = new class519(class574.field5820, 0, var4, var10);
                              }

                              return 1;
                           } else {
                              throw new RuntimeException();
                           }
                        } else if (var0 == 8023) {
                           var3 = class46.field659[--class124.field1569];
                           var8 = class473.method9647(class46.field660[--class46.field658], (String)null);
                           if (var3 >= 0 && var3 <= 5000) {
                              var8.method10337(var3);
                              return 1;
                           } else {
                              throw new RuntimeException();
                           }
                        } else if (var0 == 8024) {
                           var3 = class46.field659[--class124.field1569];
                           Object var15 = class60.method2082(var3);
                           var5 = class473.method9647(class46.field660[--class46.field658], (String)null);
                           class390.method8218(var5, var5.method10322(), var15);
                           return 1;
                        } else {
                           Object var11;
                           if (var0 == 8025) {
                              class124.field1569 -= 2;
                              var3 = class46.field659[class124.field1569];
                              var4 = class46.field659[class124.field1569 + 1];
                              var11 = class60.method2082(var4);
                              var6 = class473.method9647(class46.field660[--class46.field658], (String)null);
                              class390.method8218(var6, var3, var11);
                              return 1;
                           } else if (var0 == 8026) {
                              var3 = class46.field659[--class124.field1569];
                              var8 = class473.method9647(class46.field660[--class46.field658], (String)null);
                              var11 = class10.method97(var8, var3);
                              class37.method739(var8.field5504, var11);
                              return 1;
                           } else if (var0 == 8027) {
                              class46.field658 -= 2;
                              var9 = class473.method9647(class46.field660[class46.field658], (String)null);
                              var8 = class473.method9647(class46.field660[class46.field658 + 1], (String)null);
                              class305.method6836(var9, var8, var9.method10322());
                              return 1;
                           } else if (var0 == 8028) {
                              var3 = class46.field659[--class124.field1569];
                              class46.field658 -= 2;
                              var8 = class473.method9647(class46.field660[class46.field658], (String)null);
                              var5 = class473.method9647(class46.field660[class46.field658 + 1], (String)null);
                              class305.method6836(var8, var5, var3);
                              return 1;
                           } else if (var0 == 8029) {
                              class124.field1569 -= 2;
                              var3 = class46.field659[class124.field1569];
                              var4 = class46.field659[class124.field1569 + 1];
                              var5 = class473.method9647(class46.field660[--class46.field658], (String)null);
                              class195.method4339(var5, var3, var4);
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

   @ObfuscatedName("kg")
   @ObfuscatedSignature(
      descriptor = "(IIIIIB)V",
      garbageValue = "1"
   )
   static void method4179(int var0, int var1, int var2, int var3, int var4) {
      class236.method5384(class484.field5343, var0, var1, var2, var3, var4);
   }
}
