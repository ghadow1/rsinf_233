package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
public final class class428 {
   @ObfuscatedName("af")
   int field5081;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "[Luk;"
   )
   class544[] field5080;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Luk;"
   )
   class544 field5083;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Luk;"
   )
   class544 field5082;
   @ObfuscatedName("ap")
   int field5079 = 0;

   public class428(int var1) {
      this.field5081 = var1;
      this.field5080 = new class544[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class544 var3 = this.field5080[var2] = new class544();
         var3.field5599 = var3;
         var3.field5598 = var3;
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(J)Luk;"
   )
   public class544 method8623(long var1) {
      class544 var3 = this.field5080[(int)(var1 & (long)(this.field5081 - 1))];

      for(this.field5083 = var3.field5599; var3 != this.field5083; this.field5083 = this.field5083.field5599) {
         if (this.field5083.field5600 == var1) {
            class544 var4 = this.field5083;
            this.field5083 = this.field5083.field5599;
            return var4;
         }
      }

      this.field5083 = null;
      return null;
   }

   @ObfuscatedName("aw")
   public int method8624() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.field5081; ++var2) {
         class544 var3 = this.field5080[var2];

         for(class544 var4 = var3.field5599; var4 != var3; var4 = var4.field5599) {
            ++var1;
         }
      }

      return var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Luk;J)V"
   )
   public void method8625(class544 var1, long var2) {
      if (var1.field5598 != null) {
         var1.vmethod10557();
      }

      class544 var4 = this.field5080[(int)(var2 & (long)(this.field5081 - 1))];
      var1.field5598 = var4.field5598;
      var1.field5599 = var4;
      var1.field5598.field5599 = var1;
      var1.field5599.field5598 = var1;
      var1.field5600 = var2;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "()Luk;"
   )
   public class544 method8626() {
      this.field5079 = 0;
      return this.method8627();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "()Luk;"
   )
   public class544 method8627() {
      class544 var1;
      if (this.field5079 > 0 && this.field5080[this.field5079 - 1] != this.field5082) {
         var1 = this.field5082;
         this.field5082 = var1.field5599;
         return var1;
      } else {
         do {
            if (this.field5079 >= this.field5081) {
               return null;
            }

            var1 = this.field5080[this.field5079++].field5599;
         } while(var1 == this.field5080[this.field5079 - 1]);

         this.field5082 = var1.field5599;
         return var1;
      }
   }
}
