package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public final class class4 {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 47249087
   )
   public static int field8;
   @ObfuscatedName("bz")
   static boolean field9;
   @ObfuscatedName("go")
   @ObfuscatedSignature(
      descriptor = "Loc;"
   )
   static class384 field7;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lre;Lre;I)Lre;",
      garbageValue = "1274021437"
   )
   public static final class452 method18(class452 var0, class452 var1) {
      class452 var2 = class334.method7060(var0);
      var2.method8997(var1);
      return var2;
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-239212976"
   )
   static int method16(int var0) {
      return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
   }

   @ObfuscatedName("if")
   @ObfuscatedSignature(
      descriptor = "(Loi;III)V",
      garbageValue = "1388841937"
   )
   static final void method17(class369 var0, int var1, int var2) {
      if (client.field585 == 0 || client.field585 == 3) {
         if (!client.field521 && (class35.field222 == 1 || !class423.field5058 && class35.field222 == 4)) {
            class354 var3 = var0.method8005(class119.field1554, true);
            if (var3 == null) {
               return;
            }

            int var4 = class35.field221 - var1;
            int var5 = class35.field224 - var2;
            if (var3.method7394(var4, var5)) {
               var4 -= var3.field4019 / 2;
               var5 -= var3.field4020 / 2;
               int var6 = client.field424 & 2047;
               int var7 = class225.field2637[var6];
               int var8 = class225.field2636[var6];
               int var9 = var7 * var5 + var4 * var8 >> 11;
               int var10 = var8 * var5 - var4 * var7 >> 11;
               int var11 = var9 + client.field552 >> 7;
               int var12 = client.field337 - var10 >> 7;
               class518 var13 = client.field333.method2352(-1);
               if (var13 == class518.field5493) {
                  class455.method9187(var11, var12, var4, var5);
               } else if (var13 == class518.field5494) {
                  int var15 = var3.field4019 / 2 + var1;
                  int var16 = var3.field4020 / 2 + var2;
                  int var17 = class35.field231 - var15;
                  int var18 = class35.field220 - var16;
                  int var19 = class127.method3568(var18, var17);
                  var19 -= client.field424;
                  var19 &= 2047;
                  int var21 = var19 + 64;
                  int var20 = (var21 & 2047) / 128;
                  client.field583 = var20;
                  client.field584 = 30;
                  class204.method4499(client.field583);
               }
            }
         }

      }
   }
}
