package runescape;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
final class class415 implements Comparator {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lqi;Lqi;B)I",
      garbageValue = "-28"
   )
   int method8471(class420 var1, class420 var2) {
      return var1.field5032.field5041 < var2.field5032.field5041 ? -1 : (var2.field5032.field5041 == var1.field5032.field5041 ? 0 : 1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method8471((class420)var1, (class420)var2);
   }
}
