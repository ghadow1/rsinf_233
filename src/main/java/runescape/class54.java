package runescape;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
public class class54 {
   @ObfuscatedName("af")
   ExecutorService field791 = Executors.newSingleThreadExecutor();
   @ObfuscatedName("aw")
   Future field792;

   class54() {
      this.field792 = this.field791.submit(new class60());
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2036108609"
   )
   void method1973() {
      this.field791.shutdown();
      this.field791 = null;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "46901898"
   )
   boolean method1975() {
      return this.field792.isDone();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/security/SecureRandom;",
      garbageValue = "856038810"
   )
   SecureRandom method1976() {
      try {
         return (SecureRandom)this.field792.get();
      } catch (Exception var4) {
         SecureRandom var3 = new SecureRandom();
         var3.nextInt();
         return var3;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)Lgt;",
      garbageValue = "2028200764"
   )
   public static class177 method1985(int var0) {
      class177 var1 = (class177)class177.field1959.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class177.field1960.method8335(5, var0);
         var1 = new class177();
         if (var2 != null) {
            var1.method4144(new Buffer(var2));
         }

         class177.field1959.method7009(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
      garbageValue = "100"
   )
   public static String method1987(CharSequence var0) {
      int var2 = var0.length();
      char[] var3 = new char[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = '*';
      }

      String var1 = new String(var3);
      return var1;
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "-1445536234"
   )
   static int method1982(int var0, class55 var1, boolean var2) {
      class369 var3 = class119.field1554.method7476(class46.field659[--class124.field1569]);
      if (var0 == 2800) {
         class46.field659[++class124.field1569 - 1] = class537.method10543(class373.method8139(var3));
         return 1;
      } else if (var0 != 2801) {
         if (var0 == 2802) {
            if (var3.field4227 == null) {
               class46.field660[++class46.field658 - 1] = "";
            } else {
               class46.field660[++class46.field658 - 1] = var3.field4227;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var4 = class46.field659[--class124.field1569];
         --var4;
         if (var3.field4225 != null && var4 < var3.field4225.length && var3.field4225[var4] != null) {
            class46.field660[++class46.field658 - 1] = var3.field4225[var4];
         } else {
            class46.field660[++class46.field658 - 1] = "";
         }

         return 1;
      }
   }
}
