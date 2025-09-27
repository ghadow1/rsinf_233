package runescape;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
public final class class424 implements Iterable {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lqa;"
   )
   final class427 field5062;
   @ObfuscatedName("aw")
   int field5063;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "[Lus;"
   )
   class539[] field5064;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lus;"
   )
   class539 field5065;

   public class424(int var1) {
      this.field5063 = var1;
      this.field5064 = new class539[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class539 var3 = this.field5064[var2] = new class539();
         var3.field5591 = var3;
         var3.field5589 = var3;
      }

      this.field5062 = new class427(this);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(J)Lus;"
   )
   public class539 method8567(long var1) {
      class539 var3 = this.field5064[(int)(var1 & (long)(this.field5063 - 1))];

      for(this.field5065 = var3.field5591; var3 != this.field5065; this.field5065 = this.field5065.field5591) {
         if (this.field5065.field5590 == var1) {
            class539 var4 = this.field5065;
            this.field5065 = this.field5065.field5591;
            return var4;
         }
      }

      this.field5065 = null;
      return null;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lus;J)V"
   )
   public void method8558(class539 var1, long var2) {
      if (var1.field5589 != null) {
         var1.method10551();
      }

      class539 var4 = this.field5064[(int)(var2 & (long)(this.field5063 - 1))];
      var1.field5589 = var4.field5589;
      var1.field5591 = var4;
      var1.field5589.field5591 = var1;
      var1.field5591.field5589 = var1;
      var1.field5590 = var2;
   }

   @ObfuscatedName("at")
   public void method8560() {
      for(int var1 = 0; var1 < this.field5063; ++var1) {
         class539 var2 = this.field5064[var1];

         while(true) {
            class539 var3 = var2.field5591;
            if (var3 == var2) {
               break;
            }

            var3.method10551();
         }
      }

      this.field5065 = null;
   }

   public Iterator iterator() {
      this.field5062.method8618();
      return this.field5062;
   }
}
