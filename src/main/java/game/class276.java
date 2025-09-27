package game;

import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public class class276 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lkq;"
   )
   static final class276 field3248 = new class276(0, 8, 8);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lkq;"
   )
   static final class276 field3245 = new class276(5, 16, 16);
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lkq;"
   )
   static final class276 field3246 = new class276(6, 32, 32);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lkq;"
   )
   static final class276 field3247 = new class276(1, 48, 48);
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lkq;"
   )
   static final class276 field3252 = new class276(2, 64, 64);
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lkq;"
   )
   static final class276 field3249 = new class276(4, 96, 96);
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lkq;"
   )
   static final class276 field3250 = new class276(3, 128, 128);
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "[Lkq;"
   )
   static final class276[] field3244 = class44.method1532();
   @ObfuscatedName("ln")
   static String field3255;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -2022478941
   )
   final int field3251;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1906470739
   )
   final int field3253;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -318093425
   )
   final int field3254;

   static {
      Arrays.sort(field3244, new class283());
   }

   class276(int var1, int var2, int var3) {
      this.field3251 = var1;
      this.field3253 = var2;
      this.field3254 = var3;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2001007907"
   )
   int method6230() {
      return this.field3253 * this.field3254;
   }
}
