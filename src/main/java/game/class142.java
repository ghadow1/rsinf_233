package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class142 implements class132 {
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   static class412 field1720;

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lbp;Lbp;IZI)I",
      garbageValue = "-225972985"
   )
   static int method3731(class44 var0, class44 var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var4 = var0.field628;
         int var5 = var1.field628;
         if (!var3) {
            if (var4 == -1) {
               var4 = 2001;
            }

            if (var5 == -1) {
               var5 = 2001;
            }
         }

         return var4 - var5;
      } else if (var2 == 2) {
         return var0.field635 - var1.field635;
      } else if (var2 == 3) {
         if (var0.field622.equals("-")) {
            if (var1.field622.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.field622.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.field622.compareTo(var1.field622);
         }
      } else if (var2 == 4) {
         return var0.method1493() ? (var1.method1493() ? 0 : 1) : (var1.method1493() ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method1477() ? (var1.method1477() ? 0 : 1) : (var1.method1477() ? -1 : 0);
      } else if (var2 == 6) {
         return var0.method1472() ? (var1.method1472() ? 0 : 1) : (var1.method1472() ? -1 : 0);
      } else if (var2 == 7) {
         return var0.method1490() ? (var1.method1490() ? 0 : 1) : (var1.method1490() ? -1 : 0);
      } else {
         return var0.field640 - var1.field640;
      }
   }

   @ObfuscatedName("nu")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "2127927157"
   )
   static final void method3730(int var0, int var1) {
      if (class119.field1554.method7478(var0)) {
         class338.method7105(class119.field1554.field4037[var0], var1);
      }
   }

   @ObfuscatedName("ow")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1875883492"
   )
   static final void method3732(String var0) {
      if (class22.field90 != null) {
         class329 var1 = class130.method3593(class327.field3608, client.field314.field1308);
         var1.field3664.writeByte(class288.method6418(var0));
         var1.field3664.writeNullTermString(var0);
         client.field314.prepData(var1);
      }
   }
}
