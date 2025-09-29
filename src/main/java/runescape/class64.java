package runescape;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
public class class64 extends class544 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1081489017
   )
   int field888;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1117596947
   )
   int field886;
   @ObfuscatedName("at")
   boolean field887 = false;

   class64() {
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1740673703"
   )
   static void method2132() {
      class52.local_username = class52.local_username.trim();
      if (class52.local_username.isEmpty()) {
         class66.method2147("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
      } else {
         long var1;
         try {
            URL var3 = new URL(class214.method4756("services", false) + "m=accountappeal/login.ws");
            URLConnection var4 = var3.openConnection();
            var4.setRequestProperty("connection", "close");
            var4.setDoInput(true);
            var4.setDoOutput(true);
            var4.setConnectTimeout(5000);
            OutputStreamWriter var5 = new OutputStreamWriter(var4.getOutputStream());
            var5.write("data1=req");
            var5.flush();
            InputStream var6 = var4.getInputStream();
            Buffer var7 = new Buffer(new byte[1000]);

            while(true) {
               int var8 = var6.read(var7.array, var7.offset * 1216585693, 1000 - var7.offset * 1216585693);
               if (var8 == -1) {
                  var7.offset = 0;
                  long var10 = var7.readLong();
                  var1 = var10;
                  break;
               }

               var7.offset += -290410379 * var8;
               if (var7.offset * 1216585693 >= 1000) {
                  var1 = 0L;
                  break;
               }
            }
         } catch (Exception var14) {
            var1 = 0L;
         }

         int var0;
         if (var1 == 0L) {
            var0 = 5;
         } else {
            var0 = class296.method6767(var1, class52.local_username);
         }

         switch(var0) {
         case 2:
            class66.method2147(class393.field4745, class393.field4793, class393.field4747);
            class78.method2677(6);
            break;
         case 3:
            class66.method2147("", "Error connecting to server.", "");
            break;
         case 4:
            class66.method2147("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
            break;
         case 5:
            class66.method2147("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
            break;
         case 6:
            class66.method2147("", "Error connecting to server.", "");
            break;
         case 7:
            class66.method2147("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
         }

      }
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "-1914793075"
   )
   static int method2131(int var0, class55 var1, boolean var2) {
      String var3;
      int var10;
      if (var0 == 4100) {
         var3 = (String)class46.field660[--class46.field658];
         var10 = class46.field659[--class124.field1569];
         class46.field660[++class46.field658 - 1] = var3 + var10;
         return 1;
      } else {
         String var4;
         if (var0 == 4101) {
            class46.field658 -= 2;
            var3 = (String)class46.field660[class46.field658];
            var4 = (String)class46.field660[class46.field658 + 1];
            class46.field660[++class46.field658 - 1] = var3 + var4;
            return 1;
         } else if (var0 == 4102) {
            var3 = (String)class46.field660[--class46.field658];
            var10 = class46.field659[--class124.field1569];
            class46.field660[++class46.field658 - 1] = var3 + class252.method5793(var10, true);
            return 1;
         } else if (var0 == 4103) {
            var3 = (String)class46.field660[--class46.field658];
            class46.field660[++class46.field658 - 1] = var3.toLowerCase();
            return 1;
         } else {
            int var6;
            int var11;
            if (var0 == 4104) {
               var11 = class46.field659[--class124.field1569];
               long var14 = (11745L + (long)var11) * 86400000L;
               class46.field666.setTime(new Date(var14));
               var6 = class46.field666.get(5);
               int var17 = class46.field666.get(2);
               int var8 = class46.field666.get(1);
               class46.field660[++class46.field658 - 1] = var6 + "-" + class46.field668[var17] + "-" + var8;
               return 1;
            } else if (var0 != 4105) {
               if (var0 == 4106) {
                  var11 = class46.field659[--class124.field1569];
                  class46.field660[++class46.field658 - 1] = Integer.toString(var11);
                  return 1;
               } else if (var0 == 4107) {
                  class46.field658 -= 2;
                  class46.field659[++class124.field1569 - 1] = class30.method472(class288.method6408((String)class46.field660[class46.field658], (String)class46.field660[class46.field658 + 1], class242.field2970));
                  return 1;
               } else {
                  int var9;
                  byte[] var12;
                  class461 var13;
                  if (var0 == 4108) {
                     var3 = (String)class46.field660[--class46.field658];
                     class124.field1569 -= 2;
                     var10 = class46.field659[class124.field1569];
                     var9 = class46.field659[class124.field1569 + 1];
                     var12 = class145.field1726.method8335(var9, 0);
                     var13 = new class461(var12);
                     class46.field659[++class124.field1569 - 1] = var13.method9418(var3, var10);
                     return 1;
                  } else if (var0 == 4109) {
                     var3 = (String)class46.field660[--class46.field658];
                     class124.field1569 -= 2;
                     var10 = class46.field659[class124.field1569];
                     var9 = class46.field659[class124.field1569 + 1];
                     var12 = class145.field1726.method8335(var9, 0);
                     var13 = new class461(var12);
                     class46.field659[++class124.field1569 - 1] = var13.method9445(var3, var10);
                     return 1;
                  } else if (var0 == 4110) {
                     class46.field658 -= 2;
                     var3 = (String)class46.field660[class46.field658];
                     var4 = (String)class46.field660[class46.field658 + 1];
                     if (class46.field659[--class124.field1569] == 1) {
                        class46.field660[++class46.field658 - 1] = var3;
                     } else {
                        class46.field660[++class46.field658 - 1] = var4;
                     }

                     return 1;
                  } else if (var0 == 4111) {
                     var3 = (String)class46.field660[--class46.field658];
                     class46.field660[++class46.field658 - 1] = class465.method9500(var3);
                     return 1;
                  } else if (var0 == 4112) {
                     var3 = (String)class46.field660[--class46.field658];
                     var10 = class46.field659[--class124.field1569];
                     class46.field660[++class46.field658 - 1] = var3 + (char)var10;
                     return 1;
                  } else if (var0 == 4113) {
                     var11 = class46.field659[--class124.field1569];
                     class46.field659[++class124.field1569 - 1] = class363.method7520((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4114) {
                     var11 = class46.field659[--class124.field1569];
                     class46.field659[++class124.field1569 - 1] = class249.method5776((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4115) {
                     var11 = class46.field659[--class124.field1569];
                     class46.field659[++class124.field1569 - 1] = class269.method6055((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4116) {
                     var11 = class46.field659[--class124.field1569];
                     class46.field659[++class124.field1569 - 1] = class406.method8275((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == 4117) {
                     var3 = (String)class46.field660[--class46.field658];
                     if (var3 != null) {
                        class46.field659[++class124.field1569 - 1] = var3.length();
                     } else {
                        class46.field659[++class124.field1569 - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == 4118) {
                     var3 = (String)class46.field660[--class46.field658];
                     class124.field1569 -= 2;
                     var10 = class46.field659[class124.field1569];
                     var9 = class46.field659[class124.field1569 + 1];
                     class46.field660[++class46.field658 - 1] = var3.substring(var10, var9);
                     return 1;
                  } else if (var0 == 4119) {
                     var3 = (String)class46.field660[--class46.field658];
                     StringBuilder var16 = new StringBuilder(var3.length());
                     boolean var18 = false;

                     for(var6 = 0; var6 < var3.length(); ++var6) {
                        char var7 = var3.charAt(var6);
                        if (var7 == '<') {
                           var18 = true;
                        } else if (var7 == '>') {
                           var18 = false;
                        } else if (!var18) {
                           var16.append(var7);
                        }
                     }

                     class46.field660[++class46.field658 - 1] = var16.toString();
                     return 1;
                  } else if (var0 == 4120) {
                     var3 = (String)class46.field660[--class46.field658];
                     var10 = class46.field659[--class124.field1569];
                     class46.field659[++class124.field1569 - 1] = var3.indexOf(var10);
                     return 1;
                  } else if (var0 == 4121) {
                     class46.field658 -= 2;
                     var3 = (String)class46.field660[class46.field658];
                     var4 = (String)class46.field660[class46.field658 + 1];
                     var9 = class46.field659[--class124.field1569];
                     class46.field659[++class124.field1569 - 1] = var3.indexOf(var4, var9);
                     return 1;
                  } else if (var0 == 4122) {
                     var3 = (String)class46.field660[--class46.field658];
                     class46.field660[++class46.field658 - 1] = var3.toUpperCase();
                     return 1;
                  } else if (var0 == 4123) {
                     class46.field658 -= 3;
                     var3 = (String)class46.field660[class46.field658];
                     var4 = (String)class46.field660[class46.field658 + 1];
                     String var5 = (String)class46.field660[class46.field658 + 2];
                     if (class76.field1108.field935 == null) {
                        class46.field660[++class46.field658 - 1] = var5;
                        return 1;
                     } else {
                        switch(class76.field1108.field935.field4083) {
                        case 0:
                           class46.field660[++class46.field658 - 1] = var3;
                           break;
                        case 1:
                           class46.field660[++class46.field658 - 1] = var4;
                           break;
                        case 2:
                        default:
                           class46.field660[++class46.field658 - 1] = var5;
                        }

                        return 1;
                     }
                  } else if (var0 == 4124) {
                     class46.field659[++class124.field1569 - 1] = class76.field1108.field935 != null ? class76.field1108.field935.field4083 : -1;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               class46.field658 -= 2;
               var3 = (String)class46.field660[class46.field658];
               var4 = (String)class46.field660[class46.field658 + 1];
               if (class76.field1108.field935 != null && class76.field1108.field935.field4084 != 0) {
                  class46.field660[++class46.field658 - 1] = var4;
               } else {
                  class46.field660[++class46.field658 - 1] = var3;
               }

               return 1;
            }
         }
      }
   }
}
