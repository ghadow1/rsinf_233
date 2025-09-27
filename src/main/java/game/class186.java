package game;

import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hs")
public class class186 extends class540 {
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1901292413
   )
   public static int field2022;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   static class412 field2023;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   static class412 field2024;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class320 field2033 = new class320(64);
   @ObfuscatedName("ou")
   static String field2025;
   @ObfuscatedName("as")
   int[] field2026;
   @ObfuscatedName("al")
   short[] field2020;
   @ObfuscatedName("au")
   short[] field2028;
   @ObfuscatedName("ai")
   short[] field2029;
   @ObfuscatedName("aa")
   short[] field2030;
   @ObfuscatedName("am")
   int[] field2034 = new int[]{-1, -1, -1, -1, -1};
   @ObfuscatedName("an")
   public boolean field2032 = false;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -2104474877
   )
   int field2031 = -1;

   class186() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "79926931"
   )
   void method4220(class590 var1) {
      while(true) {
         int var2 = var1.method11196();
         if (var2 == 0) {
            return;
         }

         this.method4219(var1, var2);
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lwb;IB)V",
      garbageValue = "0"
   )
   void method4219(class590 var1, int var2) {
      if (var2 == 1) {
         this.field2031 = var1.method11196();
      } else {
         int var3;
         int var4;
         if (var2 == 2) {
            var3 = var1.method11196();
            this.field2026 = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field2026[var4] = var1.method11198();
            }
         } else if (var2 == 3) {
            this.field2032 = true;
         } else if (var2 == 40) {
            var3 = var1.method11196();
            this.field2020 = new short[var3];
            this.field2028 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field2020[var4] = (short)var1.method11198();
               this.field2028[var4] = (short)var1.method11198();
            }
         } else if (var2 == 41) {
            var3 = var1.method11196();
            this.field2029 = new short[var3];
            this.field2030 = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.field2029[var4] = (short)var1.method11198();
               this.field2030[var4] = (short)var1.method11198();
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.field2034[var2 - 60] = var1.method11198();
         }
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "556505998"
   )
   public boolean method4222(int var1, int var2) {
      if (var2 == 1) {
         return var1 + 7 == this.field2031;
      } else {
         return this.field2031 == var1;
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "96"
   )
   public boolean method4223() {
      if (this.field2026 == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.field2026.length; ++var2) {
            if (!field2024.method8337(this.field2026[var2], 0)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)Liu;",
      garbageValue = "-786824558"
   )
   public class219 method4227() {
      if (this.field2026 == null) {
         return null;
      } else {
         class219[] var1 = new class219[this.field2026.length];

         for(int var2 = 0; var2 < this.field2026.length; ++var2) {
            var1[var2] = class219.method4830(field2024, this.field2026[var2], 0);
         }

         class219 var4;
         if (var1.length == 1) {
            var4 = var1[0];
         } else {
            var4 = new class219(var1, var1.length);
         }

         int var3;
         if (this.field2020 != null) {
            for(var3 = 0; var3 < this.field2020.length; ++var3) {
               var4.method4844(this.field2020[var3], this.field2028[var3]);
            }
         }

         if (this.field2029 != null) {
            for(var3 = 0; var3 < this.field2029.length; ++var3) {
               var4.method4849(this.field2029[var3], this.field2030[var3]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-11"
   )
   public boolean method4225() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if (this.field2034[var2] != -1 && !field2024.method8337(this.field2034[var2], 0)) {
            var1 = false;
         }
      }

      return var1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)Liu;",
      garbageValue = "-45"
   )
   public class219 method4228() {
      class219[] var1 = new class219[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (this.field2034[var3] != -1) {
            var1[var2++] = class219.method4830(field2024, this.field2034[var3], 0);
         }
      }

      class219 var5 = new class219(var1, var2);
      int var4;
      if (this.field2020 != null) {
         for(var4 = 0; var4 < this.field2020.length; ++var4) {
            var5.method4844(this.field2020[var4], this.field2028[var4]);
         }
      }

      if (this.field2029 != null) {
         for(var4 = 0; var4 < this.field2029.length; ++var4) {
            var5.method4849(this.field2029[var4], this.field2030[var4]);
         }
      }

      return var5;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpx;Lpx;Lpx;Ljava/util/ArrayList;I)Z",
      garbageValue = "-2119047130"
   )
   public static boolean method4239(class412 var0, class412 var1, class412 var2, ArrayList var3) {
      class339.field3891 = var0;
      class150.field1765 = var1;
      class528.field5550 = var2;
      class339.field3888 = var3;
      return true;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lti;I)V",
      garbageValue = "1017113374"
   )
   public static void method4250(class519 var0) {
      class374.method8144(var0);
      int var1 = var0.method10322();
      if (var1 > 1) {
         if (var0.field5504 == class574.field5820) {
            class452.method9046(var0.method10318(), 0, var1 - 1);
         } else if (var0.field5504 == class574.field5816) {
            class464.method9403(var0.method10320(), 0, var1 - 1);
         } else {
            class153.method3834(var0.method10321(), 0, var1 - 1);
         }

      }
   }
}
