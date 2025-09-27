package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class126 extends class500 {
   @ObfuscatedName("af")
   final boolean field1575;

   public class126(boolean var1) {
      this.field1575 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lty;Lty;I)I",
      garbageValue = "2115721439"
   )
   int method3564(class503 var1, class503 var2) {
      if (var2.field5411 != var1.field5411) {
         return this.field1575 ? var1.field5411 - var2.field5411 : var2.field5411 - var1.field5411;
      } else {
         return this.method9964(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method3564((class503)var1, (class503)var2);
   }
}
