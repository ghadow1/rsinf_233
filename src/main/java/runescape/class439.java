package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
public class class439 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lug;"
   )
   class538 field5130 = new class538();
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lug;"
   )
   class538 field5129;

   public class439() {
      this.field5130.field5588 = this.field5130;
      this.field5130.field5587 = this.field5130;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lug;)V"
   )
   public void method8822(class538 var1) {
      if (var1.field5587 != null) {
         var1.method10549();
      }

      var1.field5587 = this.field5130.field5587;
      var1.field5588 = this.field5130;
      var1.field5587.field5588 = var1;
      var1.field5588.field5587 = var1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "()Lug;"
   )
   public class538 method8830() {
      class538 var1 = this.field5130.field5588;
      if (var1 == this.field5130) {
         this.field5129 = null;
         return null;
      } else {
         this.field5129 = var1.field5588;
         return var1;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "()Lug;"
   )
   public class538 method8823() {
      class538 var1 = this.field5129;
      if (var1 == this.field5130) {
         this.field5129 = null;
         return null;
      } else {
         this.field5129 = var1.field5588;
         return var1;
      }
   }
}
