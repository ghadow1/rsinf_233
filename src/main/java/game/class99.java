package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
public class class99 implements Runnable {
   @ObfuscatedName("jc")
   static String sessionToken1;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "[Ldn;"
   )
   public volatile class97[] field1370 = new class97[2];

   public void run() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            class97 var2 = this.field1370[var1];
            if (var2 != null) {
               var2.method3048();
            }
         }
      } catch (Exception var4) {
         class508.method10161((String)null, var4);
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Lti;IB)I",
      garbageValue = "64"
   )
   public static int method3116(class519 var0, int var1) {
      class328.method7046(var0, class574.field5820);
      if (var1 >= 0) {
         int[] var2 = var0.method10318();
         int var3 = var0.method10322();

         for(int var4 = 0; var4 < var3; ++var4) {
            if (var1 < var2[var4]) {
               return var4;
            }

            var1 -= var2[var4];
         }
      }

      return -1;
   }
}
