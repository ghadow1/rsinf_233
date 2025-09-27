package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tq")
public class class494 extends class501 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lva;"
   )
   final LoginType field5372;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lqk;"
   )
   public class439 field5374 = new class439();
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1837337347
   )
   int field5375 = 1;

   @ObfuscatedSignature(
      descriptor = "(Lva;)V"
   )
   public class494(LoginType var1) {
      super(400);
      this.field5372 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Ltl;",
      garbageValue = "690274569"
   )
   class499 vmethod10007() {
      return new class496();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)[Ltl;",
      garbageValue = "-102"
   )
   class499[] vmethod9991(int var1) {
      return new class496[var1];
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lxa;ZI)Z",
      garbageValue = "-291432407"
   )
   public boolean method9868(class613 var1, boolean var2) {
      class496 var3 = (class496)this.method10013(var1);
      if (var3 == null) {
         return false;
      } else {
         return !var2 || var3.field5411 != 0;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lwb;II)V",
      garbageValue = "-1006641339"
   )
   public void method9869(Buffer var1, int var2) {
      while(true) {
         if (var1.offset * 1216585693 < var2) {
            boolean var3 = var1.method11196() == 1;
            class613 var4 = new class613(var1.method11207(), this.field5372);
            class613 var5 = new class613(var1.method11207(), this.field5372);
            int var6 = var1.readUnsignedShort();
            int var7 = var1.method11196();
            int var8 = var1.method11196();
            boolean var9 = (var8 & 2) != 0;
            boolean var10 = (var8 & 1) != 0;
            if (var6 > 0) {
               var1.method11207();
               var1.method11196();
               var1.read32BitArray();
            }

            var1.method11207();
            if (var4 != null && var4.method11911()) {
               class496 var11 = (class496)this.method9976(var4);
               if (var3) {
                  class496 var12 = (class496)this.method9976(var5);
                  if (var12 != null && var12 != var11) {
                     if (var11 != null) {
                        this.method10014(var12);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if (var11 != null) {
                  this.method9987(var11, var4, var5);
                  if (var6 != var11.field5411) {
                     boolean var14 = true;

                     for(class497 var13 = (class497)this.field5374.method8830(); var13 != null; var13 = (class497)this.field5374.method8823()) {
                        if (var13.field5391.equals(var4)) {
                           if (var6 != 0 && var13.field5388 == 0) {
                              var13.method10549();
                              var14 = false;
                           } else if (var6 == 0 && var13.field5388 != 0) {
                              var13.method10549();
                              var14 = false;
                           }
                        }
                     }

                     if (var14) {
                        this.field5374.method8822(new class497(var4, var6));
                     }
                  }
               } else {
                  if (this.method9972() >= 400) {
                     continue;
                  }

                  var11 = (class496)this.method9979(var4, var5);
               }

               if (var6 != var11.field5411) {
                  var11.field5410 = ++this.field5375 - 1;
                  if (var11.field5411 == -1 && var6 == 0) {
                     var11.field5410 = -(var11.field5410 * 778534179) * 500734603;
                  }

                  var11.field5411 = var6 * 21363 * 584845755;
               }

               var11.field5412 = var7;
               var11.field5385 = var9;
               var11.field5386 = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.method10010();
         return;
      }
   }
}
