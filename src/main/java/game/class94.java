package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
public class class94 {
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Led;"
   )
   static class115 field1316 = new class115();
   @ObfuscatedName("af")
   int field1320;
   @ObfuscatedName("aw")
   int field1317;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lew;"
   )
   class109 field1315;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "[Lep;"
   )
   final class116[] field1313 = new class116[10];
   @ObfuscatedName("aq")
   int field1314;
   @ObfuscatedName("ao")
   int field1319;

   @ObfuscatedSignature(
      descriptor = "(Lwb;ILew;)V"
   )
   class94(class590 var1, int var2, class109 var3) {
      this.field1317 = var2;
      this.field1315 = var3;
      if (var2 == 0) {
         this.method3005(var1);
      } else {
         if (var2 != 1) {
            throw new RuntimeException("Invalid fileId for SFX");
         }

         var3.method3395(var1);
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;)V"
   )
   void method3005(class590 var1) {
      this.field1320 = 22050;

      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.method11196();
         if (var3 != 0) {
            var1.buffer -= -290410379;
            this.field1313[var2] = new class116();
            this.field1313[var2].method3474(var1);
         }
      }

      this.field1314 = var1.method11198();
      this.field1319 = var1.method11198();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Z)Ldv;"
   )
   public class95 method3003(boolean var1) {
      short[] var2 = this.method3001(var1);
      class95 var3 = new class95(this.field1320, var2, this.field1320 * this.field1314 / 1000, this.field1320 * this.field1319 / 1000, false, var1);
      return var3;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "()Ldv;"
   )
   class95 method2998() {
      return this.field1317 == 0 ? this.method3003(false) : this.field1315.method3394();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Z)Ldv;"
   )
   public class95 method3013(boolean var1) {
      return this.field1317 == 0 ? this.method3003(var1) : this.field1315.method3394();
   }

   @ObfuscatedName("aq")
   public final int method2997() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field1313[var2] != null && this.field1313[var2].field1531 / 20 < var1) {
            var1 = this.field1313[var2].field1531 / 20;
         }
      }

      if (this.field1314 < this.field1319 && this.field1314 / 20 < var1) {
         var1 = this.field1314 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.field1313[var2] != null) {
               class116 var10000 = this.field1313[var2];
               var10000.field1531 -= var1 * 20;
            }
         }

         if (this.field1314 < this.field1319) {
            this.field1314 -= var1 * 20;
            this.field1319 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   @ObfuscatedName("ao")
   final short[] method3001(boolean var1) {
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < 10; ++var3) {
         if (this.field1313[var3] != null && this.field1313[var3].field1540 + this.field1313[var3].field1531 > var2) {
            var2 = this.field1313[var3].field1540 + this.field1313[var3].field1531;
         }
      }

      if (var2 == 0) {
         return new short[0];
      } else {
         var3 = var2 * this.field1320 / 1000;
         short[] var4 = new short[var3];

         for(int var5 = 0; var5 < 10; ++var5) {
            if (this.field1313[var5] != null) {
               int var6 = this.field1313[var5].field1540 * this.field1320 / 1000;
               int var7 = this.field1313[var5].field1531 * this.field1320 / 1000;
               int[] var8 = this.field1313[var5].method3472(var6, this.field1313[var5].field1540, this.field1320);
               int var9;
               int var10;
               if (var1) {
                  for(var9 = 0; var9 < var6; ++var9) {
                     var10 = (var8[var9] >> 8) + var4[var9 + var7];
                     var10 = class505.method10135(-128, 127, var10);
                     var4[var9 + var7] = (short)((byte)var10);
                  }
               } else {
                  for(var9 = 0; var9 < var6; ++var9) {
                     var10 = var8[var9] + var4[var9 + var7];
                     var10 = class505.method10135(-32768, 32767, var10);
                     var4[var9 + var7] = (short)var10;
                  }
               }
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lpx;II)Ldl;"
   )
   public static class94 method2996(class412 var0, int var1, int var2) {
      class109 var3 = new class109(field1316);
      byte[] var4 = var0.method8335(var1, var2);
      if (var4 == null) {
         return null;
      } else {
         class590 var5 = new class590(var4);
         if (var2 == 1) {
            if (var4.length < 4) {
               return null;
            }

            int var6 = var5.method11202();
            var3.method3397(var4, 4);
            var5.buffer = (var6 + 4) * -290410379;
         } else {
            if (var2 != 0) {
               return null;
            }

            var5 = new class590(var4);
         }

         return new class94(var5, var2, var3);
      }
   }
}
