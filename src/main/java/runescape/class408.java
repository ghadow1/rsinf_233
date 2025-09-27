package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
public class class408 implements Runnable {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lqs;"
   )
   public static final class436 field4904 = new class436();
   @ObfuscatedName("aw")
   static final Object field4903 = new Object();
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lqs;"
   )
   public static class436 field4908 = new class436();
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1118150385
   )
   static int field4901 = 0;
   @ObfuscatedName("ao")
   static Thread field4906;

   class408() {
   }

   public void run() {
      try {
         while(true) {
            class407 var1;
            synchronized(field4904) {
               var1 = (class407)field4904.method8690();
            }

            if (var1 != null) {
               if (var1.field4898 == 0) {
                  var1.field4897.method10266((int)var1.field5600, var1.field4896, var1.field4896.length);
                  synchronized(field4904) {
                     var1.vmethod10557();
                  }
               } else if (var1.field4898 == 1) {
                  var1.field4896 = var1.field4897.method10265((int)var1.field5600);
                  synchronized(field4904) {
                     field4908.method8689(var1);
                  }
               }

               synchronized(field4903) {
                  if (field4901 <= 1) {
                     field4901 = 0;
                     field4903.notifyAll();
                     return;
                  }

                  field4901 = 600;
               }
            } else {
               class164.method4001(100L);
               synchronized(field4903) {
                  if (field4901 <= 1) {
                     field4901 = 0;
                     field4903.notifyAll();
                     return;
                  }

                  --field4901;
               }
            }
         }
      } catch (Exception var13) {
         class508.RunException_sendStackTrace((String)null, var13);
      }
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "-777180588"
   )
   static int method8285(int var0, class55 var1, boolean var2) {
      return 2;
   }
}
