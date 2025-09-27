package game;

import java.util.ArrayList;
import java.util.Calendar;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
public class class46 {
   @ObfuscatedName("ap")
   static final String[] field668 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   @ObfuscatedName("al")
   static final double field657 = Math.log(2.0D);
   @ObfuscatedName("ai")
   static Object[] field671;
   @ObfuscatedName("aa")
   static int[] field659 = new int[1000];
   @ObfuscatedName("an")
   static Object[] field660 = new Object[1000];
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1771498025
   )
   static int field658;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1141760993
   )
   static int field662 = 0;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "[Lbq;"
   )
   static class38[] field663 = new class38[50];
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 222371735
   )
   static int field653 = 0;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lon;"
   )
   static class368 field665 = new class368();
   @ObfuscatedName("ab")
   static Calendar field666 = Calendar.getInstance();
   @ObfuscatedName("ak")
   static boolean field667 = false;
   @ObfuscatedName("aj")
   static boolean field652 = false;
   @ObfuscatedName("az")
   static ArrayList field669 = new ArrayList();
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 658483381
   )
   static int field670 = 0;

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lsp;ILsk;I)I",
      garbageValue = "-892555755"
   )
   static int method1774(class469 var0, int var1, class468 var2) {
      int var3 = 0;
      class215 var4 = var0.method9581();
      if (var4.field2493 > 0 && var4.field2477 > 0) {
         var1 %= var4.field2477;
      }

      int var5 = var0.method9565();
      int var6 = var0.method9627();
      int var7 = var0.method9620();
      if (var5 >= var4.field2474.length) {
         var5 = 0;
         var6 = 0;
      }

      var6 += var1;

      while(true) {
         do {
            if (var6 <= var4.field2460[var5]) {
               var0.method9624(var5, var6, var7);
               return var3;
            }

            var6 -= var4.field2460[var5];
            ++var5;
            var3 |= 4;
            if ((var3 & 2) == 0 && var2 != null) {
               var2.vmethod10858(var4, var5);
            }
         } while(var5 < var4.field2474.length);

         ++var7;
         var3 |= 1;
         var5 -= var4.field2493;
         if (var7 >= var4.field2486) {
            var3 |= 2;
         }

         if (var5 < 0 || var5 >= var4.field2474.length) {
            var3 |= 2;
            var5 = 0;
         }

         if ((var3 & 2) == 0 && var2 != null) {
            var2.vmethod10858(var4, var5);
         }
      }
   }

   @ObfuscatedName("la")
   @ObfuscatedSignature(
      descriptor = "(IIII)Ldr;",
      garbageValue = "698620686"
   )
   static class79 method1773(int var0, int var1, int var2) {
      return client.field333.method2363(var0, var1, var2, class36.field239.method2585(), class217.field2511);
   }
}
