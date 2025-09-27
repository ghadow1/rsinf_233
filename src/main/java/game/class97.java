package game;

import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
public class class97 {
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 693833959
   )
   public static int field1356 = 44100;
   @ObfuscatedName("an")
   public static boolean field1339;
   @ObfuscatedName("ar")
   public static ScheduledExecutorService field1346;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1355482381
   )
   int field1336 = 32;
   @ObfuscatedName("av")
   public int[] field1340;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lef;"
   )
   class104 field1338;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      longValue = -2794022698036299117L
   )
   long field1344 = class189.method4284();
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 571666051
   )
   public int field1350;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -490672071
   )
   public int field1345;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -845807563
   )
   int field1342;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      longValue = 7196506120071067069L
   )
   long field1348 = 0L;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = -983132915
   )
   int field1349 = 0;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = -1896259297
   )
   int field1347 = 0;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -2049147503
   )
   int field1351 = 0;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      longValue = 5148925342675147023L
   )
   long field1352 = 0L;
   @ObfuscatedName("bd")
   boolean field1353 = true;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 1002055695
   )
   int field1354 = 0;
   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "[Lef;"
   )
   class104[] field1355 = new class104[8];
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "[Lef;"
   )
   class104[] field1343 = new class104[8];

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1247260340"
   )
   public void vmethod3066() throws Exception {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-1"
   )
   public void vmethod3056(int var1) throws Exception {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-6"
   )
   protected int vmethod3057() throws Exception {
      return this.field1350;
   }

   @ObfuscatedName("ac")
   protected void vmethod3058() throws Exception {
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1150401319"
   )
   protected void vmethod3059() {
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1549248030"
   )
   protected void vmethod3060() throws Exception {
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Lef;I)V",
      garbageValue = "-632427995"
   )
   public final synchronized void method3047(class104 var1) {
      this.field1338 = var1;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-26984"
   )
   public final synchronized void method3048() {
      if (this.field1340 != null) {
         long var1 = class189.method4284();

         try {
            if (this.field1348 != 0L) {
               if (var1 < this.field1348) {
                  return;
               }

               this.vmethod3056(this.field1350);
               this.field1348 = 0L;
               this.field1353 = true;
            }

            int var3 = this.vmethod3057();
            if (this.field1351 - var3 > this.field1349) {
               this.field1349 = this.field1351 - var3;
            }

            int var4 = this.field1342 + this.field1345;
            if (var4 + 512 > 32768) {
               var4 = 32256;
            }

            if (var4 + 512 > this.field1350) {
               this.field1350 += 1024;
               if (this.field1350 > 32768) {
                  this.field1350 = 32768;
               }

               this.vmethod3059();
               this.vmethod3056(this.field1350);
               var3 = 0;
               this.field1353 = true;
               if (var4 + 512 > this.field1350) {
                  var4 = this.field1350 - 512;
                  this.field1342 = var4 - this.field1345;
               }
            }

            while(var3 < var4) {
               this.method3094(this.field1340, 512);
               this.vmethod3058();
               var3 += 512;
            }

            if (var1 > this.field1352) {
               if (!this.field1353) {
                  if (this.field1349 == 0 && this.field1347 == 0) {
                     this.vmethod3059();
                     this.field1348 = 2000L + var1;
                     return;
                  }

                  this.field1342 = Math.min(this.field1347, this.field1349);
                  this.field1347 = this.field1349;
               } else {
                  this.field1353 = false;
               }

               this.field1349 = 0;
               this.field1352 = var1 + 2000L;
            }

            this.field1351 = var3;
         } catch (Exception var7) {
            this.vmethod3059();
            this.field1348 = var1 + 2000L;
         }

         try {
            if (var1 > 500000L + this.field1344) {
               var1 = this.field1344;
            }

            while(var1 > this.field1344 + 5000L) {
               this.method3052(512);
               this.field1344 += (long)(512000 / field1356);
            }
         } catch (Exception var6) {
            this.field1344 = var1;
         }

      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "111"
   )
   public final void method3049() {
      this.field1353 = true;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1093865024"
   )
   public final synchronized void method3050() {
      this.field1353 = true;

      try {
         this.vmethod3060();
      } catch (Exception var2) {
         this.vmethod3059();
         this.field1348 = class189.method4284() + 2000L;
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1799762007"
   )
   public final synchronized void method3051() {
      if (class220.field2575 != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if (this == class220.field2575.field1370[var2]) {
               class220.field2575.field1370[var2] = null;
            }

            if (class220.field2575.field1370[var2] != null) {
               var1 = false;
            }
         }

         if (var1) {
            field1346.shutdownNow();
            field1346 = null;
            class220.field2575 = null;
         }
      }

      this.vmethod3059();
      this.field1340 = null;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1045776317"
   )
   final void method3052(int var1) {
      this.field1354 -= var1;
      if (this.field1354 < 0) {
         this.field1354 = 0;
      }

      if (this.field1338 != null) {
         this.field1338.vmethod7348(var1);
      }

   }

   @ObfuscatedName("bt")
   final void method3094(int[] var1, int var2) {
      int var3 = var2;
      if (field1339) {
         var3 = var2 << 1;
      }

      class480.method9686(var1, 0, var3);
      this.field1354 -= var2;
      if (this.field1338 != null && this.field1354 <= 0) {
         this.field1354 += field1356 >> 4;
         class1.method7(this.field1338);
         this.method3093(this.field1338, this.field1338.vmethod3324());
         int var4 = 0;
         int var5 = 255;

         int var6;
         class104 var10;
         label110:
         for(var6 = 7; var5 != 0; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  class104 var11 = this.field1355[var7];

                  label104:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label104;
                        }

                        class117 var12 = var11.field1412;
                        if (var12 != null && var12.field1547 > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.field1410;
                        } else {
                           var11.field1411 = true;
                           int var13 = var11.vmethod7364();
                           var4 += var13;
                           if (var12 != null) {
                              var12.field1547 += var13;
                           }

                           if (var4 >= this.field1336) {
                              break label110;
                           }

                           class104 var14 = var11.vmethod7346();
                           if (var14 != null) {
                              for(int var15 = var11.field1413; var14 != null; var14 = var11.vmethod7345()) {
                                 this.method3093(var14, var15 * var14.vmethod3324() >> 8);
                              }
                           }

                           class104 var16 = var11.field1410;
                           var11.field1410 = null;
                           if (var10 == null) {
                              this.field1355[var7] = var16;
                           } else {
                              var10.field1410 = var16;
                           }

                           if (var16 == null) {
                              this.field1343[var7] = var10;
                           }

                           var11 = var16;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            class104 var17 = this.field1355[var6];
            class104[] var18 = this.field1355;
            this.field1343[var6] = null;

            for(var18[var6] = null; var17 != null; var17 = var10) {
               var10 = var17.field1410;
               var17.field1410 = null;
            }
         }
      }

      if (this.field1354 < 0) {
         this.field1354 = 0;
      }

      if (this.field1338 != null) {
         this.field1338.vmethod7347(var1, 0, var2);
      }

      this.field1344 = class189.method4284();
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(Lef;II)V",
      garbageValue = "1048424017"
   )
   final void method3093(class104 var1, int var2) {
      int var3 = var2 >> 5;
      class104 var4 = this.field1343[var3];
      if (var4 == null) {
         this.field1355[var3] = var1;
      } else {
         var4.field1410 = var1;
      }

      this.field1343[var3] = var1;
      var1.field1413 = var2;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Lim;",
      garbageValue = "1437975445"
   )
   public static class208 method3080(int var0) {
      class208 var1 = (class208)class208.field2270.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class208.field2275.method8335(11, var0);
         var1 = new class208();
         if (var2 != null) {
            var1.method4522(new class590(var2));
         }

         var1.method4521();
         class208.field2270.method7009(var1, (long)var0);
         return var1;
      }
   }
}
