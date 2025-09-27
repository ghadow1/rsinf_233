package runescape;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qb")
final class class417 implements Comparator {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lqi;Lqi;I)I",
      garbageValue = "-1006641339"
   )
   int method8484(class420 var1, class420 var2) {
      return var1.field5037 < var2.field5037 ? -1 : (var2.field5037 == var1.field5037 ? 0 : 1);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method8484((class420)var1, (class420)var2);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)I",
      garbageValue = "517113447"
   )
   public static int method8492(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + var0.charAt(var3);
      }

      return var2;
   }
}
