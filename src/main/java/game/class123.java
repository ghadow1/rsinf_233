package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public class class123 extends class500 {
   @ObfuscatedName("af")
   final boolean field1567;

   public class123(boolean var1) {
      this.field1567 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lty;Lty;B)I",
      garbageValue = "38"
   )
   int method3539(class503 var1, class503 var2) {
      if (client.field325 == var1.field5411) {
         if (var2.field5411 != client.field325) {
            return this.field1567 ? -1 : 1;
         }
      } else if (var2.field5411 == client.field325) {
         return this.field1567 ? 1 : -1;
      }

      return this.method9964(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method3539((class503)var1, (class503)var2);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "45931988"
   )
   public static int method3543(int var0) {
      long var2 = class242.field2968[var0];
      int var4 = (int)(var2 >>> 52 & 4095L);
      if ((long)var4 == 4095L) {
         var4 = -1;
      }

      return var4;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IIIIZIII)J",
      garbageValue = "369312725"
   )
   public static long method3544(int var0, int var1, int var2, int var3, boolean var4, int var5, int var6) {
      long var7 = (long)((var1 & 127) << 0 | (var2 & 127) << 7 | (var0 & 3) << 14 | (var3 & 7) << 16) | ((long)var5 & 4294967295L) << 20 | ((long)var6 & 4095L) << 52;
      if (var4) {
         var7 |= 524288L;
      }

      return var7;
   }
}
