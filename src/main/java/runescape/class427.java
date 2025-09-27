package runescape;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
public class class427 implements Iterator {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lqf;"
   )
   class424 field5077;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lus;"
   )
   class539 field5075;
   @ObfuscatedName("at")
   int field5078;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lus;"
   )
   class539 field5076 = null;

   @ObfuscatedSignature(
      descriptor = "(Lqf;)V"
   )
   class427(class424 var1) {
      this.field5077 = var1;
      this.method8618();
   }

   @ObfuscatedName("af")
   void method8618() {
      this.field5075 = this.field5077.field5064[0].field5591;
      this.field5078 = 1;
      this.field5076 = null;
   }

   public Object next() {
      class539 var1;
      if (this.field5077.field5064[this.field5078 - 1] != this.field5075) {
         var1 = this.field5075;
         this.field5075 = var1.field5591;
         this.field5076 = var1;
         return var1;
      } else {
         do {
            if (this.field5078 >= this.field5077.field5063) {
               return null;
            }

            var1 = this.field5077.field5064[this.field5078++].field5591;
         } while(var1 == this.field5077.field5064[this.field5078 - 1]);

         this.field5075 = var1.field5591;
         this.field5076 = var1;
         return var1;
      }
   }

   public boolean hasNext() {
      if (this.field5077.field5064[this.field5078 - 1] != this.field5075) {
         return true;
      } else {
         while(this.field5078 < this.field5077.field5063) {
            if (this.field5077.field5064[this.field5078++].field5591 != this.field5077.field5064[this.field5078 - 1]) {
               this.field5075 = this.field5077.field5064[this.field5078 - 1].field5591;
               return true;
            }

            this.field5075 = this.field5077.field5064[this.field5078 - 1];
         }

         return false;
      }
   }

   public void remove() {
      if (this.field5076 == null) {
         throw new IllegalStateException();
      } else {
         this.field5076.method10551();
         this.field5076 = null;
      }
   }
}
