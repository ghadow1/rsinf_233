package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vg")
public abstract class class551 extends class552 {
   @ObfuscatedName("kl")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field5661;

   class551(int var1, int var2) {
      super(var1, var2);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2121166831"
   )
   public abstract int vmethod10615();

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1036932109"
   )
   public abstract int vmethod10609();

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1956644652"
   )
   public abstract int vmethod10614();

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "([BI)[B",
      garbageValue = "-1060040786"
   )
   static final byte[] method10616(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      int var2 = var1.method11196();
      int var3 = var1.read32BitArray();
      if (var3 < 0 || class412.field4961 != 0 && var3 > class412.field4961) {
         throw new RuntimeException();
      } else if (var2 == 0) {
         byte[] var6 = new byte[var3];
         var1.method11266(var6, 0, var3);
         return var6;
      } else {
         int var4 = var1.read32BitArray();
         if (var4 >= 0 && (class412.field4961 == 0 || var4 <= class412.field4961)) {
            byte[] var5 = new byte[var4];
            if (var2 == 1) {
               class593.method11477(var5, var4, var0, var3, 9);
            } else {
               class412.field4968.method11905(var1, var5);
            }

            return var5;
         } else {
            throw new RuntimeException();
         }
      }
   }
}
