package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
public class class22 implements class106 {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 60482423
   )
   static int field91;
   @ObfuscatedName("hw")
   @ObfuscatedSignature(
      descriptor = "Ltg;"
   )
   static class495 field90;

   class22() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Ldn;",
      garbageValue = "-183806159"
   )
   public class97 vmethod3355() {
      return new class24();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZZI)V",
      garbageValue = "-2028322013"
   )
   public static void method330(String var0, boolean var1, boolean var2) {
      class6.method39(var0, var1, "openjs", var2);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1302330911"
   )
   public static int method332(int var0) {
      return class535.field5563[var0 & 16383];
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-290410379"
   )
   public static void method326() {
      try {
         class260.field3111.method10915();

         for(int var0 = 0; var0 < class260.field3110; ++var0) {
            class260.field3107[var0].method10915();
         }

         class260.field3108.method10915();
         class260.field3104.method10915();
      } catch (Exception var2) {
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1201012857"
   )
   static final int method331(int var0, int var1) {
      int var2 = class204.method4496(var0 - 1, var1 - 1) + class204.method4496(var0 + 1, var1 - 1) + class204.method4496(var0 - 1, var1 + 1) + class204.method4496(1 + var0, var1 + 1);
      int var3 = class204.method4496(var0 - 1, var1) + class204.method4496(1 + var0, var1) + class204.method4496(var0, var1 - 1) + class204.method4496(var0, 1 + var1);
      int var4 = class204.method4496(var0, var1);
      return var2 / 16 + var3 / 8 + var4 / 4;
   }

   @ObfuscatedName("oo")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1658772962"
   )
   static final void method329(String var0) {
      if (!var0.equals("")) {
         class329 var1 = class130.method3593(class327.field3626, client.field314.field1308);
         var1.field3664.writeByte(class288.method6418(var0));
         var1.field3664.writeNullTermString(var0);
         client.field314.prepData(var1);
      }
   }
}
