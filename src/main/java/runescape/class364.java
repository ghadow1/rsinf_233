package runescape;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
public class class364 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Loq;"
   )
   public class366 field4066 = new class366();
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lnp;"
   )
   class360 field4065 = new class360();
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lbu;"
   )
   class28 field4071 = new class28();
   @ObfuscatedName("ac")
   public Object[] field4067;
   @ObfuscatedName("ap")
   public Object[] field4068;
   @ObfuscatedName("aq")
   public Object[] field4069;
   @ObfuscatedName("ao")
   public Object[] field4070;

   class364() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ltj;Lwf;I)V",
      garbageValue = "765183961"
   )
   static void method7523(class505 var0, PacketBuffer var1) {
      int var2 = var1.method11196();
      if ((var2 & 1) != 0) {
      }

      if ((var2 & 2) != 0) {
         var0.method10075(var1.method11196());
      }

   }

   @ObfuscatedName("jg")
   @ObfuscatedSignature(
      descriptor = "(IIZB)V",
      garbageValue = "38"
   )
   static final void method7522(int var0, int var1, boolean var2) {
      if (!var2 || var0 != class269.field3187 || class201.field2210 != var1) {
         class269.field3187 = var0;
         class201.field2210 = var1;
         class121.updateGameState(25);
         client.field556 = true;
         class464.drawLoadingMessage("Loading - please wait.", true);
         int var3 = class333.field3836.field1164;
         int var4 = class333.field3836.field1165;
         class333.field3836.field1164 = (var0 - 6) * 8;
         class333.field3836.field1165 = (var1 - 6) * 8;
         int var5 = class333.field3836.field1164 - var3;
         int var6 = class333.field3836.field1165 - var4;
         int var7 = var5 * 128;
         int var8 = var6 * 128;

         int var11;
         int[] var10000;
         for(int var9 = 0; var9 < 65536; ++var9) {
            class81 var25 = (class81)class333.field3836.field1160.method8567((long)var9);
            if (var25 != null) {
               for(var11 = 0; var11 < 10; ++var11) {
                  var10000 = var25.field1039;
                  var10000[var11] -= var5;
                  var10000 = var25.field1107;
                  var10000[var11] -= var6;
               }

               var25.field1055 -= var7;
               var25.field1056 -= var8;
               var25.field1089 -= var5;
               var25.field1091 -= var6;
               var25.field1072 -= var5;
               var25.field1084 -= var6;
            }
         }

         Iterator var21 = class333.field3836.field1169.iterator();

         while(true) {
            class69 var28;
            do {
               if (!var21.hasNext()) {
                  for(int var10 = 0; var10 < 4095; ++var10) {
                     class505 var24 = (class505)class333.field3836.field1171.method8596((long)var10);
                     if (var24 != null) {
                        var24.method10079(-var7, -var8);
                     }
                  }

                  byte var26 = 0;
                  byte var27 = 104;
                  byte var12 = 1;
                  if (var5 < 0) {
                     var26 = 103;
                     var27 = -1;
                     var12 = -1;
                  }

                  byte var13 = 0;
                  byte var14 = 104;
                  byte var15 = 1;
                  if (var6 < 0) {
                     var13 = 103;
                     var14 = -1;
                     var15 = -1;
                  }

                  int var18;
                  for(int var16 = var26; var16 != var27; var16 += var12) {
                     for(int var23 = var13; var23 != var14; var23 += var15) {
                        var18 = var5 + var16;
                        int var19 = var23 + var6;

                        for(int var20 = 0; var20 < 4; ++var20) {
                           if (0 <= var18 && var18 < 104 && 0 <= var19 && var19 < 104) {
                              class333.field3836.field1167[var20][var16][var23] = class333.field3836.field1167[var20][var18][var19];
                           } else {
                              class333.field3836.field1167[var20][var16][var23] = null;
                           }
                        }
                     }
                  }

                  for(class74 var22 = (class74)class333.field3836.field1158.method8690(); var22 != null; var22 = (class74)class333.field3836.field1158.method8692()) {
                     var22.field1022 -= var5;
                     var22.field1036 -= var6;
                     if (var22.field1022 < 0 || 104 <= var22.field1022 || var22.field1036 < 0 || 104 <= var22.field1036) {
                        var22.vmethod10557();
                     }
                  }

                  if (client.field581 != 0) {
                     client.field581 -= var5;
                     client.field531 -= var6;
                  }

                  for(class53 var17 = (class53)client.field334.method8690(); var17 != null; var17 = (class53)client.field334.method8692()) {
                     var17.method1972(-var5, -var6);
                  }

                  class58.field836 = 0;
                  client.field474 = false;
                  class187.field2052 -= var5 << 7;
                  class10.field46 -= var6 << 7;
                  class172.field1930 -= var5 << 7;
                  class129.field1584 -= var6 << 7;
                  client.field552 -= var5 << 7;
                  client.field337 -= var6 << 7;
                  client.field576 = -1;
                  class333.field3836.field1174.method8685();

                  for(var18 = 0; var18 < 4; ++var18) {
                     class333.field3836.field1175[var18].method6165();
                  }

                  return;
               }

               var28 = (class69)var21.next();
            } while(var28 == null);

            for(var11 = 0; var11 < 10; ++var11) {
               var10000 = var28.field1039;
               var10000[var11] -= var5;
               var10000 = var28.field1107;
               var10000[var11] -= var6;
            }

            var28.field1055 -= var7;
            var28.field1056 -= var8;
            var28.field1089 -= var5;
            var28.field1091 -= var6;
            var28.field1072 -= var5;
            var28.field1084 -= var6;
         }
      }
   }

   @ObfuscatedName("oc")
   @ObfuscatedSignature(
      descriptor = "(Loi;I)Z",
      garbageValue = "-2084658164"
   )
   static boolean method7524(class369 var0) {
      return var0.field4166;
   }
}
