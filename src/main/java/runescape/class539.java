package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("us")
public class class539 extends class540 {
   @ObfuscatedName("er")
   public long field5590;
   @ObfuscatedName("eb")
   @ObfuscatedSignature(
      descriptor = "Lus;"
   )
   public class539 field5591;
   @ObfuscatedName("ec")
   @ObfuscatedSignature(
      descriptor = "Lus;"
   )
   public class539 field5589;

   @ObfuscatedName("kw")
   public void method10551() {
      if (this.field5589 != null) {
         this.field5589.field5591 = this.field5591;
         this.field5591.field5589 = this.field5589;
         this.field5591 = null;
         this.field5589 = null;
      }
   }
}
