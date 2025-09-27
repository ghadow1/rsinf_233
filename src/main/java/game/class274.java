package game;

import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public class class274 implements class29 {
   @ObfuscatedName("gq")
   @ObfuscatedGetter(
      intValue = -1461086973
   )
   static int field3224;
   @ObfuscatedName("oo")
   static String field3221;
   @ObfuscatedName("aw")
   public int[] field3207 = new int[128];
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1497320747
   )
   public int field3206 = 0;
   @ObfuscatedName("ac")
   int[] field3209 = new int[128];
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 466896143
   )
   int field3210 = 0;
   @ObfuscatedName("aq")
   public char field3215;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -470392627
   )
   public int field3212;
   @ObfuscatedName("as")
   char[] field3213 = new char[128];
   @ObfuscatedName("al")
   int[] field3214 = new int[128];
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1941940403
   )
   int field3217 = 0;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1713754727
   )
   int field3211 = 0;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1568342569
   )
   int field3222 = 0;
   @ObfuscatedName("am")
   boolean[] field3218 = new boolean[112];
   @ObfuscatedName("an")
   boolean[] field3219 = new boolean[112];
   @ObfuscatedName("ar")
   boolean[] field3220 = new boolean[112];

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-112"
   )
   public boolean vmethod6115(int var1) {
      this.method6118(var1);
      this.field3218[var1] = true;
      this.field3219[var1] = true;
      this.field3220[var1] = false;
      if (this.field3206 < 128) {
         this.field3207[++this.field3206 - 1] = var1;
      }

      return true;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-195994958"
   )
   public boolean vmethod6123(int var1) {
      this.field3218[var1] = false;
      this.field3219[var1] = false;
      this.field3220[var1] = true;
      if (this.field3210 < 128) {
         this.field3209[++this.field3210 - 1] = var1;
      }

      return true;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "737785830"
   )
   public boolean vmethod6117(char var1) {
      int var2 = this.field3211 + 1 & 127;
      if (var2 != this.field3217) {
         this.field3214[this.field3211] = -1;
         this.field3213[this.field3211] = var1;
         this.field3211 = var2;
      }

      return false;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(ZB)Z",
      garbageValue = "18"
   )
   public boolean vmethod6119(boolean var1) {
      return false;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1873200788"
   )
   void method6118(int var1) {
      int var2 = this.field3211 + 1 & 127;
      if (var2 != this.field3217) {
         this.field3214[this.field3211] = var1;
         this.field3213[this.field3211] = 0;
         this.field3211 = var2;
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2070254508"
   )
   public void method6120() {
      this.field3217 = this.field3222;
      this.field3222 = this.field3211;
      this.field3206 = 0;
      this.field3210 = 0;
      Arrays.fill(this.field3219, false);
      Arrays.fill(this.field3220, false);
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-760839349"
   )
   public final boolean method6121() {
      if (this.field3222 == this.field3217) {
         return false;
      } else {
         this.field3212 = this.field3214[this.field3217];
         this.field3215 = this.field3213[this.field3217];
         this.field3217 = this.field3217 + 1 & 127;
         return true;
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "661727347"
   )
   public boolean method6122(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field3219[var1] : false;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1794579815"
   )
   public boolean method6138(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field3218[var1] : false;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-2089530482"
   )
   public boolean method6124(int var1) {
      return var1 >= 0 && var1 < 112 ? this.field3220[var1] : false;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "-950945526"
   )
   public int[] method6135() {
      int[] var1 = new int[this.field3206];

      for(int var2 = 0; var2 < this.field3206; ++var2) {
         var1[var2] = this.field3207[var2];
      }

      return var1;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(B)[I",
      garbageValue = "84"
   )
   public int[] method6126() {
      int[] var1 = new int[this.field3210];

      for(int var2 = 0; var2 < this.field3210; ++var2) {
         var1[var2] = this.field3209[var2];
      }

      return var1;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "454045361"
   )
   static int method6160(int var0, class55 var1, boolean var2) {
      int var3;
      if (var0 == 4200) {
         var3 = class46.field659[--class124.field1569];
         class46.field660[++class46.field658 - 1] = class84.method2800(var3).field2428;
         return 1;
      } else {
         int var8;
         class213 var10;
         if (var0 == 4201) {
            class124.field1569 -= 2;
            var3 = class46.field659[class124.field1569];
            var8 = class46.field659[class124.field1569 + 1];
            var10 = class84.method2800(var3);
            if (var8 >= 1 && var8 <= 5 && var10.field2403[var8 - 1] != null) {
               class46.field660[++class46.field658 - 1] = var10.field2403[var8 - 1];
            } else {
               class46.field660[++class46.field658 - 1] = "";
            }

            return 1;
         } else if (var0 == 4202) {
            class124.field1569 -= 2;
            var3 = class46.field659[class124.field1569];
            var8 = class46.field659[class124.field1569 + 1];
            var10 = class84.method2800(var3);
            if (var8 >= 1 && var8 <= 5 && var10.field2396[var8 - 1] != null) {
               class46.field660[++class46.field658 - 1] = var10.field2396[var8 - 1];
            } else {
               class46.field660[++class46.field658 - 1] = "";
            }

            return 1;
         } else if (var0 == 4222) {
            class124.field1569 -= 3;
            var3 = class46.field659[class124.field1569];
            var8 = class46.field659[class124.field1569 + 1];
            int var5 = class46.field659[class124.field1569 + 2];
            class213 var6 = class84.method2800(var3);
            String var7 = null;
            if (var8 >= 1 && var8 <= 5 && var6.field2396[var8 - 1] != null && var6.field2420 != null && var6.field2420[var8 - 1] != null && var5 >= 1 && var5 <= var6.field2420[var8 - 1].length) {
               var7 = var6.field2420[var8 - 1][var5 - 1];
            }

            class46.field660[++class46.field658 - 1] = var7 != null ? var7 : "";
            return 1;
         } else if (var0 == 4203) {
            var3 = class46.field659[--class124.field1569];
            class46.field659[++class124.field1569 - 1] = class84.method2800(var3).field2410;
            return 1;
         } else if (var0 == 4204) {
            var3 = class46.field659[--class124.field1569];
            class46.field659[++class124.field1569 - 1] = class84.method2800(var3).field2397 == 1 ? 1 : 0;
            return 1;
         } else {
            class213 var4;
            if (var0 == 4205) {
               var3 = class46.field659[--class124.field1569];
               var4 = class84.method2800(var3);
               if (var4.field2409 == -1 && var4.field2408 >= 0) {
                  class46.field659[++class124.field1569 - 1] = var4.field2408;
               } else {
                  class46.field659[++class124.field1569 - 1] = var3;
               }

               return 1;
            } else if (var0 == 4206) {
               var3 = class46.field659[--class124.field1569];
               var4 = class84.method2800(var3);
               if (var4.field2409 >= 0 && var4.field2408 >= 0) {
                  class46.field659[++class124.field1569 - 1] = var4.field2408;
               } else {
                  class46.field659[++class124.field1569 - 1] = var3;
               }

               return 1;
            } else if (var0 == 4207) {
               var3 = class46.field659[--class124.field1569];
               class46.field659[++class124.field1569 - 1] = class84.method2800(var3).field2402 ? 1 : 0;
               return 1;
            } else if (var0 == 4208) {
               var3 = class46.field659[--class124.field1569];
               var4 = class84.method2800(var3);
               if (var4.field2422 == -1 && var4.field2395 >= 0) {
                  class46.field659[++class124.field1569 - 1] = var4.field2395;
               } else {
                  class46.field659[++class124.field1569 - 1] = var3;
               }

               return 1;
            } else if (var0 == 4209) {
               var3 = class46.field659[--class124.field1569];
               var4 = class84.method2800(var3);
               if (var4.field2422 >= 0 && var4.field2395 >= 0) {
                  class46.field659[++class124.field1569 - 1] = var4.field2395;
               } else {
                  class46.field659[++class124.field1569 - 1] = var3;
               }

               return 1;
            } else if (var0 == 4210) {
               String var9 = (String)class46.field660[--class46.field658];
               var8 = class46.field659[--class124.field1569];
               class370.method8111(var9, var8 == 1);
               class46.field659[++class124.field1569 - 1] = class249.field3021;
               return 1;
            } else if (var0 != 4211) {
               if (var0 == 4212) {
                  class19.field79 = 0;
                  return 1;
               } else if (var0 == 4213) {
                  var3 = class46.field659[--class124.field1569];
                  var8 = class84.method2800(var3).method4671();
                  if (var8 == -1) {
                     class46.field659[++class124.field1569 - 1] = var8;
                  } else {
                     class46.field659[++class124.field1569 - 1] = var8 + 1;
                  }

                  return 1;
               } else if (var0 == 4214) {
                  var3 = class46.field659[--class124.field1569];
                  class46.field659[++class124.field1569 - 1] = class84.method2800(var3).field2437;
                  return 1;
               } else if (var0 == 4215) {
                  var3 = class46.field659[--class124.field1569];
                  class46.field659[++class124.field1569 - 1] = class84.method2800(var3).field2400;
                  return 1;
               } else if (var0 == 4216) {
                  var3 = class46.field659[--class124.field1569];
                  class46.field659[++class124.field1569 - 1] = class84.method2800(var3).field2401;
                  return 1;
               } else if (var0 == 4217) {
                  var3 = class46.field659[--class124.field1569];
                  var4 = class84.method2800(var3);
                  class46.field659[++class124.field1569 - 1] = var4.field2416;
                  return 1;
               } else if (var0 == 4218) {
                  var3 = class46.field659[--class124.field1569];
                  class46.field660[++class46.field658 - 1] = class84.method2800(var3).field2386;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (class279.field3275 != null && class19.field79 < class249.field3021) {
                  class46.field659[++class124.field1569 - 1] = class279.field3275[++class19.field79 - 1] & '\uffff';
               } else {
                  class46.field659[++class124.field1569 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("ho")
   @ObfuscatedSignature(
      descriptor = "(I)J",
      garbageValue = "853651621"
   )
   static long method6140() {
      return client.field510;
   }

   @ObfuscatedName("iq")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1018851475"
   )
   static final int method6161(int var0) {
      return Math.min(Math.max(var0, 128), 383);
   }
}
