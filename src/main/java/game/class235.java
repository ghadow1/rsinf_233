package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class235 extends class540 {
   @ObfuscatedName("ah")
   static int[] field2814;
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lmv;"
   )
   static class312 field2810;
   @ObfuscatedName("lh")
   @ObfuscatedGetter(
      intValue = -878993875
   )
   static int field2812;
   @ObfuscatedName("pg")
   static int[] field2811;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "[Lip;"
   )
   class222[] field2808;

   @ObfuscatedSignature(
      descriptor = "(Lpx;Lpx;I)V"
   )
   class235(class412 var1, class412 var2, int var3) {
      int var4 = var1.method8347(var3);
      this.field2808 = new class222[var4];
      class229 var5 = null;
      int[] var6 = var1.method8353(var3);

      for(int var7 = 0; var7 < var6.length; ++var7) {
         byte[] var8 = var1.method8335(var3, var6[var7]);
         if (var5 == null) {
            int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
            byte[] var10 = var2.method8343(var9, 0);
            var5 = new class229(var9, var10);
         }

         this.field2808[var6[var7]] = new class222(var8, var5);
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "65"
   )
   public boolean method5380(int var1) {
      return this.field2808[var1].field2590;
   }
}
