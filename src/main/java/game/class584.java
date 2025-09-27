package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wi")
public class class584 {
   @ObfuscatedName("ne")
   @ObfuscatedSignature(
      descriptor = "(Loi;III)V",
      garbageValue = "-2139264577"
   )
   static final void method11130(class369 var0, int var1, int var2) {
      if (client.field612 == null && !client.field521) {
         if (var0 != null) {
            class369 var4 = class207.method4518(var0);
            if (var4 == null) {
               var4 = var0.field4231;
            }

            if (var4 != null) {
               client.field612 = var0;
               var4 = class207.method4518(var0);
               if (var4 == null) {
                  var4 = var0.field4231;
               }

               client.field536 = var4;
               client.field537 = var1;
               client.field557 = var2;
               class74.field1037 = 0;
               client.field546 = false;
               int var5 = class158.method3883();
               if (var5 != -1) {
                  class87.method2833(var5);
               }

               return;
            }
         }

      }
   }
}
