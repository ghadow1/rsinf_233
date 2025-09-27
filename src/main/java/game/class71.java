package game;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
public class class71 {
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lwb;II)V",
      garbageValue = "-2147311425"
   )
   public static void method2239(class590 var0, int var1) {
      class37 var2 = new class37();
      var2.field246 = var0.method11196();
      var2.field248 = var0.method11202();
      var2.field247 = new int[var2.field246];
      var2.field249 = new int[var2.field246];
      var2.field245 = new Field[var2.field246];
      var2.field250 = new int[var2.field246];
      var2.field251 = new Method[var2.field246];
      var2.field252 = new byte[var2.field246][][];

      for(int var3 = 0; var3 < var2.field246; ++var3) {
         try {
            int var4 = var0.method11196();
            String var5;
            String var6;
            int var7;
            if (var4 != 0 && var4 != 1 && var4 != 2) {
               if (var4 == 3 || var4 == 4) {
                  var5 = var0.method11207();
                  var6 = var0.method11207();
                  var7 = var0.method11196();
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.method11207();
                  }

                  String var20 = var0.method11207();
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if (var4 == 3) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.method11202();
                        var10[var11] = new byte[var12];
                        var0.method11266(var10[var11], 0, var12);
                     }
                  }

                  var2.field247[var3] = var4;
                  Class[] var21 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var21[var12] = class534.method10507(var8[var12]);
                  }

                  Class var22 = class534.method10507(var20);
                  if (class534.method10507(var5).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = class534.method10507(var5).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                    /* if (Reflection.getMethodName(var16).equals(var6)) {
                        Class[] var17 = Reflection.getParameterTypes(var16);
                        if (var21.length == var17.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var21.length; ++var19) {
                              if (var17[var19] != var21[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if (var18 && var22 == var16.getReturnType()) {
                              var2.field251[var3] = var16;
                           }
                        }
                     }*/
                  }

                  var2.field252[var3] = var10;
               }
            } else {
               var5 = var0.method11207();
               var6 = var0.method11207();
               var7 = 0;
               if (var4 == 1) {
                  var7 = var0.method11202();
               }

               var2.field247[var3] = var4;
               var2.field250[var3] = var7;
               if (class534.method10507(var5).getClassLoader() == null) {
                  throw new SecurityException();
               }

              // var2.field245[var3] = Reflection.findField(class534.method10507(var5), var6);
            }
         } catch (ClassNotFoundException var24) {
            var2.field249[var3] = -1;
         } catch (SecurityException var25) {
            var2.field249[var3] = -2;
         } catch (NullPointerException var26) {
            var2.field249[var3] = -3;
         } catch (Exception var27) {
            var2.field249[var3] = -4;
         } catch (Throwable var28) {
            var2.field249[var3] = -5;
         }
      }

      class36.field241.method8749(var2);
   }

   @ObfuscatedName("kb")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIIZB)V",
      garbageValue = "-51"
   )
   static void method2240(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      class234.method5375(class484.field5343, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }
}
