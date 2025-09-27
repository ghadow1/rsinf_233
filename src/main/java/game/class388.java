package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
public class class388 {
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1700822083"
   )
   public static void method8205() {
      class149.field1763 = null;
      class191.field2082 = null;
      class255.field3068 = null;
      class497.field5390 = null;
      class504.field5414 = null;
      class7.field25 = null;
   }

   @ObfuscatedName("oq")
   @ObfuscatedSignature(
      descriptor = "(IIIILxt;Lnq;I)V",
      garbageValue = "1988121128"
   )
   static final void method8214(int var0, int var1, int var2, int var3, class605 var4, class354 var5) {
      int var6 = var3 * var3 + var2 * var2;
      if (var6 > 4225 && var6 < 90000) {
         int var7 = client.field424 & 2047;
         int var8 = class225.field2637[var7];
         int var9 = class225.field2636[var7];
         int var10 = var9 * var2 + var3 * var8 >> 16;
         int var11 = var3 * var9 - var8 * var2 >> 16;
         double var12 = Math.atan2((double)var10, (double)var11);
         int var14 = var5.field4019 / 2 - 25;
         int var15 = (int)(Math.sin(var12) * (double)var14);
         int var16 = (int)(Math.cos(var12) * (double)var14);
         byte var17 = 20;
         class181.field1976.method11727(var15 + (var0 + var5.field4019 / 2 - var17 / 2), var5.field4020 / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
      } else {
         class84.method2798(var0, var1, var2, var3, var4, var5);
      }

   }

   @ObfuscatedName("os")
   @ObfuscatedSignature(
      descriptor = "(Loi;S)I",
      garbageValue = "255"
   )
   static int method8204(class369 var0) {
      class359 var1 = (class359)client.field438.method8623((long)var0.field4144);
      class359 var2 = class518.method10317(var1, var0.field4145 * -217986249);
      if (var2 != null) {
         return var2.method7499();
      } else {
         int var4 = var0.field4249;
         int var3 = var4 >> 1 & 1023;
         return var3;
      }
   }
}
