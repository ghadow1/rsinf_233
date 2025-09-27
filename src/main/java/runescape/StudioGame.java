package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public class StudioGame {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lqj;"
   )
   static final StudioGame field5088 = new StudioGame();
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lqj;"
   )
   static final StudioGame field5085 = new StudioGame();
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lqj;"
   )
   static final StudioGame field5086 = new StudioGame();
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lqj;"
   )
   static final StudioGame field5087 = new StudioGame();
   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      descriptor = "Lop;"
   )
   static class387 field5084;

   StudioGame() {
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Ljn;IIIIB)Z",
      garbageValue = "-90"
   )
   static boolean method8641(class241 var0, int var1, int var2, int var3, int var4) {
      class232 var5 = var0.method5458(var1);
      int var6 = var2 + var5.field2799;
      int var7 = var3 + var5.field2794;
      int var8 = var4 + var5.field2795;
      int var9 = var5.field2796;
      int var10 = var5.field2797;
      int var11 = var5.field2792;
      int var12 = class201.field2208 - var6;
      int var13 = class204.field2248 - var7;
      int var14 = class179.field1967 - var8;
      if (Math.abs(var12) > var9 + class76.field1113) {
         return false;
      } else if (Math.abs(var13) > var10 + class556.field5750) {
         return false;
      } else if (Math.abs(var14) > var11 + class308.field3500) {
         return false;
      } else if (Math.abs(var14 * class179.field1965 - var13 * EnumComposition.field1591) > var10 * class308.field3500 + var11 * class556.field5750) {
         return false;
      } else if (Math.abs(var12 * EnumComposition.field1591 - var14 * class450.field5166) > var11 * class76.field1113 + var9 * class308.field3500) {
         return false;
      } else {
         return Math.abs(var13 * class450.field5166 - var12 * class179.field1965) <= var9 * class556.field5750 + var10 * class76.field1113;
      }
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "5438"
   )
   static void method8640(int var0) {
      if (var0 != -1) {
         if (class119.field1554.method7478(var0)) {
            class369[] var1 = class119.field1554.field4037[var0];

            for(int var2 = 0; var2 < var1.length; ++var2) {
               class369 var3 = var1[var2];
               if (var3.field4195 != null) {
                  class65 var4 = new class65();
                  var4.field893 = var3;
                  var4.field898 = var3.field4195;
                  class137.method3666(var4, 5000000, 0);
               }
            }

         }
      }
   }
}
