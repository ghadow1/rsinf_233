package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tu")
public class class510 extends class544 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1603361179
   )
   public int field5445 = -1;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lsp;"
   )
   public final class469 field5443 = new class469();
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 760365491
   )
   public int field5444 = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1521026729
   )
   public int field5442 = 0;

   public class510(int var1, int var2, int var3) {
      this.field5445 = var1;
      this.field5442 = var2;
      this.field5444 = var3;
      if (this.field5445 >= 0) {
         this.field5443.method9573(class433.method8663(this.field5445).field2198);
      }

   }
}
