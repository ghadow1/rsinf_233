package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ws")
public class class577 extends class540 {
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class320 field5831 = new class320(64);
   @ObfuscatedName("at")
   public int[][] field5829;
   @ObfuscatedName("ac")
   public Object[][] field5828;

   class577() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-2042863488"
   )
   void method11047(class590 var1) {
      while(true) {
         int var2 = var1.method11196();
         if (var2 == 0) {
            return;
         }

         this.method11055(var1, var2);
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lwb;IB)V",
      garbageValue = "2"
   )
   void method11055(class590 var1, int var2) {
      if (var2 == 1) {
         int var3 = var1.method11196();
         if (this.field5829 == null) {
            this.field5829 = new int[var3][];
         }

         for(int var4 = var1.method11196(); var4 != 255; var4 = var1.method11196()) {
            int var5 = var4 & 127;
            boolean var6 = (var4 & 128) != 0;
            int[] var7 = new int[var1.method11196()];

            for(int var8 = 0; var8 < var7.length; ++var8) {
               var7[var8] = var1.method11212();
            }

            this.field5829[var5] = var7;
            if (var6) {
               if (this.field5828 == null) {
                  this.field5828 = new Object[this.field5829.length][];
               }

               Object[][] var17 = this.field5828;
               int var11 = var1.method11212();
               Object[] var12 = new Object[var7.length * var11];

               for(int var13 = 0; var13 < var11; ++var13) {
                  for(int var14 = 0; var14 < var7.length; ++var14) {
                     int var15 = var14 + var7.length * var13;
                     class574 var16 = class491.method9850(var7[var14]);
                     var12[var15] = var16.method11020(var1);
                  }
               }

               var17[var5] = var12;
            }
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-124"
   )
   void method11048() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Lqh;II)Lmy;",
      garbageValue = "-1239986988"
   )
   public static class329 method11058(int var0, String var1, class432 var2, int var3) {
      class329 var4 = class130.method3593(class327.field3564, client.field314.field1308);
      var4.field3664.writeByte(0);
      int var5 = var4.field3664.buffer * 1216585693;
      var4.field3664.writeByte(var0);
      String var6 = var1.toLowerCase();
      int var7 = 0;
      byte[] var8 = null;
      if (var6.startsWith("yellow:")) {
         var7 = 0;
         var1 = var1.substring("yellow:".length());
      } else if (var6.startsWith("red:")) {
         var7 = 1;
         var1 = var1.substring("red:".length());
      } else if (var6.startsWith("green:")) {
         var7 = 2;
         var1 = var1.substring("green:".length());
      } else if (var6.startsWith("cyan:")) {
         var7 = 3;
         var1 = var1.substring("cyan:".length());
      } else if (var6.startsWith("purple:")) {
         var7 = 4;
         var1 = var1.substring("purple:".length());
      } else if (var6.startsWith("white:")) {
         var7 = 5;
         var1 = var1.substring("white:".length());
      } else if (var6.startsWith("flash1:")) {
         var7 = 6;
         var1 = var1.substring("flash1:".length());
      } else if (var6.startsWith("flash2:")) {
         var7 = 7;
         var1 = var1.substring("flash2:".length());
      } else if (var6.startsWith("flash3:")) {
         var7 = 8;
         var1 = var1.substring("flash3:".length());
      } else if (var6.startsWith("glow1:")) {
         var7 = 9;
         var1 = var1.substring("glow1:".length());
      } else if (var6.startsWith("glow2:")) {
         var7 = 10;
         var1 = var1.substring("glow2:".length());
      } else if (var6.startsWith("glow3:")) {
         var7 = 11;
         var1 = var1.substring("glow3:".length());
      } else if (var6.startsWith("rainbow:")) {
         var7 = 12;
         var1 = var1.substring("rainbow:".length());
      } else if (var6.startsWith("pattern")) {
         var8 = class410.method8331(var6);
         if (var8 != null) {
            var7 = var8.length + 12;
            var1 = var1.substring("pattern".length() + var8.length + 1);
         }
      }

      var6 = var1.toLowerCase();
      byte var9 = 0;
      if (var6.startsWith("wave:")) {
         var9 = 1;
         var1 = var1.substring("wave:".length());
      } else if (var6.startsWith("wave2:")) {
         var9 = 2;
         var1 = var1.substring("wave2:".length());
      } else if (var6.startsWith("shake:")) {
         var9 = 3;
         var1 = var1.substring("shake:".length());
      } else if (var6.startsWith("scroll:")) {
         var9 = 4;
         var1 = var1.substring("scroll:".length());
      } else if (var6.startsWith("slide:")) {
         var9 = 5;
         var1 = var1.substring("slide:".length());
      }

      var4.field3664.writeByte(var7);
      var4.field3664.writeByte(var9);
      if (var8 != null) {
         for(int var10 = 0; var10 < var8.length; ++var10) {
            var4.field3664.writeByte(var8[var10]);
         }
      }

      class359.method7497(var4.field3664, var1);
      if (var0 == class377.field4336.vmethod11658()) {
         var4.field3664.writeByte(var3);
      }

      var4.field3664.method11191(var4.field3664.buffer * 1216585693 - var5);
      return var4;
   }
}
