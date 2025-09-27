package game;

import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sd")
public class class482 {
   @ObfuscatedName("ap")
   static final Object field5317 = new Object();
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -590896119
   )
   static int field5329 = 0;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 121384753
   )
   static int field5319 = 0;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1234378733
   )
   static int field5323 = 0;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1130222243
   )
   static int field5321 = 0;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1275812891
   )
   static int field5322 = 1000;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 1782319671
   )
   static int field5316 = 250;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 489034209
   )
   static int field5324 = 100;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1935076913
   )
   static int field5325 = 50;
   @ObfuscatedName("an")
   static byte[][] field5326 = new byte[1000][];
   @ObfuscatedName("ar")
   static byte[][] field5327 = new byte[250][];
   @ObfuscatedName("ae")
   static byte[][] field5318 = new byte[100][];
   @ObfuscatedName("ay")
   static byte[][] field5328 = new byte[50][];
   @ObfuscatedName("ad")
   public static int[] field5330;
   @ObfuscatedName("ah")
   public static ArrayList field5331 = new ArrayList();

   static {
      new HashMap();
      field5331.clear();
      field5331.add(100);
      field5331.add(5000);
      field5331.add(10000);
      field5331.add(30000);
   }

   @ObfuscatedName("ls")
   @ObfuscatedSignature(
      descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;III)V",
      garbageValue = "350949477"
   )
   public static final void method9729(int var0, int var1, int var2, int var3, int var4, int var5, String var6, String var7, int var8, int var9) {
      class79 var10 = client.field333.method2350(var5);
      if (var10 != null) {
         int var11 = var10.field1164;
         int var12 = var10.field1165;
         class424 var13 = var10.field1160;
         class424 var14 = var10.field1169;
         if (var2 >= 2000) {
            var2 -= 2000;
         }

         class329 var15;
         if (var2 == 1) {
            client.field505 = var8;
            client.field506 = var9;
            client.field508 = 2;
            client.field485 = 0;
            client.field581 = var0;
            client.field531 = var1;
            var15 = class130.method3593(class327.field3613, client.field314.field1308);
            var15.field3664.method11228(client.field551.method6138(82) ? 1 : 0);
            var15.field3664.method11325(var0 + var11);
            var15.field3664.putIntCustomEndian(class325.field3537);
            var15.field3664.method11236(class36.field240);
            var15.field3664.writeShortBigEndian(var3);
            var15.field3664.method11238(class232.field2800);
            var15.field3664.method11238(var12 + var1);
            client.field314.prepData(var15);
         } else if (var2 == 2) {
            client.field505 = var8;
            client.field506 = var9;
            client.field508 = 2;
            client.field485 = 0;
            client.field581 = var0;
            client.field531 = var1;
            var15 = class130.method3593(class327.field3541, client.field314.field1308);
            var15.field3664.writeShortBigEndian(client.field530);
            var15.field3664.writeByte(client.field551.method6138(82) ? 1 : 0);
            var15.field3664.writeShortBigEndian(client.field407);
            var15.field3664.writeIntBigEndian(class433.field5116);
            var15.field3664.method11325(var0 + var11);
            var15.field3664.method11325(var12 + var1);
            var15.field3664.writeShortBigEndian(var3);
            client.field314.prepData(var15);
         } else if (var2 == 3) {
            client.field505 = var8;
            client.field506 = var9;
            client.field508 = 2;
            client.field485 = 0;
            client.field581 = var0;
            client.field531 = var1;
            var15 = class130.method3593(class327.field3637, client.field314.field1308);
            var15.field3664.method11325(var12 + var1);
            var15.field3664.writeShortBigEndian(var0 + var11);
            var15.field3664.method11229(client.field551.method6138(82) ? 1 : 0);
            var15.field3664.method11236(var3);
            client.field314.prepData(var15);
         } else if (var2 == 4) {
            client.field505 = var8;
            client.field506 = var9;
            client.field508 = 2;
            client.field485 = 0;
            client.field581 = var0;
            client.field531 = var1;
            var15 = class130.method3593(class327.field3596, client.field314.field1308);
            var15.field3664.method11227(client.field551.method6138(82) ? 1 : 0);
            var15.field3664.writeShortBigEndian(var0 + var11);
            var15.field3664.method11325(var3);
            var15.field3664.writeShortBigEndian(var12 + var1);
            client.field314.prepData(var15);
         } else if (var2 == 5) {
            client.field505 = var8;
            client.field506 = var9;
            client.field508 = 2;
            client.field485 = 0;
            client.field581 = var0;
            client.field531 = var1;
            var15 = class130.method3593(class327.field3599, client.field314.field1308);
            var15.field3664.writeShortBigEndian(var12 + var1);
            var15.field3664.method11236(var3);
            var15.field3664.writeShortBigEndian(var0 + var11);
            var15.field3664.method11227(client.field551.method6138(82) ? 1 : 0);
            client.field314.prepData(var15);
         } else if (var2 == 6) {
            client.field505 = var8;
            client.field506 = var9;
            client.field508 = 2;
            client.field485 = 0;
            client.field581 = var0;
            client.field531 = var1;
            var15 = class130.method3593(class327.field3598, client.field314.field1308);
            var15.field3664.writeByte(client.field551.method6138(82) ? 1 : 0);
            var15.field3664.writeShortBigEndian(var0 + var11);
            var15.field3664.writeShortBigEndian(var12 + var1);
            var15.field3664.method11325(var3);
            client.field314.prepData(var15);
         } else {
            class329 var16;
            class81 var20;
            if (var2 == 7) {
               var20 = (class81)var13.method8567((long)var3);
               if (var20 != null) {
                  client.field505 = var8;
                  client.field506 = var9;
                  client.field508 = 2;
                  client.field485 = 0;
                  client.field581 = var0;
                  client.field531 = var1;
                  var16 = class130.method3593(class327.field3622, client.field314.field1308);
                  var16.field3664.writeIntBigEndian(class325.field3537);
                  var16.field3664.writeShortBigEndian(class232.field2800);
                  var16.field3664.method11227(client.field551.method6138(82) ? 1 : 0);
                  var16.field3664.method11325(class36.field240);
                  var16.field3664.method11236(var3);
                  client.field314.prepData(var16);
               }
            } else if (var2 == 8) {
               var20 = (class81)var13.method8567((long)var3);
               if (var20 != null) {
                  client.field505 = var8;
                  client.field506 = var9;
                  client.field508 = 2;
                  client.field485 = 0;
                  client.field581 = var0;
                  client.field531 = var1;
                  var16 = class130.method3593(class327.field3597, client.field314.field1308);
                  var16.field3664.method11238(client.field407);
                  var16.field3664.method11238(client.field530);
                  var16.field3664.method11227(client.field551.method6138(82) ? 1 : 0);
                  var16.field3664.writeShortBigEndian(var3);
                  var16.field3664.writeIntBigEndian(class433.field5116);
                  client.field314.prepData(var16);
               }
            } else if (var2 == 9) {
               var20 = (class81)var13.method8567((long)var3);
               if (var20 != null) {
                  client.field505 = var8;
                  client.field506 = var9;
                  client.field508 = 2;
                  client.field485 = 0;
                  client.field581 = var0;
                  client.field531 = var1;
                  var16 = class130.method3593(class327.field3593, client.field314.field1308);
                  var16.field3664.method11325(var3);
                  var16.field3664.method11229(client.field551.method6138(82) ? 1 : 0);
                  client.field314.prepData(var16);
               }
            } else if (var2 == 10) {
               var20 = (class81)var13.method8567((long)var3);
               if (var20 != null) {
                  client.field505 = var8;
                  client.field506 = var9;
                  client.field508 = 2;
                  client.field485 = 0;
                  client.field581 = var0;
                  client.field531 = var1;
                  var16 = class130.method3593(class327.field3615, client.field314.field1308);
                  var16.field3664.method11325(var3);
                  var16.field3664.method11228(client.field551.method6138(82) ? 1 : 0);
                  client.field314.prepData(var16);
               }
            } else if (var2 == 11) {
               var20 = (class81)var13.method8567((long)var3);
               if (var20 != null) {
                  client.field505 = var8;
                  client.field506 = var9;
                  client.field508 = 2;
                  client.field485 = 0;
                  client.field581 = var0;
                  client.field531 = var1;
                  var16 = class130.method3593(class327.field3633, client.field314.field1308);
                  var16.field3664.method11236(var3);
                  var16.field3664.method11229(client.field551.method6138(82) ? 1 : 0);
                  client.field314.prepData(var16);
               }
            } else if (var2 == 12) {
               var20 = (class81)var13.method8567((long)var3);
               if (var20 != null) {
                  client.field505 = var8;
                  client.field506 = var9;
                  client.field508 = 2;
                  client.field485 = 0;
                  client.field581 = var0;
                  client.field531 = var1;
                  var16 = class130.method3593(class327.field3631, client.field314.field1308);
                  var16.field3664.method11229(client.field551.method6138(82) ? 1 : 0);
                  var16.field3664.method11325(var3);
                  client.field314.prepData(var16);
               }
            } else if (var2 == 13) {
               var20 = (class81)var13.method8567((long)var3);
               if (var20 != null) {
                  client.field505 = var8;
                  client.field506 = var9;
                  client.field508 = 2;
                  client.field485 = 0;
                  client.field581 = var0;
                  client.field531 = var1;
                  var16 = class130.method3593(class327.field3589, client.field314.field1308);
                  var16.field3664.writeShortBigEndian(var3);
                  var16.field3664.method11228(client.field551.method6138(82) ? 1 : 0);
                  client.field314.prepData(var16);
               }
            } else {
               class69 var22;
               if (var2 == 14) {
                  var22 = (class69)var14.method8567((long)var3);
                  if (var22 != null) {
                     client.field505 = var8;
                     client.field506 = var9;
                     client.field508 = 2;
                     client.field485 = 0;
                     client.field581 = var0;
                     client.field531 = var1;
                     var16 = class130.method3593(class327.field3563, client.field314.field1308);
                     var16.field3664.method11238(class232.field2800);
                     var16.field3664.putIntCustomEndian(class325.field3537);
                     var16.field3664.method11238(var3);
                     var16.field3664.method11229(client.field551.method6138(82) ? 1 : 0);
                     var16.field3664.method11325(class36.field240);
                     client.field314.prepData(var16);
                  }
               } else if (var2 == 15) {
                  var22 = (class69)var14.method8567((long)var3);
                  if (var22 != null) {
                     client.field505 = var8;
                     client.field506 = var9;
                     client.field508 = 2;
                     client.field485 = 0;
                     client.field581 = var0;
                     client.field531 = var1;
                     var16 = class130.method3593(class327.field3609, client.field314.field1308);
                     var16.field3664.method11229(client.field551.method6138(82) ? 1 : 0);
                     var16.field3664.method11325(client.field530);
                     var16.field3664.method11238(client.field407);
                     var16.field3664.method11238(var3);
                     var16.field3664.putIntLittleEndian(class433.field5116);
                     client.field314.prepData(var16);
                  }
               } else if (var2 == 16) {
                  client.field505 = var8;
                  client.field506 = var9;
                  client.field508 = 2;
                  client.field485 = 0;
                  client.field581 = var0;
                  client.field531 = var1;
                  var15 = class130.method3593(class327.field3566, client.field314.field1308);
                  var15.field3664.method11238(var3);
                  var15.field3664.putIntLittleEndian(class325.field3537);
                  var15.field3664.method11227(client.field551.method6138(82) ? 1 : 0);
                  var15.field3664.method11236(class36.field240);
                  var15.field3664.writeShortBigEndian(class232.field2800);
                  var15.field3664.method11236(var12 + var1);
                  var15.field3664.writeShortBigEndian(var0 + var11);
                  client.field314.prepData(var15);
               } else if (var2 == 17) {
                  client.field505 = var8;
                  client.field506 = var9;
                  client.field508 = 2;
                  client.field485 = 0;
                  client.field581 = var0;
                  client.field531 = var1;
                  var15 = class130.method3593(class327.field3562, client.field314.field1308);
                  var15.field3664.method11238(client.field530);
                  var15.field3664.writeIntBigEndian(class433.field5116);
                  var15.field3664.method11238(var3);
                  var15.field3664.method11228(client.field551.method6138(82) ? 1 : 0);
                  var15.field3664.method11238(client.field407);
                  var15.field3664.writeShortBigEndian(var12 + var1);
                  var15.field3664.method11236(var0 + var11);
                  client.field314.prepData(var15);
               } else if (var2 == 18) {
                  client.field505 = var8;
                  client.field506 = var9;
                  client.field508 = 2;
                  client.field485 = 0;
                  client.field581 = var0;
                  client.field531 = var1;
                  var15 = class130.method3593(class327.field3545, client.field314.field1308);
                  var15.field3664.writeByte(client.field551.method6138(82) ? 1 : 0);
                  var15.field3664.method11238(var3);
                  var15.field3664.writeShortBigEndian(var0 + var11);
                  var15.field3664.writeShortBigEndian(var12 + var1);
                  client.field314.prepData(var15);
               } else if (var2 == 19) {
                  client.field505 = var8;
                  client.field506 = var9;
                  client.field508 = 2;
                  client.field485 = 0;
                  client.field581 = var0;
                  client.field531 = var1;
                  var15 = class130.method3593(class327.field3571, client.field314.field1308);
                  var15.field3664.method11228(client.field551.method6138(82) ? 1 : 0);
                  var15.field3664.writeShortBigEndian(var0 + var11);
                  var15.field3664.writeShortBigEndian(var12 + var1);
                  var15.field3664.method11325(var3);
                  client.field314.prepData(var15);
               } else if (var2 == 20) {
                  client.field505 = var8;
                  client.field506 = var9;
                  client.field508 = 2;
                  client.field485 = 0;
                  client.field581 = var0;
                  client.field531 = var1;
                  var15 = class130.method3593(class327.field3641, client.field314.field1308);
                  var15.field3664.method11236(var0 + var11);
                  var15.field3664.method11227(client.field551.method6138(82) ? 1 : 0);
                  var15.field3664.method11238(var3);
                  var15.field3664.method11325(var12 + var1);
                  client.field314.prepData(var15);
               } else if (var2 == 21) {
                  client.field505 = var8;
                  client.field506 = var9;
                  client.field508 = 2;
                  client.field485 = 0;
                  client.field581 = var0;
                  client.field531 = var1;
                  var15 = class130.method3593(class327.field3543, client.field314.field1308);
                  var15.field3664.method11238(var3);
                  var15.field3664.writeShortBigEndian(var0 + var11);
                  var15.field3664.writeShortBigEndian(var12 + var1);
                  var15.field3664.writeByte(client.field551.method6138(82) ? 1 : 0);
                  client.field314.prepData(var15);
               } else if (var2 == 22) {
                  client.field505 = var8;
                  client.field506 = var9;
                  client.field508 = 2;
                  client.field485 = 0;
                  client.field581 = var0;
                  client.field531 = var1;
                  var15 = class130.method3593(class327.field3546, client.field314.field1308);
                  var15.field3664.method11238(var12 + var1);
                  var15.field3664.method11229(client.field551.method6138(82) ? 1 : 0);
                  var15.field3664.writeShortBigEndian(var3);
                  var15.field3664.method11325(var0 + var11);
                  client.field314.prepData(var15);
               } else if (var2 == 23) {
                  if (client.field521) {
                     var10.field1159.method5131();
                  } else {
                     var10.field1159.method5292(true);
                  }
               } else {
                  class329 var18;
                  class369 var23;
                  if (var2 == 24) {
                     var23 = class119.field1554.method7476(var1);
                     if (var23 != null) {
                        boolean var19 = true;
                        if (var23.field4168 > 0) {
                           var19 = class354.method7398(var23);
                        }

                        if (var19) {
                           var18 = class130.method3593(class327.field3588, client.field314.field1308);
                           var18.field3664.writeIntBigEndian(var1);
                           client.field314.prepData(var18);
                        }
                     }
                  } else {
                     if (var2 == 25) {
                        var23 = class119.field1554.method7477(var1, var0);
                        if (var23 != null) {
                           class402.method8270();
                           class39.method767(var1, var0, class537.method10543(class373.method8139(var23)), var4);
                           client.field357 = 0;
                           client.field374 = class286.method6374(var23);
                           if (client.field374 == null) {
                              client.field374 = "null";
                           }

                           if (var23.field4143) {
                              client.field533 = var23.field4227 + class134.method3619(16777215);
                           } else {
                              client.field533 = class134.method3619(65280) + var23.field4298 + class134.method3619(16777215);
                           }
                        }

                        return;
                     }

                     if (var2 == 26) {
                        class10.method104();
                     } else {
                        int var17;
                        class369 var21;
                        if (var2 == 28) {
                           var15 = class130.method3593(class327.field3588, client.field314.field1308);
                           var15.field3664.writeIntBigEndian(var1);
                           client.field314.prepData(var15);
                           var21 = class119.field1554.method7476(var1);
                           if (var21 != null && var21.field4274 != null && var21.field4274[0][0] == 5) {
                              var17 = var21.field4274[0][1];
                              class355.field4022[var17] = 1 - class355.field4022[var17];
                              class371.method8125(var17);
                           }
                        } else if (var2 == 29) {
                           var15 = class130.method3593(class327.field3588, client.field314.field1308);
                           var15.field3664.writeIntBigEndian(var1);
                           client.field314.prepData(var15);
                           var21 = class119.field1554.method7476(var1);
                           if (var21 != null && var21.field4274 != null && var21.field4274[0][0] == 5) {
                              var17 = var21.field4274[0][1];
                              if (class355.field4022[var17] != var21.field4191[0]) {
                                 class355.field4022[var17] = var21.field4191[0];
                                 class371.method8125(var17);
                              }
                           }
                        } else if (var2 == 30) {
                           if (client.field564 == null) {
                              class115.method3468(var1, var0);
                              client.field564 = class119.field1554.method7477(var1, var0);
                              class89.method2877(client.field564);
                           }
                        } else if (var2 == 44) {
                           var22 = (class69)var14.method8567((long)var3);
                           if (var22 != null) {
                              client.field505 = var8;
                              client.field506 = var9;
                              client.field508 = 2;
                              client.field485 = 0;
                              client.field581 = var0;
                              client.field531 = var1;
                              var16 = class130.method3593(class327.field3590, client.field314.field1308);
                              var16.field3664.method11236(var3);
                              var16.field3664.method11228(client.field551.method6138(82) ? 1 : 0);
                              client.field314.prepData(var16);
                           }
                        } else if (var2 == 45) {
                           var22 = (class69)var14.method8567((long)var3);
                           if (var22 != null) {
                              client.field505 = var8;
                              client.field506 = var9;
                              client.field508 = 2;
                              client.field485 = 0;
                              client.field581 = var0;
                              client.field531 = var1;
                              var16 = class130.method3593(class327.field3565, client.field314.field1308);
                              var16.field3664.writeShortBigEndian(var3);
                              var16.field3664.method11227(client.field551.method6138(82) ? 1 : 0);
                              client.field314.prepData(var16);
                           }
                        } else if (var2 == 46) {
                           var22 = (class69)var14.method8567((long)var3);
                           if (var22 != null) {
                              client.field505 = var8;
                              client.field506 = var9;
                              client.field508 = 2;
                              client.field485 = 0;
                              client.field581 = var0;
                              client.field531 = var1;
                              var16 = class130.method3593(class327.field3601, client.field314.field1308);
                              var16.field3664.method11227(client.field551.method6138(82) ? 1 : 0);
                              var16.field3664.method11238(var3);
                              client.field314.prepData(var16);
                           }
                        } else if (var2 == 47) {
                           var22 = (class69)var14.method8567((long)var3);
                           if (var22 != null) {
                              client.field505 = var8;
                              client.field506 = var9;
                              client.field508 = 2;
                              client.field485 = 0;
                              client.field581 = var0;
                              client.field531 = var1;
                              var16 = class130.method3593(class327.field3614, client.field314.field1308);
                              var16.field3664.writeShortBigEndian(var3);
                              var16.field3664.writeByte(client.field551.method6138(82) ? 1 : 0);
                              client.field314.prepData(var16);
                           }
                        } else if (var2 == 48) {
                           var22 = (class69)var14.method8567((long)var3);
                           if (var22 != null) {
                              client.field505 = var8;
                              client.field506 = var9;
                              client.field508 = 2;
                              client.field485 = 0;
                              client.field581 = var0;
                              client.field531 = var1;
                              var16 = class130.method3593(class327.field3580, client.field314.field1308);
                              var16.field3664.method11238(var3);
                              var16.field3664.method11228(client.field551.method6138(82) ? 1 : 0);
                              client.field314.prepData(var16);
                           }
                        } else if (var2 == 49) {
                           var22 = (class69)var14.method8567((long)var3);
                           if (var22 != null) {
                              client.field505 = var8;
                              client.field506 = var9;
                              client.field508 = 2;
                              client.field485 = 0;
                              client.field581 = var0;
                              client.field531 = var1;
                              var16 = class130.method3593(class327.field3558, client.field314.field1308);
                              var16.field3664.method11325(var3);
                              var16.field3664.writeByte(client.field551.method6138(82) ? 1 : 0);
                              client.field314.prepData(var16);
                           }
                        } else if (var2 == 50) {
                           var22 = (class69)var14.method8567((long)var3);
                           if (var22 != null) {
                              client.field505 = var8;
                              client.field506 = var9;
                              client.field508 = 2;
                              client.field485 = 0;
                              client.field581 = var0;
                              client.field531 = var1;
                              var16 = class130.method3593(class327.field3556, client.field314.field1308);
                              var16.field3664.writeShortBigEndian(var3);
                              var16.field3664.method11229(client.field551.method6138(82) ? 1 : 0);
                              client.field314.prepData(var16);
                           }
                        } else if (var2 == 51) {
                           var22 = (class69)var14.method8567((long)var3);
                           if (var22 != null) {
                              client.field505 = var8;
                              client.field506 = var9;
                              client.field508 = 2;
                              client.field485 = 0;
                              client.field581 = var0;
                              client.field531 = var1;
                              var16 = class130.method3593(class327.field3570, client.field314.field1308);
                              var16.field3664.method11228(client.field551.method6138(82) ? 1 : 0);
                              var16.field3664.method11238(var3);
                              client.field314.prepData(var16);
                           }
                        } else {
                           label663: {
                              if (var2 != 57) {
                                 if (var2 == 58) {
                                    var23 = class119.field1554.method7477(var1, var0);
                                    if (var23 != null) {
                                       if (var23.field4302 != null) {
                                          class65 var25 = new class65();
                                          var25.field893 = var23;
                                          var25.field891 = var3;
                                          var25.field901 = var7;
                                          var25.field898 = var23.field4302;
                                          class329.method7047(var25);
                                       }

                                       var16 = class130.method3593(class327.field3557, client.field314.field1308);
                                       var16.field3664.method11325(client.field530);
                                       var16.field3664.putIntLittleEndian(var1);
                                       var16.field3664.method11238(var4);
                                       var16.field3664.method11238(var0);
                                       var16.field3664.writeIntBigEndian(class433.field5116);
                                       var16.field3664.writeShortBigEndian(client.field407);
                                       client.field314.prepData(var16);
                                    }
                                    break label663;
                                 }

                                 if (var2 == 60) {
                                    client.field505 = var8;
                                    client.field506 = var9;
                                    client.field508 = 1;
                                    client.field485 = 0;
                                    client.field583 = var3;
                                    client.field584 = 30;
                                    var15 = class130.method3593(class327.field3619, client.field314.field1308);
                                    var15.field3664.method11227(var3);
                                    client.field314.prepData(var15);
                                    break label663;
                                 }

                                 class505 var26;
                                 if (var2 == 61) {
                                    var26 = (class505)var10.field1171.method8596((long)var3);
                                    if (var26 != null) {
                                       client.field505 = var8;
                                       client.field506 = var9;
                                       client.field508 = 2;
                                       client.field485 = 0;
                                       client.field581 = var0;
                                       client.field531 = var1;
                                       var16 = class130.method3593(class327.field3600, client.field314.field1308);
                                       var16.field3664.method11238(var3);
                                       var16.field3664.method11227(client.field551.method6138(82) ? 1 : 0);
                                       var16.field3664.putIntCustomEndian234(class325.field3537);
                                       var16.field3664.method11238(class232.field2800);
                                       var16.field3664.method11238(class36.field240);
                                       client.field314.prepData(var16);
                                    }
                                    break label663;
                                 }

                                 if (var2 == 62) {
                                    var26 = (class505)var10.field1171.method8596((long)var3);
                                    if (var26 != null) {
                                       client.field505 = var8;
                                       client.field506 = var9;
                                       client.field508 = 2;
                                       client.field485 = 0;
                                       client.field581 = var0;
                                       client.field531 = var1;
                                       var16 = class130.method3593(class327.field3581, client.field314.field1308);
                                       var16.field3664.method11236(client.field530);
                                       var16.field3664.putIntCustomEndian(class433.field5116);
                                       var16.field3664.method11238(var3);
                                       var16.field3664.writeByte(client.field551.method6138(82) ? 1 : 0);
                                       var16.field3664.method11238(client.field407);
                                       client.field314.prepData(var16);
                                    }
                                    break label663;
                                 }

                                 if (var2 == 63) {
                                    client.field505 = var8;
                                    client.field506 = var9;
                                    client.field508 = 2;
                                    client.field485 = 0;
                                    client.field581 = var0;
                                    client.field531 = var1;
                                    var15 = class130.method3593(class327.field3567, client.field314.field1308);
                                    var15.field3664.method11229(client.field551.method6138(82) ? 1 : 0);
                                    var15.field3664.writeShortBigEndian(var3);
                                    client.field314.prepData(var15);
                                    break label663;
                                 }

                                 if (var2 == 64) {
                                    client.field505 = var8;
                                    client.field506 = var9;
                                    client.field508 = 2;
                                    client.field485 = 0;
                                    client.field581 = var0;
                                    client.field531 = var1;
                                    var15 = class130.method3593(class327.field3574, client.field314.field1308);
                                    var15.field3664.method11228(client.field551.method6138(82) ? 1 : 0);
                                    var15.field3664.method11238(var3);
                                    client.field314.prepData(var15);
                                    break label663;
                                 }

                                 if (var2 == 65) {
                                    client.field505 = var8;
                                    client.field506 = var9;
                                    client.field508 = 2;
                                    client.field485 = 0;
                                    client.field581 = var0;
                                    client.field531 = var1;
                                    var15 = class130.method3593(class327.field3542, client.field314.field1308);
                                    var15.field3664.method11238(var3);
                                    var15.field3664.writeByte(client.field551.method6138(82) ? 1 : 0);
                                    client.field314.prepData(var15);
                                    break label663;
                                 }

                                 if (var2 == 66) {
                                    client.field505 = var8;
                                    client.field506 = var9;
                                    client.field508 = 2;
                                    client.field485 = 0;
                                    client.field581 = var0;
                                    client.field531 = var1;
                                    var15 = class130.method3593(class327.field3595, client.field314.field1308);
                                    var15.field3664.method11325(var3);
                                    var15.field3664.writeByte(client.field551.method6138(82) ? 1 : 0);
                                    client.field314.prepData(var15);
                                    break label663;
                                 }

                                 if (var2 == 67) {
                                    client.field505 = var8;
                                    client.field506 = var9;
                                    client.field508 = 2;
                                    client.field485 = 0;
                                    client.field581 = var0;
                                    client.field531 = var1;
                                    var15 = class130.method3593(class327.field3561, client.field314.field1308);
                                    var15.field3664.method11238(var3);
                                    var15.field3664.method11228(client.field551.method6138(82) ? 1 : 0);
                                    client.field314.prepData(var15);
                                    break label663;
                                 }

                                 if (var2 == 1001) {
                                    client.field505 = var8;
                                    client.field506 = var9;
                                    client.field508 = 2;
                                    client.field485 = 0;
                                    client.field581 = var0;
                                    client.field531 = var1;
                                    var15 = class130.method3593(class327.field3629, client.field314.field1308);
                                    var15.field3664.writeShortBigEndian(var0 + var11);
                                    var15.field3664.method11325(var12 + var1);
                                    var15.field3664.writeShortBigEndian(var3);
                                    var15.field3664.method11227(client.field551.method6138(82) ? 1 : 0);
                                    client.field314.prepData(var15);
                                    break label663;
                                 }

                                 if (var2 == 1002) {
                                    client.field505 = var8;
                                    client.field506 = var9;
                                    client.field508 = 2;
                                    client.field485 = 0;
                                    var15 = class130.method3593(class327.field3569, client.field314.field1308);
                                    var15.field3664.method11236(var3);
                                    client.field314.prepData(var15);
                                    break label663;
                                 }

                                 if (var2 == 1003) {
                                    client.field505 = var8;
                                    client.field506 = var9;
                                    client.field508 = 2;
                                    client.field485 = 0;
                                    var20 = (class81)var13.method8567((long)var3);
                                    if (var20 != null) {
                                       class195 var24 = var20.field1184;
                                       if (var24.field2099 != null) {
                                          var24 = var24.method4365();
                                       }

                                       if (var24 != null) {
                                          var18 = class130.method3593(class327.field3623, client.field314.field1308);
                                          var18.field3664.writeShortBigEndian(var24.field2107);
                                          client.field314.prepData(var18);
                                       }
                                    }
                                    break label663;
                                 }

                                 if (var2 == 1004) {
                                    client.field505 = var8;
                                    client.field506 = var9;
                                    client.field508 = 2;
                                    client.field485 = 0;
                                    var15 = class130.method3593(class327.field3618, client.field314.field1308);
                                    var15.field3664.writeShortBigEndian(var12 + var1);
                                    var15.field3664.method11236(var0 + var11);
                                    var15.field3664.method11238(var3);
                                    client.field314.prepData(var15);
                                    break label663;
                                 }

                                 if (var2 != 1007) {
                                    if (var2 != 1010 && var2 != 1011 && var2 != 1008 && var2 != 1009 && var2 != 1012) {
                                       if (var2 == 1013) {
                                          client.field505 = var8;
                                          client.field506 = var9;
                                          client.field508 = 2;
                                          client.field485 = 0;
                                          var15 = class130.method3593(class327.field3628, client.field314.field1308);
                                          var15.field3664.method11236(var3);
                                          client.field314.prepData(var15);
                                       }
                                    } else {
                                       class56.field816.method10720(var2, var3, new class356(var0), new class356(var1));
                                    }
                                    break label663;
                                 }
                              }

                              var23 = class119.field1554.method7477(var1, var0);
                              if (var23 != null) {
                                 class311.method6928(var3, var1, var0, var4, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         if (client.field357 != 0) {
            client.field357 = 0;
            class89.method2877(class119.field1554.method7476(class325.field3537));
         }

         if (client.field529) {
            class402.method8270();
         }

      }
   }
}
