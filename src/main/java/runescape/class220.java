package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public final class class220 {
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Ldx;"
   )
   public static class99 field2575;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Liz;"
   )
   public class233 field2573;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      longValue = 7455486665087214275L
   )
   public long field2571;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1639897407
   )
   int field2569;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1171178688
   )
   int field2570;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1597463225
   )
   int field2572;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1239571067
   )
   int field2574;

   class220() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-613264871"
   )
   public static void method4911(int var0, int var1) {
      class206 var2 = class50.method1890(var0);
      int var3 = var2.field2260;
      int var4 = var2.field2262;
      int var5 = var2.field2263;
      int var6 = class355.field4021[var5 - var4];
      if (var1 < 0 || var1 > var6) {
         var1 = 0;
      }

      var6 <<= var4;
      class355.field4022[var3] = class355.field4022[var3] & ~var6 | var1 << var4 & var6;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-23"
   )
   static int method4910(int var0) {
      class39 var1 = (class39)class91.field1287.method8596((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.field5593 == class91.field1283.field5135 ? -1 : ((class39)var1.field5593).field267;
      }
   }
}
