package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
public class class354 extends class540 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 143943703
   )
   public final int field4019;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 298036503
   )
   public final int field4020;
   @ObfuscatedName("at")
   public final int[] field4018;
   @ObfuscatedName("ac")
   public final int[] field4017;

   class354(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.field4019 = var1;
      this.field4020 = var2;
      this.field4018 = var3;
      this.field4017 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "-124"
   )
   public boolean method7394(int var1, int var2) {
      if (var2 >= 0 && var2 < this.field4017.length) {
         int var3 = this.field4017[var2];
         if (var1 >= var3 && var1 <= var3 + this.field4018[var2]) {
            return true;
         }
      }

      return false;
   }

   @ObfuscatedName("af")
   static double method7393(double var0) {
      return Math.exp(var0 * -var0 / 2.0D) / Math.sqrt(6.283185307179586D);
   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "-1000290571"
   )
   static int method7397(int var0, class55 var1, boolean var2) {
      return 2;
   }

   @ObfuscatedName("my")
   @ObfuscatedSignature(
      descriptor = "(Loi;IIZI)V",
      garbageValue = "2049495357"
   )
   static void method7399(class369 var0, int var1, int var2, boolean var3) {
      int var4 = var0.field4160 * 469894397;
      int var5 = var0.field4149 * 1156037777;
      if (var0.field4251 == 0) {
         var0.field4160 = var0.field4156 * 1447114837;
      } else if (var0.field4251 == 1) {
         var0.field4160 = (var1 - var0.field4156) * 1447114837;
      } else if (var0.field4251 == 2) {
         var0.field4160 = (var0.field4156 * var1 >> 14) * 1447114837;
      }

      if (var0.field4221 == 0) {
         var0.field4149 = var0.field4157 * 978027633;
      } else if (var0.field4221 == 1) {
         var0.field4149 = (var2 - var0.field4157) * 978027633;
      } else if (var0.field4221 == 2) {
         var0.field4149 = (var2 * var0.field4157 >> 14) * 978027633;
      }

      if (var0.field4251 == 4) {
         var0.field4160 = var0.field4149 * var0.field4162 * 1156037777 / var0.field4163 * 1447114837;
      }

      if (var0.field4221 == 4) {
         var0.field4149 = var0.field4160 * var0.field4163 * 469894397 / var0.field4162 * 978027633;
      }

      if (var0.field4168 == 1337) {
         client.field358 = var0;
      }

      if (var0.field4147 == 12) {
         var0.method7971().method7880(var0.field4160 * 469894397, var0.field4149 * 1156037777);
      }

      if (var3 && var0.field4270 != null && (var4 != var0.field4160 * 469894397 || var5 != var0.field4149 * 1156037777)) {
         class65 var6 = new class65();
         var6.field893 = var0;
         var6.field898 = var0.field4270;
         client.field434.method8689(var6);
      }

   }

   @ObfuscatedName("nt")
   @ObfuscatedSignature(
      descriptor = "(Loi;I)Z",
      garbageValue = "2095244080"
   )
   static final boolean method7398(class369 var0) {
      int var1 = var0.field4168;
      if (var1 == 205) {
         client.logoutTimer = 250;
         return true;
      } else {
         int var2;
         int var3;
         if (var1 >= 300 && var1 <= 313) {
            var2 = (var1 - 300) / 2;
            var3 = var1 & 1;
            client.field322.method7585(var2, var3 == 1);
         }

         if (var1 >= 314 && var1 <= 323) {
            var2 = (var1 - 314) / 2;
            var3 = var1 & 1;
            client.field322.method7543(var2, var3 == 1);
         }

         if (var1 == 324) {
            client.field322.method7531(0);
         }

         if (var1 == 325) {
            client.field322.method7531(1);
         }

         if (var1 == 326) {
            class329 var4 = EnumComposition.getPacketBufferNode(ClientPackets.field3554, client.packetWriter.isaacCipher);
            client.field322.method7578(var4.out);
            client.packetWriter.addNode(var4);
            return true;
         } else {
            return false;
         }
      }
   }
}
