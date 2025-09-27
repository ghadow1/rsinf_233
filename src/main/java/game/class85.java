package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
public final class class85 extends class233 {
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1278167567
   )
   int field1221;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1278625025
   )
   int field1222;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 703195807
   )
   int field1223;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -310039813
   )
   int field1224;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1679656779
   )
   int field1225;
   @ObfuscatedName("ao")
   boolean field1226;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1399560353
   )
   int field1227 = 31;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lgq;"
   )
   class176 field1220;

   class85() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2147164729"
   )
   void method2802(int var1) {
      this.field1227 = var1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1995670392"
   )
   boolean method2820(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field1227 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Ljn;",
      garbageValue = "-1879635116"
   )
   protected final class241 vmethod5365() {
      class213 var1 = class84.method2800(this.field1221);
      return this.field1220 == null ? var1.method4719(this.field1222) : var1.method4662(this.field1220);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Lgq;",
      garbageValue = "-595082567"
   )
   class176 method2805() {
      return this.field1220;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lgq;B)V",
      garbageValue = "-84"
   )
   void method2812(class176 var1) {
      this.field1220 = var1;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-96"
   )
   void method2818() {
      this.field1220 = null;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/Object;III)Ljava/lang/String;",
      garbageValue = "1446240292"
   )
   public static String method2824(Object[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (var2 == 1) {
         CharSequence var10 = (CharSequence)var0[var1];
         return var10 == null ? "null" : var10.toString();
      } else {
         int var3 = var2 + var1;
         int var4 = 0;

         for(int var5 = var1; var5 < var3; ++var5) {
            CharSequence var9 = (CharSequence)var0[var5];
            if (var9 == null) {
               var4 += 4;
            } else {
               var4 += var9.length();
            }
         }

         StringBuilder var8 = new StringBuilder(var4);

         for(int var6 = var1; var6 < var3; ++var6) {
            CharSequence var7 = (CharSequence)var0[var6];
            if (var7 == null) {
               var8.append("null");
            } else {
               var8.append(var7);
            }
         }

         return var8.toString();
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIB)Lcg;",
      garbageValue = "19"
   )
   static class55 method2825(int var0, int var1) {
      class55 var2 = (class55)class55.field800.method7018((long)(var0 << 16));
      if (var2 != null) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = class334.field3841.method8361(var3);
         if (var4 == -1) {
            return null;
         } else {
            byte[] var5 = class334.field3841.method8425(var4);
            if (var5 != null) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = class137.method3668(var5);
               if (var2 != null) {
                  class55.field800.method7009(var2, (long)(var0 << 16));
                  return var2;
               }
            }

            return null;
         }
      }
   }

   @ObfuscatedName("kx")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "123"
   )
   static final void method2823(int var0) {
      int[] var1 = class245.field2992.field6018;
      int var2 = var1.length;

      int var3;
      for(var3 = 0; var3 < var2; ++var3) {
         var1[var3] = 0;
      }

      int var4;
      int var5;
      for(var3 = 1; var3 < 103; ++var3) {
         var4 = (103 - var3) * 2048 + 24628;

         for(var5 = 1; var5 < 103; ++var5) {
            if ((class333.field3836.field1168[var0][var5][var3] & 24) == 0) {
               class333.field3836.field1159.method5316(var1, var4, 512, var0, var5, var3);
            }

            if (var0 < 3 && (class333.field3836.field1168[var0 + 1][var5][var3] & 8) != 0) {
               class333.field3836.field1159.method5316(var1, var4, 512, var0 + 1, var5, var3);
            }

            var4 += 4;
         }
      }

      var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
      var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
      class245.field2992.method11688();

      int var6;
      for(var5 = 1; var5 < 103; ++var5) {
         for(var6 = 1; var6 < 103; ++var6) {
            if ((class333.field3836.field1168[var0][var6][var5] & 24) == 0) {
               class27.method413(var0, var6, var5, var3, var4);
            }

            if (var0 < 3 && (class333.field3836.field1168[var0 + 1][var6][var5] & 8) != 0) {
               class27.method413(var0 + 1, var6, var5, var3, var4);
            }
         }
      }

      client.field577 = 0;

      for(var5 = 0; var5 < 104; ++var5) {
         for(var6 = 0; var6 < 104; ++var6) {
            long var7 = class333.field3836.field1159.method5215(class333.field3836.field1170, var5, var6);
            if (var7 != 0L) {
               int var9 = class537.method10539(var7);
               int var10 = class433.method8669(var9).field2342;
               if (var10 >= 0 && class198.method4395(var10).field2000) {
                  client.field580[client.field577] = class198.method4395(var10).method4184(false);
                  client.field578[client.field577] = var5;
                  client.field507[client.field577] = var6;
                  ++client.field577;
               }
            }
         }
      }

      class34.field181.method11655();
   }
}
