package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
public class class44 {
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "[Lbp;"
   )
   static class44[] field624;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1377435101
   )
   static int field626 = 0;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -783837955
   )
   static int field627 = 0;
   @ObfuscatedName("as")
   static int[] field636 = new int[]{1, 1, 1, 1};
   @ObfuscatedName("al")
   static int[] field629 = new int[]{0, 1, 2, 3};
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lea;"
   )
   static class121 field630;
   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "Lxc;"
   )
   static class604 field625;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -811010873
   )
   int field640;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -291557275
   )
   int field632;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 353989651
   )
   int field628;
   @ObfuscatedName("an")
   String field634;
   @ObfuscatedName("ar")
   String field622;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1477016689
   )
   int field635;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -641505777
   )
   int field637;
   @ObfuscatedName("ad")
   String field638;

   class44() {
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2026775168"
   )
   boolean method1490() {
      return (class582.field5862.vmethod11658() & this.field632) != 0;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "64"
   )
   boolean method1470() {
      return (class582.field5865.vmethod11658() & this.field632) != 0;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1979477857"
   )
   boolean method1477() {
      return (class582.field5879.vmethod11658() & this.field632) != 0;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1092531748"
   )
   boolean method1472() {
      return (class582.field5851.vmethod11658() & this.field632) != 0;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1971716451"
   )
   boolean method1493() {
      return (class582.field5866.vmethod11658() & this.field632) != 0;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1960946296"
   )
   boolean method1474() {
      return (class582.field5881.vmethod11658() & this.field632) != 0;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-575251269"
   )
   boolean method1475() {
      return (class582.field5863.vmethod11658() & this.field632) != 0;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1660437802"
   )
   boolean method1476() {
      return (class582.field5878.vmethod11658() & this.field632) != 0;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1943934127"
   )
   boolean method1497() {
      return (class582.field5856.vmethod11658() & this.field632) != 0;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2102394175"
   )
   boolean method1478() {
      return (class582.field5876.vmethod11658() & this.field632) != 0;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)[Lkq;",
      garbageValue = "110"
   )
   static class276[] method1532() {
      return new class276[]{class276.field3248, class276.field3247, class276.field3252, class276.field3250, class276.field3249, class276.field3245, class276.field3246};
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "([J[Ljava/lang/Object;III)V",
      garbageValue = "940278835"
   )
   public static void method1533(long[] var0, Object[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         long var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         Object var8 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var8;
         int var9 = var6 == Long.MAX_VALUE ? 0 : 1;

         for(int var10 = var2; var10 < var3; ++var10) {
            if (var0[var10] < var6 + (long)(var10 & var9)) {
               long var11 = var0[var10];
               var0[var10] = var0[var5];
               var0[var5] = var11;
               Object var13 = var1[var10];
               var1[var10] = var1[var5];
               var1[var5++] = var13;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var8;
         method1533(var0, var1, var2, var5 - 1);
         method1533(var0, var1, var5 + 1, var3);
      }

   }
}
