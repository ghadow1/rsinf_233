package runescape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ah")
public class class20 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 2064132583
   )
   final int field85;
   @ObfuscatedName("aw")
   final String field83;
   @ObfuscatedName("at")
   final Map field84;
   @ObfuscatedName("ac")
   final String field86;

   class20(String var1) {
      this.field85 = 400;
      this.field83 = var1;
      this.field84 = null;
      this.field86 = "";
   }

   class20(HttpURLConnection var1) throws IOException {
      this.field85 = var1.getResponseCode();
      this.field83 = var1.getResponseMessage();
      this.field84 = var1.getHeaderFields();
      StringBuilder var2 = new StringBuilder();
      InputStream var3 = this.field85 >= 300 ? var1.getErrorStream() : var1.getInputStream();
      if (var3 != null) {
         InputStreamReader var4 = new InputStreamReader(var3);
         BufferedReader var5 = new BufferedReader(var4);

         String var6;
         while((var6 = var5.readLine()) != null) {
            var2.append(var6);
         }

         var3.close();
      }

      this.field86 = var2.toString();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "51700832"
   )
   public int method301() {
      return this.field85;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "79"
   )
   public String method302() {
      return this.field83;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/Map;",
      garbageValue = "-2022393815"
   )
   public Map method300() {
      return this.field84;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-88997212"
   )
   public String method308() {
      return this.field86;
   }

   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "353989651"
   )
   static final int method306() {
      if (class36.clientPreferences.method2672()) {
         return class333.field3836.field1170;
      } else {
         int var0 = 3;
         int var1 = client.field552 >> 7;
         int var2 = client.field337 >> 7;
         if (class401.field4855 < 310) {
            int var3;
            int var4;
            if (client.field336 == 1) {
               var3 = class172.field1930 >> 7;
               var4 = class129.field1584 >> 7;
            } else {
               var3 = var1;
               var4 = var2;
            }

            int var5 = class187.field2052 >> 7;
            int var6 = class10.field46 >> 7;
            if (var5 < 0 || 104 <= var5 || var6 < 0 || 104 <= var6) {
               return class333.field3836.field1170;
            }

            if (var3 < 0 || 104 <= var3 || var4 < 0 || 104 <= var4) {
               return class333.field3836.field1170;
            }

            if ((class333.field3836.field1168[class333.field3836.field1170][var5][var6] & 4) != 0) {
               var0 = class333.field3836.field1170;
            }

            int var7;
            if (var3 > var5) {
               var7 = var3 - var5;
            } else {
               var7 = var5 - var3;
            }

            int var8;
            if (var4 > var6) {
               var8 = var4 - var6;
            } else {
               var8 = var6 - var4;
            }

            int var9;
            int var10;
            if (var7 > var8) {
               var9 = var8 * 65536 / var7;
               var10 = 32768;

               while(var5 != var3) {
                  if (var5 < var3) {
                     ++var5;
                  } else if (var5 > var3) {
                     --var5;
                  }

                  if ((class333.field3836.field1168[class333.field3836.field1170][var5][var6] & 4) != 0) {
                     var0 = class333.field3836.field1170;
                  }

                  var10 += var9;
                  if (var10 >= 65536) {
                     var10 -= 65536;
                     if (var6 < var4) {
                        ++var6;
                     } else if (var6 > var4) {
                        --var6;
                     }

                     if ((class333.field3836.field1168[class333.field3836.field1170][var5][var6] & 4) != 0) {
                        var0 = class333.field3836.field1170;
                     }
                  }
               }
            } else if (var8 > 0) {
               var9 = var7 * 65536 / var8;
               var10 = 32768;

               while(var4 != var6) {
                  if (var6 < var4) {
                     ++var6;
                  } else if (var6 > var4) {
                     --var6;
                  }

                  if ((class333.field3836.field1168[class333.field3836.field1170][var5][var6] & 4) != 0) {
                     var0 = class333.field3836.field1170;
                  }

                  var10 += var9;
                  if (var10 >= 65536) {
                     var10 -= 65536;
                     if (var5 < var3) {
                        ++var5;
                     } else if (var5 > var3) {
                        --var5;
                     }

                     if ((class333.field3836.field1168[class333.field3836.field1170][var5][var6] & 4) != 0) {
                        var0 = class333.field3836.field1170;
                     }
                  }
               }
            }
         }

         if (var1 >= 0 && 104 > var1 && var2 >= 0 && 104 > var2) {
            if ((class333.field3836.field1168[class333.field3836.field1170][var1][var2] & 4) != 0) {
               var0 = class333.field3836.field1170;
            }

            return var0;
         } else {
            return class333.field3836.field1170;
         }
      }
   }
}
