package game;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.File;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
public final class class23 extends Canvas {
   @ObfuscatedName("ad")
   static File field99;
   @ObfuscatedName("gd")
   @ObfuscatedGetter(
      intValue = 2068617489
   )
   static int field94;
   @ObfuscatedName("af")
   Component field95;

   class23(Component var1) {
      this.field95 = var1;
   }

   public final void update(Graphics var1) {
      this.field95.update(var1);
   }

   public final void paint(Graphics var1) {
      this.field95.paint(var1);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1316501754"
   )
   public static boolean method338(int var0) {
      return (var0 >> 21 & 1) != 0;
   }

   @ObfuscatedName("ma")
   @ObfuscatedSignature(
      descriptor = "([Loi;Loi;ZB)V",
      garbageValue = "29"
   )
   static void method337(class369[] var0, class369 var1, boolean var2) {
      int var3 = var1.field4193 != 0 ? var1.field4193 : var1.field4160 * 469894397;
      int var4 = var1.field4172 != 0 ? var1.field4172 : var1.field4149 * 1156037777;
      class537.method10545(var0, var1.field4248, var1.field4214, var1.field4144, var1.field4145 * -217986249, var3, var4, var2);
      if (var1.field4286 != null) {
         class537.method10545(var1.field4286, 0, var1.field4286.length - 1, var1.field4144, -1, var3, var4, var2);
      }

      if (var1.field4145 * -217986249 == -1) {
         class64 var5 = (class64)client.field422.method8623((long)var1.field4144);
         if (var5 != null) {
            class382.method8179(var5.field888, var3, var4, var2);
         }
      }

      if (var1.field4168 == 1337) {
      }

   }

   @ObfuscatedName("pc")
   @ObfuscatedSignature(
      descriptor = "(II)Lwd;",
      garbageValue = "-1437045612"
   )
   static class578 method333(int var0) {
      class578 var1 = (class578)client.field463.method7018((long)var0);
      if (var1 == null) {
         var1 = new class578(class286.field3302, class456.method9207(var0), class512.method10223(var0));
         client.field463.method7009(var1, (long)var0);
      }

      return var1;
   }
}
