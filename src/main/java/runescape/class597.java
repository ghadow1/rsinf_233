package runescape;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ww")
public class class597 implements Comparator {
   @ObfuscatedName("ab")
   static String[] field5981;
   @ObfuscatedName("af")
   final boolean field5982;

   public class597(boolean var1) {
      this.field5982 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ltl;Ltl;I)I",
      garbageValue = "-643821137"
   )
   int method11520(class499 var1, class499 var2) {
      return this.field5982 ? var1.method9949().method11912(var2.method9949()) : var2.method9949().method11912(var1.method9949());
   }

   public int compare(Object var1, Object var2) {
      return this.method11520((class499)var1, (class499)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
