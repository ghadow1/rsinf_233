package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class156 extends class151 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 2143805559
   )
   int field1809;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 45856019
   )
   int field1808;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -995894843
   )
   int field1807;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 951351033
   )
   int field1810;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfz;"
   )
   final class154 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfz;)V"
   )
   class156(class154 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-2943315"
   )
   void vmethod4111(Buffer var1) {
      this.field1809 = var1.read32BitArray();
      this.field1810 = var1.read32BitArray();
      this.field1808 = var1.method11196();
      this.field1807 = var1.method11196();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lgs;I)V",
      garbageValue = "2108880901"
   )
   void vmethod4112(class162 var1) {
      var1.method3931(this.field1809, this.field1810, this.field1808, this.field1807);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ldr;Lwf;II)V",
      garbageValue = "624706055"
   )
   static void method3864(class79 var0, PacketBuffer var1, int var2) {
      int var3 = var1.method11196();
      int var5;
      int var7;
      int var8;
      if (var3 < var0.field1176.method9790()) {
         for(int var4 = var3; var4 < var0.field1176.method9790(); ++var4) {
            var5 = var0.field1176.method9787(var4);
            class79 var26 = client.field333.method2350(var5);
            if (var26 != null) {
               for(var7 = 0; var7 < client.field335.field1254; ++var7) {
                  var8 = client.field335.field1243[var7];
                  client.field335.method2851((class69)var26.field1169.method8567((long)var8));
               }

               client.field333.method2376(var5);
            }

            class505 var29 = (class505)var0.field1171.method8596((long)var5);
            if (var29 != null) {
               var29.vmethod10557();
            }
         }
      }

      if (var3 > var0.field1176.method9790()) {
         throw new RuntimeException("");
      } else {
         var0.field1176.method9793();
         class279 var18 = new class279();

         int var6;
         for(var5 = 0; var5 < var3; ++var5) {
            var6 = var0.field1176.method9787(var5);
            class505 var21 = (class505)var0.field1171.method8596((long)var6);
            var8 = var1.method11196();
            int var22;
            int var23;
            if (var8 != 0) {
               var0.field1176.method9798(var6);
               if (var8 != 1) {
                  var18.method6282(var21.method10090());
                  byte var9 = var1.method11197();
                  if (var9 != 0) {
                     var22 = class363.method7521(var1, var9, 0);
                     var23 = class363.method7521(var1, var9, 2);
                     int var24 = class363.method7521(var1, var9, 4);
                     int var13 = class363.method7521(var1, var9, 6);
                     var18.method6301(var22, var23, var24, var13);
                  }

                  if (var8 == 2) {
                     var21.method10078(var18);
                  } else {
                     var21.method10129(var18);
                  }
               }

               if (var2 >= 6) {
                  class364.method7523(var21, var1);
               }
            } else {
               class79 var25 = client.field333.method2350(var6);
               if (var25 != null) {
                  for(var22 = 0; var22 < client.field335.field1254; ++var22) {
                     var23 = client.field335.field1243[var22];
                     client.field335.method2851((class69)var25.field1169.method8567((long)var23));
                  }

                  client.field333.method2376(var6);
               }

               if (var21 != null) {
                  var21.vmethod10557();
               }
            }
         }

         while(var1.method11149(client.packetWriter.serverPacketLength) > 0) {
            var5 = var1.readUnsignedShort();
            var0.field1176.method9798(var5);
            var6 = var1.method11196();
            var7 = var1.method11196();
            var8 = var6 * 8;
            int var27 = var7 * 8;
            class79 var10 = class46.method1773(var5, var8, var27);
            class505 var11 = new class505(var5, var10);
            var0.field1171.method8590(var11, (long)var5);
            var11.field5421 = var5;
            var11.field5431 = var0.field1172;
            var11.method10071(class157.method3872(var1.method11452()));
            class279 var12 = var11.field5422;
            var12.method6275(class356.method7417(0), class356.method7417(0));
            var12.method6294(0);
            var12.method6286(0);
            byte var28 = var1.method11197();
            if (var28 != 0) {
               int var14 = class363.method7521(var1, var28, 0);
               int var15 = class363.method7521(var1, var28, 2);
               int var16 = class363.method7521(var1, var28, 4);
               int var17 = class363.method7521(var1, var28, 6);
               var12.method6301(var14, var15, var16, var17);
            }

            var11.method10078(var11.field5422);
            class394[] var20 = new class394[]{class394.field4796, class394.field4801, class394.field4797};
            var11.method10074((class394)class173.findEnumerated(var20, var1.method11196()));
            if (var2 >= 6) {
               class364.method7523(var11, var1);
            }
         }

      }
   }
}
