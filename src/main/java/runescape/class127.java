package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
public class class127 extends class500 {
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -452342813
   )
   static int field1577;
   @ObfuscatedName("af")
   final boolean field1578;

   public class127(boolean var1) {
      this.field1578 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lty;Lty;I)I",
      garbageValue = "771071997"
   )
   int method3569(class503 var1, class503 var2) {
      if (client.worldId == var1.field5411 && var2.field5411 == client.worldId) {
         return this.field1578 ? var1.method9949().method11912(var2.method9949()) : var2.method9949().method11912(var1.method9949());
      } else {
         return this.method9964(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method3569((class503)var1, (class503)var2);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpx;Lpx;I)V",
      garbageValue = "-160103304"
   )
   public static void method3573(class412 var0, class412 var1) {
      class187.field2038 = var0;
      class187.field2039 = var1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1709069497"
   )
   public static int method3568(int var0, int var1) {
      return (int)Math.round(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) - 512 & 2047;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IZIB)V",
      garbageValue = "114"
   )
   public static final void method3575(int var0, boolean var1, int var2) {
      if (var0 >= 8000 && var0 <= 48000) {
         class97.field1356 = var0;
         class97.field1339 = var1;
         class65.field904 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
