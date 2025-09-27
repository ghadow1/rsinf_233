package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
public class class268 {
   @ObfuscatedName("jp")
   static String field3179;
   @ObfuscatedName("ac")
   public String field3173;
   @ObfuscatedName("ap")
   public float[] field3178;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -2087214391
   )
   public int field3175;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1043538817
   )
   public int field3176;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -2135123207
   )
   public int field3177;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lkm;"
   )
   final class267 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lkm;)V"
   )
   class268(class267 var1) {
      this.this$0 = var1;
      this.field3178 = new float[4];
      this.field3175 = 1;
      this.field3176 = 1;
      this.field3177 = 0;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZB)I",
      garbageValue = "-23"
   )
   static int method6044(int var0, class55 var1, boolean var2) {
      int var3;
      int var16;
      int var17;
      class369 var20;
      class369 var24;
      if (var0 == 100) {
         class124.field1569 -= 4;
         var3 = class46.field659[class124.field1569];
         var17 = class46.field659[class124.field1569 + 1];
         var16 = class46.field659[class124.field1569 + 2];
         boolean var26 = class46.field659[class124.field1569 + 3] != 0;
         var24 = class119.field1554.method7476(var3);
         if (var24.field4147 != 0) {
            throw new RuntimeException("");
         } else {
            class59.method2081(var24, var16, var26, var1);
            var20 = new class369();
            var20.field4147 = var17;
            var20.field4164 = var20.field4144 = var24.field4144;
            var20.field4145 = var16 * -1618486649;
            var20.field4143 = true;
            if (var17 == 12) {
               class146.method3782(var20);
            }

            var24.field4286[var16] = var20;
            if (var2) {
               class19.field81 = var20;
            } else {
               class141.field1714 = var20;
            }

            class89.method2877(var24);
            return 1;
         }
      } else {
         class369 var4;
         class369 var19;
         if (var0 == 101) {
            var19 = var2 ? class19.field81 : class141.field1714;
            var4 = class119.field1554.method7476(var19.field4144);
            class296.method6771(var19, var4);
            class89.method2877(var4);
            return 1;
         } else if (var0 == 102) {
            --class124.field1569;
            var3 = class46.field659[class124.field1569];
            var4 = class119.field1554.method7476(var3);
            var4.field4286 = null;
            class89.method2877(var4);
            return 1;
         } else {
            class369 var6;
            if (var0 == 105) {
               class124.field1569 -= 3;
               var3 = class46.field659[class124.field1569];
               var17 = class46.field659[class124.field1569 + 1];
               var16 = class46.field659[class124.field1569 + 2];
               var6 = class119.field1554.method7476(var3);
               var24 = class119.field1554.method7477(var3, var17);
               if (var6 == null) {
                  throw new RuntimeException("");
               } else if (var17 < 0) {
                  throw new RuntimeException("");
               } else if (var24 == null) {
                  throw new RuntimeException("");
               } else if (var24.field4147 == 0) {
                  throw new RuntimeException("");
               } else {
                  class59.method2081(var6, var16, true, var1);
                  if (var24.field4165 != -1) {
                     var20 = class119.field1554.method7477(var3, var24.field4165);
                     class1.method11(var20, var16);
                  }

                  var20 = new class369(var24);
                  var20.field4145 = var16 * -1618486649;
                  if (var24.field4147 == 12) {
                     class146.method3782(var20);
                  }

                  var6.field4286[var16] = var20;
                  if (var2) {
                     class19.field81 = var20;
                  } else {
                     class141.field1714 = var20;
                  }

                  class89.method2877(var6);
                  return 1;
               }
            } else {
               class369 var5;
               if (var0 == 106) {
                  class124.field1569 -= 2;
                  var3 = class46.field659[class124.field1569];
                  var17 = class46.field659[class124.field1569 + 1];
                  var5 = var2 ? class19.field81 : class141.field1714;
                  if (var5 == null) {
                     throw new RuntimeException("");
                  } else {
                     var6 = class119.field1554.method7476(var5.field4164);
                     if (var5.field4147 != 0) {
                        throw new RuntimeException("");
                     } else if (var6.field4147 != 0) {
                        throw new RuntimeException();
                     } else {
                        class59.method2081(var6, var17, true, var1);
                        class1.method11(var5, var17);
                        var24 = new class369();
                        var24.field4147 = var3;
                        var24.field4164 = var24.field4144 = var6.field4144;
                        var24.field4165 = var5.field4145 * -217986249;
                        var24.field4145 = var17 * -1618486649;
                        var24.field4143 = true;
                        if (var3 == 12) {
                           class146.method3782(var24);
                        }

                        var6.field4286[var17] = var24;
                        if (var2) {
                           class19.field81 = var24;
                        } else {
                           class141.field1714 = var24;
                        }

                        class89.method2877(var6);
                        return 1;
                     }
                  }
               } else if (var0 == 107) {
                  class124.field1569 -= 2;
                  var3 = class46.field659[class124.field1569];
                  var17 = class46.field659[class124.field1569 + 1];
                  var5 = var2 ? class19.field81 : class141.field1714;
                  if (var5 == null) {
                     throw new RuntimeException("");
                  } else {
                     var6 = class119.field1554.method7477(var5.field4164, var5.field4165);
                     var24 = class119.field1554.method7476(var6.field4164);
                     if (var6.field4147 != 0) {
                        throw new RuntimeException("");
                     } else if (var24.field4147 != 0) {
                        throw new RuntimeException();
                     } else {
                        class59.method2081(var24, var17, true, var1);
                        class1.method11(var6, var17);
                        var20 = new class369();
                        var20.field4147 = var3;
                        var20.field4164 = var20.field4144 = var24.field4144;
                        var20.field4165 = var6.field4145 * -217986249;
                        var20.field4145 = var17 * -1618486649;
                        var20.field4143 = true;
                        if (var3 == 12) {
                           class146.method3782(var20);
                        }

                        var24.field4286[var17] = var20;
                        if (var2) {
                           class19.field81 = var20;
                        } else {
                           class141.field1714 = var20;
                        }

                        class89.method2877(var24);
                        return 1;
                     }
                  }
               } else if (var0 == 200) {
                  class124.field1569 -= 2;
                  var3 = class46.field659[class124.field1569];
                  var17 = class46.field659[class124.field1569 + 1];
                  var5 = var17 != -1 ? class119.field1554.method7477(var3, var17) : null;
                  class314.method6971(var5, var2);
                  return 1;
               } else if (var0 == 201) {
                  class314.method6971(class119.field1554.method7476(class46.field659[--class124.field1569]), var2);
                  return 1;
               } else if (var0 == 204) {
                  var19 = var2 ? class19.field81 : class141.field1714;
                  var4 = var19 != null ? class119.field1554.method7477(var19.field4164, var19.field4165) : null;
                  class314.method6971(var4, var2);
                  return 1;
               } else if (var0 == 205) {
                  var19 = var2 ? class19.field81 : class141.field1714;
                  var4 = var19 != null ? class119.field1554.method7476(var19.field4164) : null;
                  class314.method6971(var4, var2);
                  return 1;
               } else {
                  int var18;
                  if (var0 == 206) {
                     var19 = var2 ? class19.field81 : class141.field1714;
                     if (var19 == null) {
                        class46.field659[++class124.field1569 - 1] = 0;
                        return 1;
                     } else if (var19.field4145 * -217986249 == -1) {
                        class46.field659[++class124.field1569 - 1] = 0;
                        return 1;
                     } else {
                        var4 = class119.field1554.method7476(var19.field4164);
                        var5 = null;

                        for(var18 = var19.field4145 * -217986249 + 1; var18 < var4.field4286.length; ++var18) {
                           var24 = var4.field4286[var18];
                           if (var24 != null && var19.field4165 == var24.field4165) {
                              var5 = var24;
                              break;
                           }
                        }

                        class314.method6971(var5, var2);
                        return 1;
                     }
                  } else if (var0 == 207) {
                     var19 = var2 ? class19.field81 : class141.field1714;
                     if (var19 == null) {
                        class46.field659[++class124.field1569 - 1] = 0;
                        return 1;
                     } else if (var19.field4145 * -217986249 == -1) {
                        class46.field659[++class124.field1569 - 1] = 0;
                        return 1;
                     } else {
                        var4 = class119.field1554.method7476(var19.field4164);
                        var5 = null;

                        for(var18 = var19.field4145 * -217986249 - 1; var18 >= 0; --var18) {
                           var24 = var4.field4286[var18];
                           if (var24 != null && var19.field4165 == var24.field4165) {
                              var5 = var24;
                              break;
                           }
                        }

                        class314.method6971(var5, var2);
                        return 1;
                     }
                  } else if (var0 == 208) {
                     var19 = var2 ? class19.field81 : class141.field1714;
                     if (var19 == null) {
                        class46.field659[++class124.field1569 - 1] = 0;
                        return 1;
                     } else if (var19.field4147 != 0) {
                        class46.field659[++class124.field1569 - 1] = 0;
                        return 1;
                     } else {
                        var4 = class119.field1554.method7476(var19.field4164);
                        if (var4.field4286 == null) {
                           class46.field659[++class124.field1569 - 1] = 0;
                           return 1;
                        } else {
                           var16 = 0;

                           for(var18 = 0; var18 < var4.field4286.length; ++var18) {
                              var24 = var4.field4286[var18];
                              if (var24 != null && var19.field4145 * -217986249 == var24.field4165) {
                                 ++var16;
                              }
                           }

                           class46.field659[++class124.field1569 - 1] = var16;
                           return 1;
                        }
                     }
                  } else if (var0 == 209) {
                     var19 = var2 ? class19.field81 : class141.field1714;
                     class46.field659[++class124.field1569 - 1] = var19 != null ? var19.field4165 : -1;
                     return 1;
                  } else {
                     Object var7;
                     if (var0 == 210) {
                        var3 = class46.field659[--class124.field1569];
                        var17 = class46.field659[--class124.field1569];
                        Object var22 = class60.method2082(var3);
                        var18 = class46.field659[--class124.field1569];
                        var7 = class60.method2082(var17);
                        int var8 = class46.field659[--class124.field1569];
                        class208 var9 = class97.method3080(var8);
                        Object var10 = var9.method4524() ? var9.field2269 : var9.field2273;
                        Object var11 = null;
                        if (var18 >= 0) {
                           class208 var12 = class97.method3080(var18);
                           var11 = var12.method4524() ? var12.field2269 : var12.field2273;
                        }

                        class369 var25 = class119.field1554.method7476(class46.field659[--class124.field1569]);
                        class369 var13 = null;
                        if (var25 != null && var25.field4286 != null) {
                           for(int var14 = 0; var14 < var25.field4286.length; ++var14) {
                              class369 var15 = var25.field4286[var14];
                              if (var15 != null && (var8 < 0 || var15.method8004(var8, var10).equals(var7)) && (var18 < 0 || var15.method8004(var18, var11).equals(var22))) {
                                 var13 = var15;
                                 break;
                              }
                           }
                        }

                        class314.method6971(var13, var2);
                        return 1;
                     } else if (var0 == 211) {
                        class124.field1569 -= 3;
                        var3 = class46.field659[class124.field1569];
                        var4 = class119.field1554.method7476(class46.field659[class124.field1569 + 1]);
                        var16 = class46.field659[class124.field1569 + 2];
                        class46.field665.method7917(var3, var4, var16);
                        class46.field659[++class124.field1569 - 1] = class46.field665.method7904();
                        return 1;
                     } else if (var0 == 212) {
                        var3 = class46.field659[--class124.field1569];
                        var4 = var2 ? class19.field81 : class141.field1714;
                        if (var4.field4145 * -217986249 == -1) {
                           class46.field665.method7917(var3, var4, -1);
                        } else {
                           class46.field665.method7917(var3, class119.field1554.method7476(var4.field4164), var4.field4145 * -217986249);
                        }

                        class46.field659[++class124.field1569 - 1] = class46.field665.method7904();
                        return 1;
                     } else if (var0 == 213) {
                        class314.method6971(class46.field665.method7906(), var2);
                        return 1;
                     } else if (var0 == 214) {
                        class46.field659[++class124.field1569 - 1] = class46.field665.method7919();
                        return 1;
                     } else if (var0 == 215) {
                        class46.field660[++class46.field658 - 1] = class423.method8555(class46.field665.method7907());
                        return 1;
                     } else if (var0 == 216) {
                        var3 = class46.field659[--class124.field1569];
                        Object var21 = class60.method2082(var3);
                        var16 = class46.field659[--class124.field1569];
                        class208 var23 = class97.method3080(var16);
                        var7 = var23.method4524() ? var23.field2269 : var23.field2273;
                        class46.field665.method7908(var16, var21, var7);
                        class46.field659[++class124.field1569 - 1] = class46.field665.method7904();
                        return 1;
                     } else if (var0 == 217) {
                        var3 = class46.field659[--class124.field1569];
                        var4 = var2 ? class19.field81 : class141.field1714;
                        if (var4 == null) {
                           throw new RuntimeException("");
                        } else if (var4.field4147 != 0) {
                           throw new RuntimeException("");
                        } else {
                           var5 = class119.field1554.method7476(var4.field4164);
                           if (var5.field4147 != 0) {
                              throw new RuntimeException();
                           } else {
                              var6 = class273.method6113(var3, var5, var4);
                              class314.method6971(var6, var2);
                              return 1;
                           }
                        }
                     } else {
                        return 2;
                     }
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "54089534"
   )
   static int method6043(int var0, class55 var1, boolean var2) {
      int var3;
      if (var0 == 5504) {
         class124.field1569 -= 2;
         var3 = class46.field659[class124.field1569];
         int var4 = class46.field659[class124.field1569 + 1];
         if (!client.field474) {
            client.field415 = var3;
            client.field424 = var4;
         }

         return 1;
      } else if (var0 == 5505) {
         class46.field659[++class124.field1569 - 1] = client.field415;
         return 1;
      } else if (var0 == 5506) {
         class46.field659[++class124.field1569 - 1] = client.field424;
         return 1;
      } else if (var0 == 5530) {
         var3 = class46.field659[--class124.field1569];
         if (var3 < 0) {
            var3 = 0;
         }

         client.field558 = var3;
         return 1;
      } else if (var0 == 5531) {
         class46.field659[++class124.field1569 - 1] = client.field558;
         return 1;
      } else {
         return 2;
      }
   }
}
