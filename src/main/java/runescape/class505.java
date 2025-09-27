package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tj")
public class class505 extends class544 implements class598 {
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lky;"
   )
   public final class279 field5422 = new class279();
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -831606533
   )
   public int field5421 = 0;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Ldr;"
   )
   public class79 field5429;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lhu;"
   )
   public class203 field5425;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "[Ltn;"
   )
   class506[] field5420 = new class506[10];
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 277227723
   )
   int field5427 = 0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -899272099
   )
   public int field5431 = -1;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lpd;"
   )
   class394 field5428;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 621681109
   )
   int field5430;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Ltm;"
   )
   class507 field5426;
   @ObfuscatedName("ad")
   boolean field5432;

   @ObfuscatedSignature(
      descriptor = "(ILdr;)V"
   )
   public class505(int var1, class79 var2) {
      this.field5428 = class394.field4796;
      this.field5430 = 31;
      this.field5426 = new class508();
      this.field5432 = false;
      this.field5421 = var1;
      this.field5429 = var2;
      this.field5427 = 0;

      for(int var3 = 0; var3 < 10; ++var3) {
         this.field5420[var3] = new class506();
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   public int vmethod11530() {
      if (this.field5431 != -1) {
         class79 var1 = client.field333.method2350(this.field5431);
         if (var1 != null) {
            return var1.field1170;
         }
      }

      return class333.field3836.field1170;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1636388490"
   )
   public void method10063(boolean var1) {
      this.field5429.field1159.field2711 = this.field5429.field1170;
      if (var1) {
         this.field5429.field1159.field2716 = false;
         this.field5429.field1159.field2713 = -1200;
         this.field5429.field1159.field2687 = 0.01F;
         this.field5429.field1159.field2699.method5649((byte)38, (byte)2, (byte)20, (byte)127);
      } else {
         this.field5429.field1159.field2716 = true;
         this.field5429.field1159.field2713 = 0;
         this.field5429.field1159.field2687 = 1.0F;
         this.field5429.field1159.field2699.method5650();
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "35"
   )
   public boolean method10065() {
      return this.field5429.field1159.field2687 == 0.01F;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "28"
   )
   public int method10066() {
      return this.field5422.method6302();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "999447568"
   )
   public int method10110() {
      return this.field5422.method6289();
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)Lky;",
      garbageValue = "1923130139"
   )
   public class279 method10090() {
      return this.field5427 == 0 ? this.field5422 : this.field5420[0].field5434;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lhu;S)V",
      garbageValue = "28151"
   )
   public void method10071(class203 var1) {
      this.field5425 = var1;
      this.field5429.field1159.field2726 = var1.method4453();
      this.field5429.field1159.field2714 = var1.method4454();
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)Lpd;",
      garbageValue = "-39"
   )
   public class394 method10072() {
      return this.field5428;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(ZB)Lpj;",
      garbageValue = "1"
   )
   public class398 method10073(boolean var1) {
      return var1 ? class398.field4839 : this.field5425.method4456();
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lpd;I)V",
      garbageValue = "989832075"
   )
   public void method10074(class394 var1) {
      this.field5428 = var1;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1086541105"
   )
   public void method10075(int var1) {
      this.field5430 = var1;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-1"
   )
   public boolean method10076(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field5430 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-184904310"
   )
   public int method10077() {
      return this.field5429.field1162 * 64 + this.field5425.method4453();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "16"
   )
   public int method10093() {
      return this.field5429.field1163 * 64 + this.field5425.method4454();
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-290410379"
   )
   public void method10079(int var1, int var2) {
      for(int var3 = 0; var3 < this.field5420.length; ++var3) {
         this.field5420[var3].field5434.method6285(var1, var2);
      }

      this.field5422.method6285(var1, var2);
      this.field5426.vmethod10151(var1, var2);
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Lky;I)V",
      garbageValue = "-386251148"
   )
   public final void method10078(class279 var1) {
      int var2 = var1.method6279();
      int var3 = var1.method6283();
      if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         int var4 = var1.method6276() - this.field5420[0].field5434.method6276();
         int var5 = var1.method6278() - this.field5420[0].field5434.method6278();
         this.method10082(var1, Math.abs(var4), Math.abs(var5));
      } else {
         this.method10129(var1);
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Lky;I)V",
      garbageValue = "1398169975"
   )
   public void method10129(class279 var1) {
      this.field5422.method6282(var1);
      this.field5420[0].field5434.method6282(var1);
      this.field5427 = 0;
      this.field5432 = false;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(Lky;III)V",
      garbageValue = "1416875586"
   )
   void method10082(class279 var1, int var2, int var3) {
      if (this.field5427 < 9) {
         ++this.field5427;
      }

      for(int var4 = this.field5427; var4 > 0; --var4) {
         class506 var5 = this.field5420[var4];
         this.field5420[var4] = this.field5420[var4 - 1];
         this.field5420[var4 - 1] = var5;
      }

      this.field5420[0].field5434.method6282(var1);
      this.field5420[0].field5433 = client.cycle;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1673189895"
   )
   public final void method10083(int var1) {
      if (this.field5427 == 0) {
         this.method10129(this.field5420[0].field5434);
      } else {
         if (!this.field5432) {
            this.field5426.vmethod10152(this.field5422, this.field5420[0], var1);
            this.field5432 = true;
         }

         if (this.field5426.vmethod10149(this.field5422, var1, this.field5427)) {
            --this.field5427;
            this.field5432 = false;
         }

      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(III)Lre;",
      garbageValue = "-2054643686"
   )
   public class452 method10084(int var1, int var2) {
      class448 var3 = new class448();
      class454 var4 = class401.method8245();
      var3.field5155.method9072(class51.method1894(this.field5422.method6289()), 0.0F, 0.0F);
      var3.field5154.method8993((float)this.field5422.method6276(), 0.0F, (float)this.field5422.method6278());
      var1 -= this.method10077();
      var2 -= this.method10093();
      var4.method9097(var3);
      var3.method8931();
      class452 var5 = var4.method9144((float)var1, 0.0F, (float)var2);
      var4.method9140();
      return var5;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(III)Lre;",
      garbageValue = "1157717593"
   )
   public class452 method10107(int var1, int var2) {
      class448 var3 = new class448();
      class454 var4 = class401.method8245();
      var3.field5155.method9072(class51.method1894(this.field5422.method6289()), 0.0F, 0.0F);
      var3.field5154.method8993((float)this.field5422.method6276(), 0.0F, (float)this.field5422.method6278());
      var4.method9097(var3);
      var4.method9101();
      var3.method8931();
      class452 var5 = var4.method9144((float)var1, 0.0F, (float)var2);
      var5.method9006((float)this.method10077(), 0.0F, (float)this.method10093());
      var4.method9140();
      return var5;
   }

   @ObfuscatedName("dq")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "5422"
   )
   public int vmethod11534() {
      return this.field5422.method6276();
   }

   @ObfuscatedName("dh")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "955086849"
   )
   public int vmethod11529() {
      return this.field5422.method6278();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ILwu;I)Z",
      garbageValue = "-1651594463"
   )
   public static boolean method10134(int var0, class582 var1) {
      return (var0 & var1.vmethod11658()) != 0;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-475844930"
   )
   public static int method10135(int var0, int var1, int var2) {
      if (var1 < var0) {
         throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
      } else {
         return Math.max(var0, Math.min(var2, var1));
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Lrv;Lrv;Lrv;I)V",
      garbageValue = "210043481"
   )
   static void drawLoadingScreen(class461 var0, class461 var1, class461 var2) {
      class52.field731 = (class34.screenWidth - 765) / 2;
      class52.field741 = class52.field731 + 202;
      class294.field3397 = class52.field741 + 180;
      byte var3;
      int var4;
      int var8;
      int var10;
      int var25;
      int var31;
      int var38;
      if (class52.field740) {
         if (class292.field3380 == null) {
            class292.field3380 = class498.method9930(class496.field5387, "sl_back", "");
         }

         if (class42.field283 == null) {
            class42.field283 = class168.method4040(class496.field5387, "sl_flags", "");
         }

         if (class122.field1565 == null) {
            class122.field1565 = class168.method4040(class496.field5387, "sl_arrows", "");
         }

         if (class395.field4808 == null) {
            class395.field4808 = class168.method4040(class496.field5387, "sl_stars", "");
         }

         if (class292.field3377 == null) {
            class292.field3377 = class61.method2092(class496.field5387, "leftarrow", "");
         }

         if (class411.field4957 == null) {
            class411.field4957 = class61.method2092(class496.field5387, "rightarrow", "");
         }

         class601.method11558(class52.field731, 23, 765, 480, 0);
         class601.method11559(class52.field731, 0, 125, 23, 12425273, 9135624);
         class601.method11559(class52.field731 + 125, 0, 640, 23, 5197647, 2697513);
         var0.method9506("Select a world", class52.field731 + 62, 15, 0, -1);
         if (class395.field4808 != null) {
            class395.field4808[1].method11667(class52.field731 + 140, 1);
            var1.method9420("Members only world", class52.field731 + 152, 10, 16777215, -1);
            class395.field4808[0].method11667(class52.field731 + 140, 12);
            var1.method9420("Free world", class52.field731 + 152, 21, 16777215, -1);
         }

         int var41;
         if (class122.field1565 != null) {
            var31 = class52.field731 + 280;
            if (class44.field629[0] == 0 && class44.field636[0] == 0) {
               class122.field1565[2].method11667(var31, 4);
            } else {
               class122.field1565[0].method11667(var31, 4);
            }

            if (class44.field629[0] == 0 && class44.field636[0] == 1) {
               class122.field1565[3].method11667(var31 + 15, 4);
            } else {
               class122.field1565[1].method11667(var31 + 15, 4);
            }

            var0.method9420("World", var31 + 32, 17, 16777215, -1);
            var4 = class52.field731 + 390;
            if (class44.field629[0] == 1 && class44.field636[0] == 0) {
               class122.field1565[2].method11667(var4, 4);
            } else {
               class122.field1565[0].method11667(var4, 4);
            }

            if (class44.field629[0] == 1 && class44.field636[0] == 1) {
               class122.field1565[3].method11667(var4 + 15, 4);
            } else {
               class122.field1565[1].method11667(var4 + 15, 4);
            }

            var0.method9420("Players", var4 + 32, 17, 16777215, -1);
            var38 = class52.field731 + 500;
            if (class44.field629[0] == 2 && class44.field636[0] == 0) {
               class122.field1565[2].method11667(var38, 4);
            } else {
               class122.field1565[0].method11667(var38, 4);
            }

            if (class44.field629[0] == 2 && class44.field636[0] == 1) {
               class122.field1565[3].method11667(var38 + 15, 4);
            } else {
               class122.field1565[1].method11667(var38 + 15, 4);
            }

            var0.method9420("Location", var38 + 32, 17, 16777215, -1);
            var41 = class52.field731 + 610;
            if (class44.field629[0] == 3 && class44.field636[0] == 0) {
               class122.field1565[2].method11667(var41, 4);
            } else {
               class122.field1565[0].method11667(var41, 4);
            }

            if (class44.field629[0] == 3 && class44.field636[0] == 1) {
               class122.field1565[3].method11667(var41 + 15, 4);
            } else {
               class122.field1565[1].method11667(var41 + 15, 4);
            }

            var0.method9420("Type", var41 + 32, 17, 16777215, -1);
         }

         class601.method11558(class52.field731 + 708, 4, 50, 16, 0);
         var1.method9506("Cancel", class52.field731 + 708 + 25, 16, 16777215, -1);
         class52.field748 = -1;
         if (class292.field3380 != null) {
            var3 = 88;
            byte var36 = 19;
            var38 = 765 / (var3 + 1) - 1;
            var41 = 480 / (var36 + 1);

            do {
               var25 = var41;
               var8 = var38;
               if (var41 * (var38 - 1) >= class44.field626) {
                  --var38;
               }

               if (var38 * (var41 - 1) >= class44.field626) {
                  --var41;
               }

               if (var38 * (var41 - 1) >= class44.field626) {
                  --var41;
               }
            } while(var41 != var25 || var8 != var38);

            var25 = (765 - var38 * var3) / (var38 + 1);
            if (var25 > 5) {
               var25 = 5;
            }

            var8 = (480 - var36 * var41) / (var41 + 1);
            if (var8 > 5) {
               var8 = 5;
            }

            int var28 = (765 - var38 * var3 - var25 * (var38 - 1)) / 2;
            var10 = (480 - var41 * var36 - var8 * (var41 - 1)) / 2;
            int var35 = (var41 + class44.field626 - 1) / var41;
            class52.field756 = var35 - var38;
            if (class292.field3377 != null && class52.field755 > 0) {
               class292.field3377.method11667(8, class396.screenHeight / 2 - class292.field3377.field6010 / 2);
            }

            if (class411.field4957 != null && class52.field755 < class52.field756) {
               class411.field4957.method11667(class34.screenWidth - class411.field4957.field6007 - 8, class396.screenHeight / 2 - class411.field4957.field6010 / 2);
            }

            int var12 = var10 + 23;
            int var13 = var28 + class52.field731;
            int var14 = 0;
            boolean var15 = false;
            int var16 = class52.field755;

            int var17;
            for(var17 = var41 * var16; var17 < class44.field626 && var16 - class52.field755 < var38; ++var17) {
               class44 var18 = class44.field624[var17];
               boolean var19 = true;
               String var20 = Integer.toString(var18.field628);
               if (var18.field628 == -1) {
                  var20 = "OFF";
                  var19 = false;
               } else if (var18.field628 > 1980) {
                  var20 = "FULL";
                  var19 = false;
               }

               class89 var21 = null;
               int var22 = 0;
               if (var18.method1475()) {
                  var21 = var18.method1490() ? class89.field1264 : class89.field1263;
               } else if (var18.method1470()) {
                  var21 = var18.method1490() ? class89.field1272 : class89.field1261;
               } else if (var18.method1474()) {
                  var22 = 16711680;
                  var21 = var18.method1490() ? class89.field1265 : class89.field1262;
               } else if (var18.method1476()) {
                  var21 = var18.method1490() ? class89.field1257 : class89.field1266;
               } else if (var18.method1472()) {
                  var21 = var18.method1490() ? class89.field1260 : class89.field1259;
               } else if (var18.method1497()) {
                  var21 = var18.method1490() ? class89.field1268 : class89.field1267;
               } else if (var18.method1478()) {
                  var21 = var18.method1490() ? class89.field1270 : class89.field1269;
               }

               if (var21 == null || var21.field1273 >= class292.field3380.length) {
                  var21 = var18.method1490() ? class89.field1258 : class89.field1271;
               }

               if (class35.field231 >= var13 && class35.field220 >= var12 && class35.field231 < var13 + var3 && class35.field220 < var36 + var12 && var19) {
                  class52.field748 = var17;
                  class292.field3380[var21.field1273].method11707(var13, var12, 128, 16777215);
                  var15 = true;
               } else {
                  class292.field3380[var21.field1273].method11704(var13, var12);
               }

               if (class42.field283 != null) {
                  class42.field283[(var18.method1490() ? 8 : 0) + var18.field635].method11667(var13 + 29, var12);
               }

               var0.method9506(Integer.toString(var18.field640), var13 + 15, var36 / 2 + var12 + 5, var22, -1);
               var1.method9506(var20, var13 + 60, var36 / 2 + var12 + 5, 268435455, -1);
               var12 = var12 + var8 + var36;
               ++var14;
               if (var14 >= var41) {
                  var12 = var10 + 23;
                  var13 = var13 + var25 + var3;
                  var14 = 0;
                  ++var16;
               }
            }

            if (var15) {
               var17 = var1.method9415(class44.field624[class52.field748].field622) + 6;
               int var29 = var1.field5251 + 8;
               int var37 = class35.field220 + 25;
               if (var29 + var37 > 480) {
                  var37 = class35.field220 - 25 - var29;
               }

               class601.method11558(class35.field231 - var17 / 2, var37, var17, var29, 16777120);
               class601.method11562(class35.field231 - var17 / 2, var37, var17, var29, 0);
               var1.method9506(class44.field624[class52.field748].field622, class35.field231, var37 + var1.field5251 + 4, 0, -1);
            }
         }

      } else {
         class53.field772.method11704(class52.field731, 0);
         class406.field4894.method11704(class52.field731 + 382, 0);
         class139.field1686.method11667(class52.field731 + 382 - class139.field1686.field6007 / 2, 18);
         if (client.gameState == 0 || client.gameState == 5) {
            var3 = 20;
            var0.method9506("RuneScape is loading - please wait...", class52.field741 + 180, 245 - var3, 16777215, -1);
            var4 = 253 - var3;
            class601.method11562(class52.field741 + 180 - 152, var4, 304, 34, 9179409);
            class601.method11562(class52.field741 + 180 - 151, var4 + 1, 302, 32, 0);
            class601.method11558(class52.field741 + 180 - 150, var4 + 2, class52.field733 * 3, 30, 9179409);
            class601.method11558(class52.field741 + 180 - 150 + class52.field733 * 3, var4 + 2, 300 - class52.field733 * 3, 30, 0);
            var0.method9506(class52.field730, class52.field741 + 180, 276 - var3, 16777215, -1);
         }

         String var5;
         String var6;
         String var7;
         short var30;
         short var32;
         if (client.gameState == 20) {
            System.out.println("Login state");
            class478.field5307.method11667(class52.field741 + 180 - class478.field5307.field6007 / 2, 271 - class478.field5307.field6010 / 2);
            var30 = 201;
            var0.method9506(class52.field744, class52.field741 + 180, var30, 16776960, 0);
            var31 = var30 + 15;
            var0.method9506(class52.field745, class52.field741 + 180, var31, 16776960, 0);
            var31 += 15;
            var0.method9506(class52.field746, class52.field741 + 180, var31, 16776960, 0);
            var31 += 15;
            var31 += 7;
            if (class52.field758 != 4 && class52.field758 != 10 && class52.field758 != 1) {
               var0.method9420("Login: ", class52.field741 + 180 - 110, var31, 16777215, 0);
               var32 = 200;
               var5 = class36.clientPreferences.method2557() ? class54.method1987(class52.local_username) : class52.local_username;

               for(var6 = var5; var0.method9415(var6) > var32; var6 = var6.substring(0, var6.length() - 1)) {
               }

               var0.method9420(class465.method9500(var6), class52.field741 + 180 - 70, var31, 16777215, 0);
               var31 += 15;

               for(var7 = class54.method1987(class52.field726); var0.method9415(var7) > var32; var7 = var7.substring(1)) {
               }

               var0.method9420("Password: " + var7, class52.field741 + 180 - 108, var31, 16777215, 0);
               var31 += 15;
            }
         }

         if (client.gameState == 10 || client.gameState == 11 || client.gameState == 50) {
            class478.field5307.method11667(class52.field741, 171);
            short var23;
            if (class52.field758 == 0) {
               var30 = 251;
               var0.method9506("Welcome to RuneScape", class52.field741 + 180, var30, 16776960, 0);
               var31 = var30 + 30;
               var4 = class52.field741 + 180 - 80;
               var23 = 291;
               class199.field2175.method11667(var4 - 73, var23 - 20);
               var0.method9424("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var4 = class52.field741 + 180 + 80;
               class199.field2175.method11667(var4 - 73, var23 - 20);
               var0.method9424("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class52.field758 == 1) {
               var0.method9506(class52.field765, class52.field741 + 180, 201, 16776960, 0);
               var30 = 236;
               var0.method9506(class52.field744, class52.field741 + 180, var30, 16777215, 0);
               var31 = var30 + 15;
               var0.method9506(class52.field745, class52.field741 + 180, var31, 16777215, 0);
               var31 += 15;
               var0.method9506(class52.field746, class52.field741 + 180, var31, 16777215, 0);
               var31 += 15;
               var4 = class52.field741 + 180 - 80;
               var23 = 321;
               class199.field2175.method11667(var4 - 73, var23 - 20);
               var0.method9506("Continue", var4, var23 + 5, 16777215, 0);
               var4 = class52.field741 + 180 + 80;
               class199.field2175.method11667(var4 - 73, var23 - 20);
               var0.method9506("Cancel", var4, var23 + 5, 16777215, 0);
            } else if (class52.field758 == 2) {
               var30 = 201;
               var0.method9506(class52.field744, class294.field3397, var30, 16776960, 0);
               var31 = var30 + 15;
               var0.method9506(class52.field745, class294.field3397, var31, 16776960, 0);
               var31 += 15;
               var0.method9506(class52.field746, class294.field3397, var31, 16776960, 0);
               var31 += 15;
               var31 += 7;
               var0.method9420("Login: ", class294.field3397 - 110, var31, 16777215, 0);
               var32 = 200;
               var5 = class36.clientPreferences.method2557() ? class54.method1987(class52.local_username) : class52.local_username;

               for(var6 = var5; var0.method9415(var6) > var32; var6 = var6.substring(1)) {
               }

               var0.method9420(class465.method9500(var6) + (class52.field750 == 0 & client.cycle % 40 < 20 ? class134.method3619(16776960) + "|" : ""), class294.field3397 - 70, var31, 16777215, 0);
               var31 += 15;

               for(var7 = class54.method1987(class52.field726); var0.method9415(var7) > var32; var7 = var7.substring(1)) {
               }

               var0.method9420("Password: " + var7 + (class52.field750 == 1 & client.cycle % 40 < 20 ? class134.method3619(16776960) + "|" : ""), class294.field3397 - 108, var31, 16777215, 0);
               var31 += 15;
               var30 = 277;
               var8 = class294.field3397 + -117;
               class604 var9 = class188.method4283(client.Login_isUsernameRemembered, class52.field727);
               var9.method11667(var8, var30);
               var8 = var8 + var9.field6007 + 5;
               var1.method9420("Remember username", var8, var30 + 13, 16776960, 0);
               var8 = class294.field3397 + 24;
               var9 = class188.method4283(class36.clientPreferences.method2557(), class52.field749);
               var9.method11667(var8, var30);
               var8 = var8 + var9.field6007 + 5;
               var1.method9420("Hide username", var8, var30 + 13, 16776960, 0);
               var31 = var30 + 15;
               var10 = class294.field3397 - 80;
               short var11 = 321;
               class199.field2175.method11667(var10 - 73, var11 - 20);
               var0.method9506("Login", var10, var11 + 5, 16777215, 0);
               var10 = class294.field3397 + 80;
               class199.field2175.method11667(var10 - 73, var11 - 20);
               var0.method9506("Cancel", var10, var11 + 5, 16777215, 0);
               var30 = 357;
               switch(class52.field735) {
               case 2:
                  class285.field3296 = "Having trouble logging in?";
                  break;
               default:
                  class285.field3296 = "Can't login? Click here.";
               }

               class511.field5447 = new class449(class294.field3397, var30, var1.method9415(class285.field3296), 11);
               class537.field5585 = new class449(class294.field3397, var30, var1.method9415("Still having trouble logging in?"), 11);
               var1.method9506(class285.field3296, class294.field3397, var30, 16777215, 0);
            } else if (class52.field758 == 3) {
               var30 = 201;
               var0.method9506("Incorrect username or password.", class52.field741 + 180, var30, 16776960, 0);
               var31 = var30 + 20;
               var1.method9506("If you have upgraded to a Jagex Account, you", class52.field741 + 180, var31, 16776960, 0);
               var31 += 20;
               var1.method9506("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", class52.field741 + 180, var31, 16776960, 0);
               var31 += 15;
               var4 = class52.field741 + 180;
               var23 = 276;
               class199.field2175.method11667(var4 - 73, var23 - 20);
               var2.method9506("Try again", var4, var23 + 5, 16777215, 0);
               var4 = class52.field741 + 180;
               var23 = 326;
               class199.field2175.method11667(var4 - 73, var23 - 20);
               var2.method9506("Forgotten password?", var4, var23 + 5, 16777215, 0);
            } else {
               short var34;
               if (class52.field758 == 4) {
                  var0.method9506("Authenticator", class52.field741 + 180, 201, 16776960, 0);
                  var30 = 236;
                  var0.method9506(class52.field744, class52.field741 + 180, var30, 16777215, 0);
                  var31 = var30 + 15;
                  var0.method9506(class52.field745, class52.field741 + 180, var31, 16777215, 0);
                  var31 += 15;
                  var0.method9506(class52.field746, class52.field741 + 180, var31, 16777215, 0);
                  var31 += 15;
                  var0.method9420("PIN: " + class54.method1987(class464.field5240) + (client.cycle % 40 < 20 ? class134.method3619(16776960) + "|" : ""), class52.field741 + 180 - 108, var31, 16777215, 0);
                  var31 -= 8;
                  var0.method9420("Trust this computer", class52.field741 + 180 - 9, var31, 16776960, 0);
                  var31 += 15;
                  var0.method9420("for 30 days: ", class52.field741 + 180 - 9, var31, 16776960, 0);
                  var4 = 180 + class52.field741 - 9 + var0.method9415("for 30 days: ") + 15;
                  var38 = var31 - var0.field5251;
                  class604 var33;
                  if (class52.field743) {
                     var33 = class199.field2173;
                  } else {
                     var33 = class289.field3340;
                  }

                  var33.method11667(var4, var38);
                  var31 += 15;
                  var25 = class52.field741 + 180 - 80;
                  var34 = 321;
                  class199.field2175.method11667(var25 - 73, var34 - 20);
                  var0.method9506("Continue", var25, var34 + 5, 16777215, 0);
                  var25 = class52.field741 + 180 + 80;
                  class199.field2175.method11667(var25 - 73, var34 - 20);
                  var0.method9506("Cancel", var25, var34 + 5, 16777215, 0);
                  var1.method9506("Can't login? Click here.", class52.field741 + 180, var34 + 36, 16777215, 0);
               } else if (class52.field758 == 5) {
                  var0.method9506("Forgotten your password?", class52.field741 + 180, 201, 16776960, 0);
                  var30 = 221;
                  var2.method9506(class52.field744, class52.field741 + 180, var30, 16776960, 0);
                  var31 = var30 + 15;
                  var2.method9506(class52.field745, class52.field741 + 180, var31, 16776960, 0);
                  var31 += 15;
                  var2.method9506(class52.field746, class52.field741 + 180, var31, 16776960, 0);
                  var31 += 15;
                  var31 += 14;
                  var0.method9420("Username/email: ", class52.field741 + 180 - 145, var31, 16777215, 0);
                  var32 = 174;
                  var5 = class36.clientPreferences.method2557() ? class54.method1987(class52.local_username) : class52.local_username;

                  for(var6 = var5; var0.method9415(var6) > var32; var6 = var6.substring(1)) {
                  }

                  var0.method9420(class465.method9500(var6) + (client.cycle % 40 < 20 ? class134.method3619(16776960) + "|" : ""), class52.field741 + 180 - 34, var31, 16777215, 0);
                  var31 += 15;
                  var25 = class52.field741 + 180 - 80;
                  var34 = 321;
                  class199.field2175.method11667(var25 - 73, var34 - 20);
                  var0.method9506("Recover", var25, var34 + 5, 16777215, 0);
                  var25 = class52.field741 + 180 + 80;
                  class199.field2175.method11667(var25 - 73, var34 - 20);
                  var0.method9506("Back", var25, var34 + 5, 16777215, 0);
                  var34 = 356;
                  var1.method9506("Still having trouble logging in?", class294.field3397, var34, 268435455, 0);
               } else if (class52.field758 == 6) {
                  var30 = 201;
                  var0.method9506(class52.field744, class52.field741 + 180, var30, 16776960, 0);
                  var31 = var30 + 15;
                  var0.method9506(class52.field745, class52.field741 + 180, var31, 16776960, 0);
                  var31 += 15;
                  var0.method9506(class52.field746, class52.field741 + 180, var31, 16776960, 0);
                  var31 += 15;
                  var4 = class52.field741 + 180;
                  var23 = 321;
                  class199.field2175.method11667(var4 - 73, var23 - 20);
                  var0.method9506("Back", var4, var23 + 5, 16777215, 0);
               } else if (class52.field758 == 7) {
                  if (class563.field5781 && !client.field591) {
                     var30 = 201;
                     var0.method9506(class52.field744, class294.field3397, var30, 16776960, 0);
                     var31 = var30 + 15;
                     var0.method9506(class52.field745, class294.field3397, var31, 16776960, 0);
                     var31 += 15;
                     var0.method9506(class52.field746, class294.field3397, var31, 16776960, 0);
                     var4 = class294.field3397 - 150;
                     var31 += 10;

                     for(var38 = 0; var38 < 8; ++var38) {
                        class199.field2175.method11678(var4, var31, 30, 40);
                        boolean var26 = var38 == class52.field738 & client.cycle % 40 < 20;
                        var0.method9420((class52.field739[var38] == null ? "" : class52.field739[var38]) + (var26 ? class134.method3619(16776960) + "|" : ""), var4 + 10, var31 + 27, 16777215, 0);
                        if (var38 != 1 && var38 != 3) {
                           var4 += 35;
                        } else {
                           var4 += 50;
                           var0.method9420(class465.method9500("/"), var4 - 13, var31 + 27, 16777215, 0);
                        }
                     }

                     var38 = class294.field3397 - 80;
                     short var39 = 321;
                     class199.field2175.method11667(var38 - 73, var39 - 20);
                     var0.method9506("Submit", var38, var39 + 5, 16777215, 0);
                     var38 = class294.field3397 + 80;
                     class199.field2175.method11667(var38 - 73, var39 - 20);
                     var0.method9506("Cancel", var38, var39 + 5, 16777215, 0);
                  } else {
                     var30 = 216;
                     var0.method9506("Your date of birth isn't set.", class52.field741 + 180, var30, 16776960, 0);
                     var31 = var30 + 15;
                     var2.method9506("Please verify your account status by", class52.field741 + 180, var31, 16776960, 0);
                     var31 += 15;
                     var2.method9506("setting your date of birth.", class52.field741 + 180, var31, 16776960, 0);
                     var31 += 15;
                     var4 = class52.field741 + 180 - 80;
                     var23 = 321;
                     class199.field2175.method11667(var4 - 73, var23 - 20);
                     var0.method9506("Set Date of Birth", var4, var23 + 5, 16777215, 0);
                     var4 = class52.field741 + 180 + 80;
                     class199.field2175.method11667(var4 - 73, var23 - 20);
                     var0.method9506("Back", var4, var23 + 5, 16777215, 0);
                  }
               } else if (class52.field758 == 8) {
                  var30 = 216;
                  var0.method9506("Sorry, but your account is not eligible to play.", class52.field741 + 180, var30, 16776960, 0);
                  var31 = var30 + 15;
                  var2.method9506("For more information, please take a look at", class52.field741 + 180, var31, 16776960, 0);
                  var31 += 15;
                  var2.method9506("our privacy policy.", class52.field741 + 180, var31, 16776960, 0);
                  var31 += 15;
                  var4 = class52.field741 + 180 - 80;
                  var23 = 321;
                  class199.field2175.method11667(var4 - 73, var23 - 20);
                  var0.method9506("Privacy Policy", var4, var23 + 5, 16777215, 0);
                  var4 = class52.field741 + 180 + 80;
                  class199.field2175.method11667(var4 - 73, var23 - 20);
                  var0.method9506("Back", var4, var23 + 5, 16777215, 0);
               } else if (class52.field758 == 9) {
                  var30 = 221;
                  var0.method9506(class52.field744, class52.field741 + 180, var30, 16776960, 0);
                  var31 = var30 + 25;
                  var0.method9506(class52.field745, class52.field741 + 180, var31, 16776960, 0);
                  var31 += 25;
                  var0.method9506(class52.field746, class52.field741 + 180, var31, 16776960, 0);
                  var4 = class52.field741 + 180;
                  var23 = 311;
                  class199.field2175.method11667(var4 - 73, var23 - 20);
                  var0.method9506("Try again", var4, var23 + 5, 16777215, 0);
               } else if (class52.field758 == 10) {
                  var31 = class52.field741 + 180;
                  var32 = 209;
                  var0.method9506("Welcome to RuneScape", class52.field741 + 180, var32, 16776960, 0);
                  var4 = var32 + 20;
                  class44.field625.method11667(var31 - 109, var4);
                  if (class52.field747.isEmpty()) {
                     class205.field2257.method11667(var31 - 48, var4 + 18);
                  } else {
                     class205.field2257.method11667(var31 - 48, var4 + 5);
                     var0.method9506(class52.field747, var31, var4 + 68 - 15, 16776960, 0);
                  }
               } else if (class52.field758 == 12) {
                  var31 = class294.field3397;
                  var32 = 216;
                  var2.method9506("Before using this app, please read and accept our", var31, var32, 16777215, 0);
                  var4 = var32 + 17;
                  var2.method9506("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var31, var4, 16777215, 0);
                  var4 += 17;
                  var2.method9506("<col=ffd200>agreement (EULA)</col>.", var31, var4, 16777215, 0);
                  var4 += 17;
                  var2.method9506("By accepting, you agree to these documents.", var31, var4, 16777215, 0);
                  var31 = class294.field3397 - 80;
                  var32 = 311;
                  class199.field2175.method11667(var31 - 73, var32 - 20);
                  var0.method9506("Accept", var31, var32 + 5, 16777215, 0);
                  var31 = class294.field3397 + 80;
                  class199.field2175.method11667(var31 - 73, var32 - 20);
                  var0.method9506("Decline", var31, var32 + 5, 16777215, 0);
               } else if (class52.field758 == 13) {
                  var30 = 231;
                  var2.method9506("You must accept our terms of use, privacy policy,", class52.field741 + 180, var30, 16777215, 0);
                  var31 = var30 + 20;
                  var2.method9506("and end user licence agreement to continue.", class52.field741 + 180, var31, 16777215, 0);
                  var4 = class52.field741 + 180;
                  var30 = 311;
                  class199.field2175.method11667(var4 - 73, var30 - 20);
                  var0.method9506("Back", var4, var30 + 5, 16777215, 0);
               } else if (class52.field758 == 14) {
                  var30 = 201;
                  String var24 = "";
                  var5 = "";
                  var6 = "";
                  switch(class52.field753) {
                  case 0:
                     var24 = "Your account has been involved";
                     var5 = "in serious rule breaking.";
                     var6 = "";
                     break;
                  case 1:
                     var24 = "Your account has been locked due to";
                     var5 = "suspicious activity.";
                     var6 = "Please recover your account.";
                     break;
                  case 2:
                     var24 = "The unpaid balance on your account needs";
                     var5 = "to be resolved before you can play.";
                     var6 = class393.field4609;
                     break;
                  default:
                     class265.method5991(false);
                  }

                  var0.method9506(var24, class52.field741 + 180, var30, 16776960, 0);
                  var31 = var30 + 20;
                  var0.method9506(var5, class52.field741 + 180, var31, 16776960, 0);
                  var31 += 20;
                  var0.method9506(var6, class52.field741 + 180, var31, 16776960, 0);
                  var25 = class52.field741 + 180;
                  var34 = 276;
                  class199.field2175.method11667(var25 - 73, var34 - 20);
                  if (class52.field753 == 1) {
                     var0.method9506("Recover Account", var25, var34 + 5, 16777215, 0);
                  } else {
                     var0.method9506("View Appeal Options", var25, var34 + 5, 16777215, 0);
                  }

                  var25 = class52.field741 + 180;
                  var34 = 326;
                  class199.field2175.method11667(var25 - 73, var34 - 20);
                  var0.method9506("Back", var25, var34 + 5, 16777215, 0);
               } else if (class52.field758 == 24) {
                  var30 = 221;
                  var0.method9506(class52.field744, class52.field741 + 180, var30, 16777215, 0);
                  var31 = var30 + 15;
                  var0.method9506(class52.field745, class52.field741 + 180, var31, 16777215, 0);
                  var31 += 15;
                  var0.method9506(class52.field746, class52.field741 + 180, var31, 16777215, 0);
                  var31 += 15;
                  var4 = class52.field741 + 180;
                  var23 = 301;
                  class199.field2175.method11667(var4 - 73, var23 - 20);
                  var0.method9506("Ok", var4, var23 + 5, 16777215, 0);
               } else if (class52.field758 == 32) {
                  var30 = 216;
                  var0.method9506("Your date of birth isn't set.", class52.field741 + 180, var30, 16776960, 0);
                  var31 = var30 + 15;
                  var2.method9506("Please verify your account status by", class52.field741 + 180, var31, 16776960, 0);
                  var31 += 15;
                  var2.method9506("setting your date of birth.", class52.field741 + 180, var31, 16776960, 0);
                  var31 += 15;
                  var4 = class52.field741 + 180 - 80;
                  var23 = 321;
                  class199.field2175.method11667(var4 - 73, var23 - 20);
                  var0.method9506("Set Date of Birth", var4, var23 + 5, 16777215, 0);
                  var4 = class52.field741 + 180 + 80;
                  class199.field2175.method11667(var4 - 73, var23 - 20);
                  var0.method9506("Back", var4, var23 + 5, 16777215, 0);
               } else if (class52.field758 == 33) {
                  var30 = 201;
                  var0.method9506(class52.field744, class52.field741 + 180, var30, 16776960, 0);
                  var31 = var30 + 20;
                  var1.method9506(class52.field745, class52.field741 + 180, var31, 16776960, 0);
                  var31 += 20;
                  var1.method9506(class52.field746, class52.field741 + 180, var31, 16776960, 0);
                  var31 += 15;
                  var4 = class52.field741 + 180;
                  var23 = 276;
                  class199.field2175.method11667(var4 - 73, var23 - 20);
                  var2.method9506("Download Launcher", var4, var23 + 5, 16777215, 0);
                  var4 = class52.field741 + 180;
                  var23 = 326;
                  class199.field2175.method11667(var4 - 73, var23 - 20);
                  var2.method9506("Back", var4, var23 + 5, 16777215, 0);
               } else if (class52.field758 == 34) {
                  var30 = 201;
                  var0.method9506(class52.field744, class52.field741 + 180, var30, 16776960, 0);
                  var31 = var30 + 20;
                  var1.method9506(class52.field745, class52.field741 + 180, var31, 16776960, 0);
                  var31 += 20;
                  var1.method9506(class52.field746, class52.field741 + 180, var31, 16776960, 0);
                  var4 = class52.field741 + 180;
                  var23 = 276;
                  class199.field2175.method11667(var4 - 73, var23 - 20);
                  var6 = class44.field630 != null ? "Loading..." : "Switch World";
                  var2.method9506(var6, var4, var23 + 5, 16777215, 0);
                  var4 = class52.field741 + 180;
                  var23 = 326;
                  class199.field2175.method11667(var4 - 73, var23 - 20);
                  var2.method9506("Back", var4, var23 + 5, 16777215, 0);
               }
            }
         }

         if (client.gameState >= 10) {
            int[] var27 = new int[4];
            class601.method11552(var27);
            class601.method11550(class52.field731, 0, class52.field731 + 765, class396.screenHeight);
            class155.field1803.method2518(class52.field731 - 22, client.cycle);
            class155.field1803.method2518(class52.field731 + 22 + 765 - 128, client.cycle);
            class601.method11618(var27);
         }

         class39.field273[class36.clientPreferences.method2559() ? 1 : 0].method11667(class52.field731 + 765 - 40, 463);
         if (client.gameState > 5 && class432.field5100 == class242.field2970) {
            if (class275.field3231 != null) {
               var31 = class52.field731 + 5;
               var32 = 463;
               byte var42 = 100;
               byte var40 = 35;
               class275.field3231.method11667(var31, var32);
               var0.method9506("World" + " " + client.worldId, var42 / 2 + var31, var40 / 2 + var32 - 2, 16777215, 0);
               if (class44.field630 != null) {
                  var1.method9506("Loading...", var42 / 2 + var31, var40 / 2 + var32 + 12, 16777215, 0);
               } else {
                  var1.method9506("Click to switch", var42 / 2 + var31, var40 / 2 + var32 + 12, 16777215, 0);
               }
            } else {
               class275.field3231 = class61.method2092(class496.field5387, "sl_button", "");
            }
         }

      }
   }
}
