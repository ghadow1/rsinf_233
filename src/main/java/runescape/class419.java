package runescape;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
final class class419 implements Comparator {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lqi;Lqi;I)I",
      garbageValue = "-172610999"
   )
   int method8494(class420 var1, class420 var2) {
      return var1.field5033 < var2.field5033 ? -1 : (var2.field5033 == var1.field5033 ? 0 : 1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method8494((class420)var1, (class420)var2);
   }

   @ObfuscatedName("as")
   static final void method8499(long var0) {
      class242.field2968[++class242.field2967 - 1] = var0;
   }
}
