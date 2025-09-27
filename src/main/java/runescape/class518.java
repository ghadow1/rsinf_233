package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tb")
public enum class518 implements class430 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Ltb;"
   )
   field5492(0, 0),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Ltb;"
   )
   field5493(1, 1),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ltb;"
   )
   field5494(2, 2);

   @ObfuscatedName("rc")
   @ObfuscatedSignature(
      descriptor = "Ljb;"
   )
   static class237 field5498;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 555401257
   )
   final int field5495;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1795631439
   )
   final int field5496;

   class518(int var3, int var4) {
      this.field5495 = var3;
      this.field5496 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1935172756"
   )
   public int vmethod11658() {
      return this.field5496;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lny;IB)Lny;",
      garbageValue = "-63"
   )
   public static class359 method10317(class359 var0, int var1) {
      for(class359 var2 = var0; var2 != null; var2 = var2.field4047) {
         if (var1 >= var2.field4049 && var1 <= var2.field4048) {
            return var2;
         }
      }

      return null;
   }
}
