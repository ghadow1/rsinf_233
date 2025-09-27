package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public class class324 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Lcg;",
      garbageValue = "-1986646754"
   )
   static class55 method7033(int var0) {
      class55 var1 = (class55)class55.field800.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class334.field3841.method8335(var0, 0);
         if (var2 == null) {
            return null;
         } else {
            var1 = class137.method3668(var2);
            class55.field800.method7009(var1, (long)var0);
            return var1;
         }
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Loi;I)I",
      garbageValue = "-636914799"
   )
   static int method7032(class369 var0) {
      if (var0.field4147 != 11) {
         --class46.field658;
         class46.field659[++class124.field1569 - 1] = -1;
         return 1;
      } else {
         String var1 = (String)class46.field660[--class46.field658];
         class46.field659[++class124.field1569 - 1] = var0.method7961(var1);
         return 1;
      }
   }
}
