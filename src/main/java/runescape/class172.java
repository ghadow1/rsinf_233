package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("go")
public class class172 {
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 697366175
   )
   static int field1931;
   @ObfuscatedName("qm")
   @ObfuscatedGetter(
      intValue = 27881281
   )
   static int field1930;

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IZIZB)V",
      garbageValue = "-89"
   )
   static void method4087(int var0, boolean var1, int var2, boolean var3) {
      if (class44.field624 != null) {
         class16.method217(0, class44.field624.length - 1, var0, var1, var2, var3);
      }

   }

   @ObfuscatedName("kc")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIB)Z",
      garbageValue = "1"
   )
   static boolean method4086(int var0, int var1, int var2, int var3, int var4, int var5) {
      return ClientPackets.method7038(class484.field5343.field1170, var0, var1, var2, var3, var4, var5);
   }
}
