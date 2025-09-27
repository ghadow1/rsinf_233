package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class178 extends class540 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   public static class320 field1963 = new class320(64);
   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "Lxc;"
   )
   static class604 field1964;

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Loi;I)I",
      garbageValue = "1943525583"
   )
   static int method4156(class369 var0) {
      if (var0.field4147 != 11) {
         class46.field660[class46.field658 - 1] = "";
         return 1;
      } else {
         String var1 = (String)class46.field660[--class46.field658];
         class46.field660[++class46.field658 - 1] = var0.method7962(var1);
         return 1;
      }
   }
}
