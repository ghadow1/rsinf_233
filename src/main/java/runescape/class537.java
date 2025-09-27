package runescape;

import java.awt.Component;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ue")
public class class537 {
   @ObfuscatedName("aq")
   static int[] field5582 = new int['耀'];
   @ObfuscatedName("ao")
   public static int[] field5583;
   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "Lrw;"
   )
   static class449 field5585;
   @ObfuscatedName("dr")
   @ObfuscatedGetter(
      intValue = 143401593
   )
   static int field5577;
   @ObfuscatedName("sb")
   @ObfuscatedSignature(
      descriptor = "Lbw;"
   )
   static class50 field5586;

   static {
      for(int var0 = 0; var0 < 32768; ++var0) {
         field5582[var0] = method10542(var0);
      }

      if (field5583 == null) {
         field5583 = new int[65536];
         double var25 = 0.949999988079071D;

         for(int var2 = 0; var2 < 65536; ++var2) {
            double var3 = (double)(var2 >> 10 & 63) / 64.0D + 0.0078125D;
            double var5 = 0.0625D + (double)(var2 >> 7 & 7) / 8.0D;
            double var7 = (double)(var2 & 127) / 128.0D;
            double var9 = var7;
            double var11 = var7;
            double var13 = var7;
            if (var5 != 0.0D) {
               double var15;
               if (var7 < 0.5D) {
                  var15 = (var5 + 1.0D) * var7;
               } else {
                  var15 = var5 + var7 - var5 * var7;
               }

               double var17 = 2.0D * var7 - var15;
               double var19 = 0.3333333333333333D + var3;
               if (var19 > 1.0D) {
                  --var19;
               }

               double var23 = var3 - 0.3333333333333333D;
               if (var23 < 0.0D) {
                  ++var23;
               }

               if (6.0D * var19 < 1.0D) {
                  var9 = var19 * (var15 - var17) * 6.0D + var17;
               } else if (2.0D * var19 < 1.0D) {
                  var9 = var15;
               } else if (3.0D * var19 < 2.0D) {
                  var9 = (0.6666666666666666D - var19) * (var15 - var17) * 6.0D + var17;
               } else {
                  var9 = var17;
               }

               if (6.0D * var3 < 1.0D) {
                  var11 = var17 + var3 * (var15 - var17) * 6.0D;
               } else if (2.0D * var3 < 1.0D) {
                  var11 = var15;
               } else if (3.0D * var3 < 2.0D) {
                  var11 = (0.6666666666666666D - var3) * (var15 - var17) * 6.0D + var17;
               } else {
                  var11 = var17;
               }

               if (6.0D * var23 < 1.0D) {
                  var13 = var23 * 6.0D * (var15 - var17) + var17;
               } else if (var23 * 2.0D < 1.0D) {
                  var13 = var15;
               } else if (var23 * 3.0D < 2.0D) {
                  var13 = 6.0D * (0.6666666666666666D - var23) * (var15 - var17) + var17;
               } else {
                  var13 = var17;
               }
            }

            var9 = Math.pow(var9, var25);
            var11 = Math.pow(var11, var25);
            var13 = Math.pow(var13, var25);
            int var27 = (int)(256.0D * var9);
            int var16 = (int)(256.0D * var11);
            int var28 = (int)(var13 * 256.0D);
            int var18 = var28 + (var16 << 8) + (var27 << 16);
            field5583[var2] = var18 & 16777215;
         }
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "2125201828"
   )
   static final int method10542(int var0) {
      double var1 = (double)(var0 >> 10 & 31) / 31.0D;
      double var3 = (double)(var0 >> 5 & 31) / 31.0D;
      double var5 = (double)(var0 & 31) / 31.0D;
      double var7 = var1;
      if (var3 < var1) {
         var7 = var3;
      }

      if (var5 < var7) {
         var7 = var5;
      }

      double var9 = var1;
      if (var3 > var1) {
         var9 = var3;
      }

      if (var5 > var9) {
         var9 = var5;
      }

      double var11 = 0.0D;
      double var13 = 0.0D;
      double var15 = (var9 + var7) / 2.0D;
      if (var9 != var7) {
         if (var15 < 0.5D) {
            var13 = (var9 - var7) / (var7 + var9);
         }

         if (var15 >= 0.5D) {
            var13 = (var9 - var7) / (2.0D - var9 - var7);
         }

         if (var9 == var1) {
            var11 = (var3 - var5) / (var9 - var7);
         } else if (var9 == var3) {
            var11 = 2.0D + (var5 - var1) / (var9 - var7);
         } else if (var5 == var9) {
            var11 = 4.0D + (var1 - var3) / (var9 - var7);
         }
      }

      int var17 = (int)(var11 * 256.0D / 6.0D);
      var17 &= 255;
      double var18 = 256.0D * var13;
      if (var18 < 0.0D) {
         var18 = 0.0D;
      } else if (var18 > 255.0D) {
         var18 = 255.0D;
      }

      if (var15 > 0.7D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.75D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.85D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.95D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.995D) {
         var15 = 0.995D;
      }

      int var20 = (int)((double)(var17 / 4 * 8) + var18 / 32.0D);
      return (var20 << 7) + (int)(var15 * 128.0D);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/awt/Component;I)V",
      garbageValue = "2113437932"
   )
   static void method10541(Component var0) {
      var0.removeMouseListener(class35.field226);
      var0.removeMouseMotionListener(class35.field226);
      var0.removeFocusListener(class35.field226);
      class35.field228 = 0;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lqm;III)I",
      garbageValue = "-523276748"
   )
   static int method10547(class426 var0, int var1, int var2) {
      if (var0 == null) {
         return var2;
      } else {
         class543 var3 = (class543)var0.method8596((long)var1);
         return var3 == null ? var2 : var3.field5597;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "0"
   )
   public static int method10535(int var0) {
      return 255 - (var0 & 255);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-617326647"
   )
   public static int method10543(int var0) {
      return var0 >> 11 & 63;
   }

   @ObfuscatedName("ap")
   public static int method10539(long var0) {
      return (int)(var0 >>> 20 & 4294967295L);
   }

   @ObfuscatedName("hy")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1990150150"
   )
   static int method10536() {
      if (client.field602 != null && client.field487 < client.field602.size()) {
         int var0 = 0;

         for(int var1 = 0; var1 <= client.field487; ++var1) {
            var0 += ((class61)client.field602.get(var1)).field861;
         }

         return var0 * 10000 / client.field604;
      } else {
         return 10000;
      }
   }

   @ObfuscatedName("me")
   @ObfuscatedSignature(
      descriptor = "([Loi;IIIIIIZI)V",
      garbageValue = "-2146630711"
   )
   static void method10545(class369[] var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      for(int var8 = var1; var8 <= var2; ++var8) {
         class369 var9 = var0[var8];
         if (var9 != null && var3 == var9.field4164 && var4 == var9.field4165) {
            class354.method7399(var9, var5, var6, var7);
            class252.method5794(var9, var5, var6);
            if (var9.field4260 > var9.field4193 - var9.field4160 * 469894397) {
               var9.field4260 = var9.field4193 - var9.field4160 * 469894397;
            }

            if (var9.field4260 < 0) {
               var9.field4260 = 0;
            }

            if (var9.field4170 > var9.field4172 - var9.field4149 * 1156037777) {
               var9.field4170 = var9.field4172 - var9.field4149 * 1156037777;
            }

            if (var9.field4170 < 0) {
               var9.field4170 = 0;
            }

            if (var9.field4147 == 0) {
               class23.method337(var0, var9, var7);
            }
         }
      }

   }

   @ObfuscatedName("ns")
   @ObfuscatedSignature(
      descriptor = "(Loi;I)V",
      garbageValue = "-1637608451"
   )
   static final void method10544(class369 var0) {
      int var1 = var0.field4168;
      if (var1 == 324) {
         if (client.field479 == -1) {
            client.field479 = var0.field4183;
            client.field569 = var0.field4184;
         }

         if (client.field322.field4084 == 1) {
            var0.field4183 = client.field479;
         } else {
            var0.field4183 = client.field569;
         }

      } else if (var1 == 325) {
         if (client.field479 == -1) {
            client.field479 = var0.field4183;
            client.field569 = var0.field4184;
         }

         if (client.field322.field4084 == 1) {
            var0.field4183 = client.field569;
         } else {
            var0.field4183 = client.field479;
         }

      } else if (var1 == 327) {
         var0.field4200 = 150;
         var0.field4235 = (int)(Math.sin((double)client.cycle / 40.0D) * 256.0D) & 2047;
         var0.field4192 = 5;
         var0.field4277 = 0;
      } else if (var1 == 328) {
         var0.field4200 = 150;
         var0.field4235 = (int)(Math.sin((double)client.cycle / 40.0D) * 256.0D) & 2047;
         var0.field4192 = 5;
         var0.field4277 = 1;
      }
   }
}
