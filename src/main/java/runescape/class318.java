package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mi")
public final class class318 {
   @ObfuscatedName("af")
   int field3517;
   @ObfuscatedName("aw")
   int field3516;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lqm;"
   )
   class426 field3518;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lqg;"
   )
   class441 field3519;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lmb;"
   )
   class317 field3520;

   public class318(int var1, int var2) {
      this.field3519 = new class441();
      this.field3517 = var1;
      this.field3516 = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
      }

      this.field3518 = new class426(var3);
   }

   public class318(int var1) {
      this(var1, var1);
   }

   @ObfuscatedName("af")
   public Object method6978(long var1) {
      class322 var3 = (class322)this.field3518.method8596(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.vmethod7027();
         if (var4 == null) {
            var3.vmethod10557();
            var3.method10553();
            this.field3516 += var3.field3528;
            return null;
         } else {
            if (var3.vmethod7026()) {
               class321 var5 = new class321(var4, var3.field3528);
               this.field3518.method8590(var5, var3.field5600);
               this.field3519.method8847(var5);
               var5.field5594 = 0L;
               var3.vmethod10557();
               var3.method10553();
            } else {
               this.field3519.method8847(var3);
               var3.field5594 = 0L;
            }

            return var4;
         }
      }
   }

   @ObfuscatedName("aw")
   void method6979(long var1) {
      class322 var3 = (class322)this.field3518.method8596(var1);
      this.method6992(var3);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lmm;)V"
   )
   void method6992(class322 var1) {
      if (var1 != null) {
         var1.vmethod10557();
         var1.method10553();
         this.field3516 += var1.field3528;
      }

   }

   @ObfuscatedName("ac")
   public void method6980(Object var1, long var2) {
      this.method6977(var1, var2, 1);
   }

   @ObfuscatedName("ap")
   public void method6977(Object var1, long var2, int var4) {
      if (var4 > this.field3517) {
         throw new IllegalStateException();
      } else {
         this.method6979(var2);
         this.field3516 -= var4;

         while(this.field3516 < 0) {
            class322 var5 = (class322)this.field3519.method8848();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.vmethod7026()) {
            }

            this.method6992(var5);
            if (this.field3520 != null) {
               this.field3520.method6973(var5.vmethod7027());
            }
         }

         class321 var6 = new class321(var1, var4);
         this.field3518.method8590(var6, var2);
         this.field3519.method8847(var6);
         var6.field5594 = 0L;
      }
   }

   @ObfuscatedName("aq")
   public void method6982(int var1) {
      for(class322 var2 = (class322)this.field3519.method8849(); var2 != null; var2 = (class322)this.field3519.method8844()) {
         if (var2.vmethod7026()) {
            if (var2.vmethod7027() == null) {
               var2.vmethod10557();
               var2.method10553();
               this.field3516 += var2.field3528;
            }
         } else if (++var2.field5594 > (long)var1) {
            class319 var3 = new class319(var2.vmethod7027(), var2.field3528);
            this.field3518.method8590(var3, var2.field5600);
            class441.method8853(var3, var2);
            var2.vmethod10557();
            var2.method10553();
         }
      }

   }

   @ObfuscatedName("ao")
   public void method6987() {
      this.field3519.method8846();
      this.field3518.method8591();
      this.field3516 = this.field3517;
   }
}
