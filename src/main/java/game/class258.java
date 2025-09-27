package game;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
public class class258 implements Runnable {
   @ObfuscatedName("ac")
   public static String field3092;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lku;"
   )
   class266 field3093 = null;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lku;"
   )
   class266 field3090 = null;
   @ObfuscatedName("as")
   Thread field3089;
   @ObfuscatedName("al")
   boolean field3094 = false;

   public class258() {
      field3092 = "Unknown";
      class129.field1588 = "1.6";

      try {
         field3092 = System.getProperty("java.vendor");
         class129.field1588 = System.getProperty("java.version");
      } catch (Exception var2) {
      }

      this.field3094 = false;
      this.field3089 = new Thread(this);
      this.field3089.setPriority(10);
      this.field3089.setDaemon(true);
      this.field3089.start();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1140258154"
   )
   public final void method5891() {
      synchronized(this) {
         this.field3094 = true;
         this.notifyAll();
      }

      try {
         this.field3089.join();
      } catch (InterruptedException var3) {
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIILjava/lang/Object;B)Lku;",
      garbageValue = "6"
   )
   final class266 method5892(int var1, int var2, int var3, Object var4) {
      class266 var5 = new class266();
      var5.field3158 = var1;
      var5.field3152 = var2;
      var5.field3159 = var4;
      synchronized(this) {
         if (this.field3090 != null) {
            this.field3090.field3157 = var5;
            this.field3090 = var5;
         } else {
            this.field3090 = this.field3093 = var5;
         }

         this.notify();
         return var5;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;II)Lku;",
      garbageValue = "-2033686042"
   )
   public final class266 method5888(String var1, int var2) {
      return this.method5892(1, var2, 0, var1);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Runnable;II)Lku;",
      garbageValue = "989916454"
   )
   public final class266 method5889(Runnable var1, int var2) {
      return this.method5892(2, var2, 0, var1);
   }

   public final void run() {
      while(true) {
         class266 var1;
         synchronized(this) {
            while(true) {
               if (this.field3094) {
                  return;
               }

               if (this.field3093 != null) {
                  var1 = this.field3093;
                  this.field3093 = this.field3093.field3157;
                  if (this.field3093 == null) {
                     this.field3090 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var8) {
               }
            }
         }

         try {
            int var5 = var1.field3158;
            if (var5 == 1) {
               var1.field3155 = new Socket(InetAddress.getByName((String)var1.field3159), var1.field3152);
            } else if (var5 == 2) {
               Thread var3 = new Thread((Runnable)var1.field3159);
               var3.setDaemon(true);
               var3.start();
               var3.setPriority(var1.field3152);
               var1.field3155 = var3;
            } else if (var5 == 4) {
               var1.field3155 = new DataInputStream(((URL)var1.field3159).openStream());
            }

            var1.field3154 = 1;
         } catch (ThreadDeath var6) {
            throw var6;
         } catch (Throwable var7) {
            var1.field3154 = 2;
         }
      }
   }
}
