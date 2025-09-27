package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public class class303 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Llj;"
   )
   static final class303 field3463 = new class303(0);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Llj;"
   )
   static final class303 field3462 = new class303(1);
   @ObfuscatedName("ar")
   public static boolean field3465;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1922429309
   )
   final int field3464;

   class303(int var1) {
      this.field3464 = var1;
   }

   @ObfuscatedName("jy")
   @ObfuscatedSignature(
      descriptor = "(Ldr;IIIIB)V",
      garbageValue = "50"
   )
   static final void method6830(class79 var0, int var1, int var2, int var3, int var4) {
      client.field409 = 0;
      boolean var5 = false;
      int var6 = -1;
      int var7 = -1;
      int var8 = client.field335.field1254;
      int[] var9 = client.field335.field1243;

      int var10;
      for(var10 = 0; var10 < var8 + var0.field1161.method9790(); ++var10) {
         class75 var23;
         if (var10 < var8) {
            var23 = (class75)var0.field1169.method8567((long)var9[var10]);
            if (var9[var10] == client.field519) {
               var5 = true;
               var6 = var10;
               continue;
            }

            if (var23 == class76.field1108) {
               var7 = var10;
               continue;
            }
         } else {
            var23 = (class75)var0.field1160.method8567((long)var0.field1161.method9787(var10 - var8));
         }

         class10.method89(var0, var23, var10, var1, var2, var3, var4);
      }

      if (client.field391 && var7 != -1) {
         class10.method89(var0, class76.field1108, var7, var1, var2, var3, var4);
      }

      if (var5) {
         class10.method89(var0, (class75)var0.field1169.method8567((long)client.field519), var6, var1, var2, var3, var4);
      }

      for(var10 = 0; var10 < client.field409; ++var10) {
         int var11 = client.field493[var10];
         int var12 = client.field494[var10];
         int var13 = client.field496[var10];
         int var14 = client.field495[var10];
         boolean var15 = true;

         while(var15) {
            var15 = false;

            for(int var22 = 0; var22 < var10; ++var22) {
               if (var12 + 2 > client.field494[var22] - client.field495[var22] && var12 - var14 < client.field494[var22] + 2 && var11 - var13 < client.field493[var22] + client.field496[var22] && var13 + var11 > client.field493[var22] - client.field496[var22] && client.field494[var22] - client.field495[var22] < var12) {
                  var12 = client.field494[var22] - client.field495[var22];
                  var15 = true;
               }
            }
         }

         client.field503 = client.field493[var10];
         client.field504 = client.field494[var10] = var12;
         String var16 = client.field393[var10];
         if (client.field534 == 0) {
            int var17 = 16776960;
            if (client.field497[var10] < 6) {
               var17 = client.field425[client.field497[var10]];
            }

            if (client.field497[var10] == 6) {
               var17 = client.cycle % 20 < 10 ? 16711680 : 16776960;
            }

            if (client.field497[var10] == 7) {
               var17 = client.cycle % 20 < 10 ? 255 : '\uffff';
            }

            if (client.field497[var10] == 8) {
               var17 = client.cycle % 20 < 10 ? '뀀' : 8454016;
            }

            int var18;
            if (client.field497[var10] == 9) {
               var18 = 150 - client.field500[var10];
               if (var18 < 50) {
                  var17 = var18 * 1280 + 16711680;
               } else if (var18 < 100) {
                  var17 = 16776960 - (var18 - 50) * 327680;
               } else if (var18 < 150) {
                  var17 = (var18 - 100) * 5 + '\uff00';
               }
            }

            if (client.field497[var10] == 10) {
               var18 = 150 - client.field500[var10];
               if (var18 < 50) {
                  var17 = var18 * 5 + 16711680;
               } else if (var18 < 100) {
                  var17 = 16711935 - (var18 - 50) * 327680;
               } else if (var18 < 150) {
                  var17 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
               }
            }

            if (client.field497[var10] == 11) {
               var18 = 150 - client.field500[var10];
               if (var18 < 50) {
                  var17 = 16777215 - var18 * 327685;
               } else if (var18 < 100) {
                  var17 = (var18 - 50) * 327685 + '\uff00';
               } else if (var18 < 150) {
                  var17 = 16777215 - (var18 - 100) * 327680;
               }
            }

            int var19;
            if (client.field497[var10] == 12 && client.field586[var10] == null) {
               var18 = var16.length();
               client.field586[var10] = new int[var18];

               for(var19 = 0; var19 < var18; ++var19) {
                  int var20 = (int)(64.0F * ((float)var19 / (float)var18));
                  int var21 = var20 << 10 | 896 | 64;
                  client.field586[var10][var19] = class537.field5583[var21];
               }
            }

            if (client.field498[var10] == 0) {
               class333.field3831.method9430(var16, client.field503 + var1, var2 + client.field504, var17, 0, client.field586[var10]);
            }

            if (client.field498[var10] == 1) {
               class333.field3831.method9427(var16, client.field503 + var1, var2 + client.field504, var17, 0, client.cycle, client.field586[var10]);
            }

            if (client.field498[var10] == 2) {
               class333.field3831.method9428(var16, client.field503 + var1, var2 + client.field504, var17, 0, client.cycle, client.field586[var10]);
            }

            if (client.field498[var10] == 3) {
               class333.field3831.method9463(var16, client.field503 + var1, var2 + client.field504, var17, 0, client.cycle, 150 - client.field500[var10], client.field586[var10]);
            }

            if (client.field498[var10] == 4) {
               var18 = (150 - client.field500[var10]) * (class333.field3831.method9415(var16) + 100) / 150;
               class601.method11551(client.field503 + var1 - 50, var2, client.field503 + var1 + 50, var2 + var4);
               class333.field3831.method9431(var16, client.field503 + var1 + 50 - var18, var2 + client.field504, var17, 0, client.field586[var10]);
               class601.method11550(var1, var2, var3 + var1, var2 + var4);
            }

            if (client.field498[var10] == 5) {
               var18 = 150 - client.field500[var10];
               var19 = 0;
               if (var18 < 25) {
                  var19 = var18 - 25;
               } else if (var18 > 125) {
                  var19 = var18 - 125;
               }

               class601.method11551(var1, var2 + client.field504 - class333.field3831.field5251 - 1, var3 + var1, var2 + client.field504 + 5);
               class333.field3831.method9430(var16, client.field503 + var1, var19 + var2 + client.field504, var17, 0, client.field586[var10]);
               class601.method11550(var1, var2, var3 + var1, var2 + var4);
            }
         } else {
            class333.field3831.method9506(var16, client.field503 + var1, var2 + client.field504, 16776960, 0);
         }
      }

   }
}
