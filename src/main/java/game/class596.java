package game;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wh")
public class class596 implements Comparator {
   @ObfuscatedName("af")
   final boolean field5979;

   public class596(boolean var1) {
      this.field5979 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ltl;Ltl;I)I",
      garbageValue = "-1516266950"
   )
   int method11514(class499 var1, class499 var2) {
      return this.field5979 ? var1.vmethod10042(var2) : var2.vmethod10042(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.method11514((class499)var1, (class499)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
