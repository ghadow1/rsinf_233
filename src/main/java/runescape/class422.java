package runescape;

import java.util.Arrays;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
final class class422 implements Comparator {
   @ObfuscatedName("af")
   public static int[] field5047;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lqi;Lqi;I)I",
      garbageValue = "-1706523714"
   )
   int method8534(class420 var1, class420 var2) {
      return var1.field5032.field5040 < var2.field5032.field5040 ? -1 : (var2.field5032.field5040 == var1.field5032.field5040 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method8534((class420)var1, (class420)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lre;Lre;B)Lre;",
      garbageValue = "1"
   )
   public static final class452 method8536(class452 var0, class452 var1) {
      class452 var2 = class334.method7060(var0);
      var2.method9020(var1);
      return var2;
   }

   @ObfuscatedName("ja")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1786300711"
   )
   static boolean method8532() {
      return (client.field350 & 8) != 0;
   }

   @ObfuscatedName("kw")
   @ObfuscatedSignature(
      descriptor = "(Ldr;B)V",
      garbageValue = "66"
   )
   static void method8537(class79 var0) {
      int var1 = var0.field1162 / 8;
      int var2 = var0.field1163 / 8;
      boolean var3 = false;
      class286.method6372(false);
      var3 = true;

      int var4;
      for(var4 = 0; var4 < class166.field1890.length; ++var4) {
         if (class91.field1281[var4] != -1 && class166.field1890[var4] == null) {
            class166.field1890[var4] = class149.field1760.method8335(class91.field1281[var4], 0);
            if (class166.field1890[var4] == null) {
               var3 = false;
            }
         }

         if (class100.field1377[var4] != -1 && class215.field2494[var4] == null) {
            class215.field2494[var4] = class149.field1760.method8336(class100.field1377[var4], 0, class87.field1235[var4]);
            if (class215.field2494[var4] == null) {
               var3 = false;
            }
         }
      }

      if (var3) {
         class286.method6372(false);
         var3 = true;

         for(var4 = 0; var4 < class166.field1890.length; ++var4) {
            byte[] var17 = class215.field2494[var4];
            if (var17 != null) {
               byte var6 = 10;
               byte var7 = 10;
               var3 &= class193.method4320(var17, var6, var7);
            }
         }

         if (var3) {
            int var5;
            for(var4 = 0; var4 < 4; ++var4) {
               for(var5 = 0; var5 < var0.field1168[var4].length; ++var5) {
                  Arrays.fill(var0.field1168[var4][var5], (byte)0);
               }
            }

            class125.method3557();
            class61.method2093();
            var0.method2686();
            class286.method6372(true);

            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            int var18;
            for(var4 = 0; var4 < 4; ++var4) {
               class125.method3557();

               for(var5 = 0; var5 < var1; ++var5) {
                  for(var18 = 0; var18 < var2; ++var18) {
                     boolean var19 = false;
                     var8 = client.field423[var4][var5][var18];
                     if (var8 != -1) {
                        var9 = class153.method3835(var8);
                        var10 = class61.method2087(var8);
                        var11 = class253.method5796(var8);
                        var12 = class34.method689(var8);
                        var13 = (var11 / 8 << 8) + var12 / 8;

                        for(int var14 = 0; var14 < class235.field2811.length; ++var14) {
                           if (class235.field2811[var14] == var13 && class166.field1890[var14] != null) {
                              int var15 = (var11 - var5) * 8;
                              int var16 = (var12 - var18) * 8;
                              class124.method3545(var0, class166.field1890[var14], var4, var5 * 8, var18 * 8, var9, (var11 & 7) * 8, (var12 & 7) * 8, var10, var15, var16);
                              var19 = true;
                              break;
                           }
                        }
                     }

                     if (!var19) {
                        class173.method4095(var0.field1173, var4, var5 * 8, var18 * 8);
                     }
                  }
               }
            }

            for(var4 = 0; var4 < 13; ++var4) {
               for(var5 = 0; var5 < 13; ++var5) {
                  var18 = client.field423[0][var4][var5];
                  if (var18 == -1) {
                     class443.method8868(var0, var4 * 8, var5 * 8, 8, 8);
                  }
               }
            }

            class286.method6372(true);

            for(var4 = 0; var4 < 4; ++var4) {
               class125.method3557();

               for(var5 = 0; var5 < var1; ++var5) {
                  for(var18 = 0; var18 < var2; ++var18) {
                     int var20 = client.field423[var4][var5][var18];
                     if (var20 != -1) {
                        var8 = class153.method3835(var20);
                        var9 = class61.method2087(var20);
                        var10 = class253.method5796(var20);
                        var11 = class34.method689(var20);
                        var12 = (var10 / 8 << 8) + var11 / 8;

                        for(var13 = 0; var13 < class235.field2811.length; ++var13) {
                           if (class235.field2811[var13] == var12 && class215.field2494[var13] != null) {
                              class59.method2034(var0, class215.field2494[var13], var4, var5 * 8, var18 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9);
                              break;
                           }
                        }
                     }
                  }
               }
            }

            class286.method6372(true);
            class125.method3557();
            class277.method6233(var0);
            class286.method6372(true);
            class212.field2315.method7011();
            class125.method3557();
            class195.method4383();
            client.field453 = false;
         }
      }
   }
}
