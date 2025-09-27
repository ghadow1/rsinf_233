package game;

import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class102 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Leo;"
   )
   class110 field1386;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Ldv;"
   )
   class95 field1387;
   @ObfuscatedName("at")
   ReentrantLock field1388;

   @ObfuscatedSignature(
      descriptor = "(Leo;Ldv;)V"
   )
   class102(class110 var1, class95 var2) {
      this.field1386 = var1;
      this.field1387 = var2;
      this.field1388 = new ReentrantLock();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1494324479"
   )
   public static void method3148() {
      class212.field2314.method7011();
      class212.field2315.method7011();
      class212.field2312.method7011();
      class212.field2335.method7011();
   }
}
