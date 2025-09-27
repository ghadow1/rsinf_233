package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xo")
public abstract class class602 {
   @ObfuscatedName("at")
   public int[] field5996;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1144170259
   )
   public int field5997;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1893187821
   )
   public int field5998;
   @ObfuscatedName("aq")
   protected float[] field5999;

   protected class602() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1889941463"
   )
   public abstract void vmethod11645(int var1, int var2);

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-540591436"
   )
   public abstract void vmethod11646(int var1, int var2, int var3, int var4);

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "300699084"
   )
   public final void method11655() {
      class601.method11548(this.field5996, this.field5997, this.field5998, this.field5999);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1608046387"
   )
   public final void method11643(boolean var1) {
      this.field5999 = var1 ? new float[this.field5998 * this.field5997 + 1] : null;
   }
}
