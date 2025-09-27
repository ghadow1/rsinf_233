package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public class class403 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IZI)[B",
      garbageValue = "1862088618"
   )
   public static byte[] method8271(int var0, boolean var1) {
      synchronized(class482.field5317) {
         byte[] var3;
         if ((var0 == 100 || var0 < 100 && var1) && class482.field5329 > 0) {
            var3 = class482.field5326[--class482.field5329];
            class482.field5326[class482.field5329] = null;
            return var3;
         }

         if ((var0 == 5000 || var0 < 5000 && var1) && class482.field5319 > 0) {
            var3 = class482.field5327[--class482.field5319];
            class482.field5327[class482.field5319] = null;
            return var3;
         }

         if ((var0 == 10000 || var0 < 10000 && var1) && class482.field5323 > 0) {
            var3 = class482.field5318[--class482.field5323];
            class482.field5318[class482.field5323] = null;
            return var3;
         }

         if ((var0 == 30000 || var0 < 30000 && var1) && class482.field5321 > 0) {
            var3 = class482.field5328[--class482.field5321];
            class482.field5328[class482.field5321] = null;
            return var3;
         }

         int var6;
         if (class67.ByteArrayPool_arrays != null) {
            for(var6 = 0; var6 < class482.ByteArrayPool_alternativeSizes.length; ++var6) {
               if ((class482.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < class482.ByteArrayPool_alternativeSizes[var6] && var1) && class476.ByteArrayPool_altSizeArrayCounts[var6] > 0) {
                  byte[] var4 = class67.ByteArrayPool_arrays[var6][--class476.ByteArrayPool_altSizeArrayCounts[var6]];
                  class67.ByteArrayPool_arrays[var6][class476.ByteArrayPool_altSizeArrayCounts[var6]] = null;
                  return var4;
               }
            }
         }

         if (var1 && class482.ByteArrayPool_alternativeSizes != null) {
            for(var6 = 0; var6 < class482.ByteArrayPool_alternativeSizes.length; ++var6) {
               if (var0 <= class482.ByteArrayPool_alternativeSizes[var6] && class476.ByteArrayPool_altSizeArrayCounts[var6] < class67.ByteArrayPool_arrays[var6].length) {
                  return new byte[class482.ByteArrayPool_alternativeSizes[var6]];
               }
            }
         }
      }

      return new byte[var0];
   }
}
