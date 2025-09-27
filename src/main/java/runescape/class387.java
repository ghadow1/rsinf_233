package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
public enum class387 implements class430 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lop;"
   )
   field4425("runescape", "RuneScape", 0),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lop;"
   )
   field4420("stellardawn", "Stellar Dawn", 1),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lop;"
   )
   field4426("game3", "Game 3", 2),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lop;"
   )
   field4421("game4", "Game 4", 3),
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lop;"
   )
   field4422("game5", "Game 5", 4),
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lop;"
   )
   field4424("oldscape", "RuneScape 2007", 5);

   @ObfuscatedName("ao")
   public final String field4419;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -782428977
   )
   final int field4423;

   class387(String var3, String var4, int var5) {
      this.field4419 = var3;
      this.field4423 = var5;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1935172756"
   )
   public int vmethod11658() {
      return this.field4423;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;IZI)I",
      garbageValue = "1767996623"
   )
   static int method8195(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (var8 == '-') {
                  var3 = true;
                  continue;
               }

               if (var8 == '+') {
                  continue;
               }
            }

            int var10;
            if (var8 >= '0' && var8 <= '9') {
               var10 = var8 - 48;
            } else if (var8 >= 'A' && var8 <= 'Z') {
               var10 = var8 - 55;
            } else {
               if (var8 < 'a' || var8 > 'z') {
                  throw new NumberFormatException();
               }

               var10 = var8 - 87;
            }

            if (var10 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var10 = -var10;
            }

            int var9 = var5 * var1 + var10;
            if (var9 / var1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   @ObfuscatedName("lc")
   @ObfuscatedSignature(
      descriptor = "(Ldr;ZLwf;B)V",
      garbageValue = "5"
   )
   static final void method8199(class79 var0, boolean var1, PacketBuffer var2) {
      while(true) {
         byte var3 = 16;
         int var4 = 1 << var3;
         if (var2.method11167(client.packetWriter.serverPacketLength) >= var3 + 12) {
            int var5 = var2.method11146(var3);
            if (var5 != var4 - 1) {
               boolean var6 = false;
               class81 var7 = (class81)var0.field1160.method8567((long)var5);
               if (var7 == null) {
                  var7 = new class81(var5);
                  var0.field1160.method8558(var7, (long)var5);
                  var6 = true;
               }

               var0.field1161.method9798(var5);
               var7.field1188 = false;
               var7.field1053 = var0.field1172;
               int var8 = var2.method11146(1);
               int var11 = var2.method11146(1);
               if (var11 == 1) {
                  client.field469[++client.field468 - 1] = var5;
               }

               boolean var12 = var2.method11146(1) == 1;
               if (var12) {
                  var2.method11146(32);
               }

               var7.field1184 = class63.method2129(var2.method11146(14));
               int var9;
               if (var1) {
                  var9 = var2.method11146(8);
                  if (var9 > 127) {
                     var9 -= 256;
                  }
               } else {
                  var9 = var2.method11146(6);
                  if (var9 > 31) {
                     var9 -= 64;
                  }
               }

               int var13 = client.defaultRotations[var2.method11146(3)];
               if (var6) {
                  var7.field1097 = var7.field1057 = var13;
               }

               int var10;
               if (var1) {
                  var10 = var2.method11146(8);
                  if (var10 > 127) {
                     var10 -= 256;
                  }
               } else {
                  var10 = var2.method11146(6);
                  if (var10 > 31) {
                     var10 -= 64;
                  }
               }

               class193.method4319(var7);
               if (var7.field1099 == 0) {
                  var7.field1057 = 0;
               }

               var7.method2721(var9 + class23.field94, var10 + class274.field3224, var8 == 1);
               continue;
            }
         }

         var2.method11147();
         return;
      }
   }
}
