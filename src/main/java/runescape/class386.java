package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
public class class386 {
   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "Lxc;"
   )
   static class604 field4416;
   @ObfuscatedName("pr")
   static int[] field4415;

   @ObfuscatedName("ht")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1940577976"
   )
   static final void method8194() {
      client.packetWriter.close();
      class556.method10845();
      client.field333.method2387();
      client.field334.method8685();
      client.field335.method2847();
      client.field598.method6085();
      System.gc();
      class257.method5884(0, 0);
      class159.method3892();
      client.field446 = false;
      class296.method6773();
      class121.updateGameState(10);
      client.field567 = 0;
      class259.method5905().method5965();
      class259.method5905().method5966();
   }
}
