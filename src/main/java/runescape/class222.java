package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public class class222 {
   @ObfuscatedName("af")
   static int[] field2598 = new int[500];
   @ObfuscatedName("aw")
   static int[] field2589 = new int[500];
   @ObfuscatedName("at")
   static int[] field2593 = new int[500];
   @ObfuscatedName("ac")
   static int[] field2591 = new int[500];
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lin;"
   )
   class229 field2592 = null;
   @ObfuscatedName("aq")
   int field2588 = -1;
   @ObfuscatedName("ao")
   int[] field2594;
   @ObfuscatedName("as")
   int[] field2595;
   @ObfuscatedName("al")
   int[] field2596;
   @ObfuscatedName("au")
   int[] field2597;
   @ObfuscatedName("ai")
   boolean field2590 = false;

   @ObfuscatedSignature(
      descriptor = "([BLin;)V"
   )
   class222(byte[] var1, class229 var2) {
      this.field2592 = var2;
      Buffer var3 = new Buffer(var1);
      Buffer var4 = new Buffer(var1);
      var3.offset = -580820758;
      int var5 = var3.method11196();
      int var6 = -1;
      int var7 = 0;
      var4.offset = (var5 + var3.offset * 1216585693) * -290410379;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.method11196();
         if (var9 > 0) {
            if (this.field2592.field2676[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if (this.field2592.field2676[var10] == 0) {
                     field2598[var7] = var10;
                     field2589[var7] = 0;
                     field2593[var7] = 0;
                     field2591[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field2598[var7] = var8;
            short var11 = 0;
            if (this.field2592.field2676[var8] == 3) {
               var11 = 128;
            }

            if ((var9 & 1) != 0) {
               field2589[var7] = var4.method11211();
            } else {
               field2589[var7] = var11;
            }

            if ((var9 & 2) != 0) {
               field2593[var7] = var4.method11211();
            } else {
               field2593[var7] = var11;
            }

            if ((var9 & 4) != 0) {
               field2591[var7] = var4.method11211();
            } else {
               field2591[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if (this.field2592.field2676[var8] == 5) {
               this.field2590 = true;
            }
         }
      }

      if (var1.length != var4.offset * 1216585693) {
         throw new RuntimeException();
      } else {
         this.field2588 = var7;
         this.field2594 = new int[var7];
         this.field2595 = new int[var7];
         this.field2596 = new int[var7];
         this.field2597 = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.field2594[var8] = field2598[var8];
            this.field2595[var8] = field2589[var8];
            this.field2596[var8] = field2593[var8];
            this.field2597[var8] = field2591[var8];
         }

         var3.offset = var4.offset;
      }
   }
}
