package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
public class class323 {
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "2006321818"
   )
   static final int method7031(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = class22.method331(var3, var5);
      int var8 = class22.method331(var3 + 1, var5);
      int var9 = class22.method331(var3, var5 + 1);
      int var10 = class22.method331(var3 + 1, var5 + 1);
      int var11 = class194.method4321(var7, var8, var4, var2);
      int var12 = class194.method4321(var9, var10, var4, var2);
      return class194.method4321(var11, var12, var6, var2);
   }
}
