package game;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
final class class416 implements Comparator {
   @ObfuscatedName("ka")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field5019;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lqi;Lqi;I)I",
      garbageValue = "557852335"
   )
   int method8478(class420 var1, class420 var2) {
      return var1.method8502().compareTo(var2.method8502());
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method8478((class420)var1, (class420)var2);
   }
}
