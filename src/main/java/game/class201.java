package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hn")
public class class201 extends class540 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   static class412 field2203;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   static class412 field2192;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   static class320 field2194 = new class320(64);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   static class320 field2196 = new class320(30);
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 710494713
   )
   static int field2208;
   @ObfuscatedName("lp")
   @ObfuscatedGetter(
      intValue = -1527047515
   )
   static int field2210;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1499698493
   )
   int field2205;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1364881969
   )
   int field2197;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -89069183
   )
   public int field2198 = -1;
   @ObfuscatedName("as")
   short[] field2199;
   @ObfuscatedName("al")
   short[] field2200;
   @ObfuscatedName("au")
   short[] field2201;
   @ObfuscatedName("ai")
   short[] field2202;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1110143411
   )
   int field2193 = 128;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 2127801363
   )
   int field2204 = 128;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1239238851
   )
   int field2209 = 0;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 407225999
   )
   int field2206 = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 378555605
   )
   int field2207 = 0;

   class201() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lwb;B)V",
      garbageValue = "39"
   )
   void method4421(class590 var1) {
      while(true) {
         int var2 = var1.method11196();
         if (var2 == 0) {
            return;
         }

         this.method4406(var1, var2);
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lwb;II)V",
      garbageValue = "720064470"
   )
   void method4406(class590 var1, int var2) {
      if (var2 == 1) {
         this.field2197 = var1.method11198();
      } else if (var2 == 2) {
         this.field2198 = var1.method11198();
      } else if (var2 == 4) {
         this.field2193 = var1.method11198();
      } else if (var2 == 5) {
         this.field2204 = var1.method11198();
      } else if (var2 == 6) {
         this.field2209 = var1.method11198();
      } else if (var2 == 7) {
         this.field2206 = var1.method11196();
      } else if (var2 == 8) {
         this.field2207 = var1.method11196();
      } else {
         int var3;
         int var4;
         if (var2 == 40) {
            var3 = var1.method11196();
            this.field2199 = new short[var3];
            this.field2200 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field2199[var4] = (short)var1.method11198();
               this.field2200[var4] = (short)var1.method11198();
            }
         } else if (var2 == 41) {
            var3 = var1.method11196();
            this.field2201 = new short[var3];
            this.field2202 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field2201[var4] = (short)var1.method11198();
               this.field2202[var4] = (short)var1.method11198();
            }
         }
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljn;",
      garbageValue = "6"
   )
   public final class241 method4407(int var1) {
      class241 var2 = this.method4405();
      if (var2 == null) {
         return null;
      } else {
         class241 var3;
         if (this.field2198 != -1 && var1 != -1) {
            var3 = class177.method4155(this.field2198).method4764(var2, var1);
         } else {
            var3 = var2.method5592(true);
         }

         if (this.field2193 != 128 || this.field2204 != 128) {
            var3.method5475(this.field2193, this.field2204, this.field2193);
         }

         if (this.field2209 != 0) {
            if (this.field2209 == 90) {
               var3.method5550();
            }

            if (this.field2209 == 180) {
               var3.method5550();
               var3.method5550();
            }

            if (this.field2209 == 270) {
               var3.method5550();
               var3.method5550();
               var3.method5550();
            }
         }

         return var3;
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)Ljn;",
      garbageValue = "1"
   )
   public final class241 method4405() {
      class241 var1 = (class241)field2196.method7018((long)this.field2205);
      if (var1 == null) {
         class219 var2 = class219.method4830(field2192, this.field2197, 0);
         if (var2 == null) {
            return null;
         }

         int var3;
         if (this.field2199 != null) {
            for(var3 = 0; var3 < this.field2199.length; ++var3) {
               var2.method4844(this.field2199[var3], this.field2200[var3]);
            }
         }

         if (this.field2201 != null) {
            for(var3 = 0; var3 < this.field2201.length; ++var3) {
               var2.method4849(this.field2201[var3], this.field2202[var3]);
            }
         }

         var1 = var2.method4854(this.field2206 + 64, this.field2207 + 850, -30, -50, -30);
         field2196.method7009(var1, (long)this.field2205);
      }

      return var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;[SI)V",
      garbageValue = "-1205532986"
   )
   public static void method4404(String[] var0, short[] var1) {
      class400.method8244(var0, var1, 0, var0.length - 1);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljn;IIIIFFFFIIII)Z",
      garbageValue = "-2021679335"
   )
   static final boolean method4424(class241 var0, int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9, int var10, int var11) {
      boolean var12 = class242.field2953;
      if (!var12) {
         return false;
      } else {
         class190.method4304(var5, var6, var7, var8, var9, var10, var11);
         return class429.method8641(var0, var1, var2, var3, var4);
      }
   }

   @ObfuscatedName("ks")
   @ObfuscatedSignature(
      descriptor = "(IIIIISISIII)V",
      garbageValue = "-1941298663"
   )
   static void method4425(int var0, int var1, int var2, int var3, int var4, short var5, int var6, short var7, int var8, int var9) {
      class114.method3459(class484.field5343, var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }
}
