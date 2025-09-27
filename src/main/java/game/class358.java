package game;

import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
public class class358 {
   @ObfuscatedName("af")
   static boolean[] field4033;
   @ObfuscatedName("kr")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field4042;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   class412 field4029;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   class412 field4030;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   class412 field4031;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   class412 field4034;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   class412 field4039;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "[[Loi;"
   )
   public class369[][] field4037;
   @ObfuscatedName("as")
   Map field4035 = new HashMap();
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   class320 field4036 = new class320(200);
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   class320 field4032 = new class320(50);
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   class320 field4038 = new class320(20);
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   class320 field4028 = new class320(8);
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lsj;"
   )
   class490 field4040;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lsj;"
   )
   class490 field4041;

   @ObfuscatedSignature(
      descriptor = "(Lpx;Lpx;Lpx;Lpx;Lpx;)V"
   )
   public class358(class412 var1, class412 var2, class412 var3, class412 var4, class412 var5) {
      this.field4040 = new class490(10, class488.field5351);
      this.field4041 = new class490(10, class488.field5351);
      int var6 = 0;
      if (var1 != null) {
         this.field4029 = var1;
         this.field4031 = var2;
         this.field4034 = var3;
         this.field4039 = var4;
         this.field4030 = var5;
         var6 = this.field4029.method8344();
      }

      this.field4037 = new class369[var6][];
      field4033 = new boolean[var6];
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Loi;",
      garbageValue = "-1043661195"
   )
   public class369 method7476(int var1) {
      int var2 = var1 >> 16;
      int var3 = var1 & '\uffff';
      if (this.field4037[var2] == null || this.field4037[var2][var3] == null) {
         boolean var4 = this.method7478(var2);
         if (!var4) {
            return null;
         }
      }

      return this.field4037[var2][var3];
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIB)Loi;",
      garbageValue = "-18"
   )
   public class369 method7477(int var1, int var2) {
      class369 var3 = this.method7476(var1);
      if (var2 == -1) {
         return var3;
      } else {
         return var3 != null && var3.field4286 != null && var2 < var3.field4286.length ? var3.field4286[var2] : null;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "55"
   )
   public boolean method7478(int var1) {
      if (field4033[var1]) {
         return true;
      } else if (!this.field4029.method8411(var1)) {
         return false;
      } else {
         int var2 = this.field4029.method8347(var1);
         if (var2 == 0) {
            field4033[var1] = true;
            return true;
         } else {
            if (this.field4037[var1] == null) {
               this.field4037[var1] = new class369[var2];
            }

            int var3;
            class369 var5;
            for(var3 = 0; var3 < var2; ++var3) {
               if (this.field4037[var1][var3] == null) {
                  byte[] var4 = this.field4029.method8335(var1, var3);
                  if (var4 != null) {
                     var5 = new class369();
                     this.field4037[var1][var3] = var5;
                     var5.field4144 = var3 + (var1 << 16);
                     if (var4[0] == -1) {
                        var5.method8025(new class590(var4));
                     } else {
                        var5.method8036(new class590(var4));
                     }

                     if (this.field4030 != null) {
                        byte[] var6 = this.field4030.method8335(var1, var3);
                        if (var6 != null && var6.length > 0) {
                           var5.method7935(new class590(var6));
                           this.field4035.put(var5.field4257, var1);
                        }
                     }
                  }
               }
            }

            for(var3 = 0; var3 < var2; ++var3) {
               class369 var7 = this.field4037[var1][var3];
               if (var7 != null && var7.field4164 != -1) {
                  var5 = this.field4037[var1][var7.field4164 & '\uffff'];
                  if (var3 > var5.field4214) {
                     var5.field4214 = var3;
                  }

                  if (var3 < var5.field4248) {
                     var5.field4248 = var3;
                  }
               }
            }

            field4033[var1] = true;
            return true;
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "37"
   )
   public void method7479(int var1) {
      if (var1 != -1) {
         if (field4033[var1]) {
            this.field4029.method8350(var1);
            if (this.field4037[var1] != null) {
               for(int var2 = 0; var2 < this.field4037[var1].length; ++var2) {
                  if (this.field4037[var1][var2] != null) {
                     this.field4037[var1][var2] = null;
                  }
               }

               this.field4037[var1] = null;
               field4033[var1] = false;
            }
         }
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-416347178"
   )
   public void method7480() {
      this.field4036.method7011();
      this.field4032.method7011();
      this.field4038.method7011();
      this.field4028.method7011();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "26"
   )
   public static int method7496(int var0, int var1) {
      return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
   }
}
