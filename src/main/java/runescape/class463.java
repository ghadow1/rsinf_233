package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
public class class463 {
   @ObfuscatedName("fw")
   @ObfuscatedSignature(
      descriptor = "Lrv;"
   )
   static class461 field5239;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1362894113
   )
   int field5238;

   @ObfuscatedSignature(
      descriptor = "(IZ)V",
      garbageValue = "1"
   )
   class463(int var1, boolean var2) {
      this.field5238 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-380590534"
   )
   public int method9398() {
      return this.field5238;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lpx;III)[Lxt;",
      garbageValue = "299094537"
   )
   public static class605[] method9400(class412 var0, int var1, int var2) {
      return !class587.method11132(var0, var1, var2) ? null : class511.method10192();
   }
}
