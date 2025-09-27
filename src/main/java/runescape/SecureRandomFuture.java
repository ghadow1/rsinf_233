package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class SecureRandomFuture extends class151 {
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   static class412 field1914;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 2091538877
   )
   int field1915;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfz;"
   )
   final class154 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfz;)V"
   )
   SecureRandomFuture(class154 var1) {
      this.this$0 = var1;
      this.field1915 = -1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-2943315"
   )
   void vmethod4111(Buffer var1) {
      this.field1915 = var1.readUnsignedShort();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lgs;I)V",
      garbageValue = "2108880901"
   )
   void vmethod4112(class162 var1) {
      var1.method3927(this.field1915);
   }

   @ObfuscatedName("hj")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-63"
   )
   static final void method4057() {
      class230.field2697 = false;
      client.field565 = false;
   }
}
