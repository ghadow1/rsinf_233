package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
public class class163 extends class167 {
   @ObfuscatedName("pe")
   @ObfuscatedGetter(
      intValue = 1743196271
   )
   static int field1873;
   @ObfuscatedName("ty")
   @ObfuscatedGetter(
      intValue = -103445513
   )
   static int field1872;
   @ObfuscatedName("af")
   String field1878;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1285409083
   )
   int field1877;
   @ObfuscatedName("at")
   byte field1874;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lga;"
   )
   final class168 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lga;)V"
   )
   class163(class168 var1) {
      this.this$0 = var1;
      this.field1878 = null;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "1665789280"
   )
   void vmethod4108(Buffer var1) {
      if (var1.method11196() != 255) {
         var1.offset -= -290410379;
         var1.method11203();
      }

      this.field1878 = var1.method11206();
      this.field1877 = var1.readUnsignedShort();
      this.field1874 = var1.method11197();
      var1.method11203();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lgm;I)V",
      garbageValue = "-358275379"
   )
   void vmethod4104(class171 var1) {
      class153 var2 = new class153();
      var2.field1779 = new class613(this.field1878);
      var2.field1781 = this.field1877;
      var2.field1782 = this.field1874;
      var1.method4068(var2);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)[Lko;",
      garbageValue = "46"
   )
   public static class280[] method3999() {
      return new class280[]{class280.field3280, class280.field3279, class280.field3281, class280.field3282};
   }

   @ObfuscatedName("ih")
   @ObfuscatedSignature(
      descriptor = "(Lcv;III)V",
      garbageValue = "-1492584916"
   )
   static void method3993(class69 var0, int var1, int var2) {
      class215 var3 = var0.field1074.method9581();
      if (var1 == var0.field1074.method9596() && var1 != -1) {
         int var4 = var3.field2489;
         if (var4 == 1) {
            var0.field1074.method9572();
            var0.field1102 = var2;
         }

         if (var4 == 2) {
            var0.field1074.method9589();
         }
      } else if (var1 == -1 || !var0.field1074.method9566() || class177.method4155(var1).field2480 >= var3.field2480) {
         var0.field1074.method9573(var1);
         var0.field1074.method9572();
         var0.field1102 = var2;
         var0.field1040 = var0.field1100;
      }

   }
}
