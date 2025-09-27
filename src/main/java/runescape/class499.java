package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tl")
public class class499 implements Comparable {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lxa;"
   )
   class613 field5397;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lxa;"
   )
   class613 field5396;

   class499() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ltl;I)I",
      garbageValue = "1554225034"
   )
   public int vmethod10042(class499 var1) {
      return this.field5397.method11912(var1.field5397);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(I)Lxa;",
      garbageValue = "1671722663"
   )
   public class613 method9949() {
      return this.field5397;
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-17389022"
   )
   public String method9942() {
      return this.field5397 == null ? "" : this.field5397.method11909();
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "58510979"
   )
   public String method9945() {
      return this.field5396 == null ? "" : this.field5396.method11909();
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(Lxa;Lxa;I)V",
      garbageValue = "934667381"
   )
   void method9957(class613 var1, class613 var2) {
      if (var1 == null) {
         throw new NullPointerException();
      } else {
         this.field5397 = var1;
         this.field5396 = var2;
      }
   }

   public int compareTo(Object var1) {
      return this.vmethod10042((class499)var1);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)I",
      garbageValue = "36"
   )
   static final int method9952(int var0, int var1, int var2, int var3) {
      return var2 * var1 - var3 * var0 >> 16;
   }
}
