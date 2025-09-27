package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
public class class456 {
   @ObfuscatedName("af")
   float[] field5202;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 110203385
   )
   int field5203;

   class456(float[] var1, int var2) {
      this.field5202 = var1;
      this.field5203 = var2;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "4"
   )
   public static int method9207(int var0) {
      return var0 >>> 12;
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1312130987"
   )
   static int method9206(int var0) {
      return (int)((Math.log((double)var0) / class46.field657 - 7.0D) * 256.0D);
   }

   @ObfuscatedName("ko")
   @ObfuscatedSignature(
      descriptor = "(Ldr;IIIII)Lck;",
      garbageValue = "857025246"
   )
   static final class74 method9208(class79 var0, int var1, int var2, int var3, int var4) {
      for(class74 var5 = (class74)var0.field1158.method8690(); var5 != null; var5 = (class74)var0.field1158.method8692()) {
         if (var5.field1026 == var1 && var2 == var5.field1022 && var3 == var5.field1036 && var4 == var5.field1021) {
            return var5;
         }
      }

      return null;
   }
}
