package runescape;

import java.util.Calendar;
import java.util.Date;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class128 extends class500 {
   @ObfuscatedName("af")
   final boolean field1582;

   public class128(boolean var1) {
      this.field1582 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lty;Lty;I)I",
      garbageValue = "-1448458370"
   )
   int method3578(class503 var1, class503 var2) {
      if (client.worldId == var1.field5411 && var2.field5411 == client.worldId) {
         return this.field1582 ? var1.field5410 - var2.field5410 : var2.field5410 - var1.field5410;
      } else {
         return this.method9964(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method3578((class503)var1, (class503)var2);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/Date;I)Z",
      garbageValue = "1402147443"
   )
   static boolean method3580(Date var0) {
      Calendar var2 = Calendar.getInstance();
      var2.set(2, 0);
      var2.set(5, 1);
      var2.set(1, 1900);
      Date var1 = var2.getTime();
      return var0.after(var1);
   }

   @ObfuscatedName("mw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Loi;I)Ljava/lang/String;",
      garbageValue = "-521110050"
   )
   static String method3581(String var0, class369 var1) {
      if (var0.indexOf("%") != -1) {
         for(int var2 = 1; var2 <= 5; ++var2) {
            while(true) {
               int var3 = var0.indexOf("%" + var2);
               if (var3 == -1) {
                  break;
               }

               var0 = var0.substring(0, var3) + SBuffer.method10167(class34.method637(var1, var2 - 1)) + var0.substring(var3 + 2);
            }
         }
      }

      return var0;
   }
}
