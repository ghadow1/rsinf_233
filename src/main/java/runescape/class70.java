package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
public class class70 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field964 = new class70();
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field969 = new class70();
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field962 = new class70();
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field970 = new class70();
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field966 = new class70();
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field965 = new class70();
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field978 = new class70();
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field960 = new class70();
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field968 = new class70();
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field961 = new class70();
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field967 = new class70();
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field971 = new class70();
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field972 = new class70();
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field973 = new class70();
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field974 = new class70();
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field975 = new class70();
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field976 = new class70();
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   static final class70 field977 = new class70();
   @ObfuscatedName("vh")
   @ObfuscatedSignature(
      descriptor = "Ldn;"
   )
   static class97 field963;

   class70() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)[I",
      garbageValue = "-1406228520"
   )
   static int[] method2236(int var0, int var1, int var2, int var3, int var4) {
      int[] var5 = new int[256];

      int var6;
      for(var6 = 0; var6 < 64; ++var6) {
         var5[var6] = class41.method781(var0, var1, var6);
      }

      for(var6 = 0; var6 < 64; ++var6) {
         var5[var6 + 64] = class41.method781(var1, var2, var6);
      }

      for(var6 = 0; var6 < 64; ++var6) {
         var5[var6 + 128] = class41.method781(var2, var3, var6);
      }

      for(var6 = 0; var6 < 64; ++var6) {
         var5[var6 + 192] = class41.method781(var3, var4, var6);
      }

      return var5;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "34174140"
   )
   public static void method2237() {
      class209.field2277.method7011();
   }

   @ObfuscatedName("oj")
   @ObfuscatedSignature(
      descriptor = "(IILnq;I)I",
      garbageValue = "-2085812447"
   )
   static int method2238(int var0, int var1, class354 var2) {
      int var3 = var2.field4019 / 2 + var0;
      int var4 = var2.field4020 / 2 + var1;
      int var5 = class35.field231 - var3;
      int var6 = class35.field220 - var4;
      int var7 = class127.method3568(var6, var5);
      var7 -= client.field424;
      var7 &= 2047;
      int var9 = var7 + 64;
      int var8 = (var9 & 2047) / 128;
      return var8;
   }
}
