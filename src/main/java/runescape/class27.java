package runescape;

import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
public class class27 {
   @ObfuscatedName("db")
   static int[] field129 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   @ObfuscatedName("kh")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field130;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V",
      garbageValue = "2120412646"
   )
   public static void method412(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (var1 != null && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      class260.field3110 = var4;
      class127.field1577 = var3;

      try {
         class286.field3305 = System.getProperty("os.name");
      } catch (Exception var42) {
         class286.field3305 = "Unknown";
      }

      class260.field3106 = class286.field3305.toLowerCase();
      class82.field1203 = null;

      try {
         class82.field1203 = System.getProperty("jagex.userhome");
      } catch (Exception var41) {
      }

      if (class82.field1203 == null) {
         try {
            class82.field1203 = System.getProperty("user.home");
         } catch (Exception var40) {
         }
      }

      if (class82.field1203 != null) {
         class82.field1203 = class82.field1203 + "/";
      }

      try {
         if (class260.field3106.startsWith("win")) {
            if (class82.field1203 == null) {
               class82.field1203 = System.getenv("USERPROFILE");
            }
         } else if (class82.field1203 == null) {
            class82.field1203 = System.getenv("HOME");
         }

         if (class82.field1203 != null) {
            class82.field1203 = class82.field1203 + "/";
         }
      } catch (Exception var39) {
      }

      if (class82.field1203 == null) {
         class82.field1203 = "~/";
      }

      class597.field5981 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", class82.field1203, "/tmp/", ""};
      class385.field4411 = new String[]{".jagex_cache_" + class127.field1577, ".file_store_" + class127.field1577};
      int var19 = 0;

      label526:
      while(var19 < 4) {
         String var7 = var19 == 0 ? "" : "" + var19;
         class260.field3109 = new File(class82.field1203, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
         String var8 = null;
         String var9 = null;
         boolean var10 = false;
         File var48;
         if (class260.field3109.exists()) {
            class565 var11 = null;

            try {
               var11 = new class565(class260.field3109, "rw", 10000L);

               Buffer var12;
               int var13;
               for(var12 = new Buffer((int)var11.method10905()); var12.offset * 1216585693 < var12.array.length; var12.offset += -290410379 * var13) {
                  var13 = var11.method10894(var12.array, var12.offset * 1216585693, var12.array.length - var12.offset * 1216585693);
                  if (var13 == -1) {
                     throw new IOException();
                  }
               }

               var12.offset = 0;
               var13 = var12.method11196();
               if (var13 < 1 || var13 > 3) {
                  throw new IOException("" + var13);
               }

               int var14 = 0;
               if (var13 > 1) {
                  var14 = var12.method11196();
               }

               if (var13 <= 2) {
                  var8 = var12.method11361();
                  if (var14 == 1) {
                     var9 = var12.method11361();
                  }
               } else {
                  var8 = var12.method11209();
                  if (var14 == 1) {
                     var9 = var12.method11209();
                  }
               }
            } catch (Exception var44) {
               var44.printStackTrace();
            } finally {
               try {
                  if (var11 != null) {
                     var11.method10891();
                  }
               } catch (IOException var38) {
               }

            }

            if (var8 != null) {
               var48 = new File(var8);
               if (!var48.exists()) {
                  var8 = null;
               }
            }

            if (var8 != null) {
               var48 = new File(var8, "test.dat");
               if (!class9.method82(var48, true)) {
                  var8 = null;
               }
            }
         }

         if (var8 == null && var19 == 0) {
            label499:
            for(int var20 = 0; var20 < class385.field4411.length; ++var20) {
               for(int var21 = 0; var21 < class597.field5981.length; ++var21) {
                  File var22 = new File(class597.field5981[var21] + class385.field4411[var20] + File.separatorChar + var0 + File.separatorChar);
                  if (var22.exists() && class9.method82(new File(var22, "test.dat"), true)) {
                     var8 = var22.toString();
                     var10 = true;
                     break label499;
                  }
               }
            }
         }

         if (var8 == null) {
            var8 = class82.field1203 + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
            var10 = true;
         }

         if (var9 != null) {
            File var47 = new File(var9);
            var48 = new File(var8);

            try {
               File[] var50 = var47.listFiles();
               File[] var23 = var50;

               for(int var24 = 0; var24 < var23.length; ++var24) {
                  File var16 = var23[var24];
                  File var17 = new File(var48, var16.getName());
                  boolean var18 = var16.renameTo(var17);
                  if (!var18) {
                     throw new IOException();
                  }
               }
            } catch (Exception var43) {
               var43.printStackTrace();
            }

            var10 = true;
         }

         if (var10) {
            class570.method10977(new File(var8), (File)null);
         }

         File var6 = new File(var8);
         class23.field99 = var6;
         if (!class23.field99.exists()) {
            class23.field99.mkdirs();
         }

         File[] var46 = class23.field99.listFiles();
         if (var46 != null) {
            File[] var49 = var46;

            for(int var25 = 0; var25 < var49.length; ++var25) {
               File var26 = var49[var25];
               if (!class9.method82(var26, false)) {
                  ++var19;
                  continue label526;
               }
            }
         }
         break;
      }

      File var5 = class23.field99;
      class262.field3117 = var5;
      if (!class262.field3117.exists()) {
         throw new RuntimeException("");
      } else {
         class262.field3115 = true;
         class62.method2113();
         class260.field3111 = new class566(new class565(class198.method4392("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
         class260.field3108 = new class566(new class565(class198.method4392("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
         class260.field3107 = new class566[class260.field3110];

         for(int var27 = 0; var27 < class260.field3110; ++var27) {
            class260.field3107[var27] = new class566(new class565(class198.method4392("main_file_cache.idx" + var27), "rw", 1048576L), 6000, 0);
         }

      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)Lbp;",
      garbageValue = "1839988757"
   )
   static class44 method415() {
      return class44.field627 < class44.field626 ? class44.field624[++class44.field627 - 1] : null;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZB)I",
      garbageValue = "114"
   )
   static int method414(int var0, class55 var1, boolean var2) {
      class369 var3 = var2 ? class19.field81 : class141.field1714;
      if (var0 == 1600) {
         class46.field659[++class124.field1569 - 1] = var3.field4260;
         return 1;
      } else if (var0 == 1601) {
         class46.field659[++class124.field1569 - 1] = var3.field4170;
         return 1;
      } else {
         class366 var7;
         if (var0 == 1602) {
            if (var3.field4147 == 12) {
               var7 = var3.method7971();
               if (var7 != null) {
                  class46.field660[++class46.field658 - 1] = var7.method7650().method9329();
                  return 1;
               }
            }

            class46.field660[++class46.field658 - 1] = var3.field4211;
            return 1;
         } else if (var0 == 1603) {
            class46.field659[++class124.field1569 - 1] = var3.field4193;
            return 1;
         } else if (var0 == 1604) {
            class46.field659[++class124.field1569 - 1] = var3.field4172;
            return 1;
         } else if (var0 == 1605) {
            class46.field659[++class124.field1569 - 1] = var3.field4203;
            return 1;
         } else if (var0 == 1606) {
            class46.field659[++class124.field1569 - 1] = var3.field4200;
            return 1;
         } else if (var0 == 1607) {
            class46.field659[++class124.field1569 - 1] = var3.field4202;
            return 1;
         } else if (var0 == 1608) {
            class46.field659[++class124.field1569 - 1] = var3.field4235;
            return 1;
         } else if (var0 == 1609) {
            class46.field659[++class124.field1569 - 1] = var3.field4179;
            return 1;
         } else if (var0 == 1610) {
            class46.field659[++class124.field1569 - 1] = var3.field4180;
            return 1;
         } else if (var0 == 1611) {
            class46.field659[++class124.field1569 - 1] = var3.field4173;
            return 1;
         } else if (var0 == 1612) {
            class46.field659[++class124.field1569 - 1] = var3.field4174;
            return 1;
         } else if (var0 == 1613) {
            class46.field659[++class124.field1569 - 1] = var3.field4178.vmethod11658();
            return 1;
         } else if (var0 == 1614) {
            class46.field659[++class124.field1569 - 1] = var3.field4208 ? 1 : 0;
            return 1;
         } else {
            class360 var4;
            if (var0 == 1617) {
               var4 = var3.method8088();
               class46.field659[++class124.field1569 - 1] = var4 != null ? var4.field4052 : 0;
            }

            if (var0 == 1618) {
               var4 = var3.method8088();
               class46.field659[++class124.field1569 - 1] = var4 != null ? var4.field4053 : 0;
               return 1;
            } else if (var0 == 1619) {
               var7 = var3.method7971();
               class46.field660[++class46.field658 - 1] = var7 != null ? var7.method7651().method9329() : "";
               return 1;
            } else if (var0 == 1620) {
               var4 = var3.method8088();
               class46.field659[++class124.field1569 - 1] = var4 != null ? var4.field4055 : 0;
               return 1;
            } else if (var0 == 1621) {
               var7 = var3.method7971();
               class46.field659[++class124.field1569 - 1] = var7 != null ? var7.method7777() : 0;
               return 1;
            } else if (var0 == 1622) {
               var7 = var3.method7971();
               class46.field659[++class124.field1569 - 1] = var7 != null ? var7.method7662() : 0;
               return 1;
            } else if (var0 == 1623) {
               var7 = var3.method7971();
               class46.field659[++class124.field1569 - 1] = var7 != null ? var7.method7663() : 0;
               return 1;
            } else if (var0 == 1624) {
               var7 = var3.method7971();
               class46.field659[++class124.field1569 - 1] = var7 != null && var7.method7839() ? 1 : 0;
               return 1;
            } else if (var0 != 1625) {
               if (var0 == 1626) {
                  var7 = var3.method7971();
                  class46.field660[++class46.field658 - 1] = var7 != null ? var7.method7796().method9518() : "";
                  return 1;
               } else if (var0 == 1627) {
                  var7 = var3.method7971();
                  int var5 = var7 != null ? var7.method7857() : 0;
                  int var6 = var7 != null ? var7.method7656() : 0;
                  class46.field659[++class124.field1569 - 1] = Math.min(var5, var6);
                  class46.field659[++class124.field1569 - 1] = Math.max(var5, var6);
                  return 1;
               } else if (var0 == 1628) {
                  var7 = var3.method7971();
                  class46.field659[++class124.field1569 - 1] = var7 != null ? var7.method7656() : 0;
                  return 1;
               } else if (var0 == 1629) {
                  var7 = var3.method7971();
                  class46.field659[++class124.field1569 - 1] = var7 != null ? var7.method7666() : 0;
                  return 1;
               } else if (var0 == 1630) {
                  var7 = var3.method7971();
                  class46.field659[++class124.field1569 - 1] = var7 != null ? var7.method7783() : 0;
                  return 1;
               } else if (var0 == 1631) {
                  var7 = var3.method7971();
                  class46.field659[++class124.field1569 - 1] = var7 != null ? var7.method7773() : 0;
                  return 1;
               } else if (var0 == 1632) {
                  var7 = var3.method7971();
                  class46.field659[++class124.field1569 - 1] = var7 != null ? var7.method7689() : 0;
                  return 1;
               } else {
                  class28 var8;
                  if (var0 == 1633) {
                     var8 = var3.method7973();
                     class46.field659[class124.field1569 - 1] = var8 != null ? var8.method419(class46.field659[class124.field1569 - 1]) : 0;
                     return 1;
                  } else if (var0 == 1634) {
                     var8 = var3.method7973();
                     class46.field659[class124.field1569 - 1] = var8 != null ? var8.method420((char)class46.field659[class124.field1569 - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var7 = var3.method7971();
               class46.field659[++class124.field1569 - 1] = var7 != null && var7.method7654() ? 1 : 0;
               return 1;
            }
         }
      }
   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1634465290"
   )
   static final void method409() {
      int var0;
      int var1;
      int var2;
      if (!client.field553) {
         var0 = class356.method7416(class25.field114);
         var1 = class356.method7416(class215.field2487);
         var2 = class413.method8434(class333.field3836, var0, var1, class333.field3836.field1170) - class421.field5046;
         class302.method6829(var0, var2, var1);
      } else if (client.field589 != null) {
         class187.field2052 = client.field589.vmethod10615();
         class10.field46 = client.field589.vmethod10609();
         if (client.field588) {
            class174.field1940 = client.field589.vmethod10614();
         } else {
            class174.field1940 = class413.method8434(class333.field3836, class187.field2052, class10.field46, class333.field3836.field1170) - client.field589.vmethod10614();
         }

         client.field589.method10620();
      }

      if (!client.field587) {
         var0 = class356.method7416(class169.field1909);
         var1 = class356.method7416(class227.field2654);
         var2 = class413.method8434(class333.field3836, var0, var1, class333.field3836.field1170) - class503.field5413;
         int var3 = var0 - class187.field2052;
         int var4 = var2 - class174.field1940;
         int var5 = var1 - class10.field46;
         int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5));
         int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047;
         int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047;
         class171.method4066(var7, var8);
      } else {
         if (client.field477 != null) {
            class401.field4855 = client.field477.method10607();
            class401.field4855 = Math.min(Math.max(class401.field4855, 128), 383);
            client.field477.method10620();
         }

         if (client.field514 != null) {
            class302.field3460 = client.field514.method10607() & 2047;
            client.field514.method10620();
         }
      }

   }

   @ObfuscatedName("kn")
   @ObfuscatedSignature(
      descriptor = "(IIIIIB)V",
      garbageValue = "-125"
   )
   static final void method413(int var0, int var1, int var2, int var3, int var4) {
      class230 var5 = class333.field3836.field1159;
      long var6 = var5.method5127(var0, var1, var2);
      int var8;
      int var9;
      int var10;
      int var11;
      int var15;
      int var27;
      if (var6 != 0L) {
         var8 = var5.method5169(var0, var1, var2, var6);
         var9 = var8 >> 6 & 3;
         var10 = var8 & 31;
         var11 = var3;
         boolean var13 = var6 != 0L;
         if (var13) {
            boolean var14 = (int)(var6 >>> 19 & 1L) == 1;
            var13 = !var14;
         }

         if (var13) {
            var11 = var4;
         }

         int[] var20 = class245.field2992.field6018;
         var27 = var1 * 4 + (103 - var2) * 2048 + 24624;
         var15 = class537.method10539(var6);
         class212 var16 = class433.method8669(var15);
         if (var16.field2343 != -1) {
            class604 var17 = class34.field202[var16.field2343];
            if (var17 != null) {
               int var18 = (var16.field2329 * 4 - var17.field6007) / 2;
               int var19 = (var16.field2330 * 4 - var17.field6010) / 2;
               var17.method11667(var18 + var1 * 4 + 48, var19 + (104 - var2 - var16.field2330) * 4 + 48);
            }
         } else {
            if (var10 == 0 || var10 == 2) {
               if (var9 == 0) {
                  var20[var27] = var11;
                  var20[var27 + 512] = var11;
                  var20[var27 + 1024] = var11;
                  var20[var27 + 1536] = var11;
               } else if (var9 == 1) {
                  var20[var27] = var11;
                  var20[var27 + 1] = var11;
                  var20[var27 + 2] = var11;
                  var20[var27 + 3] = var11;
               } else if (var9 == 2) {
                  var20[var27 + 3] = var11;
                  var20[var27 + 512 + 3] = var11;
                  var20[var27 + 1024 + 3] = var11;
                  var20[var27 + 1536 + 3] = var11;
               } else if (var9 == 3) {
                  var20[var27 + 1536] = var11;
                  var20[var27 + 1536 + 1] = var11;
                  var20[var27 + 1536 + 2] = var11;
                  var20[var27 + 1536 + 3] = var11;
               }
            }

            if (var10 == 3) {
               if (var9 == 0) {
                  var20[var27] = var11;
               } else if (var9 == 1) {
                  var20[var27 + 3] = var11;
               } else if (var9 == 2) {
                  var20[var27 + 1536 + 3] = var11;
               } else if (var9 == 3) {
                  var20[var27 + 1536] = var11;
               }
            }

            if (var10 == 2) {
               if (var9 == 3) {
                  var20[var27] = var11;
                  var20[var27 + 512] = var11;
                  var20[var27 + 1024] = var11;
                  var20[var27 + 1536] = var11;
               } else if (var9 == 0) {
                  var20[var27] = var11;
                  var20[var27 + 1] = var11;
                  var20[var27 + 2] = var11;
                  var20[var27 + 3] = var11;
               } else if (var9 == 1) {
                  var20[var27 + 3] = var11;
                  var20[var27 + 512 + 3] = var11;
                  var20[var27 + 1024 + 3] = var11;
                  var20[var27 + 1536 + 3] = var11;
               } else if (var9 == 2) {
                  var20[var27 + 1536] = var11;
                  var20[var27 + 1536 + 1] = var11;
                  var20[var27 + 1536 + 2] = var11;
                  var20[var27 + 1536 + 3] = var11;
               }
            }
         }
      }

      var6 = var5.method5341(var0, var1, var2);
      if (var6 != 0L) {
         var8 = var5.method5169(var0, var1, var2, var6);
         var9 = var8 >> 6 & 3;
         var10 = var8 & 31;
         var11 = class537.method10539(var6);
         class212 var21 = class433.method8669(var11);
         if (var21.field2343 != -1) {
            class604 var29 = class34.field202[var21.field2343];
            if (var29 != null) {
               var27 = (var21.field2329 * 4 - var29.field6007) / 2;
               var15 = (var21.field2330 * 4 - var29.field6010) / 2;
               var29.method11667(var27 + var1 * 4 + 48, (104 - var2 - var21.field2330) * 4 + var15 + 48);
            }
         } else if (var10 == 9) {
            int var26 = 15658734;
            boolean var28 = 0L != var6;
            if (var28) {
               boolean var22 = (int)(var6 >>> 19 & 1L) == 1;
               var28 = !var22;
            }

            if (var28) {
               var26 = 15597568;
            }

            int[] var23 = class245.field2992.field6018;
            int var30 = var1 * 4 + (103 - var2) * 2048 + 24624;
            if (var9 != 0 && var9 != 2) {
               var23[var30] = var26;
               var23[var30 + 1 + 512] = var26;
               var23[var30 + 1024 + 2] = var26;
               var23[var30 + 1536 + 3] = var26;
            } else {
               var23[var30 + 1536] = var26;
               var23[var30 + 1 + 1024] = var26;
               var23[var30 + 512 + 2] = var26;
               var23[var30 + 3] = var26;
            }
         }
      }

      var6 = var5.method5215(var0, var1, var2);
      if (0L != var6) {
         var8 = class537.method10539(var6);
         class212 var24 = class433.method8669(var8);
         if (var24.field2343 != -1) {
            class604 var25 = class34.field202[var24.field2343];
            if (var25 != null) {
               var11 = (var24.field2329 * 4 - var25.field6007) / 2;
               int var12 = (var24.field2330 * 4 - var25.field6010) / 2;
               var25.method11667(var11 + var1 * 4 + 48, var12 + (104 - var2 - var24.field2330) * 4 + 48);
            }
         }
      }

   }
}
