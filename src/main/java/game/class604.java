package game;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("xc")
public final class class604 extends class601 {
   @ObfuscatedName("af")
   public byte[] field6012;
   @ObfuscatedName("aw")
   public int[] field6006;
   @ObfuscatedName("at")
   public int field6007;
   @ObfuscatedName("ac")
   public int field6010;
   @ObfuscatedName("ap")
   public int field6009;
   @ObfuscatedName("aq")
   public int field6011;
   @ObfuscatedName("ao")
   public int field6005;
   @ObfuscatedName("as")
   public int field6008;

   @ObfuscatedName("at")
   public void method11665() {
      if (this.field6007 != this.field6005 || this.field6010 != this.field6008) {
         byte[] var1 = new byte[this.field6005 * this.field6008];
         int var2 = 0;

         for(int var3 = 0; var3 < this.field6010; ++var3) {
            for(int var4 = 0; var4 < this.field6007; ++var4) {
               var1[var4 + (var3 + this.field6011) * this.field6005 + this.field6009] = this.field6012[var2++];
            }
         }

         this.field6012 = var1;
         this.field6007 = this.field6005;
         this.field6010 = this.field6008;
         this.field6009 = 0;
         this.field6011 = 0;
      }
   }

   @ObfuscatedName("ac")
   public void method11670(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field6006.length; ++var4) {
         int var5 = this.field6006[var4] >> 16 & 255;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.field6006[var4] >> 8 & 255;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.field6006[var4] & 255;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.field6006[var4] = var7 + (var6 << 8) + (var5 << 16);
      }

   }

   @ObfuscatedName("ap")
   public void method11667(int var1, int var2) {
      var1 += this.field6009;
      var2 += this.field6011;
      int var3 = var1 + var2 * class601.field5989;
      int var4 = 0;
      int var5 = this.field6010;
      int var6 = this.field6007;
      int var7 = class601.field5989 - var6;
      int var8 = 0;
      int var9;
      if (var2 < class601.field5992) {
         var9 = class601.field5992 - var2;
         var5 -= var9;
         var2 = class601.field5992;
         var4 += var9 * var6;
         var3 += var9 * class601.field5989;
      }

      if (var5 + var2 > class601.field5993) {
         var5 -= var5 + var2 - class601.field5993;
      }

      if (var1 < class601.field5994) {
         var9 = class601.field5994 - var1;
         var6 -= var9;
         var1 = class601.field5994;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 + var1 > class601.field5995) {
         var9 = var6 + var1 - class601.field5995;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         method11663(class601.field5988, this.field6012, this.field6006, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfuscatedName("aq")
   public void method11678(int var1, int var2, int var3, int var4) {
      int var5 = this.field6007;
      int var6 = this.field6010;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.field6005;
      int var10 = this.field6008;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.field6009 > 0) {
         var13 = (var11 + (this.field6009 << 16) - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.field6009 << 16);
      }

      if (this.field6011 > 0) {
         var13 = (var12 + (this.field6011 << 16) - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.field6011 << 16);
      }

      if (var5 < var9) {
         var3 = (var11 + ((var5 << 16) - var7) - 1) / var11;
      }

      if (var6 < var10) {
         var4 = (var12 + ((var6 << 16) - var8) - 1) / var12;
      }

      var13 = var1 + var2 * class601.field5989;
      int var14 = class601.field5989 - var3;
      if (var2 + var4 > class601.field5993) {
         var4 -= var2 + var4 - class601.field5993;
      }

      int var15;
      if (var2 < class601.field5992) {
         var15 = class601.field5992 - var2;
         var4 -= var15;
         var13 += var15 * class601.field5989;
         var8 += var12 * var15;
      }

      if (var3 + var1 > class601.field5995) {
         var15 = var3 + var1 - class601.field5995;
         var3 -= var15;
         var14 += var15;
      }

      if (var1 < class601.field5994) {
         var15 = class601.field5994 - var1;
         var3 -= var15;
         var13 += var15;
         var7 += var11 * var15;
         var14 += var15;
      }

      method11662(class601.field5988, this.field6012, this.field6006, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   @ObfuscatedName("af")
   static void method11663(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("aw")
   static void method11662(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = var11 * (var4 >> 16);

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 255];
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }
}
