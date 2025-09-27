package runescape;

import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
final class class86 implements class357 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 436040985
   )
   static int field1230;
   @ObfuscatedName("aw")
   static ThreadPoolExecutor field1231;
   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      descriptor = "Lgm;"
   )
   static class171 field1229;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   final class369 val$item;

   @ObfuscatedSignature(
      descriptor = "(Loi;)V"
   )
   class86(class369 var1) {
      this.val$item = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-8197"
   )
   public void vmethod7474() {
      if (this.val$item.method7974().field4069 != null) {
         class65 var1 = new class65();
         var1.method2136(this.val$item);
         var1.method2143(this.val$item.method7974().field4069);
         class161.method3912().method8689(var1);
      }

   }
}
