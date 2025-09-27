package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uc")
public enum class524 implements class430 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Luc;"
   )
   field5541(2, 1),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Luc;"
   )
   field5540(3, 2),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Luc;"
   )
   field5542(0, 3),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Luc;"
   )
   field5543(1, 10);

   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -758135483
   )
   final int field5544;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1429021695
   )
   final int field5545;

   class524(int var3, int var4) {
      this.field5544 = var3;
      this.field5545 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1935172756"
   )
   public int vmethod11658() {
      return this.field5545;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)Lhs;",
      garbageValue = "-1419301039"
   )
   public static class186 method10438(int var0) {
      class186 var1 = (class186)class186.field2033.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else if (class186.field2023 == null) {
         return null;
      } else {
         byte[] var2 = class186.field2023.method8335(3, var0);
         var1 = new class186();
         if (var2 != null) {
            var1.method4220(new Buffer(var2));
         }

         class186.field2033.method7009(var1, (long)var0);
         return var1;
      }
   }
}
