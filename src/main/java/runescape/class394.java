package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pd")
public enum class394 implements class430 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpd;"
   )
   field4796(0, 0),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lpd;"
   )
   field4801(1, 1),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lpd;"
   )
   field4797(2, 2);

   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1406474017
   )
   final int field4798;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 391018745
   )
   final int field4795;

   class394(int var3, int var4) {
      this.field4798 = var3;
      this.field4795 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1935172756"
   )
   public int vmethod11658() {
      return this.field4795;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)I",
      garbageValue = "-8682948"
   )
   public static int method8225(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = 0;
      if (var0 < var2) {
         var6 += var2 - var0;
      } else if (var0 > var4) {
         var6 += var0 - var4;
      }

      if (var1 < var3) {
         var6 += var3 - var1;
      } else if (var1 > var5) {
         var6 += var1 - var5;
      }

      return var6;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)Lti;",
      garbageValue = "-888133188"
   )
   public static class519 method8223(Buffer var0) {
      int var1 = var0.readUnsignedShort();
      if (var1 >= 0 && var1 <= 5000) {
         int var2 = var0.method11196();
         int var4;
         if (var2 == 0) {
            int[] var8 = new int[var1];

            for(var4 = 0; var4 < var1; ++var4) {
               var8[var4] = var0.read32BitArray();
            }

            class519 var5 = new class519(class574.field5820, false);
            var5.field5505 = var8;
            var5.field5502 = var8.length * -698619497;
            var5.field5503 = var8.length;
            return var5;
         } else if (var2 == 1) {
            long[] var7 = new long[var1];

            for(var4 = 0; var4 < var1; ++var4) {
               var7[var4] = var0.method11203();
            }

            return class108.method3371(var7);
         } else if (var2 != 2) {
            throw new RuntimeException();
         } else {
            String[] var3 = new String[var1];

            for(var4 = 0; var4 < var1; ++var4) {
               var3[var4] = var0.method11207();
            }

            return class306.method6858(var3);
         }
      } else {
         throw new RuntimeException();
      }
   }
}
