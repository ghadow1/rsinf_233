package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("xx")
public class class610 {
   @ObfuscatedName("af")
   boolean field6053;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 437518483
   )
   public int field6052 = 0;
   @ObfuscatedName("at")
   public int[] field6067;
   @ObfuscatedName("ac")
   public int[] field6054;
   @ObfuscatedName("ap")
   public int[] field6055;
   @ObfuscatedName("aq")
   public int[] field6064;
   @ObfuscatedName("ao")
   public int[] field6057;
   @ObfuscatedName("as")
   public int[] field6060;
   @ObfuscatedName("al")
   public String[] field6056;
   @ObfuscatedName("au")
   public String[] field6062;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "[Lxx;"
   )
   public class610[] field6061;
   @ObfuscatedName("aa")
   public boolean[] field6051;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1699925617
   )
   int field6063;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1983324149
   )
   int field6058;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -46345949
   )
   int field6065;
   @ObfuscatedName("ae")
   int field6066;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1240416743
   )
   int field6059;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 440763903
   )
   int field6068;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      longValue = -1340367106229341551L
   )
   long field6069;

   public class610(boolean var1) {
      int var2 = var1 ? 500 : 20;
      this.field6053 = var1;
      this.field6067 = new int[var2];
      this.field6054 = new int[var2];
      this.field6055 = new int[var2];
      this.field6064 = new int[var2];
      this.field6057 = new int[var2];
      this.field6060 = new int[var2];
      this.field6056 = new String[var2];
      this.field6062 = new String[var2];
      this.field6061 = new class610[var2];
      this.field6051 = new boolean[var2];
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "-69720355"
   )
   public final String method11859(int var1) {
      if (var1 < 0) {
         return "";
      } else {
         return !this.field6062[var1].isEmpty() ? this.field6056[var1] + " " + this.field6062[var1] : this.field6056[var1];
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-131495321"
   )
   void method11861() {
      this.field6065 = class333.field3831.method9415("Choose Option");

      for(int var1 = 0; var1 < this.field6052; ++var1) {
         int var2 = class333.field3831.method9415(this.method11859(var1));
         if (this.field6061[var1] != null) {
            var2 += 15;
         }

         if (var2 > this.field6065) {
            this.field6065 = var2;
         }
      }

      this.field6065 += 8;
      this.field6066 = this.field6052 * 529411151 + 427507460;
      if (this.field6053) {
         this.field6066 += -223700078;
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "934996814"
   )
   public final void method11868(int var1, int var2) {
      this.method11861();
      this.field6063 = var1 - this.field6065 / 2;
      if (this.field6063 + this.field6065 > class34.screenWidth) {
         this.field6063 = class34.screenWidth - this.field6065;
      }

      if (this.field6063 < 0) {
         this.field6063 = 0;
      }

      this.field6058 = var2;
      if (this.field6066 * 758988865 + this.field6058 > class396.screenHeight) {
         this.field6058 = class396.screenHeight - this.field6066 * 758988865;
      }

      if (this.field6058 < 0) {
         this.field6058 = 0;
      }

      if (this.field6059 != -1 && this.field6061[this.field6059] != null) {
         this.field6061[this.field6059].method11869(this);
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lxx;B)V",
      garbageValue = "-4"
   )
   final void method11869(class610 var1) {
      this.method11861();
      this.field6063 = var1.field6065 + var1.field6063;
      if (this.field6065 + this.field6063 > class34.screenWidth) {
         this.field6063 = var1.field6063 - this.field6065;
      }

      if (this.field6063 < 0) {
         this.field6063 = 0;
      }

      int var2 = var1.field6052 * 15 - 15 - var1.field6059 * 15 + var1.field6058;
      if (var1.field6053) {
         var2 += 17;
      }

      int var3 = var2 + 19;
      this.field6058 = var2;
      if (this.field6066 * 758988865 + this.field6058 > class396.screenHeight) {
         this.field6058 = var3 - this.field6066 * 758988865;
      }

      if (this.field6058 < 0) {
         this.field6058 = 0;
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "34334073"
   )
   final int method11885(int var1, int var2) {
      for(int var3 = 0; var3 < this.field6052; ++var3) {
         int var4 = this.field6058 + (this.field6052 - 1 - var3) * 15 + 14;
         if (this.field6053) {
            var4 += 17;
         }

         if (var1 > this.field6063 && var1 < this.field6063 + this.field6065 && var2 > var4 - 13 && var2 < var4 + 3) {
            return var3;
         }
      }

      return -1;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-89740103"
   )
   public final void method11863(int var1) {
      if (var1 >= 0) {
         class482.method9729(this.field6067[var1], this.field6054[var1], this.field6055[var1], this.field6064[var1], this.field6057[var1], this.field6060[var1], this.field6056[var1], this.field6062[var1], class35.field221, class35.field224);
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "901420117"
   )
   public final boolean method11900(int var1, int var2) {
      if (this.field6059 != -1 && this.field6061[this.field6059] != null && this.field6061[this.field6059].method11900(var1, var2)) {
         return true;
      } else if (var1 >= this.field6063 - 10 && var1 <= this.field6065 + this.field6063 + 10 && var2 >= this.field6058 - 10 && var2 <= this.field6058 + this.field6066 * 758988865 + 10) {
         int var3 = this.method11885(var1, var2);
         if (var3 != -1 && var3 != this.field6059) {
            if (var3 != this.field6068) {
               this.field6068 = var3;
               this.field6069 = class189.method4284();
               if (this.field6059 != -1) {
                  this.field6069 += 300L;
               }
            }

            if (this.field6069 <= class189.method4284()) {
               this.field6068 = -1;
               this.method11866();
               if (this.field6061[var3] != null) {
                  this.field6059 = var3;
                  this.field6061[var3].method11869(this);
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "683822367"
   )
   public final boolean method11865(int var1, int var2) {
      if (this.field6059 != -1 && this.field6061[this.field6059] != null && this.field6061[this.field6059].method11865(var1, var2)) {
         return true;
      } else {
         int var3 = this.method11885(var1, var2);
         if (var3 != -1) {
            this.method11863(var3);
            return true;
         } else {
            return false;
         }
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1474329272"
   )
   public final void method11888() {
      this.field6059 = -1;

      for(int var1 = 0; var1 < this.field6052; ++var1) {
         if (this.field6061[var1] != null) {
            this.field6061[var1].method11888();
         }
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1273790628"
   )
   public final void method11867() {
      class277.method6236(this.field6063, this.field6058, this.field6065, this.field6066 * 758988865);
      this.method11866();
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "82"
   )
   final void method11866() {
      if (this.field6059 != -1) {
         if (this.field6061[this.field6059] != null) {
            this.field6061[this.field6059].method11867();
         }

         this.field6059 = -1;
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZIB)I",
      garbageValue = "0"
   )
   public final int method11879(String var1, String var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
      if (this.field6052 < this.field6056.length) {
         this.field6056[this.field6052] = var1;
         this.field6062[this.field6052] = var2;
         this.field6055[this.field6052] = var3;
         this.field6064[this.field6052] = var4;
         this.field6067[this.field6052] = var5;
         this.field6054[this.field6052] = var6;
         this.field6057[this.field6052] = var7;
         this.field6060[this.field6052] = var9;
         this.field6051[this.field6052] = var8;
         this.field6061[this.field6052] = null;
         return ++this.field6052 - 1;
      } else {
         return -1;
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1841306569"
   )
   public final void method11877() {
      int var1 = this.field6063;
      int var2 = this.field6058;
      int var3 = 6116423;
      class601.method11558(var1, var2, this.field6065, this.field6066 * 758988865, var3);
      if (this.field6053) {
         class601.method11558(var1 + 1, var2 + 1, this.field6065 - 2, 16, 0);
         class601.method11562(var1 + 1, var2 + 18, this.field6065 - 2, this.field6066 * 758988865 - 19, 0);
         class333.field3831.method9420("Choose Option", var1 + 3, var2 + 14, var3, -1);
      } else {
         class601.method11562(var1 + 1, var2 + 1, this.field6065 - 2, this.field6066 * 758988865 - 2, 0);
      }

      int var4 = class35.field231;
      int var5 = class35.field220;

      for(int var6 = 0; var6 < this.field6052; ++var6) {
         int var7 = var2 + (this.field6052 - 1 - var6) * 15 + 14;
         if (this.field6053) {
            var7 += 17;
         }

         int var8 = 16777215;
         if (var4 > var1 && var4 < var1 + this.field6065 && var5 > var7 - 13 && var5 < var7 + 3) {
            var8 = 16776960;
         }

         if (var6 == this.field6059 || var6 == this.field6068 && this.field6061[var6] != null) {
            class601.method11558(var1 + 2, var7 - 12, this.field6065 - 4, 15, 7496785);
         }

         class333.field3831.method9420(this.method11859(var6), var1 + 3, var7, var8, 0);
         if (this.field6061[var6] != null) {
            class333.field3831.method9434(62, var1 + this.field6065 - 10, var7, 16777215);
         }
      }

      class10.method103(this.field6063, this.field6058, this.field6065, this.field6066 * 758988865);
      if (this.field6059 != -1 && this.field6061[this.field6059] != null) {
         this.field6061[this.field6059].method11877();
      }

   }
}
