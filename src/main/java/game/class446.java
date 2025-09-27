package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rf")
public class class446 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)[Lpg;",
      garbageValue = "1882011353"
   )
   public static class397[] method8926() {
      return new class397[]{class397.field4817, class397.field4834, class397.field4818, class397.field4831, class397.field4826, class397.field4832, class397.field4823, class397.field4825, class397.field4829, class397.field4816, class397.field4822, class397.field4821, class397.field4820, class397.field4827, class397.field4828, class397.field4830, class397.field4824};
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "107"
   )
   public static void method8923() {
      class187.field2040.method7011();
      class187.field2041.method7011();
   }

   @ObfuscatedName("mr")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "1588775097"
   )
   static final String method8925(int var0) {
      String var1 = Integer.toString(var0);

      for(int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + "," + var1.substring(var2);
      }

      if (var1.length() > 9) {
         return " " + class134.method3619(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
      } else {
         return var1.length() > 6 ? " " + class134.method3619(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class134.method3619(16776960) + var1 + "</col>";
      }
   }

   @ObfuscatedName("ni")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "0"
   )
   static final void method8916(int var0) {
      var0 = Math.max(Math.min(var0, 100), 0);
      var0 = 100 - var0;
      float var1 = 0.5F + (float)var0 / 200.0F;
      class259.method5906((double)var1);
   }
}
