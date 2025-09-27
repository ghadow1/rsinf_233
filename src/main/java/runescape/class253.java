package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
public final class class253 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Liz;"
   )
   public class233 field3062;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 70477995
   )
   int field3051;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      longValue = -3451756420657839043L
   )
   public long field3052 = 0L;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 985204991
   )
   int field3048;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -496937227
   )
   int field3049;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 504071911
   )
   int field3053;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1044397321
   )
   int field3054;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1193957357
   )
   int field3055;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -158811479
   )
   int field3050;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1581408207
   )
   int field3057;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -499861321
   )
   int field3058;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -149041761
   )
   int field3059;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -251231821
   )
   int field3060;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -773460857
   )
   int field3061 = 0;

   class253() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "272039198"
   )
   public static int method5796(int var0) {
      return var0 >> 14 & 1023;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;[IB)V",
      garbageValue = "-74"
   )
   public static void method5795(String[] var0, int[] var1) {
      class567.method10959(var0, var1, 0, var0.length - 1);
   }

   @ObfuscatedName("oh")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-691908688"
   )
   static void method5797(int var0) {
      for(class359 var1 = (class359)client.field438.method8626(); var1 != null; var1 = (class359)client.field438.method8627()) {
         if ((var1.field5600 >> 16 & 65535L) == (long)var0) {
            var1.vmethod10557();
         }
      }

   }
}
