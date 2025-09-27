package runescape;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vx")
public final class class565 {
   @ObfuscatedName("af")
   final File field5788;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      longValue = 3368371307376767157L
   )
   final long field5789;
   @ObfuscatedName("at")
   RandomAccessFile field5790;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      longValue = -3028047516700083209L
   )
   long field5791;

   public class565(File var1, String var2, long var3) throws IOException {
      if (var3 == -1L) {
         var3 = Long.MAX_VALUE;
      }

      if (var1.length() > var3) {
         var1.delete();
      }

      this.field5790 = new RandomAccessFile(var1, var2);
      this.field5788 = var1;
      this.field5789 = var3;
      this.field5791 = 0L;
      int var5 = this.field5790.read();
      if (var5 != -1 && !var2.equals("r")) {
         this.field5790.seek(0L);
         this.field5790.write(var5);
      }

      this.field5790.seek(0L);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/io/File;",
      garbageValue = "182829404"
   )
   final File method10888() {
      return this.field5788;
   }

   @ObfuscatedName("aw")
   final void method10889(long var1) throws IOException {
      this.field5790.seek(var1);
      this.field5791 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([BIIB)V",
      garbageValue = "123"
   )
   public final void method10909(byte[] var1, int var2, int var3) throws IOException {
      if (this.field5791 + (long)var3 > this.field5789) {
         this.field5790.seek(this.field5789);
         this.field5790.write(1);
         throw new EOFException();
      } else {
         this.field5790.write(var1, var2, var3);
         this.field5791 += (long)var3;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-79"
   )
   public final void method10891() throws IOException {
      this.method10892(false);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1923349552"
   )
   public final void method10892(boolean var1) throws IOException {
      if (this.field5790 != null) {
         if (var1) {
            try {
               this.field5790.getFD().sync();
            } catch (SyncFailedException var3) {
            }
         }

         this.field5790.close();
         this.field5790 = null;
      }

   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)J",
      garbageValue = "42860673"
   )
   public final long method10905() throws IOException {
      return this.field5790.length();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "([BIIB)I",
      garbageValue = "14"
   )
   public final int method10894(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.field5790.read(var1, var2, var3);
      if (var4 > 0) {
         this.field5791 += (long)var4;
      }

      return var4;
   }

   protected void finalize() throws Throwable {
      if (this.field5790 != null) {
         this.method10891();
      }

   }
}
