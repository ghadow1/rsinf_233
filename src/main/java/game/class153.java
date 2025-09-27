package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
public class class153 {
   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      descriptor = "Lqv;"
   )
   public static class423 field1780;
   @ObfuscatedName("af")
   public byte field1782;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1362145957
   )
   public int field1781;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lxa;"
   )
   public class613 field1779;

   class153() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1782630395"
   )
   public static int method3835(int var0) {
      return var0 >> 24 & 3;
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/Object;III)V",
      garbageValue = "-1711867357"
   )
   static void method3834(Object[] var0, int var1, int var2) {
      while(var1 < var2) {
         Object var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         ++var1;
         --var2;
      }

   }
}
