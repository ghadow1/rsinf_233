package runescape;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ij")
public class class215 extends class540 {
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   public static class412 field2465;
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class320 field2466 = new class320(64);
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class320 field2467 = new class320(100);
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class320 field2468 = new class320(100);
   @ObfuscatedName("bu")
   static boolean field2469 = false;
   @ObfuscatedName("po")
   static int[] field2463;
   @ObfuscatedName("pa")
   static byte[][] field2494;
   @ObfuscatedName("vk")
   @ObfuscatedGetter(
      intValue = -1632722523
   )
   static int field2487;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -1276980385
   )
   public int field2458 = -1;
   @ObfuscatedName("bd")
   public Map field2471;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 741903671
   )
   int field2455 = 0;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 1648101563
   )
   int field2473 = 0;
   @ObfuscatedName("bo")
   public int[] field2474;
   @ObfuscatedName("bl")
   int[] field2475;
   @ObfuscatedName("by")
   public int[] field2460;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 873066783
   )
   public int field2477;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -1618965207
   )
   public int field2493 = -1;
   @ObfuscatedName("bq")
   int[] field2479;
   @ObfuscatedName("bz")
   boolean[] field2470;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = 674107971
   )
   public int field2481 = 0;
   @ObfuscatedName("be")
   public boolean field2482 = false;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = -1143323137
   )
   public int field2480 = 5;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = 562023531
   )
   public int field2484 = -1;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 1931301869
   )
   public int field2490 = -1;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = -986527063
   )
   public int field2486 = 99;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -957102913
   )
   public int field2492 = -1;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -1503296261
   )
   public int field2485 = -1;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 500891711
   )
   public int field2489 = 2;
   @ObfuscatedName("bf")
   public boolean field2483 = false;

   class215() {
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-1526533488"
   )
   void method4759(Buffer var1) {
      while(true) {
         int var2 = var1.method11196();
         if (var2 == 0) {
            return;
         }

         this.method4789(var1, var2);
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lwb;IB)V",
      garbageValue = "11"
   )
   void method4789(Buffer var1, int var2) {
      int var3;
      int var4;
      if (var2 == 1) {
         var3 = var1.readUnsignedShort();
         this.field2460 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2460[var4] = var1.readUnsignedShort();
         }

         this.field2474 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2474[var4] = var1.readUnsignedShort();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2474[var4] += var1.readUnsignedShort() << 16;
         }
      } else if (var2 == 2) {
         this.field2493 = var1.readUnsignedShort();
      } else if (var2 == 3) {
         var3 = var1.method11196();
         this.field2479 = new int[var3 + 1];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2479[var4] = var1.method11196();
         }

         this.field2479[var3] = 9999999;
      } else if (var2 == 4) {
         this.field2482 = true;
      } else if (var2 == 5) {
         this.field2480 = var1.method11196();
      } else if (var2 == 6) {
         this.field2484 = var1.readUnsignedShort();
      } else if (var2 == 7) {
         this.field2490 = var1.readUnsignedShort();
      } else if (var2 == 8) {
         this.field2486 = var1.method11196();
      } else if (var2 == 9) {
         this.field2492 = var1.method11196();
      } else if (var2 == 10) {
         this.field2485 = var1.method11196();
      } else if (var2 == 11) {
         this.field2489 = var1.method11196();
      } else if (var2 == 12) {
         var3 = var1.method11196();
         this.field2475 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2475[var4] = var1.readUnsignedShort();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2475[var4] += var1.readUnsignedShort() << 16;
         }
      } else if (var2 == 13) {
         this.field2458 = var1.read32BitArray();
      } else if (var2 == 14) {
         var3 = var1.readUnsignedShort();
         if (this.field2471 == null) {
            this.field2471 = new HashMap();
         }

         for(var4 = 0; var4 < var3; ++var4) {
            int var5;
            class211 var6;
            label162: {
               var5 = var1.readUnsignedShort();
               if (var1 != null) {
                  boolean var7 = false;
                  boolean var8 = true;
                  boolean var9 = false;
                  boolean var10 = false;
                  boolean var11 = false;
                  int var13 = var1.readUnsignedShort();
                  int var14 = var1.method11196();
                  int var15 = var1.method11196();
                  int var16 = var1.method11196();
                  int var17 = var1.method11196();
                  if (var13 >= 1 && var15 >= 1 && var16 >= 0 && var17 >= 0) {
                     var6 = new class211(var13, var14, var15, var16, var17);
                     break label162;
                  }
               }

               var6 = null;
            }

            if (var6 != null) {
               if (!this.field2471.containsKey(var5)) {
                  this.field2471.put(var5, new ArrayList());
               }

               ((ArrayList)this.field2471.get(var5)).add(var6);
            }
         }
      } else if (var2 == 15) {
         this.field2455 = var1.readUnsignedShort();
         this.field2473 = var1.readUnsignedShort();
      } else if (var2 == 16) {
         this.field2481 = var1.method11197();
      } else if (var2 == 17) {
         this.field2470 = new boolean[256];

         for(var3 = 0; var3 < this.field2470.length; ++var3) {
            this.field2470[var3] = false;
         }

         var3 = var1.method11196();

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2470[var1.method11196()] = true;
         }
      } else if (var2 == 19) {
         this.field2483 = true;
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "288730722"
   )
   void method4761() {
      if (this.field2492 == -1) {
         if (this.field2479 == null && this.field2470 == null) {
            this.field2492 = 0;
         } else {
            this.field2492 = 2;
         }
      }

      if (this.field2485 == -1) {
         if (this.field2479 == null && this.field2470 == null) {
            this.field2485 = 0;
         } else {
            this.field2485 = 2;
         }
      }

      if (this.field2460 != null) {
         this.field2477 = 0;

         for(int var1 = 0; var1 < this.field2460.length; ++var1) {
            this.field2477 += this.field2460[var1];
         }
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ljn;IB)Ljn;",
      garbageValue = "31"
   )
   public class241 method4762(class241 var1, int var2) {
      class241 var4;
      if (!this.method4768()) {
         var2 = this.field2474[var2];
         class235 var5 = class35.method728(var2 >> 16);
         var2 &= 65535;
         if (var5 == null) {
            return var1.method5454(true);
         } else {
            var4 = var1.method5454(!var5.method5380(var2));
            var4.method5463(var5, var2);
            return var4;
         }
      } else {
         class146 var3 = class212.method4634(this.field2458);
         if (var3 == null) {
            return var1.method5454(true);
         } else {
            var4 = var1.method5454(!var3.method3756());
            var4.method5478(var3, var2);
            return var4;
         }
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ljn;IIB)Ljn;",
      garbageValue = "64"
   )
   class241 method4763(class241 var1, int var2, int var3) {
      class241 var5;
      if (!this.method4768()) {
         var2 = this.field2474[var2];
         class235 var6 = class35.method728(var2 >> 16);
         var2 &= 65535;
         if (var6 == null) {
            return var1.method5454(true);
         } else {
            var5 = var1.method5454(!var6.method5380(var2));
            var3 &= 3;
            if (var3 == 1) {
               var5.method5472();
            } else if (var3 == 2) {
               var5.method5471();
            } else if (var3 == 3) {
               var5.method5550();
            }

            var5.method5463(var6, var2);
            if (var3 == 1) {
               var5.method5550();
            } else if (var3 == 2) {
               var5.method5471();
            } else if (var3 == 3) {
               var5.method5472();
            }

            return var5;
         }
      } else {
         class146 var4 = class212.method4634(this.field2458);
         if (var4 == null) {
            return var1.method5454(true);
         } else {
            var5 = var1.method5454(!var4.method3756());
            var3 &= 3;
            if (var3 == 1) {
               var5.method5472();
            } else if (var3 == 2) {
               var5.method5471();
            } else if (var3 == 3) {
               var5.method5550();
            }

            var5.method5478(var4, var2);
            if (var3 == 1) {
               var5.method5550();
            } else if (var3 == 2) {
               var5.method5471();
            } else if (var3 == 3) {
               var5.method5472();
            }

            return var5;
         }
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Ljn;II)Ljn;",
      garbageValue = "-1310667162"
   )
   class241 method4764(class241 var1, int var2) {
      class241 var4;
      if (!this.method4768()) {
         var2 = this.field2474[var2];
         class235 var5 = class35.method728(var2 >> 16);
         var2 &= 65535;
         if (var5 == null) {
            return var1.method5592(true);
         } else {
            var4 = var1.method5592(!var5.method5380(var2));
            var4.method5463(var5, var2);
            return var4;
         }
      } else {
         class146 var3 = class212.method4634(this.field2458);
         if (var3 == null) {
            return var1.method5592(true);
         } else {
            var4 = var1.method5592(!var3.method3756());
            var4.method5478(var3, var2);
            return var4;
         }
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Ljn;ILij;II)Ljn;",
      garbageValue = "19841641"
   )
   public class241 method4765(class241 var1, int var2, class215 var3, int var4) {
      if (field2469 && !this.method4768() && !var3.method4768()) {
         return this.method4766(var1, var2, var3, var4);
      } else {
         class241 var5 = var1.method5454(false);
         boolean var6 = false;
         class235 var7 = null;
         class229 var8 = null;
         class146 var9;
         if (this.method4768()) {
            var9 = this.method4771();
            if (var9 == null) {
               return var5;
            }

            if (var3.method4768() && this.field2470 == null) {
               var5.method5478(var9, var2);
               return var5;
            }

            var8 = var9.field1731;
            var5.method5498(var8, var9, var2, this.field2470, false, !var3.method4768());
         } else {
            var2 = this.field2474[var2];
            var7 = class35.method728(var2 >> 16);
            var2 &= 65535;
            if (var7 == null) {
               return var3.method4762(var1, var4);
            }

            if (!var3.method4768() && (this.field2479 == null || var4 == -1)) {
               var5.method5463(var7, var2);
               return var5;
            }

            if (this.field2479 == null || var4 == -1) {
               var5.method5463(var7, var2);
               return var5;
            }

            var6 = var3.method4768();
            if (!var6) {
               var5.method5468(var7, var2, this.field2479, false);
            }
         }

         if (var3.method4768()) {
            var9 = var3.method4771();
            if (var9 == null) {
               return var5;
            }

            if (var8 == null) {
               var8 = var9.field1731;
            }

            var5.method5498(var8, var9, var4, this.field2470, true, true);
         } else {
            var4 = var3.field2474[var4];
            class235 var10 = class35.method728(var4 >> 16);
            var4 &= 65535;
            if (var10 == null) {
               return this.method4762(var1, var2);
            }

            var5.method5468(var10, var4, this.field2479, true);
         }

         if (var6 && var7 != null) {
            var5.method5468(var7, var2, this.field2479, false);
         }

         var5.method5462();
         return var5;
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Ljn;ILij;II)Ljn;",
      garbageValue = "-319149046"
   )
   class241 method4766(class241 var1, int var2, class215 var3, int var4) {
      var2 = this.field2474[var2];
      class235 var5 = class35.method728(var2 >> 16);
      var2 &= 65535;
      if (var5 == null) {
         return var3.method4762(var1, var4);
      } else {
         var4 = var3.field2474[var4];
         class235 var6 = class35.method728(var4 >> 16);
         var4 &= 65535;
         class241 var7;
         if (var6 == null) {
            var7 = var1.method5454(!var5.method5380(var2));
            var7.method5463(var5, var2);
            return var7;
         } else {
            var7 = var1.method5454(!var5.method5380(var2) & !var6.method5380(var4));
            var7.method5467(var5, var2, var6, var4, this.field2479);
            return var7;
         }
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Ljn;II)Ljn;",
      garbageValue = "-764233604"
   )
   public class241 method4767(class241 var1, int var2) {
      if (!this.method4768()) {
         int var3 = this.field2474[var2];
         class235 var4 = class35.method728(var3 >> 16);
         var3 &= 65535;
         if (var4 == null) {
            return var1.method5454(true);
         } else {
            class235 var5 = null;
            int var6 = 0;
            if (this.field2475 != null && var2 < this.field2475.length) {
               var6 = this.field2475[var2];
               var5 = class35.method728(var6 >> 16);
               var6 &= 65535;
            }

            class241 var7;
            if (var5 != null && var6 != 65535) {
               var7 = var1.method5454(!var4.method5380(var3) & !var5.method5380(var6));
               var7.method5463(var4, var3);
               var7.method5463(var5, var6);
               return var7;
            } else {
               var7 = var1.method5454(!var4.method5380(var3));
               var7.method5463(var4, var3);
               return var7;
            }
         }
      } else {
         return this.method4762(var1, var2);
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1262124675"
   )
   public boolean method4768() {
      return this.field2458 >= 0;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-32"
   )
   public int method4769() {
      return this.field2473 - this.field2455;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "588741928"
   )
   int method4770() {
      if (this.method4768()) {
         int var2 = this.field2458;
         class146 var3 = class120.method3516(var2);
         int var1;
         if (var3 == null) {
            var1 = 2;
         } else {
            var1 = var3.method3754() ? 0 : 1;
         }

         return var1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(B)Lfh;",
      garbageValue = "-36"
   )
   class146 method4771() {
      return this.method4768() ? class212.method4634(this.field2458) : null;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1006641339"
   )
   public boolean method4791() {
      if (this.method4768()) {
         return this.method4770() == 0;
      } else {
         return class35.method728(this.field2474[0] >> 16) != null;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)D",
      garbageValue = "-874369056"
   )
   public static double method4817(int var0) {
      int var1 = class536.field5574[var0 & 2047];
      return (double)var1 / 65536.0D;
   }
}
