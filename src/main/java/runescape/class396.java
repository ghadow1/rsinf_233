package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pq")
public enum class396 implements class430 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpq;"
   )
   field4813(0),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lpq;"
   )
   field4810(1),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lpq;"
   )
   field4811(2),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lpq;"
   )
   field4812(3);

   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 948767385
   )
   public static int screenHeight;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1920067021
   )
   public final int field4814;

   class396(int var3) {
      this.field4814 = var3;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1935172756"
   )
   public int vmethod11658() {
      return this.field4814;
   }
}
