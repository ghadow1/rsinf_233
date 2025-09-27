package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
public class class221 extends class544 {
   @ObfuscatedName("ap")
   static int[] field2580;
   @ObfuscatedName("aq")
   int field2581;
   @ObfuscatedName("ao")
   int field2578;
   @ObfuscatedName("as")
   boolean field2583;
   @ObfuscatedName("al")
   int field2584;
   @ObfuscatedName("au")
   int field2585;
   @ObfuscatedName("ai")
   int[] field2586;
   @ObfuscatedName("aa")
   boolean field2587 = false;

   @ObfuscatedSignature(
      descriptor = "(Lwb;)V"
   )
   class221(class590 var1) {
      if (class585.field5890 <= 232) {
         this.field2578 = var1.method11198();
         this.field2583 = var1.method11196() == 1;
         var1.method11196();
         this.field2581 = var1.method11198();
         var1.method11202();
         this.field2584 = var1.method11196();
         this.field2585 = var1.method11196();
      } else {
         this.field2581 = var1.method11198();
         this.field2578 = var1.method11198();
         this.field2583 = var1.method11196() == 1;
         this.field2584 = var1.method11196();
         this.field2585 = var1.method11196();
      }

      this.field2586 = null;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(DILpx;)Z"
   )
   boolean method4922(double var1, int var3, class412 var4) {
      if (var4.method8403(this.field2581) == null) {
         return false;
      } else {
         int var5 = var3 * var3;
         this.field2586 = new int[var5];
         int var7 = this.field2581;
         class604 var6;
         if (!class489.method9813(var4, var7)) {
            var6 = null;
         } else {
            var6 = class447.method8930();
         }

         var6.method11665();
         int[] var9 = var6.field6006;

         for(int var10 = 0; var10 < var9.length; ++var10) {
            var9[var10] = class225.method4992(var9[var10], var1);
         }

         byte[] var14 = var6.field6012;
         int var11;
         if (var3 == var6.field6007) {
            for(var11 = 0; var11 < var5; ++var11) {
               this.field2586[var11] = var9[var14[var11] & 255];
            }
         } else {
            int var12;
            int var13;
            if (var6.field6007 == 64 && var3 == 128) {
               var11 = 0;

               for(var12 = 0; var12 < var3; ++var12) {
                  for(var13 = 0; var13 < var3; ++var13) {
                     this.field2586[var11++] = var9[var14[(var12 >> 1 << 6) + (var13 >> 1)] & 255];
                  }
               }
            } else {
               if (var6.field6007 != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var11 = 0;

               for(var12 = 0; var12 < var3; ++var12) {
                  for(var13 = 0; var13 < var3; ++var13) {
                     this.field2586[var11++] = var9[var14[(var13 << 1) + (var12 << 1 << 7)] & 255];
                  }
               }
            }
         }

         return true;
      }
   }

   @ObfuscatedName("aw")
   void method4915() {
      this.field2586 = null;
   }

   @ObfuscatedName("at")
   void method4914(int var1) {
      if (this.field2586 != null && this.field2584 >= 1 && this.field2584 <= 4) {
         if (field2580 == null || field2580.length < this.field2586.length) {
            field2580 = new int[this.field2586.length];
         }

         short var2;
         if (this.field2586.length == 4096) {
            var2 = 64;
         } else {
            var2 = 128;
         }

         int var3 = this.field2586.length;
         int var4;
         int var5;
         int var6;
         int var7;
         if (this.field2584 == 1 || this.field2584 == 2) {
            var4 = var2 * this.field2585 * var1;
            var5 = var3 - 1;
            if (this.field2584 == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               field2580[var6] = this.field2586[var7];
            }
         }

         if (this.field2584 == 3 || this.field2584 == 4) {
            var4 = this.field2585 * var1;
            var5 = var2 - 1;
            if (this.field2584 == 3) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  field2580[var8] = this.field2586[var9];
               }
            }
         }

         int[] var10 = this.field2586;
         this.field2586 = field2580;
         field2580 = var10;
      }
   }
}
