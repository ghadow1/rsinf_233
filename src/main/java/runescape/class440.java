package runescape;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
public class class440 implements Iterator {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lqg;"
   )
   class441 field5131;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lua;"
   )
   class540 field5132;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lua;"
   )
   class540 field5133 = null;

   @ObfuscatedSignature(
      descriptor = "(Lqg;)V"
   )
   class440(class441 var1) {
      this.field5131 = var1;
      this.field5132 = this.field5131.field5135.field5592;
      this.field5133 = null;
   }

   public Object next() {
      class540 var1 = this.field5132;
      if (var1 == this.field5131.field5135) {
         var1 = null;
         this.field5132 = null;
      } else {
         this.field5132 = var1.field5592;
      }

      this.field5133 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field5131.field5135 != this.field5132;
   }

   public void remove() {
      if (this.field5133 == null) {
         throw new IllegalStateException();
      } else {
         this.field5133.method10553();
         this.field5133 = null;
      }
   }
}
