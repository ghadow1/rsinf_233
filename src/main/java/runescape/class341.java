package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
public class class341 {
   @ObfuscatedName("aq")
   static final byte[] field3938 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lwb;"
   )
   Buffer field3939 = new Buffer((byte[])null);
   @ObfuscatedName("as")
   int field3940;
   @ObfuscatedName("al")
   int[] field3946;
   @ObfuscatedName("au")
   int field3935;
   @ObfuscatedName("ai")
   int[] field3943;
   @ObfuscatedName("aa")
   int[] field3942;
   @ObfuscatedName("am")
   int[] field3945;
   @ObfuscatedName("an")
   long field3941;

   class341() {
   }

   @ObfuscatedName("af")
   void method7293(byte[] var1) {
      this.field3939.array = var1;
      this.field3939.offset = 1390863506;
      int var2 = this.field3939.readUnsignedShort();
      this.field3940 = this.field3939.readUnsignedShort();
      this.field3935 = 500000;
      this.field3943 = new int[var2];

      Buffer var10000;
      int var3;
      int var5;
      for(var3 = 0; var3 < var2; var10000.offset += var5 * -290410379) {
         int var4 = this.field3939.read32BitArray();
         var5 = this.field3939.read32BitArray();
         if (var4 == 1297379947) {
            this.field3943[var3] = this.field3939.offset * 1216585693;
            ++var3;
         }

         var10000 = this.field3939;
      }

      this.field3941 = 0L;
      this.field3942 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field3942[var3] = this.field3943[var3];
      }

      this.field3946 = new int[var2];
      this.field3945 = new int[var2];
   }

   @ObfuscatedName("aw")
   void method7271() {
      this.field3939.array = null;
      this.field3943 = null;
      this.field3942 = null;
      this.field3946 = null;
      this.field3945 = null;
   }

   @ObfuscatedName("at")
   boolean method7290() {
      return this.field3939.array != null;
   }

   @ObfuscatedName("ac")
   int method7275() {
      return this.field3942.length;
   }

   @ObfuscatedName("ap")
   void method7269(int var1) {
      this.field3939.offset = this.field3942[var1] * -290410379;
   }

   @ObfuscatedName("aq")
   void method7301(int var1) {
      this.field3942[var1] = this.field3939.offset * 1216585693;
   }

   @ObfuscatedName("ao")
   void method7284() {
      this.field3939.offset = 290410379;
   }

   @ObfuscatedName("as")
   void method7276(int var1) {
      int var2 = this.field3939.method11217();
      int[] var10000 = this.field3946;
      var10000[var1] += var2;
   }

   @ObfuscatedName("al")
   int method7277(int var1) {
      int var2 = this.method7278(var1);
      return var2;
   }

   @ObfuscatedName("au")
   int method7278(int var1) {
      byte var2 = this.field3939.array[this.field3939.offset * 1216585693];
      Buffer var10000;
      int var5;
      if (var2 < 0) {
         var5 = var2 & 255;
         this.field3945[var1] = var5;
         var10000 = this.field3939;
         var10000.offset += -290410379;
      } else {
         var5 = this.field3945[var1];
      }

      if (var5 != 240 && var5 != 247) {
         return this.method7273(var1, var5);
      } else {
         int var3 = this.field3939.method11217();
         if (var5 == 247 && var3 > 0) {
            int var4 = this.field3939.array[this.field3939.offset * 1216585693] & 255;
            if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               var10000 = this.field3939;
               var10000.offset += -290410379;
               this.field3945[var1] = var4;
               return this.method7273(var1, var4);
            }
         }

         var10000 = this.field3939;
         var10000.offset += var3 * -290410379;
         return 0;
      }
   }

   @ObfuscatedName("ai")
   int method7273(int var1, int var2) {
      int var4;
      if (var2 == 255) {
         int var7 = this.field3939.method11196();
         var4 = this.field3939.method11217();
         Buffer var10000;
         if (var7 == 47) {
            var10000 = this.field3939;
            var10000.offset += var4 * -290410379;
            return 1;
         } else if (var7 == 81) {
            int var5 = this.field3939.method11278();
            var4 -= 3;
            int var6 = this.field3946[var1];
            this.field3941 += (long)var6 * (long)(this.field3935 - var5);
            this.field3935 = var5;
            var10000 = this.field3939;
            var10000.offset += var4 * -290410379;
            return 2;
         } else {
            var10000 = this.field3939;
            var10000.offset += var4 * -290410379;
            return 3;
         }
      } else {
         byte var3 = field3938[var2 - 128];
         var4 = var2;
         if (var3 >= 1) {
            var4 = var2 | this.field3939.method11196() << 8;
         }

         if (var3 >= 2) {
            var4 |= this.field3939.method11196() << 16;
         }

         return var4;
      }
   }

   @ObfuscatedName("aa")
   long method7280(int var1) {
      return this.field3941 + (long)var1 * (long)this.field3935;
   }

   @ObfuscatedName("am")
   int method7270() {
      int var1 = this.field3942.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if (this.field3942[var4] >= 0 && this.field3946[var4] < var3) {
            var2 = var4;
            var3 = this.field3946[var4];
         }
      }

      return var2;
   }

   @ObfuscatedName("an")
   boolean method7282() {
      int var1 = this.field3942.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.field3942[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

   @ObfuscatedName("ar")
   void method7283(long var1) {
      this.field3941 = var1;
      int var3 = this.field3942.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field3946[var4] = 0;
         this.field3945[var4] = 0;
         this.field3939.offset = this.field3943[var4] * -290410379;
         this.method7276(var4);
         this.field3942[var4] = this.field3939.offset * 1216585693;
      }

   }
}
