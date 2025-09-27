package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("wu")
public class class582 implements class430 {

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lwu;"
   )

   final int field5860;

   class582(int var3, int field5860) {
       this.field5860 = field5860;
   }

   @ObfuscatedSignature(
      descriptor = "(IZ)V",
      garbageValue = "1"
   )
   class582(int var3, boolean var4) {
      this.field5860 = var3;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1935172756"
   )
   public int vmethod11658() {
      return this.field5860;
   }
}
