package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public class class229 extends class544 {
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 242744719
   )
   int field2673;
   @ObfuscatedName("ao")
   int[] field2676;
   @ObfuscatedName("as")
   int[][] field2675;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lig;"
   )
   class227 field2674;

   public class229(int var1, byte[] var2) {
      Buffer var3 = new Buffer(var2);
      this.field2673 = var3.method11196();
      this.field2676 = new int[this.field2673];
      this.field2675 = new int[this.field2673][];

      int var4;
      for(var4 = 0; var4 < this.field2673; ++var4) {
         this.field2676[var4] = var3.method11196();
      }

      for(var4 = 0; var4 < this.field2673; ++var4) {
         this.field2675[var4] = new int[var3.method11196()];
      }

      for(var4 = 0; var4 < this.field2673; ++var4) {
         for(int var5 = 0; var5 < this.field2675[var4].length; ++var5) {
            this.field2675[var4][var5] = var3.method11196();
         }
      }

      if (var3.offset * 1216585693 < var3.array.length) {
         var4 = var3.readUnsignedShort();
         if (var4 > 0) {
            this.field2674 = new class227(var3, var4);
         }
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-54"
   )
   public int method5094() {
      return this.field2673;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Lig;",
      garbageValue = "1507591030"
   )
   public class227 method5095() {
      return this.field2674;
   }
}
