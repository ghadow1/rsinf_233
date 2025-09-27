package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hi")
public class class187 extends class540 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   static class412 field2038;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   static class412 field2039;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   static class320 field2040 = new class320(64);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   static class320 field2041 = new class320(64);
   @ObfuscatedName("lt")
   @ObfuscatedGetter(
      intValue = -915910047
   )
   static int field2052;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1314996873
   )
   public int field2042;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 2090325649
   )
   public int field2043 = 255;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1125424573
   )
   public int field2044 = 255;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1796499015
   )
   public int field2045 = -1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -865076841
   )
   public int field2046 = 1;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1968747049
   )
   public int field2049 = 70;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1248285335
   )
   int field2048 = -1;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 59520525
   )
   int field2037 = -1;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 682173989
   )
   public int field2050 = 30;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -548856825
   )
   public int field2051 = 0;

   class187() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-2088254435"
   )
   void method4252(Buffer var1) {
      while(true) {
         int var2 = var1.method11196();
         if (var2 == 0) {
            return;
         }

         this.method4253(var1, var2);
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lwb;II)V",
      garbageValue = "-236442452"
   )
   void method4253(Buffer var1, int var2) {
      if (var2 == 1) {
         var1.readUnsignedShort();
      } else if (var2 == 2) {
         this.field2043 = var1.method11196();
      } else if (var2 == 3) {
         this.field2044 = var1.method11196();
      } else if (var2 == 4) {
         this.field2045 = 0;
      } else if (var2 == 5) {
         this.field2049 = var1.readUnsignedShort();
      } else if (var2 == 6) {
         var1.method11196();
      } else if (var2 == 7) {
         this.field2048 = var1.method11222();
      } else if (var2 == 8) {
         this.field2037 = var1.method11222();
      } else if (var2 == 11) {
         this.field2045 = var1.readUnsignedShort();
      } else if (var2 == 14) {
         this.field2050 = var1.method11196();
      } else if (var2 == 15) {
         this.field2051 = var1.method11196();
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)Lxt;",
      garbageValue = "548633291"
   )
   public class605 method4254() {
      if (this.field2048 < 0) {
         return null;
      } else {
         class605 var1 = (class605)field2041.method7018((long)this.field2048);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class100.method3145(field2039, this.field2048, 0);
            if (var1 != null) {
               field2041.method7009(var1, (long)this.field2048);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)Lxt;",
      garbageValue = "-1730060620"
   )
   public class605 method4255() {
      if (this.field2037 < 0) {
         return null;
      } else {
         class605 var1 = (class605)field2041.method7018((long)this.field2037);
         if (var1 != null) {
            return var1;
         } else {
            var1 = class100.method3145(field2039, this.field2037, 0);
            if (var1 != null) {
               field2041.method7009(var1, (long)this.field2037);
            }

            return var1;
         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIIIIZIII)Lxt;",
      garbageValue = "-1997595539"
   )
   public static final class605 method4273(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6, int var7) {
      if (var6 == 36 && var7 == 32) {
         if (var1 == -1) {
            var4 = 0;
         } else if (var4 == 2 && var1 != 1) {
            var4 = 1;
         }
      } else {
         var4 = 0;
      }

      long var8 = ((long)var3 << 42) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var4 << 40);
      class605 var10;
      if (!var5 && var6 == 36 && var7 == 32) {
         var10 = (class605)class213.field2381.method7018(var8);
         if (var10 != null) {
            return var10;
         }
      }

      class213 var11 = class84.method2800(var0);
      if (var1 > 1 && var11.field2406 != null) {
         int var12 = -1;

         for(int var13 = 0; var13 < 10; ++var13) {
            if (var1 >= var11.field2407[var13] && var11.field2407[var13] != 0) {
               var12 = var11.field2406[var13];
            }
         }

         if (var12 != -1) {
            var11 = class84.method2800(var12);
         }
      }

      class241 var25 = var11.method4719(1);
      if (var25 == null) {
         return null;
      } else {
         class605 var26 = null;
         if (var11.field2409 != -1) {
            var26 = method4273(var11.field2408, 10, 1, 0, 0, true, var6, var7);
            if (var26 == null) {
               return null;
            }
         } else if (var11.field2429 != -1) {
            var26 = method4273(var11.field2419, var1, var2, var3, 0, false, var6, var7);
            if (var26 == null) {
               return null;
            }
         } else if (var11.field2422 != -1) {
            var26 = method4273(var11.field2395, var1, 0, 0, 0, false, var6, var7);
            if (var26 == null) {
               return null;
            }
         }

         int[] var14 = class601.field5988;
         int var15 = class601.field5989;
         int var16 = class601.field5990;
         float[] var17 = class601.field5987;
         int[] var18 = new int[4];
         class601.method11552(var18);
         var10 = new class605(var6, var7);
         class225.method4941(var10.field6018, var6, var7, (float[])null);
         class601.method11554();
         class225.method4934();
         int var19 = var7 >> 1;
         class225.method4981(var19, var19);
         class225.field2632.field2999 = false;
         if (var11.field2422 != -1) {
            var26.method11705(0, 0);
         }

         int var20 = var11.field2430;
         if (var6 != 36) {
            var20 = var20 * 32 / var6;
         }

         if (var5) {
            var20 = (int)((double)var20 * 1.5D);
         } else if (var2 == 2) {
            var20 = (int)((double)var20 * 1.04D);
         }

         int var21 = var20 * class225.field2637[var11.field2424] >> 16;
         int var22 = var20 * class225.field2636[var11.field2424] >> 16;
         var25.method5459();
         var25.method5565(0, var11.field2393, var11.field2392, var11.field2424, var11.field2378, var25.field2801 / 2 + var21 + var11.field2398, var22 + var11.field2398);
         if (var11.field2429 != -1) {
            var26.method11705(0, 0);
         }

         if (var2 >= 1) {
            var10.method11714(1);
         }

         if (var2 >= 2) {
            var10.method11714(16777215);
         }

         if (var3 != 0) {
            var10.method11780(var3);
         }

         class225.method4941(var10.field6018, var6, var7, (float[])null);
         if (var11.field2409 != -1) {
            var26.method11705(0, 0);
         }

         if (var4 == 1 || var4 == 2 && var11.field2397 == 1) {
            class461 var23 = class213.field2394;
            String var24;
            if (var1 < 100000) {
               var24 = "<col=ffff00>" + var1 + "</col>";
            } else if (var1 < 10000000) {
               var24 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>";
            } else {
               var24 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>";
            }

            var23.method9420(var24, 0, 9, 16776960, 1);
         }

         if (!var5 && var6 == 36 && var7 == 32) {
            class213.field2381.method7009(var10, var8);
         }

         class225.method4941(var14, var15, var16, var17);
         class601.method11618(var18);
         class225.method4934();
         class225.field2632.field2999 = true;
         return var10;
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "360543412"
   )
   static final int method4259() {
      return class242.field2964;
   }
}
