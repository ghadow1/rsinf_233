package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class214 extends class540 {
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class320 field2443 = new class320(64);
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 649927031
   )
   public int field2444 = 0;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1374821783
   )
   public int field2445 = -1;
   @ObfuscatedName("ai")
   public boolean field2439 = true;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -508032111
   )
   public int field2453 = -1;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1017066937
   )
   public int field2448;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 788249135
   )
   public int field2449;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -933745785
   )
   public int field2450;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1920400379
   )
   public int field2451;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1225515633
   )
   public int field2452;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -2144453435
   )
   public int field2446;

   class214() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2107102951"
   )
   void method4737() {
      if (this.field2453 != -1) {
         this.method4740(this.field2453);
         this.field2451 = this.field2448;
         this.field2452 = this.field2449;
         this.field2446 = this.field2450;
      }

      this.method4740(this.field2444);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lwb;II)V",
      garbageValue = "-1752035964"
   )
   void method4751(class590 var1, int var2) {
      while(true) {
         int var3 = var1.method11196();
         if (var3 == 0) {
            return;
         }

         this.method4736(var1, var3, var2);
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lwb;IIB)V",
      garbageValue = "1"
   )
   void method4736(class590 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field2444 = var1.method11278();
      } else if (var2 == 2) {
         this.field2445 = var1.method11196();
      } else if (var2 == 5) {
         this.field2439 = false;
      } else if (var2 == 7) {
         this.field2453 = var1.method11278();
      } else if (var2 != 8 && var2 == 9) {
         var1.method11196();
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-94"
   )
   void method4740(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var8 + var10) / 2.0D;
      if (var10 != var8) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var10 == var4) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0D;
         } else if (var6 == var10) {
            var12 = 4.0D + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0D;
      this.field2448 = (int)(var12 * 256.0D);
      this.field2449 = (int)(var14 * 256.0D);
      this.field2450 = (int)(var16 * 256.0D);
      if (this.field2449 < 0) {
         this.field2449 = 0;
      } else if (this.field2449 > 255) {
         this.field2449 = 255;
      }

      if (this.field2450 < 0) {
         this.field2450 = 0;
      } else if (this.field2450 > 255) {
         this.field2450 = 255;
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "([BIII)Ljava/lang/String;",
      garbageValue = "-878378890"
   )
   public static String method4757(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = var0[var5 + var1] & 255;
         if (var6 != 0) {
            if (var6 >= 128 && var6 < 160) {
               char var7 = class443.field5142[var6 - 128];
               if (var7 == 0) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   @ObfuscatedName("op")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
      garbageValue = "-331282973"
   )
   static String method4756(String var0, boolean var1) {
      String var2 = var1 ? "https://" : "http://";
      if (client.field354 == 1) {
         var0 = var0 + "-wtrc";
      } else if (client.field354 == 2) {
         var0 = var0 + "-wtqa";
      } else if (client.field354 == 3) {
         var0 = var0 + "-wtwip";
      } else if (client.field354 == 5) {
         var0 = var0 + "-wti";
      } else if (client.field354 == 4) {
         var0 = "local";
      }

      String var3 = "";
      if (class99.sessionToken1 != null) {
         var3 = "/p=" + class99.sessionToken1;
      }

      String var4 = "runescape.com";
      return var2 + var0 + "." + var4 + "/l=" + class242.field2970 + "/a=" + class293.affiliateID + var3 + "/";
   }
}
