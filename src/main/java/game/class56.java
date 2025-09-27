package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
public class class56 extends class233 {
   @ObfuscatedName("hf")
   @ObfuscatedSignature(
      descriptor = "Lvo;"
   )
   static class568 field817;
   @ObfuscatedName("wx")
   @ObfuscatedSignature(
      descriptor = "Lvi;"
   )
   static class554 field816;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Ldr;"
   )
   final class79 field814;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1564169963
   )
   final int field806;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 2042063485
   )
   final int field807;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 2073905721
   )
   final int field808;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 676697373
   )
   final int field809;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1909063007
   )
   final int field810;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -2014238423
   )
   final int field811;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lsp;"
   )
   final class469 field818;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lsp;"
   )
   final class469 field813;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1824128041
   )
   int field812;

   @ObfuscatedSignature(
      descriptor = "(Ldr;IIIIIIIZLiz;)V"
   )
   class56(class79 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, class233 var10) {
      this.field814 = var1;
      this.field806 = var2;
      this.field807 = var3;
      this.field808 = var4;
      this.field809 = var5;
      this.field810 = var6;
      this.field811 = var7;
      this.field818 = new class469();
      this.field813 = new class469();
      if (var8 != -1) {
         this.field818.method9573(var8);
         this.field813.method9573(var8);
         class215 var11 = this.field818.method9581();
         this.field812 = client.field412 - 1;
         if (var9 && var11.field2493 != -1) {
            this.field818.method9580();
         }

         if (var10 instanceof class56) {
            class56 var12 = (class56)var10;
            if (var12.field818.method9596() == var8) {
               if (var11.field2489 == 0) {
                  this.field818.method9564(var12.field818);
                  this.field812 = var12.field812;
               }

               this.field813.method9564(var12.field813);
            } else if (!var12.field818.method9577()) {
               this.field813.method9564(var12.field813);
            } else {
               this.field813.method9564(var12.field818);
            }
         }
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Ljn;",
      garbageValue = "-1879635116"
   )
   protected final class241 vmethod5365() {
      class212 var1 = class433.method8669(this.field806);
      if (var1.field2355 != null) {
         var1 = var1.method4611();
      }

      if (var1 == null) {
         return null;
      } else {
         int var2;
         int var3;
         if (this.field808 != 1 && this.field808 != 3) {
            var2 = var1.field2329;
            var3 = var1.field2330;
         } else {
            var2 = var1.field2330;
            var3 = var1.field2329;
         }

         int var4 = (var2 >> 1) + this.field810;
         int var5 = (var2 + 1 >> 1) + this.field810;
         int var6 = (var3 >> 1) + this.field811;
         int var7 = (var3 + 1 >> 1) + this.field811;
         int[][] var8 = this.field814.field1173[this.field809];
         int var9 = var8[var5][var7] + var8[var5][var6] + var8[var4][var6] + var8[var4][var7] >> 2;
         int var10 = (this.field810 << 7) + (var2 << 6);
         int var11 = (this.field811 << 7) + (var3 << 6);
         int var12 = client.field412 - this.field812;
         this.field812 = client.field412;
         client.field399.method10862(this.field814, var10, var11, false);
         int var13 = class145.method3747(this.field818, var12, client.field399);
         client.field399.method10859();
         if ((var13 & 1) != 0 && (var13 & 8) != 0) {
            this.field818.method9612();
         }

         if (this.field818.method9567(30)) {
            if (this.field813.method9566()) {
               int var14 = class145.method3747(this.field813, var12, (class468)null);
               if ((var14 & 1) != 0 && (var14 & 8) != 0) {
                  this.field813.method9612();
               }

               if (!this.field813.method9567(30)) {
                  return var1.method4609(this.field807, this.field808, var8, var10, var9, var11, this.field813.method9581(), this.field813.method9565());
               }
            }

            return null;
         } else {
            return var1.method4609(this.field807, this.field808, var8, var10, var9, var11, this.field818.method9581(), this.field818.method9565());
         }
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ldo;I)I",
      garbageValue = "-610071463"
   )
   static int method2007(class103 var0) {
      return var0 != null ? var0.method3175() : 0;
   }

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      descriptor = "(Ldr;III)Lre;",
      garbageValue = "1180540034"
   )
   static class452 method2010(class79 var0, int var1, int var2) {
      if (var0 != null && class333.field3836 != var0) {
         class505 var3 = (class505)class333.field3836.field1171.method8596((long)var0.field1172);
         return var3 == null ? class296.method6761((float)var1, 0.0F, (float)var2) : var3.method10084(var1, var2);
      } else {
         return class296.method6761((float)var1, 0.0F, (float)var2);
      }
   }
}
