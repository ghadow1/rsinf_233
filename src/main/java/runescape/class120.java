package runescape;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public class class120 extends class119 {
   @ObfuscatedName("ap")
   final boolean field1555;

   public class120(boolean var1, int var2) {
      super(var2);
      this.field1555 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lea;I)V",
      garbageValue = "20500778"
   )
   void vmethod3505(class121 var1) throws IOException {
      URLConnection var2 = null;
      boolean var9 = false;

      HttpURLConnection var12;
      label137: {
         label129: {
            try {
               label132: {
                  var9 = true;
                  String var3 = var1.field1559.getProtocol();
                  if (var3.equals("http")) {
                     var2 = this.method3507(var1);
                  } else {
                     if (!var3.equals("https")) {
                        var1.field1557 = class121.field1558;
                        var9 = false;
                        break label132;
                     }

                     var2 = this.method3508(var1);
                  }

                  this.method3488(var2, var1);
                  var9 = false;
                  break label137;
               }
            } catch (IOException var10) {
               var1.field1557 = class121.field1558;
               var9 = false;
               break label129;
            } finally {
               if (var9) {
                  if (var2 != null && var2 instanceof HttpURLConnection) {
                     HttpURLConnection var6 = (HttpURLConnection)var2;
                     var6.disconnect();
                  }

               }
            }

            if (var2 != null && var2 instanceof HttpURLConnection) {
               HttpURLConnection var4 = (HttpURLConnection)var2;
               var4.disconnect();
            }

            return;
         }

         if (var2 != null && var2 instanceof HttpURLConnection) {
            var12 = (HttpURLConnection)var2;
            var12.disconnect();
         }

         return;
      }

      if (var2 != null && var2 instanceof HttpURLConnection) {
         var12 = (HttpURLConnection)var2;
         var12.disconnect();
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(Lea;I)Ljava/net/URLConnection;",
      garbageValue = "716925282"
   )
   URLConnection method3507(class121 var1) throws IOException {
      URLConnection var2 = var1.field1559.openConnection();
      this.method3487(var2);
      return var2;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Lea;B)Ljava/net/URLConnection;",
      garbageValue = "-102"
   )
   URLConnection method3508(class121 var1) throws IOException {
      HttpsURLConnection var2 = (HttpsURLConnection)var1.field1559.openConnection();
      if (!this.field1555) {
         var2.setSSLSocketFactory(class15.method201());
      }

      this.method3487(var2);
      return var2;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(CB)C",
      garbageValue = "-64"
   )
   static char method3517(char var0) {
      if (var0 == 198) {
         return 'E';
      } else if (var0 == 230) {
         return 'e';
      } else if (var0 == 223) {
         return 's';
      } else if (var0 == 338) {
         return 'E';
      } else {
         return (char)(var0 == 339 ? 'e' : '\u0000');
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)Lfh;",
      garbageValue = "471637573"
   )
   public static class146 method3516(int var0) {
      class146 var1 = (class146)class215.field2468.method7018((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         var1 = class294.method6731(class454.field5183, class216.field2510, var0);
         if (var1 != null) {
            class215.field2468.method7009(var1, (long)var0);
         }

         return var1;
      }
   }
}
