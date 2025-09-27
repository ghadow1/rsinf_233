package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
public final class class320 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lua;"
   )
   class540 field3524 = new class540();
   @ObfuscatedName("aw")
   int field3522;
   @ObfuscatedName("at")
   int field3526;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lqm;"
   )
   class426 field3525;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lqg;"
   )
   class441 field3523 = new class441();

   public class320(int var1) {
      this.field3522 = var1;
      this.field3526 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
      }

      this.field3525 = new class426(var2);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(J)Lua;"
   )
   public class540 method7018(long var1) {
      class540 var3 = (class540)this.field3525.method8596(var1);
      if (var3 != null) {
         this.field3523.method8847(var3);
      }

      return var3;
   }

   @ObfuscatedName("aw")
   public void method7010(long var1) {
      class540 var3 = (class540)this.field3525.method8596(var1);
      if (var3 != null) {
         var3.vmethod10557();
         var3.method10553();
         ++this.field3526;
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lua;J)V"
   )
   public void method7009(class540 var1, long var2) {
      if (this.field3526 == 0) {
         class540 var4 = this.field3523.method8848();
         var4.vmethod10557();
         var4.method10553();
         if (var4 == this.field3524) {
            var4 = this.field3523.method8848();
            var4.vmethod10557();
            var4.method10553();
         }
      } else {
         --this.field3526;
      }

      this.field3525.method8590(var1, var2);
      this.field3523.method8847(var1);
   }

   @ObfuscatedName("ac")
   public void method7011() {
      this.field3523.method8846();
      this.field3525.method8591();
      this.field3524 = new class540();
      this.field3526 = this.field3522;
   }
}
