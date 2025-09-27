package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wt")
public class class591 {
   @ObfuscatedName("af")
   int[] field5921 = new int[8];
   @ObfuscatedName("aw")
   short[] field5922 = new short[8];

   @ObfuscatedSignature(
      descriptor = "(Lhh;)V"
   )
   public class591(class195 var1) {
      int var2 = 0;
      if (var1.method4334()) {
         var2 = var1.method4335().length;
         System.arraycopy(var1.method4335(), 0, this.field5921, 0, var2);
         System.arraycopy(var1.method4333(), 0, this.field5922, 0, var2);
      }

      for(int var3 = var2; var3 < 8; ++var3) {
         this.field5921[var3] = -1;
         this.field5922[var3] = -1;
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "-815719240"
   )
   public int[] method11461() {
      return this.field5921;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)[S",
      garbageValue = "-620495878"
   )
   public short[] method11462() {
      return this.field5922;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IISI)V",
      garbageValue = "-736551268"
   )
   public void method11463(int var1, int var2, short var3) {
      this.field5921[var1] = var2;
      this.field5922[var1] = var3;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "([I[SB)V",
      garbageValue = "122"
   )
   public void method11460(int[] var1, short[] var2) {
      this.field5921 = var1;
      this.field5922 = var2;
   }
}
