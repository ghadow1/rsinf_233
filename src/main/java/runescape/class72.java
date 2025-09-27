package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
public final class class72 extends class544 {
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lqs;"
   )
   static final class436 field1005 = new class436();
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lmx;"
   )
   static final class337 field993;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1159382011
   )
   final int field991;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 406356159
   )
   final int field984;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1808638607
   )
   final int field985;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1038091405
   )
   final int field986;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -754638065
   )
   final int field987;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1685640429
   )
   final int field988;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1587625799
   )
   int field989;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1355258679
   )
   int field1000;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lib;"
   )
   final class212 field990;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Ldo;"
   )
   class103 field983;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 2037476169
   )
   int field996;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Ldo;"
   )
   class103 field994;
   @ObfuscatedName("am")
   int[] field995;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 117159047
   )
   int field1006;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1832214017
   )
   int field997;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 59275547
   )
   int field998;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lmx;"
   )
   class337 field992;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Lmx;"
   )
   class337 field999;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 1676447907
   )
   int field1001;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lmx;"
   )
   class337 field1002;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1192202215
   )
   int field1003;
   @ObfuscatedName("ab")
   boolean field1004 = false;

   static {
      field993 = class337.field3853;
   }

   @ObfuscatedSignature(
      descriptor = "(IIIIILib;)V"
   )
   class72(int var1, int var2, int var3, int var4, int var5, class212 var6) {
      this.field991 = var1;
      this.field984 = var2;
      this.field985 = class356.method7417(var3);
      this.field986 = class356.method7417(var4);
      int var7 = var6.field2329;
      int var8 = var6.field2330;
      if (var5 == 1 || var5 == 3) {
         var7 = var6.field2330;
         var8 = var6.field2329;
      }

      this.field987 = class356.method7417(var3 + var7);
      this.field988 = class356.method7417(var8 + var4);
      this.field996 = var6.field2358;
      this.field989 = class356.method7417(var6.field2359);
      this.field1000 = Math.max(class356.method7417(var6.field2352 - 1), 0);
      this.field1006 = var6.field2366;
      this.field997 = var6.field2367;
      this.field995 = var6.field2368;
      if (var6.field2355 != null) {
         this.field990 = var6;
         this.method2249();
      } else {
         this.field990 = null;
      }

      if (this.field995 != null) {
         this.field998 = class255.method5805(this.field1006, this.field997);
      }

      this.field992 = var6.field2361;
      this.field1002 = var6.field2364;
      this.field1003 = var6.field2362;
      this.field999 = var6.field2326;
      this.field1001 = var6.field2363;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-59"
   )
   void method2271() {
      this.method2286(0, this.field1001, this.field999);
      this.method2244(0, this.field1001, this.field999);
      this.method2262();
      this.method2246();
      if (class56.method2007(this.field983) == 0 && class56.method2007(this.field994) == 0) {
         this.method2247();
         this.method2309();
         this.vmethod10557();
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltj;IIIIB)V",
      garbageValue = "-49"
   )
   void method2242(class505 var1, int var2, int var3, int var4, int var5) {
      int var6 = class36.clientPreferences.method2673();
      if (this.field1004) {
         this.method2286(0, this.field1001, this.field999);
         this.method2244(0, this.field1001, this.field999);
         this.method2262();
         this.method2246();
         if (class56.method2007(this.field983) == 0 && class56.method2007(this.field994) == 0) {
            this.method2247();
            this.method2309();
            this.field1004 = false;
         }

      } else if (this.field996 != -1 || this.field995 != null) {
         class505 var7 = client.field333.method2346(this.field991);
         if (var6 != 0 && class271.method6080(var1, var7, var2, this.field984)) {
            this.method2262();
            this.method2246();
            class79 var10 = client.field333.method2350(this.field991);
            class452 var11 = class56.method2010(var10, this.field985, this.field986);
            class452 var12 = class56.method2010(var10, this.field987, this.field988);
            int var13 = (int)var11.field5175;
            int var14 = (int)var11.field5169;
            int var15 = (int)var12.field5175;
            int var16 = (int)var12.field5169;
            var11.method8992();
            var12.method8992();
            int var17 = class394.method8225(var3, var4, var13, var14, var15, var16);
            var17 = Math.max(var17 - 64, 0);
            double var19;
            if (this.field1000 < this.field989) {
               var19 = class264.method5958((long)(this.field989 - var17), (long)(this.field989 - this.field1000), this.field992);
            } else {
               var19 = 1.0D;
            }

            var13 = (int)((double)var6 * var19);
            var14 = class56.method2007(this.field983);
            var15 = class56.method2007(this.field994);
            if (var14 < var13) {
               this.method2286(var13, this.field1003, this.field1002);
            } else if (var14 > var13) {
               this.method2286(var13, this.field1001, this.field999);
            }

            if (var15 < var13) {
               this.method2244(var13, this.field1003, this.field1002);
            } else if (var15 > var13) {
               this.method2244(var13, this.field1001, this.field999);
            }

            if (this.field983 != null) {
               this.method2262();
            } else if (this.field996 >= 0 && var13 > 0) {
               this.method2291(this.field996, 0);
            }

            if (this.field994 != null) {
               this.method2246();
            } else if (this.field995 != null && (this.field998 -= var5) <= 0 && var13 > 0) {
               this.method2251(this.field995, var13);
               this.method2244(var13, this.field1003, this.field1002);
               this.method2246();
            }

         } else {
            this.method2286(0, 150, field993);
            this.method2244(0, 150, field993);
            this.method2262();
            this.method2246();
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IILmx;B)V",
      garbageValue = "7"
   )
   void method2286(int var1, int var2, class337 var3) {
      if (this.field983 != null && this.field983.field1409 != var1) {
         this.field983.field1392 = this.field983.method3175();
         this.field983.field1393 = class189.method4284();
         this.field983.field1409 = var1;
         class103 var4 = this.field983;
         int var6 = Math.abs(this.field983.field1392 - this.field983.field1409);
         int var7 = class36.clientPreferences.method2673();
         int var5;
         if (var6 >= var7) {
            var5 = var2;
         } else {
            var5 = (int)((float)var2 * ((float)var6 / (float)var7));
         }

         var4.field1403 = var5;
         this.field983.field1405 = var3;
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IILmx;S)V",
      garbageValue = "10686"
   )
   void method2244(int var1, int var2, class337 var3) {
      if (this.field994 != null && this.field994.field1409 != var1) {
         this.field994.field1392 = this.field994.method3175();
         this.field994.field1393 = class189.method4284();
         int var5 = Math.abs(this.field994.field1392 - var1);
         int var6 = class36.clientPreferences.method2673();
         int var4;
         if (var5 >= var6) {
            var4 = var2;
         } else {
            var4 = (int)((float)var2 * ((float)var5 / (float)var6));
         }

         this.field994.field1403 = var4;
         this.field994.field1409 = var1;
         this.field994.field1405 = var3;
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "13"
   )
   void method2262() {
      if (this.field983 != null) {
         int var1 = this.field983.method3175();
         long var2 = class189.method4284();
         long var4 = var2 - this.field983.field1393;
         int var7 = this.field983.field1392;
         int var8 = this.field983.field1409;
         class337 var9 = this.field983.field1405;
         int var10 = this.field983.field1403;
         int var6;
         if (var1 == var8) {
            var6 = var1;
         } else {
            int var11;
            double var12;
            if (var1 > var8) {
               var12 = 1.0D - class264.method5958(var4, (long)var10, var9);
               var11 = var8 + (int)((double)(var7 - var8) * var12);
            } else {
               var12 = class264.method5958(var4, (long)var10, var9);
               var11 = var7 + (int)(var12 * (double)(var8 - var7));
            }

            var6 = var11;
         }

         if (var1 != var6) {
            this.field983.method3282(var6);
         }
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1965504945"
   )
   void method2246() {
      if (this.field994 != null) {
         int var1 = this.field994.method3175();
         long var2 = class189.method4284();
         long var4 = var2 - this.field994.field1393;
         int var7 = this.field994.field1392;
         int var8 = this.field994.field1409;
         class337 var9 = this.field994.field1405;
         int var10 = this.field994.field1403;
         int var6;
         if (var8 == var1) {
            var6 = var1;
         } else {
            int var11;
            double var12;
            if (var1 > var8) {
               var12 = 1.0D - class264.method5958(var4, (long)var10, var9);
               var11 = var8 + (int)((double)(var7 - var8) * var12);
            } else {
               var12 = class264.method5958(var4, (long)var10, var9);
               var11 = var7 + (int)(var12 * (double)(var8 - var7));
            }

            var6 = var11;
         }

         if (var6 != var1) {
            this.field994.method3282(var6);
         }

         if (!this.field994.method10558()) {
            this.field994 = null;
         }
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-101"
   )
   void method2291(int var1, int var2) {
      int var3 = class115.field1514.method8347(var1) - 1;
      class94 var4 = class94.method2996(class115.field1514, var1, var3);
      if (var4 != null) {
         class95 var5 = var4.method3003(class36.clientPreferences.method2586());
         class103 var6 = class103.method3153(var5, 100, var2);
         if (var6 == null) {
            return;
         }

         var6.method3173(-1);
         class28.field144.method2958(var6);
         this.field983 = var6;
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "([III)V",
      garbageValue = "742857566"
   )
   void method2251(int[] var1, int var2) {
      int var3 = var1[(int)(Math.random() * (double)var1.length)];
      int var4 = class115.field1514.method8347(var3) - 1;
      class94 var5 = class94.method2996(class115.field1514, var3, var4);
      if (var5 != null) {
         class95 var6 = var5.method3003(class36.clientPreferences.method2586());
         class103 var7 = class103.method3153(var6, 100, var2);
         if (var7 == null) {
            return;
         }

         var7.method3173(0);
         class28.field144.method2958(var7);
         var7.method3155();
         this.field994 = var7;
         this.field998 = class255.method5805(this.field1006, this.field997);
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2074850031"
   )
   void method2249() {
      int var1 = this.field996;
      class212 var2 = this.field990.method4611();
      if (var2 != null) {
         this.field996 = var2.field2358;
         this.field989 = class356.method7417(var2.field2359);
         this.field1000 = class356.method7417(var2.field2352);
         this.field1006 = var2.field2366;
         this.field997 = var2.field2367;
         this.field995 = var2.field2368;
         this.field992 = var2.field2361;
         this.field1002 = var2.field2364;
         this.field1003 = var2.field2362;
         this.field999 = var2.field2326;
         this.field1001 = var2.field2363;
      } else {
         this.field996 = -1;
         this.field989 = 0;
         this.field1000 = 0;
         this.field1006 = 0;
         this.field997 = 0;
         this.field995 = null;
         this.field992 = class212.field2309;
         this.field999 = class212.field2313;
         this.field1001 = 300;
         this.field1002 = class212.field2345;
         this.field1003 = 300;
      }

      if (var1 != this.field996) {
         this.field1004 = true;
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "198"
   )
   void method2247() {
      if (this.field983 != null) {
         class28.field144.method2959(this.field983);
         this.field983 = null;
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   void method2309() {
      if (this.field994 != null) {
         class28.field144.method2959(this.field994);
         this.field994 = null;
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "52"
   )
   void method2252() {
      field1005.method8689(this);
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-828185534"
   )
   int method2290() {
      return this.field996;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-60"
   )
   int method2254() {
      return this.field985;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1392783122"
   )
   int method2255() {
      return this.field987;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "47"
   )
   int method2317() {
      return this.field986;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "8"
   )
   int method2257() {
      return this.field988;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-393305721"
   )
   int method2260() {
      return this.field984;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   int method2259() {
      return this.field989;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "72"
   )
   int method2300() {
      return this.field1000;
   }

   @ObfuscatedName("cv")
   public void vmethod10557() {
      super.vmethod10557();
   }

   public String toString() {
      return super.toString();
   }

   @ObfuscatedName("lo")
   @ObfuscatedSignature(
      descriptor = "(Ldr;IIIB)V",
      garbageValue = "14"
   )
   static final void method2337(class79 var0, int var1, int var2, int var3) {
      class436 var4 = var0.field1167[var1][var2][var3];
      if (var4 == null) {
         var0.field1159.method5154(var1, var2, var3);
      } else {
         long var5 = -99999999L;
         class85 var7 = null;

         class85 var8;
         for(var8 = (class85)var4.method8690(); var8 != null; var8 = (class85)var4.method8692()) {
            class213 var9 = class84.method2800(var8.field1221);
            long var13 = (long)var9.field2410;
            if (var9.field2397 == 1) {
               var13 *= var8.field1222 < Integer.MAX_VALUE ? (long)(var8.field1222 + 1) : (long)var8.field1222;
            }

            if (var13 > var5) {
               var5 = var13;
               var7 = var8;
            }
         }

         if (var7 == null) {
            var0.field1159.method5154(var1, var2, var3);
         } else {
            var4.method8687(var7);
            class85 var15 = null;
            class85 var10 = null;

            for(var8 = (class85)var4.method8690(); var8 != null; var8 = (class85)var4.method8692()) {
               if (var8.field1221 != var7.field1221) {
                  if (var15 == null) {
                     var15 = var8;
                  }

                  if (var15.field1221 != var8.field1221 && var10 == null) {
                     var10 = var8;
                  }
               }
            }

            long var11 = class123.method3544(var1, var2, var3, 3, false, 0, var0.field1172);
            var0.field1159.method5108(var1, var2, var3, class413.method8434(var0, class356.method7416(var2), class356.method7416(var3), var1), var7, var11, var15, var10);
         }
      }
   }
}
