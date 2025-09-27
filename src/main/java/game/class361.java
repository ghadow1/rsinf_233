package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
public class class361 {
   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "0"
   )
   static final void method7513(int var0) {
      class386.method8194();
      switch(var0) {
      case 1:
         class78.method2677(24);
         class66.method2147("", "You were disconnected from the server.", "");
         break;
      case 2:
         class78.method2677(24);
         class66.method2147("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
      }

   }

   @ObfuscatedName("hr")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1153709617"
   )
   static final void method7512() {
      if (client.field579 > 0) {
         class386.method8194();
      } else {
         client.field471.method8248();
         class121.method3521(40);
         class10.field50 = client.field314.method2941();
         client.field314.method2940();
      }
   }
}
