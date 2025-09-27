package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
public class class443 {
   @ObfuscatedName("af")
   public static final char[] field5142 = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ldr;IIIII)V",
      garbageValue = "309725002"
   )
   static final void method8868(class79 var0, int var1, int var2, int var3, int var4) {
      int[][][] var5 = var0.field1173;
      int var6 = var0.field1162 - 1;
      int var7 = var0.field1163 - 1;

      for(int var8 = var2; var8 <= var2 + var4; ++var8) {
         for(int var9 = var1; var9 <= var3 + var1; ++var9) {
            if (var9 >= 0 && var9 < var5[0].length - 1 && var8 >= 0 && var8 < var5[0][0].length - 1) {
               class59.field849[0][var9][var8] = 127;
               if (var9 == var1 && var9 > 0) {
                  var5[0][var9][var8] = var5[0][var9 - 1][var8];
               }

               if (var9 == var3 + var1 && var9 < var6) {
                  var5[0][var9][var8] = var5[0][var9 + 1][var8];
               }

               if (var8 == var2 && var8 > 0) {
                  var5[0][var9][var8] = var5[0][var9][var8 - 1];
               }

               if (var8 == var2 + var4 && var8 < var7) {
                  var5[0][var9][var8] = var5[0][var9][var8 + 1];
               }
            }
         }
      }

   }
}
