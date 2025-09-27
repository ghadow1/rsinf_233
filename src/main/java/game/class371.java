package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
public abstract class class371 {
   @ObfuscatedName("iw")
   @ObfuscatedGetter(
      longValue = -1229276694949097609L
   )
   static long field4311;

   class371() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)[B",
      garbageValue = "1821922934"
   )
   abstract byte[] vmethod8133();

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "([BB)V",
      garbageValue = "0"
   )
   abstract void vmethod8137(byte[] var1);

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "96"
   )
   public static int method8118(int var0, int var1) {
      return (int)(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) & 2047;
   }

   @ObfuscatedName("nc")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-65"
   )
   static final void method8125(int var0) {
      class39.method768();
      class467.method9559();
      int var1 = class75.method2508(var0).field1982;
      if (var1 != 0) {
         int var2 = class355.field4022[var0];
         if (var1 == 1) {
            if (var2 == 1) {
               class259.method5906(0.9D);
            }

            if (var2 == 2) {
               class259.method5906(0.8D);
            }

            if (var2 == 3) {
               class259.method5906(0.7D);
            }

            if (var2 == 4) {
               class259.method5906(0.6D);
            }
         }

         if (var1 == 3) {
            if (var2 == 0) {
               class240.method5445(255);
            }

            if (var2 == 1) {
               class240.method5445(192);
            }

            if (var2 == 2) {
               class240.method5445(128);
            }

            if (var2 == 3) {
               class240.method5445(64);
            }

            if (var2 == 4) {
               class240.method5445(0);
            }
         }

         if (var1 == 4) {
            if (var2 == 0) {
               class270.method6071(127);
            }

            if (var2 == 1) {
               class270.method6071(96);
            }

            if (var2 == 2) {
               class270.method6071(64);
            }

            if (var2 == 3) {
               class270.method6071(32);
            }

            if (var2 == 4) {
               class270.method6071(0);
            }
         }

         if (var1 == 5) {
            client.field520 = var2 == 1;
         }

         if (var1 == 6) {
            client.field534 = var2;
         }

         if (var1 == 9) {
         }

         if (var1 == 10) {
            if (var2 == 0) {
               class558.method10857(127);
            }

            if (var2 == 1) {
               class558.method10857(96);
            }

            if (var2 == 2) {
               class558.method10857(64);
            }

            if (var2 == 3) {
               class558.method10857(32);
            }

            if (var2 == 4) {
               class558.method10857(0);
            }
         }

         if (var1 == 17) {
            client.field429 = var2 & '\uffff';
         }

         class84[] var3;
         if (var1 == 18) {
            var3 = new class84[]{class84.field1216, class84.field1212, class84.field1211, class84.field1214, class84.field1213};
            client.field340 = (class84)class173.method4100(var3, var2);
            if (client.field340 == null) {
               client.field340 = class84.field1214;
            }
         }

         if (var1 == 19) {
            if (var2 == -1) {
               client.field519 = -1;
            } else {
               client.field519 = var2 & 2047;
            }
         }

         if (var1 == 22) {
            var3 = new class84[]{class84.field1216, class84.field1212, class84.field1211, class84.field1214, class84.field1213};
            client.field318 = (class84)class173.method4100(var3, var2);
            if (client.field318 == null) {
               client.field318 = class84.field1214;
            }
         }

      }
   }
}
