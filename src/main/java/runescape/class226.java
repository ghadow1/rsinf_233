package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iv")
public class class226 extends class238 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -68637557
   )
   int field2646;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -422254313
   )
   int field2642;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1935077757
   )
   int field2643;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1836711867
   )
   int field2645;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1805728625
   )
   int field2647;
   @ObfuscatedName("aq")
   float field2651;
   @ObfuscatedName("ao")
   float field2648;
   @ObfuscatedName("as")
   float field2649;
   @ObfuscatedName("al")
   float field2650;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 612208117
   )
   int field2644;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -228335611
   )
   int field2652;

   class226(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field2646 = var1;
      this.field2642 = var2;
      this.field2643 = var3;
      this.field2645 = var4;
      this.field2647 = var5;
      this.field2651 = class225.field2630[var4];
      this.field2648 = class225.field2638[var4];
      this.field2649 = class225.field2630[var5];
      this.field2650 = class225.field2638[var5];
      this.field2644 = var6;
      this.field2652 = var7;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Liz;IIIIJ)V"
   )
   void vmethod5415(class233 var1, int var2, int var3, int var4, int var5, long var6) {
      var1.vmethod5531(var2, this.field2645, this.field2647, var3, var4, var5, this.field2646, this.field2642, this.field2643, var6, this.field2644, this.field2652, false);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lit;Ljt;IIIB)V",
      garbageValue = "1"
   )
   void vmethod5408(class230 var1, class245 var2, int var3, int var4, int var5) {
      float var6;
      float var7 = var6 = (float)((var4 << 7) - this.field2646);
      float var8;
      float var9 = var8 = (float)((var5 << 7) - this.field2643);
      float var10;
      float var11 = var10 = var7 + 128.0F;
      float var12;
      float var13 = var12 = var9 + 128.0F;
      float var14 = (float)(var1.field2728[var3][var4][var5] - this.field2642);
      float var15 = (float)(var1.field2728[var3][var4 + 1][var5] - this.field2642);
      float var16 = (float)(var1.field2728[var3][var4 + 1][var5 + 1] - this.field2642);
      float var17 = (float)(var1.field2728[var3][var4][var5 + 1] - this.field2642);
      float var18 = var9 * this.field2649 + this.field2650 * var7;
      var9 = var9 * this.field2650 - this.field2649 * var7;
      var7 = var18;
      var18 = var14 * this.field2648 - var9 * this.field2651;
      var9 = var9 * this.field2648 + this.field2651 * var14;
      var14 = var18;
      if (!(var9 < 50.0F)) {
         var18 = var11 * this.field2650 + var8 * this.field2649;
         var8 = this.field2650 * var8 - this.field2649 * var11;
         var11 = var18;
         var18 = var15 * this.field2648 - var8 * this.field2651;
         var8 = this.field2648 * var8 + this.field2651 * var15;
         var15 = var18;
         if (!(var8 < 50.0F)) {
            var18 = var10 * this.field2650 + var13 * this.field2649;
            var13 = var13 * this.field2650 - var10 * this.field2649;
            var10 = var18;
            var18 = this.field2648 * var16 - var13 * this.field2651;
            var13 = var16 * this.field2651 + var13 * this.field2648;
            var16 = var18;
            if (!(var13 < 50.0F)) {
               var18 = var6 * this.field2650 + this.field2649 * var12;
               var12 = var12 * this.field2650 - this.field2649 * var6;
               var6 = var18;
               var18 = var17 * this.field2648 - var12 * this.field2651;
               var12 = this.field2651 * var17 + this.field2648 * var12;
               if (!(var12 < 50.0F)) {
                  this.method5411(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var18, var9, var8, var13, var12);
               }
            }
         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lit;Ljp;III)V",
      garbageValue = "-535692172"
   )
   void vmethod5410(class230 var1, class239 var2, int var3, int var4) {
      int var5 = var2.field2858.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         float var7 = (float)(var2.field2858[var6] - this.field2646);
         float var8 = (float)(var2.field2868[var6] - this.field2642);
         float var9 = (float)(var2.field2860[var6] - this.field2643);
         float var10 = var7 * this.field2650 + this.field2649 * var9;
         var9 = this.field2650 * var9 - var7 * this.field2649;
         var7 = var10;
         var10 = this.field2648 * var8 - var9 * this.field2651;
         var9 = var8 * this.field2651 + this.field2648 * var9;
         if (var9 < 50.0F) {
            return;
         }

         if (var2.field2867 != null) {
            class239.field2855[var6] = (int)var7;
            class239.field2856[var6] = (int)var10;
            class239.field2854[var6] = (int)var9;
         }

         class239.field2850[var6] = (float)class225.method4933() + var7 * (float)class225.method4938() / var9;
         class239.field2857[var6] = (float)class225.method4946() + var10 * (float)class225.method4938() / var9;
         class239.field2866[var6] = class145.method3742(var9);
      }

      this.method5409(var1, var2, var3, var4);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpx;I)I",
      garbageValue = "1398389523"
   )
   static int method5014(class412 var0) {
      int var1 = class52.field759.length + class52.field760.length;
      String[] var2 = class52.field761;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         String var4 = var2[var3];
         if (var0.method8361(var4) != -1) {
            ++var1;
         }
      }

      return var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpx;I)V",
      garbageValue = "-1923815146"
   )
   public static void method5022(class412 var0) {
      class202.field2216 = var0;
   }
}
