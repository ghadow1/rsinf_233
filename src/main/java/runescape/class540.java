package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ua")
public class class540 extends class544 {
   @ObfuscatedName("ew")
   public long field5594;
   @ObfuscatedName("eo")
   @ObfuscatedSignature(
      descriptor = "Lua;"
   )
   public class540 field5592;
   @ObfuscatedName("eg")
   @ObfuscatedSignature(
      descriptor = "Lua;"
   )
   public class540 field5593;

   @ObfuscatedName("ki")
   public void method10553() {
      if (this.field5593 != null) {
         this.field5593.field5592 = this.field5592;
         this.field5592.field5593 = this.field5593;
         this.field5592 = null;
         this.field5593 = null;
      }
   }
}
