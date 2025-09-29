package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public class class149 extends class151 {
   @ObfuscatedName("ac")
   public static int[] field1763;
   @ObfuscatedName("kk")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field1760;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      longValue = -1010873380718794223L
   )
   long field1762;
   @ObfuscatedName("aw")
   String field1759;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfz;"
   )
   final class154 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfz;)V"
   )
   class149(class154 var1) {
      this.this$0 = var1;
      this.field1762 = -1L;
      this.field1759 = null;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-2943315"
   )
   void vmethod4111(Buffer var1) {
      if (var1.method11196() != 255) {
         var1.offset -= -290410379;
         this.field1762 = var1.readLong();
      }

      this.field1759 = var1.method11206();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lgs;I)V",
      garbageValue = "2108880901"
   )
   void vmethod4112(class162 var1) {
      var1.method3962(this.field1762, this.field1759, 0);
   }
}
