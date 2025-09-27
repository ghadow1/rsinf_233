package runescape;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
public class class437 implements Iterator {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lqn;"
   )
   class438 field5124;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Luk;"
   )
   class544 field5125;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Luk;"
   )
   class544 field5126 = null;

   @ObfuscatedSignature(
      descriptor = "(Lqn;)V"
   )
   class437(class438 var1) {
      this.method8718(var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lqn;)V"
   )
   void method8718(class438 var1) {
      this.field5124 = var1;
      this.method8719();
   }

   @ObfuscatedName("aw")
   void method8719() {
      this.field5125 = this.field5124 != null ? this.field5124.field5127.field5599 : null;
      this.field5126 = null;
   }

   public Object next() {
      class544 var1 = this.field5125;
      if (var1 == this.field5124.field5127) {
         var1 = null;
         this.field5125 = null;
      } else {
         this.field5125 = var1.field5599;
      }

      this.field5126 = var1;
      return var1;
   }

   public void remove() {
      if (this.field5126 == null) {
         throw new IllegalStateException();
      } else {
         this.field5126.vmethod10557();
         this.field5126 = null;
      }
   }

   public boolean hasNext() {
      return this.field5124.field5127 != this.field5125 && this.field5125 != null;
   }
}
