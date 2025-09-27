package runescape;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
public class FriendSystem {
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lva;"
   )
   final LoginType field644;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Ltq;"
   )
   public final class494 field642;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   public final class492 field645;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 906619781
   )
   int field648 = 0;

   @ObfuscatedSignature(
      descriptor = "(Lva;)V"
   )
   FriendSystem(LoginType var1) {
      this.field644 = var1;
      this.field642 = new class494(var1);
      this.field645 = new class492(var1);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1992390271"
   )
   boolean method1535() {
      return this.field648 == 2;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "3515"
   )
   final void method1536() {
      this.field648 = 1;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lwb;II)V",
      garbageValue = "572106873"
   )
   final void method1592(Buffer var1, int var2) {
      this.field642.method9869(var1, var2);
      this.field648 = 2;
      class329.method7052();
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-638155798"
   )
   final void method1562() {
      for(class497 var1 = (class497)this.field642.field5374.method8830(); var1 != null; var1 = (class497)this.field642.field5374.method8823()) {
         if ((long)var1.field5389 < class189.method4284() / 1000L - 5L) {
            if (var1.field5388 > 0) {
               class90.method2893(5, "", var1.field5391 + " has logged in.");
            }

            if (var1.field5388 == 0) {
               class90.method2893(5, "", var1.field5391 + " has logged out.");
            }

            var1.method10549();
         }
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1334844356"
   )
   final void method1539() {
      this.field648 = 0;
      this.field642.method9971();
      this.field645.method9971();
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Lxa;ZS)Z",
      garbageValue = "5193"
   )
   final boolean method1540(class613 var1, boolean var2) {
      if (var1 == null) {
         return false;
      } else if (var1.equals(class76.field1108.field934)) {
         return true;
      } else {
         return this.field642.method9868(var1, var2);
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Lxa;I)Z",
      garbageValue = "1591772425"
   )
   final boolean method1541(class613 var1) {
      if (var1 == null) {
         return false;
      } else {
         return this.field645.method9974(var1);
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1927072818"
   )
   final void method1542(String var1) {
      if (var1 != null) {
         class613 var2 = new class613(var1, this.field644);
         if (var2.method11911()) {
            if (this.method1543()) {
               class206.method4512("Your friend list is full. Max of 200 for free users, and 400 for members");
            } else if (class76.field1108.field934.equals(var2)) {
               class206.method4512("You can't add yourself to your own friend list");
            } else if (this.method1540(var2, false)) {
               class431.method8647(var1);
            } else if (this.method1541(var2)) {
               class206.method4512("Please remove " + var1 + " from your ignore list first");
            } else {
               class100.method3117(var1);
            }
         }
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1228820208"
   )
   final boolean method1543() {
      return this.field642.method9995() || this.field642.method9972() >= 200 && client.field344 != 1;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-27"
   )
   final void method1537(String var1) {
      if (var1 != null) {
         class613 var2 = new class613(var1, this.field644);
         if (var2.method11911()) {
            if (this.method1544()) {
               class206.method4512("Your ignore list is full. Max of 100 for free users, and 400 for members");
            } else if (class76.field1108.field934.equals(var2)) {
               class206.method4512("You can't add yourself to your own ignore list");
            } else if (this.method1541(var2)) {
               class55.method2006(var1);
            } else if (this.method1540(var2, false)) {
               class206.method4512("Please remove " + var1 + " from your friend list first");
            } else {
               class161.method3908(var1);
            }
         }
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2039564455"
   )
   final boolean method1544() {
      return this.field645.method9995() || this.field645.method9972() >= 100 && client.field344 != 1;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-24871720"
   )
   final void method1567(String var1) {
      if (var1 != null) {
         class613 var2 = new class613(var1, this.field644);
         if (var2.method11911()) {
            if (this.field642.method9978(var2)) {
               client.field555 = client.field404;
               class329 var3 = EnumComposition.getPacketBufferNode(ClientPackets.field3638, client.packetWriter.isaacCipher);
               var3.out.writeByte(class288.method6418(var1));
               var3.out.writeNullTermString(var1);
               client.packetWriter.addNode(var3);
            }

            class329.method7052();
         }
      }
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZI)V",
      garbageValue = "-1379584929"
   )
   public final void method1547(String var1, boolean var2) {
      if (var1 != null) {
         class613 var3 = new class613(var1, this.field644);
         if (var3.method11911()) {
            if (this.field645.method9978(var3)) {
               client.field555 = client.field404;
               if (var2) {
                  class329 var4 = EnumComposition.getPacketBufferNode(ClientPackets.field3607, client.packetWriter.isaacCipher);
                  var4.out.writeByte(class288.method6418(var1));
                  var4.out.writeNullTermString(var1);
                  client.packetWriter.addNode(var4);
               }
            }

            class19.method296();
         }
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lxa;I)Z",
      garbageValue = "-1292272667"
   )
   final boolean method1538(class613 var1) {
      class496 var2 = (class496)this.field642.method10013(var1);
      return var2 != null && var2.method10056();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)Z",
      garbageValue = "556520645"
   )
   public static boolean method1590(CharSequence var0) {
      boolean var2 = false;
      boolean var3 = false;
      int var4 = 0;
      int var5 = var0.length();
      int var6 = 0;

      boolean var1;
      while(true) {
         if (var6 >= var5) {
            var1 = var3;
            break;
         }

         label85: {
            char var7 = var0.charAt(var6);
            if (var6 == 0) {
               if (var7 == '-') {
                  var2 = true;
                  break label85;
               }

               if (var7 == '+') {
                  break label85;
               }
            }

            int var9;
            if (var7 >= '0' && var7 <= '9') {
               var9 = var7 - 48;
            } else if (var7 >= 'A' && var7 <= 'Z') {
               var9 = var7 - 55;
            } else {
               if (var7 < 'a' || var7 > 'z') {
                  var1 = false;
                  break;
               }

               var9 = var7 - 87;
            }

            if (var9 >= 10) {
               var1 = false;
               break;
            }

            if (var2) {
               var9 = -var9;
            }

            int var8 = var9 + var4 * 10;
            if (var4 != var8 / 10) {
               var1 = false;
               break;
            }

            var4 = var8;
            var3 = true;
         }

         ++var6;
      }

      return var1;
   }

   @ObfuscatedName("hc")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "113"
   )
   static void method1534() {
      if (client.field401 == class70.field969) {
         class115.field1514 = class212.method4651(class410.field4933.field4954, false, true, true, false);
         class358.field4042 = class212.method4651(class410.field4935.field4954, true, true, true, false);
         class496.field5387 = class212.method4651(class410.field4937.field4954, false, true, true, false);
         class27.field130 = class212.method4651(class410.field4928.field4954, false, true, true, false);
         class145.field1726 = class212.method4651(class410.field4953.field4954, true, false, true, false);
         class159.field1830 = class212.method4651(class410.field4943.field4954, false, true, true, false);
         class193.field2091 = class212.method4651(class410.field4944.field4954, false, true, true, false);
         class416.field5019 = class212.method4651(class410.field4936.field4954, true, true, true, false);
         class423.method8556(20, "Connecting to update server");
         class68.method2161(class70.field970);
      } else {
         int var0;
         byte var33;
         if (client.field401 == class70.field970) {
            var33 = 0;
            var0 = var33 + class115.field1514.method8288() * 53 / 100;
            var0 += class358.field4042.method8288() * 5 / 100;
            var0 += class496.field5387.method8288() * 36 / 100;
            var0 += class27.field130.method8288() / 100;
            var0 += class145.field1726.method8288() / 100;
            var0 += class159.field1830.method8288() * 2 / 100;
            var0 += class193.field2091.method8288() / 100;
            var0 += class416.field5019.method8287() && class416.field5019.method8340() ? 1 : 0;
            if (var0 != 100) {
               if (var0 != 0) {
                  class423.method8556(30, "Checking for updates - " + var0 + "%");
               }

            } else {
               class62.method2100(class115.field1514, "Sound FX");
               class62.method2100(class358.field4042, "Music Tracks");
               class62.method2100(class496.field5387, "Sprites");
               class62.method2100(class159.field1830, "Music Samples");
               class62.method2100(class193.field2091, "Music Patches");
               class332.field3827 = new class523();
               class332.field3827.method10435(class416.field5019);
               class423.method8556(40, "Loaded update list");
               class68.method2161(class70.field965);
            }
         } else {
            int var5;
            if (client.field401 == class70.field965) {
               class127.method3575(22050, !client.field565, 2);
               ArrayList var36 = new ArrayList(3);
               class258 var24 = class122.field1566;
               short var29 = 2048;
               if (class97.field1356 == 0) {
                  throw new IllegalStateException();
               } else {
                  if (var29 < 512) {
                     var29 = 512;
                  }

                  class97 var27;
                  try {
                     class97 var28 = class199.field2176.vmethod3355();
                     var28.field1340 = new int[(class97.field1339 ? 2 : 1) * 512];
                     var28.field1345 = var29;
                     var28.vmethod3066();
                     var28.field1350 = (var29 & -2048) + 2048;
                     if (var28.field1350 > 32768) {
                        var28.field1350 = 32768;
                     }

                     var28.vmethod3056(var28.field1350);
                     if (class65.field904 > 0 && class220.field2575 == null) {
                        class220.field2575 = new class99();
                        class97.field1346 = Executors.newScheduledThreadPool(1);
                        class97.field1346.scheduleAtFixedRate(class220.field2575, 0L, 10L, TimeUnit.MILLISECONDS);
                     }

                     if (class220.field2575 != null) {
                        if (class220.field2575.field1370[0] != null) {
                           throw new IllegalArgumentException();
                        }

                        class220.field2575.field1370[0] = var28;
                     }

                     var27 = var28;
                  } catch (Throwable var23) {
                     var27 = new class97();
                  }

                  class70.field963 = var27;
                  class28.field144 = new class93();
                  class93 var30 = new class93();
                  var30.method2958(class28.field144);

                  for(var5 = 0; var5 < 3; ++var5) {
                     class340 var32 = new class340(class70.field963);
                     var32.method7152(9, 128);
                     var30.method2958(var32);
                     var36.add(var32);
                  }

                  class70.field963.method3047(var30);
                  class186.method4239(class193.field2091, class159.field1830, class115.field1514, var36);
                  class423.method8556(60, "Prepared sound engine");
                  class68.method2161(class70.field978);
               }
            } else if (client.field401 == class70.field978) {
               if (class514.field5467 == null) {
                  class514.field5467 = new class555(class496.field5387, class145.field1726);
               }

               var0 = class556.method10844().length;
               client.field387 = class514.field5467.method10839(class556.method10844());
               if (client.field387.size() < var0) {
                  class423.method8556(80, "Loading fonts - " + client.field387.size() * 100 / var0 + "%");
               } else {
                  class342.field3947 = (class461)client.field387.get(class556.field5751);
                  class463.field5239 = (class461)client.field387.get(class556.field5742);
                  class333.field3831 = (class461)client.field387.get(class556.field5743);
                  Occluder.platformInfo = client.field418.vmethod10587();
                  class423.method8556(80, "Loaded fonts");
                  class68.method2161(class70.field960);
               }
            } else {
               class409 var2;
               int var3;
               int var16;
               class409 var25;
               if (client.field401 == class70.field960) {
                  var25 = class27.field130;
                  var2 = class496.field5387;
                  var3 = 0;
                  String[] var26 = class52.field759;

                  String var31;
                  for(var5 = 0; var5 < var26.length; ++var5) {
                     var31 = var26[var5];
                     if (var25.method8357(var31, "")) {
                        ++var3;
                     }
                  }

                  var26 = class52.field760;

                  for(var5 = 0; var5 < var26.length; ++var5) {
                     var31 = var26[var5];
                     if (var2.method8357(var31, "")) {
                        ++var3;
                     }
                  }

                  var26 = class52.field761;

                  for(var5 = 0; var5 < var26.length; ++var5) {
                     var31 = var26[var5];
                     if (var2.method8361(var31) != -1 && var2.method8357(var31, "")) {
                        ++var3;
                     }
                  }

                  var16 = class226.method5014(class496.field5387);
                  if (var3 < var16) {
                     class423.method8556(90, "Loading title screen - " + var3 * 100 / var16 + "%");
                  } else {
                     class423.method8556(100, "Loaded title screen");
                     if (class509.isBetaBuild) {
                        class121.updateGameState(5);
                        class68.method2161(class70.field976);
                     } else {
                        class68.method2161(class70.field962);
                     }

                  }
               } else if (client.field401 == class70.field976) {
                  class121.updateGameState(10);
               } else if (class70.field962 == client.field401) {
                  class418.field5030 = class212.method4651(class410.field4929.field4954, false, true, true, false);
                  class66.field913 = class212.method4651(class410.field4950.field4954, false, true, true, true);
                  class273.field3204 = class212.method4651(class410.field4930.field4954, false, true, true, false);
                  class182.field1986 = class212.method4651(class410.field4931.field4954, true, false, true, false);
                  class48.field688 = class212.method4651(class410.field4952.field4954, false, true, true, false);
                  class149.field1760 = class212.method4651(class410.field4942.field4954, true, true, true, false);
                  class485.field5345 = class212.method4651(class410.field4934.field4954, false, true, true, false);
                  class176.field1956 = class212.method4651(class410.field4938.field4954, false, true, true, false);
                  class259.field3100 = class212.method4651(class410.field4945.field4954, false, true, true, false);
                  class334.field3841 = class212.method4651(class410.field4939.field4954, false, true, true, false);
                  class551.field5661 = class212.method4651(class410.field4946.field4954, false, true, true, false);
                  class311.field3506 = class212.method4651(class410.field4932.field4954, false, true, true, false);
                  class40.field280 = class212.method4651(class410.field4948.field4954, false, true, true, false);
                  class286.field3302 = class212.method4651(class410.field4949.field4954, false, true, true, false);
                  class37.field253 = class134.method3618(class410.field4941.field4954, false, true, true, true, true);
                  class423.method8556(20, "Connecting to update server");
                  class68.method2161(class70.field966);
               } else if (class70.field966 == client.field401) {
                  var33 = 0;
                  var0 = var33 + class418.field5030.method8288() * 4 / 100;
                  var0 += class66.field913.method8288() / 100;
                  var0 += class273.field3204.method8288() * 2 / 100;
                  var0 += class182.field1986.method8288() / 100;
                  var0 += class48.field688.method8288() / 100;
                  var0 += class149.field1760.method8288() * 10 / 100;
                  var0 += class485.field5345.method8288() * 65 / 100;
                  var0 += class176.field1956.method8288() / 100;
                  var0 += class259.field3100.method8288() / 100;
                  var0 += class334.field3841.method8288() * 6 / 100;
                  var0 += class311.field3506.method8288() / 100;
                  var0 += class551.field5661.method8288() * 2 / 100;
                  var0 += class40.field280.method8288() * 2 / 100;
                  var0 += class286.field3302.method8288() / 100;
                  var0 += class37.field253.method8288() * 2 / 100;
                  if (var0 != 100) {
                     if (var0 != 0) {
                        class423.method8556(30, "Checking for updates - " + var0 + "%");
                     }

                  } else {
                     class62.method2100(class418.field5030, "Animations");
                     class62.method2100(class66.field913, "Animation Keyframes");
                     class62.method2100(class273.field3204, "Skeletons");
                     class62.method2100(class149.field1760, "Maps");
                     class62.method2100(class485.field5345, "Models");
                     class62.method2100(class259.field3100, "Music Jingles");
                     class62.method2100(class311.field3506, "World Map");
                     class62.method2100(class551.field5661, "World Map Geography");
                     class62.method2100(class40.field280, "World Map Ground");
                     class423.method8556(30, "Loaded update list");
                     class68.method2161(class70.field964);
                  }
               } else if (class70.field964 == client.field401) {
                  class333.field3836 = client.field333.method2380(104, 104, class36.clientPreferences.method2585());
                  class484.field5343 = class333.field3836;
                  class245.field2992 = new class605(512, 512);
                  class423.method8556(30, "Starting game engine...");
                  class68.method2161(class70.field968);
               } else if (class70.field968 == client.field401) {
                  if (!class182.field1986.method8340()) {
                     class423.method8556(40, "Loading config - " + class182.field1986.method8299() + "%");
                  } else if (!class286.field3302.method8340()) {
                     class423.method8556(40, "Loading config - " + (80 + class334.field3841.method8299() / 6) + "%");
                  } else {
                     class67.method2156(class182.field1986);
                     class226.method5022(class182.field1986);
                     class517.method10310(class182.field1986, class485.field5345);
                     class409 var35 = class182.field1986;
                     var25 = class485.field5345;
                     boolean var37 = client.field565;
                     class212.field2317 = var35;
                     class308.field3499 = var25;
                     class212.field2316 = var37;
                     class139.method3713(class182.field1986, class485.field5345);
                     class35.method730(class182.field1986);
                     class183.method4177(class182.field1986, class485.field5345, client.field326, class342.field3947);
                     class409 var18 = class182.field1986;
                     class409 var4 = class418.field5030;
                     class409 var38 = class66.field913;
                     class409 var6 = class273.field3204;
                     UserComparator5.field1611 = var18;
                     class215.field2465 = var4;
                     class454.field5183 = var38;
                     class216.field2510 = var6;
                     class135.method3657(class182.field1986, class485.field5345);
                     class121.method3528(class182.field1986);
                     class265.method5993(class182.field1986);
                     int var7 = class4.field8;
                     class422.field5047 = new int[var7];
                     class355.field4022 = new int[var7];
                     class119.field1554 = new class358(class48.field688, class485.field5345, class496.field5387, class145.field1726, class37.field253);
                     class525.method10440(class182.field1986);
                     class28.method453(class182.field1986);
                     class409 var8 = class182.field1986;
                     class185.field2018 = var8;
                     class146.method3777(class182.field1986);
                     class409 var9 = class182.field1986;
                     class208.field2275 = var9;
                     class409 var10 = class182.field1986;
                     class16.field65 = var10;
                     class212.method4632(class182.field1986);
                     class409 var11 = class182.field1986;
                     class579.field5839 = var11;
                     class161.field1835 = new class568(StudioGame.field5084, 54, class242.field2970, class182.field1986);
                     class56.field817 = new class568(StudioGame.field5084, 47, class242.field2970, class182.field1986);
                     class516.varcs = new class90();
                     class409 var12 = class182.field1986;
                     class409 var13 = class496.field5387;
                     class409 var14 = class145.field1726;
                     class40.field277 = var12;
                     class210.field2287 = var13;
                     class90.field1280 = var14;
                     class127.method3573(class182.field1986, class496.field5387);
                     class497.method9922(class182.field1986, class496.field5387);
                     class423.method8556(50, "Loaded config");
                     class68.method2161(class70.field961);
                  }
               } else if (class70.field961 == client.field401) {
                  var0 = 0;
                  if (class168.field1904 == null) {
                     class168.field1904 = class100.method3145(class496.field5387, class332.field3827.field5529, 0);
                  } else {
                     ++var0;
                  }

                  if (class181.field1976 == null) {
                     class181.field1976 = class100.method3145(class496.field5387, class332.field3827.field5539, 0);
                  } else {
                     ++var0;
                  }

                  class604[] var1;
                  class604[] var19;
                  int var20;
                  class604 var21;
                  if (class34.field202 == null) {
                     var2 = class496.field5387;
                     var3 = class332.field3827.field5524;
                     if (!class587.method11132(var2, var3, 0)) {
                        var1 = null;
                     } else {
                        var19 = new class604[class606.field6026];

                        for(var20 = 0; var20 < class606.field6026; ++var20) {
                           var21 = var19[var20] = new class604();
                           var21.field6005 = class606.field6025;
                           var21.field6008 = class581.field5847;
                           var21.field6009 = class149.field1763[var20];
                           var21.field6011 = class191.field2082[var20];
                           var21.field6007 = class255.field3068[var20];
                           var21.field6010 = class497.field5390[var20];
                           var21.field6006 = class504.field5414;
                           var21.field6012 = class7.field25[var20];
                        }

                        class388.method8205();
                        var1 = var19;
                     }

                     class34.field202 = var1;
                  } else {
                     ++var0;
                  }

                  if (class213.field2438 == null) {
                     class213.field2438 = class463.method9400(class496.field5387, class332.field3827.field5532, 0);
                  } else {
                     ++var0;
                  }

                  if (class77.field1137 == null) {
                     class77.field1137 = class463.method9400(class496.field5387, class332.field3827.field5528, 0);
                  } else {
                     ++var0;
                  }

                  if (class400.field4848 == null) {
                     class400.field4848 = class463.method9400(class496.field5387, class332.field3827.field5534, 0);
                  } else {
                     ++var0;
                  }

                  if (class208.field2276 == null) {
                     class208.field2276 = class463.method9400(class496.field5387, class332.field3827.field5533, 0);
                  } else {
                     ++var0;
                  }

                  if (class195.field2156 == null) {
                     class195.field2156 = class463.method9400(class496.field5387, class332.field3827.field5536, 0);
                  } else {
                     ++var0;
                  }

                  if (class200.field2185 == null) {
                     class200.field2185 = class463.method9400(class496.field5387, class332.field3827.field5537, 0);
                  } else {
                     ++var0;
                  }

                  if (class255.field3065 == null) {
                     var2 = class496.field5387;
                     var3 = class332.field3827.field5538;
                     if (!class587.method11132(var2, var3, 0)) {
                        var1 = null;
                     } else {
                        var19 = new class604[class606.field6026];

                        for(var20 = 0; var20 < class606.field6026; ++var20) {
                           var21 = var19[var20] = new class604();
                           var21.field6005 = class606.field6025;
                           var21.field6008 = class581.field5847;
                           var21.field6009 = class149.field1763[var20];
                           var21.field6011 = class191.field2082[var20];
                           var21.field6007 = class255.field3068[var20];
                           var21.field6010 = class497.field5390[var20];
                           var21.field6006 = class504.field5414;
                           var21.field6012 = class7.field25[var20];
                        }

                        class388.method8205();
                        var1 = var19;
                     }

                     class255.field3065 = var1;
                  } else {
                     ++var0;
                  }

                  if (class432.field5104 == null) {
                     var2 = class496.field5387;
                     var3 = class332.field3827.field5530;
                     if (!class587.method11132(var2, var3, 0)) {
                        var1 = null;
                     } else {
                        var19 = new class604[class606.field6026];

                        for(var20 = 0; var20 < class606.field6026; ++var20) {
                           var21 = var19[var20] = new class604();
                           var21.field6005 = class606.field6025;
                           var21.field6008 = class581.field5847;
                           var21.field6009 = class149.field1763[var20];
                           var21.field6011 = class191.field2082[var20];
                           var21.field6007 = class255.field3068[var20];
                           var21.field6010 = class497.field5390[var20];
                           var21.field6006 = class504.field5414;
                           var21.field6012 = class7.field25[var20];
                        }

                        class388.method8205();
                        var1 = var19;
                     }

                     class432.field5104 = var1;
                  } else {
                     ++var0;
                  }

                  if (var0 < 11) {
                     class423.method8556(70, "Loading sprites - " + var0 * 100 / 12 + "%");
                  } else {
                     class465.field5246 = class432.field5104;
                     class181.field1976.method11698();
                     int var22 = (int)(Math.random() * 21.0D) - 10;
                     int var17 = (int)(Math.random() * 21.0D) - 10;
                     var3 = (int)(Math.random() * 21.0D) - 10;
                     var16 = (int)(Math.random() * 41.0D) - 20;
                     class34.field202[0].method11670(var16 + var22, var16 + var17, var3 + var16);
                     class423.method8556(60, "Loaded sprites");
                     class68.method2161(class70.field967);
                  }
               } else if (class70.field967 == client.field401) {
                  if (!class176.field1956.method8340()) {
                     class423.method8556(70, "Loading textures - " + "0%");
                  } else {
                     class518.field5498 = new class237(class176.field1956, class496.field5387, 20, class36.clientPreferences.method2566(), 128);
                     class225.method4928(class518.field5498);
                     class225.method4929(class36.clientPreferences.method2566());
                     class68.method2161(class70.field971);
                  }
               } else if (client.field401 == class70.field971) {
                  var0 = class518.field5498.method5386();
                  if (var0 < 100) {
                     class423.method8556(80, "Loading textures - " + var0 + "%");
                  } else {
                     class423.method8556(90, "Loaded textures");
                     class68.method2161(class70.field972);
                  }
               } else if (class70.field972 == client.field401) {
                  class398.mouseRecorder = new class66();
                  class122.field1566.method5889(class398.mouseRecorder, 10);
                  class423.method8556(92, "Loaded input handler");
                  class68.method2161(class70.field973);
               } else if (class70.field973 == client.field401) {
                  if (!class27.field130.method8357("huffman", "")) {
                     class423.method8556(94, "Loading wordpack - " + 0 + "%");
                  } else {
                     class375 var34 = new class375(class27.field130.method8371("huffman", ""));
                     class376.field4328 = var34;
                     class423.method8556(94, "Loaded wordpack");
                     class68.method2161(class70.field974);
                  }
               } else if (class70.field974 == client.field401) {
                  if (!class48.field688.method8340()) {
                     class423.method8556(96, "Loading interfaces - " + class48.field688.method8299() * 4 / 5 + "%");
                  } else if (!class37.field253.method8340()) {
                     class423.method8556(96, "Loading interfaces - " + class37.field253.method8299() * 4 / 5 + "%");
                  } else if (!class334.field3841.method8340()) {
                     class423.method8556(96, "Loading interfaces - " + (80 + class334.field3841.method8299() / 6) + "%");
                  } else if (!class145.field1726.method8340()) {
                     class423.method8556(96, "Loading interfaces - " + (96 + class145.field1726.method8299() / 50) + "%");
                  } else {
                     class423.method8556(98, "Loaded interfaces");
                     if (class334.field3841.method8355("version.dat", "")) {
                        Buffer var15 = new Buffer(class334.field3841.method8371("version.dat", ""));
                        var15.readUnsignedShort();
                     }

                     class68.method2161(class70.field975);
                  }
               } else if (client.field401 == class70.field975) {
                  if (class311.field3506.method8344() > 0 && !class311.field3506.method8358(class308.field3498.field3496)) {
                     class423.method8556(100, "Loading world map - " + class311.field3506.method8360(class308.field3498.field3496) / 10 + "%");
                  } else {
                     if (class56.field816 == null) {
                        class56.field816 = new class554();
                        class56.field816.method10638(class311.field3506, class551.field5661, class40.field280, class333.field3831, client.field387, class34.field202);
                     }

                     class423.method8556(100, "Loaded world map");
                     if (class509.isBetaBuild) {
                        class68.method2161(class70.field977);
                     } else {
                        class68.method2161(class70.field976);
                     }

                  }
               } else {
                  if (client.field401 == class70.field977) {
                     System.out.println(" Wrong something logging out setting state 20");
                     class55.field793 = false;
                     class121.updateGameState(20);
                     HitSplatDefinition.method10432(class43.field311);
                  }

               }
            }
         }
      }
   }

   @ObfuscatedName("mc")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "826664543"
   )
   static boolean method1591(int var0, int var1) {
      if (var1 >= 2000) {
         var1 -= 2000;
      }

      class516 var2 = client.field333.method2378(var0);
      class505 var3 = (class505)client.field333.method2343().field1171.method8596((long)var0);
      boolean var4 = var0 == -1;
      boolean var5 = var0 == client.field346;
      boolean var6 = false;
      boolean var9;
      if (var3 != null) {
         var6 = var3.method10072() != class394.field4796;
         if (!var5) {
            class380 var7 = var3.field5425.method4457();
            if (class154.method3838(var1) && !var7.field4372) {
               return false;
            }

            var9 = var1 == 1 || var1 == 2 || var1 >= 3 && var1 <= 6 || var1 == 1001;
            boolean var10 = var9 || class16.method218(var1);
            boolean var11;
            if (!var10) {
               var11 = var1 == 16 || var1 == 17 || var1 >= 18 && var1 <= 22;
               var10 = var11;
            }

            var11 = var10;
            if (!var10) {
               boolean var12 = var1 >= 61 && var1 <= 67;
               var11 = var12;
            }

            if (var11 && !var7.field4377) {
               return false;
            }
         }
      }

      boolean var13 = var1 == 1 || var1 == 2 || var1 >= 3 && var1 <= 6 || var1 == 1001;
      if (var13 && !var2.method10278(var6, var4, var5)) {
         return false;
      } else {
         boolean var8 = var1 == 16 || var1 == 17 || var1 >= 18 && var1 <= 22;
         if (var8 && !var2.method10279(var6, var4, var5)) {
            return false;
         } else if (class16.method218(var1) && !var2.method10280(var6, var4, var5)) {
            return false;
         } else {
            var9 = var1 == 14 || var1 == 15 || var1 >= 44 && var1 <= 51;
            if (var9 && !var2.method10281(var6, var4, var5)) {
               return false;
            } else if (var1 == 1002 && !var2.method10285(var6, var4, var5)) {
               return false;
            } else if (var1 == 1004 && !var2.method10282(var6, var4, var5)) {
               return false;
            } else {
               return var1 != 1003 || var2.method10283(var6, var4, var5);
            }
         }
      }
   }
}
