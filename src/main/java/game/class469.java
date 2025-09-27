package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
public class class469 {
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1441367935
   )
   int field5278 = -1;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lij;"
   )
   class215 field5277 = null;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -633146343
   )
   int field5279;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -871398721
   )
   int field5281 = -1;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 156740599
   )
   int field5282 = 0;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 162051097
   )
   int field5283 = 0;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsp;S)V",
      garbageValue = "31263"
   )
   public void method9564(class469 var1) {
      this.field5277 = var1.field5277;
      this.field5278 = var1.field5278;
      this.field5279 = var1.field5279;
      this.field5281 = var1.field5281;
      this.field5282 = var1.field5282;
      this.field5283 = var1.field5283;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1978885966"
   )
   public void method9612() {
      this.method9573(-1);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1341537387"
   )
   public void method9573(int var1) {
      if (var1 >= 0) {
         if (this.field5278 != var1) {
            this.field5278 = var1;
            this.field5277 = class177.method4155(var1);
            this.field5283 = 0;
            if (this.field5281 == -1) {
               this.field5281 = 0;
            }
         }
      } else {
         this.field5278 = -1;
         this.field5277 = null;
         this.field5281 = -1;
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1533193335"
   )
   public boolean method9566() {
      return this.field5277 != null;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)Lij;",
      garbageValue = "-1813894053"
   )
   public class215 method9581() {
      return this.field5277;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1795699949"
   )
   public int method9596() {
      return this.field5278;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   public int method9565() {
      return this.field5281;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2079636691"
   )
   public int method9627() {
      return this.field5279;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-26"
   )
   int method9620() {
      return this.field5282;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2036563251"
   )
   public void method9572() {
      this.field5281 = 0;
      this.field5279 = 0;
      this.field5282 = 0;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "96"
   )
   public void method9589() {
      this.field5282 = 0;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1064142164"
   )
   public int method9574() {
      return this.field5283;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-28"
   )
   void method9575(int var1) {
      this.field5283 = var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IS)Z",
      garbageValue = "227"
   )
   public boolean method9567(int var1) {
      return this.method9566() && this.field5283 > 0 && this.field5283 < var1;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "-1796"
   )
   public boolean method9577() {
      return this.field5277 == null || this.field5277.method4791();
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-996881736"
   )
   void method9624(int var1, int var2, int var3) {
      this.field5281 = var1;
      this.field5279 = var2;
      this.field5282 = var3;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-4"
   )
   void method9579(int var1, int var2) {
      this.field5281 = var1;
      this.field5282 = var2;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-467112557"
   )
   public void method9580() {
      if (this.field5277 != null) {
         if (!this.field5277.method4768()) {
            this.field5281 = (int)(Math.random() * (double)this.field5277.field2474.length);
            this.field5279 = (int)(Math.random() * (double)this.field5277.field2460[this.field5281]);
         } else {
            this.field5281 = (int)(Math.random() * (double)this.field5277.method4769());
         }
      }

   }
}
