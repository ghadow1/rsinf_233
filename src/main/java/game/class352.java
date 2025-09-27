package game;

import java.util.BitSet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
public class class352 extends class544 {
   @ObfuscatedName("af")
   BitSet field4015;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 949855025
   )
   int field4016;

   class352(int var1) {
      this.field4016 = var1;
      this.field4015 = new BitSet(128);
   }

   @ObfuscatedName("jq")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-62"
   )
   static final void method7390() {
      client.field341 = 0;
      int var0 = (class76.field1108.field1055 >> 7) + class333.field3836.field1164;
      int var1 = (class76.field1108.field1056 >> 7) + class333.field3836.field1165;
      if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
         client.field341 = 1;
      }

      if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
         client.field341 = 1;
      }

      if (client.field341 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
         client.field341 = 0;
      }

   }

   @ObfuscatedName("lw")
   @ObfuscatedSignature(
      descriptor = "(Ldr;Lwf;I)V",
      garbageValue = "-896249957"
   )
   static final void method7392(class79 var0, class589 var1) {
      var1.method11145();
      int var2 = var1.method11146(8);
      int var3;
      int var4;
      class81 var5;
      if (var2 < var0.field1161.method9790()) {
         for(var3 = var2; var3 < var0.field1161.method9790(); ++var3) {
            var4 = var0.field1161.method9787(var3);
            client.field360[++client.field372 - 1] = var4;
            var5 = (class81)var0.field1160.method8567((long)var4);
            var5.field1188 = true;
         }
      }

      if (var2 > var0.field1161.method9790()) {
         throw new RuntimeException("");
      } else {
         var0.field1161.method9793();

         for(var3 = 0; var3 < var2; ++var3) {
            var4 = var0.field1161.method9787(var3);
            var5 = (class81)var0.field1160.method8567((long)var4);
            int var6 = var1.method11146(1);
            if (var6 == 0) {
               var0.field1161.method9798(var4);
            } else {
               int var7 = var1.method11146(2);
               if (var7 == 0) {
                  var0.field1161.method9798(var4);
                  client.field469[++client.field468 - 1] = var4;
               } else {
                  int var8;
                  int var9;
                  if (var7 == 1) {
                     var0.field1161.method9798(var4);
                     var8 = var1.method11146(3);
                     var5.method2737(var8, class280.field3281);
                     var9 = var1.method11146(1);
                     if (var9 == 1) {
                        client.field469[++client.field468 - 1] = var4;
                     }
                  } else if (var7 == 2) {
                     var0.field1161.method9798(var4);
                     if (var1.method11146(1) == 1) {
                        var8 = var1.method11146(3);
                        var5.method2737(var8, class280.field3282);
                        var9 = var1.method11146(3);
                        var5.method2737(var9, class280.field3282);
                     } else {
                        var8 = var1.method11146(3);
                        var5.method2737(var8, class280.field3280);
                     }

                     var8 = var1.method11146(1);
                     if (var8 == 1) {
                        client.field469[++client.field468 - 1] = var4;
                     }
                  } else if (var7 == 3) {
                     client.field360[++client.field372 - 1] = var4;
                     var5.field1188 = true;
                  }
               }
            }
         }

      }
   }

   @ObfuscatedName("oy")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1429580563"
   )
   static void method7391(String var0) {
      class99.sessionToken1 = var0;

      try {
         String var1 = class521.field5519.getParameter(Integer.toString(18));
         String var2 = class521.field5519.getParameter(Integer.toString(13));
         String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
         if (var0.isEmpty()) {
            var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
         } else {
            var3 = var3 + "; Expires=" + class49.method1889(class189.method4284() + 94608000000L) + "; Max-Age=" + 94608000L;
         }

         class26.method401(class521.field5519, "document.cookie=\"" + var3 + "\"");
      } catch (Throwable var4) {
      }

   }
}
