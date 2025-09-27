package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
public class class325 {
   @ObfuscatedName("ix")
   @ObfuscatedGetter(
      intValue = -1154174731
   )
   static int field3537;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1295594443"
   )
   public static void method7034() {
      class182.field1980.method7011();
   }

   @ObfuscatedName("he")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "4"
   )
   static final void method7035(boolean var0) {
      if (var0) {
         client.field571 = class52.field743 ? class131.field1598 : class131.field1597;
      } else {
         client.field571 = class36.field239.method2572(class52.local_password) ? class131.field1602 : class131.field1596;
      }

   }
}
