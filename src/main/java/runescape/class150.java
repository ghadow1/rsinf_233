package runescape;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class150 extends class151 {
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   static class412 field1767;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   static class412 field1765;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 941269453
   )
   int field1768;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfz;"
   )
   final class154 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfz;)V"
   )
   class150(class154 var1) {
      this.this$0 = var1;
      this.field1768 = -1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-2943315"
   )
   void vmethod4111(Buffer var1) {
      this.field1768 = var1.readUnsignedShort();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lgs;I)V",
      garbageValue = "2108880901"
   )
   void vmethod4112(class162 var1) {
      var1.method3922(this.field1768);
   }

   @ObfuscatedName("ka")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-786380047"
   )
   static final void method3816() {
      Iterator var0 = client.field333.iterator();

      while(var0.hasNext()) {
         class79 var1 = (class79)var0.next();

         for(class74 var2 = (class74)var1.field1158.method8690(); var2 != null; var2 = (class74)var1.field1158.method8692()) {
            if (var2.field1032 > 0) {
               --var2.field1032;
            }

            boolean var3;
            int var4;
            int var5;
            class212 var6;
            if (var2.field1032 == 0) {
               if (var2.field1024 >= 0) {
                  var4 = var2.field1024;
                  var5 = var2.field1035;
                  var6 = class433.method8669(var4);
                  if (var5 == 11) {
                     var5 = 10;
                  }

                  if (var5 >= 5 && var5 <= 8) {
                     var5 = 4;
                  }

                  var3 = var6.method4630(var5);
                  if (!var3) {
                     continue;
                  }
               }

               class333.method7056(var1, var2.field1026, var2.field1021, var2.field1022, var2.field1036, var2.field1024, var2.field1025, var2.field1035, var2.field1023);
               var2.vmethod10557();
            } else {
               if (var2.field1031 > 0) {
                  --var2.field1031;
               }

               if (var2.field1031 == 0 && var2.field1022 >= 1 && var2.field1036 >= 1 && var2.field1022 <= 102 && var2.field1036 <= 102) {
                  if (var2.field1027 >= 0) {
                     var4 = var2.field1027;
                     var5 = var2.field1029;
                     var6 = class433.method8669(var4);
                     if (var5 == 11) {
                        var5 = 10;
                     }

                     if (var5 >= 5 && var5 <= 8) {
                        var5 = 4;
                     }

                     var3 = var6.method4630(var5);
                     if (!var3) {
                        continue;
                     }
                  }

                  class333.method7056(var1, var2.field1026, var2.field1021, var2.field1022, var2.field1036, var2.field1027, var2.field1028, var2.field1029, var2.field1023);
                  var2.field1031 = -1;
                  if (var2.field1027 == var2.field1024 && var2.field1024 == -1) {
                     var2.vmethod10557();
                  } else if (var2.field1027 == var2.field1024 && var2.field1025 == var2.field1028 && var2.field1035 == var2.field1029) {
                     var2.vmethod10557();
                  }
               }
            }
         }
      }

   }
}
