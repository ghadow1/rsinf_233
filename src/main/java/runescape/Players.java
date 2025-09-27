package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
public class Players {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lsl;"
   )
   public static final Players field5351 = new Players(0);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lsl;"
   )
   static final Players field5350 = new Players(1);
   @ObfuscatedName("ic")
   @ObfuscatedSignature(
      descriptor = "Loe;"
   )
   static class385 field5353;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 975444257
   )
   final int field5352;

   Players(int var1) {
      this.field5352 = var1;
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "([BIB)I",
      garbageValue = "0"
   )
   public static int method9805(byte[] var0, int var1) {
      return class346.method7343(var0, 0, var1);
   }
}
