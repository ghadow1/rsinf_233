package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
public enum class193 implements class430 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lhp;"
   )
   field2089(2, 0),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lhp;"
   )
   field2086(0, 1),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lhp;"
   )
   field2088(1, 2);

   @ObfuscatedName("ky")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field2091;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1646399517
   )
   public final int field2090;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 173630741
   )
   final int field2087;

   class193(int var3, int var4) {
      this.field2090 = var3;
      this.field2087 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1935172756"
   )
   public int vmethod11658() {
      return this.field2087;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1168196192"
   )
   public static void method4316() {
      class262.field3116.clear();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "([BIIB)Z",
      garbageValue = "34"
   )
   static final boolean method4320(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      class590 var4 = new class590(var0);
      int var5 = -1;

      label72:
      while(true) {
         int var6 = var4.method11214();
         if (var6 == 0) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.method11212();
               if (var9 == 0) {
                  continue label72;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.method11196() >> 2;
               int var13 = var11 + var1;
               int var14 = var10 + var2;
               if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  class212 var15 = class433.method8669(var5);
                  if (var12 != 22 || !client.field565 || var15.field2308 != 0 || var15.field2331 == 1 || var15.field2333) {
                     if (!var15.method4607()) {
                        ++client.field329;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.method11212();
            if (var9 == 0) {
               break;
            }

            var4.method11196();
         }
      }
   }

   @ObfuscatedName("lg")
   @ObfuscatedSignature(
      descriptor = "(Ldt;B)V",
      garbageValue = "52"
   )
   static void method4319(class81 var0) {
      var0.field1059 = var0.field1184.field2111;
      var0.field1099 = var0.field1184.field2140;
      var0.field1063 = var0.field1184.field2117;
      var0.field1088 = var0.field1184.field2129;
      var0.field1096 = var0.field1184.field2132;
      var0.field1066 = var0.field1184.field2113;
      var0.field1060 = var0.field1184.field2114;
      var0.field1064 = var0.field1184.field2108;
      var0.field1062 = var0.field1184.field2116;
      var0.field1067 = var0.field1184.field2121;
      var0.field1068 = var0.field1184.field2133;
      var0.field1065 = var0.field1184.field2155;
      var0.field1090 = var0.field1184.field2124;
      var0.field1071 = var0.field1184.field2125;
      var0.field1069 = var0.field1184.field2126;
      var0.field1061 = var0.field1184.field2115;
      var0.field1105 = var0.field1184.field2122;
   }
}
