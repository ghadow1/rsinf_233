package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
public class class184 extends class540 {
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 134506511
   )
   public static int field2012;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lmu;"
   )
   static class320 field1991 = new class320(256);
   @ObfuscatedName("lm")
   static String some_beta_field;
   @ObfuscatedName("nu")
   @ObfuscatedSignature(
      descriptor = "Lxi;"
   )
   static class611 field2013;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 50924905
   )
   public final int field1992;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 191158763
   )
   public int field1993 = -1;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1719022835
   )
   int field1994 = -1;
   @ObfuscatedName("al")
   public String field1995;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 2032885629
   )
   public int field1996;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -367454329
   )
   public int field2006 = 0;
   @ObfuscatedName("aa")
   public boolean field1998 = true;
   @ObfuscatedName("am")
   public boolean field2000 = false;
   @ObfuscatedName("an")
   public String[] field2008 = new String[5];
   @ObfuscatedName("ar")
   public String field2001;
   @ObfuscatedName("ae")
   int[] field2002;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1093298753
   )
   int field2003 = Integer.MAX_VALUE;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1709027597
   )
   int field2007 = Integer.MAX_VALUE;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1252222821
   )
   int field2005 = Integer.MIN_VALUE;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1502275431
   )
   int field1990 = Integer.MIN_VALUE;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lhp;"
   )
   public class193 field2011;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lhx;"
   )
   public class198 field1999;
   @ObfuscatedName("ax")
   int[] field2009;
   @ObfuscatedName("ak")
   byte[] field2010;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -566293439
   )
   public int field2004;

   class184(int var1) {
      this.field2011 = class193.field2086;
      this.field1999 = class198.field2169;
      this.field2004 = -1;
      this.field1992 = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "1627631135"
   )
   void method4181(class590 var1) {
      while(true) {
         int var2 = var1.method11196();
         if (var2 == 0) {
            return;
         }

         this.method4182(var1, var2);
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lwb;II)V",
      garbageValue = "733819842"
   )
   void method4182(class590 var1, int var2) {
      if (var2 == 1) {
         this.field1993 = var1.method11222();
      } else if (var2 == 2) {
         this.field1994 = var1.method11222();
      } else if (var2 == 3) {
         this.field1995 = var1.method11207();
      } else if (var2 == 4) {
         this.field1996 = var1.method11278();
      } else if (var2 == 5) {
         var1.method11278();
      } else if (var2 == 6) {
         this.field2006 = var1.method11196();
      } else {
         int var6;
         if (var2 == 7) {
            var6 = var1.method11196();
            if ((var6 & 1) == 0) {
               this.field1998 = false;
            }

            if ((var6 & 2) == 2) {
               this.field2000 = true;
            }
         } else if (var2 == 8) {
            var1.method11196();
         } else if (var2 >= 10 && var2 <= 14) {
            this.field2008[var2 - 10] = var1.method11207();
         } else if (var2 == 15) {
            var6 = var1.method11196();
            this.field2002 = new int[var6 * 2];

            int var4;
            for(var4 = 0; var4 < var6 * 2; ++var4) {
               this.field2002[var4] = var1.method11452();
            }

            var1.method11202();
            var4 = var1.method11196();
            this.field2009 = new int[var4];

            int var5;
            for(var5 = 0; var5 < this.field2009.length; ++var5) {
               this.field2009[var5] = var1.method11202();
            }

            this.field2010 = new byte[var6];

            for(var5 = 0; var5 < var6; ++var5) {
               this.field2010[var5] = var1.method11197();
            }
         } else if (var2 != 16) {
            if (var2 == 17) {
               this.field2001 = var1.method11207();
            } else if (var2 == 18) {
               var1.method11222();
            } else if (var2 == 19) {
               this.field2004 = var1.method11198();
            } else if (var2 == 21) {
               var1.method11202();
            } else if (var2 == 22) {
               var1.method11202();
            } else if (var2 == 23) {
               var1.method11196();
               var1.method11196();
               var1.method11196();
            } else if (var2 == 24) {
               var1.method11452();
               var1.method11452();
            } else if (var2 == 25) {
               var1.method11222();
            } else if (var2 == 28) {
               var1.method11196();
            } else if (var2 == 29) {
               class193[] var3 = new class193[]{class193.field2086, class193.field2088, class193.field2089};
               this.field2011 = (class193)class173.method4100(var3, var1.method11196());
            } else if (var2 == 30) {
               class198[] var7 = new class198[]{class198.field2167, class198.field2172, class198.field2169};
               this.field1999 = (class198)class173.method4100(var7, var1.method11196());
            }
         }
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "836494955"
   )
   void method4183() {
      if (this.field2002 != null) {
         for(int var1 = 0; var1 < this.field2002.length; var1 += 2) {
            if (this.field2002[var1] < this.field2003) {
               this.field2003 = this.field2002[var1];
            } else if (this.field2002[var1] > this.field2005) {
               this.field2005 = this.field2002[var1];
            }

            if (this.field2002[var1 + 1] < this.field2007) {
               this.field2007 = this.field2002[var1 + 1];
            } else if (this.field2002[var1 + 1] > this.field1990) {
               this.field1990 = this.field2002[var1 + 1];
            }
         }
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(ZI)Lxt;",
      garbageValue = "-2030326822"
   )
   public class605 method4184(boolean var1) {
      int var2 = this.field1993;
      return this.method4192(var2);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(II)Lxt;",
      garbageValue = "-179058894"
   )
   class605 method4192(int var1) {
      if (var1 < 0) {
         return null;
      } else {
         class605 var2 = (class605)field1991.method7018((long)var1);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class100.method3145(class169.field1911, var1, 0);
            if (var2 != null) {
               field1991.method7009(var2, (long)var1);
            }

            return var2;
         }
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "425079402"
   )
   public int method4190() {
      return this.field1992;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lnn;I)V",
      garbageValue = "-1979610932"
   )
   public static void method4205(class345 var0) {
      if (!class339.field3893.contains(var0)) {
         class339.field3893.add(var0);
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1771498025"
   )
   static void method4204(int var0) {
      class62 var1 = (class62)class62.field867.method8623((long)var0);
      if (var1 != null) {
         var1.vmethod10557();
      }
   }

   @ObfuscatedName("oe")
   @ObfuscatedSignature(
      descriptor = "(Loi;IB)Ljava/lang/String;",
      garbageValue = "-63"
   )
   static String method4186(class369 var0, int var1) {
      if (!class185.method4212(class388.method8204(var0), var1) && var0.field4256 == null) {
         return null;
      } else {
         return var0.field4225 != null && var0.field4225.length > var1 && var0.field4225[var1] != null && !var0.field4225[var1].trim().isEmpty() ? var0.field4225[var1] : null;
      }
   }
}
