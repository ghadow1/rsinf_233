package game;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
public class class88 {
   @ObfuscatedName("at")
   final int[] field1243 = new int[2048];
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "[Lbj;"
   )
   final class47[] field1255 = new class47[2048];
   @ObfuscatedName("ap")
   final boolean[] field1245 = new boolean[2048];
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "[Lko;"
   )
   final class280[] field1246 = new class280[2048];
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lwb;"
   )
   final class590 field1244 = new class590(new byte[5000]);
   @ObfuscatedName("as")
   final String[] field1253 = new String[3];
   @ObfuscatedName("al")
   final int[] field1249 = new int[2048];
   @ObfuscatedName("au")
   final int[] field1250 = new int[2048];
   @ObfuscatedName("ai")
   final int[] field1241 = new int[2048];
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1051146723
   )
   int field1254 = 0;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1620592231
   )
   int field1252 = 0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1217040787
   )
   int field1248 = 0;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1867100379
   )
   int field1251 = 0;

   class88() {
      for(int var1 = 0; var1 < 2048; ++var1) {
         this.field1255[var1] = new class47(var1);
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwf;I)V",
      garbageValue = "-2021556636"
   )
   final void method2850(class589 var1) {
      this.method2847();
      var1.method11145();
      int var2 = client.field491;
      class47 var3 = this.field1255[var2];
      int var4 = var1.method11146(30);
      var3.method1806(-1);
      var3.field675.method7470(var4);
      var3.field676 = 0;
      class69 var5 = var3.method1781(var2, class333.field3836);
      var3.method1778(var5);
      class333.field3836.field1169.method8558(var5, (long)var2);
      class76.field1108 = var5;
      this.field1254 = 0;
      this.field1243[++this.field1254 - 1] = var2;
      this.field1252 = 0;

      for(int var6 = 1; var6 < 2048; ++var6) {
         if (var6 != var2) {
            int var7 = var1.method11146(18);
            int var8 = var7 >> 16;
            int var9 = var7 >> 8 & 255;
            int var10 = var7 & 255;
            this.field1255[var6].method1806(class356.method7461(var8, var9, var10));
            this.field1249[++this.field1252 - 1] = var6;
         }
      }

      var1.method11147();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lwf;II)V",
      garbageValue = "-576307041"
   )
   final void method2854(class589 var1, int var2) {
      int var3 = var1.buffer * 1216585693;
      this.field1251 = 0;
      this.method2837(var1);
      this.method2841();
      this.method2842();
      this.method2843(var1);
      this.method2844();
      if (var2 != var1.buffer * 1216585693 - var3) {
         throw new RuntimeException(var1.buffer * 1216585693 - var3 + " " + var2);
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lwf;I)V",
      garbageValue = "-1934537235"
   )
   void method2837(class589 var1) {
      this.field1248 = 0;
      int var2 = 0;
      var1.method11145();

      class47 var10000;
      int var3;
      int var4;
      int var5;
      for(var3 = 0; var3 < this.field1254; ++var3) {
         var4 = this.field1243[var3];
         if ((this.field1255[var4].field676 & 1) == 0) {
            if (var2 > 0) {
               --var2;
               var10000 = this.field1255[var4];
               var10000.field676 = (byte)(var10000.field676 | 2);
            } else {
               var5 = var1.method11146(1);
               if (var5 == 0) {
                  var2 = this.method2853(var1);
                  var10000 = this.field1255[var4];
                  var10000.field676 = (byte)(var10000.field676 | 2);
               } else {
                  this.method2839(var1, var4);
               }
            }
         }
      }

      var1.method11147();
      if (var2 != 0) {
         throw new RuntimeException();
      } else {
         var1.method11145();

         for(var3 = 0; var3 < this.field1254; ++var3) {
            var4 = this.field1243[var3];
            if ((this.field1255[var4].field676 & 1) != 0) {
               if (var2 > 0) {
                  --var2;
                  var10000 = this.field1255[var4];
                  var10000.field676 = (byte)(var10000.field676 | 2);
               } else {
                  var5 = var1.method11146(1);
                  if (var5 == 0) {
                     var2 = this.method2853(var1);
                     var10000 = this.field1255[var4];
                     var10000.field676 = (byte)(var10000.field676 | 2);
                  } else {
                     this.method2839(var1, var4);
                  }
               }
            }
         }

         var1.method11147();
         if (var2 != 0) {
            throw new RuntimeException();
         } else {
            var1.method11145();

            for(var3 = 0; var3 < this.field1252; ++var3) {
               var4 = this.field1249[var3];
               if ((this.field1255[var4].field676 & 1) != 0) {
                  if (var2 > 0) {
                     --var2;
                     var10000 = this.field1255[var4];
                     var10000.field676 = (byte)(var10000.field676 | 2);
                  } else {
                     var5 = var1.method11146(1);
                     if (var5 == 0) {
                        var2 = this.method2853(var1);
                        var10000 = this.field1255[var4];
                        var10000.field676 = (byte)(var10000.field676 | 2);
                     } else if (this.method2840(var1, var4)) {
                        var10000 = this.field1255[var4];
                        var10000.field676 = (byte)(var10000.field676 | 2);
                     }
                  }
               }
            }

            var1.method11147();
            if (var2 != 0) {
               throw new RuntimeException();
            } else {
               var1.method11145();

               for(var3 = 0; var3 < this.field1252; ++var3) {
                  var4 = this.field1249[var3];
                  if ((this.field1255[var4].field676 & 1) == 0) {
                     if (var2 > 0) {
                        --var2;
                        var10000 = this.field1255[var4];
                        var10000.field676 = (byte)(var10000.field676 | 2);
                     } else {
                        var5 = var1.method11146(1);
                        if (var5 == 0) {
                           var2 = this.method2853(var1);
                           var10000 = this.field1255[var4];
                           var10000.field676 = (byte)(var10000.field676 | 2);
                        } else if (this.method2840(var1, var4)) {
                           var10000 = this.field1255[var4];
                           var10000.field676 = (byte)(var10000.field676 | 2);
                        }
                     }
                  }
               }

               var1.method11147();
               if (var2 != 0) {
                  throw new RuntimeException();
               } else {
                  this.field1254 = 0;
                  this.field1252 = 0;

                  for(var3 = 1; var3 < 2048; ++var3) {
                     var10000 = this.field1255[var3];
                     var10000.field676 = (byte)(var10000.field676 >> 1);
                     if (this.field1255[var3].method1857()) {
                        this.field1243[++this.field1254 - 1] = var3;
                     } else {
                        this.field1249[++this.field1252 - 1] = var3;
                     }
                  }

               }
            }
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lwf;B)I",
      garbageValue = "-113"
   )
   int method2853(class589 var1) {
      int var2 = var1.method11146(2);
      int var3;
      if (var2 == 0) {
         var3 = 0;
      } else if (var2 == 1) {
         var3 = var1.method11146(5);
      } else if (var2 == 2) {
         var3 = var1.method11146(8);
      } else {
         var3 = var1.method11146(11);
      }

      return var3;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lwf;IB)V",
      garbageValue = "-10"
   )
   void method2839(class589 var1, int var2) {
      boolean var3 = var1.method11146(1) == 1;
      if (var3) {
         this.field1241[++this.field1251 - 1] = var2;
      }

      int var4 = var1.method11146(2);
      class47 var5 = this.field1255[var2];
      if (var4 == 0) {
         if (var3) {
            this.field1245[var2] = false;
         } else if (var2 == client.field491) {
            throw new RuntimeException();
         } else {
            var5.method1783();
            if (var1.method11146(1) != 0) {
               this.method2840(var1, var2);
            }

            this.field1250[++this.field1248 - 1] = var2;
         }
      } else {
         int var6;
         class356 var12;
         if (var4 == 1) {
            var6 = var1.method11146(3);
            var12 = var5.field675;
            if (var6 == 0) {
               --var12.field4026;
               --var12.field4025;
            } else if (var6 == 1) {
               --var12.field4025;
            } else if (var6 == 2) {
               ++var12.field4026;
               --var12.field4025;
            } else if (var6 == 3) {
               --var12.field4026;
            } else if (var6 == 4) {
               ++var12.field4026;
            } else if (var6 == 5) {
               --var12.field4026;
               ++var12.field4025;
            } else if (var6 == 6) {
               ++var12.field4025;
            } else if (var6 == 7) {
               ++var12.field4026;
               ++var12.field4025;
            }

            this.field1245[var2] = true;
            this.field1246[var2] = var5.field677;
         } else if (var4 == 2) {
            var6 = var1.method11146(4);
            var12 = var5.field675;
            if (var6 == 0) {
               var12.field4026 -= 2;
               var12.field4025 -= 2;
            } else if (var6 == 1) {
               --var12.field4026;
               var12.field4025 -= 2;
            } else if (var6 == 2) {
               var12.field4025 -= 2;
            } else if (var6 == 3) {
               ++var12.field4026;
               var12.field4025 -= 2;
            } else if (var6 == 4) {
               var12.field4026 += 2;
               var12.field4025 -= 2;
            } else if (var6 == 5) {
               var12.field4026 -= 2;
               --var12.field4025;
            } else if (var6 == 6) {
               var12.field4026 += 2;
               --var12.field4025;
            } else if (var6 == 7) {
               var12.field4026 -= 2;
            } else if (var6 == 8) {
               var12.field4026 += 2;
            } else if (var6 == 9) {
               var12.field4026 -= 2;
               ++var12.field4025;
            } else if (var6 == 10) {
               var12.field4026 += 2;
               ++var12.field4025;
            } else if (var6 == 11) {
               var12.field4026 -= 2;
               var12.field4025 += 2;
            } else if (var6 == 12) {
               --var12.field4026;
               var12.field4025 += 2;
            } else if (var6 == 13) {
               var12.field4025 += 2;
            } else if (var6 == 14) {
               ++var12.field4026;
               var12.field4025 += 2;
            } else if (var6 == 15) {
               var12.field4026 += 2;
               var12.field4025 += 2;
            }

            this.field1245[var2] = true;
            this.field1246[var2] = var5.field677;
         } else {
            var6 = var1.method11146(1);
            int var7;
            int var8;
            int var9;
            int var10;
            class356 var11;
            if (var6 == 0) {
               var7 = var1.method11146(12);
               var8 = var7 >> 10;
               var9 = var7 >> 5 & 31;
               if (var9 > 15) {
                  var9 -= 32;
               }

               var10 = var7 & 31;
               if (var10 > 15) {
                  var10 -= 32;
               }

               var11 = var5.field675;
               var11.field4027 = (byte)(var8 + var11.field4027 & 3);
               var11.field4026 += var9;
               var11.field4025 += var10;
               this.field1245[var2] = true;
               this.field1246[var2] = var5.field677;
            } else {
               var7 = var1.method11146(30);
               var8 = class356.method7413(var7);
               var9 = class356.method7424(var7);
               var10 = class356.method7415(var7);
               var11 = var5.field675;
               var11.field4027 = (byte)(var8 + var11.field4027 & 3);
               var11.field4026 = var9 + var11.field4026 & 16383;
               var11.field4025 = var10 + var11.field4025 & 16383;
               this.field1245[var2] = true;
               this.field1246[var2] = var5.field677;
            }
         }
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lwf;II)Z",
      garbageValue = "-1394544541"
   )
   boolean method2840(class589 var1, int var2) {
      class47 var3 = this.field1255[var2];
      int var4 = var1.method11146(2);
      int var5;
      int var6;
      if (var4 == 0) {
         if (var1.method11146(1) != 0) {
            this.method2840(var1, var2);
         }

         var5 = var1.method11146(13);
         var6 = var1.method11146(13);
         boolean var13 = var1.method11146(1) == 1;
         if (var13) {
            this.field1241[++this.field1251 - 1] = var2;
         }

         if (var3.method1857()) {
            throw new RuntimeException();
         } else {
            var3.method1784(var5, var6);
            this.field1245[var2] = false;
            return true;
         }
      } else {
         int var7;
         if (var4 == 1) {
            var5 = var1.method11146(2);
            var6 = var3.field674;
            var7 = class356.method7413(var6) + var5 & 3;
            var3.method1819(var7);
            var3.field674 = (var6 & 268435455) + (var7 << 28);
            return false;
         } else {
            int var8;
            int var9;
            int var10;
            int var11;
            if (var4 == 2) {
               var5 = var1.method11146(5);
               var6 = var5 >> 3;
               var7 = var5 & 7;
               var8 = var3.field674;
               var9 = class356.method7413(var8) + var6 & 3;
               var10 = var8 >> 14 & 255;
               var11 = var8 & 255;
               if (var7 == 0) {
                  --var10;
                  --var11;
               }

               if (var7 == 1) {
                  --var11;
               }

               if (var7 == 2) {
                  ++var10;
                  --var11;
               }

               if (var7 == 3) {
                  --var10;
               }

               if (var7 == 4) {
                  ++var10;
               }

               if (var7 == 5) {
                  --var10;
                  ++var11;
               }

               if (var7 == 6) {
                  ++var11;
               }

               if (var7 == 7) {
                  ++var10;
                  ++var11;
               }

               var3.method1819(var9);
               var3.field674 = class356.method7461(var9, var10, var11);
               return false;
            } else {
               var5 = var1.method11146(18);
               var6 = var5 >> 16;
               var7 = var5 >> 8 & 255;
               var8 = var5 & 255;
               var9 = var3.field674;
               var10 = class356.method7413(var9) + var6 & 3;
               var3.method1819(var10);
               var11 = class356.method7424(var9) + var7 & 255;
               int var12 = class356.method7415(var9) + var8 & 255;
               var3.field674 = class356.method7461(var3.method1785(), var11, var12);
               return false;
            }
         }
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1006641339"
   )
   void method2841() {
      for(int var1 = 0; var1 < this.field1248; ++var1) {
         int var2 = this.field1250[var1];
         class47 var3 = this.field1255[var2];
         Iterator var4 = client.field333.iterator();

         while(var4.hasNext()) {
            class79 var5 = (class79)var4.next();
            class69 var6 = (class69)var5.field1169.method8567((long)var2);
            if (var6 != null) {
               var3.method1779(var6);
               var6.method10551();
            }
         }

         var3.method1805();
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "82"
   )
   void method2842() {
      client.field346 = -1;

      label69:
      for(int var1 = 0; var1 < this.field1254; ++var1) {
         int var2 = this.field1243[var1];
         class47 var3 = this.field1255[var2];
         class356 var4 = var3.field675;
         Iterator var5 = client.field333.iterator();

         while(true) {
            while(true) {
               if (!var5.hasNext()) {
                  continue label69;
               }

               class79 var6 = (class79)var5.next();
               class69 var7 = (class69)var6.field1169.method8567((long)var2);
               boolean var8 = var4.field4026 > var6.field1164 && var4.field4025 > var6.field1165 && var4.field4026 < var6.field1164 + var6.field1162 && var4.field4025 < var6.field1165 + var6.field1163;
               if (var2 == client.field491 && var8 && var6.field1172 != -1) {
                  client.field346 = var6.field1172;
               }

               if (var8 && var7 == null) {
                  var7 = var3.method1781(var2, var6);
                  var3.method1778(var7);
                  var6.field1169.method8558(var7, (long)var2);
               } else if (!var8 && var7 != null && var7 != class76.field1108) {
                  var3.method1779(var7);
                  var7.method10551();
               }
            }
         }
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lwf;I)V",
      garbageValue = "722011276"
   )
   void method2843(class589 var1) {
      for(int var2 = 0; var2 < this.field1251; ++var2) {
         int var3 = this.field1241[var2];
         int var4 = var1.method11196();
         if ((var4 & 2) != 0) {
            var4 += var1.method11196() << 8;
         }

         if ((var4 & 16384) != 0) {
            var4 += var1.method11196() << 16;
         }

         this.method2858(var1, var3, var4);
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   void method2844() {
      for(int var1 = 0; var1 < this.field1254; ++var1) {
         int var2 = this.field1243[var1];
         if (this.field1245[var2]) {
            class47 var3 = this.field1255[var2];
            var3.method1817(this.field1246[var2]);
            this.field1245[var2] = false;
         }
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Lwf;III)V",
      garbageValue = "-290410379"
   )
   void method2858(class589 var1, int var2, int var3) {
      class47 var4 = this.field1255[var2];
      int var5 = Integer.MAX_VALUE;
      int var6;
      int var7;
      if ((var3 & 1) != 0) {
         var6 = var1.method11181();
         if (var6 == 65535) {
            var6 = -1;
         }

         var7 = var1.method11232();
         var4.method1829(var6, var7);
      }

      int var8;
      int var11;
      if ((var3 & 2048) != 0) {
         var6 = var1.method11241();
         var7 = var6 >> 8;
         var8 = var7 >= 13 && var7 <= 20 ? var7 - 12 : 0;
         class397 var9 = (class397)class173.method4100(class446.method8926(), var1.method11196());
         boolean var10 = var1.method11281() == 1;
         var11 = var1.method11232();
         this.field1244.buffer = 0;
         var1.method11255(this.field1244.index, 0, var11);
         this.field1244.buffer = 0;
         String var12 = class465.method9500(class372.method8130(class65.method2145(this.field1244)));
         byte[] var13 = null;
         if (var8 > 0 && var8 <= 8) {
            var13 = new byte[var8];

            for(int var14 = 0; var14 < var8; ++var14) {
               var13[var14] = var1.method11259();
            }
         }

         var4.method1796(var6, var9, var10, var12, var13);
      }

      if ((var3 & 32) != 0) {
         var7 = var1.method11241();
         var7 += var1.method11281() << 16;
         var6 = 16777215;
         if (var7 == var6) {
            var7 = -1;
         }

         var4.method1790(var7);
      }

      byte var15;
      byte var22;
      if ((var3 & 256) != 0) {
         var6 = client.field412 + var1.method11241();
         var7 = client.field412 + var1.method11198();
         var22 = var1.method11233();
         var15 = var1.method11235();
         byte var23 = var1.method11259();
         byte var27 = (byte)var1.method11196();
         var4.method1799(var6, var7, var22, var15, var23, var27);
      }

      if ((var3 & 64) != 0) {
         var6 = var1.method11196();
         byte[] var16 = new byte[var6];
         class590 var17 = new class590(var16);
         var1.method11266(var16, 0, var6);
         var4.method1862(var17);
      }

      int var25;
      int var28;
      if ((var3 & 65536) != 0) {
         var6 = var1.method11196();

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var1.method11230();
            var28 = var1.method11181();
            var25 = var1.readCustomEndianInt2();
            var4.method1777(var8, var28, var25 >> 16, var25 & '\uffff');
         }
      }

      if ((var3 & 4096) != 0) {
         for(var6 = 0; var6 < 3; ++var6) {
            this.field1253[var6] = var1.method11207();
         }

         var4.method1798(this.field1253);
      }

      int var19;
      if ((var3 & 4) != 0) {
         var6 = var1.method11281();
         if (var6 > 0) {
            for(var7 = 0; var7 < var6; ++var7) {
               var28 = -1;
               var25 = -1;
               var11 = -1;
               var8 = var1.method11212();
               if (var8 == 32767) {
                  var8 = var1.method11212();
                  var25 = var1.method11212();
                  var28 = var1.method11212();
                  var11 = var1.method11212();
               } else if (var8 != 32766) {
                  var25 = var1.method11212();
               } else {
                  var8 = -1;
               }

               var19 = var1.method11212();
               var4.method1846(var8, var25, var28, var11, var19);
            }
         }

         var7 = var1.method11232();
         if (var7 > 0) {
            for(var8 = 0; var8 < var7; ++var8) {
               var28 = var1.method11212();
               var25 = var1.method11212();
               if (var25 != 32767) {
                  var11 = var1.method11212();
                  var19 = var1.method11281();
                  int var20 = var25 > 0 ? var1.method11281() : var19;
                  var4.method1789(var28, var25, var11, var19, var20);
               } else {
                  var4.method1794(var28);
               }
            }
         }
      }

      if ((var3 & 128) != 0) {
         var1.method11241();
         var1.method11232();
         var1.method11281();
         var6 = var1.method11196();
         this.field1244.buffer = 0;
         var1.method11255(this.field1244.index, 0, var6);
         this.field1244.buffer = 0;
      }

      if ((var3 & 1024) != 0) {
         var4.field677 = (class280)class173.method4100(class163.method3999(), var1.method11235());
         if (var5 == Integer.MAX_VALUE) {
            this.field1246[var2] = var4.field677;
         }
      }

      if ((var3 & 8) != 0) {
         String var18 = var1.method11207();
         var4.method1791(var18);
      }

      if ((var3 & 8192) != 0) {
         byte var21 = var1.method11197();
         if (var21 == 127) {
            this.field1246[var2] = class280.field3279;
         } else {
            this.field1246[var2] = (class280)class173.method4100(class163.method3999(), var21);
         }
      }

      if ((var3 & 16) != 0) {
         var6 = var1.method11181();
         var4.method1795(var6);
      }

      if ((var3 & 512) != 0) {
         byte var24 = var1.method11233();
         byte var26 = var1.method11235();
         var22 = var1.method11235();
         var15 = var1.method11233();
         var25 = var1.method11181() + client.field412;
         var11 = var1.method11198() + client.field412;
         var19 = var1.method11422();
         var4.method1797(var24, var26, var22, var15, var25, var11, var19);
         this.field1245[var2] = false;
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Lcv;I)V",
      garbageValue = "-2139402295"
   )
   void method2851(class69 var1) {
      if (var1 != null) {
         this.field1255[var1.field1103].method1779(var1);
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1777885476"
   )
   void method2847() {
      this.field1254 = 0;

      for(int var1 = 0; var1 < 2048; ++var1) {
         this.field1255[var1].method1776();
      }

   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "-1290327159"
   )
   static int method2871(int var0, class55 var1, boolean var2) {
      int var3;
      if (var0 == 3903) {
         var3 = class46.field659[--class124.field1569];
         class46.field659[++class124.field1569 - 1] = client.field380[var3].method8516();
         return 1;
      } else if (var0 == 3904) {
         var3 = class46.field659[--class124.field1569];
         class46.field659[++class124.field1569 - 1] = client.field380[var3].field5039;
         return 1;
      } else if (var0 == 3905) {
         var3 = class46.field659[--class124.field1569];
         class46.field659[++class124.field1569 - 1] = client.field380[var3].field5040;
         return 1;
      } else if (var0 == 3906) {
         var3 = class46.field659[--class124.field1569];
         class46.field659[++class124.field1569 - 1] = client.field380[var3].field5041;
         return 1;
      } else if (var0 == 3907) {
         var3 = class46.field659[--class124.field1569];
         class46.field659[++class124.field1569 - 1] = client.field380[var3].field5042;
         return 1;
      } else if (var0 == 3908) {
         var3 = class46.field659[--class124.field1569];
         class46.field659[++class124.field1569 - 1] = client.field380[var3].field5038;
         return 1;
      } else {
         int var13;
         if (var0 == 3910) {
            var3 = class46.field659[--class124.field1569];
            var13 = client.field380[var3].method8514();
            class46.field659[++class124.field1569 - 1] = var13 == 0 ? 1 : 0;
            return 1;
         } else if (var0 == 3911) {
            var3 = class46.field659[--class124.field1569];
            var13 = client.field380[var3].method8514();
            class46.field659[++class124.field1569 - 1] = var13 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == 3912) {
            var3 = class46.field659[--class124.field1569];
            var13 = client.field380[var3].method8514();
            class46.field659[++class124.field1569 - 1] = var13 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == 3913) {
            var3 = class46.field659[--class124.field1569];
            var13 = client.field380[var3].method8514();
            class46.field659[++class124.field1569 - 1] = var13 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var12;
            if (var0 == 3914) {
               var12 = class46.field659[--class124.field1569] == 1;
               if (class477.field5305 != null) {
                  class477.field5305.method8467(class414.field5013, var12);
               }

               return 1;
            } else if (var0 == 3915) {
               var12 = class46.field659[--class124.field1569] == 1;
               if (class477.field5305 != null) {
                  class477.field5305.method8467(class414.field5012, var12);
               }

               return 1;
            } else if (var0 == 3916) {
               class124.field1569 -= 2;
               var12 = class46.field659[class124.field1569] == 1;
               boolean var11 = class46.field659[class124.field1569 + 1] == 1;
               if (class477.field5305 != null) {
                  client.field381.field285 = var11;
                  class477.field5305.method8467(client.field381, var12);
               }

               return 1;
            } else if (var0 == 3917) {
               var12 = class46.field659[--class124.field1569] == 1;
               if (class477.field5305 != null) {
                  class477.field5305.method8467(class414.field5011, var12);
               }

               return 1;
            } else if (var0 == 3918) {
               var12 = class46.field659[--class124.field1569] == 1;
               if (class477.field5305 != null) {
                  class477.field5305.method8467(class414.field5015, var12);
               }

               return 1;
            } else if (var0 == 3919) {
               class46.field659[++class124.field1569 - 1] = class477.field5305 == null ? 0 : class477.field5305.field5014.size();
               return 1;
            } else {
               class420 var4;
               if (var0 == 3920) {
                  var3 = class46.field659[--class124.field1569];
                  var4 = (class420)class477.field5305.field5014.get(var3);
                  class46.field659[++class124.field1569 - 1] = var4.field5033;
                  return 1;
               } else if (var0 == 3921) {
                  var3 = class46.field659[--class124.field1569];
                  var4 = (class420)class477.field5305.field5014.get(var3);
                  class46.field660[++class46.field658 - 1] = var4.method8502();
                  return 1;
               } else if (var0 == 3922) {
                  var3 = class46.field659[--class124.field1569];
                  var4 = (class420)class477.field5305.field5014.get(var3);
                  class46.field660[++class46.field658 - 1] = var4.method8501();
                  return 1;
               } else if (var0 == 3923) {
                  var3 = class46.field659[--class124.field1569];
                  var4 = (class420)class477.field5305.field5014.get(var3);
                  long var5 = class189.method4284() - class371.field4311 - var4.field5037;
                  int var7 = (int)(var5 / 3600000L);
                  int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
                  int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * '\uea60')) / 1000L);
                  String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
                  class46.field660[++class46.field658 - 1] = var10;
                  return 1;
               } else if (var0 == 3924) {
                  var3 = class46.field659[--class124.field1569];
                  var4 = (class420)class477.field5305.field5014.get(var3);
                  class46.field659[++class124.field1569 - 1] = var4.field5032.field5041;
                  return 1;
               } else if (var0 == 3925) {
                  var3 = class46.field659[--class124.field1569];
                  var4 = (class420)class477.field5305.field5014.get(var3);
                  class46.field659[++class124.field1569 - 1] = var4.field5032.field5040;
                  return 1;
               } else if (var0 == 3926) {
                  var3 = class46.field659[--class124.field1569];
                  var4 = (class420)class477.field5305.field5014.get(var3);
                  class46.field659[++class124.field1569 - 1] = var4.field5032.field5039;
                  return 1;
               } else if (var0 == 3939) {
                  var3 = class46.field659[--class124.field1569];
                  class46.field659[++class124.field1569 - 1] = class84.method2800(var3).field2418 ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }
}
