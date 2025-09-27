package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
public class class80 extends class544 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lhi;"
   )
   class187 field1181;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lqn;"
   )
   class438 field1183 = new class438();

   @ObfuscatedSignature(
      descriptor = "(Lhi;)V"
   )
   class80(class187 var1) {
      this.field1181 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "1214026589"
   )
   void method2704(int var1, int var2, int var3, int var4) {
      class76 var5 = null;
      int var6 = 0;

      for(class76 var7 = (class76)this.field1183.method8748(); var7 != null; var7 = (class76)this.field1183.method8762()) {
         ++var6;
         if (var7.field1109 == var1) {
            var7.method2509(var1, var2, var3, var4);
            return;
         }

         if (var7.field1109 <= var1) {
            var5 = var7;
         }
      }

      if (var5 == null) {
         if (var6 < 4) {
            this.field1183.method8739(new class76(var1, var2, var3, var4));
         }

      } else {
         class438.method8737(new class76(var1, var2, var3, var4), var5);
         if (var6 >= 4) {
            this.field1183.method8748().vmethod10557();
         }

      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)Lch;",
      garbageValue = "-1632187519"
   )
   class76 method2705(int var1) {
      class76 var2 = (class76)this.field1183.method8748();
      if (var2 != null && var2.field1109 <= var1) {
         for(class76 var3 = (class76)this.field1183.method8762(); var3 != null && var3.field1109 <= var1; var3 = (class76)this.field1183.method8762()) {
            var2.vmethod10557();
            var2 = var3;
         }

         if (this.field1181.field2049 + var2.field1109 + var2.field1110 > var1) {
            return var2;
         } else {
            var2.vmethod10557();
            return null;
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-4"
   )
   boolean method2706() {
      return this.field1183.method8743();
   }
}
