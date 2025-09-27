package game;

import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class1 implements Callable {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lwb;"
   )
   final class590 field1;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lac;"
   )
   final class3 field4;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Las;"
   )
   final class7 this$0;

   @ObfuscatedSignature(
      descriptor = "(Las;Lwb;Lac;)V"
   )
   class1(class7 var1, class590 var2, class3 var3) {
      this.this$0 = var1;
      this.field1 = var2;
      this.field4 = var3;
   }

   public Object call() {
      return this.field4.vmethod12(this.field1);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Loi;IB)V",
      garbageValue = "-15"
   )
   static void method11(class369 var0, int var1) {
      if (var0.field4147 == 0 && var0.field4145 * -217986249 > -1) {
         if (var1 > var0.field4214) {
            var0.field4214 = var1;
         }

         if (var1 < var0.field4248) {
            var0.field4248 = var1;
         }
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lef;I)V",
      garbageValue = "-28007039"
   )
   static final void method7(class104 var0) {
      var0.field1411 = false;
      if (var0.field1412 != null) {
         var0.field1412.field1547 = 0;
      }

      for(class104 var1 = var0.vmethod7346(); var1 != null; var1 = var0.vmethod7345()) {
         method7(var1);
      }

   }

   @ObfuscatedName("nd")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-690163849"
   )
   static final void method10(int var0) {
      if (class119.field1554.method7478(var0)) {
         class369[] var1 = class119.field1554.field4037[var0];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            class369 var3 = var1[var2];
            if (var3 != null) {
               var3.field4284 = 0;
               var3.field4135 = 0;
            }
         }

      }
   }
}
