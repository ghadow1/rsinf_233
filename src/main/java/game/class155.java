package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class155 extends class151 {
   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "Lcs;"
   )
   static class77 field1803;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1029458903
   )
   int field1799;
   @ObfuscatedName("aw")
   byte field1800;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfz;"
   )
   final class154 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfz;)V"
   )
   class155(class154 var1) {
      this.this$0 = var1;
      this.field1799 = -1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-2943315"
   )
   void vmethod4111(class590 var1) {
      this.field1799 = var1.method11198();
      this.field1800 = var1.method11197();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lgs;I)V",
      garbageValue = "2108880901"
   )
   void vmethod4112(class162 var1) {
      var1.method3926(this.field1799, this.field1800);
   }
}
