package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
public class class63 {
   @ObfuscatedName("vo")
   @ObfuscatedGetter(
      intValue = 1874666475
   )
   static int field884;

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)Lhh;",
      garbageValue = "206495819"
   )
   public static class195 method2129(int var0) {
      class195 var1 = (class195)class195.field2128.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class195.field2101.method8335(9, var0);
         var1 = new class195();
         var1.field2107 = var0;
         if (var2 != null) {
            var1.method4367(new class590(var2));
         }

         var1.method4324();
         class195.field2128.method7009(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("ia")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1028045502"
   )
   static final void method2123() {
      if (class133.field1614) {
         class284.method6353();
         class133.field1614 = false;
      }

   }
}
