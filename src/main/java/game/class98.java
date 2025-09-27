package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
public class class98 {
   @ObfuscatedName("af")
   int field1366;
   @ObfuscatedName("aw")
   int field1365;
   @ObfuscatedName("at")
   int field1360;
   @ObfuscatedName("ac")
   int field1367 = 2;
   @ObfuscatedName("ap")
   int[] field1362 = new int[2];
   @ObfuscatedName("aq")
   int[] field1359 = new int[2];
   @ObfuscatedName("ao")
   int field1364;
   @ObfuscatedName("as")
   int field1361;
   @ObfuscatedName("al")
   int field1363;
   @ObfuscatedName("au")
   int field1358;
   @ObfuscatedName("ai")
   int field1368;

   class98() {
      this.field1362[0] = 0;
      this.field1362[1] = 65535;
      this.field1359[0] = 0;
      this.field1359[1] = 65535;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;)V"
   )
   final void method3101(class590 var1) {
      this.field1360 = var1.method11196();
      this.field1366 = var1.method11202();
      this.field1365 = var1.method11202();
      this.method3102(var1);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lwb;)V"
   )
   final void method3102(class590 var1) {
      this.field1367 = var1.method11196();
      this.field1362 = new int[this.field1367];
      this.field1359 = new int[this.field1367];

      for(int var2 = 0; var2 < this.field1367; ++var2) {
         this.field1362[var2] = var1.method11198();
         this.field1359[var2] = var1.method11198();
      }

   }

   @ObfuscatedName("at")
   final void method3103() {
      this.field1364 = 0;
      this.field1361 = 0;
      this.field1363 = 0;
      this.field1358 = 0;
      this.field1368 = 0;
   }

   @ObfuscatedName("ac")
   final int method3104(int var1) {
      if (this.field1368 >= this.field1364) {
         this.field1358 = this.field1359[this.field1361++] << 15;
         if (this.field1361 >= this.field1367) {
            this.field1361 = this.field1367 - 1;
         }

         this.field1364 = (int)((double)this.field1362[this.field1361] / 65536.0D * (double)var1);
         if (this.field1364 > this.field1368) {
            this.field1363 = ((this.field1359[this.field1361] << 15) - this.field1358) / (this.field1364 - this.field1368);
         }
      }

      this.field1358 += this.field1363;
      ++this.field1368;
      return this.field1358 - this.field1363 >> 15;
   }
}
