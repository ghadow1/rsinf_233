package runescape;

import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
final class class145 implements ThreadFactory {
   @ObfuscatedName("kc")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field1726;
   @ObfuscatedName("vz")
   @ObfuscatedGetter(
      intValue = -1698156661
   )
   static int field1725;

   public Thread newThread(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsp;ILsk;I)I",
      garbageValue = "-30338501"
   )
   public static int method3747(class469 var0, int var1, class468 var2) {
      int var3 = 0;
      if (!var0.method9566()) {
         var0.method9575(0);
         return var3;
      } else {
         class215 var4 = var0.method9581();
         if (var4.field2493 == -1) {
            var3 |= 8;
         }

         if (var4.method4791()) {
            var0.method9575(0);
         } else {
            var0.method9575(var0.method9574() + var1);
         }

         if (!var4.method4768()) {
            var3 |= class46.method1774(var0, var1, var2);
            return var3;
         } else {
            int var7 = var1;
            int var8 = 0;
            class215 var9 = var0.method9581();
            if (var9.field2493 > 0 && var1 > 0) {
               var7 = var1 - (var1 - 1) / var9.field2493 * var9.field2493;
            }

            int var10 = var0.method9565();
            int var11 = var0.method9620();

            while(true) {
               int var12;
               do {
                  if (var7 <= 0) {
                     var0.method9579(var10, var11);
                     var3 |= var8;
                     return var3;
                  }

                  --var7;
                  ++var10;
                  var8 |= 4;
                  if ((var8 & 2) == 0 && var2 != null) {
                     var2.vmethod10858(var9, var10);
                  }

                  var12 = var9.method4769();
               } while(var10 < var12);

               ++var11;
               var8 |= 1;
               var10 -= var9.field2493;
               if (var11 >= var9.field2486) {
                  var8 |= 2;
               }

               if (var10 < 0 || var10 >= var12) {
                  var8 |= 2;
                  var10 = 0;
               }

               if ((var8 & 2) == 0 && var2 != null) {
                  var2.vmethod10858(var9, var10);
               }
            }
         }
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIS)I",
      garbageValue = "334"
   )
   public static int method3751(int var0, int var1) {
      int var2;
      for(var2 = 1; var1 > 1; var1 >>= 1) {
         if ((var1 & 1) != 0) {
            var2 = var0 * var2;
         }

         var0 *= var0;
      }

      if (var1 == 1) {
         return var0 * var2;
      } else {
         return var2;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)[Lfm;",
      garbageValue = "-36"
   )
   static class147[] method3750() {
      return new class147[]{class147.field1746, class147.field1741, class147.field1742, class147.field1743, class147.field1744, class147.field1747, class147.field1745, class147.field1740, class147.field1748};
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(FI)F",
      garbageValue = "1829254533"
   )
   static final float method3742(float var0) {
      var0 = (var0 - 75.0F) * 1.0100503F;
      return 1.0100503F + 150.75377F / var0;
   }

   @ObfuscatedName("hh")
   @ObfuscatedSignature(
      descriptor = "(Lmy;B)V",
      garbageValue = "-18"
   )
   static void method3748(class329 var0) {
      var0.out.writeIntBigEndian(class193.field2091.field4959);
      var0.out.putIntCustomEndian234(class496.field5387.field4959);
      var0.out.putIntLittleEndian(field1726.field4959);
      var0.out.putIntLittleEndian(class358.field4042.field4959);
      var0.out.putIntLittleEndian(class159.field1830.field4959);
      var0.out.putIntCustomEndian234(class115.field1514.field4959);
      var0.out.putIntCustomEndian(class27.field130.field4959);
   }

   @ObfuscatedName("md")
   @ObfuscatedSignature(
      descriptor = "(Loi;I)V",
      garbageValue = "-1162921603"
   )
   static final void method3749(class369 var0) {
      if (var0.field4245 == 1) {
         class286.method6373(var0.field4279, "", 24, 0, 0, var0.field4144, var0.field4282);
      }

      if (var0.field4245 == 2 && !client.field529) {
         String var1 = class286.method6374(var0);
         if (var1 != null) {
            class286.method6373(var1, class134.method3619(65280) + var0.field4298, 25, 0, -1, var0.field4144, var0.field4282);
         }
      }

      if (var0.field4245 == 3) {
         class151.method3817("Close", "", 26, 0, 0, var0.field4144);
      }

      if (var0.field4245 == 4) {
         class151.method3817(var0.field4279, "", 28, 0, 0, var0.field4144);
      }

      if (var0.field4245 == 5) {
         class151.method3817(var0.field4279, "", 29, 0, 0, var0.field4144);
      }

      if (var0.field4245 == 6 && client.field564 == null) {
         class151.method3817(var0.field4279, "", 30, 0, -1, var0.field4144);
      }

      if (var0.field4143) {
         if (client.field529) {
            if (class23.method338(class373.method8139(var0)) && (class337.field3865 & 32) == 32) {
               class286.method6373(client.field374, client.field533 + " " + "->" + " " + var0.field4227, 58, 0, var0.field4145 * -217986249, var0.field4144, var0.field4282);
            }
         } else {
            for(int var8 = 31; var8 >= 0; --var8) {
               String var9;
               if (var8 == var0.field4230 * 1337113375) {
                  var9 = class286.method6374(var0);
                  if (var9 != null) {
                     class286.method6373(var9, var0.field4227, 25, 0, var0.field4145 * -217986249, var0.field4144, var0.field4282);
                  }
               }

               var9 = class184.method4186(var0, var8);
               if (var9 != null) {
                  int var3;
                  short var4;
                  if (var8 > var0.field4230 * 1337113375) {
                     var4 = 1007;
                     var3 = class286.method6373(var9, var0.field4227, var4, var8 + 1, var0.field4145 * -217986249, var0.field4144, var0.field4282);
                  } else {
                     var4 = 57;
                     var3 = class423.method8546(var9, var0.field4227, var4, var8 + 1, var0.field4145 * -217986249, var0.field4144, var0.field4282, var0.field4148, -1);
                  }

                  if (var0.field4229 != null && var8 < var0.field4229.length && var0.field4229[var8] != null) {
                     String[] var5 = var0.field4229[var8];

                     for(int var6 = var5.length - 1; var6 >= 0; --var6) {
                        int var7 = var6 + 1 << 16 | var8 + 1;
                        if (var5[var6] != null && !var5[var6].isEmpty()) {
                           class402.method8247(var3, var5[var6], "", var4, var7, var0.field4145 * -217986249, var0.field4144, var0.field4282, -1);
                        }
                     }
                  }
               }
            }

            int var2 = class373.method8139(var0);
            boolean var10 = (var2 & 1) != 0;
            if (var10) {
               class151.method3817("Continue", "", 30, 0, var0.field4145 * -217986249, var0.field4144);
            }
         }
      }

   }
}
