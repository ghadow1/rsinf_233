package runescape;

import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
public class class470 extends class477 {
   @ObfuscatedSignature(
      descriptor = "(Lsi;)V"
   )
   public class470(class477 var1) {
      super(var1);
      super.field5303 = "AddRequestTask";
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "40"
   )
   public boolean vmethod9673() {
      while(!class339.field3895.isEmpty()) {
         class351 var1 = (class351)class339.field3895.peek();
         if (var1 == null) {
            class339.field3895.pop();
         } else {
            var1.field4012 = this.method9638();
            class339.field3890.add(var1);
            class339.field3895.pop();
         }
      }

      return true;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Lnf;",
      garbageValue = "1021257879"
   )
   class340 method9638() {
      class340 var1 = null;
      Iterator var2 = class339.field3888.iterator();

      while(true) {
         class340 var3;
         do {
            do {
               if (!var2.hasNext()) {
                  if (var1 != null) {
                     ++var1.field3904;
                     if (var1.method7139() == 0 && var1.method7146()) {
                        var1.method7145();
                        var1.method7143();
                        var1.method7218(0);
                     }
                  }

                  return var1;
               }

               var3 = (class340)var2.next();
            } while(var3 == null);
         } while(var1 != null && var1.field3904 <= var3.field3904 && (var3.method7139() != 0 || !var3.method7146()));

         var1 = var3;
      }
   }

   @ObfuscatedName("iv")
   @ObfuscatedSignature(
      descriptor = "(Ldr;Lct;B)V",
      garbageValue = "-108"
   )
   static final void method9640(class79 var0, class75 var1) {
      client.field399.method10862(var0, var1.field1055, var1.field1056, var1 == class76.field1108);
      int var2 = class145.method3747(var1.field1083, 1, client.field399);
      if ((var2 & 2) != 0) {
         var1.field1083.method9572();
      }

      var1.field1093.method9573(var1.field1060);
      if (var1.field1083.method9574() > 0 && var1.field1093.method9574() < 30) {
         if (var1.field1083.method9596() == var1.field1093.method9596()) {
            var1.field1093.method9564(var1.field1083);
         } else {
            int var3 = class145.method3747(var1.field1093, 1, (class468)null);
            if ((var3 & 2) != 0) {
               var1.field1093.method9572();
            }
         }
      }

      class425 var7 = new class425(var1.method2429());

      for(class510 var4 = (class510)var7.method8573(); var4 != null; var4 = (class510)var7.next()) {
         if (var4.field5445 != -1 && client.cycle >= var4.field5444) {
            class469 var5 = var4.field5443;
            if (!var5.method9566()) {
               var4.vmethod10557();
               --var1.field1092;
            } else {
               int var6 = class145.method3747(var5, 1, client.field399);
               if ((var6 & 1) != 0) {
                  var4.vmethod10557();
                  --var1.field1092;
               }
            }
         }
      }

      if (var1.field1074.method9566() && var1.field1102 <= 1) {
         class215 var9 = var1.field1074.method9581();
         if (var9.field2492 == 1 && var1.field1040 > 0 && var1.field1085 <= client.cycle && var1.field1094 < client.cycle) {
            var1.field1102 = 1;
            return;
         }
      }

      if (var1.field1102 > 0) {
         --var1.field1102;
      } else {
         int var8 = class145.method3747(var1.field1074, 1, client.field399);
         if ((var8 & 2) != 0) {
            var1.field1074.method9612();
         }
      }

      var1.field1058 = var1.field1074.method9566() && var1.field1074.method9581().field2482;
      client.field399.method10859();
   }
}
