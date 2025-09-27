package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class134 {
   @ObfuscatedName("ac")
   public static final float field1620 = Math.ulp(1.0F);
   @ObfuscatedName("ap")
   public static final float field1617;
   @ObfuscatedName("si")
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   static class369 field1624;

   static {
      field1617 = 2.0F * field1620;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "1823309984"
   )
   static String method3619(int var0) {
      return "<col=" + Integer.toHexString(var0) + ">";
   }

   @ObfuscatedName("hq")
   @ObfuscatedSignature(
      descriptor = "(IZZZZZI)Lpw;",
      garbageValue = "1784249341"
   )
   static class409 method3618(int var0, boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      class515 var6 = null;
      if (class260.field3111 != null) {
         var6 = new class515(var0, class260.field3111, class260.field3107[var0], 1000000);
      }

      return new class409(var6, class75.field1073, class297.field3418, var0, var1, var2, var3, var4, var5);
   }

   @ObfuscatedName("mf")
   @ObfuscatedSignature(
      descriptor = "(Loi;IIIIIII)V",
      garbageValue = "-120078607"
   )
   static final void method3620(class369 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (client.field343) {
         client.field482 = 32;
      } else {
         client.field482 = 0;
      }

      client.field343 = false;
      int var7;
      if (class35.field218 == 1 || !class423.field5058 && class35.field218 == 4) {
         if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
            var0.field4170 -= 4;
            class89.method2877(var0);
         } else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
            var0.field4170 += 4;
            class89.method2877(var0);
         } else if (var5 >= var1 - client.field482 && var5 < client.field482 + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
            var7 = var3 * (var3 - 32) / var4;
            if (var7 < 8) {
               var7 = 8;
            }

            int var8 = var6 - var2 - 16 - var7 / 2;
            int var9 = var3 - 32 - var7;
            var0.field4170 = var8 * (var4 - var3) / var9;
            class89.method2877(var0);
            client.field343 = true;
         }
      }

      if (client.field550 != 0) {
         var7 = var0.field4160 * 469894397;
         if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
            var0.field4170 += client.field550 * 45;
            class89.method2877(var0);
         }
      }

   }
}
