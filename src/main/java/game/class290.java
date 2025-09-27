package game;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
public class class290 {
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lmi;"
   )
   public static class318 field3345 = new class318(37748736, 256);
   @ObfuscatedName("aq")
   final HashMap field3347;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1647872553
   )
   int field3348;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1837804119
   )
   int field3353;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lkv;"
   )
   class284 field3342;
   @ObfuscatedName("au")
   LinkedList field3355;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1669388793
   )
   int field3351;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1039974107
   )
   int field3352;
   @ObfuscatedName("am")
   List field3350;
   @ObfuscatedName("an")
   HashMap field3354;

   class290(int var1, int var2, int var3, HashMap var4) {
      this.field3348 = var1;
      this.field3353 = var2;
      this.field3355 = new LinkedList();
      this.field3350 = new LinkedList();
      this.field3354 = new HashMap();
      this.field3351 = var3 | -16777216;
      this.field3347 = var4;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IIIS)V",
      garbageValue = "10381"
   )
   void method6499(int var1, int var2, int var3) {
      class605 var4 = class89.method2878(this.field3348, this.field3353, this.field3352);
      if (var4 != null) {
         if (var3 == this.field3352 * 64) {
            var4.method11704(var1, var2);
         } else {
            var4.method11733(var1, var2, var3, var3);
         }

      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lkv;Ljava/util/List;I)V",
      garbageValue = "-913839692"
   )
   void method6500(class284 var1, List var2) {
      this.field3354.clear();
      this.field3342 = var1;
      this.method6582(var2);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
      garbageValue = "114795689"
   )
   void method6586(HashSet var1, List var2) {
      this.field3354.clear();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         class292 var4 = (class292)var3.next();
         if (var4.method6792() == this.field3348 && var4.method6793() == this.field3353) {
            this.field3355.add(var4);
         }
      }

      this.method6582(var2);
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IIIILlv;B)V",
      garbageValue = "-43"
   )
   void method6502(int var1, int var2, int var3, int var4, class298 var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         label75:
         for(int var7 = var2; var7 < var2 + var4; ++var7) {
            for(int var8 = 0; var8 < var5.field3428; ++var8) {
               class300[] var9 = var5.field3437[var8][var6][var7];
               if (var9 != null && var9.length != 0) {
                  class300[] var10 = var9;

                  for(int var11 = 0; var11 < var10.length; ++var11) {
                     class212 var13;
                     boolean var14;
                     label66: {
                        class300 var12 = var10[var11];
                        var13 = class433.method8669(var12.field3448);
                        if (var13.field2355 != null) {
                           int[] var15 = var13.field2355;

                           for(int var16 = 0; var16 < var15.length; ++var16) {
                              int var17 = var15[var16];
                              class212 var18 = class433.method8669(var17);
                              if (var18.field2342 != -1) {
                                 var14 = true;
                                 break label66;
                              }
                           }
                        } else if (var13.field2342 != -1) {
                           var14 = true;
                           break label66;
                        }

                        var14 = false;
                     }

                     if (var14) {
                        this.method6533(var13, var8, var6, var7, var5);
                        continue label75;
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lib;IIILlv;B)V",
      garbageValue = "-83"
   )
   void method6533(class212 var1, int var2, int var3, int var4, class298 var5) {
      class356 var6 = new class356(var2, var3 + this.field3348 * 64, this.field3353 * 64 + var4);
      class356 var7 = null;
      if (this.field3342 != null) {
         var7 = new class356(this.field3342.field3425 + var2, var3 + this.field3342.field3433 * 64, var4 + this.field3342.field3426 * 64);
      } else {
         class292 var8 = (class292)var5;
         var7 = new class356(var2 + var8.field3425, var8.field3433 * 64 + var3 + var8.method6688() * 8, var4 + var8.field3426 * 64 + var8.method6682() * 8);
      }

      class184 var9;
      Object var10;
      if (var1.field2355 != null) {
         var10 = new class287(var7, var6, var1.field2321, this);
      } else {
         var9 = class198.method4395(var1.field2342);
         var10 = new class295(var7, var6, var9.field1992, this.method6529(var9));
      }

      var9 = class198.method4395(((class307)var10).vmethod6870());
      if (var9.field1998) {
         this.field3354.put(new class356(0, var3, var4), var10);
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2068428227"
   )
   void method6587() {
      Iterator var1 = this.field3354.values().iterator();

      while(var1.hasNext()) {
         class307 var2 = (class307)var1.next();
         if (var2 instanceof class287) {
            ((class287)var2).method6378();
         }
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/List;I)V",
      garbageValue = "1497564254"
   )
   void method6582(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         class295 var3 = (class295)var2.next();
         if (class198.method4395(var3.field3400).field1998 && var3.field3491.field4026 >> 6 == this.field3348 && var3.field3491.field4025 >> 6 == this.field3353) {
            class295 var4 = new class295(var3.field3491, var3.field3491, var3.field3400, this.method6528(var3.field3400));
            this.field3350.add(var4);
         }
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "369220646"
   )
   void method6569() {
      if (this.field3342 != null) {
         this.field3342.method6794();
      } else {
         Iterator var1 = this.field3355.iterator();

         while(var1.hasNext()) {
            class292 var2 = (class292)var1.next();
            var2.method6794();
         }
      }

   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Lpx;B)Z",
      garbageValue = "51"
   )
   boolean method6507(class412 var1) {
      this.field3354.clear();
      if (this.field3342 != null) {
         this.field3342.method6815(var1);
         if (this.field3342.method6785()) {
            this.method6502(0, 0, 64, 64, this.field3342);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         Iterator var3;
         class292 var4;
         for(var3 = this.field3355.iterator(); var3.hasNext(); var2 &= var4.method6785()) {
            var4 = (class292)var3.next();
            var4.method6815(var1);
         }

         if (var2) {
            var3 = this.field3355.iterator();

            while(var3.hasNext()) {
               var4 = (class292)var3.next();
               this.method6502(var4.method6686() * 8, var4.method6687() * 8, 8, 8, var4);
            }
         }

         return var2;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(ILlt;[Lxc;Lpx;Lpx;D)V"
   )
   void method6526(int var1, class311 var2, class604[] var3, class412 var4, class412 var5, double var6) {
      this.field3352 = var1;
      if (this.field3342 != null || !this.field3355.isEmpty()) {
         if (class89.method2878(this.field3348, this.field3353, var1) == null) {
            if (class225.method4932() != var6) {
               class225.method4929(var6);
            }

            boolean var8 = true;
            var8 &= this.method6507(var4);
            int var10;
            if (this.field3342 != null) {
               var10 = this.field3342.field3432;
            } else {
               var10 = ((class298)this.field3355.getFirst()).field3432;
            }

            var8 &= var5.method8411(var10);
            if (var8) {
               byte[] var9 = var5.method8425(var10);
               class301 var11 = class174.method4102(var9);
               class605 var12 = new class605(this.field3352 * 64, this.field3352 * 64);
               var12.method11688();
               if (this.field3342 != null) {
                  this.method6513(var2, var3, var11);
               } else {
                  this.method6512(var2, var3, var11);
               }

               class30.method467(var12, this.field3348, this.field3353, this.field3352);
               this.method6569();
            }
         }
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(IIILjava/util/HashSet;I)V",
      garbageValue = "-450173939"
   )
   void method6604(int var1, int var2, int var3, HashSet var4) {
      if (var4 == null) {
         var4 = new HashSet();
      }

      this.method6519(var1, var2, var4, var3);
      this.method6525(var1, var2, var4, var3);
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;III)V",
      garbageValue = "-1536591379"
   )
   void method6510(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field3354.values().iterator();

      while(var4.hasNext()) {
         class307 var5 = (class307)var4.next();
         if (var5.method6864()) {
            int var6 = var5.vmethod6870();
            if (var1.contains(var6)) {
               class184 var7 = class198.method4395(var6);
               this.method6609(var7, var5.field3490, var5.field3489, var2, var3);
            }
         }
      }

      this.method6520(var1, var2, var3);
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(Llt;[Lxc;Llr;I)V",
      garbageValue = "1324955520"
   )
   void method6513(class311 var1, class604[] var2, class301 var3) {
      int var4;
      int var5;
      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.method6514(var4, var5, this.field3342, var1, var3);
            this.method6515(var4, var5, this.field3342, var1);
         }
      }

      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.method6547(var4, var5, this.field3342, var1, var2);
         }
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(Llt;[Lxc;Llr;B)V",
      garbageValue = "92"
   )
   void method6512(class311 var1, class604[] var2, class301 var3) {
      Iterator var4 = this.field3355.iterator();

      class292 var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (class292)var4.next();

         for(var6 = var5.method6686() * 8; var6 < var5.method6686() * 8 + 8; ++var6) {
            for(var7 = var5.method6687() * 8; var7 < var5.method6687() * 8 + 8; ++var7) {
               this.method6514(var6, var7, var5, var1, var3);
               this.method6515(var6, var7, var5, var1);
            }
         }
      }

      var4 = this.field3355.iterator();

      while(var4.hasNext()) {
         var5 = (class292)var4.next();

         for(var6 = var5.method6686() * 8; var6 < var5.method6686() * 8 + 8; ++var6) {
            for(var7 = var5.method6687() * 8; var7 < var5.method6687() * 8 + 8; ++var7) {
               this.method6547(var6, var7, var5, var1, var2);
            }
         }
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IILlv;Llt;[Lxc;B)V",
      garbageValue = "-81"
   )
   void method6547(int var1, int var2, class298 var3, class311 var4, class604[] var5) {
      this.method6518(var1, var2, var3);
      this.method6517(var1, var2, var3, var5);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IILlv;Llt;Llr;I)V",
      garbageValue = "327141635"
   )
   void method6514(int var1, int var2, class298 var3, class311 var4, class301 var5) {
      int var6 = var3.field3430[0][var1][var2] - 1;
      int var7 = var3.field3434[0][var1][var2] - 1;
      if (var6 == -1 && var7 == -1) {
         class601.method11558(this.field3352 * var1, this.field3352 * (63 - var2), this.field3352, this.field3352, this.field3351);
      }

      int var8 = 16711935;
      if (var7 != -1) {
         var8 = class87.method2829(var7, this.field3351);
      }

      if (var7 > -1 && var3.field3435[0][var1][var2] == 0) {
         class601.method11558(this.field3352 * var1, this.field3352 * (63 - var2), this.field3352, this.field3352, var8);
      } else {
         int var9 = this.method6516(var1, var2, var3, var5);
         if (var7 == -1) {
            class601.method11558(this.field3352 * var1, this.field3352 * (63 - var2), this.field3352, this.field3352, var9);
         } else {
            var4.method6925(this.field3352 * var1, this.field3352 * (63 - var2), var9, var8, this.field3352, this.field3352, var3.field3435[0][var1][var2], var3.field3436[0][var1][var2]);
         }
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(IILlv;Llt;B)V",
      garbageValue = "77"
   )
   void method6515(int var1, int var2, class298 var3, class311 var4) {
      for(int var5 = 1; var5 < var3.field3428; ++var5) {
         int var6 = var3.field3434[var5][var1][var2] - 1;
         if (var6 > -1) {
            int var7 = class87.method2829(var6, this.field3351);
            if (var3.field3435[var5][var1][var2] == 0) {
               class601.method11558(this.field3352 * var1, this.field3352 * (63 - var2), this.field3352, this.field3352, var7);
            } else {
               var4.method6925(this.field3352 * var1, this.field3352 * (63 - var2), 0, var7, this.field3352, this.field3352, var3.field3435[var5][var1][var2], var3.field3436[var5][var1][var2]);
            }
         }
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IILlv;Llr;I)I",
      garbageValue = "1370959071"
   )
   int method6516(int var1, int var2, class298 var3, class301 var4) {
      return var3.field3430[0][var1][var2] == 0 ? this.field3351 : var4.method6822(var1, var2);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IILlv;[Lxc;I)V",
      garbageValue = "258714918"
   )
   void method6517(int var1, int var2, class298 var3, class604[] var4) {
      for(int var5 = 0; var5 < var3.field3428; ++var5) {
         class300[] var6 = var3.field3437[var5][var1][var2];
         if (var6 != null && var6.length != 0) {
            class300[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               class300 var9 = var7[var8];
               int var11;
               if (!class365.method7600(var9.field3446)) {
                  var11 = var9.field3446;
                  boolean var10 = var11 == class378.field4344.field4364;
                  if (!var10) {
                     continue;
                  }
               }

               class212 var12 = class433.method8669(var9.field3448);
               if (var12.field2343 != -1) {
                  var11 = var9.field3445 != 1 && var9.field3445 != 3 ? var12.field2330 : var12.field2329;
                  var4[var12.field2343].method11678(this.field3352 * var1, this.field3352 * (64 - var11 - var2), this.field3352 * 2, this.field3352 * 2);
               }
            }
         }
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(IILlv;B)V",
      garbageValue = "-23"
   )
   void method6518(int var1, int var2, class298 var3) {
      for(int var4 = 0; var4 < var3.field3428; ++var4) {
         class300[] var5 = var3.field3437[var4][var1][var2];
         if (var5 != null && var5.length != 0) {
            class300[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               class300 var8 = var6[var7];
               int var10 = var8.field3446;
               boolean var9 = var10 >= class378.field4365.field4364 && var10 <= class378.field4355.field4364 || var10 == class378.field4360.field4364;
               if (var9) {
                  class212 var11 = class433.method8669(var8.field3448);
                  int var12 = var11.field2308 != 0 ? -3407872 : -3355444;
                  if (var8.field3446 == class378.field4365.field4364) {
                     this.method6532(var1, var2, var8.field3445, var12);
                  }

                  if (var8.field3446 == class378.field4345.field4364) {
                     this.method6532(var1, var2, var8.field3445, -3355444);
                     this.method6532(var1, var2, var8.field3445 + 1, var12);
                  }

                  if (var8.field3446 == class378.field4355.field4364) {
                     if (var8.field3445 == 0) {
                        class601.method11561(this.field3352 * var1, this.field3352 * (63 - var2), 1, var12);
                     }

                     if (var8.field3445 == 1) {
                        class601.method11561(this.field3352 * var1 + this.field3352 - 1, this.field3352 * (63 - var2), 1, var12);
                     }

                     if (var8.field3445 == 2) {
                        class601.method11561(this.field3352 * var1 + this.field3352 - 1, this.field3352 * (63 - var2) + this.field3352 - 1, 1, var12);
                     }

                     if (var8.field3445 == 3) {
                        class601.method11561(this.field3352 * var1, this.field3352 * (63 - var2) + this.field3352 - 1, 1, var12);
                     }
                  }

                  if (var8.field3446 == class378.field4360.field4364) {
                     int var13 = var8.field3445 % 2;
                     int var14;
                     if (var13 == 0) {
                        for(var14 = 0; var14 < this.field3352; ++var14) {
                           class601.method11561(var14 + this.field3352 * var1, (64 - var2) * this.field3352 - 1 - var14, 1, var12);
                        }
                     } else {
                        for(var14 = 0; var14 < this.field3352; ++var14) {
                           class601.method11561(var14 + this.field3352 * var1, var14 + this.field3352 * (63 - var2), 1, var12);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IILjava/util/HashSet;II)V",
      garbageValue = "-228071469"
   )
   void method6519(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.field3354.entrySet().iterator();

      while(var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         class356 var9 = (class356)var8.getKey();
         int var10 = (int)(var5 * (float)var9.field4026 + (float)var1 - var6);
         int var11 = (int)((float)(var2 + var4) - (float)var9.field4025 * var5 - var6);
         class307 var12 = (class307)var8.getValue();
         if (var12 != null && var12.method6864()) {
            var12.field3490 = var10;
            var12.field3489 = var11;
            class184 var13 = class198.method4395(var12.vmethod6870());
            if (!var3.contains(var13.method4190())) {
               this.method6522(var12, var10, var11, var5);
            }
         }
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;III)V",
      garbageValue = "-878632112"
   )
   void method6520(HashSet var1, int var2, int var3) {
      Iterator var4 = this.field3350.iterator();

      while(var4.hasNext()) {
         class307 var5 = (class307)var4.next();
         if (var5.method6864()) {
            class184 var6 = class198.method4395(var5.vmethod6870());
            if (var6 != null && var1.contains(var6.method4190())) {
               this.method6609(var6, var5.field3490, var5.field3489, var2, var3);
            }
         }
      }

   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(Lha;IIIII)V",
      garbageValue = "1043499028"
   )
   void method6609(class184 var1, int var2, int var3, int var4, int var5) {
      class605 var6 = var1.method4184(false);
      if (var6 != null) {
         var6.method11705(var2 - var6.field6019 / 2, var3 - var6.field6020 / 2);
         if (var4 % var5 < var5 / 2) {
            class601.method11624(var2, var3, 15, 16776960, 128);
            class601.method11624(var2, var3, 7, 16777215, 256);
         }

      }
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(Lle;IIFI)V",
      garbageValue = "-1411772612"
   )
   void method6522(class307 var1, int var2, int var3, float var4) {
      class184 var5 = class198.method4395(var1.vmethod6870());
      this.method6523(var5, var2, var3);
      this.method6524(var1, var5, var2, var3, var4);
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(Lha;IIB)V",
      garbageValue = "-114"
   )
   void method6523(class184 var1, int var2, int var3) {
      class605 var4 = var1.method4184(false);
      if (var4 != null) {
         int var5 = this.method6508(var4, var1.field2011);
         int var6 = this.method6527(var4, var1.field1999);
         var4.method11705(var5 + var2, var3 + var6);
      }

   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(Lle;Lha;IIFI)V",
      garbageValue = "-693842376"
   )
   void method6524(class307 var1, class184 var2, int var3, int var4, float var5) {
      class302 var6 = var1.vmethod6866();
      if (var6 != null) {
         if (var6.field3457.method6364(var5)) {
            class461 var7 = (class461)this.field3347.get(var6.field3457);
            var7.method9424(var6.field3458, var3 - var6.field3456 / 2, var4, var6.field3456, var6.field3459, -16777216 | var2.field1996, 0, 1, 0, var7.field5251 / 2);
         }
      }
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(IILjava/util/HashSet;II)V",
      garbageValue = "480783361"
   )
   void method6525(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      Iterator var6 = this.field3350.iterator();

      while(var6.hasNext()) {
         class307 var7 = (class307)var6.next();
         if (var7.method6864()) {
            int var8 = var7.field3491.field4026 % 64;
            int var9 = var7.field3491.field4025 % 64;
            var7.field3490 = (int)((float)var1 + var5 * (float)var8);
            var7.field3489 = (int)((float)var2 + var5 * (float)(63 - var9));
            if (!var3.contains(var7.vmethod6870())) {
               this.method6522(var7, var7.field3490, var7.field3489, var5);
            }
         }
      }

   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(Lxt;Lhp;I)I",
      garbageValue = "1282169512"
   )
   int method6508(class605 var1, class193 var2) {
      switch(var2.field2090) {
      case 0:
         return -var1.field6019 / 2;
      case 2:
         return 0;
      default:
         return -var1.field6019;
      }
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(Lxt;Lhx;I)I",
      garbageValue = "-1045248138"
   )
   int method6527(class605 var1, class198 var2) {
      switch(var2.field2166) {
      case 1:
         return 0;
      case 2:
         return -var1.field6020 / 2;
      default:
         return -var1.field6020;
      }
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(II)Lls;",
      garbageValue = "-1612211434"
   )
   class302 method6528(int var1) {
      class184 var2 = class198.method4395(var1);
      return this.method6529(var2);
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(Lha;B)Lls;",
      garbageValue = "0"
   )
   class302 method6529(class184 var1) {
      if (var1.field1995 != null && this.field3347 != null && this.field3347.get(class286.field3298) != null) {
         class286 var2 = class286.method6366(var1.field2006);
         if (var2 == null) {
            return null;
         } else {
            class461 var3 = (class461)this.field3347.get(var2);
            if (var3 == null) {
               return null;
            } else {
               int var4 = var3.method9418(var1.field1995, 1000000);
               String[] var5 = new String[var4];
               var3.method9416(var1.field1995, (int[])null, var5);
               int var6 = var5.length * var3.field5251 / 2;
               int var7 = 0;
               String[] var8 = var5;

               for(int var9 = 0; var9 < var8.length; ++var9) {
                  String var10 = var8[var9];
                  int var11 = var3.method9415(var10);
                  if (var11 > var7) {
                     var7 = var11;
                  }
               }

               return new class302(var1.field1995, var7, var6, var2);
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)Ljava/util/List;",
      garbageValue = "1161148088"
   )
   List method6624(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var3 + var1 && var5 < var3 + var2) {
            Iterator var7 = this.field3354.values().iterator();

            class307 var8;
            while(var7.hasNext()) {
               var8 = (class307)var7.next();
               if (var8.method6864() && var8.method6867(var4, var5)) {
                  var6.add(var8);
               }
            }

            var7 = this.field3350.iterator();

            while(var7.hasNext()) {
               var8 = (class307)var7.next();
               if (var8.method6864() && var8.method6867(var4, var5)) {
                  var6.add(var8);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/List;",
      garbageValue = "656078045"
   )
   List method6531() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.field3350);
      var1.addAll(this.field3354.values());
      return var1;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "916214448"
   )
   void method6532(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (var3 == 0) {
         class601.method11566(this.field3352 * var1, this.field3352 * (63 - var2), this.field3352, var4);
      }

      if (var3 == 1) {
         class601.method11561(this.field3352 * var1, this.field3352 * (63 - var2), this.field3352, var4);
      }

      if (var3 == 2) {
         class601.method11566(this.field3352 + this.field3352 * var1 - 1, this.field3352 * (63 - var2), this.field3352, var4);
      }

      if (var3 == 3) {
         class601.method11561(this.field3352 * var1, this.field3352 * (63 - var2) + this.field3352 - 1, this.field3352, var4);
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "([F[II)V",
      garbageValue = "1670836171"
   )
   public static void method6637(float[] var0, int[] var1) {
      class410.method8328(var0, var1, 0, var0.length - 1);
   }
}
