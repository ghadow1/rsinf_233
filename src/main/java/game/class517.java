package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
public class class517 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpx;Lpx;I)V",
      garbageValue = "2016273975"
   )
   public static void method10310(class412 var0, class412 var1) {
      class186.field2023 = var0;
      class186.field2024 = var1;
      class186.field2022 = class186.field2023.method8347(3);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lti;II)V",
      garbageValue = "2133433682"
   )
   static void method10309(class519 var0, int var1) {
      if (var1 < 0 || var1 >= var0.method10322()) {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1713952680"
   )
   static void method10312() {
      class55.field800.method7011();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)Lbp;",
      garbageValue = "2121835308"
   )
   static class44 method10311() {
      class44.field627 = 0;
      return class27.method415();
   }
}
