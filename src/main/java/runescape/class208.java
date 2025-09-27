package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
public class class208 extends class540 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   public static class412 field2275;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   static class320 field2270 = new class320(64);
   @ObfuscatedName("ql")
   @ObfuscatedSignature(
      descriptor = "[Lxt;"
   )
   static class605[] field2276;
   @ObfuscatedName("at")
   char field2271;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1646476693
   )
   public int field2273;
   @ObfuscatedName("ap")
   public String field2269;
   @ObfuscatedName("aq")
   boolean field2274 = true;

   class208() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-400940006"
   )
   void method4521() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-699289777"
   )
   void method4522(Buffer var1) {
      while(true) {
         int var2 = var1.method11196();
         if (var2 == 0) {
            return;
         }

         this.method4539(var1, var2);
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lwb;II)V",
      garbageValue = "914785386"
   )
   void method4539(Buffer var1, int var2) {
      if (var2 == 1) {
         byte var4 = var1.method11197();
         int var5 = var4 & 255;
         if (var5 == 0) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if (var5 >= 128 && var5 < 160) {
            char var6 = class443.field5142[var5 - 128];
            if (var6 == 0) {
               var6 = '?';
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.field2271 = var3;
      } else if (var2 == 2) {
         this.field2273 = var1.read32BitArray();
      } else if (var2 == 4) {
         this.field2274 = false;
      } else if (var2 == 5) {
         this.field2269 = var1.method11207();
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1871657664"
   )
   public boolean method4524() {
      return this.field2271 == 's';
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1143764162"
   )
   public static boolean method4530(int var0) {
      return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-677962949"
   )
   static void method4540(int var0, int var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];
      var2[0] = var0;
      var3[0] = var1;
      int var4 = 1;

      for(int var5 = 0; var5 < 4; ++var5) {
         if (class44.field629[var5] != var0) {
            var2[var4] = class44.field629[var5];
            var3[var4] = class44.field636[var5];
            ++var4;
         }
      }

      class44.field629 = var2;
      class44.field636 = var3;
      class464.method9401(class44.field624, 0, class44.field624.length - 1, class44.field629, class44.field636);
   }

   @ObfuscatedName("it")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "65"
   )
   static void setWindowedMode(int var0) {
      client.field359 = 0L;
      if (var0 >= 2) {
         client.isResizable = true;
      } else {
         client.isResizable = false;
      }

      if (class35.getWindowedMode() == 1) {
         class521.field5519.method591(765, 503);
      } else {
         class521.field5519.method591(7680, 2160);
      }

      if (client.gameState >= 25 && client.packetWriter != null && client.packetWriter.isaacCipher != null) {
         class329 var1 = EnumComposition.getPacketBufferNode(ClientPackets.field3568, client.packetWriter.isaacCipher);
         var1.out.writeByte(class35.getWindowedMode());
         var1.out.writeShortBigEndian(class34.screenWidth);
         var1.out.writeShortBigEndian(class396.screenHeight);
         client.packetWriter.addNode(var1);
      }

   }
}
