package runescape;

import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rv")
public final class class461 extends class465 {
   public class461(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var7);
   }

   public class461(byte[] var1) {
      super(var1);
   }

   @ObfuscatedName("af")
   final void vmethod9440(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var3 * class601.field5989 + var2;
      int var8 = class601.field5989 - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var3 < class601.field5992) {
         var11 = class601.field5992 - var3;
         var5 -= var11;
         var3 = class601.field5992;
         var10 += var11 * var4;
         var7 += var11 * class601.field5989;
      }

      if (var3 + var5 > class601.field5993) {
         var5 -= var3 + var5 - class601.field5993;
      }

      if (var2 < class601.field5994) {
         var11 = class601.field5994 - var2;
         var4 -= var11;
         var2 = class601.field5994;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var2 + var4 > class601.field5995) {
         var11 = var2 + var4 - class601.field5995;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var4 > 0 && var5 > 0) {
         class465.method9410(class601.field5988, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   @ObfuscatedName("aw")
   final void vmethod9486(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var3 * class601.field5989 + var2;
      int var9 = class601.field5989 - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if (var3 < class601.field5992) {
         var12 = class601.field5992 - var3;
         var5 -= var12;
         var3 = class601.field5992;
         var11 += var12 * var4;
         var8 += var12 * class601.field5989;
      }

      if (var3 + var5 > class601.field5993) {
         var5 -= var3 + var5 - class601.field5993;
      }

      if (var2 < class601.field5994) {
         var12 = class601.field5994 - var2;
         var4 -= var12;
         var2 = class601.field5994;
         var11 += var12;
         var8 += var12;
         var10 += var12;
         var9 += var12;
      }

      if (var2 + var4 > class601.field5995) {
         var12 = var2 + var4 - class601.field5995;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if (var4 > 0 && var5 > 0) {
         class465.method9459(class601.field5988, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }
}
