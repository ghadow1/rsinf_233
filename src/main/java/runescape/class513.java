package runescape;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("te")
public class class513 implements Runnable {
   @ObfuscatedName("af")
   Thread field5453;
   @ObfuscatedName("aw")
   InputStream field5452;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 230470231
   )
   int field5456;
   @ObfuscatedName("ac")
   byte[] field5451;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 2029327651
   )
   int field5454 = 0;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 442816821
   )
   int field5455 = 0;
   @ObfuscatedName("ao")
   IOException field5457;

   class513(InputStream var1, int var2) {
      this.field5452 = var1;
      this.field5456 = var2 + 1;
      this.field5451 = new byte[this.field5456];
      this.field5453 = new Thread(this);
      this.field5453.setDaemon(true);
      this.field5453.start();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "317208011"
   )
   boolean method10233(int var1) throws IOException {
      if (var1 == 0) {
         return true;
      } else if (var1 > 0 && var1 < this.field5456) {
         synchronized(this) {
            int var3;
            if (this.field5454 <= this.field5455) {
               var3 = this.field5455 - this.field5454;
            } else {
               var3 = this.field5456 - this.field5454 + this.field5455;
            }

            if (var3 < var1) {
               if (this.field5457 != null) {
                  throw new IOException(this.field5457.toString());
               } else {
                  this.notifyAll();
                  return false;
               }
            } else {
               return true;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1994415983"
   )
   int method10225() throws IOException {
      synchronized(this) {
         int var2;
         if (this.field5454 <= this.field5455) {
            var2 = this.field5455 - this.field5454;
         } else {
            var2 = this.field5456 - this.field5454 + this.field5455;
         }

         if (var2 <= 0 && this.field5457 != null) {
            throw new IOException(this.field5457.toString());
         } else {
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1758403815"
   )
   int method10227() throws IOException {
      synchronized(this) {
         if (this.field5455 == this.field5454) {
            if (this.field5457 != null) {
               throw new IOException(this.field5457.toString());
            } else {
               return -1;
            }
         } else {
            int var2 = this.field5451[this.field5454] & 255;
            this.field5454 = (this.field5454 + 1) % this.field5456;
            this.notifyAll();
            return var2;
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "([BIIB)I",
      garbageValue = "-34"
   )
   int method10244(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            int var5;
            if (this.field5454 <= this.field5455) {
               var5 = this.field5455 - this.field5454;
            } else {
               var5 = this.field5456 - this.field5454 + this.field5455;
            }

            if (var3 > var5) {
               var3 = var5;
            }

            if (var3 == 0 && this.field5457 != null) {
               throw new IOException(this.field5457.toString());
            } else {
               if (var3 + this.field5454 <= this.field5456) {
                  System.arraycopy(this.field5451, this.field5454, var1, var2, var3);
               } else {
                  int var6 = this.field5456 - this.field5454;
                  System.arraycopy(this.field5451, this.field5454, var1, var2, var6);
                  System.arraycopy(this.field5451, 0, var1, var6 + var2, var3 - var6);
               }

               this.field5454 = (var3 + this.field5454) % this.field5456;
               this.notifyAll();
               return var3;
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "978848607"
   )
   void method10229() {
      synchronized(this) {
         if (this.field5457 == null) {
            this.field5457 = new IOException("");
         }

         this.notifyAll();
      }

      try {
         this.field5453.join();
      } catch (InterruptedException var3) {
      }

   }

   public void run() {
      while(true) {
         int var1;
         synchronized(this) {
            while(true) {
               if (this.field5457 != null) {
                  return;
               }

               if (this.field5454 == 0) {
                  var1 = this.field5456 - this.field5455 - 1;
               } else if (this.field5454 <= this.field5455) {
                  var1 = this.field5456 - this.field5455;
               } else {
                  var1 = this.field5454 - this.field5455 - 1;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var10) {
               }
            }
         }

         int var7;
         try {
            var7 = this.field5452.read(this.field5451, this.field5455, var1);
            if (var7 == -1) {
               throw new EOFException();
            }
         } catch (IOException var11) {
            IOException var3 = var11;
            synchronized(this) {
               this.field5457 = var3;
               return;
            }
         }

         synchronized(this) {
            this.field5455 = (var7 + this.field5455) % this.field5456;
         }
      }
   }
}
