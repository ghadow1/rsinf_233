package game;

import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tw")
public abstract class class500 implements Comparator {
   @ObfuscatedName("aw")
   Comparator field5399;

   protected class500() {
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Comparator;I)V",
      garbageValue = "2068533580"
   )
   final void method9963(Comparator var1) {
      if (this.field5399 == null) {
         this.field5399 = var1;
      } else if (this.field5399 instanceof class500) {
         ((class500)this.field5399).method9963(var1);
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ltl;Ltl;I)I",
      garbageValue = "-1309674587"
   )
   protected final int method9964(class499 var1, class499 var2) {
      return this.field5399 == null ? 0 : this.field5399.compare(var1, var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)[Ltb;",
      garbageValue = "1789155977"
   )
   public static class518[] method9969() {
      return new class518[]{class518.field5492, class518.field5493, class518.field5494};
   }
}
