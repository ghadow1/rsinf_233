package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public class class124 extends class500 {
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1006641339
   )
   static int field1569;
   @ObfuscatedName("ay")
   static int[] field1568;
   @ObfuscatedName("af")
   final boolean field1570;

   public class124(boolean var1) {
      this.field1570 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lty;Lty;I)I",
      garbageValue = "1752275061"
   )
   int method3550(class503 var1, class503 var2) {
      if (var1.field5411 != 0 && var2.field5411 != 0) {
         return this.field1570 ? var1.field5410 - var2.field5410 : var2.field5410 - var1.field5410;
      } else {
         return this.method9964(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method3550((class503)var1, (class503)var2);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ldr;[BIIIIIIIIII)V",
      garbageValue = "214421375"
   )
   static final void method3545(class79 var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      class275[] var11 = var0.field1175;
      int var13;
      int var14;
      if (var11 != null && var2 >= 0 && var2 < var11.length) {
         class275 var12 = var11[var2];

         for(var13 = var3; var13 < var3 + 8; ++var13) {
            for(var14 = var4; var14 < var4 + 8; ++var14) {
               if (var12.method6174(var13, var14)) {
                  var12.method6173(var13, var14, 1073741824);
               }
            }
         }
      }

      Buffer var25 = new Buffer(var1);

      int var15;
      int var16;
      for(var13 = 0; var13 < 4; ++var13) {
         for(var14 = 0; var14 < 64; ++var14) {
            for(var15 = 0; var15 < 64; ++var15) {
               if (var5 == var13 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
                  var16 = var3 + class264.method5949(var14 & 7, var15 & 7, var8);
                  int var19 = var14 & 7;
                  int var20 = var15 & 7;
                  int var21 = var8 & 3;
                  int var18;
                  if (var21 == 0) {
                     var18 = var20;
                  } else if (var21 == 1) {
                     var18 = 7 - var19;
                  } else if (var21 == 2) {
                     var18 = 7 - var20;
                  } else {
                     var18 = var19;
                  }

                  int var22 = var4 + var18;
                  int var23 = var3 + (var14 & 7) + var9;
                  int var24 = var10 + (var15 & 7) + var4;
                  class144.method3741(var0, var25, var2, var16, var22, var23, var24, var8);
               } else {
                  class144.method3741(var0, var25, 0, -1, -1, 0, 0, 0);
               }
            }
         }
      }

      var13 = var25.offset * 1216585693 < var25.array.length ? var25.method11196() : 0;
      boolean var26 = (var13 & 1) != 0;
      if (var26) {
         for(var15 = 0; var15 < 64; ++var15) {
            for(var16 = 0; var16 < 64; ++var16) {
               class190.method4307(var25);
            }
         }
      }

   }

   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      descriptor = "(ZLwf;B)V",
      garbageValue = "0"
   )
   static final void method3552(boolean var0, PacketBuffer var1) {
      client.field473 = var0;
      int var2;
      int var3;
      int var5;
      int var6;
      int var7;
      if (!client.field473) {
         var1.method11452();
         var2 = var1.method11181();
         var3 = var1.readUnsignedShort();
         int var4 = var1.readUnsignedShort();
         class267.field3170 = new int[var4][4];

         for(var5 = 0; var5 < var4; ++var5) {
            for(var6 = 0; var6 < 4; ++var6) {
               class267.field3170[var5][var6] = var1.read32BitArray();
            }
         }

         class405.field4880 = new int[var4];
         class215.field2463 = new int[var4];
         class386.field4415 = new int[var4];
         class119.field1553 = new byte[var4][];
         class185.field2014 = new byte[var4][];
         var4 = 0;

         for(var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
            for(var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
               var7 = var6 + (var5 << 8);
               class405.field4880[var4] = var7;
               class215.field2463[var4] = class149.field1760.method8361("m" + var5 + "_" + var6);
               class386.field4415[var4] = class149.field1760.method8361("l" + var5 + "_" + var6);
               ++var4;
            }
         }

         class364.method7522(var2, var3, true);
      } else {
         var2 = var1.method11422();
         var3 = var1.method11181();
         boolean var15 = var1.method11232() == 1;
         var5 = var1.readUnsignedShort();
         var1.method11145();

         int var8;
         int var9;
         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = var1.method11146(1);
                  if (var9 == 1) {
                     client.field447[var6][var7][var8] = var1.method11146(26);
                  } else {
                     client.field447[var6][var7][var8] = -1;
                  }
               }
            }
         }

         var1.method11147();
         class267.field3170 = new int[var5][4];

         for(var6 = 0; var6 < var5; ++var6) {
            for(var7 = 0; var7 < 4; ++var7) {
               class267.field3170[var6][var7] = var1.read32BitArray();
            }
         }

         class405.field4880 = new int[var5];
         class215.field2463 = new int[var5];
         class386.field4415 = new int[var5];
         class119.field1553 = new byte[var5][];
         class185.field2014 = new byte[var5][];
         var5 = 0;

         for(var6 = 0; var6 < 4; ++var6) {
            for(var7 = 0; var7 < 13; ++var7) {
               for(var8 = 0; var8 < 13; ++var8) {
                  var9 = client.field447[var6][var7][var8];
                  if (var9 != -1) {
                     int var10 = class253.method5796(var9);
                     int var11 = class34.method689(var9);
                     int var12 = (var10 / 8 << 8) + var11 / 8;

                     int var13;
                     for(var13 = 0; var13 < var5; ++var13) {
                        if (class405.field4880[var13] == var12) {
                           var12 = -1;
                           break;
                        }
                     }

                     if (var12 != -1) {
                        class405.field4880[var5] = var12;
                        var13 = var12 >> 8 & 255;
                        int var14 = var12 & 255;
                        class215.field2463[var5] = class149.field1760.method8361("m" + var13 + "_" + var14);
                        class386.field4415[var5] = class149.field1760.method8361("l" + var13 + "_" + var14);
                        ++var5;
                     }
                  }
               }
            }
         }

         class364.method7522(var2, var3, !var15);
      }

   }
}
