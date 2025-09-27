package game;

import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class116 {
   @ObfuscatedName("aw")
   static int[] field1522;
   @ObfuscatedName("at")
   static int[] field1523 = new int['耀'];
   @ObfuscatedName("ac")
   static int[] field1524;
   @ObfuscatedName("ap")
   static int[] field1525 = new int[5];
   @ObfuscatedName("aq")
   static int[] field1537 = new int[5];
   @ObfuscatedName("ao")
   static int[] field1527 = new int[5];
   @ObfuscatedName("as")
   static int[] field1528 = new int[5];
   @ObfuscatedName("al")
   static int[] field1529 = new int[5];
   @ObfuscatedName("au")
   int field1540 = 500;
   @ObfuscatedName("ai")
   int field1531 = 0;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Ldf;"
   )
   class98 field1532;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Ldf;"
   )
   class98 field1533;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Ldf;"
   )
   class98 field1534;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Ldf;"
   )
   class98 field1521;
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Ldf;"
   )
   class98 field1536;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Ldf;"
   )
   class98 field1541;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Ldf;"
   )
   class98 field1535;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Ldf;"
   )
   class98 field1539;
   @ObfuscatedName("av")
   int[] field1543 = new int[]{0, 0, 0, 0, 0};
   @ObfuscatedName("ah")
   int[] field1530 = new int[]{0, 0, 0, 0, 0};
   @ObfuscatedName("ab")
   int[] field1542 = new int[]{0, 0, 0, 0, 0};
   @ObfuscatedName("ax")
   int field1544 = 0;
   @ObfuscatedName("ak")
   int field1538 = 100;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lek;"
   )
   class113 field1526;
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Ldf;"
   )
   class98 field1546;

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         field1523[var1] = (var0.nextInt() & 2) - 1;
      }

      field1524 = new int['耀'];

      for(var1 = 0; var1 < 32768; ++var1) {
         field1524[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
      }

      field1522 = new int[220500];
   }

   class116() {
   }

   @ObfuscatedName("af")
   final int[] method3472(int var1, int var2, int var3) {
      class480.method9686(field1522, 0, var1);
      if (var2 < 10) {
         return field1522;
      } else {
         double var4 = (double)var1 / ((double)var2 + 0.0D);
         this.field1532.method3103();
         this.field1533.method3103();
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         if (this.field1534 != null) {
            this.field1534.method3103();
            this.field1521.method3103();
            var6 = (int)((double)(this.field1534.field1365 - this.field1534.field1366) * 32.768D / var4);
            var7 = (int)((double)this.field1534.field1366 * 32.768D / var4);
         }

         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         if (this.field1536 != null) {
            this.field1536.method3103();
            this.field1541.method3103();
            var9 = (int)((double)(this.field1536.field1365 - this.field1536.field1366) * 32.768D / var4);
            var10 = (int)((double)this.field1536.field1366 * 32.768D / var4);
         }

         int var12;
         for(var12 = 0; var12 < 5; ++var12) {
            if (this.field1543[var12] != 0) {
               field1525[var12] = 0;
               field1537[var12] = (int)((double)this.field1542[var12] * var4);
               field1527[var12] = (this.field1543[var12] << 14) / 100;
               field1528[var12] = (int)((double)(this.field1532.field1365 - this.field1532.field1366) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field1530[var12]) / var4);
               field1529[var12] = (int)((double)this.field1532.field1366 * 32.768D / var4);
            }
         }

         int var13;
         int var14;
         int var15;
         int var16;
         int[] var10000;
         for(var12 = 0; var12 < var1; ++var12) {
            var13 = this.field1532.method3104(var1);
            var14 = this.field1533.method3104(var1);
            if (this.field1534 != null) {
               var15 = this.field1534.method3104(var1);
               var16 = this.field1521.method3104(var1);
               var13 += this.method3471(var8, var16, this.field1534.field1360) >> 1;
               var8 = var8 + var7 + (var15 * var6 >> 16);
            }

            if (this.field1536 != null) {
               var15 = this.field1536.method3104(var1);
               var16 = this.field1541.method3104(var1);
               var14 = var14 * ((this.method3471(var11, var16, this.field1536.field1360) >> 1) + '耀') >> 15;
               var11 = var11 + var10 + (var15 * var9 >> 16);
            }

            for(var15 = 0; var15 < 5; ++var15) {
               if (this.field1543[var15] != 0) {
                  var16 = field1537[var15] + var12;
                  if (var16 < var1) {
                     var10000 = field1522;
                     var10000[var16] += this.method3471(field1525[var15], var14 * field1527[var15] >> 15, this.field1532.field1360);
                     var10000 = field1525;
                     var10000[var15] += (var13 * field1528[var15] >> 16) + field1529[var15];
                  }
               }
            }
         }

         int var17;
         if (this.field1535 != null) {
            this.field1535.method3103();
            this.field1539.method3103();
            var12 = 0;
            boolean var20 = false;
            boolean var21 = true;

            for(var15 = 0; var15 < var1; ++var15) {
               var16 = this.field1535.method3104(var1);
               var17 = this.field1539.method3104(var1);
               if (var21) {
                  var13 = (var16 * (this.field1535.field1365 - this.field1535.field1366) >> 8) + this.field1535.field1366;
               } else {
                  var13 = (var17 * (this.field1535.field1365 - this.field1535.field1366) >> 8) + this.field1535.field1366;
               }

               var12 += 256;
               if (var12 >= var13) {
                  var12 = 0;
                  var21 = !var21;
               }

               if (var21) {
                  field1522[var15] = 0;
               }
            }
         }

         if (this.field1544 > 0 && this.field1538 > 0) {
            var12 = (int)((double)this.field1544 * var4);

            for(var13 = var12; var13 < var1; ++var13) {
               var10000 = field1522;
               var10000[var13] += field1522[var13 - var12] * this.field1538 / 100;
            }
         }

         if (this.field1526.field1498[0] > 0 || this.field1526.field1498[1] > 0) {
            this.field1546.method3103();
            var12 = this.field1546.method3104(var1 + 1);
            var13 = this.field1526.method3431(0, (float)var12 / 65536.0F, var3);
            var14 = this.field1526.method3431(1, (float)var12 / 65536.0F, var3);
            if (var1 >= var13 + var14) {
               var15 = 0;
               var16 = var14;
               if (var14 > var1 - var13) {
                  var16 = var1 - var13;
               }

               int var18;
               while(var15 < var16) {
                  var17 = (int)((long)field1522[var15 + var13] * (long)class113.field1494 >> 16);

                  for(var18 = 0; var18 < var13; ++var18) {
                     var17 += (int)((long)field1522[var15 + var13 - 1 - var18] * (long)class113.field1495[0][var18] >> 16);
                  }

                  for(var18 = 0; var18 < var15; ++var18) {
                     var17 -= (int)((long)field1522[var15 - 1 - var18] * (long)class113.field1495[1][var18] >> 16);
                  }

                  field1522[var15] = var17;
                  var12 = this.field1546.method3104(var1 + 1);
                  ++var15;
               }

               boolean var22 = true;
               var16 = 128;

               while(true) {
                  if (var16 > var1 - var13) {
                     var16 = var1 - var13;
                  }

                  int var19;
                  while(var15 < var16) {
                     var18 = (int)((long)field1522[var15 + var13] * (long)class113.field1494 >> 16);

                     for(var19 = 0; var19 < var13; ++var19) {
                        var18 += (int)((long)field1522[var15 + var13 - 1 - var19] * (long)class113.field1495[0][var19] >> 16);
                     }

                     for(var19 = 0; var19 < var14; ++var19) {
                        var18 -= (int)((long)field1522[var15 - 1 - var19] * (long)class113.field1495[1][var19] >> 16);
                     }

                     field1522[var15] = var18;
                     var12 = this.field1546.method3104(var1 + 1);
                     ++var15;
                  }

                  if (var15 >= var1 - var13) {
                     while(var15 < var1) {
                        var18 = 0;

                        for(var19 = var15 + var13 - var1; var19 < var13; ++var19) {
                           var18 += (int)((long)field1522[var15 + var13 - 1 - var19] * (long)class113.field1495[0][var19] >> 16);
                        }

                        for(var19 = 0; var19 < var14; ++var19) {
                           var18 -= (int)((long)field1522[var15 - 1 - var19] * (long)class113.field1495[1][var19] >> 16);
                        }

                        field1522[var15] = var18;
                        this.field1546.method3104(var1 + 1);
                        ++var15;
                     }
                     break;
                  }

                  var13 = this.field1526.method3431(0, (float)var12 / 65536.0F, var3);
                  var14 = this.field1526.method3431(1, (float)var12 / 65536.0F, var3);
                  var16 += 128;
               }
            }
         }

         for(var12 = 0; var12 < var1; ++var12) {
            if (field1522[var12] < -32768) {
               field1522[var12] = -32768;
            }

            if (field1522[var12] > 32767) {
               field1522[var12] = 32767;
            }
         }

         return field1522;
      }
   }

   @ObfuscatedName("aw")
   final int method3471(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return field1524[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return (var2 * (var1 & 32767) >> 14) - var2;
      } else {
         return var3 == 4 ? var2 * field1523[var1 / 2607 & 32767] : 0;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lwb;)V"
   )
   final void method3474(class590 var1) {
      this.field1532 = new class98();
      this.field1532.method3101(var1);
      this.field1533 = new class98();
      this.field1533.method3101(var1);
      int var2 = var1.method11196();
      if (var2 != 0) {
         var1.buffer -= -290410379;
         this.field1534 = new class98();
         this.field1534.method3101(var1);
         this.field1521 = new class98();
         this.field1521.method3101(var1);
      }

      var2 = var1.method11196();
      if (var2 != 0) {
         var1.buffer -= -290410379;
         this.field1536 = new class98();
         this.field1536.method3101(var1);
         this.field1541 = new class98();
         this.field1541.method3101(var1);
      }

      var2 = var1.method11196();
      if (var2 != 0) {
         var1.buffer -= -290410379;
         this.field1535 = new class98();
         this.field1535.method3101(var1);
         this.field1539 = new class98();
         this.field1539.method3101(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method11212();
         if (var4 == 0) {
            break;
         }

         this.field1543[var3] = var4;
         this.field1530[var3] = var1.method11211();
         this.field1542[var3] = var1.method11212();
      }

      this.field1544 = var1.method11212();
      this.field1538 = var1.method11212();
      this.field1540 = var1.method11198();
      this.field1531 = var1.method11198();
      this.field1526 = new class113();
      this.field1546 = new class98();
      this.field1526.method3436(var1, this.field1546);
   }
}
