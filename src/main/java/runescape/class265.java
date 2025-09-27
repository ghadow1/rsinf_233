package runescape;

import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("kd")
public class class265 {
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   static final class265 field3133 = new class265();
   @ObfuscatedName("vg")
   @ObfuscatedGetter(
      intValue = 1669951291
   )
   static int field3150;
   @ObfuscatedName("aq")
   final int field3148 = 1;
   @ObfuscatedName("ao")
   final int field3143 = 2;
   @ObfuscatedName("as")
   String field3151 = "";
   @ObfuscatedName("al")
   String field3140 = "";
   @ObfuscatedName("au")
   String field3141 = "";
   @ObfuscatedName("ai")
   String field3142 = "";
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      longValue = -6210461170724760517L
   )
   long field3137 = -1L;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Lar;"
   )
   InterfaceParent field3144;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lag;"
   )
   class18 field3145;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 42669455
   )
   int field3146 = 1;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1748111785
   )
   int field3138 = 0;
   @ObfuscatedName("ay")
   String field3147;
   @ObfuscatedName("ad")
   boolean field3149;

   class265() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)V",
      garbageValue = "-572065270"
   )
   public void method5962(int var1, String var2) {
      this.field3138 = var1;
      this.field3147 = var2;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "2"
   )
   public void method5984(boolean var1) {
      this.field3149 = var1;
      this.field3144 = new InterfaceParent("crmsession", 1, 1);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
      garbageValue = "-67"
   )
   void method5964(String var1, String var2, String var3) {
      if (this.field3146 != 2) {
         this.field3151 = var1;
         this.field3140 = var2;
         this.field3141 = var3;
         if (!this.field3151.endsWith("/")) {
            this.field3151 = this.field3151 + "/";
         }

         if (!this.field3140.equals("")) {
            String var4 = this.field3151;
            var4 = var4 + "session/open/" + this.field3140;
            if (this.field3141.equals("")) {
            }

            var4 = var4 + "?userHash=" + this.field3141;

            try {
               this.field3145 = this.method5970(var4);
               this.field3137 = class189.method4284();
            } catch (IOException var6) {
               this.field3145 = null;
               this.field3140 = "";
               this.field3141 = "";
            }

         }
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-484485737"
   )
   public void method5965() {
      if (this.field3145 == null) {
         if (!this.field3142.isEmpty() && this.field3146 == 1) {
            long var1 = class189.method4284();
            long var3 = var1 - this.field3137;
            String var5 = this.field3151;
            var5 = var5 + "session/close/" + this.field3140 + "/" + this.field3142;
            if (this.field3141.isEmpty()) {
               var5 = var5 + "?sessionDuration=" + var3;
            } else {
               var5 = var5 + "?userHash=" + this.field3141 + "&sessionDuration=" + var3;
            }

            try {
               this.field3145 = this.method5970(var5);
            } catch (IOException var7) {
               this.field3146 = 1;
            }
         }

      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1924478622"
   )
   public void method5966() {
      if (this.field3144 != null) {
         this.field3144.method177();
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-1"
   )
   void method5967() {
      if (!this.field3142.isEmpty()) {
         String var1 = "";
         switch(this.field3138) {
         case 1:
            var1 = "events/click";
            break;
         case 2:
            var1 = "events/dismissed";
            break;
         case 3:
            var1 = "events/impression";
         }

         if (!this.field3147.isEmpty()) {
            String var2 = this.field3151;
            var2 = var2 + var1 + "/" + this.field3140 + "/" + this.field3142 + "/" + this.field3147 + "?userHash=" + this.field3141;

            try {
               this.field3145 = this.method5970(var2);
            } catch (IOException var4) {
               this.field3146 = 1;
            }

            this.field3146 = 1;
            this.field3138 = 0;
         }
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1837175427"
   )
   public void method5968() {
      if (this.field3145 != null && this.field3145.method277()) {
         if (this.field3145.method277() && this.field3145.method280().method301() == 200 && this.field3142.isEmpty()) {
            String var1 = this.field3145.method280().method308();
            if (var1.isEmpty()) {
               return;
            }

            this.field3142 = var1;
         }

         if (this.field3138 != 0) {
            this.method5967();
         }

      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "260410678"
   )
   public boolean method5992(String var1) {
      this.method5962(2, var1);
      return true;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Lag;",
      garbageValue = "-239226469"
   )
   class18 method5970(String var1) throws IOException {
      URL var2 = new URL(var1);
      class10 var3 = new class10(var2, class9.field34, this.field3149);

      try {
         JSONObject var4 = new JSONObject();
         var3.method87(new class533(var4));
      } catch (Exception var5) {
      }

      return this.field3144.method182(var3);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpx;I)V",
      garbageValue = "153328846"
   )
   public static void method5993(class412 var0) {
      class182.field1981 = var0;
      class4.field8 = class182.field1981.method8347(16);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(FFFFI)F",
      garbageValue = "2071566318"
   )
   static final float method5963(float var0, float var1, float var2, float var3) {
      return var1 * var2 - var0 * var3;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "([BB)V",
      garbageValue = "-37"
   )
   static void method5994(byte[] var0) {
      Buffer var1 = new Buffer(var0);
      var1.offset = (var0.length - 2) * -290410379;
      class606.field6026 = var1.readUnsignedShort();
      class149.field1763 = new int[class606.field6026];
      class191.field2082 = new int[class606.field6026];
      class255.field3068 = new int[class606.field6026];
      class497.field5390 = new int[class606.field6026];
      class7.field25 = new byte[class606.field6026][];
      var1.offset = (var0.length - 7 - class606.field6026 * 8) * -290410379;
      class606.field6025 = var1.readUnsignedShort();
      class581.field5847 = var1.readUnsignedShort();
      int var2 = (var1.method11196() & 255) + 1;

      int var3;
      for(var3 = 0; var3 < class606.field6026; ++var3) {
         class149.field1763[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class606.field6026; ++var3) {
         class191.field2082[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class606.field6026; ++var3) {
         class255.field3068[var3] = var1.readUnsignedShort();
      }

      for(var3 = 0; var3 < class606.field6026; ++var3) {
         class497.field5390[var3] = var1.readUnsignedShort();
      }

      var1.offset = (var0.length - 7 - class606.field6026 * 8 - (var2 - 1) * 3) * -290410379;
      class504.field5414 = new int[var2];

      for(var3 = 1; var3 < var2; ++var3) {
         class504.field5414[var3] = var1.method11278();
         if (class504.field5414[var3] == 0) {
            class504.field5414[var3] = 1;
         }
      }

      var1.offset = 0;

      for(var3 = 0; var3 < class606.field6026; ++var3) {
         int var4 = class255.field3068[var3];
         int var5 = class497.field5390[var3];
         int var6 = var5 * var4;
         byte[] var7 = new byte[var6];
         class7.field25[var3] = var7;
         int var8 = var1.method11196();
         boolean var9 = (var8 & 1) == 1;
         boolean var10 = (var8 & 2) == 2;
         int var11;
         if (!var9) {
            for(var11 = 0; var11 < var6; ++var11) {
               var7[var11] = var1.method11197();
            }
         } else {
            for(var11 = 0; var11 < var4; ++var11) {
               for(int var12 = 0; var12 < var5; ++var12) {
                  var7[var11 + var12 * var4] = var1.method11197();
               }
            }
         }

         if (var10) {
            var1.offset += var6 * -290410379;
         }
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "0"
   )
   static void method5991(boolean var0) {
      if (!class521.field5519.method799() && !class521.field5519.method1413() && !class521.field5519.method800()) {
         class52.field744 = "";
         class52.field745 = "Enter your username/email & password.";
         class52.field746 = "";
         class78.method2677(2);
         if (var0) {
            class52.field726 = "";
         }

         if (class52.local_username == null || class52.local_username.isEmpty()) {
            if (class36.clientPreferences.method2597() != null) {
               class52.local_username = class36.clientPreferences.method2597();
               client.Login_isUsernameRemembered = true;
            } else {
               client.Login_isUsernameRemembered = false;
            }
         }

         if (client.Login_isUsernameRemembered && class52.local_username != null && !class52.local_username.isEmpty()) {
            class52.field750 = 1;
         } else {
            class52.field750 = 0;
         }

      } else {
         class78.method2677(10);
      }
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "(ILna;ZB)V",
      garbageValue = "83"
   )
   static void method5990(int var0, class356 var1, boolean var2) {
      class289 var3 = class232.method5361().method10668(var0);
      int var4 = class76.field1108.field933;
      int var5 = (class76.field1108.field1055 >> 7) + class333.field3836.field1164;
      int var6 = (class76.field1108.field1056 >> 7) + class333.field3836.field1165;
      class356 var7 = new class356(var4, var5, var6);
      class232.method5361().method10800(var3, var7, var1, var2);
   }
}
