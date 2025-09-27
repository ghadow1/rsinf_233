package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
public final class class435 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lua;"
   )
   class540 field5121 = new class540();

   public class435() {
      this.field5121.field5592 = this.field5121;
      this.field5121.field5593 = this.field5121;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lua;)V"
   )
   public void method8671(class540 var1) {
      if (var1.field5593 != null) {
         var1.method10553();
      }

      var1.field5593 = this.field5121.field5593;
      var1.field5592 = this.field5121;
      var1.field5593.field5592 = var1;
      var1.field5592.field5593 = var1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lua;)V"
   )
   public void method8672(class540 var1) {
      if (var1.field5593 != null) {
         var1.method10553();
      }

      var1.field5593 = this.field5121;
      var1.field5592 = this.field5121.field5592;
      var1.field5593.field5592 = var1;
      var1.field5592.field5593 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "()Lua;"
   )
   public class540 method8673() {
      class540 var1 = this.field5121.field5592;
      return var1 == this.field5121 ? null : var1;
   }
}
