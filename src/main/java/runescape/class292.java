package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lc")
public class class292 extends class298 {
   @ObfuscatedName("db")
   @ObfuscatedSignature(
      descriptor = "[Lxt;"
   )
   static class605[] field3380;
   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "Lxc;"
   )
   static class604 field3377;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -939145015
   )
   int field3376;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 381949617
   )
   int field3378;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 719315667
   )
   int field3381;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1828466757
   )
   int field3379;

   class292() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-2015769013"
   )
   void method6702(Buffer var1) {
      int var2 = var1.method11196();
      if (var2 != class304.field3466.field3468) {
         throw new IllegalStateException("");
      } else {
         super.field3425 = var1.method11196();
         super.field3428 = var1.method11196();
         super.field3433 = var1.readUnsignedShort() * 4096;
         super.field3426 = var1.readUnsignedShort() * 4096;
         this.field3376 = var1.method11196();
         this.field3378 = var1.method11196();
         super.field3431 = var1.readUnsignedShort();
         super.field3429 = var1.readUnsignedShort();
         this.field3381 = var1.method11196();
         this.field3379 = var1.method11196();
         super.field3432 = var1.method11222();
         super.field3427 = var1.method11222();
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "1975102326"
   )
   void vmethod6791(Buffer var1) {
      super.field3428 = Math.min(super.field3428, 4);
      super.field3430 = new short[1][64][64];
      super.field3434 = new short[super.field3428][64][64];
      super.field3435 = new byte[super.field3428][64][64];
      super.field3436 = new byte[super.field3428][64][64];
      super.field3437 = new class300[super.field3428][64][64][];
      int var2 = var1.method11196();
      if (var2 != class303.field3462.field3464) {
         throw new IllegalStateException("");
      } else {
         int var3 = var1.method11196();
         int var4 = var1.method11196();
         int var5 = var1.method11196();
         int var6 = var1.method11196();
         if (var3 == super.field3431 && var4 == super.field3429 && var5 == this.field3381 && var6 == this.field3379) {
            for(int var7 = 0; var7 < 8; ++var7) {
               for(int var8 = 0; var8 < 8; ++var8) {
                  this.method6787(var7 + this.field3381 * 8, var8 + this.field3379 * 8, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "62"
   )
   int method6688() {
      return this.field3376;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1842342027"
   )
   int method6682() {
      return this.field3378;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-97475939"
   )
   int method6686() {
      return this.field3381;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-667716871"
   )
   int method6687() {
      return this.field3379;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class292)) {
         return false;
      } else {
         class292 var2 = (class292)var1;
         if (var2.field3431 == super.field3431 && super.field3429 == var2.field3429) {
            return var2.field3381 == this.field3381 && this.field3379 == var2.field3379;
         } else {
            return false;
         }
      }
   }

   public int hashCode() {
      return super.field3431 | super.field3429 << 8 | this.field3381 << 16 | this.field3379 << 24;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpx;Lpx;II)Ljj;",
      garbageValue = "-908959487"
   )
   public static class235 method6690(class412 var0, class412 var1, int var2) {
      boolean var3 = true;
      int var4 = -1;
      int[] var5 = var0.method8353(var2);

      for(int var6 = 0; var6 < var5.length; ++var6) {
         byte[] var7 = var0.method8343(var2, var5[var6]);
         if (var7 == null) {
            var3 = false;
         } else if (var4 == -1) {
            var4 = (var7[0] & 255) << 8 | var7[1] & 255;
         }
      }

      if (var4 != -1) {
         byte[] var8 = var1.method8343(var4, 0);
         if (var8 == null) {
            var3 = false;
         }
      } else {
         var3 = false;
      }

      if (!var3) {
         return null;
      } else {
         try {
            return new class235(var0, var1, var2);
         } catch (Exception var9) {
            return null;
         }
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "0"
   )
   static void method6698(boolean var0) {
      if (var0) {
         class231.method5344();
      } else {
         for(int var1 = 0; var1 < class339.field3890.size(); ++var1) {
            class351 var2 = (class351)class339.field3890.get(var1);
            if (var2 == null) {
               class339.field3890.remove(var1);
               --var1;
            } else if (var2.field4011) {
               if (var2.field4012.field3904 > 0) {
                  --var2.field4012.field3904;
               }

               var2.field4012.method7145();
               var2.field4012.method7143();
               var2.field4012.method7218(0);
               class339.field3890.remove(var1);
               --var1;
            } else {
               var2.field4011 = true;
            }
         }
      }

   }
}
