package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xa")
public class class613 implements Comparable {
   @ObfuscatedName("af")
   String field6075;
   @ObfuscatedName("aw")
   String field6076;

   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lva;)V"
   )
   public class613(String var1, LoginType var2) {
      this.field6075 = var1;
      this.field6076 = class196.method4386(var1, var2);
   }

   public class613(String var1) {
      this.field6075 = var1;
      this.field6076 = class196.method4386(var1, LoginType.oldscape);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "38"
   )
   public String method11909() {
      return this.field6075;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-95"
   )
   public String method11910() {
      return this.field6076;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "846964310"
   )
   public boolean method11911() {
      return this.field6076 != null;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lxa;I)I",
      garbageValue = "1591588445"
   )
   public int method11912(class613 var1) {
      if (this.field6076 == null) {
         return var1.field6076 == null ? 0 : 1;
      } else {
         return var1.field6076 == null ? -1 : this.field6076.compareTo(var1.field6076);
      }
   }

   public boolean equals(Object var1) {
      if (var1 instanceof class613) {
         class613 var2 = (class613)var1;
         if (this.field6076 == null) {
            return var2.field6076 == null;
         } else if (var2.field6076 == null) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.field6076.equals(var2.field6076);
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.field6076 == null ? 0 : this.field6076.hashCode();
   }

   public String toString() {
      return this.method11909();
   }

   public int compareTo(Object var1) {
      return this.method11912((class613)var1);
   }
}
