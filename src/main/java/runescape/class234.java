package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jw")
public class class234 {
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Lgs;"
   )
   static class162 field2805;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 542673887
   )
   int field2803;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 694810815
   )
   int field2806;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1991757615
   )
   int field2804;

   class234() {
   }

   @ObfuscatedName("kq")
   @ObfuscatedSignature(
      descriptor = "(Ldr;IIIIIIIIIZI)V",
      garbageValue = "781510154"
   )
   static void method5375(class79 var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
      class85 var11 = new class85();
      var11.field1221 = var4;
      var11.field1222 = var5;
      var11.method2802(var6);
      var11.field1223 = var7 + client.field567;
      var11.field1224 = var8 + client.field567;
      var11.field1225 = var9;
      var11.field1226 = var10;
      if (var0.field1167[var1][var2][var3] == null) {
         var0.field1167[var1][var2][var3] = new class436();
      }

      var0.field1167[var1][var2][var3].method8689(var11);
      class72.method2337(var0, var1, var2, var3);
   }
}
