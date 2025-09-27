package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ug")
public class class538 {
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lug;"
   )
   public class538 field5588;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lug;"
   )
   public class538 field5587;

   @ObfuscatedName("af")
   public void method10549() {
      if (this.field5587 != null) {
         this.field5587.field5588 = this.field5588;
         this.field5588.field5587 = this.field5587;
         this.field5588 = null;
         this.field5587 = null;
      }
   }
}
