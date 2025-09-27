package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
public class class194 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      longValue = 7439184828842411303L
   )
   public long field2093;
   @ObfuscatedName("aw")
   int[] field2095;
   @ObfuscatedName("at")
   short[] field2094;
   @ObfuscatedName("ac")
   short[] field2092;
   @ObfuscatedName("ap")
   public boolean field2096 = false;

   public class194(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
      this.field2093 = var1;
      this.field2095 = var3;
      this.field2094 = var4;
      this.field2092 = var5;
      this.field2096 = var6;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "81"
   )
   static boolean method4322(int var0, int var1) {
      return var0 != 4 || var1 < 8;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)I",
      garbageValue = "-56"
   )
   static final int method4321(int var0, int var1, int var2, int var3) {
      int var4 = 65536 - class225.field2636[var2 * 1024 / var3] >> 1;
      return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
   }
}
