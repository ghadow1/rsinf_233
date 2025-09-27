package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
public class class379 {
   @ObfuscatedName("aw")
   public static final boolean[] field4368 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
   @ObfuscatedName("at")
   public static int[] field4369 = new int[99];

   static {
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var3;
         field4369[var1] = var0 / 4;
      }

   }

   @ObfuscatedName("kj")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIIIIIILcv;B)V",
      garbageValue = "-107"
   )
   static void method8174(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class69 var13) {
      class212 var14 = class433.method8669(var6);
      int var15;
      int var16;
      if (var4 != 1 && var4 != 3) {
         var15 = var14.field2329;
         var16 = var14.field2330;
      } else {
         var15 = var14.field2330;
         var16 = var14.field2329;
      }

      int var17 = (var15 >> 1) + var1;
      int var18 = (var15 + 1 >> 1) + var1;
      int var19 = (var16 >> 1) + var2;
      int var20 = var2 + (var16 + 1 >> 1);
      int[][] var21 = class484.field5343.field1173[var0];
      int var22 = var21[var18][var20] + var21[var17][var19] + var21[var18][var19] + var21[var17][var20] >> 2;
      int var23 = (var1 << 7) + (var15 << 6);
      int var24 = (var2 << 7) + (var16 << 6);
      class241 var25 = var14.method4652(var3, var4, var21, var23, var22, var24);
      if (var25 != null) {
         class79.method2702(class484.field5343, var0, var1, var2, var5, -1, 0, 0, 31, (String[])null, var7 + 1, var8 + 1);
         var13.field942 = var7 + client.cycle;
         var13.field943 = var8 + client.cycle;
         var13.field947 = var25;
         var13.field944 = var15 * 64 + var1 * 128;
         var13.field945 = var16 * 64 + var2 * 128;
         var13.field936 = var22;
         int var26;
         if (var9 > var11) {
            var26 = var9;
            var9 = var11;
            var11 = var26;
         }

         if (var10 > var12) {
            var26 = var10;
            var10 = var12;
            var12 = var26;
         }

         var13.field948 = var9 + var1;
         var13.field953 = var11 + var1;
         var13.field949 = var10 + var2;
         var13.field946 = var2 + var12;
      }

   }
}
