package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
public class class311 {
   @ObfuscatedName("ko")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field3506;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -2034820323
   )
   int field3507;
   @ObfuscatedName("aw")
   byte[][][] field3508;

   class311(int var1) {
      this.field3507 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIB)V",
      garbageValue = "-14"
   )
   void method6925(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && this.field3507 != 0 && this.field3508 != null) {
         var8 = this.method6922(var8, var7);
         var7 = this.method6923(var7);
         class601.method11606(var1, var2, var5, var6, var3, var4, this.field3508[var7 - 1][var8], this.field3507);
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "82"
   )
   int method6922(int var1, int var2) {
      if (var2 == 9) {
         var1 = var1 + 1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1999877734"
   )
   int method6923(int var1) {
      if (var1 != 9 && var1 != 10) {
         return var1 == 11 ? 8 : var1;
      } else {
         return 1;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-33"
   )
   void method6934() {
      if (this.field3508 == null) {
         this.field3508 = new byte[8][4][];
         this.method6962();
         this.method6926();
         this.method6927();
         this.method6921();
         this.method6957();
         this.method6930();
         this.method6929();
         this.method6932();
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-43"
   )
   void method6962() {
      byte[] var1 = new byte[this.field3507 * this.field3507];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[0][0] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var2 = 0;

      for(var3 = this.field3507 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[0][1] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var2 = 0;

      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[0][2] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var2 = 0;

      for(var3 = this.field3507 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[0][3] = var1;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "255"
   )
   void method6926() {
      byte[] var1 = new byte[this.field3507 * this.field3507];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field3507 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[1][0] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var2 = 0;

      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var2 >= 0 && var2 < var1.length) {
               if (var4 >= var3 << 1) {
                  var1[var2] = -1;
               }

               ++var2;
            } else {
               ++var2;
            }
         }
      }

      this.field3508[1][1] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var2 = 0;

      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = this.field3507 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[1][2] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var2 = 0;

      for(var3 = this.field3507 - 1; var3 >= 0; --var3) {
         for(var4 = this.field3507 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[1][3] = var1;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-644795760"
   )
   void method6927() {
      byte[] var1 = new byte[this.field3507 * this.field3507];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field3507 - 1; var3 >= 0; --var3) {
         for(var4 = this.field3507 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[2][0] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var2 = 0;

      for(var3 = this.field3507 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[2][1] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var2 = 0;

      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[2][2] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var2 = 0;

      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = this.field3507 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[2][3] = var1;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1102936113"
   )
   void method6921() {
      byte[] var1 = new byte[this.field3507 * this.field3507];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field3507 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[3][0] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var2 = 0;

      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[3][1] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var2 = 0;

      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = this.field3507 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[3][2] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var2 = 0;

      for(var3 = this.field3507 - 1; var3 >= 0; --var3) {
         for(var4 = this.field3507 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[3][3] = var1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "25663"
   )
   void method6957() {
      byte[] var1 = new byte[this.field3507 * this.field3507];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.field3507 - 1; var3 >= 0; --var3) {
         for(var4 = this.field3507 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[4][0] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var2 = 0;

      for(var3 = this.field3507 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[4][1] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var2 = 0;

      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[4][2] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var2 = 0;

      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = this.field3507 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.field3508[4][3] = var1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "45"
   )
   void method6930() {
      byte[] var1 = new byte[this.field3507 * this.field3507];
      boolean var2 = false;
      var1 = new byte[this.field3507 * this.field3507];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var4 <= this.field3507 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field3508[5][0] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var5 = 0;

      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var3 <= this.field3507 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field3508[5][1] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var5 = 0;

      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var4 >= this.field3507 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field3508[5][2] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var5 = 0;

      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var3 >= this.field3507 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field3508[5][3] = var1;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-16"
   )
   void method6929() {
      byte[] var1 = new byte[this.field3507 * this.field3507];
      boolean var2 = false;
      var1 = new byte[this.field3507 * this.field3507];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var4 <= var3 - this.field3507 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field3508[6][0] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var5 = 0;

      for(var3 = this.field3507 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var4 <= var3 - this.field3507 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field3508[6][1] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var5 = 0;

      for(var3 = this.field3507 - 1; var3 >= 0; --var3) {
         for(var4 = this.field3507 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 - this.field3507 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field3508[6][2] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var5 = 0;

      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = this.field3507 - 1; var4 >= 0; --var4) {
            if (var4 <= var3 - this.field3507 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field3508[6][3] = var1;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1758655881"
   )
   void method6932() {
      byte[] var1 = new byte[this.field3507 * this.field3507];
      boolean var2 = false;
      var1 = new byte[this.field3507 * this.field3507];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var4 >= var3 - this.field3507 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field3508[7][0] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var5 = 0;

      for(var3 = this.field3507 - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.field3507; ++var4) {
            if (var4 >= var3 - this.field3507 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field3508[7][1] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var5 = 0;

      for(var3 = this.field3507 - 1; var3 >= 0; --var3) {
         for(var4 = this.field3507 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 - this.field3507 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field3508[7][2] = var1;
      var1 = new byte[this.field3507 * this.field3507];
      var5 = 0;

      for(var3 = 0; var3 < this.field3507; ++var3) {
         for(var4 = this.field3507 - 1; var4 >= 0; --var4) {
            if (var4 >= var3 - this.field3507 / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.field3508[7][3] = var1;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "11"
   )
   static int method6968(int var0) {
      class57 var1 = (class57)class91.field1286.get(var0);
      return var1 == null ? 0 : var1.method2019();
   }

   @ObfuscatedName("le")
   @ObfuscatedSignature(
      descriptor = "(IIIILjava/lang/String;B)V",
      garbageValue = "1"
   )
   static void method6928(int var0, int var1, int var2, int var3, String var4) {
      int var5 = var0 >>> 16;
      int var6 = var0 & '\uffff';
      class369 var7 = class119.field1554.method7477(var1, var2);
      if (var7 != null) {
         if (var7.field4256 != null) {
            class65 var8 = new class65();
            var8.field893 = var7;
            var8.field891 = var6;
            var8.field897 = var5;
            var8.field901 = var4;
            var8.field898 = var7.field4256;
            class329.method7047(var8);
         }

         boolean var10 = true;
         if (var7.field4168 > 0) {
            var10 = class354.method7398(var7);
         }

         if (var10) {
            if (class185.method4212(class388.method8204(var7), var6 - 1)) {
               class329 var9;
               if (var5 == 0) {
                  var9 = EnumComposition.getPacketBufferNode(ClientPackets.field3549, client.packetWriter.isaacCipher);
                  var9.out.writeIntBigEndian(var1);
                  var9.out.writeShortBigEndian(var2);
                  var9.out.writeShortBigEndian(var3);
                  var9.out.writeByte(var6);
                  client.packetWriter.addNode(var9);
               } else {
                  var9 = EnumComposition.getPacketBufferNode(ClientPackets.field3640, client.packetWriter.isaacCipher);
                  var9.out.writeIntBigEndian(var1);
                  var9.out.writeShortBigEndian(var2);
                  var9.out.writeShortBigEndian(var3);
                  var9.out.writeByte(var6);
                  var9.out.writeByte(var5 - 1);
                  client.packetWriter.addNode(var9);
               }

            }
         }
      }
   }
}
