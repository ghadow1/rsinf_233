package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
public class class436 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Luk;"
   )
   public class544 field5122 = new class544();
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Luk;"
   )
   class544 field5123;

   public class436() {
      this.field5122.field5599 = this.field5122;
      this.field5122.field5598 = this.field5122;
   }

   @ObfuscatedName("aw")
   public void method8685() {
      while(true) {
         class544 var1 = this.field5122.field5599;
         if (var1 == this.field5122) {
            this.field5123 = null;
            return;
         }

         var1.vmethod10557();
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Luk;)V"
   )
   public void method8689(class544 var1) {
      if (var1.field5598 != null) {
         var1.vmethod10557();
      }

      var1.field5598 = this.field5122.field5598;
      var1.field5599 = this.field5122;
      var1.field5598.field5599 = var1;
      var1.field5599.field5598 = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Luk;)V"
   )
   public void method8687(class544 var1) {
      if (var1.field5598 != null) {
         var1.vmethod10557();
      }

      var1.field5598 = this.field5122;
      var1.field5599 = this.field5122.field5599;
      var1.field5598.field5599 = var1;
      var1.field5599.field5598 = var1;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "()Luk;"
   )
   public class544 method8716() {
      class544 var1 = this.field5122.field5599;
      if (var1 == this.field5122) {
         return null;
      } else {
         var1.vmethod10557();
         return var1;
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "()Luk;"
   )
   public class544 method8695() {
      class544 var1 = this.field5122.field5598;
      if (var1 == this.field5122) {
         return null;
      } else {
         var1.vmethod10557();
         return var1;
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "()Luk;"
   )
   public class544 method8690() {
      class544 var1 = this.field5122.field5599;
      if (var1 == this.field5122) {
         this.field5123 = null;
         return null;
      } else {
         this.field5123 = var1.field5599;
         return var1;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "()Luk;"
   )
   public class544 method8691() {
      class544 var1 = this.field5122.field5598;
      if (var1 == this.field5122) {
         this.field5123 = null;
         return null;
      } else {
         this.field5123 = var1.field5598;
         return var1;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "()Luk;"
   )
   public class544 method8692() {
      class544 var1 = this.field5123;
      if (var1 == this.field5122) {
         this.field5123 = null;
         return null;
      } else {
         this.field5123 = var1.field5599;
         return var1;
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "()Luk;"
   )
   public class544 method8693() {
      class544 var1 = this.field5123;
      if (var1 == this.field5122) {
         this.field5123 = null;
         return null;
      } else {
         this.field5123 = var1.field5598;
         return var1;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Luk;Luk;)V"
   )
   public static void method8697(class544 var0, class544 var1) {
      if (var0.field5598 != null) {
         var0.vmethod10557();
      }

      var0.field5598 = var1.field5598;
      var0.field5599 = var1;
      var0.field5598.field5599 = var0;
      var0.field5599.field5598 = var0;
   }
}
