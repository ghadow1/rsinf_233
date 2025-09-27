package runescape;

import java.util.HashMap;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lp")
public class class304 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Llp;"
   )
   static final class304 field3471 = new class304(0);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Llp;"
   )
   static final class304 field3466 = new class304(1);
   @ObfuscatedName("ng")
   static boolean field3470;
   @ObfuscatedName("ok")
   static String field3472;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 944343001
   )
   final int field3468;

   class304(int var1) {
      this.field3468 = var1;
   }

   @ObfuscatedName("id")
   @ObfuscatedSignature(
      descriptor = "(Ldr;Lct;II)V",
      garbageValue = "-4277042"
   )
   static final void method6831(class79 var0, class75 var1, int var2) {
      class215 var4;
      int var5;
      int var6;
      int var7;
      int var9;
      int var13;
      int var19;
      if (var1.field1085 >= client.cycle) {
         class574.method11034(var1);
      } else {
         int var12;
         if (var1.field1094 >= client.cycle) {
            boolean var3 = client.cycle == var1.field1094 || !var1.method2420();
            if (!var3) {
               var4 = var1.field1074.method9581();
               if (var4 != null && !var4.method4768()) {
                  var3 = var1.field1074.method9627() + 1 > var4.field2460[var1.field1074.method9565()];
               } else {
                  var3 = true;
               }
            }

            if (var3) {
               var12 = var1.field1094 - var1.field1085;
               var5 = client.cycle - var1.field1085;
               var6 = var1.field1089 * 128 + var1.field1059 * 1610874880;
               var7 = var1.field1091 * 128 + var1.field1059 * 1610874880;
               var13 = var1.field1072 * 128 + var1.field1059 * 1610874880;
               var9 = var1.field1084 * 128 + var1.field1059 * 1610874880;
               var1.field1055 = (var5 * var13 + var6 * (var12 - var5)) / var12;
               var1.field1056 = (var5 * var9 + var7 * (var12 - var5)) / var12;
            }

            var1.field1104 = 0;
            var1.field1097 = var1.field1095;
            var1.field1057 = var1.field1097;
         } else {
            var19 = var1.field1060;
            if (var1.field1100 == 0) {
               var1.field1104 = 0;
               var1.method2438(var19);
            } else {
               label510: {
                  if (var1.method2420()) {
                     var4 = var1.field1074.method9581();
                     if (var1.field1040 > 0 && var4.field2492 == 0) {
                        ++var1.field1104;
                        var1.method2438(var19);
                        break label510;
                     }

                     if (var1.field1040 <= 0 && var4.field2485 == 0) {
                        ++var1.field1104;
                        var1.method2438(var19);
                        break label510;
                     }
                  }

                  var12 = var1.field1055;
                  var5 = var1.field1056;
                  var6 = var1.field1039[var1.field1100 - 1] * 128 + var1.field1059 * 1610874880;
                  var7 = var1.field1107[var1.field1100 - 1] * 128 + var1.field1059 * 1610874880;
                  if (var12 < var6) {
                     if (var5 < var7) {
                        var1.field1097 = 1280;
                     } else if (var5 > var7) {
                        var1.field1097 = 1792;
                     } else {
                        var1.field1097 = 1536;
                     }
                  } else if (var12 > var6) {
                     if (var5 < var7) {
                        var1.field1097 = 768;
                     } else if (var5 > var7) {
                        var1.field1097 = 256;
                     } else {
                        var1.field1097 = 512;
                     }
                  } else if (var5 < var7) {
                     var1.field1097 = 1024;
                  } else if (var5 > var7) {
                     var1.field1097 = 0;
                  }

                  class280 var8 = var1.field1054[var1.field1100 - 1];
                  if (var6 - var12 <= 256 && var6 - var12 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                     var9 = var1.field1097 - var1.field1057 & 2047;
                     if (var9 > 1024) {
                        var9 -= 2048;
                     }

                     var19 = var1.field1088;
                     if (var9 >= -256 && var9 <= 256) {
                        var19 = var1.field1063;
                     } else if (var9 >= 256 && var9 < 768) {
                        var19 = var1.field1066;
                     } else if (var9 >= -768 && var9 <= -256) {
                        var19 = var1.field1096;
                     }

                     if (var19 == -1) {
                        var19 = var1.field1063;
                     }

                     int var10 = 4;
                     boolean var11 = true;
                     if (var1 instanceof class81) {
                        var11 = ((class81)var1).field1184.field2120;
                     }

                     if (var11) {
                        if (var1.field1097 != var1.field1057 && var1.field1082 == -1 && var1.field1099 != 0) {
                           var10 = 2;
                        }

                        if (var1.field1100 > 2) {
                           var10 = 6;
                        }

                        if (var1.field1100 > 3) {
                           var10 = 8;
                        }

                        if (var1.field1104 > 0 && var1.field1100 > 1) {
                           var10 = 8;
                           --var1.field1104;
                        }
                     } else {
                        if (var1.field1100 > 1) {
                           var10 = 6;
                        }

                        if (var1.field1100 > 2) {
                           var10 = 8;
                        }

                        if (var1.field1104 > 0 && var1.field1100 > 1) {
                           var10 = 8;
                           --var1.field1104;
                        }
                     }

                     if (var8 == class280.field3282) {
                        var10 <<= 1;
                     } else if (var8 == class280.field3280) {
                        var10 >>= 1;
                     }

                     if (var10 >= 8) {
                        if (var19 == var1.field1063 && var1.field1067 != -1) {
                           var19 = var1.field1067;
                        } else if (var19 == var1.field1088 && var1.field1068 != -1) {
                           var19 = var1.field1068;
                        } else if (var19 == var1.field1096 && var1.field1065 != -1) {
                           var19 = var1.field1065;
                        } else if (var19 == var1.field1066 && var1.field1090 != -1) {
                           var19 = var1.field1090;
                        }
                     } else if (var10 <= 2) {
                        if (var19 == var1.field1063 && var1.field1071 != -1) {
                           var19 = var1.field1071;
                        } else if (var19 == var1.field1088 && var1.field1069 != -1) {
                           var19 = var1.field1069;
                        } else if (var19 == var1.field1096 && var1.field1061 != -1) {
                           var19 = var1.field1061;
                        } else if (var19 == var1.field1066 && var1.field1105 != -1) {
                           var19 = var1.field1105;
                        }
                     }

                     if (var6 != var12 || var5 != var7) {
                        if (var12 < var6) {
                           var1.field1055 += var10;
                           if (var1.field1055 > var6) {
                              var1.field1055 = var6;
                           }
                        } else if (var12 > var6) {
                           var1.field1055 -= var10;
                           if (var1.field1055 < var6) {
                              var1.field1055 = var6;
                           }
                        }

                        if (var5 < var7) {
                           var1.field1056 += var10;
                           if (var1.field1056 > var7) {
                              var1.field1056 = var7;
                           }
                        } else if (var5 > var7) {
                           var1.field1056 -= var10;
                           if (var1.field1056 < var7) {
                              var1.field1056 = var7;
                           }
                        }
                     }

                     if (var6 == var1.field1055 && var7 == var1.field1056) {
                        --var1.field1100;
                        if (var1.field1040 > 0) {
                           --var1.field1040;
                        }
                     }

                     var1.method2438(var19);
                  } else {
                     var1.field1055 = var6;
                     var1.field1056 = var7;
                     --var1.field1100;
                     if (var1.field1040 > 0) {
                        --var1.field1040;
                     }

                     var1.method2438(var19);
                  }
               }
            }
         }
      }

      if (var1.field1055 < 128 || 13184 <= var1.field1055 || var1.field1056 < 128 || 13184 <= var1.field1056) {
         var1.method2472();
         var1.field1085 = 0;
         var1.field1094 = 0;
         var1.method2465();
         var1.field1055 = var1.field1039[0] * 128 + var1.field1059 * 1610874880;
         var1.field1056 = var1.field1107[0] * 128 + var1.field1059 * 1610874880;
         var1.method2423();
      }

      if (var1 == class76.field1108 && (var1.field1055 < 1536 || 11776 <= var1.field1055 || var1.field1056 < 1536 || 11776 <= var1.field1056)) {
         var1.method2472();
         var1.field1085 = 0;
         var1.field1094 = 0;
         var1.method2465();
         var1.field1055 = var1.field1039[0] * 128 + var1.field1059 * 1610874880;
         var1.field1056 = var1.field1107[0] * 128 + var1.field1059 * 1610874880;
         var1.method2423();
      }

      if (var1.field1082 != -1) {
         class79 var14 = null;
         var4 = null;
         var5 = 65536;
         class75 var20;
         if (var1.field1082 >= var5) {
            var6 = var1.field1082 - var5;
            var14 = class418.method8493(var6, client.field333);
            var20 = (class75)var14.field1169.method8567((long)var6);
         } else {
            var7 = var1.field1082;
            class73 var23 = client.field333;
            Iterator var15 = var23.iterator();

            class79 var16;
            while(true) {
               if (var15.hasNext()) {
                  class79 var17 = (class79)var15.next();
                  if (var17.field1160.method8567((long)var7) == null) {
                     continue;
                  }

                  var16 = var17;
                  break;
               }

               var16 = var23.method2343();
               break;
            }

            var14 = var16;
            var20 = (class75)var16.field1160.method8567((long)var1.field1082);
         }

         if (var20 != null) {
            class452 var27 = class296.method6761((float)var1.field1055, 0.0F, (float)var1.field1056);
            class452 var18;
            if (var0.field1172 != var14.field1172) {
               class505 var24;
               if (var0.field1172 == -1) {
                  var24 = (class505)class333.field3836.field1171.method8596((long)var14.field1172);
                  var18 = var24.method10084(var20.field1055, var20.field1056);
               } else if (var14.field1172 == -1) {
                  var24 = (class505)class333.field3836.field1171.method8596((long)var0.field1172);
                  var18 = var24.method10107(var20.field1055, var20.field1056);
               } else {
                  var24 = (class505)class333.field3836.field1171.method8596((long)var14.field1172);
                  class505 var26 = (class505)class333.field3836.field1171.method8596((long)var0.field1172);
                  class452 var28 = var24.method10084(var20.field1055, var20.field1056);
                  var18 = var26.method10107((int)var28.field5175, (int)var28.field5169);
                  var28.method8992();
               }
            } else {
               var18 = class296.method6761((float)var20.field1055, 0.0F, (float)var20.field1056);
            }

            var13 = (int)(var27.field5175 - var18.field5175);
            var9 = (int)(var27.field5169 - var18.field5169);
            if (var13 != 0 || var9 != 0) {
               var1.field1097 = class371.method8118(var13, var9);
            }

            var27.method8992();
            var18.method8992();
         } else if (var1.field1048) {
            var1.field1082 = -1;
            var1.field1048 = false;
         }
      }

      if (var1.field1100 == 0 || var1.field1104 > 0) {
         var19 = -1;
         if (var1.field1049 != -1) {
            var19 = var1.field1049;
         }

         if (var19 != -1) {
            var1.field1097 = var19;
            if (var1.field1050) {
               var1.field1057 = var1.field1097;
            }
         }

         var1.method2432();
      }

      var19 = var1.field1097 - var1.field1057 & 2047;
      if (var19 != 0) {
         boolean var25 = true;
         boolean var21 = true;
         ++var1.field1098;
         var6 = var19 > 1024 ? -1 : 1;
         var1.field1057 += var6 * var1.field1099;
         boolean var22 = true;
         if (var19 < var1.field1099 || var19 > 2048 - var1.field1099) {
            var1.field1057 = var1.field1097;
            var22 = false;
         }

         if (var1.field1099 > 0 && var1.method2416() == var1.field1060 && (var1.field1098 > 25 || var22)) {
            if (var6 == -1 && var1.field1064 != -1) {
               var1.method2438(var1.field1064);
            } else if (var6 == 1 && var1.field1062 != -1) {
               var1.method2438(var1.field1062);
            } else {
               var1.method2438(var1.field1063);
            }
         }

         var1.field1057 &= 2047;
      } else {
         if (var1.field1048) {
            var1.field1082 = -1;
            var1.field1048 = false;
         }

         var1.field1098 = 0;
      }

      class470.method9640(var0, var1);
   }

   @ObfuscatedName("lz")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "220324664"
   )
   static final void method6832(int var0, int var1) {
      int[] var2 = new int[client.field333.method2349()];
      float[] var3 = new float[client.field333.method2349()];
      int var4 = 0;

      for(Iterator var5 = client.field333.iterator(); var5.hasNext(); ++var4) {
         class79 var22 = (class79)var5.next();
         var2[var4] = var22.field1172;
         var3[var4] = var22.field1159.field2719;
      }

      class290.method6637(var3, var2);
      HashMap var23 = new HashMap();

      for(var4 = var2.length - 1; var4 >= 0; --var4) {
         if (var3[var4] > 0.0F || var2[var4] == -1) {
            class518 var24 = client.field333.method2352(var2[var4]);
            if (!var23.containsKey(var24)) {
               var23.put(var24, var2[var4]);
            }
         }
      }

      for(var4 = 0; var4 < var2.length; ++var4) {
         int var6 = var2[var4];
         class518 var7 = client.field333.method2352(var6);
         Integer var8 = (Integer)var23.get(var7);
         if (var8 != null && var8.equals(var6)) {
            if (var7 == class518.field5493) {
               class423.method8546("Walk here", "", 23, 0, var0, var1, 0, false, var6);
            } else if (var7 == class518.field5494) {
               int var9 = client.field313 / 2;
               int var10 = client.field378 / 2;
               int var11 = client.field379;
               class452 var12 = class209.method4561(class333.field3836.field1159, client.field512, class187.field2052, class174.field1940, class10.field46, var9, var10, var11);
               if (var12 != null) {
                  class452 var13 = class296.method6761((float)client.field552, (float)client.field512, (float)client.field337);
                  class452 var15 = class334.method7060(var12);
                  var15.method9052(var13);
                  class452 var16 = class422.method8536(class452.field5170, var15);
                  float var17 = (float)Math.atan2((double)class74.method2413(var16, class452.field5174), (double)class74.method2413(class452.field5170, var15));
                  int var18 = (int)(2048.0D * ((double)var17 / 6.283185307179586D)) & 2047;
                  int var21 = var18 + 64;
                  int var20 = (var21 & 2047) / 128;
                  class423.method8546("Set heading", "", 60, var20, 0, 0, 0, false, var6);
                  var13.method8992();
                  var15.method8992();
                  var16.method8992();
                  var12.method8992();
               }
            }
         }
      }

   }
}
