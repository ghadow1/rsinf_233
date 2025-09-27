package runescape;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
public abstract class class119 implements Runnable {
   @ObfuscatedName("fu")
   @ObfuscatedSignature(
      descriptor = "Lns;"
   )
   static class358 field1554;
   @ObfuscatedName("pi")
   static byte[][] field1553;
   @ObfuscatedName("af")
   final Thread field1549 = new Thread(this);
   @ObfuscatedName("aw")
   volatile boolean field1552;
   @ObfuscatedName("at")
   Queue field1550 = new LinkedList();
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1423151599
   )
   int field1551;

   class119(int var1) {
      this.field1549.setPriority(1);
      this.field1549.start();
      this.field1551 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lea;I)V",
      garbageValue = "20500778"
   )
   abstract void vmethod3505(class121 var1) throws IOException;

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URLConnection;B)I",
      garbageValue = "58"
   )
   int method3500(URLConnection var1) {
      int var2 = class121.field1558;
      if (var1 != null) {
         try {
            if (var1 instanceof HttpURLConnection) {
               var2 = ((HttpURLConnection)var1).getResponseCode();
            }
         } catch (IOException var4) {
         }
      }

      return var2;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URLConnection;I)V",
      garbageValue = "1572386255"
   )
   void method3487(URLConnection var1) {
      var1.setConnectTimeout(5000);
      var1.setReadTimeout(5000);
      var1.setUseCaches(false);
      var1.setRequestProperty("Connection", "close");
      var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1551);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URLConnection;Lea;I)V",
      garbageValue = "101863613"
   )
   void method3488(URLConnection var1, class121 var2) {
      DataInputStream var3 = null;

      try {
         int var5 = var1.getContentLength();
         var3 = new DataInputStream(var1.getInputStream());
         byte[] var4;
         if (var5 >= 0) {
            var4 = new byte[var5];
            var3.readFully(var4);
         } else {
            var4 = new byte[0];
            byte[] var6 = class137.method3661(5000);

            for(int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
               byte[] var8 = new byte[var4.length + var7];
               System.arraycopy(var4, 0, var8, 0, var4.length);
               System.arraycopy(var6, 0, var8, var4.length, var7);
               var4 = var8;
            }

            class306.method6841(var6);
         }

         var2.field1560 = var4;
      } catch (IOException var14) {
         var2.field1560 = null;
      } finally {
         var2.field1557 = this.method3500(var1);
      }

      if (var3 != null) {
         try {
            var3.close();
         } catch (IOException var13) {
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ljava/net/URL;S)Lea;",
      garbageValue = "-5373"
   )
   public class121 method3489(URL var1) {
      class121 var2 = new class121(var1);
      synchronized(this) {
         this.field1550.add(var2);
         this.notify();
         return var2;
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "-9205"
   )
   public void method3504() {
      this.field1552 = true;

      try {
         synchronized(this) {
            this.notify();
         }

         this.field1549.join();
      } catch (InterruptedException var4) {
      }

   }

   public void run() {
      while(!this.field1552) {
         try {
            class121 var1;
            synchronized(this) {
               var1 = (class121)this.field1550.poll();
               if (var1 == null) {
                  try {
                     this.wait();
                  } catch (InterruptedException var5) {
                  }
                  continue;
               }
            }

            this.vmethod3505(var1);
         } catch (Exception var7) {
            class508.RunException_sendStackTrace((String)null, var7);
         }
      }

   }

   @ObfuscatedName("iy")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "353452298"
   )
   static final void method3491() {
      int[] var0 = client.field335.field1243;
      Iterator var1 = client.field333.iterator();

      while(var1.hasNext()) {
         class79 var2 = (class79)var1.next();

         for(int var3 = 0; var3 < client.field335.field1254; ++var3) {
            class69 var4 = (class69)var2.field1169.method8567((long)var0[var3]);
            if (var4 != null && var4.field1078 > 0) {
               --var4.field1078;
               if (var4.field1078 == 0) {
                  var4.field1075 = null;
               }
            }
         }

         Iterator var5 = var2.field1160.iterator();

         while(var5.hasNext()) {
            class81 var6 = (class81)var5.next();
            if (var6 != null && var6.field1078 > 0) {
               --var6.field1078;
               if (var6.field1078 == 0) {
                  var6.field1075 = null;
               }
            }
         }
      }

   }
}
