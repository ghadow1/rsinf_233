package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
public class class281 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1315894260"
   )
   public static int method6324(int var0) {
      class206 var1 = class50.method1890(var0);
      int var2 = var1.field2260;
      int var3 = var1.field2262;
      int var4 = var1.field2263;
      int var5 = class355.field4021[var4 - var3];
      return class355.field4022[var2] >> var3 & var5;
   }
}
