package game;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
public final class class291 {
   @ObfuscatedName("th")
   @ObfuscatedGetter(
      intValue = 1028565547
   )
   static int field3375;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   final class412 field3358;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lpx;"
   )
   final class412 field3368;
   @ObfuscatedName("at")
   final HashMap field3359;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1231047087
   )
   public int field3360 = 0;
   @ObfuscatedName("ap")
   boolean field3361 = false;
   @ObfuscatedName("aq")
   boolean field3370 = false;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Llq;"
   )
   class310 field3363;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lxt;"
   )
   class605 field3364;
   @ObfuscatedName("al")
   HashMap field3365;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "[[Llb;"
   )
   class290[][] field3374;
   @ObfuscatedName("ai")
   HashMap field3367 = new HashMap();
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "[Lxc;"
   )
   class604[] field3362;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1701458067
   )
   int field3366;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -267952557
   )
   int field3357;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -548911445
   )
   int field3371;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1400339392
   )
   int field3372;

   @ObfuscatedSignature(
      descriptor = "([Lxc;Ljava/util/HashMap;Lpx;Lpx;)V"
   )
   public class291(class604[] var1, HashMap var2, class412 var3, class412 var4) {
      this.field3362 = var1;
      this.field3359 = var2;
      this.field3358 = var3;
      this.field3368 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpx;Ljava/lang/String;ZI)V",
      garbageValue = "-1171494598"
   )
   public void method6638(class412 var1, String var2, boolean var3) {
      if (!this.field3370) {
         this.field3361 = false;
         this.field3370 = true;
         System.nanoTime();
         int var4 = var1.method8361(class308.field3498.field3496);
         int var5 = var1.method8354(var4, var2);
         class590 var6 = new class590(var1.method8371(class308.field3498.field3496, var2));
         class590 var7 = new class590(var1.method8371(class308.field3494.field3496, var2));
         System.nanoTime();
         System.nanoTime();
         this.field3363 = new class310();

         try {
            this.field3363.method6915(var6, var7, var5, var3);
         } catch (IllegalStateException var19) {
            return;
         }

         this.field3363.method6482();
         this.field3363.method6439();
         this.field3363.method6497();
         this.field3366 = this.field3363.method6433() * 64;
         this.field3357 = this.field3363.method6435() * 64;
         this.field3371 = (this.field3363.method6455() - this.field3363.method6433() + 1) * 64;
         this.field3372 = (this.field3363.method6436() - this.field3363.method6435() + 1) * 4096;
         int var16 = this.field3363.method6455() - this.field3363.method6433() + 1;
         int var9 = this.field3363.method6436() - this.field3363.method6435() + 1;
         System.nanoTime();
         System.nanoTime();
         class133.method3604();
         this.field3374 = new class290[var16][var9];
         Iterator var10 = this.field3363.field3503.iterator();

         while(var10.hasNext()) {
            class284 var11 = (class284)var10.next();
            int var12 = var11.field3431;
            int var13 = var11.field3429;
            int var14 = var12 - this.field3363.method6433();
            int var15 = var13 - this.field3363.method6435();
            this.field3374[var14][var15] = new class290(var12, var13, this.field3363.method6421(), this.field3359);
            this.field3374[var14][var15].method6500(var11, this.field3363.field3504);
         }

         for(int var17 = 0; var17 < var16; ++var17) {
            for(int var18 = 0; var18 < var9; ++var18) {
               if (this.field3374[var17][var18] == null) {
                  this.field3374[var17][var18] = new class290(this.field3363.method6433() + var17, this.field3363.method6435() + var18, this.field3363.method6421(), this.field3359);
                  this.field3374[var17][var18].method6586(this.field3363.field3502, this.field3363.field3504);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.method8355(class308.field3495.field3496, var2)) {
            byte[] var20 = var1.method8371(class308.field3495.field3496, var2);
            this.field3364 = class179.method4160(var20);
         }

         System.nanoTime();
         var1.method8349();
         var1.method8429();
         this.field3361 = true;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1813843155"
   )
   public final void method6646() {
      this.field3365 = null;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIII)V",
      garbageValue = "1552449658"
   )
   public final void method6640(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = class601.field5988;
      int var10 = class601.field5989;
      int var11 = class601.field5990;
      float[] var12 = class601.field5987;
      int[] var13 = new int[4];
      class601.method11552(var13);
      class299 var14 = this.method6644(var1, var2, var3, var4);
      float var15 = this.method6649(var7 - var5, var3 - var1);
      int var16 = (int)Math.ceil((double)var15);
      this.field3360 = var16;
      if (!this.field3367.containsKey(var16)) {
         class311 var17 = new class311(var16);
         var17.method6934();
         this.field3367.put(var16, var17);
      }

      int var24 = var14.field3444 + var14.field3441 - 1;
      int var18 = var14.field3443 + var14.field3440 - 1;

      int var19;
      int var20;
      for(var19 = var14.field3441; var19 <= var24; ++var19) {
         for(var20 = var14.field3443; var20 <= var18; ++var20) {
            this.field3374[var19][var20].method6526(var16, (class311)this.field3367.get(var16), this.field3362, this.field3358, this.field3368, 0.725D);
         }
      }

      class225.method4941(var9, var10, var11, var12);
      class601.method11618(var13);
      var19 = (int)(64.0F * var15);
      var20 = this.field3366 * 4096 + var1;
      int var21 = this.field3357 * 4096 + var2;

      for(int var22 = var14.field3441; var22 < var14.field3441 + var14.field3444; ++var22) {
         for(int var23 = var14.field3443; var23 < var14.field3443 + var14.field3440; ++var23) {
            this.field3374[var22][var23].method6499(var5 + var19 * (this.field3374[var22][var23].field3348 * 64 - var20) / 64, var8 - var19 * (this.field3374[var22][var23].field3353 * 64 - var21 + 64) / 64, var19);
         }
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
      garbageValue = "747132647"
   )
   public final void method6675(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      class299 var14 = this.method6644(var1, var2, var3, var4);
      float var15 = this.method6649(var7 - var5, var3 - var1);
      int var16 = (int)(64.0F * var15);
      int var17 = this.field3366 * 4096 + var1;
      int var18 = this.field3357 * 4096 + var2;

      int var19;
      int var20;
      for(var19 = var14.field3441; var19 < var14.field3444 + var14.field3441; ++var19) {
         for(var20 = var14.field3443; var20 < var14.field3440 + var14.field3443; ++var20) {
            if (var13) {
               this.field3374[var19][var20].method6587();
            }

            this.field3374[var19][var20].method6604(var5 + var16 * (this.field3374[var19][var20].field3348 * 64 - var17) / 64, var8 - var16 * (this.field3374[var19][var20].field3353 * 64 - var18 + 64) / 64, var16, var9);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var19 = var14.field3441; var19 < var14.field3444 + var14.field3441; ++var19) {
            for(var20 = var14.field3443; var20 < var14.field3440 + var14.field3443; ++var20) {
               this.field3374[var19][var20].method6510(var10, var11, var12);
            }
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IIIILjava/util/HashSet;III)V",
      garbageValue = "-580543568"
   )
   public void method6642(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (this.field3364 != null) {
         this.field3364.method11750(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.field3365 == null) {
               this.method6648();
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var8.hasNext()) {
                     return;
                  }

                  int var9 = (Integer)var8.next();
                  var10 = (List)this.field3365.get(var9);
               } while(var10 == null);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  class307 var12 = (class307)var11.next();
                  int var13 = var3 * (var12.field3491.field4026 - this.field3366 * 4096) / (this.field3371 * 4096);
                  int var14 = var4 - (var12.field3491.field4025 - this.field3357 * 4096) * var4 / (this.field3372 * 64);
                  class601.method11624(var13 + var1, var14 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIIII)Ljava/util/List;",
      garbageValue = "2139315531"
   )
   public List method6650(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if (!this.field3361) {
         return var11;
      } else {
         class299 var12 = this.method6644(var1, var2, var3, var4);
         float var13 = this.method6649(var7, var3 - var1);
         int var14 = (int)(64.0F * var13);
         int var15 = this.field3366 * 4096 + var1;
         int var16 = this.field3357 * 4096 + var2;

         for(int var17 = var12.field3441; var17 < var12.field3444 + var12.field3441; ++var17) {
            for(int var18 = var12.field3443; var18 < var12.field3440 + var12.field3443; ++var18) {
               List var19 = this.field3374[var17][var18].method6624(var5 + var14 * (this.field3374[var17][var18].field3348 * 64 - var15) / 64, var8 + var6 - var14 * (this.field3374[var17][var18].field3353 * 64 - var16 + 64) / 64, var14, var9, var10);
               if (!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IIIII)Lln;",
      garbageValue = "-1901223218"
   )
   class299 method6644(int var1, int var2, int var3, int var4) {
      class299 var5 = new class299(this);
      int var6 = this.field3366 * 4096 + var1;
      int var7 = this.field3357 * 4096 + var2;
      int var8 = var3 + this.field3366 * 4096;
      int var9 = this.field3357 * 4096 + var4;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.field3444 = var12 - var10 + 1;
      var5.field3440 = var13 - var11 + 1;
      var5.field3441 = var10 - this.field3363.method6433();
      var5.field3443 = var11 - this.field3363.method6435();
      if (var5.field3441 < 0) {
         var5.field3444 += var5.field3441;
         var5.field3441 = 0;
      }

      if (var5.field3441 > this.field3374.length - var5.field3444) {
         var5.field3444 = this.field3374.length - var5.field3441;
      }

      if (var5.field3443 < 0) {
         var5.field3440 += var5.field3443;
         var5.field3443 = 0;
      }

      if (var5.field3443 > this.field3374[0].length - var5.field3440) {
         var5.field3440 = this.field3374[0].length - var5.field3443;
      }

      var5.field3444 = Math.min(var5.field3444, this.field3374.length);
      var5.field3440 = Math.min(var5.field3440, this.field3374[0].length);
      return var5;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1952494778"
   )
   public boolean method6645() {
      return this.field3361;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "2"
   )
   public int method6641() {
      return this.field3363.method6431();
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/util/HashMap;",
      garbageValue = "8"
   )
   public HashMap method6647() {
      this.method6648();
      return this.field3365;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "98"
   )
   void method6648() {
      if (this.field3365 == null) {
         this.field3365 = new HashMap();
      }

      this.field3365.clear();

      for(int var1 = 0; var1 < this.field3374.length; ++var1) {
         for(int var2 = 0; var2 < this.field3374[var1].length; ++var2) {
            List var3 = this.field3374[var1][var2].method6531();
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               class307 var5 = (class307)var4.next();
               if (var5.method6864()) {
                  int var6 = var5.vmethod6870();
                  if (!this.field3365.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.field3365.put(var6, var7);
                  } else {
                     List var8 = (List)this.field3365.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(III)F",
      garbageValue = "-529910021"
   )
   float method6649(int var1, int var2) {
      float var3 = (float)var1 / (float)var2;
      if (var3 > 8.0F) {
         return 8.0F;
      } else if (var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
      }
   }
}
