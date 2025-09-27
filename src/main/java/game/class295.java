package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
public class class295 extends class307 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -945635161
   )
   final int field3400;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lls;"
   )
   final class302 field3398;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -301118169
   )
   final int field3399;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -2084315803
   )
   final int field3401;

   @ObfuscatedSignature(
      descriptor = "(Lna;Lna;ILls;)V"
   )
   class295(class356 var1, class356 var2, int var3, class302 var4) {
      super(var1, var2);
      this.field3400 = var3;
      this.field3398 = var4;
      class184 var5 = class198.method4395(this.vmethod6870());
      class605 var6 = var5.method4184(false);
      if (var6 != null) {
         this.field3399 = var6.field6019;
         this.field3401 = var6.field6020;
      } else {
         this.field3399 = 0;
         this.field3401 = 0;
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1313098329"
   )
   public int vmethod6870() {
      return this.field3400;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Lls;",
      garbageValue = "-1635642188"
   )
   class302 vmethod6866() {
      return this.field3398;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "96"
   )
   int vmethod6869() {
      return this.field3399;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1852373606"
   )
   int vmethod6868() {
      return this.field3401;
   }

   @ObfuscatedName("ik")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "916887222"
   )
   static void method6747() {
      client.field348 = client.field491;
      class4.field7 = class384.field4404;
      client.field347 = -1;
   }
}
