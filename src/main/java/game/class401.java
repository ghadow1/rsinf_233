package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
public class class401 {
   @ObfuscatedName("mc")
   @ObfuscatedGetter(
      intValue = -2105622257
   )
   static int field4855;
   @ObfuscatedName("vv")
   @ObfuscatedGetter(
      intValue = -336208599
   )
   static int field4853;

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)Lrj;",
      garbageValue = "1771498025"
   )
   public static class454 method8245() {
      synchronized(class454.field5185) {
         if (class172.field1931 == 0) {
            return new class454();
         } else {
            class454.field5185[--class172.field1931].method9090();
            return class454.field5185[class172.field1931];
         }
      }
   }
}
