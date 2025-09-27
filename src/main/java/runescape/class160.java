package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class160 extends class151 {
   @ObfuscatedName("af")
   String field1833;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfz;"
   )
   final class154 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfz;)V"
   )
   class160(class154 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-2943315"
   )
   void vmethod4111(Buffer var1) {
      this.field1833 = var1.method11207();
      var1.read32BitArray();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lgs;I)V",
      garbageValue = "2108880901"
   )
   void vmethod4112(class162 var1) {
      var1.field1860 = this.field1833;
   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "903454439"
   )
   static int method3896(int var0, class55 var1, boolean var2) {
      if (var0 == 6754) {
         int var5 = class46.field659[--class124.field1569];
         class195 var6 = class63.method2129(var5);
         class46.field660[++class46.field658 - 1] = var6 != null ? var6.field2110 : "";
         return 1;
      } else {
         class195 var3;
         if (var0 == 6764) {
            class124.field1569 -= 2;
            var3 = class63.method2129(class46.field659[class124.field1569]);
            int var4 = class46.field659[class124.field1569 + 1];
            class46.field659[++class124.field1569 - 1] = var3.method4336(var4);
            class46.field659[++class124.field1569 - 1] = var3.method4338(var4);
            return 1;
         } else if (var0 == 6765) {
            var3 = class63.method2129(class46.field659[--class124.field1569]);
            class46.field659[++class124.field1569 - 1] = var3 != null ? var3.field2135 : 0;
            return 1;
         } else {
            return 2;
         }
      }
   }

   @ObfuscatedName("lv")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "742442526"
   )
   static final boolean method3903() {
      return client.isMenuOpen;
   }
}
