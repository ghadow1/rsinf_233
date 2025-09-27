package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
public class class312 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1321013979
   )
   public int field3512;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lna;"
   )
   public class356 field3510;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lna;"
   )
   public class356 field3511;

   @ObfuscatedSignature(
      descriptor = "(ILna;Lna;)V"
   )
   public class312(int var1, class356 var2, class356 var3) {
      this.field3512 = var1;
      this.field3510 = var2;
      this.field3511 = var3;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-2121206854"
   )
   public static int method6969(int var0, int var1, int var2) {
      int var3 = client.method1134(var2 - var1 + 1);
      var3 <<= var1;
      var0 |= var3;
      return var0;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-2088249437"
   )
   static final int method6970(int var0, int var1) {
      if (var0 == -2) {
         return 12345678;
      } else if (var0 == -1) {
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return var1;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }
}
