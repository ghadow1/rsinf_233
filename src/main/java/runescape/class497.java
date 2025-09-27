package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
public class class497 extends class538 {
   @ObfuscatedName("ao")
   public static int[] field5390;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1759439157
   )
   public int field5389 = (int)(class189.method4284() / 1000L);
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lxa;"
   )
   public class613 field5391;
   @ObfuscatedName("at")
   public short field5388;

   @ObfuscatedSignature(
      descriptor = "(Lxa;I)V"
   )
   class497(class613 var1, int var2) {
      this.field5391 = var1;
      this.field5388 = (short)var2;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpx;Lpx;I)V",
      garbageValue = "2003318548"
   )
   public static void method9922(class412 var0, class412 var1) {
      class169.field1911 = var1;
      class184.field2012 = var0.method8347(35);
      class255.field3066 = new class184[class184.field2012];

      for(int var2 = 0; var2 < class184.field2012; ++var2) {
         byte[] var3 = var0.method8335(35, var2);
         class255.field3066[var2] = new class184(var2);
         if (var3 != null) {
            class255.field3066[var2].method4181(new Buffer(var3));
            class255.field3066[var2].method4183();
         }
      }

   }
}
