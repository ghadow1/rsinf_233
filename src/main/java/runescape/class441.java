package runescape;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
public class class441 implements Iterable {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lua;"
   )
   public class540 field5135 = new class540();
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lua;"
   )
   class540 field5134;

   public class441() {
      this.field5135.field5592 = this.field5135;
      this.field5135.field5593 = this.field5135;
   }

   @ObfuscatedName("aw")
   public void method8846() {
      while(this.field5135.field5592 != this.field5135) {
         this.field5135.field5592.method10553();
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lua;)V"
   )
   public void method8847(class540 var1) {
      if (var1.field5593 != null) {
         var1.method10553();
      }

      var1.field5593 = this.field5135.field5593;
      var1.field5592 = this.field5135;
      var1.field5593.field5592 = var1;
      var1.field5592.field5593 = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "()Lua;"
   )
   public class540 method8848() {
      class540 var1 = this.field5135.field5592;
      if (var1 == this.field5135) {
         return null;
      } else {
         var1.method10553();
         return var1;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "()Lua;"
   )
   public class540 method8849() {
      return this.method8850((class540)null);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lua;)Lua;"
   )
   class540 method8850(class540 var1) {
      class540 var2;
      if (var1 == null) {
         var2 = this.field5135.field5592;
      } else {
         var2 = var1;
      }

      if (var2 == this.field5135) {
         this.field5134 = null;
         return null;
      } else {
         this.field5134 = var2.field5592;
         return var2;
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "()Lua;"
   )
   public class540 method8844() {
      class540 var1 = this.field5134;
      if (var1 == this.field5135) {
         this.field5134 = null;
         return null;
      } else {
         this.field5134 = var1.field5592;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class440(this);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lua;Lua;)V"
   )
   public static void method8853(class540 var0, class540 var1) {
      if (var0.field5593 != null) {
         var0.method10553();
      }

      var0.field5593 = var1;
      var0.field5592 = var1.field5592;
      var0.field5593.field5592 = var0;
      var0.field5592.field5593 = var0;
   }
}
