package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
public final class class53 extends class233 {
   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "Lxt;"
   )
   static class605 field772;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -807040135
   )
   int field778;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -610093909
   )
   int field783;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1875146207
   )
   int field767;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 131740357
   )
   int field784;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -576930567
   )
   int field770;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 171313335
   )
   int field771;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 333834097
   )
   int field766;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1805859167
   )
   int field769;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1602948505
   )
   int field774;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1319368797
   )
   int field775;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1933970145
   )
   int field789;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -623557093
   )
   int field777;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -334808731
   )
   int field790;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1115395845
   )
   int field779;
   @ObfuscatedName("ar")
   double field773;
   @ObfuscatedName("ae")
   double field781;
   @ObfuscatedName("ay")
   double field782;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 510141879
   )
   int field776;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1147751591
   )
   int field768;
   @ObfuscatedName("av")
   boolean field785 = false;
   @ObfuscatedName("ah")
   double field786;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1795799721
   )
   int field787;
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lsp;"
   )
   final class469 field788 = new class469();

   class53(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      this.field778 = var1;
      this.field783 = var2;
      this.field767 = var3;
      this.field784 = var4;
      this.field770 = var5;
      this.field771 = var6;
      this.field766 = var7;
      this.field769 = var8;
      this.field774 = var9;
      this.field775 = var10;
      this.field787 = var11;
      this.field789 = var12;
      this.field777 = var13;
      this.field790 = var14;
      this.field779 = var15;
      this.field788.method9573(class433.method8663(this.field787).field2198);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Ljn;",
      garbageValue = "-1879635116"
   )
   protected final class241 vmethod5365() {
      if (this.field788.method9567(30)) {
         return null;
      } else {
         class201 var1 = class433.method8663(this.field787);
         class241 var2 = var1.method4407(this.field788.method9565());
         if (var2 == null) {
            return null;
         } else {
            var2.method5473(this.field768);
            return var2;
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1344661650"
   )
   void method1972(int var1, int var2) {
      this.field783 += var1;
      this.field767 += var2;
      this.field766 += var1;
      this.field769 += var2;
      this.field773 += (double)class356.method7417(var1);
      this.field781 += (double)class356.method7417(var2);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lco;IIB)V",
      garbageValue = "20"
   )
   void method1962(class73 var1, int var2, int var3) {
      if (var2 >= this.field789) {
         class452 var4 = class365.method7565(this.field775, this.field766, this.field769, this.field771, var1);
         int var5 = (int)var4.field5175;
         int var6 = (int)var4.field5169;
         int var7 = (int)var4.field5176 - this.field774;
         var4.method8992();
         double var12;
         double var14;
         double var16;
         if (!this.field785) {
            class452 var8 = class365.method7565(this.field770, this.field783, this.field767, this.field778, var1);
            int var9 = (int)var8.field5175;
            int var10 = (int)var8.field5169;
            int var11 = (int)var8.field5176 - this.field784;
            var8.method8992();
            var12 = (double)(var5 - var9);
            var14 = (double)(var6 - var10);
            var16 = Math.sqrt(var14 * var14 + var12 * var12);
            this.field773 = Math.abs(var16) < 0.009999999776482582D ? (double)var9 : (double)this.field779 * var12 / var16 + (double)var9;
            this.field781 = Math.abs(var16) < 0.009999999776482582D ? (double)var10 : (double)var10 + var14 * (double)this.field779 / var16;
            this.field782 = (double)var11;
         }

         double var18 = (double)(this.field777 + 1 - var2);
         double var20 = ((double)var5 - this.field773) / var18;
         var12 = ((double)var6 - this.field781) / var18;
         var14 = Math.sqrt(var12 * var12 + var20 * var20);
         if (!this.field785) {
            this.field786 = -var14 * Math.tan((double)this.field790 * 0.02454369D);
         }

         var16 = 2.0D * ((double)var7 - this.field782 - var18 * this.field786) / (var18 * var18);
         this.field785 = true;
         this.field773 += var20 * (double)var3;
         this.field781 += var12 * (double)var3;
         this.field782 += (double)var3 * 0.5D * var16 * (double)var3 + this.field786 * (double)var3;
         this.field786 += (double)var3 * var16;
         this.field776 = (int)(Math.atan2(var20, var12) * 325.949D) + 1024 & 2047;
         this.field768 = (int)(Math.atan2(this.field786, var14) * 325.949D) & 2047;
         client.field399.method10862(class333.field3836, (int)this.field773, (int)this.field781, false);
         class145.method3747(this.field788, var3, client.field399);
         client.field399.method10859();
      }
   }
}
