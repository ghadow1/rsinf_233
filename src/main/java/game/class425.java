package game;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
public class class425 implements Iterator {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lqm;"
   )
   class426 field5067;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Luk;"
   )
   class544 field5068;
   @ObfuscatedName("at")
   int field5066;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Luk;"
   )
   class544 field5069 = null;

   @ObfuscatedSignature(
      descriptor = "(Lqm;)V"
   )
   public class425(class426 var1) {
      this.field5067 = var1;
      this.method8571();
   }

   @ObfuscatedName("af")
   void method8571() {
      this.field5068 = this.field5067.field5073[0].field5599;
      this.field5066 = 1;
      this.field5069 = null;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "()Luk;"
   )
   public class544 method8573() {
      this.method8571();
      return (class544)this.next();
   }

   public Object next() {
      class544 var1;
      if (this.field5067.field5073[this.field5066 - 1] != this.field5068) {
         var1 = this.field5068;
         this.field5068 = var1.field5599;
         this.field5069 = var1;
         return var1;
      } else {
         do {
            if (this.field5066 >= this.field5067.field5071) {
               return null;
            }

            var1 = this.field5067.field5073[this.field5066++].field5599;
         } while(var1 == this.field5067.field5073[this.field5066 - 1]);

         this.field5068 = var1.field5599;
         this.field5069 = var1;
         return var1;
      }
   }

   public boolean hasNext() {
      if (this.field5067.field5073[this.field5066 - 1] != this.field5068) {
         return true;
      } else {
         while(this.field5066 < this.field5067.field5071) {
            if (this.field5067.field5073[this.field5066++].field5599 != this.field5067.field5073[this.field5066 - 1]) {
               this.field5068 = this.field5067.field5073[this.field5066 - 1].field5599;
               return true;
            }

            this.field5068 = this.field5067.field5073[this.field5066 - 1];
         }

         return false;
      }
   }

   public void remove() {
      if (this.field5069 == null) {
         throw new IllegalStateException();
      } else {
         this.field5069.vmethod10557();
         this.field5069 = null;
      }
   }
}
