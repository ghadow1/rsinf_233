package game;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dg")
public class class93 extends class104 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lqs;"
   )
   class436 field1310 = new class436();
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lqs;"
   )
   class436 field1309 = new class436();
   @ObfuscatedName("at")
   int field1311 = 0;
   @ObfuscatedName("ac")
   int field1312 = -1;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lef;)V"
   )
   public final synchronized void method2958(class104 var1) {
      this.field1310.method8687(var1);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lef;)V"
   )
   public final synchronized void method2959(class104 var1) {
      var1.vmethod10557();
   }

   @ObfuscatedName("at")
   void method2960() {
      if (this.field1311 > 0) {
         for(class111 var1 = (class111)this.field1309.method8690(); var1 != null; var1 = (class111)this.field1309.method8692()) {
            var1.field1488 -= this.field1311;
         }

         this.field1312 -= this.field1311;
         this.field1311 = 0;
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Luk;Leg;)V"
   )
   void method2977(class544 var1, class111 var2) {
      while(this.field1309.field5122 != var1 && ((class111)var1).field1488 <= var2.field1488) {
         var1 = var1.field5599;
      }

      class436.method8697(var2, var1);
      this.field1312 = ((class111)this.field1309.field5122.field5599).field1488;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Leg;)V"
   )
   void method2962(class111 var1) {
      var1.vmethod10557();
      var1.method3424();
      class544 var2 = this.field1309.field5122.field5599;
      if (var2 == this.field1309.field5122) {
         this.field1312 = -1;
      } else {
         this.field1312 = ((class111)var2).field1488;
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "()Lef;"
   )
   protected class104 vmethod7346() {
      return (class104)this.field1310.method8690();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "()Lef;"
   )
   protected class104 vmethod7345() {
      return (class104)this.field1310.method8692();
   }

   @ObfuscatedName("as")
   protected int vmethod7364() {
      return 0;
   }

   @ObfuscatedName("al")
   public final synchronized void vmethod7347(int[] var1, int var2, int var3) {
      do {
         if (this.field1312 < 0) {
            this.method2965(var1, var2, var3);
            return;
         }

         if (var3 + this.field1311 < this.field1312) {
            this.field1311 += var3;
            this.method2965(var1, var2, var3);
            return;
         }

         int var4 = this.field1312 - this.field1311;
         this.method2965(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field1311 += var4;
         this.method2960();
         class111 var5 = (class111)this.field1309.method8690();
         synchronized(var5) {
            int var7 = var5.method3430();
            if (var7 < 0) {
               var5.field1488 = 0;
               this.method2962(var5);
            } else {
               var5.field1488 = var7;
               this.method2977(var5.field5599, var5);
            }
         }
      } while(var3 != 0);

   }

   @ObfuscatedName("au")
   void method2965(int[] var1, int var2, int var3) {
      for(class104 var4 = (class104)this.field1310.method8690(); var4 != null; var4 = (class104)this.field1310.method8692()) {
         var4.method3347(var1, var2, var3);
      }

   }

   @ObfuscatedName("ai")
   public final synchronized void vmethod7348(int var1) {
      do {
         if (this.field1312 < 0) {
            this.method2969(var1);
            return;
         }

         if (this.field1311 + var1 < this.field1312) {
            this.field1311 += var1;
            this.method2969(var1);
            return;
         }

         int var2 = this.field1312 - this.field1311;
         this.method2969(var2);
         var1 -= var2;
         this.field1311 += var2;
         this.method2960();
         class111 var3 = (class111)this.field1309.method8690();
         synchronized(var3) {
            int var5 = var3.method3430();
            if (var5 < 0) {
               var3.field1488 = 0;
               this.method2962(var3);
            } else {
               var3.field1488 = var5;
               this.method2977(var3.field5599, var3);
            }
         }
      } while(var1 != 0);

   }

   @ObfuscatedName("aa")
   void method2969(int var1) {
      for(class104 var2 = (class104)this.field1310.method8690(); var2 != null; var2 = (class104)this.field1310.method8692()) {
         var2.vmethod7348(var1);
      }

   }
}
