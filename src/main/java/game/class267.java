package game;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("km")
public class class267 {
   @ObfuscatedName("pd")
   static int[][] field3170;
   @ObfuscatedName("aw")
   ArrayList field3162 = new ArrayList();
   @ObfuscatedName("at")
   ArrayList field3165 = new ArrayList();
   @ObfuscatedName("ac")
   ArrayList field3163 = new ArrayList();
   @ObfuscatedName("ap")
   String field3164 = null;
   @ObfuscatedName("aq")
   float[] field3171 = new float[4];
   @ObfuscatedName("ao")
   Map field3160 = new HashMap();
   @ObfuscatedName("as")
   Map field3169 = new HashMap();
   @ObfuscatedName("al")
   String field3168;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1614126997
   )
   int field3166 = 0;

   class267() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1785254874"
   )
   String method5996() {
      return this.field3168;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "87"
   )
   int method6005() {
      return this.field3166;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-125"
   )
   void method5998() {
      this.field3164 = null;
      this.field3171[0] = 0.0F;
      this.field3171[1] = 0.0F;
      this.field3171[2] = 1.0F;
      this.field3171[3] = 1.0F;
      this.field3162.clear();
      this.field3165.clear();
      this.field3163.clear();
      this.field3160.clear();
      this.field3169.clear();
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;ILel;I)Z",
      garbageValue = "-2093080640"
   )
   boolean method5999(JSONObject var1, int var2, class119 var3) {
      JSONObject var4 = var1;
      if (var2 < 2) {
         try {
            var4 = var4.getJSONObject("message");
         } catch (Exception var13) {
            this.method5998();
            return false;
         }

         try {
            this.method6000(var4.getJSONArray("images"), var3);
         } catch (Exception var12) {
            this.field3165.clear();
         }

         try {
            this.method6002(var4.getJSONArray("labels"));
         } catch (Exception var11) {
            this.field3163.clear();
         }
      } else {
         try {
            this.method6022(var4.getJSONObject("image"), var3);
         } catch (Exception var10) {
            this.field3165.clear();
         }

         try {
            this.method5997(var4.getJSONObject("label"));
         } catch (Exception var9) {
            this.field3163.clear();
         }
      }

      try {
         this.method6004(var4.getJSONObject("behaviour"));
      } catch (Exception var8) {
         this.field3164 = null;
         this.field3171[0] = 0.0F;
         this.field3171[1] = 0.0F;
         this.field3171[2] = 1.0F;
         this.field3171[3] = 1.0F;
         this.field3162.clear();
      }

      try {
         JSONObject var5 = var4.optJSONObject("meta");
         if (var5 != null) {
            this.method6029(var4.getJSONObject("meta"));
         }
      } catch (Exception var7) {
         this.field3160.clear();
         this.field3169.clear();
      }

      if (var2 == 2) {
         try {
            this.field3168 = var4.getString("id");
            this.field3166 = Integer.parseInt(var4.getString("priority"));
         } catch (Exception var6) {
         }
      }

      return true;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONArray;Lel;I)V",
      garbageValue = "-666105600"
   )
   void method6000(JSONArray var1, class119 var2) throws JSONException {
      if (var1 != null) {
         for(int var3 = 0; var3 < var1.length(); ++var3) {
            try {
               JSONObject var4 = var1.getJSONObject(var3);
               class257 var5 = new class257(this);
               var5.field3088 = var2.method3489(new URL(var4.getString("src")));
               var5.field3086 = class173.method4097(var4, "placement");
               this.field3165.add(var5);
            } catch (MalformedURLException var6) {
            }
         }

      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;Lel;I)V",
      garbageValue = "-56418049"
   )
   void method6022(JSONObject var1, class119 var2) throws JSONException {
      try {
         class257 var3 = new class257(this);
         var3.field3088 = var2.method3489(new URL(var1.getString("src")));
         var3.field3086 = class173.method4097(var1, "placement");
         this.field3165.add(var3);
      } catch (MalformedURLException var4) {
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONArray;I)V",
      garbageValue = "614781638"
   )
   void method6002(JSONArray var1) throws JSONException {
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.length(); ++var2) {
            JSONObject var3 = var1.getJSONObject(var2);
            class268 var4 = new class268(this);
            var4.field3173 = var3.getString("text");
            var4.field3175 = class200.method4402(var3.getString("align_x"));
            var4.field3176 = class200.method4402(var3.getString("align_y"));
            var4.field3177 = var3.getInt("font");
            var4.field3178 = class173.method4097(var3, "placement");
            this.field3163.add(var4);
         }

      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;B)V",
      garbageValue = "4"
   )
   void method5997(JSONObject var1) throws JSONException {
      class268 var2 = new class268(this);
      var2.field3173 = var1.optString("text");
      var2.field3175 = class200.method4402(var1.optString("align_x"));
      var2.field3176 = class200.method4402(var1.optString("align_y"));
      var2.field3177 = var1.optInt("font");
      var2.field3178 = class173.method4097(var1, "placement");
      this.field3163.add(var2);
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;I)V",
      garbageValue = "1250768624"
   )
   void method6004(JSONObject var1) throws JSONException {
      if (var1 != null) {
         this.field3171 = class173.method4097(var1, "clickbounds");
         this.field3164 = var1.getString("endpoint");
         String[] var2 = JSONObject.getNames(var1);

         for(int var3 = 0; var3 < var1.length(); ++var3) {
            if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
               try {
                  int var4 = var1.getInt(var2[var3]);
                  this.field3162.add(new class255(this, var2[var3], var4));
               } catch (Exception var8) {
                  try {
                     String var5 = var1.getString(var2[var3]);
                     if (var5.equals("true")) {
                        this.field3162.add(new class255(this, var2[var3], 1));
                     } else if (var5.equals("false")) {
                        this.field3162.add(new class255(this, var2[var3], 0));
                     } else {
                        this.field3162.add(new class264(this, var2[var3], var5));
                     }
                  } catch (Exception var7) {
                  }
               }
            }
         }

      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Lorg/json/JSONObject;I)V",
      garbageValue = "1514932381"
   )
   void method6029(JSONObject var1) throws JSONException {
      String[] var2 = JSONObject.getNames(var1);

      for(int var3 = 0; var3 < var1.length(); ++var3) {
         try {
            int var4 = var1.optInt(var2[var3]);
            this.field3160.put(var2[var3], var4);
         } catch (Exception var8) {
            try {
               String var5 = var1.optString(var2[var3]);
               if (var5.equals("true")) {
                  this.field3160.put(var2[var3], 1);
               } else if (var5.equals("false")) {
                  this.field3160.put(var2[var3], 0);
               } else {
                  this.field3169.put(var2[var3], var5);
               }
            } catch (Exception var7) {
            }
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lbl;Lrv;Lrv;B)V",
      garbageValue = "43"
   )
   static void method6042(class34 var0, class461 var1, class461 var2) {
      int var5;
      int var33;
      int var34;
      boolean var43;
      if (class52.field740) {
         class274 var32 = client.field551;
         class274 var4 = var32;

         while(true) {
            if (!var4.method6121()) {
               if (class35.field222 != 1 && (class423.field5058 || class35.field222 != 4)) {
                  break;
               }

               var5 = class52.field731 + 280;
               if (class35.field221 >= var5 && class35.field221 <= var5 + 14 && class35.field224 >= 4 && class35.field224 <= 18) {
                  class208.method4540(0, 0);
                  break;
               }

               if (class35.field221 >= var5 + 15 && class35.field221 <= var5 + 80 && class35.field224 >= 4 && class35.field224 <= 18) {
                  class208.method4540(0, 1);
                  break;
               }

               var33 = class52.field731 + 390;
               if (class35.field221 >= var33 && class35.field221 <= var33 + 14 && class35.field224 >= 4 && class35.field224 <= 18) {
                  class208.method4540(1, 0);
                  break;
               }

               if (class35.field221 >= var33 + 15 && class35.field221 <= var33 + 80 && class35.field224 >= 4 && class35.field224 <= 18) {
                  class208.method4540(1, 1);
                  break;
               }

               var34 = class52.field731 + 500;
               if (class35.field221 >= var34 && class35.field221 <= var34 + 14 && class35.field224 >= 4 && class35.field224 <= 18) {
                  class208.method4540(2, 0);
                  break;
               }

               if (class35.field221 >= var34 + 15 && class35.field221 <= var34 + 80 && class35.field224 >= 4 && class35.field224 <= 18) {
                  class208.method4540(2, 1);
                  break;
               }

               int var35 = class52.field731 + 610;
               if (class35.field221 >= var35 && class35.field221 <= var35 + 14 && class35.field224 >= 4 && class35.field224 <= 18) {
                  class208.method4540(3, 0);
                  break;
               }

               if (class35.field221 >= var35 + 15 && class35.field221 <= var35 + 80 && class35.field224 >= 4 && class35.field224 <= 18) {
                  class208.method4540(3, 1);
                  break;
               }

               if (class35.field221 >= class52.field731 + 708 && class35.field224 >= 4 && class35.field221 <= class52.field731 + 708 + 50 && class35.field224 <= 20) {
                  class521.method10431();
                  break;
               }

               if (class52.field748 != -1) {
                  class44 var36 = class44.field624[class52.field748];
                  var43 = class505.notEqualZero(client.field385);
                  boolean var44 = var36.method1470();
                  class509.isBeta = false;
                  var36.field638 = var44 ? "beta" : var36.field638;
                  class198.method4391(var36);
                  class521.method10431();
                  if (var44 != var43) {
                     class173.method4099();
                  }
               } else {
                  if (class52.field755 > 0 && class292.field3377 != null && class35.field221 >= 0 && class35.field221 <= class292.field3377.field6007 && class35.field224 >= class396.screenHeight / 2 - 50 && class35.field224 <= class396.screenHeight / 2 + 50) {
                     --class52.field755;
                  }

                  if (class52.field755 < class52.field756 && class411.field4957 != null && class35.field221 >= class34.screenWidth - class411.field4957.field6007 - 5 && class35.field221 <= class34.screenWidth && class35.field224 >= class396.screenHeight / 2 - 50 && class35.field224 <= class396.screenHeight / 2 + 50) {
                     ++class52.field755;
                  }
               }
               break;
            }

            if (var4.field3212 == 13) {
               class521.method10431();
               break;
            }

            if (var4.field3212 == 96) {
               if (class52.field755 > 0 && class292.field3377 != null) {
                  --class52.field755;
               }
            } else if (var4.field3212 == 97 && class52.field755 < class52.field756 && class411.field4957 != null) {
               ++class52.field755;
            }
         }

      } else {
         if ((class35.field222 == 1 || !class423.field5058 && class35.field222 == 4) && class35.field221 >= class52.field731 + 765 - 50 && class35.field224 >= 453 && class35.field221 < class52.field731 + 765 && class35.field224 < 503) {
            class36.field239.method2560(!class36.field239.method2559());
            if (class36.field239.method2559()) {
               class257.method5884(0, 0);
            } else {
               class257.method5884(0, 0);
               ArrayList var3 = new ArrayList();
               var3.add(new class351(class358.field4042, "scape main", "", 255, false));
               class271.method6081(var3, 0, 0, 0, 100, false);
            }

            class159.method3892();
         }

         if (client.field327 != 5) {
            if (-1L == class52.field757) {
               class52.field757 = class189.method4284() + 1000L;
            }

            long var21 = class189.method4284();
            if (class92.method2956() && class52.field734 == -1L) {
               class52.field734 = var21;
               if (class52.field734 > class52.field757) {
                  class52.field757 = class52.field734;
               }
            }

            if (client.field327 == 10 || client.field327 == 11) {
               if (class432.field5100 == class242.field2970) {
                  if (class35.field222 == 1 || !class423.field5058 && class35.field222 == 4) {
                     var5 = class52.field731 + 5;
                     short var6 = 463;
                     byte var7 = 100;
                     byte var8 = 35;
                     if (class35.field221 >= var5 && class35.field221 <= var7 + var5 && class35.field224 >= var6 && class35.field224 <= var6 + var8) {
                        if (class65.method2139()) {
                           class52.field740 = true;
                           class52.field755 = 0;
                           class52.field756 = 0;
                        }

                        return;
                     }
                  }

                  if (class44.field630 != null && class65.method2139()) {
                     class52.field740 = true;
                     class52.field755 = 0;
                     class52.field756 = 0;
                  }
               }

               var5 = class35.field222;
               var33 = class35.field221;
               var34 = class35.field224;
               if (var5 == 0) {
                  var33 = class35.field231;
                  var34 = class35.field220;
               }

               if (!class423.field5058 && var5 == 4) {
                  var5 = 1;
               }

               class274 var23 = client.field551;
               class274 var9 = var23;
               short var38;
               int var39;
               if (class52.field758 == 0) {
                  var43 = false;

                  while(var9.method6121()) {
                     if (var9.field3212 == 84) {
                        var43 = true;
                     }
                  }

                  var39 = class294.field3397 - 80;
                  var38 = 291;
                  if (var5 == 1 && var33 >= var39 - 75 && var33 <= var39 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                     class22.method330(class214.method4756("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var39 = class294.field3397 + 80;
                  if (var5 == 1 && var33 >= var39 - 75 && var33 <= var39 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20 || var43) {
                     class38.method742();
                  }
               } else if (class52.field758 == 1) {
                  var43 = class521.field5519.method799() || class521.field5519.method1413() || class521.field5519.method800();

                  while(var9.method6121()) {
                     if (var9.field3212 == 84) {
                        if (var43) {
                           class66.method2147("", "Connecting to server...", "");
                           client.field330 = class595.field5974;
                           class325.method7035(false);
                           class121.method3521(20);
                        } else {
                           class265.method5991(false);
                        }

                        return;
                     }

                     if (var9.field3212 == 13) {
                        class355.method7408(true);
                        return;
                     }
                  }

                  var39 = class294.field3397 - 80;
                  var38 = 321;
                  if (var5 == 1 && var33 >= var39 - 75 && var33 <= var39 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                     if (var43) {
                        class66.method2147("", "Connecting to server...", "");
                        client.field330 = class595.field5974;
                        class325.method7035(false);
                        class121.method3521(20);
                     } else {
                        class265.method5991(false);
                     }

                     return;
                  }

                  var39 = class294.field3397 + 80;
                  if (var5 == 1 && var33 >= var39 - 75 && var33 <= var39 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                     class355.method7408(true);
                     return;
                  }
               } else {
                  int var10;
                  short var37;
                  boolean var40;
                  if (class52.field758 == 2) {
                     var37 = 201;
                     var10 = var37 + 52;
                     if (var5 == 1 && var34 >= var10 - 12 && var34 < var10 + 2) {
                        class52.field750 = 0;
                     }

                     var10 += 15;
                     if (var5 == 1 && var34 >= var10 - 12 && var34 < var10 + 2) {
                        class52.field750 = 1;
                     }

                     var10 += 15;
                     var37 = 361;
                     if (class511.field5447 != null) {
                        var39 = class511.field5447.field5162 / 2;
                        if (var5 == 1 && var33 >= class511.field5447.field5160 - var39 && var33 <= var39 + class511.field5447.field5160 && var34 >= var37 - 15 && var34 < var37) {
                           switch(class52.field735) {
                           case 1:
                              class22.method330("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
                              return;
                           case 2:
                              class22.method330("https://support.runescape.com/hc/en-gb", true, false);
                           }
                        }
                     }

                     var39 = class294.field3397 - 80;
                     var38 = 321;
                     if (var5 == 1 && var33 >= var39 - 75 && var33 <= var39 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                        class137.method3665();
                        return;
                     }

                     var39 = class52.field741 + 180 + 80;
                     if (var5 == 1 && var33 >= var39 - 75 && var33 <= var39 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                        class78.method2677(0);
                        class52.local_password = "";
                        class52.field726 = "";
                        class38.field257 = 0;
                        class464.field5240 = "";
                        class52.field743 = true;
                     }

                     var39 = class294.field3397 + -117;
                     var38 = 277;
                     class52.field727 = var33 >= var39 && var33 < var39 + class33.field174 && var34 >= var38 && var34 < var38 + class537.field5577;
                     if (var5 == 1 && class52.field727) {
                        client.field331 = !client.field331;
                        if (!client.field331 && class36.field239.method2597() != null) {
                           class36.field239.method2588((String)null);
                        }
                     }

                     var39 = class294.field3397 + 24;
                     var38 = 277;
                     class52.field749 = var33 >= var39 && var33 < var39 + class33.field174 && var34 >= var38 && var34 < var38 + class537.field5577;
                     if (var5 == 1 && class52.field749) {
                        class36.field239.method2558(!class36.field239.method2557());
                        if (!class36.field239.method2557()) {
                           class52.local_password = "";
                           class36.field239.method2588((String)null);
                           if (client.field331 && class52.local_password != null && !class52.local_password.isEmpty()) {
                              class52.field750 = 1;
                           } else {
                              class52.field750 = 0;
                           }
                        }
                     }

                     label1506:
                     while(true) {
                        int var42;
                        Transferable var46;
                        do {
                           while(true) {
                              char var41;
                              label1470:
                              do {
                                 while(true) {
                                    while(var9.method6121()) {
                                       if (var9.field3212 != 13) {
                                          if (class52.field750 != 0) {
                                             continue label1470;
                                          }

                                          class9.method84(var9.field3215);
                                          if (var9.field3212 == 85 && !class52.local_password.isEmpty()) {
                                             class52.local_password = class52.local_password.substring(0, class52.local_password.length() - 1);
                                          }

                                          if (var9.field3212 == 84 || var9.field3212 == 80) {
                                             class52.field750 = 1;
                                          }

                                          var41 = var9.field3215;
                                          var40 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var41) != -1;
                                          if (var40 && class52.local_password.length() < 320) {
                                             class52.local_password = class52.local_password + var9.field3215;
                                          }
                                       } else {
                                          class78.method2677(0);
                                          class52.local_password = "";
                                          class52.field726 = "";
                                          class38.field257 = 0;
                                          class464.field5240 = "";
                                          class52.field743 = true;
                                       }
                                    }

                                    return;
                                 }
                              } while(class52.field750 != 1);

                              if (var9.field3212 == 85 && !class52.field726.isEmpty()) {
                                 class52.field726 = class52.field726.substring(0, class52.field726.length() - 1);
                              } else if (var9.field3212 == 84 || var9.field3212 == 80) {
                                 class52.field750 = 0;
                                 if (var9.field3212 == 84) {
                                    class137.method3665();
                                    return;
                                 }
                              }

                              if ((var9.method6138(82) || var9.method6138(87)) && var9.field3212 == 67) {
                                 Clipboard var45 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                 var46 = var45.getContents(class521.field5519);
                                 var42 = 20 - class52.field726.length();
                                 break;
                              }

                              if (class338.method7102(var9.field3215)) {
                                 var41 = var9.field3215;
                                 var40 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var41) != -1;
                                 if (var40 && class52.field726.length() < 20) {
                                    class52.field726 = class52.field726 + var9.field3215;
                                 }
                              }
                           }
                        } while(var42 <= 0);

                        try {
                           String var16 = (String)var46.getTransferData(DataFlavor.stringFlavor);
                           int var17 = Math.min(var42, var16.length());
                           int var18 = 0;

                           while(true) {
                              if (var18 >= var17) {
                                 class52.field726 = class52.field726 + var16.substring(0, var17);
                                 continue label1506;
                              }

                              if (!class338.method7102(var16.charAt(var18))) {
                                 break;
                              }

                              char var20 = var16.charAt(var18);
                              boolean var19 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var20) != -1;
                              if (!var19) {
                                 break;
                              }

                              ++var18;
                           }

                           class78.method2677(3);
                           return;
                        } catch (UnsupportedFlavorException var30) {
                        } catch (IOException var31) {
                        }
                     }
                  } else {
                     short var11;
                     class449 var26;
                     if (class52.field758 == 3) {
                        var10 = class52.field741 + 180;
                        var11 = 241;
                        var26 = var1.method9419(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var10, var11);
                        if (var5 == 1 && var26.method8976(var33, var34)) {
                           class22.method330("https://oldschool.runescape.com/launcher", true, false);
                        }

                        var10 = class52.field741 + 180;
                        var11 = 276;
                        if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                           class355.method7408(false);
                        }

                        var10 = class52.field741 + 180;
                        var11 = 326;
                        if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                           class22.method330("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
                           return;
                        }
                     } else {
                        int var13;
                        if (class52.field758 == 4) {
                           var10 = class52.field741 + 180 - 80;
                           var11 = 321;
                           if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                              class41.method782();
                              return;
                           }

                           if (var5 == 1 && var33 >= class52.field741 + 180 - 9 && var33 <= class52.field741 + 180 + 130 && var34 >= 263 && var34 <= 296) {
                              class52.field743 = !class52.field743;
                           }

                           if (var5 == 1 && var33 >= class52.field741 + 180 - 34 && var33 <= class52.field741 + 34 + 180 && var34 >= 351 && var34 <= 363) {
                              class22.method330("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
                           }

                           var10 = class52.field741 + 180 + 80;
                           if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                              class78.method2677(0);
                              class52.local_password = "";
                              class52.field726 = "";
                              class38.field257 = 0;
                              class464.field5240 = "";
                           }

                           while(var9.method6121()) {
                              boolean var12 = false;

                              for(var13 = 0; var13 < "1234567890".length(); ++var13) {
                                 if (var9.field3215 == "1234567890".charAt(var13)) {
                                    var12 = true;
                                    break;
                                 }
                              }

                              if (var9.field3212 == 13) {
                                 class78.method2677(0);
                                 class52.local_password = "";
                                 class52.field726 = "";
                                 class38.field257 = 0;
                                 class464.field5240 = "";
                              } else {
                                 if (var9.field3212 == 85 && !class464.field5240.isEmpty()) {
                                    class464.field5240 = class464.field5240.substring(0, class464.field5240.length() - 1);
                                 }

                                 if (var9.field3212 == 84) {
                                    class41.method782();
                                    return;
                                 }

                                 if (var12 && class464.field5240.length() < 6) {
                                    class464.field5240 = class464.field5240 + var9.field3215;
                                 }
                              }
                           }
                        } else {
                           int var14;
                           if (class52.field758 == 5) {
                              var10 = class52.field741 + 180 - 80;
                              var11 = 321;
                              if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                                 class64.method2132();
                                 return;
                              }

                              var10 = class52.field741 + 180 + 80;
                              if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                                 class265.method5991(true);
                              }

                              var38 = 361;
                              if (class537.field5585 != null) {
                                 var13 = class537.field5585.field5162 / 2;
                                 if (var5 == 1 && var33 >= class537.field5585.field5160 - var13 && var33 <= var13 + class537.field5585.field5160 && var34 >= var38 - 15 && var34 < var38) {
                                    class22.method330(class214.method4756("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                                 }
                              }

                              while(var9.method6121()) {
                                 var40 = false;

                                 for(var14 = 0; var14 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var14) {
                                    if (var9.field3215 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var14)) {
                                       var40 = true;
                                       break;
                                    }
                                 }

                                 if (var9.field3212 == 13) {
                                    class265.method5991(true);
                                 } else {
                                    if (var9.field3212 == 85 && !class52.local_password.isEmpty()) {
                                       class52.local_password = class52.local_password.substring(0, class52.local_password.length() - 1);
                                    }

                                    if (var9.field3212 == 84) {
                                       class64.method2132();
                                       return;
                                    }

                                    if (var40 && class52.local_password.length() < 320) {
                                       class52.local_password = class52.local_password + var9.field3215;
                                    }
                                 }
                              }
                           } else if (class52.field758 != 6) {
                              if (class52.field758 == 7) {
                                 if (class563.field5781 && !client.field591) {
                                    var10 = class294.field3397 - 150;
                                    var39 = var10 + 40 + 240 + 25;
                                    var38 = 231;
                                    var13 = var38 + 40;
                                    if (var5 == 1 && var33 >= var10 && var33 <= var39 && var34 >= var38 && var34 <= var13) {
                                       class52.field738 = class183.method4178(var10, var33);
                                    }

                                    var14 = class52.field741 + 180 - 80;
                                    short var15 = 321;
                                    boolean var27;
                                    if (var5 == 1 && var33 >= var14 - 75 && var33 <= var14 + 75 && var34 >= var15 - 20 && var34 <= var15 + 20) {
                                       var27 = class531.method10482();
                                       if (var27) {
                                          class121.method3521(50);
                                          return;
                                       }
                                    }

                                    var14 = class52.field741 + 180 + 80;
                                    if (var5 == 1 && var33 >= var14 - 75 && var33 <= var14 + 75 && var34 >= var15 - 20 && var34 <= var15 + 20) {
                                       class52.field739 = new String[8];
                                       class265.method5991(true);
                                    }

                                    while(var9.method6121()) {
                                       if (var9.field3212 == 101) {
                                          class52.field739[class52.field738] = null;
                                       }

                                       if (var9.field3212 == 85) {
                                          if (class52.field739[class52.field738] == null && class52.field738 > 0) {
                                             --class52.field738;
                                          }

                                          class52.field739[class52.field738] = null;
                                       }

                                       if (var9.field3215 >= '0' && var9.field3215 <= '9') {
                                          class52.field739[class52.field738] = "" + var9.field3215;
                                          if (class52.field738 < 7) {
                                             ++class52.field738;
                                          }
                                       }

                                       if (var9.field3212 == 84) {
                                          var27 = class531.method10482();
                                          if (var27) {
                                             class121.method3521(50);
                                          }

                                          return;
                                       }
                                    }
                                 } else {
                                    var10 = class52.field741 + 180 - 80;
                                    var11 = 321;
                                    if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                                       class22.method330(class214.method4756("secure", true) + "m=dob/set_dob.ws", true, false);
                                       class66.method2147("", "Page has opened in the browser.", "");
                                       class78.method2677(6);
                                       return;
                                    }

                                    var10 = class52.field741 + 180 + 80;
                                    if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                                       class265.method5991(true);
                                    }
                                 }
                              } else if (class52.field758 == 8) {
                                 var10 = class52.field741 + 180 - 80;
                                 var11 = 321;
                                 if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                                    class22.method330("https://www.jagex.com/terms/privacy", true, false);
                                    class66.method2147("", "Page has opened in the browser.", "");
                                    class78.method2677(6);
                                    return;
                                 }

                                 var10 = class52.field741 + 180 + 80;
                                 if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                                    class265.method5991(true);
                                 }
                              } else if (class52.field758 == 9) {
                                 var10 = class52.field741 + 180;
                                 var11 = 311;
                                 if (var23.field3212 == 84 || var23.field3212 == 13 || var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                                    class355.method7408(false);
                                 }
                              } else if (class52.field758 == 10) {
                                 var10 = class52.field741 + 180;
                                 var11 = 209;
                                 if (var23.field3212 == 84 || var5 == 1 && var33 >= var10 - 109 && var33 <= var10 + 109 && var34 >= var11 && var34 <= var11 + 68) {
                                    if (class25.method399()) {
                                       return;
                                    }

                                    class66.method2147("", "Connecting to server...", "");
                                    client.field330 = class595.field5974;
                                    class325.method7035(false);
                                    class121.method3521(20);
                                 }
                              } else if (class52.field758 == 12) {
                                 var10 = class294.field3397;
                                 var11 = 233;
                                 var26 = var2.method9419(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
                                 class449 var24 = var2.method9419(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
                                 class449 var25 = var2.method9419(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var10, var11);
                                 var39 = var11 + 17;
                                 class449 var28 = var2.method9419(0, 34, "<col=ffd200>agreement (EULA)</col>.", var10, var39);
                                 if (var5 == 1) {
                                    if (var26.method8976(var33, var34)) {
                                       class22.method330("https://www.jagex.com/terms", true, false);
                                    } else if (var24.method8976(var33, var34)) {
                                       class22.method330("https://www.jagex.com/terms/privacy", true, false);
                                    } else if (var25.method8976(var33, var34) || var28.method8976(var33, var34)) {
                                       class22.method330("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                                    }
                                 }

                                 var10 = class294.field3397 - 80;
                                 var11 = 311;
                                 if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                                    class36.field239.method2627(client.field388);
                                    class355.method7408(true);
                                 }

                                 var10 = class294.field3397 + 80;
                                 if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                                    class52.field758 = 13;
                                 }
                              } else if (class52.field758 == 13) {
                                 var10 = class294.field3397;
                                 var11 = 321;
                                 if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                                    class355.method7408(true);
                                 }
                              } else if (class52.field758 == 14) {
                                 String var29 = "";
                                 switch(class52.field753) {
                                 case 0:
                                    var29 = "https://secure.runescape.com/m=offence-appeal/account-history";
                                    break;
                                 case 1:
                                    var29 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
                                    break;
                                 case 2:
                                    var29 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                    break;
                                 default:
                                    class265.method5991(false);
                                 }

                                 var39 = class52.field741 + 180;
                                 var38 = 276;
                                 if (var5 == 1 && var33 >= var39 - 75 && var33 <= var39 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                                    class22.method330(var29, true, false);
                                    class66.method2147("", "Page has opened in the browser.", "");
                                    class78.method2677(6);
                                    return;
                                 }

                                 var39 = class52.field741 + 180;
                                 var38 = 326;
                                 if (var5 == 1 && var33 >= var39 - 75 && var33 <= var39 + 75 && var34 >= var38 - 20 && var34 <= var38 + 20) {
                                    class265.method5991(false);
                                 }
                              } else if (class52.field758 == 24) {
                                 var10 = class52.field741 + 180;
                                 var11 = 301;
                                 if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                                    class355.method7408(false);
                                 }
                              } else if (class52.field758 == 32) {
                                 var10 = class52.field741 + 180 - 80;
                                 var11 = 321;
                                 if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                                    class22.method330(class214.method4756("secure", true) + "m=dob/set_dob.ws", true, false);
                                    class66.method2147("", "Page has opened in the browser.", "");
                                    class78.method2677(6);
                                    return;
                                 }

                                 var10 = class52.field741 + 180 + 80;
                                 if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                                    class265.method5991(true);
                                 }
                              } else if (class52.field758 == 33) {
                                 var10 = class52.field741 + 180;
                                 var11 = 276;
                                 if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                                    class22.method330("https://oldschool.runescape.com/launcher", true, false);
                                 }

                                 var10 = class52.field741 + 180;
                                 var11 = 326;
                                 if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                                    class265.method5991(true);
                                 }
                              } else if (class52.field758 == 34) {
                                 var10 = class52.field741 + 180;
                                 var11 = 276;
                                 if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                                    if (class65.method2139()) {
                                       class52.field740 = true;
                                       class52.field755 = 0;
                                       class52.field756 = 0;
                                    }

                                    return;
                                 }

                                 if (class44.field630 != null && class65.method2139()) {
                                    class52.field740 = true;
                                    class52.field755 = 0;
                                    class52.field756 = 0;
                                 }

                                 var10 = class52.field741 + 180;
                                 var11 = 326;
                                 if (var5 == 1 && var33 >= var10 - 75 && var33 <= var10 + 75 && var34 >= var11 - 20 && var34 <= var11 + 20) {
                                    class265.method5991(false);
                                 }
                              }
                           } else {
                              while(true) {
                                 do {
                                    if (!var9.method6121()) {
                                       var37 = 321;
                                       if (var5 == 1 && var34 >= var37 - 20 && var34 <= var37 + 20) {
                                          class265.method5991(true);
                                       }

                                       return;
                                    }
                                 } while(var9.field3212 != 84 && var9.field3212 != 13);

                                 class265.method5991(true);
                              }
                           }
                        }
                     }
                  }
               }

            }
         }
      }
   }
}
