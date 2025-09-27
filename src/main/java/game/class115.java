package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class115 {
   @ObfuscatedName("ks")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field1514;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1543146597
   )
   int field1513 = 0;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 396490617
   )
   int field1519 = 0;
   @ObfuscatedName("at")
   byte[] field1515 = null;

   class115() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "127593742"
   )
   int method3467(int var1) {
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var1 >= 8 - this.field1519; var1 -= var4) {
         var4 = 8 - this.field1519;
         int var5 = (1 << var4) - 1;
         var2 += (this.field1515[this.field1513] >> this.field1519 & var5) << var3;
         this.field1519 = 0;
         ++this.field1513;
         var3 += var4;
      }

      if (var1 > 0) {
         var4 = (1 << var1) - 1;
         var2 += (this.field1515[this.field1513] >> this.field1519 & var4) << var3;
         this.field1519 += var1;
      }

      return var2;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1158358734"
   )
   int method3465() {
      int var1 = this.field1515[this.field1513] >> this.field1519 & 1;
      ++this.field1519;
      this.field1513 += this.field1519 >> 3;
      this.field1519 &= 7;
      return var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([BII)V",
      garbageValue = "-1141874831"
   )
   void method3462(byte[] var1, int var2) {
      this.field1515 = var1;
      this.field1513 = var2;
      this.field1519 = 0;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-2023138579"
   )
   static void method3470(int var0, int var1, int var2, int var3) {
      class62 var4 = (class62)class62.field867.method8623((long)var0);
      if (var4 == null) {
         var4 = new class62();
         class62.field867.method8625(var4, (long)var0);
      }

      if (var4.field868.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.field868.length; ++var7) {
            var5[var7] = var4.field868[var7];
            var6[var7] = var4.field869[var7];
         }

         for(var7 = var4.field868.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.field868 = var5;
         var4.field869 = var6;
      }

      var4.field868[var1] = var2;
      var4.field869[var1] = var3;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "833434344"
   )
   static int method3460(int var0, class55 var1, boolean var2) {
      if (var0 == 5630) {
         client.field579 = 250;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("ld")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "122"
   )
   static void method3468(int var0, int var1) {
      class329 var2 = class130.method3593(class327.field3625, client.field314.field1308);
      var2.field3664.method11238(var1);
      var2.field3664.putIntLittleEndian(var0);
      client.field314.prepData(var2);
   }
}
