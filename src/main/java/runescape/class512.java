package runescape;

import java.io.IOException;
import java.net.Socket;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ts")
public class class512 extends class511 {
   @ObfuscatedName("af")
   Socket field5449;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lte;"
   )
   class513 field5450;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ltx;"
   )
   class514 field5448;

   public class512(Socket var1, int var2, int var3) throws IOException {
      this.field5449 = var1;
      this.field5449.setSoTimeout(30000);
      this.field5449.setTcpNoDelay(true);
      this.field5449.setReceiveBufferSize(65536);
      this.field5449.setSendBufferSize(65536);
      this.field5450 = new class513(this.field5449.getInputStream(), var2);
      this.field5448 = new class514(this.field5449.getOutputStream(), var3);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "2030306076"
   )
   public boolean vmethod10194(int var1) throws IOException {
      return this.field5450.method10233(var1);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "397267938"
   )
   public int available() throws IOException {
      return this.field5450.method10225();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   public int readUnsignedByte() throws IOException {
      return this.field5450.method10227();
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "([BIII)I",
      garbageValue = "2145484894"
   )
   public int read(byte[] var1, int var2, int var3) throws IOException {
      return this.field5450.method10244(var1, var2, var3);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "-1472304779"
   )
   public void vmethod10197(byte[] var1, int var2, int var3) throws IOException {
      this.field5448.method10258(var1, var2, var3);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "217506457"
   )
   public void vmethod10196() {
      this.field5448.method10250();

      try {
         this.field5449.close();
      } catch (IOException var2) {
      }

      this.field5450.method10229();
   }

   protected void finalize() {
      this.vmethod10196();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1099343377"
   )
   public static int method10223(int var0) {
      return var0 >>> 4 & class580.field5844;
   }

   @ObfuscatedName("jw")
   @ObfuscatedSignature(
      descriptor = "(Ldr;I)V",
      garbageValue = "-1790419855"
   )
   static void method10222(class79 var0) {
      if (client.field584 > 0) {
         int var1 = client.field583 * 128;
         class36.method731(var0, var1, class556.field5748);
      }

   }
}
