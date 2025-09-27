package runescape;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
public final class class426 implements Iterable {
   @ObfuscatedName("af")
   int field5071;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "[Luk;"
   )
   class544[] field5073;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Luk;"
   )
   class544 field5070;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Luk;"
   )
   class544 field5072;
   @ObfuscatedName("ap")
   int field5074 = 0;

   public class426(int var1) {
      this.field5071 = var1;
      this.field5073 = new class544[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class544 var3 = this.field5073[var2] = new class544();
         var3.field5599 = var3;
         var3.field5598 = var3;
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(J)Luk;"
   )
   public class544 method8596(long var1) {
      class544 var3 = this.field5073[(int)(var1 & (long)(this.field5071 - 1))];

      for(this.field5070 = var3.field5599; var3 != this.field5070; this.field5070 = this.field5070.field5599) {
         if (this.field5070.field5600 == var1) {
            class544 var4 = this.field5070;
            this.field5070 = this.field5070.field5599;
            return var4;
         }
      }

      this.field5070 = null;
      return null;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Luk;J)V"
   )
   public void method8590(class544 var1, long var2) {
      if (var1.field5598 != null) {
         var1.vmethod10557();
      }

      class544 var4 = this.field5073[(int)(var2 & (long)(this.field5071 - 1))];
      var1.field5598 = var4.field5598;
      var1.field5599 = var4;
      var1.field5598.field5599 = var1;
      var1.field5599.field5598 = var1;
      var1.field5600 = var2;
   }

   @ObfuscatedName("at")
   public void method8591() {
      for(int var1 = 0; var1 < this.field5071; ++var1) {
         class544 var2 = this.field5073[var1];

         while(true) {
            class544 var3 = var2.field5599;
            if (var3 == var2) {
               break;
            }

            var3.vmethod10557();
         }
      }

      this.field5070 = null;
      this.field5072 = null;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "()Luk;"
   )
   public class544 method8601() {
      this.field5074 = 0;
      return this.method8592();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "()Luk;"
   )
   public class544 method8592() {
      class544 var1;
      if (this.field5074 > 0 && this.field5073[this.field5074 - 1] != this.field5072) {
         var1 = this.field5072;
         this.field5072 = var1.field5599;
         return var1;
      } else {
         do {
            if (this.field5074 >= this.field5071) {
               return null;
            }

            var1 = this.field5073[this.field5074++].field5599;
         } while(var1 == this.field5073[this.field5074 - 1]);

         this.field5072 = var1.field5599;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class425(this);
   }
}
