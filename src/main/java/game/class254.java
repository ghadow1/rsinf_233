package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
public class class254 extends class271 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      longValue = 7030394511363782719L
   )
   long field3063 = System.nanoTime();

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2094683207"
   )
   public void vmethod6075() {
      this.field3063 = System.nanoTime();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-752736442"
   )
   public int vmethod6074(int var1, int var2) {
      long var3 = (long)var2 * 1000000L;
      long var5 = this.field3063 - System.nanoTime();
      if (var5 < var3) {
         var5 = var3;
      }

      class164.method4001(var5 / 1000000L);
      long var7 = System.nanoTime();

      int var9;
      for(var9 = 0; var9 < 10 && (var9 < 1 || this.field3063 < var7); this.field3063 += (long)var1 * 1000000L) {
         ++var9;
      }

      if (this.field3063 < var7) {
         this.field3063 = var7;
      }

      return var9;
   }
}
