package game;

import java.util.ArrayList;
import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bj")
public class class47 {
   @ObfuscatedName("vn")
   @ObfuscatedGetter(
      intValue = -1546236753
   )
   static int field687;
   @ObfuscatedName("af")
   final ArrayList field678 = new ArrayList(1);
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1784853113
   )
   int field674 = 0;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lna;"
   )
   class356 field675 = new class356();
   @ObfuscatedName("ac")
   byte field676;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lko;"
   )
   class280 field677;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lwb;"
   )
   class590 field680;
   @ObfuscatedName("ao")
   String[] field679 = new String[3];
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -48116131
   )
   int field682 = -1;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 2075945551
   )
   int field686 = 0;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 2019959715
   )
   int field681 = -1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1774552581
   )
   int field683 = -1;

   class47(int var1) {
      this.field682 = var1;

      for(int var2 = 0; var2 < 3; ++var2) {
         this.field679[var2] = "";
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "42"
   )
   void method1776() {
      this.field680 = null;
      this.field678.clear();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-668868862"
   )
   void method1806(int var1) {
      this.field674 = var1;
      this.field686 = 0;
      this.field681 = -1;
      this.field683 = -1;
      this.field676 = 0;
      this.field677 = class280.field3281;
      this.field680 = null;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lcv;B)V",
      garbageValue = "74"
   )
   void method1778(class69 var1) {
      this.field678.add(var1);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lcv;B)V",
      garbageValue = "54"
   )
   void method1779(class69 var1) {
      this.field678.remove(var1);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "107"
   )
   void method1805() {
      this.field678.clear();
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ILdr;I)Lcv;",
      garbageValue = "-154351301"
   )
   class69 method1781(int var1, class79 var2) {
      class69 var3 = new class69(var1);
      if (this.field680 != null) {
         var3.method2168(this.field680);
      }

      var3.field1097 = this.field686;
      var3.field1082 = this.field683;
      var3.field1054[0] = this.field677;
      var3.field933 = this.field675.field4027;
      var3.field1053 = var2.field1172;
      var3.field938 = this.field679;
      var3.method2422(this.field675.field4026 - var2.field1164, this.field675.field4025 - var2.field1165);
      return var3;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1999186646"
   )
   boolean method1857() {
      return this.field674 == -1;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-993536765"
   )
   void method1783() {
      this.field674 = this.field675.method7426();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1420442183"
   )
   void method1784(int var1, int var2) {
      this.field675.method7422(this.field674, var1, var2);
      this.field674 = -1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "326594181"
   )
   int method1785() {
      return this.field675.field4027;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-293144984"
   )
   void method1819(int var1) {
      this.field675.field4027 = var1;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Lko;I)V",
      garbageValue = "-1349422484"
   )
   void method1817(class280 var1) {
      for(int var2 = 0; var2 < this.field678.size(); ++var2) {
         class69 var3 = (class69)this.field678.get(var2);
         class79 var4 = var3.method2468();
         int var5 = this.field675.field4026 - var4.field1164;
         int var6 = this.field675.field4025 - var4.field1165;
         class280 var7 = var1;
         boolean var8 = true;
         boolean var9 = true;
         if (var4.field1172 == -1 && this.field682 == client.field348 && class4.field7 == class384.field4404 && (var3.field1055 < 1536 || var3.field1056 < 1536 || var3.field1055 >= 11776 || var3.field1056 >= 11776)) {
            var7 = class280.field3279;
         }

         var3.field933 = this.field675.field4027;
         if (var7 == class280.field3279) {
            var3.method2422(var5, var6);
         } else {
            var3.method2211(var4, var5, var6, var7);
         }
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-1366769806"
   )
   void method1862(class590 var1) {
      this.field680 = var1;

      for(int var2 = 0; var2 < this.field678.size(); ++var2) {
         ((class69)this.field678.get(var2)).method2168(this.field680);
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "405256797"
   )
   void method1829(int var1, int var2) {
      for(int var3 = 0; var3 < this.field678.size(); ++var3) {
         class163.method3993((class69)this.field678.get(var3), var1, var2);
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1431458295"
   )
   void method1790(int var1) {
      this.field683 = var1;

      for(int var2 = 0; var2 < this.field678.size(); ++var2) {
         ((class75)this.field678.get(var2)).field1082 = var1;
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "597278258"
   )
   void method1791(String var1) {
      boolean var2 = var1.charAt(0) == '~';
      if (var2) {
         var1 = var1.substring(1);
      }

      class613 var3 = null;

      for(int var4 = 0; var4 < this.field678.size(); ++var4) {
         class69 var5 = (class69)this.field678.get(var4);
         var5.field1101 = false;
         var5.field1079 = 0;
         var5.field1080 = 0;
         var5.field1078 = 150;
         var5.field1075 = var1;
         var3 = var5.field934;
      }

      if (var3 != null) {
         if (var2 || this.field682 == client.field491) {
            class90.method2893(2, var3.method11909(), var1);
         }

      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(IIIIIB)V",
      garbageValue = "0"
   )
   void method1846(int var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < this.field678.size(); ++var6) {
         ((class75)this.field678.get(var6)).method2425(var1, var2, var3, var4, client.field412, var5);
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)V",
      garbageValue = "2002160283"
   )
   void method1789(int var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < this.field678.size(); ++var6) {
         ((class75)this.field678.get(var6)).method2454(var1, client.field412, var2, var3, var4, var5);
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "25"
   )
   void method1794(int var1) {
      for(int var2 = 0; var2 < this.field678.size(); ++var2) {
         ((class75)this.field678.get(var2)).method2427(var1);
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2022467880"
   )
   void method1795(int var1) {
      this.field681 = var1;

      for(int var2 = 0; var2 < this.field678.size(); ++var2) {
         class69 var3 = (class69)this.field678.get(var2);
         var3.field1049 = this.field681;
         if (var3.field1100 == 0) {
            var3.field1097 = this.field681;
            var3.method2432();
         }
      }

   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(ILpg;ZLjava/lang/String;[BS)V",
      garbageValue = "-6543"
   )
   void method1796(int var1, class397 var2, boolean var3, String var4, byte[] var5) {
      boolean var6 = false;
      String var7 = null;

      int var8;
      for(var8 = 0; var8 < this.field678.size(); ++var8) {
         class69 var9 = (class69)this.field678.get(var8);
         if (var9.field934 != null && var9.field935 != null) {
            boolean var10 = false;
            if (var2.field4819 && class40.field279.method1541(var9.field934)) {
               var10 = true;
            }

            if (!var10 && client.field341 == 0 && !var9.field954) {
               var6 = true;
               var7 = var9.field934.method11909();
               var9.field1075 = var4.trim();
               var9.field1079 = var1 >> 8;
               var9.field1080 = var1 & 255;
               var9.field1078 = 150;
               var9.field1081 = class608.method11838(var5);
               var9.field1101 = var3;
               var9.field1077 = var9 != class76.field1108 && var2.field4819 && !client.field441.isEmpty() && var4.toLowerCase().indexOf(client.field441) == -1;
            }
         }
      }

      if (var6 && var7 != null) {
         if (var2.field4833) {
            var8 = var3 ? 91 : 1;
         } else {
            var8 = var3 ? 90 : 2;
         }

         if (var2.field4815 != -1) {
            class90.method2893(var8, class57.method2014(var2.field4815) + var7, var4);
         } else {
            class90.method2893(var8, var7, var4);
         }
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIII)V",
      garbageValue = "1126882622"
   )
   void method1797(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var8 = 0; var8 < this.field678.size(); ++var8) {
         class69 var9 = (class69)this.field678.get(var8);
         class79 var10 = var9.method2468();
         int var11 = this.field675.field4026 - var10.field1164;
         int var12 = this.field675.field4025 - var10.field1165;
         var9.field1089 = var11 + var1;
         var9.field1091 = var12 + var2;
         var9.field1072 = var3 + var11;
         var9.field1084 = var12 + var4;
         var9.field1085 = var5;
         var9.field1094 = var6;
         var9.field1095 = var7;
         var9.field1040 = 0;
         var9.method2182(var9.field1072, var9.field1084);
         var9.field933 = this.field675.field4027;
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;B)V",
      garbageValue = "0"
   )
   void method1798(String[] var1) {
      this.field679 = (String[])((String[])Arrays.copyOf(var1, var1.length));

      for(int var2 = 0; var2 < this.field678.size(); ++var2) {
         ((class69)this.field678.get(var2)).field938 = (String[])((String[])Arrays.copyOf(var1, var1.length));
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(IIBBBBB)V",
      garbageValue = "-3"
   )
   void method1799(int var1, int var2, byte var3, byte var4, byte var5, byte var6) {
      for(int var7 = 0; var7 < this.field678.size(); ++var7) {
         class69 var8 = (class69)this.field678.get(var7);
         var8.field1051 = var1;
         var8.field1052 = var2;
         var8.field1076.method5649(var3, var4, var5, var6);
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-2111748992"
   )
   void method1777(int var1, int var2, int var3, int var4) {
      for(int var5 = 0; var5 < this.field678.size(); ++var5) {
         ((class75)this.field678.get(var5)).method2452(var1, var2, var3, var4);
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(III)Lbz;",
      garbageValue = "-2133911364"
   )
   static class39 method1873(int var0, int var1) {
      class57 var2 = (class57)class91.field1286.get(var0);
      return var2.method2013(var1);
   }
}
