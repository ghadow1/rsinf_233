package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public abstract class class238 {
   class238() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Liz;IIIIJ)V"
   )
   abstract void vmethod5415(class233 var1, int var2, int var3, int var4, int var5, long var6);

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lit;Ljt;IIIB)V",
      garbageValue = "1"
   )
   abstract void vmethod5408(class230 var1, class245 var2, int var3, int var4, int var5);

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lit;Ljp;III)V",
      garbageValue = "-535692172"
   )
   abstract void vmethod5410(class230 var1, class239 var2, int var3, int var4);

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Lit;Ljt;IIFFFFFFFFFFFFB)V",
      garbageValue = "-34"
   )
   void method5411(class230 var1, class245 var2, int var3, int var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16) {
      float var17 = (float)class225.method4933() + var5 * (float)class225.method4938() / var13;
      float var18 = (float)class225.method4946() + var9 * (float)class225.method4938() / var13;
      float var19 = (float)class225.method4933() + var6 * (float)class225.method4938() / var14;
      float var20 = (float)class225.method4946() + var10 * (float)class225.method4938() / var14;
      float var21 = (float)class225.method4933() + var7 * (float)class225.method4938() / var15;
      float var22 = (float)class225.method4946() + var11 * (float)class225.method4938() / var15;
      float var23 = (float)class225.method4933() + var8 * (float)class225.method4938() / var16;
      float var24 = (float)class225.method4946() + var12 * (float)class225.method4938() / var16;
      float var25 = class145.method3742(var13);
      float var26 = class145.method3742(var14);
      float var27 = class145.method3742(var15);
      float var28 = class145.method3742(var16);
      class225.field2632.field3004 = 0;
      int var29;
      int var30;
      if ((var20 - var24) * (var21 - var23) - (var22 - var24) * (var19 - var23) > 0.0F) {
         class225.field2632.field3002 = false;
         var29 = class225.method4939();
         if (var21 < 0.0F || var23 < 0.0F || var19 < 0.0F || var21 > (float)var29 || var23 > (float)var29 || var19 > (float)var29) {
            class225.field2632.field3002 = true;
         }

         if (class230.method5100(var1.field2741, var1.field2755, (int)var22, (int)var24, (int)var20, (int)var21, (int)var23, (int)var19)) {
            var1.field2749 = var3;
            var1.field2775 = var4;
            var1.field2719 = class340.method7167(var1.field2741, var1.field2755, (int)var21, (int)var23, (int)var19, (int)var22, (int)var24, (int)var20, var27, var28, var26);
         }

         if (var2.field2984 == -1) {
            if (var2.field2988 != 12345678) {
               class225.method4945(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.field2988, var2.field2987, var2.field2990);
            }
         } else if (!class230.field2697) {
            if (var2.field2989) {
               class225.method4950(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.field2988, var2.field2987, var2.field2990, (int)var5, (int)var6, (int)var8, (int)var9, (int)var10, (int)var12, (int)var13, (int)var14, (int)var16, var2.field2984);
            } else {
               class225.method4950(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.field2988, var2.field2987, var2.field2990, (int)var7, (int)var8, (int)var6, (int)var11, (int)var12, (int)var10, (int)var15, (int)var16, (int)var14, var2.field2984);
            }
         } else {
            var30 = class225.field2632.field3010.vmethod5779(var2.field2984);
            class225.method4945(var22, var24, var20, var21, var23, var19, var27, var28, var26, class230.method5099(var30, var2.field2988), class230.method5099(var30, var2.field2987), class230.method5099(var30, var2.field2990));
         }
      }

      if ((var24 - var20) * (var17 - var19) - (var23 - var19) * (var18 - var20) > 0.0F) {
         class225.field2632.field3002 = false;
         var29 = class225.method4939();
         if (var17 < 0.0F || var19 < 0.0F || var23 < 0.0F || var17 > (float)var29 || var19 > (float)var29 || var23 > (float)var29) {
            class225.field2632.field3002 = true;
         }

         if (class230.method5100(var1.field2741, var1.field2755, (int)var18, (int)var20, (int)var24, (int)var17, (int)var19, (int)var23)) {
            var1.field2749 = var3;
            var1.field2775 = var4;
            var1.field2719 = class340.method7167(var1.field2741, var1.field2755, (int)var17, (int)var19, (int)var23, (int)var18, (int)var20, (int)var24, var25, var26, var28);
         }

         if (var2.field2984 == -1) {
            if (var2.field2986 != 12345678) {
               class225.method4945(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.field2986, var2.field2990, var2.field2987);
            }
         } else if (!class230.field2697) {
            class225.method4950(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.field2986, var2.field2990, var2.field2987, (int)var5, (int)var6, (int)var8, (int)var9, (int)var10, (int)var12, (int)var13, (int)var14, (int)var16, var2.field2984);
         } else {
            var30 = class225.field2632.field3010.vmethod5779(var2.field2984);
            class225.method4945(var18, var20, var24, var17, var19, var23, var25, var26, var28, class230.method5099(var30, var2.field2986), class230.method5099(var30, var2.field2990), class230.method5099(var30, var2.field2987));
         }
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Lit;Ljp;III)V",
      garbageValue = "925742102"
   )
   void method5409(class230 var1, class239 var2, int var3, int var4) {
      class225.field2632.field3004 = 0;
      int var5 = var2.field2864.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var2.field2864[var6];
         int var8 = var2.field2865[var6];
         int var9 = var2.field2852[var6];
         float var10 = class239.field2850[var7];
         float var11 = class239.field2850[var8];
         float var12 = class239.field2850[var9];
         float var13 = class239.field2857[var7];
         float var14 = class239.field2857[var8];
         float var15 = class239.field2857[var9];
         float var16 = class239.field2866[var7];
         float var17 = class239.field2866[var8];
         float var18 = class239.field2866[var9];
         if ((var10 - var11) * (var15 - var14) - (var13 - var14) * (var12 - var11) > 0.0F) {
            class225.field2632.field3002 = false;
            int var19 = class225.method4939();
            if (var10 < 0.0F || var11 < 0.0F || var12 < 0.0F || var10 > (float)var19 || var11 > (float)var19 || var12 > (float)var19) {
               class225.field2632.field3002 = true;
            }

            if (class230.method5100(var1.field2741, var1.field2755, (int)var13, (int)var14, (int)var15, (int)var10, (int)var11, (int)var12)) {
               var1.field2749 = var3;
               var1.field2775 = var4;
               var1.field2719 = class340.method7167(var1.field2741, var1.field2755, (int)var10, (int)var11, (int)var12, (int)var13, (int)var14, (int)var15, var16, var17, var18);
            }

            if (var2.field2867 != null && var2.field2867[var6] != -1) {
               if (!class230.field2697) {
                  if (var2.field2859) {
                     class225.method4950(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.field2861[var6], var2.field2862[var6], var2.field2853[var6], class239.field2855[0], class239.field2855[1], class239.field2855[3], class239.field2856[0], class239.field2856[1], class239.field2856[3], class239.field2854[0], class239.field2854[1], class239.field2854[3], var2.field2867[var6]);
                  } else {
                     class225.method4950(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.field2861[var6], var2.field2862[var6], var2.field2853[var6], class239.field2855[var7], class239.field2855[var8], class239.field2855[var9], class239.field2856[var7], class239.field2856[var8], class239.field2856[var9], class239.field2854[var7], class239.field2854[var8], class239.field2854[var9], var2.field2867[var6]);
                  }
               } else {
                  int var20 = class225.field2632.field3010.vmethod5779(var2.field2867[var6]);
                  class225.method4945(var13, var14, var15, var10, var11, var12, var16, var17, var18, class230.method5099(var20, var2.field2861[var6]), class230.method5099(var20, var2.field2862[var6]), class230.method5099(var20, var2.field2853[var6]));
               }
            } else if (var2.field2861[var6] != 12345678) {
               class225.method4945(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.field2861[var6], var2.field2862[var6], var2.field2853[var6]);
            }
         }
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "9"
   )
   static void method5424(int var0) {
      class454.field5189 = var0;
      class454.field5185 = new class454[var0];
      class172.field1931 = 0;
   }
}
