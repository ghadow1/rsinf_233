package game;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
public class class293 implements class309 {
   @ObfuscatedName("jn")
   @ObfuscatedGetter(
      intValue = 1851989185
   )
   static int affiliateID;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -286391635
   )
   int field3393;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1102309851
   )
   int field3383;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -587744763
   )
   int field3389;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1730320183
   )
   int field3385;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1399519995
   )
   int field3394;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1334418551
   )
   int field3387;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -341652159
   )
   int field3388;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1204110005
   )
   int field3382;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1064668053
   )
   int field3390;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1847442727
   )
   int field3391;

   class293() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lll;I)V",
      garbageValue = "1896416407"
   )
   public void vmethod6913(class289 var1) {
      if (var1.field3337 > this.field3394) {
         var1.field3337 = this.field3394;
      }

      if (var1.field3335 < this.field3394) {
         var1.field3335 = this.field3394;
      }

      if (var1.field3326 > this.field3387) {
         var1.field3326 = this.field3387;
      }

      if (var1.field3336 < this.field3387) {
         var1.field3336 = this.field3387;
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIII)Z",
      garbageValue = "-739948834"
   )
   public boolean vmethod6897(int var1, int var2, int var3) {
      if (var1 >= this.field3393 && var1 < this.field3393 + this.field3383) {
         return var2 >= (this.field3389 << 6) + (this.field3388 << 3) && var2 <= (this.field3389 << 6) + (this.field3388 << 3) + 7 && var3 >= (this.field3385 << 6) + (this.field3382 << 3) && var3 <= (this.field3385 << 6) + (this.field3382 << 3) + 7;
      } else {
         return false;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "-51"
   )
   public boolean vmethod6896(int var1, int var2) {
      return var1 >= (this.field3394 << 6) + (this.field3390 << 3) && var1 <= (this.field3394 << 6) + (this.field3390 << 3) + 7 && var2 >= (this.field3387 << 6) + (this.field3391 << 3) && var2 <= (this.field3387 << 6) + (this.field3391 << 3) + 7;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIII)[I",
      garbageValue = "-2061697618"
   )
   public int[] vmethod6899(int var1, int var2, int var3) {
      if (!this.vmethod6897(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.field3394 * 64 - this.field3389 * 64 + var2 + (this.field3390 * 8 - this.field3388 * 8), var3 + (this.field3387 * 64 - this.field3385 * 64) + (this.field3391 * 8 - this.field3382 * 8)};
         return var4;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IIB)Lna;",
      garbageValue = "1"
   )
   public class356 vmethod6898(int var1, int var2) {
      if (!this.vmethod6896(var1, var2)) {
         return null;
      } else {
         int var3 = this.field3389 * 64 - this.field3394 * 64 + (this.field3388 * 8 - this.field3390 * 8) + var1;
         int var4 = this.field3385 * 64 - this.field3387 * 64 + var2 + (this.field3382 * 8 - this.field3391 * 8);
         return new class356(this.field3393, var3, var4);
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-1979822224"
   )
   public void vmethod6901(class590 var1) {
      this.field3393 = var1.method11196();
      this.field3383 = var1.method11196();
      this.field3389 = var1.method11198();
      this.field3388 = var1.method11196();
      this.field3385 = var1.method11198();
      this.field3382 = var1.method11196();
      this.field3394 = var1.method11198();
      this.field3390 = var1.method11196();
      this.field3387 = var1.method11198();
      this.field3391 = var1.method11196();
      this.method6714();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "34"
   )
   void method6714() {
   }

   @ObfuscatedName("nf")
   @ObfuscatedSignature(
      descriptor = "([Loi;IIIIIIIIIII)V",
      garbageValue = "2018430265"
   )
   static final void method6729(class369[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      for(int var11 = var1; var11 <= var2; ++var11) {
         class369 var12 = var0[var11];
         if (var12 != null && var3 == var12.field4164 && var4 == var12.field4165 && (var12.method7948() || class373.method8139(var12) != 0 || class388.method8204(var12) != 0 || var12 == client.field536)) {
            if (var12.field4143) {
               if (class364.method7524(var12)) {
                  continue;
               }
            } else if (var12.field4147 == 0 && var12 != class343.field3950 && class364.method7524(var12)) {
               continue;
            }

            if (var12.field4147 == 11) {
               if (var12.method7968(class119.field1554, class114.field1507)) {
                  if (var12.method8100()) {
                     class89.method2877(var12);
                     class23.method337(var12.field4286, var12, true);
                     var12.method7967().method5816().method5962(3, var12.method7967().method5825());
                  }

                  if (var12.field4176 != null) {
                     class65 var13 = new class65();
                     var13.field893 = var12;
                     var13.field898 = var12.field4176;
                     client.field434.method8689(var13);
                  }
               }
            } else if (var12.field4147 == 12 && var12.method8091(class119.field1554)) {
               class89.method2877(var12);
            }

            int var29 = var9 + var12.field4158;
            int var14 = var10 + var12.field4204;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var12.field4147 == 9) {
               var19 = var29;
               var20 = var14;
               var21 = var29 + var12.field4160 * 469894397;
               int var22 = var12.field4149 * 1156037777 + var14;
               if (var21 < var29) {
                  var19 = var21;
                  var21 = var29;
               }

               if (var22 < var14) {
                  var20 = var22;
                  var22 = var14;
               }

               ++var21;
               ++var22;
               var15 = var19 > var5 ? var19 : var5;
               var16 = var20 > var6 ? var20 : var6;
               var17 = var21 < var7 ? var21 : var7;
               var18 = var22 < var8 ? var22 : var8;
            } else {
               var19 = var29 + var12.field4160 * 469894397;
               var20 = var12.field4149 * 1156037777 + var14;
               var15 = var29 > var5 ? var29 : var5;
               var16 = var14 > var6 ? var14 : var6;
               var17 = var19 < var7 ? var19 : var7;
               var18 = var20 < var8 ? var20 : var8;
            }

            if (var12 == client.field612) {
               client.field543 = true;
               client.field544 = var29;
               client.field545 = var14;
            }

            boolean var37 = false;
            if (var12.field4222) {
               switch(client.field324) {
               case 0:
                  var37 = true;
               case 1:
               default:
                  break;
               case 2:
                  if (client.field573 == var12.field4144 >>> 16) {
                     var37 = true;
                  }
                  break;
               case 3:
                  if (var12.field4144 == client.field573) {
                     var37 = true;
                  }
               }
            }

            if (var37 || !var12.field4143 || var15 < var17 && var16 < var18) {
               if (var12.field4143) {
                  class65 var30;
                  if (var12.field4267) {
                     if (class35.field231 >= var15 && class35.field220 >= var16 && class35.field231 < var17 && class35.field220 < var18) {
                        for(var30 = (class65)client.field434.method8690(); var30 != null; var30 = (class65)client.field434.method8692()) {
                           if (var30.field899) {
                              var30.vmethod10557();
                              var30.field893.field4265 = false;
                           }
                        }

                        class395.method8231();
                        if (class74.field1037 == 0) {
                           client.field612 = null;
                           client.field536 = null;
                        }

                        if (!client.field521) {
                           class14.method186();
                        }
                     }
                  } else if (var12.field4297 && class35.field231 >= var15 && class35.field220 >= var16 && class35.field231 < var17 && class35.field220 < var18) {
                     for(var30 = (class65)client.field434.method8690(); var30 != null; var30 = (class65)client.field434.method8692()) {
                        if (var30.field899 && var30.field893.field4258 == var30.field898) {
                           var30.vmethod10557();
                        }
                     }
                  }
               }

               var20 = class35.field231;
               var21 = class35.field220;
               if (class35.field222 != 0) {
                  var20 = class35.field221;
                  var21 = class35.field224;
               }

               boolean var38 = var20 >= var15 && var21 >= var16 && var20 < var17 && var21 < var18;
               if (var12.field4168 == 1337) {
                  if (!client.field392 && !client.field521 && var38) {
                     class67.method2160(var20, var21, var15, var16);
                  }
               } else if (var12.field4168 == 1338) {
                  class4.method17(var12, var29, var14);
               } else {
                  if (var12.field4168 == 1400) {
                     class56.field816.method10640(class35.field231, class35.field220, var38, var29, var14, var12.field4160 * 469894397, var12.field4149 * 1156037777);
                  }

                  if (!client.field521 && var38) {
                     if (var12.field4168 == 1400) {
                        class56.field816.method10692(var29, var14, var12.field4160 * 469894397, var12.field4149 * 1156037777, var20, var21);
                     } else {
                        class145.method3749(var12);
                     }
                  }

                  boolean var24;
                  int var26;
                  if (var37) {
                     for(int var23 = 0; var23 < var12.field4223.length; ++var23) {
                        var24 = false;
                        boolean var31 = false;
                        if (!var24 && var12.field4223[var23] != null) {
                           for(var26 = 0; var26 < var12.field4223[var23].length; ++var26) {
                              boolean var27 = false;
                              if (var12.field4295 != null) {
                                 var27 = client.field551.method6138(var12.field4223[var23][var26]);
                              }

                              if (class35.method727(var12.field4223[var23][var26]) || var27) {
                                 var24 = true;
                                 if (var12.field4295 != null && var12.field4295[var23] > client.field412) {
                                    break;
                                 }

                                 byte var36 = var12.field4224[var23][var26];
                                 if (var36 == 0 || ((var36 & 8) == 0 || !client.field551.method6138(86) && !client.field551.method6138(82) && !client.field551.method6138(81)) && ((var36 & 2) == 0 || client.field551.method6138(86)) && ((var36 & 1) == 0 || client.field551.method6138(82)) && ((var36 & 4) == 0 || client.field551.method6138(81))) {
                                    var31 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var31) {
                           if (var23 < 10) {
                              class311.method6928(var23 + 1, var12.field4144, var12.field4145 * -217986249, var12.field4282, "");
                           } else if (var23 == 10) {
                              class402.method8270();
                              class39.method767(var12.field4144, var12.field4145 * -217986249, class537.method10543(class373.method8139(var12)), var12.field4282);
                              client.field374 = class286.method6374(var12);
                              if (client.field374 == null) {
                                 client.field374 = "null";
                              }

                              client.field533 = var12.field4227 + class134.method3619(16777215);
                           }

                           var26 = var12.field4220[var23];
                           if (var12.field4295 == null) {
                              var12.field4295 = new int[var12.field4223.length];
                           }

                           if (var12.field4233 == null) {
                              var12.field4233 = new int[var12.field4223.length];
                           }

                           if (var26 != 0) {
                              if (var12.field4295[var23] == 0) {
                                 var12.field4295[var23] = var26 + client.field412 + var12.field4233[var23];
                              } else {
                                 var12.field4295[var23] = var26 + client.field412;
                              }
                           } else {
                              var12.field4295[var23] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var24 && var12.field4295 != null) {
                           var12.field4295[var23] = 0;
                        }
                     }
                  }

                  if (var12.field4143) {
                     if (class35.field231 >= var15 && class35.field220 >= var16 && class35.field231 < var17 && class35.field220 < var18) {
                        var38 = true;
                     } else {
                        var38 = false;
                     }

                     boolean var39 = false;
                     if ((class35.field218 == 1 || !class423.field5058 && class35.field218 == 4) && var38) {
                        var39 = true;
                     }

                     var24 = false;
                     if ((class35.field222 == 1 || !class423.field5058 && class35.field222 == 4) && class35.field221 >= var15 && class35.field224 >= var16 && class35.field221 < var17 && class35.field224 < var18) {
                        var24 = true;
                     }

                     if (var24) {
                        class584.method11130(var12, class35.field221 - var29, class35.field224 - var14);
                     }

                     if (var12.method7945()) {
                        if (var24) {
                           client.field437.method8689(new class273(0, class35.field231 - var29, class35.field220 - var14, var12));
                        }

                        if (var39) {
                           client.field437.method8689(new class273(1, class35.field231 - var29, class35.field220 - var14, var12));
                        }
                     }

                     if (var12.field4168 == 1400) {
                        class56.field816.method10641(var20, var21, var38 & var39, var38 & var24);
                     }

                     if (client.field612 != null && var12 != client.field612 && var38 && class227.method5046(class373.method8139(var12))) {
                        client.field445 = var12;
                     }

                     if (var12 == client.field536) {
                        client.field540 = true;
                        client.field541 = var29;
                        client.field542 = var14;
                     }

                     if (var12.field4236) {
                        class65 var25;
                        if (var38 && client.field550 != 0 && var12.field4258 != null) {
                           var25 = new class65();
                           var25.field899 = true;
                           var25.field893 = var12;
                           var25.field895 = client.field550;
                           var25.field898 = var12.field4258;
                           client.field434.method8689(var25);
                        }

                        if (client.field612 != null || client.field521) {
                           var24 = false;
                           var39 = false;
                           var38 = false;
                        }

                        if (!var12.field4171 && var24) {
                           var12.field4171 = true;
                           if (var12.field4238 != null) {
                              var25 = new class65();
                              var25.field899 = true;
                              var25.field893 = var12;
                              var25.field900 = class35.field221 - var29;
                              var25.field895 = class35.field224 - var14;
                              var25.field898 = var12.field4238;
                              client.field434.method8689(var25);
                           }
                        }

                        if (var12.field4171 && var39 && var12.field4239 != null) {
                           var25 = new class65();
                           var25.field899 = true;
                           var25.field893 = var12;
                           var25.field900 = class35.field231 - var29;
                           var25.field895 = class35.field220 - var14;
                           var25.field898 = var12.field4239;
                           client.field434.method8689(var25);
                        }

                        if (var12.field4171 && !var39) {
                           var12.field4171 = false;
                           if (var12.field4240 != null) {
                              var25 = new class65();
                              var25.field899 = true;
                              var25.field893 = var12;
                              var25.field900 = class35.field231 - var29;
                              var25.field895 = class35.field220 - var14;
                              var25.field898 = var12.field4240;
                              client.field614.method8689(var25);
                           }
                        }

                        if (var39 && var12.field4241 != null) {
                           var25 = new class65();
                           var25.field899 = true;
                           var25.field893 = var12;
                           var25.field900 = class35.field231 - var29;
                           var25.field895 = class35.field220 - var14;
                           var25.field898 = var12.field4241;
                           client.field434.method8689(var25);
                        }

                        if (!var12.field4265 && var38) {
                           var12.field4265 = true;
                           if (var12.field4242 != null) {
                              var25 = new class65();
                              var25.field899 = true;
                              var25.field893 = var12;
                              var25.field900 = class35.field231 - var29;
                              var25.field895 = class35.field220 - var14;
                              var25.field898 = var12.field4242;
                              client.field434.method8689(var25);
                           }
                        }

                        if (var12.field4265 && var38 && var12.field4243 != null) {
                           var25 = new class65();
                           var25.field899 = true;
                           var25.field893 = var12;
                           var25.field900 = class35.field231 - var29;
                           var25.field895 = class35.field220 - var14;
                           var25.field898 = var12.field4243;
                           client.field434.method8689(var25);
                        }

                        if (var12.field4265 && !var38) {
                           var12.field4265 = false;
                           if (var12.field4244 != null) {
                              var25 = new class65();
                              var25.field899 = true;
                              var25.field893 = var12;
                              var25.field900 = class35.field231 - var29;
                              var25.field895 = class35.field220 - var14;
                              var25.field898 = var12.field4244;
                              client.field614.method8689(var25);
                           }
                        }

                        if (var12.field4255 != null) {
                           var25 = new class65();
                           var25.field893 = var12;
                           var25.field898 = var12.field4255;
                           client.field435.method8689(var25);
                        }

                        class65 var28;
                        int var40;
                        int var42;
                        if (var12.field4217 != null && client.field452 > var12.field4290) {
                           if (var12.field4250 != null && client.field452 - var12.field4290 <= 32) {
                              label842:
                              for(var42 = var12.field4290; var42 < client.field452; ++var42) {
                                 var26 = client.field547[var42 & 31];

                                 for(var40 = 0; var40 < var12.field4250.length; ++var40) {
                                    if (var26 == var12.field4250[var40]) {
                                       var28 = new class65();
                                       var28.field893 = var12;
                                       var28.field898 = var12.field4217;
                                       client.field434.method8689(var28);
                                       break label842;
                                    }
                                 }
                              }
                           } else {
                              var25 = new class65();
                              var25.field893 = var12;
                              var25.field898 = var12.field4217;
                              client.field434.method8689(var25);
                           }

                           var12.field4290 = client.field452;
                        }

                        if (var12.field4304 != null && client.field535 > var12.field4287) {
                           if (var12.field4252 != null && client.field535 - var12.field4287 <= 32) {
                              label818:
                              for(var42 = var12.field4287; var42 < client.field535; ++var42) {
                                 var26 = client.field549[var42 & 31];

                                 for(var40 = 0; var40 < var12.field4252.length; ++var40) {
                                    if (var26 == var12.field4252[var40]) {
                                       var28 = new class65();
                                       var28.field893 = var12;
                                       var28.field898 = var12.field4304;
                                       client.field434.method8689(var28);
                                       break label818;
                                    }
                                 }
                              }
                           } else {
                              var25 = new class65();
                              var25.field893 = var12;
                              var25.field898 = var12.field4304;
                              client.field434.method8689(var25);
                           }

                           var12.field4287 = client.field535;
                        }

                        if (var12.field4253 != null && client.field332 > var12.field4292) {
                           if (var12.field4254 != null && client.field332 - var12.field4292 <= 32) {
                              label794:
                              for(var42 = var12.field4292; var42 < client.field332; ++var42) {
                                 var26 = client.field532[var42 & 31];

                                 for(var40 = 0; var40 < var12.field4254.length; ++var40) {
                                    if (var26 == var12.field4254[var40]) {
                                       var28 = new class65();
                                       var28.field893 = var12;
                                       var28.field898 = var12.field4253;
                                       client.field434.method8689(var28);
                                       break label794;
                                    }
                                 }
                              }
                           } else {
                              var25 = new class65();
                              var25.field893 = var12;
                              var25.field898 = var12.field4253;
                              client.field434.method8689(var25);
                           }

                           var12.field4292 = client.field332;
                        }

                        if (client.field525 > var12.field4289 && var12.field4154 != null) {
                           var25 = new class65();
                           var25.field893 = var12;
                           var25.field898 = var12.field4154;
                           client.field434.method8689(var25);
                        }

                        if (client.field555 > var12.field4289 && var12.field4263 != null) {
                           var25 = new class65();
                           var25.field893 = var12;
                           var25.field898 = var12.field4263;
                           client.field434.method8689(var25);
                        }

                        if (client.field363 > var12.field4289 && var12.field4264 != null) {
                           var25 = new class65();
                           var25.field893 = var12;
                           var25.field898 = var12.field4264;
                           client.field434.method8689(var25);
                        }

                        if (client.field352 > var12.field4289 && var12.field4280 != null) {
                           var25 = new class65();
                           var25.field893 = var12;
                           var25.field898 = var12.field4280;
                           client.field434.method8689(var25);
                        }

                        if (client.field484 > var12.field4289 && var12.field4266 != null) {
                           var25 = new class65();
                           var25.field893 = var12;
                           var25.field898 = var12.field4266;
                           client.field434.method8689(var25);
                        }

                        if (client.field559 > var12.field4289 && var12.field4271 != null) {
                           var25 = new class65();
                           var25.field893 = var12;
                           var25.field898 = var12.field4271;
                           client.field434.method8689(var25);
                        }

                        if (client.field560 > var12.field4289 && var12.field4273 != null) {
                           var25 = new class65();
                           var25.field893 = var12;
                           var25.field898 = var12.field4273;
                           client.field434.method8689(var25);
                        }

                        if (client.field561 > var12.field4289 && var12.field4296 != null) {
                           var25 = new class65();
                           var25.field893 = var12;
                           var25.field898 = var12.field4296;
                           client.field434.method8689(var25);
                        }

                        var12.field4289 = client.field404;
                        if (var12.field4151 != null) {
                           for(var42 = 0; var42 < client.field442; ++var42) {
                              class65 var35 = new class65();
                              var35.field893 = var12;
                              var35.field892 = client.field511[var42];
                              var35.field894 = client.field443[var42];
                              var35.field898 = var12.field4151;
                              client.field434.method8689(var35);
                           }
                        }

                        class65 var34;
                        int[] var41;
                        if (var12.field4261 != null) {
                           var41 = client.field551.method6135();

                           for(var26 = 0; var26 < var41.length; ++var26) {
                              var34 = new class65();
                              var34.field893 = var12;
                              var34.field892 = var41[var26];
                              var34.field898 = var12.field4261;
                              client.field434.method8689(var34);
                           }
                        }

                        if (var12.field4159 != null) {
                           var41 = client.field551.method6126();

                           for(var26 = 0; var26 < var41.length; ++var26) {
                              var34 = new class65();
                              var34.field893 = var12;
                              var34.field892 = var41[var26];
                              var34.field898 = var12.field4159;
                              client.field434.method8689(var34);
                           }
                        }
                     }
                  }

                  if (!var12.field4143) {
                     if (client.field612 != null || client.field521) {
                        continue;
                     }

                     if ((var12.field4278 >= 0 || var12.field4175 != 0) && class35.field231 >= var15 && class35.field220 >= var16 && class35.field231 < var17 && class35.field220 < var18) {
                        if (var12.field4278 >= 0) {
                           class343.field3950 = var0[var12.field4278];
                        } else {
                           class343.field3950 = var12;
                        }
                     }

                     if (var12.field4147 == 8 && class35.field231 >= var15 && class35.field220 >= var16 && class35.field231 < var17 && class35.field220 < var18) {
                        class134.field1624 = var12;
                     }

                     if (var12.field4172 > var12.field4149 * 1156037777) {
                        class134.method3620(var12, var29 + var12.field4160 * 469894397, var14, var12.field4149 * 1156037777, var12.field4172, class35.field231, class35.field220);
                     }
                  }

                  if (var12.field4147 == 0) {
                     method6729(var0, var12.field4248, var12.field4214, var12.field4144, var12.field4145 * -217986249, var15, var16, var17, var18, var29 - var12.field4260, var14 - var12.field4170);
                     if (var12.field4286 != null) {
                        method6729(var12.field4286, 0, var12.field4286.length - 1, var12.field4144, -1, var15, var16, var17, var18, var29 - var12.field4260, var14 - var12.field4170);
                     }

                     if (var12.field4145 * -217986249 == -1) {
                        class64 var32 = (class64)client.field422.method8623((long)var12.field4144);
                        if (var32 != null) {
                           if (var32.field886 == 0 && class35.field231 >= var15 && class35.field220 >= var16 && class35.field231 < var17 && class35.field220 < var18 && !client.field521) {
                              for(class65 var33 = (class65)client.field434.method8690(); var33 != null; var33 = (class65)client.field434.method8692()) {
                                 if (var33.field899) {
                                    var33.vmethod10557();
                                    var33.field893.field4265 = false;
                                 }
                              }

                              if (class74.field1037 == 0) {
                                 client.field612 = null;
                                 client.field536 = null;
                              }

                              if (!client.field521) {
                                 class14.method186();
                              }
                           }

                           class286.method6368(var32.field888, var15, var16, var17, var18, var29, var14);
                        }
                     }
                  }
               }
            }
         }
      }

   }
}
