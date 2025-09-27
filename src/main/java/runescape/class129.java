package runescape;

import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ev")
public class class129 extends class500 {
   @ObfuscatedName("ap")
   public static String field1588;
   @ObfuscatedName("qw")
   @ObfuscatedGetter(
      intValue = -192942121
   )
   static int field1584;
   @ObfuscatedName("af")
   final boolean field1586;

   public class129(boolean var1) {
      this.field1586 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lty;Lty;I)I",
      garbageValue = "1669907296"
   )
   int method3586(class503 var1, class503 var2) {
      if (var2.field5412 != var1.field5412) {
         return this.field1586 ? var1.field5412 - var2.field5412 : var2.field5412 - var1.field5412;
      } else {
         return this.method9964(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method3586((class503)var1, (class503)var2);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Z",
      garbageValue = "-46"
   )
   static boolean method3588(String var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
      garbageValue = "-1068232297"
   )
   static boolean method3589(String var0, int var1, String var2) {
      if (var1 == 0) {
         try {
            if (!class31.field159.startsWith("win")) {
               throw new Exception();
            } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var4 = 0; var4 < var0.length(); ++var4) {
                  if (var11.indexOf(var0.charAt(var4)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var5) {
            return false;
         }
      } else if (var1 == 1) {
         try {
            Object var10 = class26.method406(class31.field158, var2, new Object[]{(new URL(class31.field158.getCodeBase(), var0)).toString()});
            return var10 != null;
         } catch (Throwable var6) {
            return false;
         }
      } else if (var1 == 2) {
         try {
            class31.field158.getAppletContext().showDocument(new URL(class31.field158.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var7) {
            return false;
         }
      } else if (var1 == 3) {
         try {
            Applet var3 = class31.field158;
            JSObject.getWindow(var3).call("loggedout", (Object[])null);
         } catch (Throwable var9) {
         }

         try {
            class31.field158.getAppletContext().showDocument(new URL(class31.field158.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var8) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
