package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
public enum class136 implements class430 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lfs;"
   )
   field1647(0, 0),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lfs;"
   )
   field1641(1, 1),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lfs;"
   )
   field1642(2, 2),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lfs;"
   )
   field1643(3, 3),
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lfs;"
   )
   field1644(4, 4);

   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -984888973
   )
   final int field1645;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -434289387
   )
   final int field1646;

   class136(int var3, int var4) {
      this.field1645 = var3;
      this.field1646 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1935172756"
   )
   public int vmethod11658() {
      return this.field1646;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1792283733"
   )
   static int method3660(int var0, int var1) {
      class62 var2 = (class62)class62.field867.method8623((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.field869.length ? var2.field869[var1] : 0;
      }
   }
}
