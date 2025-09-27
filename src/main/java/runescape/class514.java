package runescape;

import java.awt.Image;
import java.io.IOException;
import java.io.OutputStream;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tx")
public class class514 implements Runnable {
   @ObfuscatedName("ax")
   static Image field5468;
   @ObfuscatedName("pz")
   @ObfuscatedSignature(
      descriptor = "Lvc;"
   )
   static class555 field5467;
   @ObfuscatedName("af")
   Thread field5465;
   @ObfuscatedName("aw")
   OutputStream field5460;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -634771801
   )
   int field5461;
   @ObfuscatedName("ac")
   byte[] field5459;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -211398701
   )
   int field5464 = 0;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 327141635
   )
   int field5462 = 0;
   @ObfuscatedName("ao")
   IOException field5463;
   @ObfuscatedName("as")
   boolean field5466;

   class514(OutputStream var1, int var2) {
      this.field5460 = var1;
      this.field5461 = var2 + 1;
      this.field5459 = new byte[this.field5461];
      this.field5465 = new Thread(this);
      this.field5465.setDaemon(true);
      this.field5465.start();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "71"
   )
   boolean method10248() {
      if (this.field5466) {
         try {
            this.field5460.close();
            if (this.field5463 == null) {
               this.field5463 = new IOException("");
            }
         } catch (IOException var2) {
            if (this.field5463 == null) {
               this.field5463 = new IOException(var2);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "([BIIB)V",
      garbageValue = "81"
   )
   void method10258(byte[] var1, int var2, int var3) throws IOException {
      if (var3 >= 0 && var2 >= 0 && var3 + var2 <= var1.length) {
         synchronized(this) {
            if (this.field5463 != null) {
               throw new IOException(this.field5463.toString());
            } else {
               int var5;
               if (this.field5464 <= this.field5462) {
                  var5 = this.field5461 - this.field5462 + this.field5464 - 1;
               } else {
                  var5 = this.field5464 - this.field5462 - 1;
               }

               if (var5 < var3) {
                  throw new IOException("");
               } else {
                  if (var3 + this.field5462 <= this.field5461) {
                     System.arraycopy(var1, var2, this.field5459, this.field5462, var3);
                  } else {
                     int var6 = this.field5461 - this.field5462;
                     System.arraycopy(var1, var2, this.field5459, this.field5462, var6);
                     System.arraycopy(var1, var6 + var2, this.field5459, 0, var3 - var6);
                  }

                  this.field5462 = (var3 + this.field5462) % this.field5461;
                  this.notifyAll();
               }
            }
         }
      } else {
         throw new IOException();
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "179023291"
   )
   void method10250() {
      synchronized(this) {
         this.field5466 = true;
         this.notifyAll();
      }

      try {
         this.field5465.join();
      } catch (InterruptedException var3) {
      }

   }

   public void run() {
      do {
         int var1;
         synchronized(this) {
            while(true) {
               if (this.field5463 != null) {
                  return;
               }

               if (this.field5464 <= this.field5462) {
                  var1 = this.field5462 - this.field5464;
               } else {
                  var1 = this.field5461 - this.field5464 + this.field5462;
               }

               if (var1 > 0) {
                  break;
               }

               try {
                  this.field5460.flush();
               } catch (IOException var11) {
                  this.field5463 = var11;
                  return;
               }

               if (this.method10248()) {
                  return;
               }

               try {
                  this.wait();
               } catch (InterruptedException var12) {
               }
            }
         }

         try {
            if (var1 + this.field5464 <= this.field5461) {
               this.field5460.write(this.field5459, this.field5464, var1);
            } else {
               int var7 = this.field5461 - this.field5464;
               this.field5460.write(this.field5459, this.field5464, var7);
               this.field5460.write(this.field5459, 0, var1 - var7);
            }
         } catch (IOException var10) {
            IOException var2 = var10;
            synchronized(this) {
               this.field5463 = var2;
               return;
            }
         }

         synchronized(this) {
            this.field5464 = (var1 + this.field5464) % this.field5461;
         }
      } while(!this.method10248());

   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "-170869480"
   )
   public static int method10262(String var0) {
      return var0.length() + 2;
   }

   @ObfuscatedName("of")
   @ObfuscatedSignature(
      descriptor = "(IIZI)V",
      garbageValue = "963621894"
   )
   static final void method10263(int var0, int var1, boolean var2) {
      if (client.field582[var0] != null) {
         if (var1 >= 0 && var1 < client.field582[var0].method4076()) {
            class153 var3 = (class153)client.field582[var0].field1918.get(var1);
            class329 var4 = EnumComposition.getPacketBufferNode(ClientPackets.field3559, client.packetWriter.isaacCipher);
            var4.out.writeByte(4 + class288.method6418(var3.field1779.method11909()));
            var4.out.writeByte(var0);
            var4.out.writeShortBigEndian(var1);
            var4.out.method11264(var2);
            var4.out.writeNullTermString(var3.field1779.method11909());
            client.packetWriter.addNode(var4);
         }
      }
   }
}
