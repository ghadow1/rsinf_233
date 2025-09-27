package game;

import java.util.Calendar;
import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public final class class223 extends class544 {
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Ljt;"
   )
   class245 field2600;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   class239 field2601;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Liw;"
   )
   class218 field2608;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 422153801
   )
   int field2603;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "[Ljm;"
   )
   class253[] field2604 = new class253[5];
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 671492593
   )
   int field2605;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -2022624537
   )
   int field2613;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1465657841
   )
   int field2607;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1474143877
   )
   int field2624;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Ljf;"
   )
   class250 field2609;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Ljr;"
   )
   class252 field2610;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lir;"
   )
   class220 field2611;
   @ObfuscatedName("an")
   int[] field2612 = new int[5];
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1325311709
   )
   int field2615 = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1043101699
   )
   int field2614;
   @ObfuscatedName("ay")
   boolean field2599;
   @ObfuscatedName("ad")
   boolean field2602;
   @ObfuscatedName("ag")
   boolean field2617;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 196909571
   )
   int field2618;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -666850291
   )
   int field2619;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1202243977
   )
   int field2606;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -518683825
   )
   int field2616;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lii;"
   )
   class223 field2621;

   class223(int var1, int var2, int var3) {
      this.field2624 = this.field2605 = var1;
      this.field2613 = var2;
      this.field2607 = var3;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1952775347"
   )
   public static boolean method4924() {
      if (!class339.field3892.isEmpty()) {
         return true;
      } else {
         return !class339.field3890.isEmpty() && class339.field3890.get(0) != null && ((class351)class339.field3890.get(0)).field4012 != null ? ((class351)class339.field3890.get(0)).field4012.method7146() : false;
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Date;B)Z",
      garbageValue = "4"
   )
   static boolean method4925(Date var0) {
      Calendar var1 = Calendar.getInstance();
      var1.set(1, var1.get(1) - 13);
      var1.set(5, var1.get(5) + 1);
      var1.set(11, 0);
      var1.set(12, 0);
      var1.set(13, 0);
      var1.set(14, 0);
      Date var2 = var1.getTime();
      return var0.before(var2);
   }
}
