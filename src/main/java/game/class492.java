package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
public class class492 extends class501 {
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lva;"
   )
   final class562 field5370;

   @ObfuscatedSignature(
      descriptor = "(Lva;)V"
   )
   public class492(class562 var1) {
      super(400);
      this.field5370 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Ltl;",
      garbageValue = "690274569"
   )
   class499 vmethod10007() {
      return new class502();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)[Ltl;",
      garbageValue = "-102"
   )
   class499[] vmethod9991(int var1) {
      return new class502[var1];
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lwb;II)V",
      garbageValue = "1440234999"
   )
   public void method9859(class590 var1, int var2) {
      while(var1.buffer * 1216585693 < var2) {
         int var3 = var1.method11196();
         if (var3 == 4) {
            class613 var10 = new class613(var1.method11207(), this.field5370);
            if (!var10.method11911()) {
               throw new IllegalStateException();
            }

            boolean var11 = false;
            class40.field279.method1547(var10.method11909(), var11);
         } else {
            boolean var4 = (var3 & 1) != 0;
            class613 var5 = new class613(var1.method11207(), this.field5370);
            class613 var6 = new class613(var1.method11207(), this.field5370);
            var1.method11207();
            if (!var5.method11911()) {
               throw new IllegalStateException();
            }

            class502 var7 = (class502)this.method9976(var5);
            if (var4) {
               class502 var8 = (class502)this.method9976(var6);
               if (var8 != null && var7 != var8) {
                  if (var7 != null) {
                     this.method10014(var8);
                  } else {
                     var7 = var8;
                  }
               }
            }

            if (var7 != null) {
               this.method9987(var7, var5, var6);
            } else if (this.method9972() < 400) {
               int var9 = this.method9972();
               var7 = (class502)this.method9979(var5, var6);
               var7.field5407 = var9;
            }
         }
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(Loi;IB)V",
      garbageValue = "-1"
   )
   static final void method9861(class369 var0, int var1) {
      if (var0.field4223 == null) {
         throw new RuntimeException();
      } else {
         if (var0.field4295 == null) {
            var0.field4295 = new int[var0.field4223.length];
         }

         var0.field4295[var1] = Integer.MAX_VALUE;
      }
   }
}
