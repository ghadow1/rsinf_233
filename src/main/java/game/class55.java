package game;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
public class class55 extends class540 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   static class320 field800 = new class320(128);
   @ObfuscatedName("fh")
   static boolean field793;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "[Lqm;"
   )
   class426[] field794;
   @ObfuscatedName("at")
   String field795;
   @ObfuscatedName("ac")
   int[] field796;
   @ObfuscatedName("ap")
   int[] field801;
   @ObfuscatedName("aq")
   String[] field798;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1797357531
   )
   int field799;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 814391737
   )
   int field797;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1207287197
   )
   int field802;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 562338133
   )
   int field804;

   class55() {
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IB)[Lqm;",
      garbageValue = "32"
   )
   class426[] method1993(int var1) {
      return new class426[var1];
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1984251400"
   )
   static final void method2006(String var0) {
      class206.method4512(var0 + " is already on your ignore list");
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(S)[B",
      garbageValue = "-9152"
   )
   public static byte[] method2005() {
      byte[] var0 = new byte[24];

      try {
         class260.field3104.method10916(0L);
         class260.field3104.method10919(var0);

         int var1;
         for(var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
         }

         if (var1 >= 24) {
            throw new IOException();
         }
      } catch (Exception var4) {
         for(int var2 = 0; var2 < 24; ++var2) {
            var0[var2] = -1;
         }
      }

      return var0;
   }
}
