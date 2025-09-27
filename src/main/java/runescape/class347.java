package runescape;

import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
public class class347 extends class104 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lqs;"
   )
   class436 field3971 = new class436();
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Ldg;"
   )
   class93 field3969 = new class93();
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnf;"
   )
   class340 field3972;

   @ObfuscatedSignature(
      descriptor = "(Lnf;)V"
   )
   class347(class340 var1) {
      this.field3972 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lno;[IIIIB)V",
      garbageValue = "-31"
   )
   void method7371(class349 var1, int[] var2, int var3, int var4, int var5) {
      if ((this.field3972.field3905[var1.field3976] & 4) != 0 && var1.field3988 < 0) {
         int var6 = this.field3972.field3907[var1.field3976] / class97.field1356;

         while(true) {
            int var7 = (var6 + 1048575 - var1.field3996) / var6;
            if (var7 > var4) {
               var1.field3996 += var4 * var6;
               break;
            }

            var1.field3994.vmethod7347(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.field3996 += var6 * var7 - 1048576;
            int var8 = class97.field1356 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            class103 var10 = var1.field3994;
            if (this.field3972.field3928[var1.field3976] == 0) {
               var1.field3994 = class103.method3154(var1.field3978, var10.method3187(), var10.method3177(), var10.method3280());
            } else {
               var1.field3994 = class103.method3154(var1.field3978, var10.method3187(), 0, var10.method3280());
               this.field3972.method7164(var1, var1.field3991.field3959[var1.field3981] < 0);
               var1.field3994.method3184(var8, var10.method3177());
            }

            if (var1.field3991.field3959[var1.field3981] < 0) {
               var1.field3994.method3173(-1);
            }

            var10.method3186(var8);
            var10.vmethod7347(var2, var3, var5 - var3);
            if (var10.method3190()) {
               this.field3969.method2958(var10);
            }
         }
      }

      var1.field3994.vmethod7347(var2, var3, var4);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lno;IB)V",
      garbageValue = "50"
   )
   void method7362(class349 var1, int var2) {
      if ((this.field3972.field3905[var1.field3976] & 4) != 0 && var1.field3988 < 0) {
         int var3 = this.field3972.field3907[var1.field3976] / class97.field1356;
         int var4 = (var3 + 1048575 - var1.field3996) / var3;
         var1.field3996 = var3 * var2 + var1.field3996 & 1048575;
         if (var4 <= var2) {
            if (this.field3972.field3928[var1.field3976] == 0) {
               var1.field3994 = class103.method3154(var1.field3978, var1.field3994.method3187(), var1.field3994.method3177(), var1.field3994.method3280());
            } else {
               var1.field3994 = class103.method3154(var1.field3978, var1.field3994.method3187(), 0, var1.field3994.method3280());
               this.field3972.method7164(var1, var1.field3991.field3959[var1.field3981] < 0);
            }

            if (var1.field3991.field3959[var1.field3981] < 0) {
               var1.field3994.method3173(-1);
            }

            var2 = var1.field3996 / var3;
         }
      }

      var1.field3994.vmethod7348(var2);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "()Lef;"
   )
   protected class104 vmethod7346() {
      class349 var1 = (class349)this.field3971.method8690();
      if (var1 == null) {
         return null;
      } else {
         return (class104)(var1.field3994 != null ? var1.field3994 : this.vmethod7345());
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "()Lef;"
   )
   protected class104 vmethod7345() {
      class349 var1;
      do {
         var1 = (class349)this.field3971.method8692();
         if (var1 == null) {
            return null;
         }
      } while(var1.field3994 == null);

      return var1.field3994;
   }

   @ObfuscatedName("as")
   protected int vmethod7364() {
      return 0;
   }

   @ObfuscatedName("al")
   protected void vmethod7347(int[] var1, int var2, int var3) {
      this.field3969.vmethod7347(var1, var2, var3);

      for(class349 var6 = (class349)this.field3971.method8690(); var6 != null; var6 = (class349)this.field3971.method8692()) {
         if (!this.field3972.method7226(var6)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.field3995) {
                  this.method7371(var6, var1, var4, var5, var4 + var5);
                  var6.field3995 -= var5;
                  break;
               }

               this.method7371(var6, var1, var4, var6.field3995, var4 + var5);
               var4 += var6.field3995;
               var5 -= var6.field3995;
            } while(!this.field3972.method7180(var6, var1, var4, var5));
         }
      }

   }

   @ObfuscatedName("ai")
   protected void vmethod7348(int var1) {
      this.field3969.vmethod7348(var1);

      for(class349 var3 = (class349)this.field3971.method8690(); var3 != null; var3 = (class349)this.field3971.method8692()) {
         if (!this.field3972.method7226(var3)) {
            int var2 = var1;

            do {
               if (var2 <= var3.field3995) {
                  this.method7362(var3, var2);
                  var3.field3995 -= var2;
                  break;
               }

               this.method7362(var3, var3.field3995);
               var2 -= var3.field3995;
            } while(!this.field3972.method7180(var3, (int[])null, 0, var2));
         }
      }

   }
}
