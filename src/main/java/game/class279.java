package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
public class class279 {
   @ObfuscatedName("au")
   static int[] field3277;
   @ObfuscatedName("ii")
   static short[] field3275;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 315892635
   )
   int field3274 = 0;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1103380165
   )
   int field3272 = 0;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -161970543
   )
   int field3276 = 0;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -397258981
   )
   int field3273 = 0;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2136285697"
   )
   public int method6276() {
      return this.field3272;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1567439517"
   )
   public int method6302() {
      return this.field3273;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1928100821"
   )
   public int method6278() {
      return this.field3276;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "2"
   )
   public int method6279() {
      return this.field3272 >> 7;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   public int method6283() {
      return this.field3276 >> 7;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-200874373"
   )
   public int method6289() {
      return this.field3274;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2061775482"
   )
   public void method6286(int var1) {
      this.field3274 = var1 & 2047;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Lky;S)V",
      garbageValue = "8585"
   )
   public void method6282(class279 var1) {
      this.field3274 = var1.field3274;
      this.field3272 = var1.field3272;
      this.field3273 = var1.field3273;
      this.field3276 = var1.field3276;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-479093105"
   )
   public void method6275(int var1, int var2) {
      this.field3272 = var1;
      this.field3276 = var2;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-98"
   )
   public void method6294(int var1) {
      this.field3273 = var1;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(IIS)V",
      garbageValue = "11641"
   )
   public void method6285(int var1, int var2) {
      this.field3272 += var1;
      this.field3276 += var2;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-2111902836"
   )
   public void method6301(int var1, int var2, int var3, int var4) {
      this.field3272 += var1;
      this.field3273 += var2;
      this.field3276 += var3;
      this.method6286(var4 + this.field3274);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Lky;B)Z",
      garbageValue = "-116"
   )
   boolean method6287(class279 var1) {
      return this.field3272 == var1.field3272 && this.field3273 == var1.field3273 && this.field3276 == var1.field3276 && this.field3274 == var1.field3274;
   }

   public boolean equals(Object var1) {
      return var1 instanceof class279 ? this.method6287((class279)var1) : false;
   }

   public String toString() {
      return this.field3272 + ", " + this.field3273 + ", " + this.field3276 + ", " + this.field3274;
   }

   @ObfuscatedName("ng")
   @ObfuscatedSignature(
      descriptor = "(Lcu;ZI)V",
      garbageValue = "-788686614"
   )
   static final void method6318(class64 var0, boolean var1) {
      int var2 = var0.field888;
      int var3 = (int)var0.field5600;
      var0.vmethod10557();
      if (var1) {
         class119.field1554.method7479(var2);
      }

      class253.method5797(var2);
      class369 var4 = class119.field1554.method7476(var3);
      if (var4 != null) {
         class89.method2877(var4);
      }

      if (client.field421 != -1) {
         class142.method3730(client.field421, 1);
      }

   }
}
