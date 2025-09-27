package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class144 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;Lqm;B)Lqm;",
      garbageValue = "46"
   )
   static final class426 method3740(class590 var0, class426 var1) {
      int var2 = var0.method11196();
      int var3;
      if (var1 == null) {
         var3 = class165.method4019(var2);
         var1 = new class426(var3);
      }

      for(var3 = 0; var3 < var2; ++var3) {
         boolean var4 = var0.method11196() == 1;
         int var5 = var0.method11278();
         Object var6;
         if (var4) {
            var6 = new class541(var0.method11207());
         } else {
            var6 = new class543(var0.method11202());
         }

         var1.method8590((class544)var6, (long)var5);
      }

      return var1;
   }

   @ObfuscatedName("aw")
   public static int method3737(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1317378068"
   )
   protected static final void method3738() {
      class556.field5741.vmethod6075();

      int var0;
      for(var0 = 0; var0 < 32; ++var0) {
         class34.field188[var0] = 0L;
      }

      for(var0 = 0; var0 < 32; ++var0) {
         class34.field184[var0] = 0L;
      }

      class360.field4051 = 0;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ldr;Lwb;IIIIIII)V",
      garbageValue = "-2009643821"
   )
   static final void method3741(class79 var0, class590 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int[][][] var8 = var0.field1173;
      byte[][][] var9 = var0.field1168;
      if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
         var9[var2][var3][var4] = 0;

         while(true) {
            int var10 = var1.method11198();
            if (var10 == 0) {
               if (var2 == 0) {
                  var8[0][var3][var4] = -class442.method8864(var5 + 932731, var6 + 556238) * 8;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
               }
               break;
            }

            if (var10 == 1) {
               int var11 = var1.method11196();
               if (var11 == 1) {
                  var11 = 0;
               }

               if (var2 == 0) {
                  var8[0][var3][var4] = -var11 * 8;
               } else {
                  var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
               }
               break;
            }

            if (var10 <= 49) {
               class59.field846[var2][var3][var4] = (short)var1.method11452();
               class59.field847[var2][var3][var4] = (byte)((var10 - 2) / 4);
               class59.field848[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
            } else if (var10 <= 81) {
               var9[var2][var3][var4] = (byte)(var10 - 49);
            } else {
               class39.field270[var2][var3][var4] = (short)(var10 - 81);
            }
         }
      } else {
         class190.method4307(var1);
      }

   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "828398723"
   )
   static int method3739(int var0, class55 var1, boolean var2) {
      if (var0 == 3300) {
         class46.field659[++class124.field1569 - 1] = client.field412;
         return 1;
      } else {
         int var3;
         int var8;
         if (var0 == 3301) {
            class124.field1569 -= 2;
            var3 = class46.field659[class124.field1569];
            var8 = class46.field659[class124.field1569 + 1];
            class46.field659[++class124.field1569 - 1] = class372.method8131(var3, var8);
            return 1;
         } else if (var0 == 3302) {
            class124.field1569 -= 2;
            var3 = class46.field659[class124.field1569];
            var8 = class46.field659[class124.field1569 + 1];
            class46.field659[++class124.field1569 - 1] = class136.method3660(var3, var8);
            return 1;
         } else if (var0 == 3303) {
            class124.field1569 -= 2;
            var3 = class46.field659[class124.field1569];
            var8 = class46.field659[class124.field1569 + 1];
            class46.field659[++class124.field1569 - 1] = class197.method4388(var3, var8);
            return 1;
         } else if (var0 == 3304) {
            var3 = class46.field659[--class124.field1569];
            class46.field659[++class124.field1569 - 1] = class54.method1985(var3).field1961;
            return 1;
         } else if (var0 == 3305) {
            var3 = class46.field659[--class124.field1569];
            class46.field659[++class124.field1569 - 1] = client.field539[var3];
            return 1;
         } else if (var0 == 3306) {
            var3 = class46.field659[--class124.field1569];
            class46.field659[++class124.field1569 - 1] = client.field402[var3];
            return 1;
         } else if (var0 == 3307) {
            var3 = class46.field659[--class124.field1569];
            class46.field659[++class124.field1569 - 1] = client.field353[var3];
            return 1;
         } else {
            int var5;
            if (var0 == 3308) {
               var3 = class333.field3836.field1170;
               var8 = (class76.field1108.field1055 >> 7) + class333.field3836.field1164;
               var5 = (class76.field1108.field1056 >> 7) + class333.field3836.field1165;
               class46.field659[++class124.field1569 - 1] = class356.method7461(var3, var8, var5);
               return 1;
            } else if (var0 == 3309) {
               var3 = class46.field659[--class124.field1569];
               class46.field659[++class124.field1569 - 1] = class356.method7424(var3);
               return 1;
            } else if (var0 == 3310) {
               var3 = class46.field659[--class124.field1569];
               class46.field659[++class124.field1569 - 1] = class356.method7413(var3);
               return 1;
            } else if (var0 == 3311) {
               var3 = class46.field659[--class124.field1569];
               class46.field659[++class124.field1569 - 1] = class356.method7415(var3);
               return 1;
            } else if (var0 == 3312) {
               class46.field659[++class124.field1569 - 1] = client.field326 ? 1 : 0;
               return 1;
            } else if (var0 == 3313) {
               class124.field1569 -= 2;
               var3 = class46.field659[class124.field1569] + '耀';
               var8 = class46.field659[class124.field1569 + 1];
               class46.field659[++class124.field1569 - 1] = class372.method8131(var3, var8);
               return 1;
            } else if (var0 == 3314) {
               class124.field1569 -= 2;
               var3 = class46.field659[class124.field1569] + '耀';
               var8 = class46.field659[class124.field1569 + 1];
               class46.field659[++class124.field1569 - 1] = class136.method3660(var3, var8);
               return 1;
            } else if (var0 == 3315) {
               class124.field1569 -= 2;
               var3 = class46.field659[class124.field1569] + '耀';
               var8 = class46.field659[class124.field1569 + 1];
               class46.field659[++class124.field1569 - 1] = class197.method4388(var3, var8);
               return 1;
            } else if (var0 == 3316) {
               if (client.field428 >= 2) {
                  class46.field659[++class124.field1569 - 1] = client.field428;
               } else {
                  class46.field659[++class124.field1569 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3317) {
               class46.field659[++class124.field1569 - 1] = client.field373;
               return 1;
            } else if (var0 == 3318) {
               class46.field659[++class124.field1569 - 1] = client.field325;
               return 1;
            } else if (var0 == 3321) {
               class46.field659[++class124.field1569 - 1] = client.field592 / 100;
               return 1;
            } else if (var0 == 3322) {
               class46.field659[++class124.field1569 - 1] = client.field490;
               return 1;
            } else if (var0 == 3323) {
               if (client.field430) {
                  class46.field659[++class124.field1569 - 1] = 1;
               } else {
                  class46.field659[++class124.field1569 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3324) {
               class46.field659[++class124.field1569 - 1] = client.field385;
               return 1;
            } else if (var0 == 3325) {
               class124.field1569 -= 4;
               var3 = class46.field659[class124.field1569];
               var8 = class46.field659[class124.field1569 + 1];
               var5 = class46.field659[class124.field1569 + 2];
               int var6 = class46.field659[class124.field1569 + 3];
               int var7 = class356.method7461(var5, var8, var6);
               class46.field659[++class124.field1569 - 1] = var7 + var3;
               return 1;
            } else if (var0 == 3326) {
               class46.field659[++class124.field1569 - 1] = client.field386;
               return 1;
            } else if (var0 == 3327) {
               class46.field659[++class124.field1569 - 1] = client.field396;
               return 1;
            } else if (var0 == 3331) {
               class46.field659[++class124.field1569 - 1] = client.field592;
               return 1;
            } else if (var0 == 3332) {
               var3 = class46.field659[--class124.field1569];
               class46.field659[++class124.field1569 - 1] = client.field615[var3];
               return 1;
            } else if (var0 == 3333) {
               class46.field660[++class46.field658 - 1] = client.field345;
               return 1;
            } else if (var0 == 3339) {
               var3 = class46.field659[--class124.field1569];
               if (var3 == -1) {
                  class46.field660[++class46.field658 - 1] = "";
               } else {
                  class203 var4 = class157.method3872(var3);
                  class46.field660[++class46.field658 - 1] = var4 == null ? "" : var4.field2233;
               }

               return 1;
            } else {
               return 2;
            }
         }
      }
   }
}
