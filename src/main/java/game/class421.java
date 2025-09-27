package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
public class class421 {
   @ObfuscatedName("vy")
   @ObfuscatedGetter(
      intValue = 551145169
   )
   static int field5046;
   @ObfuscatedName("af")
   byte field5043;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -2108203757
   )
   public int field5039;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -137307291
   )
   public int field5040;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 764557899
   )
   public int field5041;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 746622905
   )
   public int field5042;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 674439313
   )
   public int field5038;

   public class421() {
   }

   @ObfuscatedSignature(
      descriptor = "(Lwb;Z)V",
      garbageValue = "0"
   )
   public class421(class590 var1, boolean var2) {
      this.field5043 = var1.method11197();
      this.field5039 = var1.method11198();
      this.field5040 = var1.method11202();
      this.field5041 = var1.method11202();
      this.field5042 = var1.method11202();
      this.field5038 = var1.method11202();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1569431757"
   )
   public int method8514() {
      return this.field5043 & 7;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "27867843"
   )
   void method8513(int var1) {
      this.field5043 &= -8;
      this.field5043 = (byte)(this.field5043 | var1 & 7);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "4"
   )
   public int method8516() {
      return (this.field5043 & 8) == 8 ? 1 : 0;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1985911132"
   )
   void method8525(int var1) {
      this.field5043 &= -9;
      if (var1 == 1) {
         this.field5043 = (byte)(this.field5043 | 8);
      }

   }
}
