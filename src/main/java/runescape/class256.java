package runescape;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("jo")
public class class256 {
   @ObfuscatedName("ad")
   static int[] field3083;
   @ObfuscatedName("hy")
   @ObfuscatedSignature(
      descriptor = "Lun;"
   )
   static class525 field3085;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   class265 field3084;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lkm;"
   )
   class267 field3076;
   @ObfuscatedName("aa")
   int field3077 = -960936447;
   @ObfuscatedName("am")
   String field3081;
   @ObfuscatedName("an")
   String field3078;
   @ObfuscatedName("ar")
   String field3080;
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lea;"
   )
   class121 field3082;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 440288245
   )
   int field3069 = 0;

   public class256() {
   }

   @ObfuscatedSignature(
      descriptor = "(Ljo;)V"
   )
   public class256(class256 var1) {
      if (var1 != null) {
         this.field3084 = var1.field3084;
         this.field3076 = var1.field3076;
         this.field3077 = var1.field3077;
         this.field3081 = var1.field3081;
         this.field3078 = var1.field3078;
         this.field3080 = var1.field3080;
         this.field3082 = null;
         this.field3069 = var1.field3069;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Lkd;",
      garbageValue = "552921592"
   )
   public class265 method5816() {
      return this.field3084;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Lel;I)Z",
      garbageValue = "-156026336"
   )
   public boolean method5872(String var1, String var2, class119 var3) {
      if (var1 != null && !var1.isEmpty()) {
         if (var3 == null) {
            return false;
         } else {
            this.method5835();

            try {
               this.field3081 = var1;
               this.field3082 = var3.method3489(new URL(this.field3081));
               this.field3077 = 0;
            } catch (MalformedURLException var5) {
               this.method5835();
               this.field3077 = -451221508;
               return false;
            }

            if (!var2.isEmpty()) {
               this.field3080 = var2;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-1047333848"
   )
   public void method5818(String var1, String var2, String var3) {
      this.field3084 = class259.method5905();
      this.field3078 = var1;
      this.field3084.method5964(this.field3078, var2, var3);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lel;S)V",
      garbageValue = "-16654"
   )
   public void method5819(class119 var1) {
      switch(this.field3077 * 1603618303) {
      case 0:
         this.method5830(var1);
         break;
      case 1:
         this.method5831();
         break;
      default:
         return;
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "8"
   )
   public int method5853() {
      return this.field3077 * 1603618303;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-28"
   )
   public boolean method5821() {
      return this.field3076 != null;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "234030589"
   )
   public int method5828(String var1) {
      return this.field3076.field3160.containsKey(var1) ? (Integer)this.field3076.field3160.get(var1) : -1;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1553583606"
   )
   public String method5873(String var1) {
      return (String)((String)(this.field3076.field3169.containsKey(var1) ? this.field3076.field3169.get(var1) : null));
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/util/ArrayList;",
      garbageValue = "-38"
   )
   public ArrayList method5824() {
      return this.field3076.field3165;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/util/ArrayList;",
      garbageValue = "9"
   )
   public ArrayList method5817() {
      return this.field3076.field3163;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/ArrayList;",
      garbageValue = "1345785871"
   )
   public ArrayList method5820() {
      return this.field3076.field3162;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "1"
   )
   public String method5827() {
      return this.field3076.field3164;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(B)[F",
      garbageValue = "1"
   )
   public float[] method5844() {
      return this.field3076.field3171;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "1796113041"
   )
   public String method5825() {
      return this.field3076.method5996();
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1562701157"
   )
   void method5835() {
      this.field3082 = null;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Lel;I)V",
      garbageValue = "-639285166"
   )
   void method5830(class119 var1) {
      if (this.field3082 != null && this.field3082.method3519()) {
         byte[] var2 = this.field3082.method3520();
         if (var2 == null) {
            this.method5835();
            this.field3077 = -451221508;
         } else {
            try {
               class533 var3 = new class533(var2);
               JSONObject var4 = var3.method10493();
               if (var4 == null) {
                  return;
               }

               try {
                  this.field3069 = var4.getInt("version");
               } catch (Exception var7) {
                  this.method5835();
                  this.field3077 = 1470651386;
                  return;
               }

               if (this.field3069 < 2) {
                  if (!this.field3076.method5999(var4, this.field3069, var1)) {
                     this.field3077 = 1470651386;
                  }
               } else if (this.field3069 == 2) {
                  class269 var5 = class269.field3180;
                  var5.method6046(var4, this.field3069, var1);
                  this.field3076 = var5.method6048(this.field3080);
                  if (this.field3076 != null) {
                     this.method5831();
                     this.field3077 = 960936447;
                  } else {
                     this.field3077 = -1863379463;
                  }
               }
            } catch (UnsupportedEncodingException var8) {
               this.method5835();
               this.field3077 = 1470651386;
               return;
            }

            if (this.field3076 != null) {
               this.field3077 = (!this.field3076.field3165.isEmpty() ? 1 : 2) * 960936447;
            }

            this.field3082 = null;
         }
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1790959850"
   )
   void method5831() {
      Iterator var1 = this.field3076.field3165.iterator();

      class257 var2;
      do {
         if (!var1.hasNext()) {
            var1 = this.field3076.field3165.iterator();

            while(var1.hasNext()) {
               var2 = (class257)var1.next();
               if (var2.field3088 != null) {
                  byte[] var3 = var2.field3088.method3520();
                  if (var3 != null && var3.length > 0) {
                     this.field3077 = 1921872894;
                     return;
                  }
               }
            }

            this.method5835();
            this.field3077 = 509714939;
            return;
         }

         var2 = (class257)var1.next();
      } while(var2.field3088 == null || var2.field3088.method3519());

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Lel;I)Z",
      garbageValue = "-1064658402"
   )
   public boolean method5832(String var1, class119 var2) {
      try {
         JSONObject var3 = (new class533(var1.getBytes())).method10493();

         try {
            this.field3069 = var3.getInt("version");
         } catch (Exception var5) {
            this.method5835();
            this.field3077 = 1470651386;
            return false;
         }

         if (!this.field3076.method5999(var3, this.field3069, var2)) {
            this.field3077 = 1470651386;
         }

         this.field3077 = (!this.field3076.field3165.isEmpty() ? 1 : 2) * 960936447;
      } catch (UnsupportedEncodingException var6) {
         this.field3077 = 1470651386;
      }

      return this.field3077 * 1603618303 < 3;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZB)I",
      garbageValue = "-7"
   )
   static int method5829(int var0, class55 var1, boolean var2) {
      if (var0 == 6200) {
         class124.field1569 -= 2;
         client.field367 = (short)class4.method16(class46.field659[class124.field1569]);
         if (client.field367 <= 0) {
            client.field367 = 256;
         }

         client.field368 = (short)class4.method16(class46.field659[class124.field1569 + 1]);
         if (client.field368 <= 0) {
            client.field368 = 256;
         }

         return 1;
      } else if (var0 == 6201) {
         class124.field1569 -= 2;
         client.field369 = (short)class46.field659[class124.field1569];
         if (client.field369 <= 0) {
            client.field369 = 256;
         }

         client.field370 = (short)class46.field659[class124.field1569 + 1];
         if (client.field370 <= 0) {
            client.field370 = 320;
         }

         return 1;
      } else if (var0 == 6202) {
         class124.field1569 -= 4;
         client.field371 = (short)class46.field659[class124.field1569];
         if (client.field371 <= 0) {
            client.field371 = 1;
         }

         client.field364 = (short)class46.field659[class124.field1569 + 1];
         if (client.field364 <= 0) {
            client.field364 = 32767;
         } else if (client.field364 < client.field371) {
            client.field364 = client.field371;
         }

         client.field419 = (short)class46.field659[class124.field1569 + 2];
         if (client.field419 <= 0) {
            client.field419 = 1;
         }

         client.field382 = (short)class46.field659[class124.field1569 + 3];
         if (client.field382 <= 0) {
            client.field382 = 32767;
         } else if (client.field382 < client.field419) {
            client.field382 = client.field419;
         }

         return 1;
      } else if (var0 == 6203) {
         if (client.field358 != null) {
            class297.method6783(0, 0, client.field358.field4160 * 469894397, client.field358.field4149 * 1156037777, false);
            class46.field659[++class124.field1569 - 1] = client.field313;
            class46.field659[++class124.field1569 - 1] = client.field378;
         } else {
            class46.field659[++class124.field1569 - 1] = -1;
            class46.field659[++class124.field1569 - 1] = -1;
         }

         return 1;
      } else if (var0 == 6204) {
         class46.field659[++class124.field1569 - 1] = client.field369;
         class46.field659[++class124.field1569 - 1] = client.field370;
         return 1;
      } else if (var0 == 6205) {
         class46.field659[++class124.field1569 - 1] = class456.method9206(client.field367);
         class46.field659[++class124.field1569 - 1] = class456.method9206(client.field368);
         return 1;
      } else if (var0 == 6220) {
         class46.field659[++class124.field1569 - 1] = 0;
         return 1;
      } else if (var0 == 6221) {
         class46.field659[++class124.field1569 - 1] = 0;
         return 1;
      } else if (var0 == 6222) {
         class46.field659[++class124.field1569 - 1] = class34.screenWidth;
         return 1;
      } else if (var0 == 6223) {
         class46.field659[++class124.field1569 - 1] = class396.screenHeight;
         return 1;
      } else {
         return 2;
      }
   }
}
