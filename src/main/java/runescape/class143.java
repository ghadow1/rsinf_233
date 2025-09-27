package runescape;

import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
class class143 implements Callable {
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfh;"
   )
   final class146 this$0;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lwb;"
   )
   final Buffer val$p;
   // $FF: synthetic field
   final int val$version;

   @ObfuscatedSignature(
      descriptor = "(Lfh;Lwb;I)V"
   )
   class143(class146 var1, Buffer var2, int var3) {
      this.this$0 = var1;
      this.val$p = var2;
      this.val$version = var3;
   }

   public Object call() {
      this.this$0.method3783(this.val$p, this.val$version);
      return null;
   }

   @ObfuscatedName("np")
   @ObfuscatedSignature(
      descriptor = "(IIII)Lcu;",
      garbageValue = "-1465366104"
   )
   static final class64 method3733(int var0, int var1, int var2) {
      class64 var3 = new class64();
      var3.field888 = var1;
      var3.field886 = var2;
      client.field422.method8625(var3, (long)var0);
      class1.method10(var1);
      class369 var4 = class119.field1554.method7476(var0);
      class89.method2877(var4);
      if (client.field564 != null) {
         class89.method2877(client.field564);
         client.field564 = null;
      }

      class23.method337(class119.field1554.field4037[var0 >> 16], var4, false);
      StudioGame.method8640(var1);
      if (client.rootInterface != -1) {
         class142.method3730(client.rootInterface, 1);
      }

      return var3;
   }
}
