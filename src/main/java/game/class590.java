package game;

import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wb")
public class class590 extends class544 {
   @ObfuscatedName("au")
   public static long[] field5917 = new long[256];
   @ObfuscatedName("ai")
   static int[] field5918 = new int[256];
   @ObfuscatedName("aa")
   public byte[] index;
   @ObfuscatedName("am")
   public int buffer;

   static {
      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var4 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if ((var4 & 1) == 1) {
               var4 = var4 >>> 1 ^ -306674912;
            } else {
               var4 >>>= 1;
            }
         }

         field5918[var1] = var4;
      }

      for(var2 = 0; var2 < 256; ++var2) {
         long var0 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if ((var0 & 1L) == 1L) {
               var0 = var0 >>> 1 ^ -3932672073523589310L;
            } else {
               var0 >>>= 1;
            }
         }

         field5917[var2] = var0;
      }

   }

   public class590(int var1, boolean var2) {
      this.method11175(var1, var2);
   }

   public class590(int var1) {
      this.index = class137.method3661(var1);
      this.buffer = 0;
   }

   public class590(byte[] var1) {
      this.index = var1;
      this.buffer = 0;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "119"
   )
   void vmethod11176() {
      if (this.index != null) {
         class306.method6841(this.index);
      }

      this.index = null;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "-620775171"
   )
   void method11175(int var1, boolean var2) {
      this.vmethod11176();
      this.index = class403.method8271(var1, var2);
      this.buffer = 0;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-73"
   )
   //..writes a single byte
   public void writeByte(int var1) {
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)var1;
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1788367333"
   )
   //..writes a two-byte integer
   public void writeShortBigEndian(int var1) {
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)var1;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-592596333"
   )
   public void writeTriByte(int var1) {
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 16);
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)var1;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1216921951"
   )
   public void writeIntBigEndian(int var1) {
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 24);
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 16);
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)var1;
   }

   @ObfuscatedName("bv")
   public void method11286(long var1) {
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 40));
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 32));
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 24));
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 16));
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 8));
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("bj")
   public void method11182(long var1) {
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 56));
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 48));
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 40));
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 32));
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 24));
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 16));
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)((int)(var1 >> 8));
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)((int)var1);
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "995519023"
   )
   public void method11264(boolean var1) {
      this.writeByte(var1 ? 1 : 0);
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-110"
   )

   //.. writes a null-terminated string
   public void writeNullTermString(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.buffer += class273.method6112(var1, 0, var1.length(), this.index, 1216585693 * this.buffer) * -290410379;
         this.index[(this.buffer += -290410379) * 1216585693 - 1] = 0;
      }
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "68"
   )
   //..writes a null-terminated string to a byte array
   public void nullterminatedStringWrite(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.index[(this.buffer += -290410379) * 1216585693 - 1] = 0;
         this.buffer += class273.method6112(var1, 0, var1.length(), this.index, this.buffer * 1216585693) * -290410379;
         this.index[(this.buffer += -290410379) * 1216585693 - 1] = 0;
      }
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;B)V",
      garbageValue = "1"
   )
   public void method11397(CharSequence var1) {
      int var2 = class207.method4519(var1);
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = 0;
      this.method11193(var2);
      int var3 = this.buffer;
      byte[] var5 = this.index;
      int var6 = this.buffer * 1216585693;
      int var7 = var1.length();
      int var8 = var6;

      for(int var9 = 0; var9 < var7; ++var9) {
         char var10 = var1.charAt(var9);
         if (var10 <= 127) {
            var5[var8++] = (byte)var10;
         } else if (var10 <= 2047) {
            var5[var8++] = (byte)(192 | var10 >> 6);
            var5[var8++] = (byte)(128 | var10 & 63);
         } else {
            var5[var8++] = (byte)(224 | var10 >> 12);
            var5[var8++] = (byte)(128 | var10 >> 6 & 63);
            var5[var8++] = (byte)(128 | var10 & 63);
         }
      }

      int var4 = var8 - var6;
      this.buffer = var4 * -290410379 + var3;
   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "-327455358"
   )
   //..copies a section of one byte array (var1) to another (this.index).
   public void copyArray(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         this.index[(this.buffer += -290410379) * 1216585693 - 1] = var1[var4];
      }

   }

   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-587312583"
   )
   public void method11188(class590 var1) {
      this.copyArray(var1.index, 0, var1.buffer * 1216585693);
   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1789700528"
   )
   public void method11189(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.index[this.buffer * 1216585693 - var1 - 4] = (byte)(var1 >> 24);
         this.index[this.buffer * 1216585693 - var1 - 3] = (byte)(var1 >> 16);
         this.index[this.buffer * 1216585693 - var1 - 2] = (byte)(var1 >> 8);
         this.index[this.buffer * 1216585693 - var1 - 1] = (byte)var1;
      }
   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1590303875"
   )
   //..writes a 16-bit integer (a short) into a byte array (this.index) at an
   // index that is relative to the integer's own value. The method includes a
   // basic validation check to ensure the input integer is within the valid
   // range for a 16-bit unsigned value.
   public void putUnsignedShortBigEndian(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.index[this.buffer * 1216585693 - var1 - 2] = (byte)(var1 >> 8);
         this.index[this.buffer * 1216585693 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "55"
   )
   public void method11191(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.index[this.buffer * 1216585693 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "62"
   )
   public void method11192(int var1) {
      if (var1 >= 0 && var1 < 128) {
         this.writeByte(var1);
      } else if (var1 >= 0 && var1 < 32768) {
         this.writeShortBigEndian(var1 + '耀');
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1904864344"
   )
   public void method11193(int var1) {
      if ((var1 & -128) != 0) {
         if ((var1 & -16384) != 0) {
            if ((var1 & -2097152) != 0) {
               if ((var1 & -268435456) != 0) {
                  this.writeByte(var1 >>> 28 | 128);
               }

               this.writeByte(var1 >>> 21 | 128);
            }

            this.writeByte(var1 >>> 14 | 128);
         }

         this.writeByte(var1 >>> 7 | 128);
      }

      this.writeByte(var1 & 127);
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-962568706"
   )
   void method11194(int var1) {
      while(var1 < 0 || var1 > 127) {
         this.writeByte(128 | var1 & 127);
         var1 >>>= 7;
      }

      this.writeByte(var1);
   }

   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2009520810"
   )
   public void method11443(int var1) {
      var1 = var1 << 1 ^ var1 >> 31;
      this.method11194(var1);
   }

   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-99"
   )
   public int method11196() {
      return this.index[(this.buffer += -290410379) * 1216585693 - 1] & 255;
   }

   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "(I)B",
      garbageValue = "-2036678009"
   )
   public byte method11197() {
      return this.index[(this.buffer += -290410379) * 1216585693 - 1];
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1767223356"
   )
   public int method11198() {
      this.buffer += -580820758;
      return (this.index[this.buffer * 1216585693 - 1] & 255) + ((this.index[this.buffer * 1216585693 - 2] & 255) << 8);
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-11"
   )
   public int method11452() {
      this.buffer += -580820758;
      int var1 = (this.index[this.buffer * 1216585693 - 1] & 255) + ((this.index[this.buffer * 1216585693 - 2] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-915086141"
   )
   public int method11278() {
      this.buffer += -871231137;
      return (this.index[this.buffer * 1216585693 - 1] & 255) + ((this.index[this.buffer * 1216585693 - 3] & 255) << 16) + ((this.index[this.buffer * 1216585693 - 2] & 255) << 8);
   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "678074504"
   )
   public int method11291() {
      this.buffer += -871231137;
      int var1 = (this.index[this.buffer * 1216585693 - 1] & 255) + ((this.index[this.buffer * 1216585693 - 3] & 255) << 16) + ((this.index[this.buffer * 1216585693 - 2] & 255) << 8);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1358414633"
   )
   public int method11202() {
      this.buffer += -1161641516;
      return (this.index[this.buffer * 1216585693 - 1] & 255) + ((this.index[this.buffer * 1216585693 - 2] & 255) << 8) + ((this.index[this.buffer * 1216585693 - 4] & 255) << 24) + ((this.index[this.buffer * 1216585693 - 3] & 255) << 16);
   }

   @ObfuscatedName("cx")
   @ObfuscatedSignature(
      descriptor = "(B)J",
      garbageValue = "5"
   )
   public long method11203() {
      long var1 = (long)this.method11202() & 4294967295L;
      long var3 = (long)this.method11202() & 4294967295L;
      return (var1 << 32) + var3;
   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "(I)F",
      garbageValue = "-1018946723"
   )
   public float method11362() {
      return Float.intBitsToFloat(this.method11202());
   }

   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-109"
   )
   public boolean method11412() {
      return (this.method11196() & 1) == 1;
   }

   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1297997464"
   )
   public String method11206() {
      if (this.index[this.buffer * 1216585693] == 0) {
         this.buffer += -290410379;
         return null;
      } else {
         return this.method11207();
      }
   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "-59"
   )
   public String method11207() {
      int var1 = this.buffer * 1216585693;

      while(this.index[(this.buffer += -290410379) * 1216585693 - 1] != 0) {
      }

      int var2 = this.buffer * 1216585693 - var1 - 1;
      return var2 == 0 ? "" : class214.method4757(this.index, var1, var2);
   }

   @ObfuscatedName("ck")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "60"
   )
   public String method11361() {
      byte var1 = this.index[(this.buffer += -290410379) * 1216585693 - 1];
      if (var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.buffer * 1216585693;

         while(this.index[(this.buffer += -290410379) * 1216585693 - 1] != 0) {
         }

         int var3 = this.buffer * 1216585693 - var2 - 1;
         return var3 == 0 ? "" : class214.method4757(this.index, var2, var3);
      }
   }

   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "7"
   )
   public String method11209() {
      byte var1 = this.index[(this.buffer += -290410379) * 1216585693 - 1];
      if (var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.method11217();
         if (var2 + this.buffer * 1216585693 > this.index.length) {
            throw new IllegalStateException("");
         } else {
            byte[] var4 = this.index;
            int var5 = this.buffer * 1216585693;
            char[] var6 = new char[var2];
            int var7 = 0;
            int var8 = var5;

            int var11;
            for(int var9 = var2 + var5; var8 < var9; var6[var7++] = (char)var11) {
               int var10 = var4[var8++] & 255;
               if (var10 < 128) {
                  if (var10 == 0) {
                     var11 = 65533;
                  } else {
                     var11 = var10;
                  }
               } else if (var10 < 192) {
                  var11 = 65533;
               } else if (var10 < 224) {
                  if (var8 < var9 && (var4[var8] & 192) == 128) {
                     var11 = (var10 & 31) << 6 | var4[var8++] & 63;
                     if (var11 < 128) {
                        var11 = 65533;
                     }
                  } else {
                     var11 = 65533;
                  }
               } else if (var10 < 240) {
                  if (var8 + 1 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128) {
                     var11 = (var10 & 15) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
                     if (var11 < 2048) {
                        var11 = 65533;
                     }
                  } else {
                     var11 = 65533;
                  }
               } else if (var10 < 248) {
                  if (var8 + 2 < var9 && (var4[var8] & 192) == 128 && (var4[var8 + 1] & 192) == 128 && (var4[var8 + 2] & 192) == 128) {
                     var11 = (var10 & 7) << 18 | (var4[var8++] & 63) << 12 | (var4[var8++] & 63) << 6 | var4[var8++] & 63;
                     if (var11 >= 65536 && var11 <= 1114111) {
                        var11 = 65533;
                     } else {
                        var11 = 65533;
                     }
                  } else {
                     var11 = 65533;
                  }
               } else {
                  var11 = 65533;
               }
            }

            String var3 = new String(var6, 0, var7);
            this.buffer += -290410379 * var2;
            return var3;
         }
      }
   }

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "48009855"
   )
   public void method11266(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = this.index[(this.buffer += -290410379) * 1216585693 - 1];
      }

   }

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1340131211"
   )
   public int method11211() {
      int var1 = this.index[this.buffer * 1216585693] & 255;
      return var1 < 128 ? this.method11196() - 64 : this.method11198() - '쀀';
   }

   @ObfuscatedName("dd")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "42"
   )
   public int method11212() {
      int var1 = this.index[this.buffer * 1216585693] & 255;
      return var1 < 128 ? this.method11196() : this.method11198() - '耀';
   }

   @ObfuscatedName("dr")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1987050920"
   )
   public int method11213() {
      int var1 = this.index[this.buffer * 1216585693] & 255;
      return var1 < 128 ? this.method11196() - 1 : this.method11198() - '老';
   }

   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-375298005"
   )
   public int method11214() {
      int var1 = 0;

      int var2;
      for(var2 = this.method11212(); var2 == 32767; var2 = this.method11212()) {
         var1 += 32767;
      }

      var1 += var2;
      return var1;
   }

   @ObfuscatedName("dt")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1849660934"
   )
   public int method11215() {
      return this.index[this.buffer * 1216585693] < 0 ? this.method11202() & Integer.MAX_VALUE : this.method11198();
   }

   @ObfuscatedName("da")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-16"
   )
   public int method11222() {
      if (this.index[this.buffer * 1216585693] < 0) {
         return this.method11202() & Integer.MAX_VALUE;
      } else {
         int var1 = this.method11198();
         return var1 == 32767 ? -1 : var1;
      }
   }

   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "23"
   )
   public int method11217() {
      byte var1 = this.index[(this.buffer += -290410379) * 1216585693 - 1];

      int var2;
      for(var2 = 0; var1 < 0; var1 = this.index[(this.buffer += -290410379) * 1216585693 - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   @ObfuscatedName("dp")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1877481212"
   )
   public int method11218() {
      int var2 = 0;
      int var3 = 0;

      int var1;
      do {
         var1 = this.method11196();
         var2 |= (var1 & 127) << var3;
         var3 += 7;
      } while(var1 > 127);

      return var2;
   }

   @ObfuscatedName("dw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-75712416"
   )
   public int method11231() {
      int var1 = this.method11218();
      return var1 >>> 1 ^ -(var1 & 1);
   }

   @ObfuscatedName("db")
   @ObfuscatedSignature(
      descriptor = "([II)V",
      garbageValue = "1871840527"
   )
   public void method11220(int[] var1) {
      int var2 = this.buffer * 1216585693 / 8;
      this.buffer = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.method11202();
         int var5 = this.method11202();
         int var6 = 0;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
            var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3];
            var6 += var7;
         }

         this.buffer -= 1971684264;
         this.writeIntBigEndian(var4);
         this.writeIntBigEndian(var5);
      }

   }

   @ObfuscatedName("dq")
   @ObfuscatedSignature(
      descriptor = "([IS)V",
      garbageValue = "224"
   )
   public void method11305(int[] var1) {
      int var2 = this.buffer * 1216585693 / 8;
      this.buffer = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.method11202();
         int var5 = this.method11202();
         int var6 = -957401312;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var4 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var6 + var1[var6 & 3]) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
            var6 -= var7;
         }

         this.buffer -= 1971684264;
         this.writeIntBigEndian(var4);
         this.writeIntBigEndian(var5);
      }

   }

   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      descriptor = "([IIII)V",
      garbageValue = "-1090917467"
   )
   //..The code reads 64-bit blocks of data from a buffer,
   // decrypts them using a 128-bit key (var1),
   // and writes the decrypted data back to the same buffer.
   public void writeCrc(int[] var1, int var2, int var3) {
      int var4 = this.buffer * 1216585693;
      this.buffer = var2 * -290410379;
      int var5 = (var3 - var2) / 8;

      System.out.println("CRC SIZE "+var5);
      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.method11202();
         int var8 = this.method11202();
         int var9 = 0;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
            var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
            var9 += var10;
         }

         this.buffer -= 1971684264;
         this.writeIntBigEndian(var7);
         this.writeIntBigEndian(var8);
      }

      this.buffer = var4 * -290410379;
   }

   @ObfuscatedName("de")
   @ObfuscatedSignature(
      descriptor = "([IIII)V",
      garbageValue = "-1335983553"
   )
   public void method11223(int[] var1, int var2, int var3) {
      int var4 = this.buffer * 1216585693;
      this.buffer = var2 * -290410379;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.method11202();
         int var8 = this.method11202();
         int var9 = -957401312;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var7 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3]) {
            var8 -= var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
         }

         this.buffer -= 1971684264;
         this.writeIntBigEndian(var7);
         this.writeIntBigEndian(var8);
      }

      this.buffer = var4 * -290410379;
   }

   @ObfuscatedName("dy")
   @ObfuscatedSignature(
      descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V",
      garbageValue = "-197749771"
   )
   public void enableRSA(BigInteger var1, BigInteger var2) {
      int var3 = this.buffer * 1216585693;
      this.buffer = 0;
      byte[] var4 = new byte[var3];
      this.method11266(var4, 0, var3);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.buffer = 0;
      this.writeShortBigEndian(var7.length);
      this.copyArray(var7, 0, var7.length);
   }

   @ObfuscatedName("dm")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-2023947132"
   )
   public int method11225(int var1) {
      int var2 = class346.method7343(this.index, var1, this.buffer * 1216585693);
      this.writeIntBigEndian(var2);
      return var2;
   }

   @ObfuscatedName("dz")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-806179785"
   )
   public boolean method11242() {
      this.buffer -= -1161641516;
      int var1 = class346.method7343(this.index, 0, this.buffer * 1216585693);
      int var2 = this.method11202();
      return var2 == var1;
   }

   @ObfuscatedName("dg")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "35"
   )
   public void method11227(int var1) {
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("dl")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1237001541"
   )
   public void method11228(int var1) {
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(0 - var1);
   }

   @ObfuscatedName("dv")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-598220801"
   )
   public void method11229(int var1) {
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(128 - var1);
   }

   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1209505995"
   )
   public int method11230() {
      return this.index[(this.buffer += -290410379) * 1216585693 - 1] - 128 & 255;
   }

   @ObfuscatedName("dn")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1067471232"
   )
   public int method11281() {
      return 0 - this.index[(this.buffer += -290410379) * 1216585693 - 1] & 255;
   }

   @ObfuscatedName("di")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1042100603"
   )
   public int method11232() {
      return 128 - this.index[(this.buffer += -290410379) * 1216585693 - 1] & 255;
   }

   @ObfuscatedName("dj")
   @ObfuscatedSignature(
      descriptor = "(B)B",
      garbageValue = "110"
   )
   public byte method11233() {
      return (byte)(this.index[(this.buffer += -290410379) * 1216585693 - 1] - 128);
   }

   @ObfuscatedName("du")
   @ObfuscatedSignature(
      descriptor = "(I)B",
      garbageValue = "-2082310505"
   )
   public byte method11259() {
      return (byte)(0 - this.index[(this.buffer += -290410379) * 1216585693 - 1]);
   }

   @ObfuscatedName("do")
   @ObfuscatedSignature(
      descriptor = "(I)B",
      garbageValue = "-355932459"
   )
   public byte method11235() {
      return (byte)(128 - this.index[(this.buffer += -290410379) * 1216585693 - 1]);
   }

   @ObfuscatedName("ef")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-326263112"
   )
   public void method11236(int var1) {
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)var1;
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("ez")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2074279444"
   )
   public void method11325(int var1) {
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 + 128);
   }

   @ObfuscatedName("er")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2013052194"
   )
   public void method11238(int var1) {
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 + 128);
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("eb")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-431866276"
   )
   public int method11422() {
      this.buffer += -580820758;
      return ((this.index[this.buffer * 1216585693 - 1] & 255) << 8) + (this.index[this.buffer * 1216585693 - 2] & 255);
   }

   @ObfuscatedName("ec")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-785303486"
   )
   public int method11181() {
      this.buffer += -580820758;
      return (this.index[this.buffer * 1216585693 - 1] - 128 & 255) + ((this.index[this.buffer * 1216585693 - 2] & 255) << 8);
   }

   @ObfuscatedName("ew")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-549805098"
   )
   public int method11241() {
      this.buffer += -580820758;
      return ((this.index[this.buffer * 1216585693 - 1] & 255) << 8) + (this.index[this.buffer * 1216585693 - 2] - 128 & 255);
   }

   @ObfuscatedName("eo")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "775317943"
   )
   public int method11445() {
      this.buffer += -580820758;
      int var1 = ((this.index[this.buffer * 1216585693 - 1] & 255) << 8) + (this.index[this.buffer * 1216585693 - 2] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("eg")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1763870609"
   )
   public int method11243() {
      this.buffer += -580820758;
      int var1 = (this.index[this.buffer * 1216585693 - 1] - 128 & 255) + ((this.index[this.buffer * 1216585693 - 2] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("en")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1880016911"
   )
   public int method11244() {
      this.buffer += -580820758;
      int var1 = (this.index[this.buffer * 1216585693 - 2] - 128 & 255) + ((this.index[this.buffer * 1216585693 - 1] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   @ObfuscatedName("ek")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1450699290"
   )
   public void method11245(int var1) {
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)var1;
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 16);
   }

   @ObfuscatedName("es")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1328594169"
   )
   public int method11421() {
      this.buffer += -871231137;
      return (this.index[this.buffer * 1216585693 - 1] & 255) + ((this.index[this.buffer * 1216585693 - 2] & 255) << 16) + ((this.index[this.buffer * 1216585693 - 3] & 255) << 8);
   }

   @ObfuscatedName("ed")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1031453960"
   )
   public int method11247() {
      this.buffer += -871231137;
      int var1 = (this.index[this.buffer * 1216585693 - 2] & 255) + ((this.index[this.buffer * 1216585693 - 1] & 255) << 8) + ((this.index[this.buffer * 1216585693 - 3] & 255) << 16);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ObfuscatedName("ep")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "43"
   )
   public int method11248() {
      this.buffer += -871231137;
      int var1 = ((this.index[this.buffer * 1216585693 - 3] & 255) << 8) + (this.index[this.buffer * 1216585693 - 1] & 255) + ((this.index[this.buffer * 1216585693 - 2] & 255) << 16);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   @ObfuscatedName("eq")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2146012397"
   )
   //..write a 32-bit integer, provided by the var1 parameter
   public void putIntLittleEndian(int var1) {
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)var1;
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 16);
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 24);
   }

   @ObfuscatedName("eu")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1976728026"
   )
   //.. writes a 32-bit integer (int) into a byte
   public void putIntCustomEndian234(int var1) {
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)var1;
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 24);
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 16);
   }

   @ObfuscatedName("el")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1450609835"
   )
   //..writes a 32-bit integer (int) into a byte array
   public void putIntCustomEndian(int var1) {
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 16);
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 24);
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)var1;
      this.index[(this.buffer += -290410379) * 1216585693 - 1] = (byte)(var1 >> 8);
   }

   @ObfuscatedName("ey")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "98"
   )

   /**
    * Reads a 32-bit little-endian integer from a byte array at a given offset.
    * @param data The byte array to read from.
    * @param offset The starting position in the array.
    * @return The integer value.
    */
   public int readLittleEndianInt() {
      this.buffer += -1161641516;
      return ((this.index[this.buffer * 1216585693 - 1] & 255) << 24) + ((this.index[this.buffer * 1216585693 - 3] & 255) << 8) + ((this.index[this.buffer * 1216585693 - 2] & 255) << 16) + (this.index[this.buffer * 1216585693 - 4] & 255);
   }

   @ObfuscatedName("ea")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-28"
   )
   public int readCustomEndianInt() {
      this.buffer += -1161641516;
      return ((this.index[this.buffer * 1216585693 - 1] & 255) << 16) + ((this.index[this.buffer * 1216585693 - 4] & 255) << 8) + ((this.index[this.buffer * 1216585693 - 2] & 255) << 24) + (this.index[this.buffer * 1216585693 - 3] & 255);
   }

   @ObfuscatedName("ej")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-637976194"
   )
   public int readCustomEndianInt2() {
      this.buffer += -1161641516;
      return ((this.index[this.buffer * 1216585693 - 1] & 255) << 8) + ((this.index[this.buffer * 1216585693 - 3] & 255) << 24) + ((this.index[this.buffer * 1216585693 - 4] & 255) << 16) + (this.index[this.buffer * 1216585693 - 2] & 255);
   }

   @ObfuscatedName("ei")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "-852939771"
   )
   public void method11255(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = (byte)(this.index[(this.buffer += -290410379) * 1216585693 - 1] - 128);
      }

   }
}
