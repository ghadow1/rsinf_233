package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class class219 extends class233 {
   @ObfuscatedName("ac")
   static int[] field2526 = new int[10000];
   @ObfuscatedName("ap")
   static int[] field2536 = new int[10000];
   @ObfuscatedName("aq")
   static int field2528 = 0;
   @ObfuscatedName("ao")
   static int[] field2529;
   @ObfuscatedName("as")
   static int[] field2530;
   @ObfuscatedName("al")
   int field2531 = 0;
   @ObfuscatedName("au")
   int[] field2532;
   @ObfuscatedName("ai")
   int[] field2560;
   @ObfuscatedName("aa")
   int[] field2534;
   @ObfuscatedName("am")
   int field2535 = 0;
   @ObfuscatedName("an")
   int[] field2523;
   @ObfuscatedName("ar")
   int[] field2524;
   @ObfuscatedName("ae")
   int[] field2563;
   @ObfuscatedName("ay")
   byte[] field2559;
   @ObfuscatedName("ad")
   byte[] field2540;
   @ObfuscatedName("ag")
   byte[] field2541;
   @ObfuscatedName("av")
   byte[] field2549;
   @ObfuscatedName("ah")
   short[] field2543;
   @ObfuscatedName("ab")
   short[] field2544;
   @ObfuscatedName("ax")
   byte[] field2545;
   @ObfuscatedName("ak")
   byte field2550 = 0;
   @ObfuscatedName("aj")
   int field2547;
   @ObfuscatedName("az")
   byte[] field2548;
   @ObfuscatedName("bt")
   short[] field2556;
   @ObfuscatedName("bs")
   short[] field2565;
   @ObfuscatedName("bu")
   short[] field2551;
   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "[Ljw;"
   )
   class234[] field2552;
   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "[Lje;"
   )
   class243[] field2553;
   @ObfuscatedName("ba")
   public short field2554;
   @ObfuscatedName("bb")
   public short field2555;
   @ObfuscatedName("bo")
   int[][] field2542;
   @ObfuscatedName("bl")
   int[][] field2557;
   @ObfuscatedName("by")
   int[] field2558;
   @ObfuscatedName("bg")
   int[] field2533;
   @ObfuscatedName("bx")
   int[][] field2564;
   @ObfuscatedName("bq")
   int[][] field2561;
   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "[Lje;"
   )
   class243[] field2562;
   @ObfuscatedName("bn")
   boolean field2546 = false;
   @ObfuscatedName("be")
   int field2537;
   @ObfuscatedName("bh")
   int field2539;
   @ObfuscatedName("bk")
   int field2566;
   @ObfuscatedName("bp")
   int field2567;
   @ObfuscatedName("br")
   int field2568;

   static {
      field2529 = class225.field2637;
      field2530 = class225.field2636;
   }

   class219() {
   }

   @ObfuscatedSignature(
      descriptor = "([Liu;I)V"
   )
   public class219(class219[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      this.field2531 = 0;
      this.field2535 = 0;
      this.field2547 = 0;
      this.field2550 = -1;

      int var11;
      class219 var12;
      for(var11 = 0; var11 < var2; ++var11) {
         var12 = var1[var11];
         if (var12 != null) {
            this.field2531 += var12.field2531;
            this.field2535 += var12.field2535;
            this.field2547 += var12.field2547;
            if (var12.field2540 != null) {
               var4 = true;
            } else {
               if (this.field2550 == -1) {
                  this.field2550 = var12.field2550;
               }

               if (this.field2550 != var12.field2550) {
                  var4 = true;
               }
            }

            var3 |= var12.field2559 != null;
            var5 |= var12.field2541 != null;
            var6 |= var12.field2533 != null;
            var7 |= var12.field2544 != null;
            var8 |= var12.field2549 != null;
            var9 |= var12.field2542 != null;
            var10 |= var12.field2545 != null;
         }
      }

      this.field2532 = new int[this.field2531];
      this.field2560 = new int[this.field2531];
      this.field2534 = new int[this.field2531];
      this.field2558 = new int[this.field2531];
      this.field2523 = new int[this.field2535];
      this.field2524 = new int[this.field2535];
      this.field2563 = new int[this.field2535];
      if (var3) {
         this.field2559 = new byte[this.field2535];
      }

      if (var4) {
         this.field2540 = new byte[this.field2535];
      }

      if (var5) {
         this.field2541 = new byte[this.field2535];
      }

      if (var6) {
         this.field2533 = new int[this.field2535];
      }

      if (var7) {
         this.field2544 = new short[this.field2535];
      }

      if (var8) {
         this.field2549 = new byte[this.field2535];
      }

      if (var9) {
         this.field2542 = new int[this.field2531][];
         this.field2557 = new int[this.field2531][];
      }

      if (var10) {
         this.field2545 = new byte[this.field2535];
      }

      this.field2543 = new short[this.field2535];
      if (this.field2547 > 0) {
         this.field2548 = new byte[this.field2547];
         this.field2556 = new short[this.field2547];
         this.field2565 = new short[this.field2547];
         this.field2551 = new short[this.field2547];
      }

      this.field2531 = 0;
      this.field2535 = 0;
      this.field2547 = 0;

      for(var11 = 0; var11 < var2; ++var11) {
         var12 = var1[var11];
         if (var12 != null) {
            int var13;
            for(var13 = 0; var13 < var12.field2535; ++var13) {
               if (var3 && var12.field2559 != null) {
                  this.field2559[this.field2535] = var12.field2559[var13];
               }

               if (var4) {
                  if (var12.field2540 != null) {
                     this.field2540[this.field2535] = var12.field2540[var13];
                  } else {
                     this.field2540[this.field2535] = var12.field2550;
                  }
               }

               if (var5 && var12.field2541 != null) {
                  this.field2541[this.field2535] = var12.field2541[var13];
               }

               if (var6 && var12.field2533 != null) {
                  this.field2533[this.field2535] = var12.field2533[var13];
               }

               if (var7) {
                  if (var12.field2544 != null) {
                     this.field2544[this.field2535] = var12.field2544[var13];
                  } else {
                     this.field2544[this.field2535] = -1;
                  }
               }

               if (var8) {
                  if (var12.field2549 != null && var12.field2549[var13] != -1) {
                     this.field2549[this.field2535] = (byte)(this.field2547 + var12.field2549[var13]);
                  } else {
                     this.field2549[this.field2535] = -1;
                  }
               }

               if (var10 && var12.field2545 != null) {
                  this.field2545[this.field2535] = var12.field2545[var13];
               }

               this.field2543[this.field2535] = var12.field2543[var13];
               this.field2523[this.field2535] = this.method4903(var12, var12.field2523[var13]);
               this.field2524[this.field2535] = this.method4903(var12, var12.field2524[var13]);
               this.field2563[this.field2535] = this.method4903(var12, var12.field2563[var13]);
               ++this.field2535;
            }

            for(var13 = 0; var13 < var12.field2547; ++var13) {
               byte var14 = this.field2548[this.field2547] = var12.field2548[var13];
               if (var14 == 0) {
                  this.field2556[this.field2547] = (short)this.method4903(var12, var12.field2556[var13]);
                  this.field2565[this.field2547] = (short)this.method4903(var12, var12.field2565[var13]);
                  this.field2551[this.field2547] = (short)this.method4903(var12, var12.field2551[var13]);
               }

               ++this.field2547;
            }
         }
      }

   }

   class219(byte[] var1) {
      if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
         this.method4839(var1);
      } else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
         this.method4834(var1);
      } else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method4836(var1);
      } else {
         this.method4859(var1);
      }

   }

   @ObfuscatedSignature(
      descriptor = "(Liu;ZZZZ)V",
      garbageValue = "1"
   )
   public class219(class219 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.field2531 = var1.field2531;
      this.field2535 = var1.field2535;
      this.field2547 = var1.field2547;
      int var6;
      if (var2) {
         this.field2532 = var1.field2532;
         this.field2560 = var1.field2560;
         this.field2534 = var1.field2534;
      } else {
         this.field2532 = new int[this.field2531];
         this.field2560 = new int[this.field2531];
         this.field2534 = new int[this.field2531];

         for(var6 = 0; var6 < this.field2531; ++var6) {
            this.field2532[var6] = var1.field2532[var6];
            this.field2560[var6] = var1.field2560[var6];
            this.field2534[var6] = var1.field2534[var6];
         }
      }

      if (var3) {
         this.field2543 = var1.field2543;
      } else {
         this.field2543 = new short[this.field2535];

         for(var6 = 0; var6 < this.field2535; ++var6) {
            this.field2543[var6] = var1.field2543[var6];
         }
      }

      if (!var4 && var1.field2544 != null) {
         this.field2544 = new short[this.field2535];

         for(var6 = 0; var6 < this.field2535; ++var6) {
            this.field2544[var6] = var1.field2544[var6];
         }
      } else {
         this.field2544 = var1.field2544;
      }

      this.field2541 = var1.field2541;
      this.field2523 = var1.field2523;
      this.field2524 = var1.field2524;
      this.field2563 = var1.field2563;
      this.field2559 = var1.field2559;
      this.field2540 = var1.field2540;
      this.field2549 = var1.field2549;
      this.field2550 = var1.field2550;
      this.field2548 = var1.field2548;
      this.field2556 = var1.field2556;
      this.field2565 = var1.field2565;
      this.field2551 = var1.field2551;
      this.field2558 = var1.field2558;
      this.field2533 = var1.field2533;
      this.field2564 = var1.field2564;
      this.field2561 = var1.field2561;
      this.field2553 = var1.field2553;
      this.field2552 = var1.field2552;
      this.field2562 = var1.field2562;
      this.field2542 = var1.field2542;
      this.field2557 = var1.field2557;
      this.field2554 = var1.field2554;
      this.field2555 = var1.field2555;
      this.field2545 = var1.field2545;
   }

   public class219(int var1, int var2, int var3) {
      this.field2532 = new int[var1];
      this.field2560 = new int[var1];
      this.field2534 = new int[var1];
      this.field2558 = new int[var1];
      this.field2523 = new int[var2];
      this.field2524 = new int[var2];
      this.field2563 = new int[var2];
      this.field2559 = new byte[var2];
      this.field2540 = new byte[var2];
      this.field2541 = new byte[var2];
      this.field2543 = new short[var2];
      this.field2544 = new short[var2];
      this.field2549 = new byte[var2];
      this.field2533 = new int[var2];
      if (var3 > 0) {
         this.field2548 = new byte[var3];
         this.field2556 = new short[var3];
         this.field2565 = new short[var3];
         this.field2551 = new short[var3];
      }

   }

   @ObfuscatedName("aq")
   void method4839(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.offset = (var1.length - 26) * -290410379;
      int var9 = var2.readUnsignedShort();
      int var10 = var2.readUnsignedShort();
      int var11 = var2.method11196();
      int var12 = var2.method11196();
      int var13 = var2.method11196();
      int var14 = var2.method11196();
      int var15 = var2.method11196();
      int var16 = var2.method11196();
      int var17 = var2.method11196();
      int var18 = var2.method11196();
      int var19 = var2.readUnsignedShort();
      int var20 = var2.readUnsignedShort();
      int var21 = var2.readUnsignedShort();
      int var22 = var2.readUnsignedShort();
      int var23 = var2.readUnsignedShort();
      int var24 = var2.readUnsignedShort();
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28;
      if (var11 > 0) {
         this.field2548 = new byte[var11];
         var2.offset = 0;

         for(var28 = 0; var28 < var11; ++var28) {
            byte var29 = this.field2548[var28] = var2.method11197();
            if (var29 == 0) {
               ++var25;
            }

            if (var29 >= 1 && var29 <= 3) {
               ++var26;
            }

            if (var29 == 2) {
               ++var27;
            }
         }
      }

      var28 = var11 + var9;
      int var30 = var28;
      if (var12 == 1) {
         var28 += var10;
      }

      int var31 = var28;
      var28 += var10;
      int var32 = var28;
      if (var13 == 255) {
         var28 += var10;
      }

      int var33 = var28;
      if (var15 == 1) {
         var28 += var10;
      }

      int var34 = var28;
      var28 += var24;
      int var35 = var28;
      if (var14 == 1) {
         var28 += var10;
      }

      int var36 = var28;
      var28 += var22;
      int var37 = var28;
      if (var16 == 1) {
         var28 += var10 * 2;
      }

      int var38 = var28;
      var28 += var23;
      int var39 = var28;
      var28 += var10 * 2;
      int var40 = var28;
      var28 += var19;
      int var41 = var28;
      var28 += var20;
      int var42 = var28;
      var28 += var21;
      int var43 = var28;
      var28 += var25 * 6;
      int var44 = var28;
      var28 += var26 * 6;
      int var45 = var28;
      var28 += var26 * 6;
      int var46 = var28;
      var28 += var26 * 2;
      int var47 = var28;
      var28 += var26;
      int var48 = var28;
      var28 += var26 * 2 + var27 * 2;
      this.field2531 = var9;
      this.field2535 = var10;
      this.field2547 = var11;
      this.field2532 = new int[var9];
      this.field2560 = new int[var9];
      this.field2534 = new int[var9];
      this.field2523 = new int[var10];
      this.field2524 = new int[var10];
      this.field2563 = new int[var10];
      if (var17 == 1) {
         this.field2558 = new int[var9];
      }

      if (var12 == 1) {
         this.field2559 = new byte[var10];
      }

      if (var13 == 255) {
         this.field2540 = new byte[var10];
      } else {
         this.field2550 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2541 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2533 = new int[var10];
      }

      if (var16 == 1) {
         this.field2544 = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field2549 = new byte[var10];
      }

      if (var18 == 1) {
         this.field2542 = new int[var9][];
         this.field2557 = new int[var9][];
      }

      this.field2543 = new short[var10];
      if (var11 > 0) {
         this.field2556 = new short[var11];
         this.field2565 = new short[var11];
         this.field2551 = new short[var11];
      }

      var2.offset = var11 * -290410379;
      var3.offset = var40 * -290410379;
      var4.offset = var41 * -290410379;
      var5.offset = var42 * -290410379;
      var6.offset = var34 * -290410379;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      int var53;
      int var54;
      int var55;
      int var56;
      int var57;
      for(var53 = 0; var53 < var9; ++var53) {
         var54 = var2.method11196();
         var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.method11211();
         }

         var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.method11211();
         }

         var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.method11211();
         }

         this.field2532[var53] = var50 + var55;
         this.field2560[var53] = var51 + var56;
         this.field2534[var53] = var52 + var57;
         var50 = this.field2532[var53];
         var51 = this.field2560[var53];
         var52 = this.field2534[var53];
         if (var17 == 1) {
            this.field2558[var53] = var6.method11196();
         }
      }

      if (var18 == 1) {
         for(var53 = 0; var53 < var9; ++var53) {
            var54 = var6.method11196();
            this.field2542[var53] = new int[var54];
            this.field2557[var53] = new int[var54];

            for(var55 = 0; var55 < var54; ++var55) {
               this.field2542[var53][var55] = var6.method11196();
               this.field2557[var53][var55] = var6.method11196();
            }
         }
      }

      var2.offset = var39 * -290410379;
      var3.offset = var30 * -290410379;
      var4.offset = var32 * -290410379;
      var5.offset = var35 * -290410379;
      var6.offset = var33 * -290410379;
      var7.offset = var37 * -290410379;
      var8.offset = var38 * -290410379;

      for(var53 = 0; var53 < var10; ++var53) {
         this.field2543[var53] = (short)var2.readUnsignedShort();
         if (var12 == 1) {
            this.field2559[var53] = var3.method11197();
         }

         if (var13 == 255) {
            this.field2540[var53] = var4.method11197();
         }

         if (var14 == 1) {
            this.field2541[var53] = var5.method11197();
         }

         if (var15 == 1) {
            this.field2533[var53] = var6.method11196();
         }

         if (var16 == 1) {
            this.field2544[var53] = (short)(var7.readUnsignedShort() - 1);
         }

         if (this.field2549 != null && this.field2544[var53] != -1) {
            this.field2549[var53] = (byte)(var8.method11196() - 1);
         }
      }

      var2.offset = var36 * -290410379;
      var3.offset = var31 * -290410379;
      var53 = 0;
      var54 = 0;
      var55 = 0;
      var56 = 0;

      int var58;
      int var59;
      for(var57 = 0; var57 < var10; ++var57) {
         var58 = var3.method11196();
         if (var58 == 1) {
            var53 = var2.method11211() + var56;
            var54 = var2.method11211() + var53;
            var55 = var2.method11211() + var54;
            var56 = var55;
            this.field2523[var57] = var53;
            this.field2524[var57] = var54;
            this.field2563[var57] = var55;
         }

         if (var58 == 2) {
            var54 = var55;
            var55 = var2.method11211() + var56;
            var56 = var55;
            this.field2523[var57] = var53;
            this.field2524[var57] = var54;
            this.field2563[var57] = var55;
         }

         if (var58 == 3) {
            var53 = var55;
            var55 = var2.method11211() + var56;
            var56 = var55;
            this.field2523[var57] = var53;
            this.field2524[var57] = var54;
            this.field2563[var57] = var55;
         }

         if (var58 == 4) {
            var59 = var53;
            var53 = var54;
            var54 = var59;
            var55 = var2.method11211() + var56;
            var56 = var55;
            this.field2523[var57] = var53;
            this.field2524[var57] = var59;
            this.field2563[var57] = var55;
         }
      }

      var2.offset = var43 * -290410379;
      var3.offset = var44 * -290410379;
      var4.offset = var45 * -290410379;
      var5.offset = var46 * -290410379;
      var6.offset = var47 * -290410379;
      var7.offset = var48 * -290410379;

      for(var57 = 0; var57 < var11; ++var57) {
         var58 = this.field2548[var57] & 255;
         if (var58 == 0) {
            this.field2556[var57] = (short)var2.readUnsignedShort();
            this.field2565[var57] = (short)var2.readUnsignedShort();
            this.field2551[var57] = (short)var2.readUnsignedShort();
         }
      }

      var2.offset = var28 * -290410379;
      var57 = var2.method11196();
      if (var57 != 0) {
         new class249();
         var2.readUnsignedShort();
         var2.readUnsignedShort();
         var2.readUnsignedShort();
         var2.read32BitArray();
      }

      boolean var60 = var2.method11196() == 1;
      if (var60) {
         this.field2545 = new byte[var10];

         for(var59 = 0; var59 < var10; ++var59) {
            this.field2545[var59] = var2.method11197();
         }
      }

   }

   @ObfuscatedName("ao")
   void method4834(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = (var1.length - 23) * -290410379;
      int var9 = var4.readUnsignedShort();
      int var10 = var4.readUnsignedShort();
      int var11 = var4.method11196();
      int var12 = var4.method11196();
      int var13 = var4.method11196();
      int var14 = var4.method11196();
      int var15 = var4.method11196();
      int var16 = var4.method11196();
      int var17 = var4.method11196();
      int var18 = var4.readUnsignedShort();
      int var19 = var4.readUnsignedShort();
      int var20 = var4.readUnsignedShort();
      int var21 = var4.readUnsignedShort();
      int var22 = var4.readUnsignedShort();
      byte var23 = 0;
      int var49 = var23 + var9;
      int var25 = var49;
      var49 += var10;
      int var26 = var49;
      if (var13 == 255) {
         var49 += var10;
      }

      int var27 = var49;
      if (var15 == 1) {
         var49 += var10;
      }

      int var28 = var49;
      if (var12 == 1) {
         var49 += var10;
      }

      int var29 = var49;
      var49 += var22;
      int var30 = var49;
      if (var14 == 1) {
         var49 += var10;
      }

      int var31 = var49;
      var49 += var21;
      int var32 = var49;
      var49 += var10 * 2;
      int var33 = var49;
      var49 += var11 * 6;
      int var34 = var49;
      var49 += var18;
      int var35 = var49;
      var49 += var19;
      int var36 = var49;
      var49 += var20;
      this.field2531 = var9;
      this.field2535 = var10;
      this.field2547 = var11;
      this.field2532 = new int[var9];
      this.field2560 = new int[var9];
      this.field2534 = new int[var9];
      this.field2523 = new int[var10];
      this.field2524 = new int[var10];
      this.field2563 = new int[var10];
      if (var11 > 0) {
         this.field2548 = new byte[var11];
         this.field2556 = new short[var11];
         this.field2565 = new short[var11];
         this.field2551 = new short[var11];
      }

      if (var16 == 1) {
         this.field2558 = new int[var9];
      }

      if (var12 == 1) {
         this.field2559 = new byte[var10];
         this.field2549 = new byte[var10];
         this.field2544 = new short[var10];
      }

      if (var13 == 255) {
         this.field2540 = new byte[var10];
      } else {
         this.field2550 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2541 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2533 = new int[var10];
      }

      if (var17 == 1) {
         this.field2542 = new int[var9][];
         this.field2557 = new int[var9][];
      }

      this.field2543 = new short[var10];
      var4.offset = var23 * -290410379;
      var5.offset = var34 * -290410379;
      var6.offset = var35 * -290410379;
      var7.offset = var36 * -290410379;
      var8.offset = var29 * -290410379;
      int var38 = 0;
      int var39 = 0;
      int var40 = 0;

      int var41;
      int var42;
      int var43;
      int var44;
      int var45;
      for(var41 = 0; var41 < var9; ++var41) {
         var42 = var4.method11196();
         var43 = 0;
         if ((var42 & 1) != 0) {
            var43 = var5.method11211();
         }

         var44 = 0;
         if ((var42 & 2) != 0) {
            var44 = var6.method11211();
         }

         var45 = 0;
         if ((var42 & 4) != 0) {
            var45 = var7.method11211();
         }

         this.field2532[var41] = var38 + var43;
         this.field2560[var41] = var39 + var44;
         this.field2534[var41] = var40 + var45;
         var38 = this.field2532[var41];
         var39 = this.field2560[var41];
         var40 = this.field2534[var41];
         if (var16 == 1) {
            this.field2558[var41] = var8.method11196();
         }
      }

      if (var17 == 1) {
         for(var41 = 0; var41 < var9; ++var41) {
            var42 = var8.method11196();
            this.field2542[var41] = new int[var42];
            this.field2557[var41] = new int[var42];

            for(var43 = 0; var43 < var42; ++var43) {
               this.field2542[var41][var43] = var8.method11196();
               this.field2557[var41][var43] = var8.method11196();
            }
         }
      }

      var4.offset = var32 * -290410379;
      var5.offset = var28 * -290410379;
      var6.offset = var26 * -290410379;
      var7.offset = var30 * -290410379;
      var8.offset = var27 * -290410379;

      for(var41 = 0; var41 < var10; ++var41) {
         this.field2543[var41] = (short)var4.readUnsignedShort();
         if (var12 == 1) {
            var42 = var5.method11196();
            if ((var42 & 1) == 1) {
               this.field2559[var41] = 1;
               var2 = true;
            } else {
               this.field2559[var41] = 0;
            }

            if ((var42 & 2) == 2) {
               this.field2549[var41] = (byte)(var42 >> 2);
               this.field2544[var41] = this.field2543[var41];
               this.field2543[var41] = 127;
               if (this.field2544[var41] != -1) {
                  var3 = true;
               }
            } else {
               this.field2549[var41] = -1;
               this.field2544[var41] = -1;
            }
         }

         if (var13 == 255) {
            this.field2540[var41] = var6.method11197();
         }

         if (var14 == 1) {
            this.field2541[var41] = var7.method11197();
         }

         if (var15 == 1) {
            this.field2533[var41] = var8.method11196();
         }
      }

      var4.offset = var31 * -290410379;
      var5.offset = var25 * -290410379;
      var41 = 0;
      var42 = 0;
      var43 = 0;
      var44 = 0;

      int var46;
      int var47;
      for(var45 = 0; var45 < var10; ++var45) {
         var46 = var5.method11196();
         if (var46 == 1) {
            var41 = var4.method11211() + var44;
            var42 = var4.method11211() + var41;
            var43 = var4.method11211() + var42;
            var44 = var43;
            this.field2523[var45] = var41;
            this.field2524[var45] = var42;
            this.field2563[var45] = var43;
         }

         if (var46 == 2) {
            var42 = var43;
            var43 = var4.method11211() + var44;
            var44 = var43;
            this.field2523[var45] = var41;
            this.field2524[var45] = var42;
            this.field2563[var45] = var43;
         }

         if (var46 == 3) {
            var41 = var43;
            var43 = var4.method11211() + var44;
            var44 = var43;
            this.field2523[var45] = var41;
            this.field2524[var45] = var42;
            this.field2563[var45] = var43;
         }

         if (var46 == 4) {
            var47 = var41;
            var41 = var42;
            var42 = var47;
            var43 = var4.method11211() + var44;
            var44 = var43;
            this.field2523[var45] = var41;
            this.field2524[var45] = var47;
            this.field2563[var45] = var43;
         }
      }

      var4.offset = var33 * -290410379;

      for(var45 = 0; var45 < var11; ++var45) {
         this.field2548[var45] = 0;
         this.field2556[var45] = (short)var4.readUnsignedShort();
         this.field2565[var45] = (short)var4.readUnsignedShort();
         this.field2551[var45] = (short)var4.readUnsignedShort();
      }

      var4.offset = var49 * -290410379;
      boolean var51 = var4.method11196() == 1;
      if (var51) {
         this.field2545 = new byte[var10];

         for(var46 = 0; var46 < var10; ++var46) {
            this.field2545[var46] = var4.method11197();
         }
      }

      if (this.field2549 != null) {
         boolean var50 = false;

         for(var47 = 0; var47 < var10; ++var47) {
            int var48 = this.field2549[var47] & 255;
            if (var48 != 255) {
               if (this.field2523[var47] == (this.field2556[var48] & '\uffff') && this.field2524[var47] == (this.field2565[var48] & '\uffff') && this.field2563[var47] == (this.field2551[var48] & '\uffff')) {
                  this.field2549[var47] = -1;
               } else {
                  var50 = true;
               }
            }
         }

         if (!var50) {
            this.field2549 = null;
         }
      }

      if (!var3) {
         this.field2544 = null;
      }

      if (!var2) {
         this.field2559 = null;
      }

   }

   @ObfuscatedName("as")
   void method4836(byte[] var1) {
      Buffer var2 = new Buffer(var1);
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var2.offset = (var1.length - 23) * -290410379;
      int var9 = var2.readUnsignedShort();
      int var10 = var2.readUnsignedShort();
      int var11 = var2.method11196();
      int var12 = var2.method11196();
      int var13 = var2.method11196();
      int var14 = var2.method11196();
      int var15 = var2.method11196();
      int var16 = var2.method11196();
      int var17 = var2.method11196();
      int var18 = var2.readUnsignedShort();
      int var19 = var2.readUnsignedShort();
      int var20 = var2.readUnsignedShort();
      int var21 = var2.readUnsignedShort();
      int var22 = var2.readUnsignedShort();
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.field2548 = new byte[var11];
         var2.offset = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field2548[var26] = var2.method11197();
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if (var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field2531 = var9;
      this.field2535 = var10;
      this.field2547 = var11;
      this.field2532 = new int[var9];
      this.field2560 = new int[var9];
      this.field2534 = new int[var9];
      this.field2523 = new int[var10];
      this.field2524 = new int[var10];
      this.field2563 = new int[var10];
      if (var17 == 1) {
         this.field2558 = new int[var9];
      }

      if (var12 == 1) {
         this.field2559 = new byte[var10];
      }

      if (var13 == 255) {
         this.field2540 = new byte[var10];
      } else {
         this.field2550 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2541 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2533 = new int[var10];
      }

      if (var16 == 1) {
         this.field2544 = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field2549 = new byte[var10];
      }

      this.field2543 = new short[var10];
      if (var11 > 0) {
         this.field2556 = new short[var11];
         this.field2565 = new short[var11];
         this.field2551 = new short[var11];
      }

      var2.offset = var11 * -290410379;
      var3.offset = var38 * -290410379;
      var4.offset = var39 * -290410379;
      var5.offset = var40 * -290410379;
      var6.offset = var32 * -290410379;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.method11196();
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.method11211();
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.method11211();
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.method11211();
         }

         this.field2532[var51] = var48 + var53;
         this.field2560[var51] = var49 + var54;
         this.field2534[var51] = var50 + var55;
         var48 = this.field2532[var51];
         var49 = this.field2560[var51];
         var50 = this.field2534[var51];
         if (var17 == 1) {
            this.field2558[var51] = var6.method11196();
         }
      }

      var2.offset = var37 * -290410379;
      var3.offset = var28 * -290410379;
      var4.offset = var30 * -290410379;
      var5.offset = var33 * -290410379;
      var6.offset = var31 * -290410379;
      var7.offset = var35 * -290410379;
      var8.offset = var36 * -290410379;

      for(var51 = 0; var51 < var10; ++var51) {
         this.field2543[var51] = (short)var2.readUnsignedShort();
         if (var12 == 1) {
            this.field2559[var51] = var3.method11197();
         }

         if (var13 == 255) {
            this.field2540[var51] = var4.method11197();
         }

         if (var14 == 1) {
            this.field2541[var51] = var5.method11197();
         }

         if (var15 == 1) {
            this.field2533[var51] = var6.method11196();
         }

         if (var16 == 1) {
            this.field2544[var51] = (short)(var7.readUnsignedShort() - 1);
         }

         if (this.field2549 != null && this.field2544[var51] != -1) {
            this.field2549[var51] = (byte)(var8.method11196() - 1);
         }
      }

      var2.offset = var34 * -290410379;
      var3.offset = var29 * -290410379;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.method11196();
         if (var56 == 1) {
            var51 = var2.method11211() + var54;
            var52 = var2.method11211() + var51;
            var53 = var2.method11211() + var52;
            var54 = var53;
            this.field2523[var55] = var51;
            this.field2524[var55] = var52;
            this.field2563[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.method11211() + var54;
            var54 = var53;
            this.field2523[var55] = var51;
            this.field2524[var55] = var52;
            this.field2563[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.method11211() + var54;
            var54 = var53;
            this.field2523[var55] = var51;
            this.field2524[var55] = var52;
            this.field2563[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.method11211() + var54;
            var54 = var53;
            this.field2523[var55] = var51;
            this.field2524[var55] = var57;
            this.field2563[var55] = var53;
         }
      }

      var2.offset = var41 * -290410379;
      var3.offset = var42 * -290410379;
      var4.offset = var43 * -290410379;
      var5.offset = var44 * -290410379;
      var6.offset = var45 * -290410379;
      var7.offset = var46 * -290410379;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.field2548[var55] & 255;
         if (var56 == 0) {
            this.field2556[var55] = (short)var2.readUnsignedShort();
            this.field2565[var55] = (short)var2.readUnsignedShort();
            this.field2551[var55] = (short)var2.readUnsignedShort();
         }
      }

      var2.offset = var26 * -290410379;
      var55 = var2.method11196();
      if (var55 != 0) {
         new class249();
         var2.readUnsignedShort();
         var2.readUnsignedShort();
         var2.readUnsignedShort();
         var2.read32BitArray();
      }

   }

   @ObfuscatedName("al")
   void method4859(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var4 = new Buffer(var1);
      Buffer var5 = new Buffer(var1);
      Buffer var6 = new Buffer(var1);
      Buffer var7 = new Buffer(var1);
      Buffer var8 = new Buffer(var1);
      var4.offset = (var1.length - 18) * -290410379;
      int var9 = var4.readUnsignedShort();
      int var10 = var4.readUnsignedShort();
      int var11 = var4.method11196();
      int var12 = var4.method11196();
      int var13 = var4.method11196();
      int var14 = var4.method11196();
      int var15 = var4.method11196();
      int var16 = var4.method11196();
      int var17 = var4.readUnsignedShort();
      int var18 = var4.readUnsignedShort();
      int var19 = var4.readUnsignedShort();
      int var20 = var4.readUnsignedShort();
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if (var13 == 255) {
         var45 += var10;
      }

      int var25 = var45;
      if (var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if (var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if (var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if (var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.field2531 = var9;
      this.field2535 = var10;
      this.field2547 = var11;
      this.field2532 = new int[var9];
      this.field2560 = new int[var9];
      this.field2534 = new int[var9];
      this.field2523 = new int[var10];
      this.field2524 = new int[var10];
      this.field2563 = new int[var10];
      if (var11 > 0) {
         this.field2548 = new byte[var11];
         this.field2556 = new short[var11];
         this.field2565 = new short[var11];
         this.field2551 = new short[var11];
      }

      if (var16 == 1) {
         this.field2558 = new int[var9];
      }

      if (var12 == 1) {
         this.field2559 = new byte[var10];
         this.field2549 = new byte[var10];
         this.field2544 = new short[var10];
      }

      if (var13 == 255) {
         this.field2540 = new byte[var10];
      } else {
         this.field2550 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2541 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2533 = new int[var10];
      }

      this.field2543 = new short[var10];
      var4.offset = var21 * -290410379;
      var5.offset = var32 * -290410379;
      var6.offset = var33 * -290410379;
      var7.offset = var45 * -290410379;
      var8.offset = var27 * -290410379;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.method11196();
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.method11211();
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.method11211();
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.method11211();
         }

         this.field2532[var38] = var35 + var40;
         this.field2560[var38] = var36 + var41;
         this.field2534[var38] = var37 + var42;
         var35 = this.field2532[var38];
         var36 = this.field2560[var38];
         var37 = this.field2534[var38];
         if (var16 == 1) {
            this.field2558[var38] = var8.method11196();
         }
      }

      var4.offset = var30 * -290410379;
      var5.offset = var26 * -290410379;
      var6.offset = var24 * -290410379;
      var7.offset = var28 * -290410379;
      var8.offset = var25 * -290410379;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field2543[var38] = (short)var4.readUnsignedShort();
         if (var12 == 1) {
            var39 = var5.method11196();
            if ((var39 & 1) == 1) {
               this.field2559[var38] = 1;
               var2 = true;
            } else {
               this.field2559[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.field2549[var38] = (byte)(var39 >> 2);
               this.field2544[var38] = this.field2543[var38];
               this.field2543[var38] = 127;
               if (this.field2544[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field2549[var38] = -1;
               this.field2544[var38] = -1;
            }
         }

         if (var13 == 255) {
            this.field2540[var38] = var6.method11197();
         }

         if (var14 == 1) {
            this.field2541[var38] = var7.method11197();
         }

         if (var15 == 1) {
            this.field2533[var38] = var8.method11196();
         }
      }

      var4.offset = var29 * -290410379;
      var5.offset = var23 * -290410379;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.method11196();
         if (var43 == 1) {
            var38 = var4.method11211() + var41;
            var39 = var4.method11211() + var38;
            var40 = var4.method11211() + var39;
            var41 = var40;
            this.field2523[var42] = var38;
            this.field2524[var42] = var39;
            this.field2563[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.method11211() + var41;
            var41 = var40;
            this.field2523[var42] = var38;
            this.field2524[var42] = var39;
            this.field2563[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.method11211() + var41;
            var41 = var40;
            this.field2523[var42] = var38;
            this.field2524[var42] = var39;
            this.field2563[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.method11211() + var41;
            var41 = var40;
            this.field2523[var42] = var38;
            this.field2524[var42] = var44;
            this.field2563[var42] = var40;
         }
      }

      var4.offset = var31 * -290410379;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field2548[var42] = 0;
         this.field2556[var42] = (short)var4.readUnsignedShort();
         this.field2565[var42] = (short)var4.readUnsignedShort();
         this.field2551[var42] = (short)var4.readUnsignedShort();
      }

      if (this.field2549 != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field2549[var43] & 255;
            if (var44 != 255) {
               if (this.field2523[var43] == (this.field2556[var44] & '\uffff') && this.field2524[var43] == (this.field2565[var44] & '\uffff') && this.field2563[var43] == (this.field2551[var44] & '\uffff')) {
                  this.field2549[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if (!var46) {
            this.field2549 = null;
         }
      }

      if (!var3) {
         this.field2544 = null;
      }

      if (!var2) {
         this.field2559 = null;
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Liu;I)I"
   )
   final int method4903(class219 var1, int var2) {
      int var3 = -1;
      int var4 = var1.field2532[var2];
      int var5 = var1.field2560[var2];
      int var6 = var1.field2534[var2];

      for(int var7 = 0; var7 < this.field2531; ++var7) {
         if (var4 == this.field2532[var7] && var5 == this.field2560[var7] && var6 == this.field2534[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.field2532[this.field2531] = var4;
         this.field2560[this.field2531] = var5;
         this.field2534[this.field2531] = var6;
         if (var1.field2558 != null) {
            this.field2558[this.field2531] = var1.field2558[var2];
         }

         if (var1.field2542 != null) {
            this.field2542[this.field2531] = var1.field2542[var2];
            this.field2557[this.field2531] = var1.field2557[var2];
         }

         var3 = this.field2531++;
      }

      return var3;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "()Liu;"
   )
   public class219 method4838() {
      class219 var1 = new class219();
      if (this.field2559 != null) {
         var1.field2559 = new byte[this.field2535];

         for(int var2 = 0; var2 < this.field2535; ++var2) {
            var1.field2559[var2] = this.field2559[var2];
         }
      }

      var1.field2531 = this.field2531;
      var1.field2535 = this.field2535;
      var1.field2547 = this.field2547;
      var1.field2532 = this.field2532;
      var1.field2560 = this.field2560;
      var1.field2534 = this.field2534;
      var1.field2523 = this.field2523;
      var1.field2524 = this.field2524;
      var1.field2563 = this.field2563;
      var1.field2540 = this.field2540;
      var1.field2541 = this.field2541;
      var1.field2549 = this.field2549;
      var1.field2543 = this.field2543;
      var1.field2544 = this.field2544;
      var1.field2550 = this.field2550;
      var1.field2548 = this.field2548;
      var1.field2556 = this.field2556;
      var1.field2565 = this.field2565;
      var1.field2551 = this.field2551;
      var1.field2558 = this.field2558;
      var1.field2533 = this.field2533;
      var1.field2564 = this.field2564;
      var1.field2561 = this.field2561;
      var1.field2553 = this.field2553;
      var1.field2552 = this.field2552;
      var1.field2554 = this.field2554;
      var1.field2555 = this.field2555;
      var1.field2545 = this.field2545;
      return var1;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "([[IIIIZI)Liu;"
   )
   public class219 method4847(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method4855();
      int var7 = var2 + this.field2539;
      int var8 = var2 + this.field2566;
      int var9 = var4 + this.field2568;
      int var10 = var4 + this.field2567;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var3 == var1[var7][var9] && var3 == var1[var8][var9] && var3 == var1[var7][var10] && var3 == var1[var8][var10]) {
            return this;
         } else {
            class219 var11 = new class219(this, true, true, true, true);
            var11.field2560 = new int[var11.field2531];
            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.field2531; ++var12) {
                  var13 = var2 + this.field2532[var12];
                  var14 = var4 + this.field2534[var12];
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var15 * var1[var17 + 1][var18 + 1] >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field2560[var12] = var21 + this.field2560[var12] - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field2531; ++var12) {
                  var13 = (-this.field2560[var12] << 16) / super.field2801;
                  if (var13 < var6) {
                     var14 = var2 + this.field2532[var12];
                     var15 = var4 + this.field2534[var12];
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var16 * var1[var18 + 1][var19 + 1] >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field2560[var12] = (var6 - var13) * (var22 - var3) / var6 + this.field2560[var12];
                  } else {
                     var11.field2560[var12] = this.field2560[var12];
                  }
               }
            }

            var11.method4852();
            return var11;
         }
      } else {
         return this;
      }
   }

   @ObfuscatedName("an")
   public int method4840(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2531; ++var4) {
         if (this.field2532[var4] == var1 && var2 == this.field2560[var4] && var3 == this.field2534[var4]) {
            return var4;
         }
      }

      this.field2532[this.field2531] = var1;
      this.field2560[this.field2531] = var2;
      this.field2534[this.field2531] = var3;
      return this.field2531++;
   }

   @ObfuscatedName("ar")
   public int method4841(int var1, int var2, int var3, byte var4, byte var5, short var6, short var7) {
      this.field2523[this.field2535] = var1;
      this.field2524[this.field2535] = var2;
      this.field2563[this.field2535] = var3;
      this.field2559[this.field2535] = var4;
      this.field2549[this.field2535] = var5;
      this.field2543[this.field2535] = var6;
      this.field2544[this.field2535] = var7;
      return this.field2535++;
   }

   @ObfuscatedName("ae")
   void method4842() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.field2558 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field2531; ++var3) {
            var4 = this.field2558[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field2564 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field2564[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field2531; this.field2564[var4][var1[var4]++] = var3++) {
            var4 = this.field2558[var3];
         }

         this.field2558 = null;
      }

      if (this.field2533 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field2535; ++var3) {
            var4 = this.field2533[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field2561 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field2561[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field2535; this.field2561[var4][var1[var4]++] = var3++) {
            var4 = this.field2533[var3];
         }

         this.field2533 = null;
      }

   }

   @ObfuscatedName("ad")
   public void method4843() {
      for(int var1 = 0; var1 < this.field2531; ++var1) {
         int var2 = this.field2532[var1];
         this.field2532[var1] = this.field2534[var1];
         this.field2534[var1] = -var2;
      }

      this.method4852();
   }

   @ObfuscatedName("ag")
   public void method4862() {
      for(int var1 = 0; var1 < this.field2531; ++var1) {
         this.field2532[var1] = -this.field2532[var1];
         this.field2534[var1] = -this.field2534[var1];
      }

      this.method4852();
   }

   @ObfuscatedName("av")
   public void method4901() {
      for(int var1 = 0; var1 < this.field2531; ++var1) {
         int var2 = this.field2534[var1];
         this.field2534[var1] = this.field2532[var1];
         this.field2532[var1] = -var2;
      }

      this.method4852();
   }

   @ObfuscatedName("ah")
   public void method4835(int var1) {
      int var2 = field2529[var1];
      int var3 = field2530[var1];

      for(int var4 = 0; var4 < this.field2531; ++var4) {
         int var5 = var2 * this.field2534[var4] + var3 * this.field2532[var4] >> 16;
         this.field2534[var4] = var3 * this.field2534[var4] - var2 * this.field2532[var4] >> 16;
         this.field2532[var4] = var5;
      }

      this.method4852();
   }

   @ObfuscatedName("ab")
   public void method4846(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2531; ++var4) {
         int[] var10000 = this.field2532;
         var10000[var4] += var1;
         var10000 = this.field2560;
         var10000[var4] += var2;
         var10000 = this.field2534;
         var10000[var4] += var3;
      }

      this.method4852();
   }

   @ObfuscatedName("ax")
   public void method4844(short var1, short var2) {
      for(int var3 = 0; var3 < this.field2535; ++var3) {
         if (this.field2543[var3] == var1) {
            this.field2543[var3] = var2;
         }
      }

   }

   @ObfuscatedName("ak")
   public void method4849(short var1, short var2) {
      if (this.field2544 != null) {
         for(int var3 = 0; var3 < this.field2535; ++var3) {
            if (this.field2544[var3] == var1) {
               this.field2544[var3] = var2;
            }
         }

      }
   }

   @ObfuscatedName("aj")
   public void method4853() {
      int var1;
      for(var1 = 0; var1 < this.field2531; ++var1) {
         this.field2534[var1] = -this.field2534[var1];
      }

      for(var1 = 0; var1 < this.field2535; ++var1) {
         int var2 = this.field2523[var1];
         this.field2523[var1] = this.field2563[var1];
         this.field2563[var1] = var2;
      }

      this.method4852();
   }

   @ObfuscatedName("az")
   public void method4848(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2531; ++var4) {
         this.field2532[var4] = this.field2532[var4] * var1 / 128;
         this.field2560[var4] = var2 * this.field2560[var4] / 128;
         this.field2534[var4] = var3 * this.field2534[var4] / 128;
      }

      this.method4852();
   }

   @ObfuscatedName("bt")
   public void method4851() {
      if (this.field2553 == null) {
         this.field2553 = new class243[this.field2531];

         int var1;
         for(var1 = 0; var1 < this.field2531; ++var1) {
            this.field2553[var1] = new class243();
         }

         for(var1 = 0; var1 < this.field2535; ++var1) {
            int var2 = this.field2523[var1];
            int var3 = this.field2524[var1];
            int var4 = this.field2563[var1];
            int var5 = this.field2532[var3] - this.field2532[var2];
            int var6 = this.field2560[var3] - this.field2560[var2];
            int var7 = this.field2534[var3] - this.field2534[var2];
            int var8 = this.field2532[var4] - this.field2532[var2];
            int var9 = this.field2560[var4] - this.field2560[var2];
            int var10 = this.field2534[var4] - this.field2534[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.field2559 == null) {
               var15 = 0;
            } else {
               var15 = this.field2559[var1];
            }

            if (var15 == 0) {
               class243 var16 = this.field2553[var2];
               var16.field2975 += var11;
               var16.field2973 += var12;
               var16.field2972 += var13;
               ++var16.field2974;
               var16 = this.field2553[var3];
               var16.field2975 += var11;
               var16.field2973 += var12;
               var16.field2972 += var13;
               ++var16.field2974;
               var16 = this.field2553[var4];
               var16.field2975 += var11;
               var16.field2973 += var12;
               var16.field2972 += var13;
               ++var16.field2974;
            } else if (var15 == 1) {
               if (this.field2552 == null) {
                  this.field2552 = new class234[this.field2535];
               }

               class234 var17 = this.field2552[var1] = new class234();
               var17.field2803 = var11;
               var17.field2806 = var12;
               var17.field2804 = var13;
            }
         }

      }
   }

   @ObfuscatedName("bs")
   void method4852() {
      this.field2553 = null;
      this.field2562 = null;
      this.field2552 = null;
      this.field2546 = false;
   }

   @ObfuscatedName("bu")
   void method4855() {
      if (!this.field2546) {
         super.field2801 = 0;
         this.field2537 = 0;
         this.field2539 = 999999;
         this.field2566 = -999999;
         this.field2567 = -99999;
         this.field2568 = 99999;

         for(int var1 = 0; var1 < this.field2531; ++var1) {
            int var2 = this.field2532[var1];
            int var3 = this.field2560[var1];
            int var4 = this.field2534[var1];
            if (var2 < this.field2539) {
               this.field2539 = var2;
            }

            if (var2 > this.field2566) {
               this.field2566 = var2;
            }

            if (var4 < this.field2568) {
               this.field2568 = var4;
            }

            if (var4 > this.field2567) {
               this.field2567 = var4;
            }

            if (-var3 > super.field2801) {
               super.field2801 = -var3;
            }

            if (var3 > this.field2537) {
               this.field2537 = var3;
            }
         }

         this.field2546 = true;
      }
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(IIIII)Ljn;"
   )
   public final class241 method4854(int var1, int var2, int var3, int var4, int var5) {
      this.method4851();
      int var6 = (int)Math.sqrt((double)(var5 * var5 + var3 * var3 + var4 * var4));
      int var7 = var6 * var2 >> 8;
      class241 var8 = new class241();
      var8.field2926 = new int[this.field2535];
      var8.field2905 = new int[this.field2535];
      var8.field2928 = new int[this.field2535];
      if (this.field2547 > 0 && this.field2549 != null) {
         int[] var9 = new int[this.field2547];

         int var10;
         for(var10 = 0; var10 < this.field2535; ++var10) {
            if (this.field2549[var10] != -1) {
               ++var9[this.field2549[var10] & 255];
            }
         }

         var8.field2904 = 0;

         for(var10 = 0; var10 < this.field2547; ++var10) {
            if (var9[var10] > 0 && this.field2548[var10] == 0) {
               ++var8.field2904;
            }
         }

         var8.field2909 = new int[var8.field2904];
         var8.field2935 = new int[var8.field2904];
         var8.field2907 = new int[var8.field2904];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field2547; ++var11) {
            if (var9[var11] > 0 && this.field2548[var11] == 0) {
               var8.field2909[var10] = this.field2556[var11] & '\uffff';
               var8.field2935[var10] = this.field2565[var11] & '\uffff';
               var8.field2907[var10] = this.field2551[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field2875 = new byte[this.field2535];

         for(var11 = 0; var11 < this.field2535; ++var11) {
            if (this.field2549[var11] != -1) {
               var8.field2875[var11] = (byte)var9[this.field2549[var11] & 255];
            } else {
               var8.field2875[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.field2535; ++var16) {
         byte var17;
         if (this.field2559 == null) {
            var17 = 0;
         } else {
            var17 = this.field2559[var16];
         }

         byte var18;
         if (this.field2541 == null) {
            var18 = 0;
         } else {
            var18 = this.field2541[var16];
         }

         short var12;
         if (this.field2544 == null) {
            var12 = -1;
         } else {
            var12 = this.field2544[var16];
         }

         if (var18 == -2) {
            var17 = 3;
         }

         if (var18 == -1) {
            var17 = 2;
         }

         class243 var13;
         int var14;
         class234 var19;
         if (var12 == -1) {
            if (var17 != 0) {
               if (var17 == 1) {
                  var19 = this.field2552[var16];
                  var14 = (var4 * var19.field2806 + var5 * var19.field2804 + var3 * var19.field2803) / (var7 / 2 + var7) + var1;
                  var8.field2926[var16] = method4832(this.field2543[var16] & '\uffff', var14);
                  var8.field2928[var16] = -1;
               } else if (var17 == 3) {
                  var8.field2926[var16] = 128;
                  var8.field2928[var16] = -1;
               } else {
                  var8.field2928[var16] = -2;
               }
            } else {
               int var15 = this.field2543[var16] & '\uffff';
               if (this.field2562 != null && this.field2562[this.field2523[var16]] != null) {
                  var13 = this.field2562[this.field2523[var16]];
               } else {
                  var13 = this.field2553[this.field2523[var16]];
               }

               var14 = (var4 * var13.field2973 + var5 * var13.field2972 + var3 * var13.field2975) / (var7 * var13.field2974) + var1;
               var8.field2926[var16] = method4832(var15, var14);
               if (this.field2562 != null && this.field2562[this.field2524[var16]] != null) {
                  var13 = this.field2562[this.field2524[var16]];
               } else {
                  var13 = this.field2553[this.field2524[var16]];
               }

               var14 = (var4 * var13.field2973 + var5 * var13.field2972 + var3 * var13.field2975) / (var7 * var13.field2974) + var1;
               var8.field2905[var16] = method4832(var15, var14);
               if (this.field2562 != null && this.field2562[this.field2563[var16]] != null) {
                  var13 = this.field2562[this.field2563[var16]];
               } else {
                  var13 = this.field2553[this.field2563[var16]];
               }

               var14 = (var4 * var13.field2973 + var5 * var13.field2972 + var3 * var13.field2975) / (var7 * var13.field2974) + var1;
               var8.field2928[var16] = method4832(var15, var14);
            }
         } else if (var17 != 0) {
            if (var17 == 1) {
               var19 = this.field2552[var16];
               var14 = (var4 * var19.field2806 + var5 * var19.field2804 + var3 * var19.field2803) / (var7 / 2 + var7) + var1;
               var8.field2926[var16] = method4887(var14);
               var8.field2928[var16] = -1;
            } else {
               var8.field2928[var16] = -2;
            }
         } else {
            if (this.field2562 != null && this.field2562[this.field2523[var16]] != null) {
               var13 = this.field2562[this.field2523[var16]];
            } else {
               var13 = this.field2553[this.field2523[var16]];
            }

            var14 = (var4 * var13.field2973 + var5 * var13.field2972 + var3 * var13.field2975) / (var7 * var13.field2974) + var1;
            var8.field2926[var16] = method4887(var14);
            if (this.field2562 != null && this.field2562[this.field2524[var16]] != null) {
               var13 = this.field2562[this.field2524[var16]];
            } else {
               var13 = this.field2553[this.field2524[var16]];
            }

            var14 = (var4 * var13.field2973 + var5 * var13.field2972 + var3 * var13.field2975) / (var7 * var13.field2974) + var1;
            var8.field2905[var16] = method4887(var14);
            if (this.field2562 != null && this.field2562[this.field2563[var16]] != null) {
               var13 = this.field2562[this.field2563[var16]];
            } else {
               var13 = this.field2553[this.field2563[var16]];
            }

            var14 = (var4 * var13.field2973 + var5 * var13.field2972 + var3 * var13.field2975) / (var7 * var13.field2974) + var1;
            var8.field2928[var16] = method4887(var14);
         }
      }

      this.method4842();
      var8.field2918 = this.field2531;
      var8.field2919 = this.field2532;
      var8.field2887 = this.field2560;
      var8.field2921 = this.field2534;
      var8.field2908 = this.field2535;
      var8.field2936 = this.field2523;
      var8.field2924 = this.field2524;
      var8.field2933 = this.field2563;
      var8.field2929 = this.field2540;
      var8.field2923 = this.field2541;
      var8.field2934 = this.field2550;
      var8.field2946 = this.field2564;
      var8.field2948 = this.field2561;
      var8.field2932 = this.field2544;
      var8.field2939 = this.field2542;
      var8.field2938 = this.field2557;
      var8.field2944 = this.field2545;
      return var8;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpx;II)Liu;"
   )
   public static class219 method4830(class412 var0, int var1, int var2) {
      byte[] var3 = var0.method8335(var1, var2);
      return var3 == null ? null : new class219(var3);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Liu;Liu;IIIZ)V"
   )
   static void method4831(class219 var0, class219 var1, int var2, int var3, int var4, boolean var5) {
      var0.method4855();
      var0.method4851();
      var1.method4855();
      var1.method4851();
      ++field2528;
      int var6 = 0;
      int[] var7 = var1.field2532;
      int var8 = var1.field2531;

      int var9;
      for(var9 = 0; var9 < var0.field2531; ++var9) {
         class243 var10 = var0.field2553[var9];
         if (var10.field2974 != 0) {
            int var11 = var0.field2560[var9] - var3;
            if (var11 <= var1.field2537) {
               int var12 = var0.field2532[var9] - var2;
               if (var12 >= var1.field2539 && var12 <= var1.field2566) {
                  int var13 = var0.field2534[var9] - var4;
                  if (var13 >= var1.field2568 && var13 <= var1.field2567) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        class243 var15 = var1.field2553[var14];
                        if (var12 == var7[var14] && var13 == var1.field2534[var14] && var11 == var1.field2560[var14] && var15.field2974 != 0) {
                           if (var0.field2562 == null) {
                              var0.field2562 = new class243[var0.field2531];
                           }

                           if (var1.field2562 == null) {
                              var1.field2562 = new class243[var8];
                           }

                           class243 var16 = var0.field2562[var9];
                           if (var16 == null) {
                              var16 = var0.field2562[var9] = new class243(var10);
                           }

                           class243 var17 = var1.field2562[var14];
                           if (var17 == null) {
                              var17 = var1.field2562[var14] = new class243(var15);
                           }

                           var16.field2975 += var15.field2975;
                           var16.field2973 += var15.field2973;
                           var16.field2972 += var15.field2972;
                           var16.field2974 += var15.field2974;
                           var17.field2975 += var10.field2975;
                           var17.field2973 += var10.field2973;
                           var17.field2972 += var10.field2972;
                           var17.field2974 += var10.field2974;
                           ++var6;
                           field2526[var9] = field2528;
                           field2536[var14] = field2528;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.field2535; ++var9) {
            if (field2526[var0.field2523[var9]] == field2528 && field2526[var0.field2524[var9]] == field2528 && field2526[var0.field2563[var9]] == field2528) {
               if (var0.field2559 == null) {
                  var0.field2559 = new byte[var0.field2535];
               }

               var0.field2559[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.field2535; ++var9) {
            if (field2528 == field2536[var1.field2523[var9]] && field2528 == field2536[var1.field2524[var9]] && field2528 == field2536[var1.field2563[var9]]) {
               if (var1.field2559 == null) {
                  var1.field2559 = new byte[var1.field2535];
               }

               var1.field2559[var9] = 2;
            }
         }

      }
   }

   @ObfuscatedName("ac")
   static final int method4832(int var0, int var1) {
      var1 = (var0 & 127) * var1 >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   @ObfuscatedName("ap")
   static final int method4887(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }
}
