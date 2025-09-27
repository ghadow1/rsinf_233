package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public abstract class class233 extends class539 {
   @ObfuscatedName("ez")
   @ObfuscatedGetter(
      intValue = 1493606971
   )
   public int field2801 = 1000;

   protected class233() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Ljn;",
      garbageValue = "-1879635116"
   )
   protected class241 vmethod5365() {
      return null;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(B)Lid;",
      garbageValue = "-102"
   )
   protected class224 vmethod5366() {
      return class224.field2627;
   }

   @ObfuscatedName("fr")
   void vmethod5531(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      class241 var15 = this.vmethod5365();
      if (var15 != null) {
         this.field2801 = var15.field2801;
         var15.method5493(this.vmethod5366());
         var15.method5479(var1, var2, var3, var4 - var7, var5 - var8, var6 - var9, var10);
         var15.method5493(class224.field2627);
      }

   }

   @ObfuscatedName("jo")
   @ObfuscatedSignature(
      descriptor = "(ILrj;IIIJ)V"
   )
   void vmethod5480(int var1, class454 var2, int var3, int var4, int var5, long var6) {
      class241 var8 = this.vmethod5365();
      if (var8 != null) {
         this.field2801 = var8.field2801;
         var8.method5493(this.vmethod5366());
         var8.vmethod5480(var1, var2, var3, var4, var5, var6);
         var8.method5493(class224.field2627);
      }

   }
}
