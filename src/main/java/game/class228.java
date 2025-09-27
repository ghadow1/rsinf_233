package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public abstract class class228 extends class601 {
   @ObfuscatedName("ao")
   static int field2665 = 0;
   @ObfuscatedName("as")
   boolean field2659 = false;
   @ObfuscatedName("al")
   int[] field2667;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Ljd;"
   )
   class247 field2668;

   @ObfuscatedSignature(
      descriptor = "(Ljd;)V"
   )
   class228(class247 var1) {
      this.field2667 = class225.field2639;
      this.field2668 = var1;
   }

   @ObfuscatedName("aq")
   abstract boolean vmethod5713();

   @ObfuscatedName("ao")
   void method5054(int[] var1, int var2, int var3, float[] var4) {
      class601.method11548(var1, var2, var3, var4);
   }

   @ObfuscatedName("as")
   void method5059(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      byte var13 = this.field2668.field3001.field2983;
      if (var13 > 0) {
         byte var14 = this.field2668.field3001.field2982;
         byte var15 = this.field2668.field3001.field2981;
         byte var16 = this.field2668.field3001.field2980;
         var10 = method5090(var10, var14, var15, var16, var13);
         var11 = method5090(var11, var14, var15, var16, var13);
         var12 = method5090(var12, var14, var15, var16, var13);
      }

      this.vmethod5712(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   @ObfuscatedName("al")
   void method5055(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      byte var11 = this.field2668.field3001.field2983;
      if (var11 > 0) {
         int var12 = method5090(var10, this.field2668.field3001.field2982, this.field2668.field3001.field2981, this.field2668.field3001.field2980, this.field2668.field3001.field2983);
         var10 = this.field2667[var12];
      }

      this.vmethod5717(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   @ObfuscatedName("au")
   abstract void vmethod5712(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12);

   @ObfuscatedName("ai")
   abstract void vmethod5717(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10);

   @ObfuscatedName("aa")
   abstract void vmethod5726(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   @ObfuscatedName("am")
   abstract void vmethod5766(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   @ObfuscatedName("af")
   static int method5090(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & 255;
      if (var1 != -1) {
         var5 += var8 * (var1 - var5) >> 7;
      }

      if (var2 != -1) {
         var6 += var8 * (var2 - var6) >> 7;
      }

      if (var3 != -1) {
         var7 += var8 * (var3 - var7) >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & '\uffff';
   }

   @ObfuscatedName("aw")
   static final int method5087(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   @ObfuscatedName("at")
   static final int method5050() {
      return field2665;
   }

   @ObfuscatedName("ac")
   static void method5051(int var0) {
      field2665 = var0;
   }

   @ObfuscatedName("ap")
   static void method5052(int var0) {
      int var1 = var0 * 210;
      method5051(var1);
   }
}
