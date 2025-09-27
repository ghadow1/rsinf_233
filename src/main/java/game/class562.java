package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("va")
public class class562 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lva;"
   )
   public static final class562 field5767 = new class562(7, 0, "", "");
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lva;"
   )
   static final class562 field5774 = new class562(0, 1, "", "");
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lva;"
   )
   static final class562 field5768 = new class562(6, 2, "", "");
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lva;"
   )
   static final class562 field5777 = new class562(4, 3, "", "");
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lva;"
   )
   static final class562 field5770 = new class562(8, 4, "", "");
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lva;"
   )
   static final class562 field5771 = new class562(1, 5, "", "");
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lva;"
   )
   static final class562 field5772 = new class562(3, 6, "", "");
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lva;"
   )
   static final class562 field5766 = new class562(5, 7, "", "");
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lva;"
   )
   public static final class562 field5769;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -640433825
   )
   final int field5775;
   @ObfuscatedName("ai")
   final String field5776;

   static {
      field5769 = new class562(2, -1, "", "", true, new class562[]{field5767, field5774, field5768, field5770, field5777});
   }

   class562(int var1, int var2, String var3, String var4) {
      this.field5775 = var1;
      this.field5776 = var4;
   }

   @ObfuscatedSignature(
      descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lva;)V"
   )
   class562(int var1, int var2, String var3, String var4, boolean var5, class562[] var6) {
      this.field5775 = var1;
      this.field5776 = var4;
   }

   public String toString() {
      return this.field5776;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "100"
   )
   public static int method10882(int var0) {
      return (var0 & class580.field5846) - 1;
   }
}
