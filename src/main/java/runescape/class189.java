package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hf")
public class class189 extends class540 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class320 field2064 = new class320(64);

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)J",
      garbageValue = "-1682751225"
   )
   public static final synchronized long method4284() {
      long var0 = System.currentTimeMillis();
      if (var0 < class334.field3839) {
         class334.field3838 += class334.field3839 - var0;
      }

      class334.field3839 = var0;
      return class334.field3838 + var0;
   }

   @ObfuscatedName("af")
   public static String method4285(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (0L == var0 % 37L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = class447.field5151[(int)(var6 - 37L * var0)];
               if (var8 == '_') {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }
}
