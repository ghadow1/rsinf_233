package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
public class class39 extends class540 {
   @ObfuscatedName("ai")
   static short[][][] field270;
   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "[Lxc;"
   )
   static class604[] field273;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1963197515
   )
   int field267;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1640141009
   )
   int field261;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -318176463
   )
   int field263;
   @ObfuscatedName("ac")
   String field264;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lxa;"
   )
   class613 field272;
   @ObfuscatedName("aq")
   String field266;
   @ObfuscatedName("ao")
   String field271;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lth;"
   )
   class504 field268;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lth;"
   )
   class504 field269;

   class39(int var1, String var2, String var3, String var4) {
      this.field268 = class504.field5415;
      this.field269 = class504.field5415;
      this.method748(var1, var2, var3, var4);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "340789753"
   )
   void method748(int var1, String var2, String var3, String var4) {
      int var5 = ++class91.field1284 - 1;
      this.field267 = var5;
      this.field261 = client.field412;
      this.field263 = var1;
      this.field264 = var2;
      this.method754();
      this.field266 = var3;
      this.field271 = var4;
      this.method745();
      this.method765();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-19"
   )
   void method745() {
      this.field268 = class504.field5415;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2035643980"
   )
   final boolean method749() {
      if (this.field268 == class504.field5415) {
         this.method747();
      }

      return this.field268 == class504.field5416;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1316710240"
   )
   void method747() {
      this.field268 = class40.field279.field642.method9974(this.field272) ? class504.field5416 : class504.field5418;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1948955035"
   )
   void method765() {
      this.field269 = class504.field5415;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1434731987"
   )
   final boolean method744() {
      if (this.field269 == class504.field5415) {
         this.method750();
      }

      return this.field269 == class504.field5416;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-39"
   )
   void method750() {
      this.field269 = class40.field279.field645.method9974(this.field272) ? class504.field5416 : class504.field5418;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1215758128"
   )
   final void method754() {
      if (this.field264 != null) {
         this.field272 = new class613(class6.method38(this.field264), class92.field1292);
      } else {
         this.field272 = null;
      }

   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "1999277197"
   )
   static int method766(int var0, class55 var1, boolean var2) {
      int var4;
      int var9;
      if (var0 == 4000) {
         class124.field1569 -= 2;
         var9 = class46.field659[class124.field1569];
         var4 = class46.field659[class124.field1569 + 1];
         class46.field659[++class124.field1569 - 1] = var9 + var4;
         return 1;
      } else if (var0 == 4001) {
         class124.field1569 -= 2;
         var9 = class46.field659[class124.field1569];
         var4 = class46.field659[class124.field1569 + 1];
         class46.field659[++class124.field1569 - 1] = var9 - var4;
         return 1;
      } else if (var0 == 4002) {
         class124.field1569 -= 2;
         var9 = class46.field659[class124.field1569];
         var4 = class46.field659[class124.field1569 + 1];
         class46.field659[++class124.field1569 - 1] = var4 * var9;
         return 1;
      } else if (var0 == 4003) {
         class124.field1569 -= 2;
         var9 = class46.field659[class124.field1569];
         var4 = class46.field659[class124.field1569 + 1];
         class46.field659[++class124.field1569 - 1] = var9 / var4;
         return 1;
      } else if (var0 == 4004) {
         var9 = class46.field659[--class124.field1569];
         class46.field659[++class124.field1569 - 1] = (int)(Math.random() * (double)var9);
         return 1;
      } else if (var0 == 4005) {
         var9 = class46.field659[--class124.field1569];
         class46.field659[++class124.field1569 - 1] = (int)(Math.random() * (double)(var9 + 1));
         return 1;
      } else {
         int var5;
         int var6;
         int var7;
         if (var0 == 4006) {
            class124.field1569 -= 5;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            var5 = class46.field659[class124.field1569 + 2];
            var6 = class46.field659[class124.field1569 + 3];
            var7 = class46.field659[class124.field1569 + 4];
            class46.field659[++class124.field1569 - 1] = var9 + (var4 - var9) * (var7 - var5) / (var6 - var5);
            return 1;
         } else if (var0 == 4007) {
            class124.field1569 -= 2;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            class46.field659[++class124.field1569 - 1] = var9 + var4 * var9 / 100;
            return 1;
         } else if (var0 == 4008) {
            class124.field1569 -= 2;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            class46.field659[++class124.field1569 - 1] = var9 | 1 << var4;
            return 1;
         } else if (var0 == 4009) {
            class124.field1569 -= 2;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            class46.field659[++class124.field1569 - 1] = var9 & -1 - (1 << var4);
            return 1;
         } else if (var0 == 4010) {
            class124.field1569 -= 2;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            class46.field659[++class124.field1569 - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
            return 1;
         } else if (var0 == 4011) {
            class124.field1569 -= 2;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            class46.field659[++class124.field1569 - 1] = var9 % var4;
            return 1;
         } else if (var0 == 4012) {
            class124.field1569 -= 2;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            if (var9 == 0) {
               class46.field659[++class124.field1569 - 1] = 0;
            } else {
               class46.field659[++class124.field1569 - 1] = (int)Math.pow((double)var9, (double)var4);
            }

            return 1;
         } else if (var0 == 4013) {
            class124.field1569 -= 2;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            if (var9 == 0) {
               class46.field659[++class124.field1569 - 1] = 0;
               return 1;
            } else {
               switch(var4) {
               case 0:
                  class46.field659[++class124.field1569 - 1] = Integer.MAX_VALUE;
                  break;
               case 1:
                  class46.field659[++class124.field1569 - 1] = var9;
                  break;
               case 2:
                  class46.field659[++class124.field1569 - 1] = (int)Math.sqrt((double)var9);
                  break;
               case 3:
                  class46.field659[++class124.field1569 - 1] = (int)Math.cbrt((double)var9);
                  break;
               case 4:
                  class46.field659[++class124.field1569 - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
                  break;
               default:
                  class46.field659[++class124.field1569 - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
               }

               return 1;
            }
         } else if (var0 == 4014) {
            class124.field1569 -= 2;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            class46.field659[++class124.field1569 - 1] = var9 & var4;
            return 1;
         } else if (var0 == 4015) {
            class124.field1569 -= 2;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            class46.field659[++class124.field1569 - 1] = var9 | var4;
            return 1;
         } else if (var0 == 4016) {
            class124.field1569 -= 2;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            class46.field659[++class124.field1569 - 1] = var9 < var4 ? var9 : var4;
            return 1;
         } else if (var0 == 4017) {
            class124.field1569 -= 2;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            class46.field659[++class124.field1569 - 1] = var9 > var4 ? var9 : var4;
            return 1;
         } else if (var0 == 4018) {
            class124.field1569 -= 3;
            long var10 = (long)class46.field659[class124.field1569];
            long var12 = (long)class46.field659[class124.field1569 + 1];
            long var14 = (long)class46.field659[class124.field1569 + 2];
            class46.field659[++class124.field1569 - 1] = (int)(var10 * var14 / var12);
            return 1;
         } else if (var0 == 4025) {
            var9 = class164.method4009(class46.field659[--class124.field1569]);
            class46.field659[++class124.field1569 - 1] = var9;
            return 1;
         } else if (var0 == 4026) {
            class124.field1569 -= 2;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            class46.field659[++class124.field1569 - 1] = var9 ^ 1 << var4;
            return 1;
         } else if (var0 == 4027) {
            class124.field1569 -= 3;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            var5 = class46.field659[class124.field1569 + 2];
            class46.field659[++class124.field1569 - 1] = class312.method6969(var9, var4, var5);
            return 1;
         } else if (var0 == 4028) {
            class124.field1569 -= 3;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            var5 = class46.field659[class124.field1569 + 2];
            class46.field659[++class124.field1569 - 1] = class305.method6834(var9, var4, var5);
            return 1;
         } else if (var0 == 4029) {
            class124.field1569 -= 3;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            var5 = class46.field659[class124.field1569 + 2];
            var6 = 31 - var5;
            class46.field659[++class124.field1569 - 1] = var9 << var6 >>> var4 + var6;
            return 1;
         } else if (var0 == 4030) {
            class124.field1569 -= 4;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            var5 = class46.field659[class124.field1569 + 2];
            var6 = class46.field659[class124.field1569 + 3];
            var9 = class305.method6834(var9, var5, var6);
            var7 = client.method1134(var6 - var5 + 1);
            if (var4 > var7) {
               var4 = var7;
            }

            class46.field659[++class124.field1569 - 1] = var9 | var4 << var5;
            return 1;
         } else if (var0 == 4032) {
            class46.field659[class124.field1569 - 1] = class22.method332(class46.field659[class124.field1569 - 1]);
            return 1;
         } else if (var0 == 4033) {
            class46.field659[class124.field1569 - 1] = class9.method74(class46.field659[class124.field1569 - 1]);
            return 1;
         } else if (var0 == 4034) {
            class124.field1569 -= 2;
            var9 = class46.field659[class124.field1569];
            var4 = class46.field659[class124.field1569 + 1];
            var5 = class358.method7496(var9, var4);
            class46.field659[++class124.field1569 - 1] = var5;
            return 1;
         } else if (var0 == 4035) {
            class46.field659[class124.field1569 - 1] = Math.abs(class46.field659[class124.field1569 - 1]);
            return 1;
         } else if (var0 == 4036) {
            String var3 = (String)class46.field660[--class46.field658];
            var4 = -1;
            if (class45.method1590(var3)) {
               var4 = class190.method4308(var3);
            }

            class46.field659[++class124.field1569 - 1] = var4;
            return 1;
         } else {
            return 2;
         }
      }
   }

   @ObfuscatedName("lp")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "-53"
   )
   static void method767(int var0, int var1, int var2, int var3) {
      class369 var4 = class119.field1554.method7477(var0, var1);
      if (var4 != null && var4.field4247 != null) {
         class65 var5 = new class65();
         var5.field893 = var4;
         var5.field898 = var4.field4247;
         class329.method7047(var5);
      }

      client.field407 = var3;
      client.field529 = true;
      class433.field5116 = var0;
      client.field530 = var1;
      class337.field3865 = var2;
      class89.method2877(var4);
   }

   @ObfuscatedName("mg")
   @ObfuscatedSignature(
      descriptor = "(IIIIIB)V",
      garbageValue = "0"
   )
   static final void method743(int var0, int var1, int var2, int var3, int var4) {
      class255.field3065[0].method11667(var0, var1);
      class255.field3065[1].method11667(var0, var3 + var1 - 16);
      class601.method11558(var0, var1 + 16, 16, var3 - 32, client.field395);
      int var5 = var3 * (var3 - 32) / var4;
      if (var5 < 8) {
         var5 = 8;
      }

      int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
      class601.method11558(var0, var6 + var1 + 16, 16, var5, client.field478);
      class601.method11566(var0, var6 + var1 + 16, var5, client.field328);
      class601.method11566(var0 + 1, var6 + var1 + 16, var5, client.field328);
      class601.method11561(var0, var6 + var1 + 16, 16, client.field328);
      class601.method11561(var0, var6 + var1 + 17, 16, client.field328);
      class601.method11566(var0 + 15, var6 + var1 + 16, var5, client.field513);
      class601.method11566(var0 + 14, var6 + var1 + 17, var5 - 1, client.field513);
      class601.method11561(var0, var5 + var6 + var1 + 15, 16, client.field513);
      class601.method11561(var0 + 1, var5 + var6 + var1 + 14, 15, client.field513);
   }

   @ObfuscatedName("nl")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "403996707"
   )
   static void method768() {
      for(class64 var0 = (class64)client.field422.method8626(); var0 != null; var0 = (class64)client.field422.method8627()) {
         int var1 = var0.field888;
         if (class119.field1554.method7478(var1)) {
            boolean var2 = true;
            class369[] var3 = class119.field1554.field4037[var1];

            int var4;
            for(var4 = 0; var4 < var3.length; ++var4) {
               if (var3[var4] != null) {
                  var2 = var3[var4].field4143;
                  break;
               }
            }

            if (!var2) {
               var4 = (int)var0.field5600;
               class369 var5 = class119.field1554.method7476(var4);
               if (var5 != null) {
                  class89.method2877(var5);
               }
            }
         }
      }

   }
}
