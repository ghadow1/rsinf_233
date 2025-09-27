package runescape;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
public class class305 {
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-107"
   )
   public static void method6838(int var0) {
      if (!class339.field3890.isEmpty()) {
         Iterator var1 = class339.field3890.iterator();

         while(var1.hasNext()) {
            class351 var2 = (class351)var1.next();
            if (var2 != null) {
               var2.field4005 = var0;
            }
         }

         class351 var3 = (class351)class339.field3890.get(0);
         if (var3 != null && var3.field4012 != null && var3.field4012.method7146() && !var3.field4010) {
            var3.field4012.method7218(var0);
            var3.field4002 = (float)var0;
         }
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "1440103269"
   )
   public static int method6834(int var0, int var1, int var2) {
      int var3 = client.method1134(var2 - var1 + 1);
      var3 <<= var1;
      return var0 & ~var3;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Ljn;IIIILrj;IIIB)Z",
      garbageValue = "-8"
   )
   static final boolean method6837(class241 var0, int var1, int var2, int var3, int var4, class454 var5, int var6, int var7, int var8) {
      boolean var9 = class242.field2953;
      if (!var9) {
         return false;
      } else {
         class271.method6079(var5, var6, var7, var8);
         return StudioGame.method8641(var0, var1, var2, var3, var4);
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Lti;Lti;IB)V",
      garbageValue = "15"
   )
   public static void method6836(class519 var0, class519 var1, int var2) {
      class374.method8144(var0);
      class328.method7046(var1, var0.field5504);
      if (var2 >= 0 && var2 <= var0.field5502 * -1549457881) {
         if (var1.field5502 * -1549457881 != 0) {
            var0.method10355(var1.field5502 * -1549457881 + var0.field5502 * -1549457881);
            if (var2 < var0.field5502 * -1549457881) {
               class82.method2773(var0, var2, var0, var1.field5502 * -1549457881 + var2, var0.field5502 * -1549457881 - var2);
            }

            class82.method2773(var1, 0, var0, var2, var1.field5502 * -1549457881);
            var0.field5502 += var1.field5502;
         }
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("nz")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "1"
   )
   static boolean method6835() {
      return client.field523;
   }
}
