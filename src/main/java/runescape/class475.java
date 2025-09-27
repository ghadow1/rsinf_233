package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
public class class475 extends class477 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnx;"
   )
   class351 field5294 = null;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 288721377
   )
   int field5292 = 0;

   @ObfuscatedSignature(
      descriptor = "(Lsi;IZI)V"
   )
   public class475(class477 var1, int var2, boolean var3, int var4) {
      super(var1);
      super.field5303 = "FadeOutTask";
      if (var2 >= 0) {
         if (var3 && var2 < class339.field3895.size()) {
            this.field5294 = (class351)class339.field3895.get(var2);
         } else if (!var3 && var2 < class339.field3890.size()) {
            this.field5294 = (class351)class339.field3890.get(var2);
         }

         this.field5292 = var4;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "40"
   )
   public boolean vmethod9673() {
      if (this.field5294 != null && this.field5294.field4012 != null) {
         this.field5294.field4010 = true;

         try {
            if (this.field5294.field4002 > 0.0F && this.field5294.field4012.method7146()) {
               float var1 = this.field5292 == 0 ? (float)this.field5292 : (float)this.field5294.field4005 / (float)this.field5292;
               class351 var10000 = this.field5294;
               var10000.field4002 -= var1 == 0.0F ? (float)this.field5294.field4005 : var1;
               if (this.field5294.field4002 < 0.0F) {
                  this.field5294.field4002 = 0.0F;
               }

               this.field5294.field4012.method7218((int)this.field5294.field4002);
               return false;
            }
         } catch (Exception var3) {
            this.method9659(var3.getMessage());
            return true;
         }

         this.field5294.field4010 = false;
         return true;
      } else {
         return true;
      }
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZS)I",
      garbageValue = "128"
   )
   static int method9652(int var0, class55 var1, boolean var2) {
      if (var0 == 5306) {
         class46.field659[++class124.field1569 - 1] = class35.getWindowedMode();
         return 1;
      } else {
         int var3;
         if (var0 == 5307) {
            var3 = class46.field659[--class124.field1569];
            if (var3 == 1 || var3 == 2) {
               class208.setWindowedMode(var3);
            }

            return 1;
         } else if (var0 == 5308) {
            class46.field659[++class124.field1569 - 1] = class36.clientPreferences.method2574();
            return 1;
         } else if (var0 != 5309) {
            if (var0 == 5310) {
               --class124.field1569;
               return 1;
            } else {
               return 2;
            }
         } else {
            var3 = class46.field659[--class124.field1569];
            if (var3 == 1 || var3 == 2) {
               class36.clientPreferences.method2567(var3);
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("jv")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-533281127"
   )
   static final void method9655() {
      class286.method6372(false);
      client.field410 = 0;
      boolean var0 = true;

      int var1;
      for(var1 = 0; var1 < class119.field1553.length; ++var1) {
         if (class215.field2463[var1] != -1 && class119.field1553[var1] == null) {
            class119.field1553[var1] = class149.field1760.method8335(class215.field2463[var1], 0);
            if (class119.field1553[var1] == null) {
               var0 = false;
               ++client.field410;
            }
         }

         if (class386.field4415[var1] != -1 && class185.field2014[var1] == null) {
            class185.field2014[var1] = class149.field1760.method8336(class386.field4415[var1], 0, class267.field3170[var1]);
            if (class185.field2014[var1] == null) {
               var0 = false;
               ++client.field410;
            }
         }
      }

      if (!var0) {
         client.field476 = 1;
      } else {
         client.field329 = 0;
         var0 = true;

         int var3;
         int var4;
         for(var1 = 0; var1 < class119.field1553.length; ++var1) {
            byte[] var17 = class185.field2014[var1];
            if (var17 != null) {
               var3 = (class405.field4880[var1] >> 8) * 64 - class333.field3836.field1164;
               var4 = (class405.field4880[var1] & 255) * 64 - class333.field3836.field1165;
               if (client.field473) {
                  var3 = 10;
                  var4 = 10;
               }

               var0 &= class193.method4320(var17, var3, var4);
            }
         }

         if (!var0) {
            client.field476 = 2;
         } else {
            if (client.field476 != 0) {
               class464.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
            }

            class125.method3557();
            class333.field3836.field1159.method5101();

            for(var1 = 0; var1 < 4; ++var1) {
               class333.field3836.field1175[var1].method6165();
            }

            int var2;
            for(var1 = 0; var1 < 4; ++var1) {
               for(var2 = 0; var2 < 104; ++var2) {
                  for(var3 = 0; var3 < 104; ++var3) {
                     class333.field3836.field1168[var1][var2][var3] = 0;
                  }
               }
            }

            class125.method3557();
            class61.method2093();
            var1 = class119.field1553.length;
            class333.field3836.method2686();
            class286.method6372(true);
            int var5;
            if (!client.field473) {
               byte[] var16;
               for(var2 = 0; var2 < var1; ++var2) {
                  var3 = (class405.field4880[var2] >> 8) * 64 - class333.field3836.field1164;
                  var4 = (class405.field4880[var2] & 255) * 64 - class333.field3836.field1165;
                  var16 = class119.field1553[var2];
                  if (var16 != null) {
                     class125.method3557();
                     class344.method7331(class333.field3836, var16, var3, var4, class269.field3187 * 8 - 48, class201.field2210 * 8 - 48);
                  }
               }

               for(var2 = 0; var2 < var1; ++var2) {
                  var3 = (class405.field4880[var2] >> 8) * 64 - class333.field3836.field1164;
                  var4 = (class405.field4880[var2] & 255) * 64 - class333.field3836.field1165;
                  var16 = class119.field1553[var2];
                  if (var16 == null && class201.field2210 < 800) {
                     class125.method3557();
                     class443.method8868(class333.field3836, var3, var4, 64, 64);
                  }
               }

               class286.method6372(true);

               for(var2 = 0; var2 < var1; ++var2) {
                  byte[] var15 = class185.field2014[var2];
                  if (var15 != null) {
                     var4 = (class405.field4880[var2] >> 8) * 64 - class333.field3836.field1164;
                     var5 = (class405.field4880[var2] & 255) * 64 - class333.field3836.field1165;
                     class125.method3557();
                     class275.method6229(class333.field3836, var15, var4, var5);
                  }
               }
            }

            int var6;
            int var7;
            int var8;
            if (client.field473) {
               int var9;
               int var10;
               int var11;
               for(var2 = 0; var2 < 4; ++var2) {
                  class125.method3557();

                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        boolean var18 = false;
                        var6 = client.field447[var2][var3][var4];
                        if (var6 != -1) {
                           var7 = class153.method3835(var6);
                           var8 = class61.method2087(var6);
                           var9 = class253.method5796(var6);
                           var10 = class34.method689(var6);
                           var11 = (var9 / 8 << 8) + var10 / 8;

                           for(int var12 = 0; var12 < class405.field4880.length; ++var12) {
                              if (class405.field4880[var12] == var11 && class119.field1553[var12] != null) {
                                 int var13 = (var9 - var3) * 8;
                                 int var14 = (var10 - var4) * 8;
                                 class124.method3545(class333.field3836, class119.field1553[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14);
                                 var18 = true;
                                 break;
                              }
                           }
                        }

                        if (!var18) {
                           class173.method4095(class333.field3836.field1173, var2, var3 * 8, var4 * 8);
                        }
                     }
                  }
               }

               for(var2 = 0; var2 < 13; ++var2) {
                  for(var3 = 0; var3 < 13; ++var3) {
                     var4 = client.field447[0][var2][var3];
                     if (var4 == -1) {
                        class443.method8868(class333.field3836, var2 * 8, var3 * 8, 8, 8);
                     }
                  }
               }

               class286.method6372(true);

               for(var2 = 0; var2 < 4; ++var2) {
                  class125.method3557();

                  for(var3 = 0; var3 < 13; ++var3) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        var5 = client.field447[var2][var3][var4];
                        if (var5 != -1) {
                           var6 = class153.method3835(var5);
                           var7 = class61.method2087(var5);
                           var8 = class253.method5796(var5);
                           var9 = class34.method689(var5);
                           var10 = (var8 / 8 << 8) + var9 / 8;

                           for(var11 = 0; var11 < class405.field4880.length; ++var11) {
                              if (class405.field4880[var11] == var10 && class185.field2014[var11] != null) {
                                 class59.method2034(class333.field3836, class185.field2014[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7);
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }

            class286.method6372(true);
            class125.method3557();
            class277.method6233(class333.field3836);
            class286.method6372(true);
            var2 = class59.field842;
            if (var2 > class333.field3836.field1170) {
               var2 = class333.field3836.field1170;
            }

            if (var2 < class333.field3836.field1170 - 1) {
               var2 = class333.field3836.field1170 - 1;
            }

            if (client.field565) {
               class333.field3836.field1159.method5275(class59.field842);
            } else {
               class333.field3836.field1159.method5275(0);
            }

            for(var3 = 0; var3 < 104; ++var3) {
               for(var4 = 0; var4 < 104; ++var4) {
                  class373.method8142(class333.field3836, var3, var4);
               }
            }

            class125.method3557();
            class59.method2066();
            class212.field2315.method7011();
            class329 var19;
            if (class521.field5519.method545()) {
               var19 = EnumComposition.getPacketBufferNode(ClientPackets.field3606, client.packetWriter.isaacCipher);
               var19.out.writeIntBigEndian(1057001181);
               client.packetWriter.addNode(var19);
            }

            if (!client.field473) {
               var3 = (class269.field3187 - 6) / 8;
               var4 = (class269.field3187 + 6) / 8;
               var5 = (class201.field2210 - 6) / 8;
               var6 = (class201.field2210 + 6) / 8;

               for(var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
                  for(var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
                     if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
                        class149.field1760.method8390("m" + var7 + "_" + var8);
                        class149.field1760.method8390("l" + var7 + "_" + var8);
                     }
                  }
               }
            }

            class125.method3557();
            class195.method4383();
            var19 = EnumComposition.getPacketBufferNode(ClientPackets.field3587, client.packetWriter.isaacCipher);
            client.packetWriter.addNode(var19);
            class144.method3738();
            client.field556 = false;
         }
      }
   }
}
