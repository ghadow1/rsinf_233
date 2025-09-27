package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vf")
public class class556 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lvf;"
   )
   public static final class556 field5751 = new class556("p11_full");
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lvf;"
   )
   public static final class556 field5742 = new class556("p12_full");
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lvf;"
   )
   public static final class556 field5743 = new class556("b12_full");
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lvf;"
   )
   public static final class556 field5744 = new class556("verdana_11pt_regular");
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lvf;"
   )
   public static final class556 field5745 = new class556("verdana_13pt_regular");
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lvf;"
   )
   public static final class556 field5746 = new class556("verdana_15pt_regular");
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   static class271 field5741;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -1402417377
   )
   static int field5750;
   @ObfuscatedName("ro")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   static class241 field5748;
   @ObfuscatedName("ao")
   String field5753;

   class556(String var1) {
      this.field5753 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)[Lvf;",
      garbageValue = "1774305818"
   )
   public static class556[] method10844() {
      return new class556[]{field5744, field5745, field5743, field5746, field5751, field5742};
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lti;B)I",
      garbageValue = "62"
   )
   public static int method10842(class519 var0) {
      class218.method4826(var0, (class574)null, false);
      byte var1 = 0;
      int var2 = var0.method10322();
      int var3 = -1;
      int var8;
      if (var0.field5504 == class574.field5820) {
         int[] var4 = var0.method10318();

         for(var8 = var1; var8 < var2; ++var8) {
            if (var3 == -1 || var4[var8] < var4[var3]) {
               var3 = var8;
            }
         }
      } else if (var0.field5504 == class574.field5816) {
         long[] var9 = var0.method10320();

         for(var8 = var1; var8 < var2; ++var8) {
            if (var3 == -1 || var9[var8] < var9[var3]) {
               var3 = var8;
            }
         }
      } else if (var0.field5504 == class574.field5824) {
         String var10 = null;
         Object[] var5 = var0.method10321();

         for(int var6 = var1; var6 < var2; ++var6) {
            String var7 = (String)var5[var6];
            if (var3 == -1 || var7 != null && var7.compareTo(var10) < 0) {
               var3 = var6;
               var10 = var7;
            }
         }
      }

      return var3;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lwb;II)V",
      garbageValue = "-173169752"
   )
   public static void method10841(Buffer var0, int var1) {
      if (class260.field3104 != null) {
         try {
            class260.field3104.method10916(0L);
            class260.field3104.method10937(var0.array, var1, 24);
         } catch (Exception var3) {
         }
      }

   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "-1363231406"
   )
   static int method10849(int var0, class55 var1, boolean var2) {
      String var7;
      if (var0 == 3100) {
         var7 = (String)class46.field660[--class46.field658];
         class90.method2893(0, "", var7);
         return 1;
      } else if (var0 == 3101) {
         class124.field1569 -= 2;
         class163.method3993(class76.field1108, class46.field659[class124.field1569], class46.field659[class124.field1569 + 1]);
         return 1;
      } else if (var0 == 3103) {
         if (!class46.field652) {
            class46.field667 = true;
         }

         return 1;
      } else {
         int var15;
         if (var0 == 3104) {
            var7 = (String)class46.field660[--class46.field658];
            var15 = 0;
            if (FriendSystem.method1590(var7)) {
               var15 = class190.method4308(var7);
            }

            class329 var13 = EnumComposition.getPacketBufferNode(ClientPackets.field3627, client.packetWriter.isaacCipher);
            var13.out.writeIntBigEndian(var15);
            client.packetWriter.addNode(var13);
            return 1;
         } else {
            class329 var11;
            if (var0 == 3105) {
               var7 = (String)class46.field660[--class46.field658];
               var11 = EnumComposition.getPacketBufferNode(ClientPackets.field3636, client.packetWriter.isaacCipher);
               var11.out.writeByte(var7.length() + 1);
               var11.out.writeNullTermString(var7);
               client.packetWriter.addNode(var11);
               return 1;
            } else if (var0 == 3106) {
               var7 = (String)class46.field660[--class46.field658];
               var11 = EnumComposition.getPacketBufferNode(ClientPackets.field3586, client.packetWriter.isaacCipher);
               var11.out.writeByte(var7.length() + 1);
               var11.out.writeNullTermString(var7);
               client.packetWriter.addNode(var11);
               return 1;
            } else {
               int var3;
               String var4;
               if (var0 == 3107) {
                  var3 = class46.field659[--class124.field1569];
                  var4 = (String)class46.field660[--class46.field658];
                  class306.method6862(var3, var4);
                  return 1;
               } else if (var0 == 3108) {
                  class124.field1569 -= 3;
                  var3 = class46.field659[class124.field1569];
                  var15 = class46.field659[class124.field1569 + 1];
                  int var9 = class46.field659[class124.field1569 + 2];
                  class369 var14 = class119.field1554.method7476(var9);
                  class584.method11130(var14, var3, var15);
                  return 1;
               } else if (var0 == 3109) {
                  class124.field1569 -= 2;
                  var3 = class46.field659[class124.field1569];
                  var15 = class46.field659[class124.field1569 + 1];
                  class369 var12 = var2 ? class19.field81 : class141.field1714;
                  class584.method11130(var12, var3, var15);
                  return 1;
               } else if (var0 == 3110) {
                  class423.field5058 = class46.field659[--class124.field1569] == 1;
                  return 1;
               } else if (var0 == 3111) {
                  class46.field659[++class124.field1569 - 1] = class36.clientPreferences.method2672() ? 1 : 0;
                  return 1;
               } else if (var0 == 3112) {
                  class36.clientPreferences.method2556(class46.field659[--class124.field1569] == 1);
                  return 1;
               } else if (var0 == 3113) {
                  var7 = (String)class46.field660[--class46.field658];
                  boolean var8 = class46.field659[--class124.field1569] == 1;
                  class22.method330(var7, var8, false);
                  return 1;
               } else if (var0 == 3115) {
                  var3 = class46.field659[--class124.field1569];
                  var11 = EnumComposition.getPacketBufferNode(ClientPackets.field3591, client.packetWriter.isaacCipher);
                  var11.out.writeShortBigEndian(var3);
                  client.packetWriter.addNode(var11);
                  return 1;
               } else if (var0 == 3116) {
                  var3 = class46.field659[--class124.field1569];
                  class46.field658 -= 2;
                  var4 = (String)class46.field660[class46.field658];
                  String var5 = (String)class46.field660[class46.field658 + 1];
                  if (var4.length() > 500) {
                     return 1;
                  } else if (var5.length() > 500) {
                     return 1;
                  } else {
                     class329 var6 = EnumComposition.getPacketBufferNode(ClientPackets.field3612, client.packetWriter.isaacCipher);
                     var6.out.writeShortBigEndian(1 + class288.method6418(var4) + class288.method6418(var5));
                     var6.out.writeNullTermString(var5);
                     var6.out.writeMedium(var3);
                     var6.out.writeNullTermString(var4);
                     client.packetWriter.addNode(var6);
                     return 1;
                  }
               } else if (var0 == 3117) {
                  --class124.field1569;
                  return 1;
               } else if (var0 == 3118) {
                  client.field527 = class46.field659[--class124.field1569] == 1;
                  return 1;
               } else if (var0 == 3119) {
                  client.field391 = class46.field659[--class124.field1569] == 1;
                  return 1;
               } else if (var0 == 3120) {
                  if (class46.field659[--class124.field1569] == 1) {
                     client.field350 |= 1;
                  } else {
                     client.field350 &= -2;
                  }

                  return 1;
               } else if (var0 == 3121) {
                  if (class46.field659[--class124.field1569] == 1) {
                     client.field350 |= 2;
                  } else {
                     client.field350 &= -3;
                  }

                  return 1;
               } else if (var0 == 3122) {
                  if (class46.field659[--class124.field1569] == 1) {
                     client.field350 |= 4;
                  } else {
                     client.field350 &= -5;
                  }

                  return 1;
               } else if (var0 == 3123) {
                  if (class46.field659[--class124.field1569] == 1) {
                     client.field350 |= 8;
                  } else {
                     client.field350 &= -9;
                  }

                  return 1;
               } else if (var0 == 3124) {
                  client.field350 = 0;
                  return 1;
               } else if (var0 == 3125) {
                  client.showMouseCross = class46.field659[--class124.field1569] == 1;
                  return 1;
               } else if (var0 == 3126) {
                  client.field342 = class46.field659[--class124.field1569] == 1;
                  return 1;
               } else if (var0 == 3127) {
                  class216.method4819(class46.field659[--class124.field1569] == 1);
                  return 1;
               } else if (var0 == 3128) {
                  class46.field659[++class124.field1569 - 1] = class305.method6835() ? 1 : 0;
                  return 1;
               } else if (var0 == 3129) {
                  class124.field1569 -= 2;
                  client.field338 = class46.field659[class124.field1569];
                  client.field339 = class46.field659[class124.field1569 + 1];
                  return 1;
               } else if (var0 == 3130) {
                  class124.field1569 -= 2;
                  return 1;
               } else if (var0 == 3131) {
                  --class124.field1569;
                  return 1;
               } else if (var0 == 3132) {
                  class46.field659[++class124.field1569 - 1] = class34.screenWidth;
                  class46.field659[++class124.field1569 - 1] = class396.screenHeight;
                  return 1;
               } else if (var0 == 3133) {
                  --class124.field1569;
                  return 1;
               } else if (var0 == 3134) {
                  return 1;
               } else if (var0 == 3135) {
                  class124.field1569 -= 2;
                  return 1;
               } else if (var0 == 3136) {
                  client.field324 = 3;
                  client.field573 = class46.field659[--class124.field1569];
                  return 1;
               } else if (var0 == 3137) {
                  client.field324 = 2;
                  client.field573 = class46.field659[--class124.field1569];
                  return 1;
               } else if (var0 == 3138) {
                  client.field324 = 0;
                  return 1;
               } else if (var0 == 3139) {
                  client.field324 = 1;
                  return 1;
               } else if (var0 == 3140) {
                  client.field324 = 3;
                  client.field573 = var2 ? class19.field81.field4144 : class141.field1714.field4144;
                  return 1;
               } else {
                  boolean var10;
                  if (var0 == 3141) {
                     var10 = class46.field659[--class124.field1569] == 1;
                     class36.clientPreferences.method2558(var10);
                     return 1;
                  } else if (var0 == 3142) {
                     class46.field659[++class124.field1569 - 1] = class36.clientPreferences.method2557() ? 1 : 0;
                     return 1;
                  } else if (var0 == 3143) {
                     var10 = class46.field659[--class124.field1569] == 1;
                     client.Login_isUsernameRemembered = var10;
                     if (!var10) {
                        class36.clientPreferences.method2588("");
                     }

                     return 1;
                  } else if (var0 == 3144) {
                     class46.field659[++class124.field1569 - 1] = client.Login_isUsernameRemembered ? 1 : 0;
                     return 1;
                  } else if (var0 == 3145) {
                     return 1;
                  } else if (var0 == 3146) {
                     var10 = class46.field659[--class124.field1569] == 1;
                     class36.clientPreferences.method2560(!var10);
                     return 1;
                  } else if (var0 == 3147) {
                     class46.field659[++class124.field1569 - 1] = class36.clientPreferences.method2559() ? 0 : 1;
                     return 1;
                  } else if (var0 == 3148) {
                     return 1;
                  } else if (var0 == 3149) {
                     class46.field659[++class124.field1569 - 1] = 0;
                     return 1;
                  } else if (var0 == 3150) {
                     class46.field659[++class124.field1569 - 1] = 0;
                     return 1;
                  } else if (var0 == 3151) {
                     class46.field659[++class124.field1569 - 1] = 0;
                     return 1;
                  } else if (var0 == 3152) {
                     class46.field659[++class124.field1569 - 1] = 0;
                     return 1;
                  } else if (var0 == 3153) {
                     class46.field659[++class124.field1569 - 1] = class52.field733;
                     return 1;
                  } else if (var0 == 3154) {
                     class46.field659[++class124.field1569 - 1] = class537.method10536();
                     return 1;
                  } else if (var0 == 3155) {
                     --class46.field658;
                     return 1;
                  } else if (var0 == 3156) {
                     return 1;
                  } else if (var0 == 3157) {
                     class124.field1569 -= 2;
                     return 1;
                  } else if (var0 == 3158) {
                     class46.field659[++class124.field1569 - 1] = 0;
                     return 1;
                  } else if (var0 == 3159) {
                     class46.field659[++class124.field1569 - 1] = 0;
                     return 1;
                  } else if (var0 == 3160) {
                     class46.field659[++class124.field1569 - 1] = 0;
                     return 1;
                  } else if (var0 == 3161) {
                     --class124.field1569;
                     class46.field659[++class124.field1569 - 1] = 0;
                     return 1;
                  } else if (var0 == 3162) {
                     --class124.field1569;
                     class46.field659[++class124.field1569 - 1] = 0;
                     return 1;
                  } else if (var0 == 3163) {
                     --class46.field658;
                     class46.field659[++class124.field1569 - 1] = 0;
                     return 1;
                  } else if (var0 == 3164) {
                     --class124.field1569;
                     class46.field660[++class46.field658 - 1] = "";
                     return 1;
                  } else if (var0 == 3165) {
                     --class124.field1569;
                     class46.field659[++class124.field1569 - 1] = 0;
                     return 1;
                  } else if (var0 == 3166) {
                     class124.field1569 -= 2;
                     class46.field659[++class124.field1569 - 1] = 0;
                     return 1;
                  } else if (var0 == 3167) {
                     class124.field1569 -= 2;
                     class46.field659[++class124.field1569 - 1] = 0;
                     return 1;
                  } else if (var0 == 3168) {
                     class124.field1569 -= 2;
                     class46.field660[++class46.field658 - 1] = "";
                     class46.field660[++class46.field658 - 1] = "";
                     class46.field660[++class46.field658 - 1] = "";
                     class46.field660[++class46.field658 - 1] = "";
                     class46.field660[++class46.field658 - 1] = "";
                     class46.field660[++class46.field658 - 1] = "";
                     class46.field660[++class46.field658 - 1] = "";
                     class46.field660[++class46.field658 - 1] = "";
                     class46.field660[++class46.field658 - 1] = "";
                     return 1;
                  } else if (var0 == 3169) {
                     return 1;
                  } else if (var0 == 3170) {
                     class46.field659[++class124.field1569 - 1] = 0;
                     return 1;
                  } else if (var0 == 3171) {
                     class46.field659[++class124.field1569 - 1] = 0;
                     return 1;
                  } else if (var0 == 3172) {
                     --class124.field1569;
                     return 1;
                  } else if (var0 == 3173) {
                     --class124.field1569;
                     class46.field659[++class124.field1569 - 1] = 0;
                     return 1;
                  } else if (var0 == 3174) {
                     --class124.field1569;
                     return 1;
                  } else if (var0 == 3175) {
                     class46.field659[++class124.field1569 - 1] = 0;
                     return 1;
                  } else if (var0 == 3176) {
                     return 1;
                  } else if (var0 == 3177) {
                     return 1;
                  } else if (var0 == 3178) {
                     --class46.field658;
                     return 1;
                  } else if (var0 == 3179) {
                     return 1;
                  } else if (var0 == 3180) {
                     --class46.field658;
                     return 1;
                  } else if (var0 == 3181) {
                     class446.method8916(class46.field659[--class124.field1569]);
                     return 1;
                  } else if (var0 == 3182) {
                     class46.field659[++class124.field1569 - 1] = class190.method4305();
                     return 1;
                  } else if (var0 == 3185) {
                     var3 = class46.field659[--class124.field1569];
                     class36.clientPreferences.method2555(var3);
                     return 1;
                  } else if (var0 == 3186) {
                     var3 = class36.clientPreferences.method2585();
                     class46.field659[++class124.field1569 - 1] = var3;
                     return 1;
                  } else if (var0 == 3189) {
                     var3 = class46.field659[--class124.field1569];
                     class511.method10165(var3);
                     return 1;
                  } else {
                     return 2;
                  }
               }
            }
         }
      }
   }

   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "977260124"
   )
   static final void method10845() {
      class189.field2064.method7011();
      class191.field2081.method7011();
      class90.method2891();
      class381.method8178();
      class577.field5831.method7011();
      class190.field2066.method7011();
      class214.field2443.method7011();
      class202.field2211.method7011();
      class446.method8923();
      class210.field2290.method7011();
      class210.field2285.method7011();
      class210.field2286.method7011();
      client.method1114();
      class186.field2033.method7011();
      class177.field1959.method7011();
      class102.method3148();
      class159.method3885();
      class404.method8272();
      class18.method291();
      class167.method4031();
      class185.method4206();
      class215.field2466.method7011();
      class215.field2467.method7011();
      class215.field2468.method7011();
      class147.method3790();
      class70.method2237();
      class206.field2258.method7011();
      if (class161.field1835 != null) {
         class161.field1835.method10966();
      }

      if (class56.field817 != null) {
         class56.field817.method10966();
      }

      class166.method4023();
      class84.method2799();
      class185.field2015.method7011();
      class183.field1988.method7011();
      class178.field1963.method7011();
      class181.field1975.method7011();
      class162.method3991();
      class325.method7034();
      class204.field2250.method7011();
      client.field463.method7011();
      client.field451.method7011();
      class174.method4109();
      if (class119.field1554 != null) {
         class119.field1554.method7480();
      }

      if (class225.field2632.field3010 != null) {
         ((class237)class225.field2632.field3010).method5391();
      }

      class517.method10312();
      client.field603.method9820();
      if (class418.field5030 != null) {
         class418.field5030.method8429();
      }

      if (class66.field913 != null) {
         class66.field913.method8429();
      }

      if (class273.field3204 != null) {
         class273.field3204.method8429();
      }

      if (class27.field130 != null) {
         class27.field130.method8429();
      }

      if (class334.field3841 != null) {
         class334.field3841.method8429();
      }

      if (class182.field1986 != null) {
         class182.field1986.method8429();
      }

      if (class286.field3302 != null) {
         class286.field3302.method8429();
      }

      if (class416.field5019 != null) {
         class416.field5019.method8429();
      }

      if (class145.field1726 != null) {
         class145.field1726.method8429();
      }

      if (class48.field688 != null) {
         class48.field688.method8429();
      }

      if (class37.field253 != null) {
         class37.field253.method8429();
      }

      if (class115.field1514 != null) {
         class115.field1514.method8429();
      }

      if (class259.field3100 != null) {
         class259.field3100.method8429();
      }

      if (class149.field1760 != null) {
         class149.field1760.method8429();
      }

      if (class358.field4042 != null) {
         class358.field4042.method8429();
      }

      if (class485.field5345 != null) {
         class485.field5345.method8429();
      }

      if (class193.field2091 != null) {
         class193.field2091.method8429();
      }

      if (class496.field5387 != null) {
         class496.field5387.method8429();
      }

      if (class176.field1956 != null) {
         class176.field1956.method8429();
      }

      if (class159.field1830 != null) {
         class159.field1830.method8429();
      }

      if (class40.field280 != null) {
         class40.field280.method8429();
      }

      if (class551.field5661 != null) {
         class551.field5661.method8429();
      }

      if (class311.field3506 != null) {
         class311.field3506.method8429();
      }

   }
}
