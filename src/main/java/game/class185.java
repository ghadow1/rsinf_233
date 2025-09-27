package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
public class class185 extends class540 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   public static class412 field2018;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class320 field2015 = new class320(64);
   @ObfuscatedName("pq")
   static byte[][] field2014;
   @ObfuscatedName("at")
   public boolean field2016 = false;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "1113234237"
   )
   public void method4207(class590 var1) {
      while(true) {
         int var2 = var1.method11196();
         if (var2 == 0) {
            return;
         }

         this.method4208(var1, var2);
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lwb;IB)V",
      garbageValue = "107"
   )
   void method4208(class590 var1, int var2) {
      if (var2 == 2) {
         this.field2016 = true;
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-945324004"
   )
   public static boolean method4212(int var0, int var1) {
      return (var0 >> var1 & 1) != 0;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)Lhy;",
      garbageValue = "-2105276794"
   )
   public static class190 method4211(int var0) {
      class190 var1 = (class190)class190.field2066.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class190.field2070.method8335(8, var0);
         var1 = new class190();
         if (var2 != null) {
            var1.method4298(new class590(var2));
         }

         class190.field2066.method7009(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "895471414"
   )
   public static void method4206() {
      class208.field2270.method7011();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1558024971"
   )
   static void method4216(int var0) {
      --class58.field836;

      for(int var1 = var0; var1 < class58.field836; ++var1) {
         class58.field828[var1] = class58.field828[var1 + 1];
         class58.field832[var1] = class58.field832[var1 + 1];
         class58.field833[var1] = class58.field833[var1 + 1];
         class58.field834[var1] = class58.field834[var1 + 1];
         class58.field830[var1] = class58.field830[var1 + 1];
         class58.field831[var1] = class58.field831[var1 + 1];
         class58.field829[var1] = class58.field829[var1 + 1];
         class58.field835[var1] = class58.field835[var1 + 1];
      }

   }

   @ObfuscatedName("no")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "749451288"
   )
   static final void method4215(int var0) {
      if (class119.field1554.method7478(var0)) {
         class122.method3536(class119.field1554.field4037[var0], 0, class119.field1554.field4037[var0].length - 1, -1, -1);
      }
   }
}
