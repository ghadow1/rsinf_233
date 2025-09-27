package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("be")
public class class41 {
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-1395797943"
   )
   static int method781(int var0, int var1, int var2) {
      int var3 = var0 >> 16 & 255;
      int var4 = var0 >> 8 & 255;
      int var5 = var0 & 255;
      int var6 = var1 >> 16 & 255;
      int var7 = var1 >> 8 & 255;
      int var8 = var1 & 255;
      int var9 = var3 + (var6 - var3 + 1) * var2 / 64 & 255;
      int var10 = var4 + (var7 - var4 + 1) * var2 / 64 & 255;
      int var11 = var5 + (var8 - var5 + 1) * var2 / 64 & 255;
      return var9 << 16 | var10 << 8 | var11;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2084416642"
   )
   static void method782() {
      class464.field5240.trim();
      if (class464.field5240.length() != 6) {
         class66.method2147("", "Please enter a 6-digit PIN.", "");
      } else {
         class38.field257 = Integer.parseInt(class464.field5240);
         class464.field5240 = "";
         class325.method7035(true);
         class66.method2147("", "Connecting to server...", "");
         class121.updateGameState(20);
      }
   }

   @ObfuscatedName("jr")
   @ObfuscatedSignature(
      descriptor = "(Ldr;IIIIIIB)V",
      garbageValue = "10"
   )
   static void method774(class79 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 >= 128 && 13056 >= var1 && var2 >= 128 && 13056 >= var2) {
         int var7 = class255.method5812(var0, var3, var4, var0.field1170, var6);
         int var8 = var7 - var5;
         var1 -= class187.field2052;
         var8 -= class174.field1940;
         var2 -= class10.field46;
         int var9 = class225.field2637[class401.field4855];
         int var10 = class225.field2636[class401.field4855];
         int var11 = class225.field2637[class302.field3460];
         int var12 = class225.field2636[class302.field3460];
         int var13 = var11 * var2 + var12 * var1 >> 16;
         var2 = var12 * var2 - var11 * var1 >> 16;
         var1 = var13;
         var13 = var10 * var8 - var9 * var2 >> 16;
         var2 = var10 * var2 + var8 * var9 >> 16;
         if (var2 >= 50) {
            client.field503 = client.field313 / 2 + client.field379 * var1 / var2;
            client.field504 = client.field378 / 2 + var13 * client.field379 / var2;
         } else {
            client.field503 = -1;
            client.field504 = -1;
         }

      } else {
         client.field503 = -1;
         client.field504 = -1;
      }
   }
}
