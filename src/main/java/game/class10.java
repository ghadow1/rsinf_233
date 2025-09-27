package game;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ai")
public class class10 {
   @ObfuscatedName("mp")
   @ObfuscatedGetter(
      intValue = -525624951
   )
   static int field46;
   @ObfuscatedName("op")
   @ObfuscatedSignature(
      descriptor = "Ltf;"
   )
   static class511 field50;
   @ObfuscatedName("af")
   final HttpsURLConnection field48;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lsv;"
   )
   final class484 field41;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lau;"
   )
   final class9 field43;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Luz;"
   )
   class532 field42;
   @ObfuscatedName("ap")
   boolean field45;
   @ObfuscatedName("aq")
   boolean field49;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 31347639
   )
   int field47;

   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URL;Lau;Lsv;Z)V"
   )
   public class10(URL var1, class9 var2, class484 var3, boolean var4) throws IOException {
      this.field45 = false;
      this.field49 = false;
      this.field47 = 300000;
      if (!var2.method80()) {
         throw new UnsupportedEncodingException("Unsupported request method used " + var2.method69());
      } else {
         this.field48 = (HttpsURLConnection)var1.openConnection();
         if (!var4) {
            this.field48.setSSLSocketFactory(class15.method201());
         }

         this.field43 = var2;
         this.field41 = var3 != null ? var3 : new class484();
      }
   }

   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URL;Lau;Z)V"
   )
   public class10(URL var1, class9 var2, boolean var3) throws IOException {
      this(var1, var2, new class484(), var3);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Lsv;",
      garbageValue = "0"
   )
   public class484 method105() {
      return this.field41;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Luz;I)V",
      garbageValue = "1539917845"
   )
   public void method87(class532 var1) {
      if (!this.field45) {
         if (var1 == null) {
            this.field41.method9742("Content-Type");
            this.field42 = null;
         } else {
            this.field42 = var1;
            if (this.field42.vmethod10505() != null) {
               this.field41.method9745(this.field42.vmethod10505());
            } else {
               this.field41.method9748();
            }

         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "14"
   )
   void method88() throws ProtocolException {
      if (!this.field45) {
         this.field48.setRequestMethod(this.field43.method69());
         this.field41.method9739(this.field48);
         if (this.field43.method70() && this.field42 != null) {
            this.field48.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();

            try {
               var1.write(this.field42.vmethod10513());
               var1.writeTo(this.field48.getOutputStream());
            } catch (IOException var11) {
               var11.printStackTrace();
            } finally {
               try {
                  var1.close();
               } catch (IOException var10) {
                  var10.printStackTrace();
               }

            }
         }

         this.field48.setConnectTimeout(this.field47);
         this.field48.setInstanceFollowRedirects(this.field49);
         this.field45 = true;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-397843239"
   )
   boolean method106() throws IOException {
      if (!this.field45) {
         this.method88();
      }

      this.field48.connect();
      return this.field48.getResponseCode() == -1;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)Lah;",
      garbageValue = "-123"
   )
   class20 method85() {
      try {
         if (!this.field45 || this.field48.getResponseCode() == -1) {
            return new class20("No REST response has been received yet.");
         }
      } catch (IOException var10) {
         this.field48.disconnect();
         return new class20("Error decoding REST response code: " + var10.getMessage());
      }

      class20 var3;
      try {
         class20 var1 = new class20(this.field48);
         return var1;
      } catch (IOException var8) {
         var3 = new class20("Error decoding REST response: " + var8.getMessage());
      } finally {
         this.field48.disconnect();
      }

      return var3;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "-1979397457"
   )
   static int method98(int var0, class55 var1, boolean var2) {
      class369 var3 = var2 ? class19.field81 : class141.field1714;
      if (var0 == 1500) {
         class46.field659[++class124.field1569 - 1] = var3.field4158;
         return 1;
      } else if (var0 == 1501) {
         class46.field659[++class124.field1569 - 1] = var3.field4204;
         return 1;
      } else if (var0 == 1502) {
         class46.field659[++class124.field1569 - 1] = var3.field4160 * 469894397;
         return 1;
      } else if (var0 == 1503) {
         class46.field659[++class124.field1569 - 1] = var3.field4149 * 1156037777;
         return 1;
      } else if (var0 == 1504) {
         class46.field659[++class124.field1569 - 1] = var3.field4166 ? 1 : 0;
         return 1;
      } else if (var0 == 1505) {
         class46.field659[++class124.field1569 - 1] = var3.field4164;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lti;IB)Ljava/lang/Object;",
      garbageValue = "121"
   )
   public static Object method97(class519 var0, int var1) {
      class374.method8144(var0);
      if (var1 >= 0 && var1 < var0.field5502 * -1549457881) {
         Object var2 = var0.method10323(var1);
         if (var1 < var0.field5502 * -1549457881 - 1) {
            class82.method2773(var0, var1 + 1, var0, var1, var0.field5502 * -1549457881 - (var1 + 1));
         }

         var0.method10362(var0.field5502 * -1549457881 - 1);
         return var2;
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("jd")
   @ObfuscatedSignature(
      descriptor = "(Ldr;Lct;IIIIII)V",
      garbageValue = "-992147073"
   )
   static final void method89(class79 var0, class75 var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null && var1.vmethod2740()) {
         if (var1 instanceof class81) {
            class195 var7 = ((class81)var1).field1184;
            if (var7.field2099 != null) {
               var7 = var7.method4365();
            }

            if (var7 == null) {
               return;
            }
         }

         int var76 = client.field335.field1254;
         int[] var8 = client.field335.field1243;
         boolean var9 = var2 < var76;
         int var10 = -2;
         if (var1.field1075 != null && (!var9 || !var1.field1077 && (client.field444 == 4 || !var1.field1101 && (client.field444 == 0 || client.field444 == 3 || client.field444 == 1 && ((class69)var1).method2170())))) {
            class343.method7327(var0, var1, var1.vmethod2734() + var1.method2417());
            if (client.field503 > -1 && client.field409 < client.field492) {
               client.field496[client.field409] = class333.field3831.method9415(var1.field1075) / 2;
               client.field495[client.field409] = class333.field3831.field5251;
               client.field493[client.field409] = client.field503;
               client.field494[client.field409] = client.field504 - var10;
               client.field497[client.field409] = var1.field1079;
               client.field498[client.field409] = var1.field1080;
               client.field500[client.field409] = var1.field1078;
               client.field586[client.field409] = var1.field1081;
               client.field393[client.field409] = var1.field1075;
               ++client.field409;
               var10 += 12;
            }
         }

         int var16;
         int var23;
         int var24;
         if (!var1.field1047.method8743()) {
            class343.method7327(var0, var1, var1.vmethod2734() + 15 + var1.method2417());

            for(class80 var11 = (class80)var1.field1047.method8748(); var11 != null; var11 = (class80)var1.field1047.method8762()) {
               class76 var12 = var11.method2705(client.field412);
               if (var12 == null) {
                  if (var11.method2706()) {
                     var11.vmethod10557();
                  }
               } else {
                  class187 var78 = var11.field1181;
                  class605 var79 = var78.method4255();
                  class605 var85 = var78.method4254();
                  int var86 = 0;
                  if (var79 != null && var85 != null) {
                     if (var78.field2051 * 2 < var85.field6019) {
                        var86 = var78.field2051;
                     }

                     var16 = var85.field6019 - var86 * 2;
                  } else {
                     var16 = var78.field2050;
                  }

                  int var83 = 255;
                  boolean var87 = true;
                  int var88 = client.field412 - var12.field1109;
                  int var89 = var16 * var12.field1115 / var78.field2050;
                  int var90;
                  int var107;
                  if (var12.field1110 > var88) {
                     var90 = var78.field2046 == 0 ? 0 : var78.field2046 * (var88 / var78.field2046);
                     var23 = var16 * var12.field1111 / var78.field2050;
                     var107 = var90 * (var89 - var23) / var12.field1110 + var23;
                  } else {
                     var107 = var89;
                     var90 = var12.field1110 + var78.field2049 - var88;
                     if (var78.field2045 >= 0) {
                        var83 = (var90 << 8) / (var78.field2049 - var78.field2045);
                     }
                  }

                  if (var12.field1115 > 0 && var107 < 1) {
                     var107 = 1;
                  }

                  if (var79 != null && var85 != null) {
                     if (var107 == var16) {
                        var107 += var86 * 2;
                     } else {
                        var107 += var86;
                     }

                     var90 = var79.field6020;
                     var10 += var90;
                     var23 = var3 + client.field503 - (var16 >> 1);
                     var24 = var4 + client.field504 - var10;
                     var23 -= var86;
                     if (var83 >= 0 && var83 < 255) {
                        var79.method11708(var23, var24, var83);
                        class601.method11551(var23, var24, var23 + var107, var24 + var90);
                        var85.method11708(var23, var24, var83);
                     } else {
                        var79.method11705(var23, var24);
                        class601.method11551(var23, var24, var23 + var107, var90 + var24);
                        var85.method11705(var23, var24);
                     }

                     class601.method11550(var3, var4, var3 + var5, var4 + var6);
                     var10 += 2;
                  } else {
                     var10 += 5;
                     if (client.field503 > -1) {
                        var90 = var3 + client.field503 - (var16 >> 1);
                        var23 = var4 + client.field504 - var10;
                        class601.method11558(var90, var23, var107, 5, 65280);
                        class601.method11558(var107 + var90, var23, var16 - var107, 5, 16711680);
                     }

                     var10 += 2;
                  }
               }
            }
         }

         if (var10 == -2) {
            var10 += 7;
         }

         if (var9 && client.field412 == var1.field1087) {
            class69 var93 = (class69)var1;
            boolean var77;
            if (client.field350 == 0) {
               var77 = false;
            } else if (var93 != class76.field1108) {
               boolean var13 = (client.field350 & 4) != 0;
               boolean var14 = var13;
               boolean var15;
               if (!var13) {
                  var15 = (client.field350 & 1) != 0;
                  var14 = var15 && var93.method2170();
               }

               var15 = var14;
               if (!var14) {
                  boolean var98 = (client.field350 & 2) != 0;
                  var15 = var98 && var93.method2173();
               }

               var77 = var15;
            } else {
               var77 = class422.method8532();
            }

            if (var77) {
               class69 var101 = (class69)var1;
               if (var9) {
                  class343.method7327(var0, var1, var1.vmethod2734() + 15 + var1.method2417());
                  class465 var104 = (class465)client.field387.get(class556.field5742);
                  var10 += 4;
                  var104.method9506(var101.field934.method11909(), var3 + client.field503, var4 + client.field504 - var10, 16777215, 0);
                  var10 += 18;
               }
            }
         }

         if (var9) {
            class69 var91 = (class69)var1;
            if (var91.field954) {
               return;
            }

            if (var91.field951 != -1 || var91.field937 != -1) {
               class343.method7327(var0, var1, var1.field1070 + 15 + var1.method2417());
               if (client.field503 > -1) {
                  if (var91.field951 != -1) {
                     var10 += 25;
                     class213.field2438[var91.field951].method11705(var3 + client.field503 - 12, var4 + client.field504 - var10);
                  }

                  if (var91.field937 != -1) {
                     var10 += 25;
                     class77.field1137[var91.field937].method11705(var3 + client.field503 - 12, var4 + client.field504 - var10);
                  }
               }
            }

            if (var2 >= 0 && client.field455 == 10 && var8[var2] == client.field457) {
               class343.method7327(var0, var1, 15 + var1.field1070 + var1.method2417());
               if (client.field503 > -1) {
                  var10 += class400.field4848[1].field6020;
                  class400.field4848[1].method11705(var3 + client.field503 - 12, var4 + client.field504 - var10);
               }
            }
         } else {
            class81 var92 = (class81)var1;
            int[] var94 = var92.method2724();
            short[] var103 = var92.method2748();
            if (var103 != null && var94 != null) {
               for(int var96 = 0; var96 < var103.length; ++var96) {
                  if (var103[var96] >= 0 && var94[var96] >= 0) {
                     long var80 = (long)var94[var96] << 8 | (long)var103[var96];
                     class605 var17 = (class605)client.field603.method9819(var80);
                     if (var17 == null) {
                        class605[] var18 = class463.method9400(class496.field5387, var94[var96], 0);
                        if (var18 != null && var103[var96] < var18.length) {
                           var17 = var18[var103[var96]];
                           client.field603.method9834(var80, var17);
                        }
                     }

                     if (var17 != null) {
                        class343.method7327(var0, var1, var1.vmethod2734() + 15 + var1.method2417());
                        if (client.field503 > -1) {
                           var17.method11705(var3 + client.field503 - (var17.field6019 >> 1), (var96 + 1) * (var4 - var17.field6020 - 2) - var17.field6020 + client.field504 - 4);
                        }
                     }
                  }
               }
            }

            if (client.field455 == 1 && client.field456 == var0.field1161.method9787(var2 - var76) && client.field412 % 20 < 10) {
               class343.method7327(var0, var1, var1.vmethod2734() + 15 + var1.method2417());
               if (client.field503 > -1) {
                  class400.field4848[0].method11705(var3 + client.field503 - 12, var4 + client.field504 - 28);
               }
            }
         }

         for(int var102 = 0; var102 < 4; ++var102) {
            int var82 = var1.field1044[var102];
            int var95 = var1.field1042[var102];
            class210 var105 = null;
            int var97 = 0;
            if (var95 >= 0) {
               if (var82 <= client.field412) {
                  continue;
               }

               var105 = class338.method7103(var1.field1042[var102]);
               var97 = var105.field2289;
               if (var105 != null && var105.field2300 != null) {
                  var105 = var105.method4584();
                  if (var105 == null) {
                     var1.field1044[var102] = -1;
                     continue;
                  }
               }
            } else if (var82 < 0) {
               continue;
            }

            var16 = var1.field1045[var102];
            class210 var99 = null;
            if (var16 >= 0) {
               var99 = class338.method7103(var16);
               if (var99 != null && var99.field2300 != null) {
                  var99 = var99.method4584();
               }
            }

            if (var82 - var97 <= client.field412) {
               if (var105 == null) {
                  var1.field1044[var102] = -1;
               } else {
                  class343.method7327(var0, var1, var1.vmethod2734() / 2 + var1.method2417());
                  if (client.field503 > -1) {
                     boolean var106 = true;
                     if (var102 == 1) {
                        client.field504 -= 20;
                     }

                     if (var102 == 2) {
                        client.field503 -= 15;
                        client.field504 -= 10;
                     }

                     if (var102 == 3) {
                        client.field503 += 15;
                        client.field504 -= 10;
                     }

                     class605 var19 = null;
                     class605 var20 = null;
                     class605 var21 = null;
                     class605 var22 = null;
                     var23 = 0;
                     var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     int var30 = 0;
                     class605 var31 = null;
                     class605 var32 = null;
                     class605 var33 = null;
                     class605 var34 = null;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     int var42 = 0;
                     int var43 = 0;
                     var19 = var105.method4573();
                     int var44;
                     if (var19 != null) {
                        var23 = var19.field6019;
                        var44 = var19.field6020;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var27 = var19.field6021;
                     }

                     var20 = var105.method4574();
                     if (var20 != null) {
                        var24 = var20.field6019;
                        var44 = var20.field6020;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var28 = var20.field6021;
                     }

                     var21 = var105.method4575();
                     if (var21 != null) {
                        var25 = var21.field6019;
                        var44 = var21.field6020;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var29 = var21.field6021;
                     }

                     var22 = var105.method4576();
                     if (var22 != null) {
                        var26 = var22.field6019;
                        var44 = var22.field6020;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var30 = var22.field6021;
                     }

                     if (var99 != null) {
                        var31 = var99.method4573();
                        if (var31 != null) {
                           var35 = var31.field6019;
                           var44 = var31.field6020;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var39 = var31.field6021;
                        }

                        var32 = var99.method4574();
                        if (var32 != null) {
                           var36 = var32.field6019;
                           var44 = var32.field6020;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var40 = var32.field6021;
                        }

                        var33 = var99.method4575();
                        if (var33 != null) {
                           var37 = var33.field6019;
                           var44 = var33.field6020;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var41 = var33.field6021;
                        }

                        var34 = var99.method4576();
                        if (var34 != null) {
                           var38 = var34.field6019;
                           var44 = var34.field6020;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var42 = var34.field6021;
                        }
                     }

                     class461 var84 = var105.method4577();
                     if (var84 == null) {
                        var84 = class342.field3947;
                     }

                     class461 var45;
                     if (var99 != null) {
                        var45 = var99.method4577();
                        if (var45 == null) {
                           var45 = class342.field3947;
                        }
                     } else {
                        var45 = class342.field3947;
                     }

                     String var46 = null;
                     String var47 = null;
                     boolean var48 = false;
                     int var49 = 0;
                     var46 = var105.method4568(var1.field1043[var102]);
                     int var100 = var84.method9415(var46);
                     if (var99 != null) {
                        var47 = var99.method4568(var1.field1046[var102]);
                        var49 = var45.method9415(var47);
                     }

                     int var50 = 0;
                     int var51 = 0;
                     if (var24 > 0) {
                        if (var21 == null && var22 == null) {
                           var50 = 1;
                        } else {
                           var50 = var100 / var24 + 1;
                        }
                     }

                     if (var99 != null && var36 > 0) {
                        if (var33 == null && var34 == null) {
                           var51 = 1;
                        } else {
                           var51 = var49 / var36 + 1;
                        }
                     }

                     int var52 = 0;
                     int var53 = var52;
                     if (var23 > 0) {
                        var52 += var23;
                     }

                     var52 += 2;
                     int var54 = var52;
                     if (var25 > 0) {
                        var52 += var25;
                     }

                     int var55 = var52;
                     int var56 = var52;
                     int var57;
                     if (var24 > 0) {
                        var57 = var24 * var50;
                        var52 += var57;
                        var56 += (var57 - var100) / 2;
                     } else {
                        var52 += var100;
                     }

                     var57 = var52;
                     if (var26 > 0) {
                        var52 += var26;
                     }

                     int var58 = 0;
                     int var59 = 0;
                     int var60 = 0;
                     int var61 = 0;
                     int var62 = 0;
                     int var63;
                     if (var99 != null) {
                        var52 += 2;
                        var58 = var52;
                        if (var35 > 0) {
                           var52 += var35;
                        }

                        var52 += 2;
                        var59 = var52;
                        if (var37 > 0) {
                           var52 += var37;
                        }

                        var60 = var52;
                        var62 = var52;
                        if (var36 > 0) {
                           var63 = var36 * var51;
                           var52 += var63;
                           var62 += (var63 - var49) / 2;
                        } else {
                           var52 += var49;
                        }

                        var61 = var52;
                        if (var38 > 0) {
                           var52 += var38;
                        }
                     }

                     var63 = var1.field1044[var102] - client.field412;
                     int var64 = var105.field2294 - var63 * var105.field2294 / var105.field2289;
                     int var65 = var63 * var105.field2295 / var105.field2289 + -var105.field2295;
                     int var66 = var64 + (var3 + client.field503 - (var52 >> 1));
                     int var67 = var65 + (var4 + client.field504 - 12);
                     int var68 = var67;
                     int var69 = var43 + var67;
                     int var70 = var67 + var105.field2297 + 15;
                     int var71 = var70 - var84.field5257;
                     int var72 = var70 + var84.field5260;
                     if (var71 < var67) {
                        var68 = var71;
                     }

                     if (var72 > var69) {
                        var69 = var72;
                     }

                     int var73 = 0;
                     int var74;
                     int var75;
                     if (var99 != null) {
                        var73 = var67 + var99.field2297 + 15;
                        var74 = var73 - var45.field5257;
                        var75 = var73 + var45.field5260;
                        if (var74 < var68) {
                           ;
                        }

                        if (var75 > var69) {
                           ;
                        }
                     }

                     var74 = 255;
                     if (var105.field2292 >= 0) {
                        var74 = (var63 << 8) / (var105.field2289 - var105.field2292);
                     }

                     if (var74 >= 0 && var74 < 255) {
                        if (var19 != null) {
                           var19.method11708(var66 + var53 - var27, var67, var74);
                        }

                        if (var21 != null) {
                           var21.method11708(var54 + var66 - var29, var67, var74);
                        }

                        if (var20 != null) {
                           for(var75 = 0; var75 < var50; ++var75) {
                              var20.method11708(var75 * var24 + (var55 + var66 - var28), var67, var74);
                           }
                        }

                        if (var22 != null) {
                           var22.method11708(var66 + var57 - var30, var67, var74);
                        }

                        var84.method9421(var46, var66 + var56, var70, var105.field2288, 0, var74);
                        if (var99 != null) {
                           if (var31 != null) {
                              var31.method11708(var66 + var58 - var39, var67, var74);
                           }

                           if (var33 != null) {
                              var33.method11708(var59 + var66 - var41, var67, var74);
                           }

                           if (var32 != null) {
                              for(var75 = 0; var75 < var51; ++var75) {
                                 var32.method11708(var75 * var36 + (var60 + var66 - var40), var67, var74);
                              }
                           }

                           if (var34 != null) {
                              var34.method11708(var61 + var66 - var42, var67, var74);
                           }

                           var45.method9421(var47, var66 + var62, var73, var99.field2288, 0, var74);
                        }
                     } else {
                        if (var19 != null) {
                           var19.method11705(var66 + var53 - var27, var67);
                        }

                        if (var21 != null) {
                           var21.method11705(var66 + var54 - var29, var67);
                        }

                        if (var20 != null) {
                           for(var75 = 0; var75 < var50; ++var75) {
                              var20.method11705(var75 * var24 + (var66 + var55 - var28), var67);
                           }
                        }

                        if (var22 != null) {
                           var22.method11705(var57 + var66 - var30, var67);
                        }

                        var84.method9420(var46, var56 + var66, var70, var105.field2288 | -16777216, 0);
                        if (var99 != null) {
                           if (var31 != null) {
                              var31.method11705(var66 + var58 - var39, var67);
                           }

                           if (var33 != null) {
                              var33.method11705(var59 + var66 - var41, var67);
                           }

                           if (var32 != null) {
                              for(var75 = 0; var75 < var51; ++var75) {
                                 var32.method11705(var75 * var36 + (var60 + var66 - var40), var67);
                              }
                           }

                           if (var34 != null) {
                              var34.method11705(var66 + var61 - var42, var67);
                           }

                           var45.method9420(var47, var62 + var66, var73, var99.field2288 | -16777216, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }

   @ObfuscatedName("lm")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-1067827092"
   )
   public static final void method103(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < client.field563; ++var4) {
         if (client.field568[var4] + client.field570[var4] > var0 && client.field568[var4] < var0 + var2 && client.field613[var4] + client.field467[var4] > var1 && client.field467[var4] < var3 + var1) {
            client.field566[var4] = true;
         }
      }

   }

   @ObfuscatedName("ny")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "615696011"
   )
   static final void method104() {
      class329 var0 = class130.method3593(class327.field3552, client.field314.field1308);
      client.field314.prepData(var0);
      class46.field652 = true;

      for(class64 var1 = (class64)client.field422.method8626(); var1 != null; var1 = (class64)client.field422.method8627()) {
         if (var1.field886 == 0 || var1.field886 == 3) {
            class279.method6318(var1, true);
         }
      }

      if (client.field564 != null) {
         class89.method2877(client.field564);
         client.field564 = null;
      }

      class46.field652 = false;
   }
}
