package runescape;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
public abstract class class511 {
   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "Lrw;"
   )
   static class449 field5447;

   class511() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "2030306076"
   )
   public abstract boolean vmethod10194(int var1) throws IOException;

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "397267938"
   )
   public abstract int available() throws IOException;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   public abstract int readUnsignedByte() throws IOException;

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "([BIII)I",
      garbageValue = "2145484894"
   )
   public abstract int read(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "-1472304779"
   )
   public abstract void vmethod10197(byte[] var1, int var2, int var3) throws IOException;

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "217506457"
   )
   public abstract void vmethod10196();

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-23187275"
   )
   public static int method10164(int var0) {
      int var1 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var1 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var1 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var1 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var1 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var1;
      }

      return var0 + var1;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)[Lxt;",
      garbageValue = "-45505440"
   )
   static class605[] method10192() {
      class605[] var0 = new class605[class606.field6026];

      for(int var1 = 0; var1 < class606.field6026; ++var1) {
         class605 var2 = var0[var1] = new class605();
         var2.field6022 = class606.field6025;
         var2.field6024 = class581.field5847;
         var2.field6021 = class149.field1763[var1];
         var2.field6023 = class191.field2082[var1];
         var2.field6019 = class255.field3068[var1];
         var2.field6020 = class497.field5390[var1];
         int var3 = var2.field6019 * var2.field6020;
         byte[] var4 = class7.field25[var1];
         var2.field6018 = new int[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = var4[var5] & 255;
            var2.field6018[var5] = class504.field5414[var6];
         }
      }

      class388.method8205();
      return var0;
   }

   @ObfuscatedName("mj")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/String;",
      garbageValue = "110"
   )
   static final String method10167(int var0) {
      return var0 < 999999999 ? Integer.toString(var0) : "*";
   }

   @ObfuscatedName("pm")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1523710913"
   )
   static void method10165(int var0) {
      class215 var1 = class177.method4155(var0);
      if (var1.method4768()) {
         int var3 = var1.field2458;
         class146 var4 = class120.method3516(var3);
         int var2;
         if (var4 == null) {
            var2 = 2;
         } else {
            var2 = var4.method3754() ? 0 : 1;
         }

         if (var2 == 2) {
            client.field601.add(var1.field2458);
         }

      }
   }
}
