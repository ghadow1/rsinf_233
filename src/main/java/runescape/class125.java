package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public class class125 extends class500 {
   @ObfuscatedName("af")
   final boolean field1572;

   public class125(boolean var1) {
      this.field1572 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lty;Lty;I)I",
      garbageValue = "48925521"
   )
   int method3554(class503 var1, class503 var2) {
      if (var1.field5411 != 0) {
         if (var2.field5411 == 0) {
            return this.field1572 ? -1 : 1;
         }
      } else if (var2.field5411 != 0) {
         return this.field1572 ? 1 : -1;
      }

      return this.method9964(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3554((class503)var1, (class503)var2);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lpx;IB)V",
      garbageValue = "-85"
   )
   static void method3559(class412 var0, int var1) {
      if ((var1 & class582.field5881.vmethod11658()) != 0) {
         class139.field1686 = class61.method2092(var0, "logo_deadman_mode", "");
      } else if ((var1 & class582.field5878.vmethod11658()) != 0) {
         class139.field1686 = class61.method2092(var0, "logo_seasonal_mode", "");
      } else if ((var1 & class582.field5856.vmethod11658()) != 0) {
         class139.field1686 = class61.method2092(var0, "logo_speedrunning", "");
      } else if ((var1 & class582.field5852.vmethod11658()) != 0) {
         class139.field1686 = class61.method2092(var0, "logo_ugc_world", "");
      } else {
         class139.field1686 = class61.method2092(var0, "logo", "");
      }

   }

   @ObfuscatedName("hb")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1473110444"
   )
   static final void method3557() {
      if (class70.field963 != null) {
         class70.field963.method3048();
      }

   }
}
