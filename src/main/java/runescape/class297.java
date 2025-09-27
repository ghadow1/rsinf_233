package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
public enum class297 implements class430 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Llh;"
   )
   field3424(1, (byte)0),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Llh;"
   )
   field3421(0, (byte)1),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Llh;"
   )
   field3419(2, (byte)2),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Llh;"
   )
   field3420(3, (byte)3);

   @ObfuscatedName("wg")
   @ObfuscatedSignature(
      descriptor = "Lpk;"
   )
   static class413 field3418;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 805003913
   )
   final int field3417;
   @ObfuscatedName("aq")
   final byte field3422;

   class297(int var3, byte var4) {
      this.field3417 = var3;
      this.field3422 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1935172756"
   )
   public int vmethod11658() {
      return this.field3422;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IS)Lxi;",
      garbageValue = "222"
   )
   public static class611 method6780(int var0) {
      class611[] var1 = class558.method10860();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class611 var3 = var1[var2];
         if (var0 == var3.field6073) {
            return var3;
         }
      }

      return null;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)[Llh;",
      garbageValue = "2077012818"
   )
   static class297[] method6777() {
      return new class297[]{field3424, field3421, field3419, field3420};
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)[Lfk;",
      garbageValue = "-1514668502"
   )
   static class140[] method6781() {
      return new class140[]{class140.field1704, class140.field1694, class140.field1695, class140.field1693, class140.field1697, class140.field1698, class140.field1711, class140.field1700, class140.field1701, class140.field1712, class140.field1703, class140.field1696, class140.field1705, class140.field1706, class140.field1707, class140.field1708, class140.field1709};
   }

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "(Lwv;B)Ljava/lang/Object;",
      garbageValue = "-123"
   )
   static Object method6775(class574 var0) {
      if (var0 == null) {
         throw new IllegalStateException("popValueOfType() failure - null baseVarType");
      } else {
         switch(var0.field5819) {
         case 0:
            return class46.field659[--class124.field1569];
         case 1:
            return class46.field660[--class46.field658];
         default:
            throw new IllegalStateException("popValueOfType() failure - unsupported type");
         }
      }
   }

   @ObfuscatedName("iz")
   @ObfuscatedSignature(
      descriptor = "(IIIIZS)V",
      garbageValue = "-26119"
   )
   static final void method6783(int var0, int var1, int var2, int var3, boolean var4) {
      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 < 1) {
         var3 = 1;
      }

      int var5 = var3 - 334;
      int var6;
      if (var5 < 0) {
         var6 = client.field367;
      } else if (var5 >= 100) {
         var6 = client.field368;
      } else {
         var6 = (client.field368 - client.field367) * var5 / 100 + client.field367;
      }

      int var7 = var3 * var6 * 512 / (var2 * 334);
      int var8;
      int var9;
      short var18;
      if (var7 < client.field419) {
         var18 = client.field419;
         var6 = var18 * var2 * 334 / (var3 * 512);
         if (var6 > client.field364) {
            var6 = client.field364;
            var8 = var3 * var6 * 512 / (var18 * 334);
            var9 = (var2 - var8) / 2;
            if (var4) {
               class601.Rasterizer2D_resetClip();
               class601.method11558(var0, var1, var9, var3, -16777216);
               class601.method11558(var0 + var2 - var9, var1, var9, var3, -16777216);
            }

            var0 += var9;
            var2 -= var9 * 2;
         }
      } else if (var7 > client.field382) {
         var18 = client.field382;
         var6 = var18 * var2 * 334 / (var3 * 512);
         if (var6 < client.field371) {
            var6 = client.field371;
            var8 = var18 * var2 * 334 / (var6 * 512);
            var9 = (var3 - var8) / 2;
            if (var4) {
               class601.Rasterizer2D_resetClip();
               class601.method11558(var0, var1, var2, var9, -16777216);
               class601.method11558(var0, var3 + var1 - var9, var2, var9, -16777216);
            }

            var1 += var9;
            var3 -= var9 * 2;
         }
      }

      client.field379 = var3 * var6 / 334;
      if (var2 != client.field313 || var3 != client.field378) {
         int[] var17 = new int[9];

         for(var9 = 0; var9 < var17.length; ++var9) {
            int var10 = var9 * 32 + 15 + 128;
            int var11 = var10 * 3 + 600;
            int var13 = class225.field2637[var10];
            int var15 = var3 - 334;
            if (var15 < 0) {
               var15 = 0;
            } else if (var15 > 100) {
               var15 = 100;
            }

            int var16 = (client.field370 - client.field369) * var15 / 100 + client.field369;
            int var14 = var11 * var16 / 256;
            var17[var9] = var13 * var14 >> 16;
         }

         class333.field3836.field1159.method5152(var17, 500, 800, var2 * 334 / var3, 334);
      }

      client.field375 = var0;
      client.field597 = var1;
      client.field313 = var2;
      client.field378 = var3;
   }

   @ObfuscatedName("pr")
   @ObfuscatedSignature(
      descriptor = "(IIIZI)V",
      garbageValue = "607449571"
   )
   public static void method6782(int var0, int var1, int var2, boolean var3) {
      class329 var4 = EnumComposition.getPacketBufferNode(ClientPackets.field3621, client.packetWriter.isaacCipher);
      var4.out.method11238(var0);
      var4.out.method11228(var2);
      var4.out.writeIntBigEndian(var3 ? client.field486 : 0);
      var4.out.method11325(var1);
      client.packetWriter.addNode(var4);
   }
}
