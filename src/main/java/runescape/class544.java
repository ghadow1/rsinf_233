package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uk")
public class class544 {
   @ObfuscatedName("ht")
   public long field5600;
   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      descriptor = "Luk;"
   )
   public class544 field5599;
   @ObfuscatedName("hn")
   @ObfuscatedSignature(
      descriptor = "Luk;"
   )
   public class544 field5598;

   @ObfuscatedName("cv")
   public void vmethod10557() {
      if (this.field5598 != null) {
         this.field5598.field5599 = this.field5599;
         this.field5599.field5598 = this.field5598;
         this.field5599 = null;
         this.field5598 = null;
      }
   }

   @ObfuscatedName("ku")
   public boolean method10558() {
      return this.field5598 != null;
   }
}
