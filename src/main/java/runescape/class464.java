package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
public class class464 {
   @ObfuscatedName("ac")
   static int[] field5243;
   @ObfuscatedName("cg")
   static String field5240;
   @ObfuscatedName("af")
   public char field5242;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1493270631
   )
   public int field5241 = 0;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -322934023
   )
   public int field5244 = 0;

   class464() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([Lbp;II[I[II)V",
      garbageValue = "-1320385573"
   )
   static void method9401(class44[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var5 = var1 - 1;
         int var6 = var2 + 1;
         int var7 = (var2 + var1) / 2;
         class44 var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while(var5 < var6) {
            boolean var9 = true;

            int var10;
            int var11;
            int var12;
            do {
               --var6;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (var3[var10] == 2) {
                     var11 = var0[var6].field637;
                     var12 = var8.field637;
                  } else if (var3[var10] == 1) {
                     var11 = var0[var6].field628;
                     var12 = var8.field628;
                     if (var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if (var12 == -1 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if (var3[var10] == 3) {
                     var11 = var0[var6].method1490() ? 1 : 0;
                     var12 = var8.method1490() ? 1 : 0;
                  } else {
                     var11 = var0[var6].field640;
                     var12 = var8.field640;
                  }

                  if (var12 != var11) {
                     if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            var9 = true;

            do {
               ++var5;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (var3[var10] == 2) {
                     var11 = var0[var5].field637;
                     var12 = var8.field637;
                  } else if (var3[var10] == 1) {
                     var11 = var0[var5].field628;
                     var12 = var8.field628;
                     if (var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if (var12 == -1 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if (var3[var10] == 3) {
                     var11 = var0[var5].method1490() ? 1 : 0;
                     var12 = var8.method1490() ? 1 : 0;
                  } else {
                     var11 = var0[var5].field640;
                     var12 = var8.field640;
                  }

                  if (var11 != var12) {
                     if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            if (var5 < var6) {
               class44 var13 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var13;
            }
         }

         method9401(var0, var1, var6, var3, var4);
         method9401(var0, var6 + 1, var2, var3, var4);
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "129900797"
   )
   public static int method9404() {
      return ++class35.field227 - 1;
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "([JIII)V",
      garbageValue = "1412765109"
   )
   static void method9403(long[] var0, int var1, int var2) {
      while(var1 < var2) {
         long var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         ++var1;
         --var2;
      }

   }

   @ObfuscatedName("ix")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZI)V",
      garbageValue = "-82442340"
   )
   static final void drawLoadingMessage(String var0, boolean var1) {
      if (client.field342) {
         byte var2 = 4;
         int var3 = var2 + 6;
         int var4 = var2 + 6;
         int var5 = class463.field5239.method9445(var0, 250);
         int var6 = class463.field5239.method9418(var0, 250) * 13;
         class601.method11558(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
         class601.method11562(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
         class463.field5239.method9424(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
         class277.method6236(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2);
         if (var1) {
            class34.rasterProvider.drawFull(0, 0);
         } else {
            class10.method103(var3, var4, var5, var6);
         }

      }
   }
}
