package game;

import java.awt.FontMetrics;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class class180 extends class540 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   static class320 field1971 = new class320(64);
   @ObfuscatedName("ab")
   static FontMetrics field1973;

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "606382953"
   )
   public static void method4161() {
      synchronized(class35.field226) {
         class35.field218 = class35.field228;
         class35.field231 = class35.field225;
         class35.field220 = class35.field230;
         class35.field232 = class35.field237;
         class35.field222 = class35.field235;
         class35.field221 = class35.field233;
         class35.field224 = class35.field234;
         class35.field219 = class35.field216;
         class35.field235 = 0;
      }
   }

   @ObfuscatedName("ob")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1677386555"
   )
   static final void method4162() {
      class329 var0 = class130.method3593(class327.field3626, client.field314.field1308);
      var0.field3664.writeByte(0);
      client.field314.prepData(var0);
   }
}
