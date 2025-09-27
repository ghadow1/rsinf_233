package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
public class class237 implements class251 {
   @ObfuscatedName("oe")
   @ObfuscatedGetter(
      longValue = -4736702138323274113L
   )
   static long field2846;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "[Lik;"
   )
   class221[] field2839;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lqs;"
   )
   class436 field2835 = new class436();
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1957067633
   )
   int field2837;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -625281243
   )
   int field2838 = 0;
   @ObfuscatedName("ap")
   double field2841 = 1.0D;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1976758453
   )
   int field2840 = 128;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   class412 field2836;

   @ObfuscatedSignature(
      descriptor = "(Lpx;Lpx;IDI)V"
   )
   public class237(class412 var1, class412 var2, int var3, double var4, int var6) {
      this.field2836 = var2;
      this.field2837 = var3;
      this.field2838 = this.field2837;
      this.field2841 = var4;
      this.field2840 = var6;
      int[] var7 = var1.method8353(0);
      if (var7 != null) {
         int var8 = var7.length;
         this.field2839 = new class221[var1.method8347(0)];

         for(int var9 = 0; var9 < var8; ++var9) {
            class590 var10 = new class590(var1.method8335(0, var7[var9]));
            this.field2839[var7[var9]] = new class221(var10);
         }
      } else {
         this.field2839 = new class221[0];
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1787541827"
   )
   public int method5386() {
      if (this.field2839.length == 0) {
         return 100;
      } else {
         int var1 = 0;
         int var2 = 0;
         class221[] var3 = this.field2839;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            class221 var5 = var3[var4];
            if (var5 != null && var5.field2581 != -1) {
               ++var1;
               if (this.field2836.method8381(var5.field2581)) {
                  ++var2;
               }
            }
         }

         if (var1 == 0) {
            return 0;
         } else {
            return var2 * 100 / var1;
         }
      }
   }

   @ObfuscatedName("aw")
   public void method5387(double var1) {
      this.field2841 = var1;
      this.method5391();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)[I",
      garbageValue = "-954219982"
   )
   public int[] vmethod5781(int var1) {
      class221 var2 = this.field2839[var1];
      if (var2 != null) {
         if (var2.field2586 != null) {
            this.field2835.method8687(var2);
            var2.field2587 = true;
            return var2.field2586;
         }

         boolean var3 = var2.method4922(this.field2841, this.field2840, this.field2836);
         if (var3) {
            if (this.field2838 == 0) {
               class221 var4 = (class221)this.field2835.method8695();
               var4.method4915();
            } else {
               --this.field2838;
            }

            this.field2835.method8687(var2);
            var2.field2587 = true;
            return var2.field2586;
         }
      }

      return null;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-50"
   )
   public int vmethod5779(int var1) {
      return this.field2839[var1] != null ? this.field2839[var1].field2578 : 0;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IS)Z",
      garbageValue = "20355"
   )
   public boolean vmethod5786(int var1) {
      return this.field2839[var1].field2583;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "31"
   )
   public void method5391() {
      for(int var1 = 0; var1 < this.field2839.length; ++var1) {
         if (this.field2839[var1] != null) {
            this.field2839[var1].method4915();
         }
      }

      this.field2835 = new class436();
      this.field2838 = this.field2837;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "901037758"
   )
   public void method5406(int var1) {
      for(int var2 = 0; var2 < this.field2839.length; ++var2) {
         class221 var3 = this.field2839[var2];
         if (var3 != null && var3.field2584 != 0 && var3.field2587) {
            var3.method4914(var1);
            var3.field2587 = false;
         }
      }

   }
}
