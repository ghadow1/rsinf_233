package runescape;

import java.util.Arrays;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public class class365 {
   @ObfuscatedName("ac")
   public static short[][] field4074;
   @ObfuscatedName("ap")
   public static short[] field4075;
   @ObfuscatedName("aq")
   public static short[][] field4076;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   static class320 field4077 = new class320(260);
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lsj;"
   )
   static class490 field4078;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 867479717
   )
   static int field4072;
   @ObfuscatedName("au")
   int[] field4080;
   @ObfuscatedName("ai")
   int[] field4081;
   @ObfuscatedName("aa")
   int[] field4082;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1542820987
   )
   public int field4083 = -1;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -526446761
   )
   public int field4084 = 0;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -2061213481
   )
   int field4089;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      longValue = 8189501649223314449L
   )
   long field4088;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      longValue = 6855535478392845543L
   )
   long field4087;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "[Lgq;"
   )
   class176[] field4079;
   @ObfuscatedName("ag")
   boolean field4085 = false;

   static {
      field4078 = new class490(16, Players.field5351);
      field4072 = 0;
   }

   @ObfuscatedSignature(
      descriptor = "(Loz;)V"
   )
   class365(class365 var1) {
      if (var1 != null) {
         int[] var2 = Arrays.copyOf(var1.field4081, var1.field4081.length);
         int[] var3 = Arrays.copyOf(var1.field4080, var1.field4080.length);
         class176[] var4 = (class176[])(var1.field4079 != null ? (class176[])Arrays.copyOf(var1.field4079, var1.field4079.length) : null);
         int[] var5 = Arrays.copyOf(var1.field4082, var1.field4082.length);
         this.method7526(var3, var2, var4, false, var5, var1.field4084, var1.field4089, var1.field4083);
      }
   }

   public class365() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([I[I[Lgq;Z[IIIIB)V",
      garbageValue = "-63"
   )
   public void method7526(int[] var1, int[] var2, class176[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
      this.field4079 = var3;
      this.field4085 = var4;
      this.field4083 = var8;
      this.method7527(var1, var2, var5, var6, var7);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "([I[I[IIIB)V",
      garbageValue = "39"
   )
   public void method7527(int[] var1, int[] var2, int[] var3, int var4, int var5) {
      if (var1 == null) {
         var1 = this.method7528(var4);
      }

      if (var2 == null) {
         var2 = this.method7528(var4);
      }

      this.field4080 = var1;
      this.field4081 = var2;
      this.field4082 = var3;
      this.field4084 = var4;
      this.field4089 = var5;
      this.method7595();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)[I",
      garbageValue = "-1208722266"
   )
   int[] method7528(int var1) {
      int[] var2 = new int[12];

      for(int var3 = 0; var3 < 7; ++var3) {
         class269.method6052(var1, var2, var3);
      }

      return var2;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "1082396824"
   )
   public void method7585(int var1, boolean var2) {
      int[] var3 = this.field4081;
      if (class200.field2182 == null) {
         class200.field2182 = new int[7];
         class200.field2182[class200.field2186.field2189] = class216.field2506.field2509;
         class200.field2182[class200.field2179.field2189] = class216.field2500.field2509;
         class200.field2182[class200.field2180.field2189] = class216.field2499.field2509;
         class200.field2182[class200.field2181.field2189] = class216.field2501.field2509;
         class200.field2182[class200.field2187.field2189] = class216.field2504.field2509;
         class200.field2182[class200.field2183.field2189] = class216.field2495.field2509;
         class200.field2182[class200.field2184.field2189] = class216.field2505.field2509;
      }

      int var4 = class200.field2182[var1];
      int var6 = var3[var4];
      if (var6 != 0) {
         var6 -= 256;

         class186 var7;
         do {
            if (!var2) {
               --var6;
               if (var6 < 0) {
                  var6 = class186.field2022 - 1;
               }
            } else {
               ++var6;
               if (var6 >= class186.field2022) {
                  var6 = 0;
               }
            }

            var7 = class524.method10438(var6);
         } while(var7 == null || var7.field2032 || !var7.method4222(var1, this.field4084));

         int[] var10 = this.field4081;
         if (class200.field2182 == null) {
            class200.field2182 = new int[7];
            class200.field2182[class200.field2186.field2189] = class216.field2506.field2509;
            class200.field2182[class200.field2179.field2189] = class216.field2500.field2509;
            class200.field2182[class200.field2180.field2189] = class216.field2499.field2509;
            class200.field2182[class200.field2181.field2189] = class216.field2501.field2509;
            class200.field2182[class200.field2187.field2189] = class216.field2504.field2509;
            class200.field2182[class200.field2183.field2189] = class216.field2495.field2509;
            class200.field2182[class200.field2184.field2189] = class216.field2505.field2509;
         }

         int var8 = class200.field2182[var1];
         var10[var8] = var6 + 256;
         this.method7595();
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "949395235"
   )
   public void method7543(int var1, boolean var2) {
      int var3 = this.field4082[var1];
      if (!var2) {
         do {
            --var3;
            if (var3 < 0) {
               var3 = field4074[var1].length - 1;
            }
         } while(!class194.method4322(var1, var3));
      } else {
         do {
            ++var3;
            if (var3 >= field4074[var1].length) {
               var3 = 0;
            }
         } while(!class194.method4322(var1, var3));
      }

      this.field4082[var1] = var3;
      this.method7595();
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1185307361"
   )
   public void method7531(int var1) {
      if (this.field4084 != var1) {
         this.method7527((int[])null, (int[])null, this.field4082, var1, -1);
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lwb;B)V",
      garbageValue = "-108"
   )
   public void method7578(Buffer var1) {
      var1.writeByte(this.field4084);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int[] var3 = this.field4081;
         if (class200.field2182 == null) {
            class200.field2182 = new int[7];
            class200.field2182[class200.field2186.field2189] = class216.field2506.field2509;
            class200.field2182[class200.field2179.field2189] = class216.field2500.field2509;
            class200.field2182[class200.field2180.field2189] = class216.field2499.field2509;
            class200.field2182[class200.field2181.field2189] = class216.field2501.field2509;
            class200.field2182[class200.field2187.field2189] = class216.field2504.field2509;
            class200.field2182[class200.field2183.field2189] = class216.field2495.field2509;
            class200.field2182[class200.field2184.field2189] = class216.field2505.field2509;
         }

         int var4 = class200.field2182[var2];
         int var6 = var3[var4];
         if (var6 == 0) {
            var1.writeShortBigEndian(-1);
         } else {
            var1.writeShortBigEndian(var6 - 256);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.writeByte(this.field4082[var2]);
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1164517325"
   )
   void method7595() {
      long var1 = this.field4088;
      long[] var3 = Buffer.field5917;
      this.field4088 = -1L;

      int var4;
      for(var4 = 0; var4 < 12; ++var4) {
         this.field4088 = this.field4088 >>> 8 ^ var3[(int)((this.field4088 ^ (long)(this.field4081[var4] >> 24)) & 255L)];
         this.field4088 = this.field4088 >>> 8 ^ var3[(int)((this.field4088 ^ (long)(this.field4081[var4] >> 16)) & 255L)];
         this.field4088 = this.field4088 >>> 8 ^ var3[(int)((this.field4088 ^ (long)(this.field4081[var4] >> 8)) & 255L)];
         this.field4088 = this.field4088 >>> 8 ^ var3[(int)((this.field4088 ^ (long)this.field4081[var4]) & 255L)];
      }

      if (this.field4079 != null) {
         for(var4 = 0; var4 < this.field4079.length; ++var4) {
            if (this.field4079[var4] != null) {
               int var5;
               if (this.field4079[var4].field1947 != null) {
                  for(var5 = 0; var5 < this.field4079[var4].field1947.length; ++var5) {
                     this.field4088 = this.field4088 >>> 8 ^ var3[(int)((this.field4088 ^ (long)(this.field4079[var4].field1947[var5] >> 8)) & 255L)];
                     this.field4088 = this.field4088 >>> 8 ^ var3[(int)((this.field4088 ^ (long)this.field4079[var4].field1947[var5]) & 255L)];
                  }
               }

               if (this.field4079[var4].field1949 != null) {
                  for(var5 = 0; var5 < this.field4079[var4].field1949.length; ++var5) {
                     this.field4088 = this.field4088 >>> 8 ^ var3[(int)((this.field4088 ^ (long)(this.field4079[var4].field1949[var5] >> 8)) & 255L)];
                     this.field4088 = this.field4088 >>> 8 ^ var3[(int)((this.field4088 ^ (long)this.field4079[var4].field1949[var5]) & 255L)];
                  }
               }
            }
         }
      }

      for(var4 = 0; var4 < 5; ++var4) {
         this.field4088 = this.field4088 >>> 8 ^ var3[(int)((this.field4088 ^ (long)this.field4082[var4]) & 255L)];
      }

      this.field4088 = this.field4088 >>> 8 ^ var3[(int)((this.field4088 ^ (long)this.field4084) & 255L)];
      if (0L != var1 && this.field4088 != var1 || this.field4085) {
         field4077.method7010(var1);
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Lij;ILij;II)Ljn;",
      garbageValue = "716425386"
   )
   public class241 method7599(class215 var1, int var2, class215 var3, int var4) {
      if (this.field4089 != -1) {
         return class63.method2129(this.field4089).method4327(var1, var2, var3, var4, (class194)null);
      } else {
         long var5 = this.field4088;
         int[] var7 = this.field4081;
         if (var1 != null && (var1.field2484 >= 0 || var1.field2490 >= 0)) {
            var7 = new int[12];
            System.arraycopy(this.field4081, 0, var7, 0, var7.length);
            if (var1.field2484 >= 0) {
               var5 ^= (long)(var1.field2484 - this.field4081[class216.field2502.field2509]) << 40;
               var7[class216.field2502.field2509] = this.method7602(var1.field2484);
            }

            if (var1.field2490 >= 0) {
               var5 ^= (long)(var1.field2490 - this.field4081[class216.field2498.field2509]) << 48;
               var7[class216.field2498.field2509] = this.method7602(var1.field2490);
            }
         }

         class241 var8 = (class241)field4077.method7018(var5);
         if (var8 == null) {
            boolean var9 = false;

            int var11;
            for(int var10 = 0; var10 < 12; ++var10) {
               var11 = var7[var10];
               if (this.method7542(var11)) {
                  class186 var18 = this.method7538(var11);
                  if (var18 != null && !var18.method4223()) {
                     var9 = true;
                  }
               }

               if (this.method7544(var11)) {
                  class176 var22 = this.field4079 == null ? null : this.field4079[var10];
                  if (!this.method7545(var11).method4664(this.field4084, var22)) {
                     var9 = true;
                  }
               }
            }

            if (var9) {
               if (-1L != this.field4087) {
                  var8 = (class241)field4077.method7018(this.field4087);
               }

               if (var8 == null) {
                  return null;
               }
            }

            if (var8 == null) {
               class219[] var17 = new class219[12];
               var11 = 0;

               int var13;
               for(int var12 = 0; var12 < 12; ++var12) {
                  var13 = var7[var12];
                  if (this.method7542(var13)) {
                     class186 var14 = this.method7538(var13);
                     class219 var15 = null;
                     if (var14 != null) {
                        var15 = var14.method4227();
                     }

                     if (var15 != null) {
                        var17[var11++] = var15;
                     }
                  }

                  if (this.method7544(var13)) {
                     class213 var20 = this.method7545(var13);
                     class176 var21 = this.field4079 == null ? null : this.field4079[var12];
                     class219 var16 = var20.method4665(this.field4084, var21);
                     if (var16 != null) {
                        var17[var11++] = var16;
                     }
                  }
               }

               class219 var23 = new class219(var17, var11);

               for(var13 = 0; var13 < 5; ++var13) {
                  if (this.field4082[var13] < field4074[var13].length) {
                     var23.method4844(class30.field149[var13], field4074[var13][this.field4082[var13]]);
                  }

                  if (this.field4082[var13] < field4076[var13].length) {
                     var23.method4844(field4075[var13], field4076[var13][this.field4082[var13]]);
                  }
               }

               var8 = var23.method4854(64, 850, -30, -50, -30);
               field4077.method7009(var8, var5);
               this.field4087 = var5;
            }
         }

         class241 var19;
         if (var1 == null && var3 == null) {
            var19 = var8.method5454(true);
         } else if (var1 != null && var3 != null) {
            var19 = var1.method4765(var8, var2, var3, var4);
         } else if (var1 != null) {
            var19 = var1.method4762(var8, var2);
         } else {
            var19 = var3.method4762(var8, var4);
         }

         return var19;
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(B)Liu;",
      garbageValue = "49"
   )
   class219 method7540() {
      if (this.field4089 != -1) {
         return class63.method2129(this.field4089).method4377((class194)null);
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.field4081[var2];
            if (this.method7542(var3)) {
               class186 var9 = this.method7538(var3);
               if (var9 != null && !var9.method4225()) {
                  var1 = true;
               }
            }

            if (this.method7544(var3)) {
               class176 var11 = this.field4079 == null ? null : this.field4079[var2];
               if (!this.method7545(var3).method4666(this.field4084, var11)) {
                  var1 = true;
               }
            }
         }

         if (var1) {
            return null;
         } else {
            class219[] var8 = new class219[12];
            var3 = 0;

            int var5;
            for(int var4 = 0; var4 < 12; ++var4) {
               var5 = this.field4081[var4];
               class219 var7;
               if (this.method7542(var5)) {
                  class186 var6 = this.method7538(var5);
                  var7 = null;
                  if (var6 != null) {
                     var7 = var6.method4228();
                  }

                  if (var7 != null) {
                     var8[var3++] = var7;
                  }
               }

               if (this.method7544(var5)) {
                  class176 var10 = this.field4079 == null ? null : this.field4079[var4];
                  var7 = this.method7545(var5).method4729(this.field4084, var10);
                  if (var7 != null) {
                     var8[var3++] = var7;
                  }
               }
            }

            class219 var12 = new class219(var8, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if (this.field4082[var5] < field4074[var5].length) {
                  var12.method4844(class30.field149[var5], field4074[var5][this.field4082[var5]]);
               }

               if (this.field4082[var5] < field4076[var5].length) {
                  var12.method4844(field4075[var5], field4076[var5][this.field4082[var5]]);
               }
            }

            return var12;
         }
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1107803327"
   )
   public int method7536() {
      long var1 = this.field4088;
      if (this.field4089 != -1) {
         var1 = -65536L | (long)this.field4089;
      }

      Integer var3 = (Integer)field4078.method9819(var1);
      if (var3 == null) {
         var3 = ++field4072 - 1;
         field4078.method9834(var1, var3);
         field4072 %= 65535;
      }

      return var3;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1024945254"
   )
   void method7525() {
      this.method7527(this.field4080, this.field4081, this.field4082, this.field4084, this.field4089);
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "1"
   )
   public void method7562(int var1, int var2) {
      boolean var3 = var2 != this.field4084;
      this.field4084 = var2;
      if (var3) {
         int var4;
         int var5;
         if (this.field4084 == var1) {
            for(var4 = 0; var4 < 7; ++var4) {
               if (class200.field2182 == null) {
                  class200.field2182 = new int[7];
                  class200.field2182[class200.field2186.field2189] = class216.field2506.field2509;
                  class200.field2182[class200.field2179.field2189] = class216.field2500.field2509;
                  class200.field2182[class200.field2180.field2189] = class216.field2499.field2509;
                  class200.field2182[class200.field2181.field2189] = class216.field2501.field2509;
                  class200.field2182[class200.field2187.field2189] = class216.field2504.field2509;
                  class200.field2182[class200.field2183.field2189] = class216.field2495.field2509;
                  class200.field2182[class200.field2184.field2189] = class216.field2505.field2509;
               }

               var5 = class200.field2182[var4];
               if (this.field4081[var5] > 0 && this.field4081[var5] < 2048) {
                  this.field4081[var5] = this.field4080[var5];
               }
            }
         } else {
            if (this.field4081[0] < 2048 || this.method7570()) {
               this.field4081[class216.field2500.field2509] = 1;
            }

            for(var4 = 0; var4 < 7; ++var4) {
               if (class200.field2182 == null) {
                  class200.field2182 = new int[7];
                  class200.field2182[class200.field2186.field2189] = class216.field2506.field2509;
                  class200.field2182[class200.field2179.field2189] = class216.field2500.field2509;
                  class200.field2182[class200.field2180.field2189] = class216.field2499.field2509;
                  class200.field2182[class200.field2181.field2189] = class216.field2501.field2509;
                  class200.field2182[class200.field2187.field2189] = class216.field2504.field2509;
                  class200.field2182[class200.field2183.field2189] = class216.field2495.field2509;
                  class200.field2182[class200.field2184.field2189] = class216.field2505.field2509;
               }

               var5 = class200.field2182[var4];
               if (this.field4081[var5] > 0 && this.field4081[var5] < 2048) {
                  class269.method6052(var2, this.field4081, var4);
               }
            }
         }
      }

      this.method7525();
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-889709097"
   )
   boolean method7570() {
      if (!this.method7544(this.field4081[0])) {
         return false;
      } else {
         class213 var1 = this.method7545(this.field4081[0]);
         return var1.field2400 != class216.field2500.field2509 && var1.field2401 != class216.field2500.field2509;
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1558025398"
   )
   public void method7533(int var1, int var2) {
      this.field4082[var1] = var2;
      this.method7525();
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "51"
   )
   public void method7541(int var1) {
      class213 var2 = class84.method2800(var1);
      this.field4081[var2.field2437] = var1 + 2048;
      if (var2.field2400 != -1) {
         this.field4081[var2.field2400] = 0;
      }

      if (var2.field2401 != -1) {
         this.field4081[var2.field2401] = 0;
      }

      this.method7525();
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1915861852"
   )
   boolean method7542(int var1) {
      return var1 >= 256 && var1 < 2048;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)Lhs;",
      garbageValue = "-803180776"
   )
   class186 method7538(int var1) {
      return class524.method10438(var1 - 256);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-73765989"
   )
   boolean method7544(int var1) {
      return var1 >= 2048;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(II)Lis;",
      garbageValue = "1001484861"
   )
   class213 method7545(int var1) {
      return class84.method2800(var1 - 2048);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-636594995"
   )
   int method7602(int var1) {
      return var1 - 512 + 2048;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1970936975"
   )
   public static boolean method7600(int var0) {
      return var0 >= class378.field4361.field4364 && var0 <= class378.field4362.field4364;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IIIILco;B)Lre;",
      garbageValue = "69"
   )
   static class452 method7565(int var0, int var1, int var2, int var3, class73 var4) {
      class452 var5 = null;
      class79 var6 = null;
      int var9;
      if (class336.method7086(var0)) {
         boolean var8 = var0 > 0;
         Object var7;
         if (!var8) {
            var9 = -var0 - 1;
            var6 = class418.method8493(var9, var4);
            var7 = var6.method2683(var9);
         } else {
            var9 = class262.method5941(var0);
            Iterator var11 = var4.iterator();

            class79 var10;
            while(true) {
               if (var11.hasNext()) {
                  class79 var12 = (class79)var11.next();
                  if (var12.field1160.method8567((long)var9) == null) {
                     continue;
                  }

                  var10 = var12;
                  break;
               }

               var10 = var4.method2343();
               break;
            }

            var6 = var10;
            var7 = (class75)var10.field1160.method8567((long)var9);
         }

         if (var7 != null) {
            class356 var15 = ((class75)var7).method2435(var6);
            class452 var20;
            synchronized(class452.field5171) {
               if (class452.field5173 == 0) {
                  var20 = new class452();
               } else {
                  class452.field5171[--class452.field5173].method9004();
                  var20 = class452.field5171[class452.field5173];
               }
            }

            var5 = var20;
            var20.field5175 = (float)var15.field4026;
            var20.field5169 = (float)var15.field4025;
         }
      }

      if (var5 == null) {
         var6 = var4.method2345(var1, var2);
         int var16 = var1 - var6.field1164;
         int var19 = var2 - var6.field1165;
         class505 var22 = (class505)var4.method2343().field1171.method8596((long)var6.field1172);
         if (var22 != null) {
            var5 = var22.method10084(class356.method7416(var16), class356.method7416(var19));
         } else {
            var5 = class296.method6761((float)class356.method7416(var16), 0.0F, (float)class356.method7416(var19));
         }
      }

      var9 = (int)var5.field5175;
      int var14 = (int)var5.field5169;
      int var17 = class413.method8434(var6, var9, var14, var3);
      class505 var21 = (class505)class333.field3836.field1171.method8596((long)var6.field1172);
      if (var21 != null) {
         var17 += class413.method8434(class333.field3836, var21.vmethod11534(), var21.vmethod11529(), var21.vmethod11530());
      }

      var5.field5176 = (float)var17;
      return var5;
   }

   @ObfuscatedName("hz")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "122"
   )
   static void method7601() {
      client.field394 = 1L;
      if (class398.mouseRecorder != null) {
         class398.mouseRecorder.index = 0;
      }

      class34.hasFocus = true;
      client.hadFocus = true;
      client.field466 = -1L;
      class36.field241 = new class438();
      client.packetWriter.method2936();
      client.packetWriter.field1289 = 0;
      client.packetWriter.packetBuffer.offset = 0;
      client.packetWriter.serverPacket = null;
      client.packetWriter.field1295 = null;
      client.packetWriter.field1302 = null;
      client.packetWriter.field1306 = null;
      client.packetWriter.serverPacketLength = 0;
      client.packetWriter.field1297 = 0;
      client.rebootTimer = 0;
      client.logoutTimer = 0;
      client.field455 = 0;
      class369.method8102();
      class37.method740(0);
      class91.field1286.clear();
      class91.field1287.method8591();
      class91.field1283.method8846();
      class91.field1284 = 0;
      client.field357 = 0;
      client.field529 = false;
      class58.field836 = 0;
      client.field424 = 0;
      client.field336 = 0;
      class153.field1780 = null;
      client.field585 = 0;
      client.field576 = -1;
      client.field581 = 0;
      client.field531 = 0;
      client.field340 = class84.field1213;
      client.field318 = class84.field1213;
      client.field333.method2387();
      client.field346 = -1;
      client.field334.method8685();
      client.field335.method2847();
      class40.field279.method1539();
      Arrays.fill(class422.field5047, 0);
      Arrays.fill(class355.field4022, 0);
      if (class516.varcs != null) {
         class516.varcs.method2885();
      }

      client.field429 = -1;
      if (client.rootInterface != -1) {
         class119.field1554.method7479(client.rootInterface);
      }

      for(class64 var0 = (class64)client.field422.method8626(); var0 != null; var0 = (class64)client.field422.method8627()) {
         class279.method6318(var0, true);
      }

      client.rootInterface = -1;
      client.field422 = new class428(8);
      client.field564 = null;
      class369.method8102();
      client.field322.method7527((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

      int var1;
      for(var1 = 0; var1 < 8; ++var1) {
         client.field516[var1] = null;
         client.field439[var1] = false;
      }

      class62.field867 = new class428(32);
      client.field392 = true;

      for(var1 = 0; var1 < 100; ++var1) {
         client.field436[var1] = true;
      }

      if (client.packetWriter != null && client.packetWriter.isaacCipher != null) {
         class329 var2 = EnumComposition.getPacketBufferNode(ClientPackets.field3568, client.packetWriter.isaacCipher);
         var2.out.writeByte(class35.getWindowedMode());
         var2.out.writeShortBigEndian(class34.screenWidth);
         var2.out.writeShortBigEndian(class396.screenHeight);
         client.packetWriter.addNode(var2);
      }

      class22.field90 = null;
      class483.field5333 = null;
      Arrays.fill(client.field365, (Object)null);
      class86.field1229 = null;
      Arrays.fill(client.field582, (Object)null);

      for(var1 = 0; var1 < 8; ++var1) {
         client.field380[var1] = new class421();
      }

      class477.field5305 = null;
      client.field375 = 0;
      client.field597 = 0;
      client.field313 = 0;
      client.field378 = 0;
   }
}
