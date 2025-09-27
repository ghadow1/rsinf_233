package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xj")
public final class IsaacCipher {
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -631536291
   )
   int field6031;
   @ObfuscatedName("ap")
   int[] field6032 = new int[256];
   @ObfuscatedName("aq")
   int[] field6033 = new int[256];
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 694967471
   )
   int field6034;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 945377003
   )
   int field6030;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 297762893
   )
   int field6028;

   public IsaacCipher(int[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.field6032[var2] = var1[var2];
      }

      this.method11835();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "31"
   )
   public final int method11831() {
      if (this.field6031 == 0) {
         this.method11830();
         this.field6031 = 256;
      }

      return this.field6032[--this.field6031];
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "478036767"
   )
   public final int method11832() {
      if (this.field6031 == 0) {
         this.method11830();
         this.field6031 = 256;
      }

      return this.field6032[this.field6031 - 1];
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "25677"
   )
   final void method11830() {
      this.field6030 += ++this.field6028;

      for(int var1 = 0; var1 < 256; ++var1) {
         int var2 = this.field6033[var1];
         if ((var1 & 2) == 0) {
            if ((var1 & 1) == 0) {
               this.field6034 ^= this.field6034 << 13;
            } else {
               this.field6034 ^= this.field6034 >>> 6;
            }
         } else if ((var1 & 1) == 0) {
            this.field6034 ^= this.field6034 << 2;
         } else {
            this.field6034 ^= this.field6034 >>> 16;
         }

         this.field6034 += this.field6033[128 + var1 & 255];
         int var3;
         this.field6033[var1] = var3 = this.field6033[(var2 & 1020) >> 2] + this.field6030 + this.field6034;
         this.field6032[var1] = this.field6030 = this.field6033[(var3 >> 8 & 1020) >> 2] + var2;
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "82"
   )
   final void method11835() {
      int var9 = -1640531527;
      int var8 = -1640531527;
      int var7 = -1640531527;
      int var6 = -1640531527;
      int var5 = -1640531527;
      int var4 = -1640531527;
      int var3 = -1640531527;
      int var2 = -1640531527;

      int var1;
      for(var1 = 0; var1 < 4; ++var1) {
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.field6032[var1];
         var3 += this.field6032[var1 + 1];
         var4 += this.field6032[var1 + 2];
         var5 += this.field6032[var1 + 3];
         var6 += this.field6032[var1 + 4];
         var7 += this.field6032[var1 + 5];
         var8 += this.field6032[var1 + 6];
         var9 += this.field6032[var1 + 7];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.field6033[var1] = var2;
         this.field6033[var1 + 1] = var3;
         this.field6033[var1 + 2] = var4;
         this.field6033[var1 + 3] = var5;
         this.field6033[var1 + 4] = var6;
         this.field6033[var1 + 5] = var7;
         this.field6033[var1 + 6] = var8;
         this.field6033[var1 + 7] = var9;
      }

      for(var1 = 0; var1 < 256; var1 += 8) {
         var2 += this.field6033[var1];
         var3 += this.field6033[var1 + 1];
         var4 += this.field6033[var1 + 2];
         var5 += this.field6033[var1 + 3];
         var6 += this.field6033[var1 + 4];
         var7 += this.field6033[var1 + 5];
         var8 += this.field6033[var1 + 6];
         var9 += this.field6033[var1 + 7];
         var2 ^= var3 << 11;
         var5 += var2;
         var3 += var4;
         var3 ^= var4 >>> 2;
         var6 += var3;
         var4 += var5;
         var4 ^= var5 << 8;
         var7 += var4;
         var5 += var6;
         var5 ^= var6 >>> 16;
         var8 += var5;
         var6 += var7;
         var6 ^= var7 << 10;
         var9 += var6;
         var7 += var8;
         var7 ^= var8 >>> 4;
         var2 += var7;
         var8 += var9;
         var8 ^= var9 << 8;
         var3 += var8;
         var9 += var2;
         var9 ^= var2 >>> 9;
         var4 += var9;
         var2 += var3;
         this.field6033[var1] = var2;
         this.field6033[var1 + 1] = var3;
         this.field6033[var1 + 2] = var4;
         this.field6033[var1 + 3] = var5;
         this.field6033[var1 + 4] = var6;
         this.field6033[var1 + 5] = var7;
         this.field6033[var1 + 6] = var8;
         this.field6033[var1 + 7] = var9;
      }

      this.method11830();
      this.field6031 = 256;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([BI)[I",
      garbageValue = "1586986119"
   )
   public static int[] method11838(byte[] var0) {
      if (var0 != null && var0.length != 0 && var0.length <= 8) {
         int[] var1 = new int[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            if (var0[var2] < 0 || var0[var2] >= class614.field6080.length) {
               return null;
            }

            var1[var2] = class614.field6080[var0[var2]];
         }

         return var1;
      } else {
         return null;
      }
   }
}
