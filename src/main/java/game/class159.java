package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
public class class159 extends class167 {
   @ObfuscatedName("ae")
   static int[][] field1828;
   @ObfuscatedName("kp")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field1830;
   @ObfuscatedName("ur")
   static boolean field1829;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1743477743
   )
   int field1827;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lga;"
   )
   final class168 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lga;)V"
   )
   class159(class168 var1) {
      this.this$0 = var1;
      this.field1827 = -1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "1665789280"
   )
   void vmethod4108(class590 var1) {
      this.field1827 = var1.method11198();
      var1.method11196();
      if (var1.method11196() != 255) {
         var1.buffer -= -290410379;
         var1.method11203();
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lgm;I)V",
      garbageValue = "-358275379"
   )
   void vmethod4104(class171 var1) {
      var1.method4069(this.field1827);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-106"
   )
   public static void method3885() {
      class184.field1991.method7011();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1961994213"
   )
   public static void method3892() {
      class339.field3889.clear();
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Lti;I)J",
      garbageValue = "725603009"
   )
   public static long method3891(class519 var0) {
      class328.method7046(var0, class574.field5820);
      int[] var1 = var0.method10318();
      int var2 = var0.method10322();
      long var3 = 0L;

      for(int var5 = 0; var5 < var2; ++var5) {
         var3 += (long)var1[var5];
      }

      return var3;
   }
}
