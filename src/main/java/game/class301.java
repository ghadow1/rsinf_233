package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
public final class class301 {
   @ObfuscatedName("aw")
   final int[] field3450;

   class301() {
      this.field3450 = new int[4096];
   }

   class301(int[] var1) {
      this.field3450 = var1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-415338614"
   )
   final int method6822(int var1, int var2) {
      return this.field3450[var2 * 64 + var1];
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(I)[Ljava/lang/Object;",
      garbageValue = "1767237666"
   )
   static Object[] method6826() {
      String var0 = (String)class46.field660[--class46.field658];
      Object[] var1 = new Object[var0.length()];

      for(int var2 = var0.length() - 1; var2 >= 0; --var2) {
         if (var0.charAt(var2) == 'i') {
            var1[var2] = class46.field659[--class124.field1569];
         } else {
            var1[var2] = class46.field660[--class46.field658];
         }
      }

      return var1;
   }

   @ObfuscatedName("lb")
   @ObfuscatedSignature(
      descriptor = "(Ldr;ZLwf;I)V",
      garbageValue = "2029327651"
   )
   static final void method6827(class79 var0, boolean var1, class589 var2) {
      client.field372 = 0;
      client.field468 = 0;
      class352.method7392(var0, var2);
      class387.method8199(var0, var1, var2);
      class373.method8141(var0, var2);

      for(int var3 = 0; var3 < client.field372; ++var3) {
         int var4 = client.field360[var3];
         class81 var5 = (class81)var0.field1160.method8567((long)var4);
         if (var5.field1188) {
            var5.field1184 = null;
            var5.method10551();
         }
      }

      if (var2.buffer * 1216585693 != client.field314.field1294) {
         throw new RuntimeException(var2.buffer * 1216585693 + "," + client.field314.field1294);
      }
   }
}
