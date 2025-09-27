package runescape;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tt")
public class class508 extends class507 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1524088059
   )
   static final int field5439;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lky;"
   )
   final class279 field5437 = new class279();
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lky;"
   )
   final class279 field5438 = new class279();
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -321872719
   )
   int field5440 = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1078397815
   )
   int field5436 = 0;

   static {
      field5439 = client.field362 + 3;
   }

   class508() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lky;Ltn;II)V",
      garbageValue = "-2073083460"
   )
   void vmethod10152(class279 var1, class506 var2, int var3) {
      this.field5437.method6282(var1);
      this.field5438.method6282(var2.field5434);
      this.field5440 = var3 - 1;
      this.field5436 = var2.field5433 + field5439;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lky;III)Z",
      garbageValue = "-1327234875"
   )
   boolean vmethod10149(class279 var1, int var2, int var3) {
      if (this.field5440 >= this.field5436) {
         var1.method6282(this.field5438);
         return true;
      } else {
         float var4 = class33.method506(var2, this.field5440, this.field5436);
         class279 var5 = this.field5437;
         class279 var6 = this.field5438;
         float var8 = Math.max(0.0F, Math.min(var4, 1.0F));
         int var9 = var6.method6276() - var5.method6276();
         int var10 = var6.method6278() - var5.method6278();
         var9 = (int)(var8 * (float)var9);
         var10 = (int)((float)var10 * var8);
         var1.method6275(var5.method6276() + var9, var5.method6278() + var10);
         int var11 = class166.method4030(var5.method6289(), var6.method6289());
         var11 = (int)(var8 * (float)var11);
         var1.method6286(var5.method6289() + var11);
         return var4 >= 1.0F;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-166288193"
   )
   void vmethod10151(int var1, int var2) {
      this.field5437.method6285(var1, var2);
      this.field5438.method6285(var1, var2);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
      garbageValue = "-1659314821"
   )
   public static void RunException_sendStackTrace(String var0, Throwable var1) {
      if (var1 != null) {
         var1.printStackTrace();
      } else {
         try {
            String var2 = "";
            if (var1 != null) {
               Throwable var4 = var1;
               String var5;
               if (var1 instanceof class616) {
                  class616 var6 = (class616)var1;
                  var5 = var6.field6090 + " | ";
                  var4 = var6.field6087;
               } else {
                  var5 = "";
               }

               StringWriter var18 = new StringWriter();
               PrintWriter var7 = new PrintWriter(var18);
               var4.printStackTrace(var7);
               var7.close();
               String var8 = var18.toString();
               BufferedReader var9 = new BufferedReader(new StringReader(var8));
               String var10 = var9.readLine();

               label64:
               while(true) {
                  while(true) {
                     String var11 = var9.readLine();
                     if (var11 == null) {
                        var5 = var5 + "| " + var10;
                        var2 = var5;
                        break label64;
                     }

                     int var12 = var11.indexOf(40);
                     int var13 = var11.indexOf(41, var12 + 1);
                     if (var12 >= 0 && var13 >= 0) {
                        String var14 = var11.substring(var12 + 1, var13);
                        int var15 = var14.indexOf(".java:");
                        if (var15 >= 0) {
                           var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
                           var5 = var5 + var14 + ' ';
                           continue;
                        }

                        var11 = var11.substring(0, var12);
                     }

                     var11 = var11.trim();
                     var11 = var11.substring(var11.lastIndexOf(32) + 1);
                     var11 = var11.substring(var11.lastIndexOf(9) + 1);
                     var5 = var5 + var11 + ' ';
                  }
               }
            }

            if (var0 != null) {
               if (var1 != null) {
                  var2 = var2 + " | ";
               }

               var2 = var2 + var0;
            }

            System.out.println("Error: " + var2);
            var2 = var2.replace(':', '.');
            var2 = var2.replace('@', '_');
            var2 = var2.replace('&', '_');
            var2 = var2.replace('#', '_');
            if (class616.field6091 == null) {
               return;
            }

            URL var3 = new URL(class616.field6091.getCodeBase(), "clienterror.ws?cv=" + class616.field6085 + "&cs=" + class616.field6088 + "&u=" + class616.field6086 + "&v1=" + class258.field3092 + "&v2=" + class129.field1588 + "&ct=" + class616.field6089 + "&e=" + var2);
            DataInputStream var17 = new DataInputStream(var3.openStream());
            var17.read();
            var17.close();
         } catch (Exception var16) {
         }

      }
   }
}
