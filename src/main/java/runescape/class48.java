package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
public final class class48 extends class233 {
   @ObfuscatedName("km")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field688;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Ldr;"
   )
   final class79 field693;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 402610731
   )
   int field689;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 293528773
   )
   int field690;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -2021141769
   )
   int field691;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1096412731
   )
   int field692;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 859759075
   )
   int field696;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -703151279
   )
   int field694;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lsp;"
   )
   final class469 field695 = new class469();

   @ObfuscatedSignature(
      descriptor = "(Ldr;IIIIIII)V"
   )
   class48(class79 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.field693 = var1;
      this.field694 = var2;
      this.field690 = var3;
      this.field691 = var4;
      this.field692 = var5;
      this.field696 = var6;
      this.field689 = var8 + var7;
      this.field695.method9573(class433.method8663(this.field694).field2198);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-57"
   )
   boolean method1874() {
      return !this.field695.method9566();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "1"
   )
   final void method1875(int var1) {
      if (!this.method1874()) {
         client.field399.method10862(this.field693, this.field691, this.field692, false);
         int var2 = class145.method3747(this.field695, var1, client.field399);
         client.field399.method10859();
         if ((var2 & 1) != 0) {
            this.field695.method9612();
         }

      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Ljn;",
      garbageValue = "-1879635116"
   )
   protected final class241 vmethod5365() {
      if (this.field695.method9567(30)) {
         return null;
      } else {
         class201 var1 = class433.method8663(this.field694);
         class241 var2 = var1.method4407(this.field695.method9565());
         return var2 == null ? null : var2;
      }
   }
}
