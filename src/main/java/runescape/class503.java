package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
public class class503 extends class499 {
   @ObfuscatedName("vm")
   @ObfuscatedGetter(
      intValue = -101585215
   )
   static int field5413;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 584845755
   )
   public int field5411 = -21363 * 584845755;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 500734603
   )
   public int field5410;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 440043511
   )
   public int field5412;

   class503() {
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1080849893"
   )
   void method10054(int var1, int var2) {
      this.field5411 = var1 * 21363 * 584845755;
      this.field5410 = var2;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "71"
   )
   public int method10055() {
      return this.field5411;
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "57"
   )
   public boolean method10056() {
      return this.field5411 > 0;
   }
}
