package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ef")
public abstract class class104 extends class544 {
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Leq;"
   )
   class117 field1412;
   @ObfuscatedName("ab")
   volatile boolean field1411 = true;
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lef;"
   )
   class104 field1410;
   @ObfuscatedName("ak")
   int field1413;

   protected class104() {
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "()Lef;"
   )
   protected abstract class104 vmethod7346();

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "()Lef;"
   )
   protected abstract class104 vmethod7345();

   @ObfuscatedName("as")
   protected abstract int vmethod7364();

   @ObfuscatedName("al")
   protected abstract void vmethod7347(int[] var1, int var2, int var3);

   @ObfuscatedName("ai")
   protected abstract void vmethod7348(int var1);

   @ObfuscatedName("bn")
   int vmethod3324() {
      return 255;
   }

   @ObfuscatedName("gq")
   final void method3347(int[] var1, int var2, int var3) {
      if (this.field1411) {
         this.vmethod7347(var1, var2, var3);
      } else {
         this.vmethod7348(var3);
      }

   }
}
