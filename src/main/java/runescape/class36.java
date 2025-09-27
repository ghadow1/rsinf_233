package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bg")
public class class36 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lqn;"
   )
   public static class438 field241 = new class438();
   @ObfuscatedName("nq")
   @ObfuscatedSignature(
      descriptor = "Ldd;"
   )
   static class78 clientPreferences;
   @ObfuscatedName("sa")
   @ObfuscatedGetter(
      intValue = 1953671817
   )
   static int field240;

   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      descriptor = "(Ldr;ILjn;B)V",
      garbageValue = "-1"
   )
   static void method731(class79 var0, int var1, class241 var2) {
      boolean var3 = true;
      float var4 = (float)client.field378 / 334.0F;
      float var5 = 4.0F * (float)client.field379 / var4;
      int var6 = Math.max(512, (int)(1400.0F - var5));
      int var7 = client.field552 - (int)(class215.method4817(var1) * (double)var6);
      int var8 = client.field337;
      int var11 = class536.field5571[var1 & 2047];
      double var9 = (double)var11 / 65536.0D;
      var11 = var8 - (int)((double)var6 * var9);
      int var12 = var0.field1170;
      int var13 = var7 >> 7;
      int var15 = var11 >> 7;
      long var16 = class123.method3544(var12, var13, var15, 5, false, -1, var0.field1172);
      var0.field1159.method5112(var0.field1170, var7, var11, client.field512, 60, var2, var1, var16, false);
   }
}
