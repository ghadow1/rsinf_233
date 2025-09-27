package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
public final class class69 extends class75 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lxa;"
   )
   class613 field934;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Loz;"
   )
   class365 field935;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -2046771821
   )
   int field951 = -1;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -2098637401
   )
   int field937 = -1;
   @ObfuscatedName("ao")
   String[] field938 = new String[3];
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1142723923
   )
   int field939 = 0;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1536638859
   )
   int field940 = 0;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -186364543
   )
   int field941;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1917832763
   )
   int field942 = 0;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -531848807
   )
   int field943 = 0;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 264944597
   )
   int field944;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 872810909
   )
   int field936;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -957055045
   )
   int field945;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   class241 field947;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -2014968995
   )
   int field948;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 855169737
   )
   int field949;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1151402741
   )
   int field953;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -1098440261
   )
   int field946;
   @ObfuscatedName("ab")
   boolean field952 = false;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 141014513
   )
   int field955 = 0;
   @ObfuscatedName("ak")
   boolean field954 = false;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 306222651
   )
   int field933;
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Lth;"
   )
   class504 field956;
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "Lth;"
   )
   class504 field957;
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Lth;"
   )
   class504 field958;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -1705512019
   )
   int field959;

   class69(int var1) {
      super(var1);
      this.field956 = class504.field5415;
      this.field957 = class504.field5415;
      this.field958 = class504.field5415;
      this.field959 = 0;

      for(int var2 = 0; var2 < 3; ++var2) {
         this.field938[var2] = "";
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   public int vmethod11530() {
      return this.field933;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "1737422268"
   )
   final void method2168(class590 var1) {
      var1.buffer = 0;
      byte var2 = var1.method11197();
      boolean var3 = true;
      this.field951 = var1.method11197();
      this.field937 = var1.method11197();
      int var4 = -1;
      this.field955 = 0;
      int[] var5 = new int[12];

      int var7;
      int var8;
      int var9;
      int var10;
      for(int var6 = 0; var6 < var5.length; ++var6) {
         var7 = var1.method11196();
         if (var7 == 0) {
            var5[var6] = 0;
         } else {
            var8 = var1.method11196();
            var9 = var8 + (var7 << 8);
            if (var6 == 0 && var9 == 65535) {
               var4 = var1.method11198();
               break;
            }

            var5[var6] = var9;
            if (this.method2184(var5[var6])) {
               var10 = this.method2180(var5[var6]).field2415;
               if (var10 != 0) {
                  this.field955 = var10;
               }
            }
         }
      }

      int[] var13 = new int[12];

      for(var7 = 0; var7 < var13.length; ++var7) {
         var8 = var1.method11196();
         if (var8 == 0) {
            var13[var7] = 0;
         } else {
            var9 = var1.method11196();
            var13[var7] = var9 + (var8 << 8);
         }
      }

      int[] var14 = new int[5];

      for(var8 = 0; var8 < var14.length; ++var8) {
         var9 = var1.method11196();
         if (var9 < 0 || var9 >= class365.field4074[var8].length) {
            var9 = 0;
         }

         var14[var8] = var9;
      }

      super.field1060 = var1.method11198();
      if (super.field1060 == 65535) {
         super.field1060 = -1;
      }

      super.field1064 = var1.method11198();
      if (super.field1064 == 65535) {
         super.field1064 = -1;
      }

      super.field1062 = super.field1064;
      super.field1063 = var1.method11198();
      if (super.field1063 == 65535) {
         super.field1063 = -1;
      }

      super.field1088 = var1.method11198();
      if (super.field1088 == 65535) {
         super.field1088 = -1;
      }

      super.field1096 = var1.method11198();
      if (super.field1096 == 65535) {
         super.field1096 = -1;
      }

      super.field1066 = var1.method11198();
      if (super.field1066 == 65535) {
         super.field1066 = -1;
      }

      super.field1067 = var1.method11198();
      if (super.field1067 == 65535) {
         super.field1067 = -1;
      }

      this.field934 = new class613(var1.method11207(), class92.field1292);
      this.method2171();
      this.method2175();
      this.method2220();
      if (this == class76.field1108) {
         class616.field6086 = this.field934.method11909();
      }

      this.field939 = var1.method11196();
      this.field940 = var1.method11198();
      this.field954 = var1.method11196() == 1;
      if (client.field354 == 0 && client.field428 >= 2) {
         this.field954 = false;
      }

      class176[] var15 = null;
      boolean var17 = false;
      var10 = var1.method11198();
      var17 = (var10 >> 15 & 1) == 1;
      int var11;
      if (var10 > 0 && var10 != 32768) {
         var15 = new class176[12];

         for(var11 = 0; var11 < var15.length; ++var11) {
            int var12 = var10 >> 12 - var11 & 1;
            if (var12 == 1) {
               var15[var11] = class158.method3879(var5[var11] - 2048, var1);
            }
         }
      }

      for(var11 = 0; var11 < 3; ++var11) {
         this.field938[var11] = var1.method11207();
      }

      byte var16 = var1.method11197();
      if (this.field935 == null) {
         this.field935 = new class365();
      }

      this.field935.method7526(var13, var5, var15, var17, var14, var2, var4, var16);
      if (var4 != -1) {
         super.field1059 = class63.method2129(var4).field2111;
      } else {
         super.field1059 = 1;
      }

      this.field959 = (int)((float)(super.field1059 * -1073217536) * 0.4F);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Ljn;",
      garbageValue = "-1879635116"
   )
   protected final class241 vmethod5365() {
      if (this.field935 == null) {
         return null;
      } else {
         class469 var1 = this.method2441();
         class469 var2 = this.field952 ? null : this.method2419(var1);
         if (var1 == null && var2 == null) {
            var2 = super.field1093;
            if (super.field1093.method9567(30)) {
               return null;
            }
         }

         class215 var3 = var1 == null ? null : var1.method9581();
         class215 var4 = var2 == null ? null : var2.method9581();
         int var5 = var1 == null ? -1 : var1.method9565();
         int var6 = var2 == null ? -1 : var2.method9565();
         class241 var7 = this.field935.method7599(var3, var5, var4, var6);
         if (var7 == null) {
            return null;
         } else {
            var7.method5459();
            super.field1070 = var7.field2801;
            int var8 = var7.field2908;
            if (!this.field952) {
               var7 = this.method2431(var7);
            }

            if (!this.field952 && this.field947 != null) {
               if (client.field412 >= this.field943) {
                  this.field947 = null;
               }

               if (client.field412 >= this.field942 && client.field412 < this.field943) {
                  class241 var9 = this.field947;
                  var9.method5474(this.field944 * 4096 - super.field1055, this.field936 - this.field941, this.field945 * 4096 - super.field1056);
                  if (super.field1097 == 512) {
                     var9.method5550();
                     var9.method5550();
                     var9.method5550();
                  } else if (super.field1097 == 1024) {
                     var9.method5550();
                     var9.method5550();
                  } else if (super.field1097 == 1536) {
                     var9.method5550();
                  }

                  class241[] var10 = new class241[]{var7, var9};
                  var7 = new class241(var10, 2);
                  if (super.field1097 == 512) {
                     var9.method5550();
                  } else if (super.field1097 == 1024) {
                     var9.method5550();
                     var9.method5550();
                  } else if (super.field1097 == 1536) {
                     var9.method5550();
                     var9.method5550();
                     var9.method5550();
                  }

                  var9.method5474(super.field1055 - this.field944 * 4096, this.field941 - this.field936, super.field1056 - this.field945 * 4096);
               }
            }

            var7.field2941 = true;
            if (super.field1076.method5651() && client.field412 >= super.field1051 && client.field412 < super.field1052) {
               var7.method5491(super.field1076, (short)var8);
            } else {
               var7.method5599();
            }

            return var7;
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "2"
   )
   boolean method2170() {
      if (this.field956 == class504.field5415) {
         this.method2172();
      }

      return this.field956 == class504.field5416;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "193669174"
   )
   void method2171() {
      this.field956 = class504.field5415;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2067359333"
   )
   void method2172() {
      this.field956 = class40.field279.method1538(this.field934) ? class504.field5416 : class504.field5418;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1876361634"
   )
   boolean method2173() {
      if (this.field957 == class504.field5415) {
         this.method2228();
      }

      return this.field957 == class504.field5416;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1418702940"
   )
   void method2175() {
      this.field957 = class504.field5415;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "337053224"
   )
   void method2228() {
      this.field957 = class22.field90 != null && class22.field90.method9974(this.field934) ? class504.field5416 : class504.field5418;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "881942280"
   )
   void method2176() {
      for(int var1 = 0; var1 < 4; ++var1) {
         if (client.field365[var1] != null && client.field365[var1].method3921(this.field934.method11909()) != -1 && var1 != 2) {
            this.field958 = class504.field5416;
            return;
         }
      }

      this.field958 = class504.field5418;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "15"
   )
   void method2220() {
      this.field958 = class504.field5415;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-31"
   )
   boolean method2167() {
      if (this.field958 == class504.field5415) {
         this.method2176();
      }

      return this.field958 == class504.field5416;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ldr;IILko;S)V",
      garbageValue = "6803"
   )
   final void method2211(class79 var1, int var2, int var3, class280 var4) {
      if (super.field1074.method9566() && super.field1074.method9581().field2485 == 1) {
         this.method2472();
      }

      this.method2432();
      if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         if (super.field1039[0] >= 0 && super.field1039[0] < 104 && super.field1107[0] >= 0 && super.field1107[0] < 104) {
            if (var4 == class280.field3282) {
               class69 var5 = this;
               class280 var6 = class280.field3282;
               int var7 = super.field1039[0];
               int var8 = super.field1107[0];
               int var9 = super.field1059 * 92278784;
               class275 var10 = var1.field1175[var1.field1170];
               if (var7 >= var9 && var7 < var10.method6186() - var9 && var8 >= var9 && var8 < var10.method6167() - var9 && var2 >= var9 && var2 < var10.method6186() - var9 && var3 >= var9 && var3 < var10.method6167() - var9) {
                  int var11 = client.field317.method6328(var7, var8, var9, class406.method8276(var2, var3), var10, true, client.field605, client.field606);
                  if (var11 >= 1) {
                     for(int var12 = 0; var12 < var11 - 1; ++var12) {
                        var5.method2421(client.field605[var12], client.field606[var12], var6);
                     }
                  }
               }
            }

            this.method2421(var2, var3, var4);
         } else {
            this.method2422(var2, var3);
         }
      } else {
         this.method2422(var2, var3);
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1936500569"
   )
   void method2182(int var1, int var2) {
      super.field1039[0] = var1;
      super.field1107[0] = var2;
      super.field1100 = 0;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1641761362"
   )
   final boolean vmethod2740() {
      return this.field935 != null;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(B)Lid;",
      garbageValue = "-102"
   )
   protected class224 vmethod5366() {
      return class224.field2625;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "2011880333"
   )
   boolean method2184(int var1) {
      return var1 >= 2048;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(II)Lis;",
      garbageValue = "1482657248"
   )
   class213 method2180(int var1) {
      return class84.method2800(var1 - 2048);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "37"
   )
   int vmethod2763() {
      return this.method2440() ? 0 : this.field959;
   }
}
