package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
public class class288 implements class309 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 918663535
   )
   int field3324;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1429189785
   )
   int field3319;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1543150995
   )
   int field3318;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 126941049
   )
   int field3321;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1126996333
   )
   int field3320;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1276808359
   )
   int field3316;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 915645513
   )
   int field3322;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1525203979
   )
   int field3323;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1185983241
   )
   int field3317;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1405319925
   )
   int field3325;

   class288() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lll;I)V",
      garbageValue = "1896416407"
   )
   public void vmethod6913(class289 var1) {
      if (var1.field3337 > this.field3322) {
         var1.field3337 = this.field3322;
      }

      if (var1.field3335 < this.field3317) {
         var1.field3335 = this.field3317;
      }

      if (var1.field3326 > this.field3323) {
         var1.field3326 = this.field3323;
      }

      if (var1.field3336 < this.field3325) {
         var1.field3336 = this.field3325;
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "-739948834"
   )
   public boolean vmethod6897(int var1, int var2, int var3) {
      if (var1 >= this.field3324 && var1 < this.field3319 + this.field3324) {
         return var2 >> 6 >= this.field3318 && var2 >> 6 <= this.field3320 && var3 >> 6 >= this.field3321 && var3 >> 6 <= this.field3316;
      } else {
         return false;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "-51"
   )
   public boolean vmethod6896(int var1, int var2) {
      return var1 >> 6 >= this.field3322 && var1 >> 6 <= this.field3317 && var2 >> 6 >= this.field3323 && var2 >> 6 <= this.field3325;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIII)[I",
      garbageValue = "-2061697618"
   )
   public int[] vmethod6899(int var1, int var2, int var3) {
      if (!this.vmethod6897(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field3322 * 64 - this.field3318 * 64 + var2, var3 + (this.field3323 * 64 - this.field3321 * 64)};
         return var4;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IIB)Lna;",
      garbageValue = "1"
   )
   public class356 vmethod6898(int var1, int var2) {
      if (!this.vmethod6896(var1, var2)) {
         return null;
      } else {
         int var3 = this.field3318 * 64 - this.field3322 * 64 + var1;
         int var4 = this.field3321 * 64 - this.field3323 * 64 + var2;
         return new class356(this.field3324, var3, var4);
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-1979822224"
   )
   public void vmethod6901(class590 var1) {
      this.field3324 = var1.method11196();
      this.field3319 = var1.method11196();
      this.field3318 = var1.method11198();
      this.field3321 = var1.method11198();
      this.field3320 = var1.method11198();
      this.field3316 = var1.method11198();
      this.field3322 = var1.method11198();
      this.field3323 = var1.method11198();
      this.field3317 = var1.method11198();
      this.field3325 = var1.method11198();
      this.method6400();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1011254922"
   )
   void method6400() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lqh;I)I",
      garbageValue = "319270884"
   )
   public static int method6408(CharSequence var0, CharSequence var1, class432 var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      char var7 = 0;
      char var8 = 0;

      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         char var9;
         if (var7 != 0) {
            var9 = var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if (var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         var7 = class120.method3517(var9);
         var8 = class120.method3517(var10);
         var9 = class525.method10443(var9, var2);
         var10 = class525.method10443(var10, var2);
         if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
            var9 = Character.toLowerCase(var9);
            var10 = Character.toLowerCase(var10);
            if (var10 != var9) {
               return class410.method8329(var9, var2) - class410.method8329(var10, var2);
            }
         }
      }

      int var16 = Math.min(var3, var4);

      char var12;
      int var17;
      for(var17 = 0; var17 < var16; ++var17) {
         if (var2 == class432.field5094) {
            var5 = var3 - 1 - var17;
            var6 = var4 - 1 - var17;
         } else {
            var6 = var17;
            var5 = var17;
         }

         char var11 = var0.charAt(var5);
         var12 = var1.charAt(var6);
         if (var11 != var12 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) {
            var11 = Character.toLowerCase(var11);
            var12 = Character.toLowerCase(var12);
            if (var11 != var12) {
               return class410.method8329(var11, var2) - class410.method8329(var12, var2);
            }
         }
      }

      var17 = var3 - var4;
      if (var17 != 0) {
         return var17;
      } else {
         for(int var18 = 0; var18 < var16; ++var18) {
            var12 = var0.charAt(var18);
            char var13 = var1.charAt(var18);
            if (var13 != var12) {
               return class410.method8329(var12, var2) - class410.method8329(var13, var2);
            }
         }

         return 0;
      }
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "-2090592192"
   )
   public static int method6418(String var0) {
      return var0.length() + 1;
   }
}
