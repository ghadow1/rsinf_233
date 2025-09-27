package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
public class class157 extends class167 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1380060981
   )
   int field1817;
   @ObfuscatedName("aw")
   byte field1813;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1193055997
   )
   int field1815;
   @ObfuscatedName("ac")
   String field1816;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lga;"
   )
   final class168 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lga;)V"
   )
   class157(class168 var1) {
      this.this$0 = var1;
      this.field1817 = -1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "1665789280"
   )
   void vmethod4108(class590 var1) {
      this.field1817 = var1.method11198();
      this.field1813 = var1.method11197();
      this.field1815 = var1.method11198();
      var1.method11203();
      this.field1816 = var1.method11207();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lgm;I)V",
      garbageValue = "-358275379"
   )
   void vmethod4104(class171 var1) {
      class153 var2 = (class153)var1.field1918.get(this.field1817);
      var2.field1782 = this.field1813;
      var2.field1781 = this.field1815;
      var2.field1779 = new class613(this.field1816);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Lhu;",
      garbageValue = "1635156818"
   )
   public static class203 method3872(int var0) {
      class203 var1 = (class203)class203.field2237.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class16.field65.method8335(72, var0);
         var1 = new class203();
         var1.field2244 = var0;
         if (var2 != null) {
            var1.method4448(new class590(var2));
         }

         var1.method4473();
         class203.field2237.method7009(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "([FI)V",
      garbageValue = "-1189994107"
   )
   static void method3871(float[] var0) {
      if (var0[0] + class134.field1620 < 1.3333334F) {
         float var1 = var0[0] - 2.0F;
         float var2 = var0[0] - 1.0F;
         float var3 = (float)Math.sqrt((double)(var1 * var1 - var2 * 4.0F * var2));
         float var4 = (-var1 + var3) * 0.5F;
         if (class134.field1620 + var0[1] > var4) {
            var0[1] = var4 - class134.field1620;
         } else {
            var4 = 0.5F * (-var1 - var3);
            if (var0[1] < class134.field1620 + var4) {
               var0[1] = class134.field1620 + var4;
            }
         }
      } else {
         var0[0] = 1.3333334F - class134.field1620;
         var0[1] = 0.33333334F - class134.field1620;
      }

   }
}
