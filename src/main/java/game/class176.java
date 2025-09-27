package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class176 {
   @ObfuscatedName("kg")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field1956;
   @ObfuscatedName("ap")
   public short[] field1947;
   @ObfuscatedName("aq")
   public short[] field1949;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1392712751
   )
   int field1950 = -1;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1518534525
   )
   int field1951 = -1;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -179895527
   )
   int field1944 = -1;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1212660207
   )
   int field1952 = -1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 914769109
   )
   public int field1953;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public class241 field1955;

   public class176(int var1) {
      class213 var2 = class84.method2800(var1);
      if (var2.method4672()) {
         this.field1947 = new short[var2.field2388.length];
         System.arraycopy(var2.field2388, 0, this.field1947, 0, this.field1947.length);
      }

      if (var2.method4673()) {
         this.field1949 = new short[var2.field2373.length];
         System.arraycopy(var2.field2373, 0, this.field1949, 0, this.field1949.length);
      }

      this.field1953 = var2.field2384;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "4"
   )
   public boolean method4121() {
      return this.field1947 != null;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-91"
   )
   public boolean method4122() {
      return this.field1949 != null;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1499502467"
   )
   boolean method4123(int var1) {
      return var1 == 0 && this.field1950 != -1 || var1 == 1 && this.field1951 != -1;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1899550101"
   )
   boolean method4139(int var1) {
      return var1 == 0 && this.field1944 != -1 || var1 == 1 && this.field1952 != -1;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "0"
   )
   int method4141(int var1) {
      return var1 == 0 ? this.field1950 : this.field1951;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "74780957"
   )
   int method4142(int var1) {
      return var1 == 0 ? this.field1944 : this.field1952;
   }

   @ObfuscatedName("pz")
   @ObfuscatedSignature(
      descriptor = "([BIB)V",
      garbageValue = "-43"
   )
   static void method4126(byte[] var0, int var1) {
      if (client.field472 == null) {
         client.field472 = new byte[24];
      }

      class480.method9677(var0, var1, client.field472, 0, 24);
   }
}
