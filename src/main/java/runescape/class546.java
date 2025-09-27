package runescape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vj")
public class class546 extends class544 implements class118 {
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 1524586385
   )
   public int field5615;
   @ObfuscatedName("bh")
   boolean field5616;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -1387405423
   )
   int field5617;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = -1498585167
   )
   int field5628;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 1021463221
   )
   int field5636;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -109020011
   )
   int field5609;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -459953697
   )
   int field5608;
   @ObfuscatedName("bm")
   boolean field5622;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = 145813101
   )
   int field5632;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -539507735
   )
   int field5624;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -1721208821
   )
   int field5625;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = -747966881
   )
   int field5626;
   @ObfuscatedName("cz")
   String field5627;
   @ObfuscatedName("cf")
   String field5611;
   @ObfuscatedName("cg")
   String field5629;
   @ObfuscatedName("ci")
   String field5630;
   @ObfuscatedName("cp")
   @ObfuscatedGetter(
      intValue = 1443667205
   )
   int field5631;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = 580651873
   )
   int field5610;
   @ObfuscatedName("cc")
   @ObfuscatedGetter(
      intValue = -986889351
   )
   int field5633;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = 847732193
   )
   int field5634;
   @ObfuscatedName("ce")
   String field5635;
   @ObfuscatedName("cr")
   String field5621;
   @ObfuscatedName("cb")
   int[] field5637 = new int[3];
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = 638903767
   )
   int field5638;
   @ObfuscatedName("cq")
   String field5639;
   @ObfuscatedName("cn")
   String field5620;

   class546(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26, String var27) {
      this.field5615 = var1;
      this.field5616 = var2;
      this.field5617 = var3;
      this.field5628 = var4;
      this.field5636 = var5;
      this.field5609 = var6;
      this.field5608 = var7;
      this.field5622 = var8;
      this.field5632 = var9;
      this.field5624 = var10;
      this.field5625 = var11;
      this.field5626 = var12;
      this.field5627 = var13;
      this.field5611 = var14;
      this.field5629 = var15;
      this.field5630 = var16;
      this.field5631 = var17;
      this.field5610 = var18;
      this.field5633 = var19;
      this.field5634 = var20;
      this.field5635 = var21;
      this.field5621 = var22;
      this.field5637 = var23;
      this.field5638 = var24;
      this.field5639 = var25;
      this.field5620 = var26;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "-1260997885"
   )
   public void write(Buffer var1) {
      System.out.println("* Sending machine info");
      // Print and write byte
      System.out.println("Writing byte (9): " + 9);
      var1.writeByte(9);

      // Print and write this.field5615
      System.out.println("Writing byte (field5615): " + this.field5615);
      var1.writeByte(this.field5615);

      // Print and write this.field5616
      System.out.println("Writing byte (field5616): " + (this.field5616 ? 1 : 0));
      var1.writeByte(this.field5616 ? 1 : 0);

      // Print and write this.field5617
      System.out.println("Writing short (field5617): " + this.field5617);
      var1.writeShortBigEndian(this.field5617);

      // Print and write this.field5628
      System.out.println("Writing byte (field5628): " + this.field5628);
      var1.writeByte(this.field5628);

      // Continue this pattern for all other fields
      System.out.println("Writing byte (field5636): " + this.field5636);
      var1.writeByte(this.field5636);

      System.out.println("Writing byte (field5609): " + this.field5609);
      var1.writeByte(this.field5609);

      System.out.println("Writing byte (field5608): " + this.field5608);
      var1.writeByte(this.field5608);

      System.out.println("Writing byte (field5622): " + (this.field5622 ? 1 : 0));
      var1.writeByte(this.field5622 ? 1 : 0);

      System.out.println("Writing short (field5632): " + this.field5632);
      var1.writeShortBigEndian(this.field5632);

      System.out.println("Writing byte (field5624): " + this.field5624);
      var1.writeByte(this.field5624);

      System.out.println("Writing tri-byte (field5625): " + this.field5625);
      var1.writeTriByte(this.field5625);

      System.out.println("Writing short (field5626): " + this.field5626);
      var1.writeShortBigEndian(this.field5626);

      System.out.println("Writing string (field5627): " + this.field5627);
      var1.writeString2Array(this.field5627);

      System.out.println("Writing string (field5611): " + this.field5611);
      var1.writeString2Array(this.field5611);

      System.out.println("Writing string (field5629): " + this.field5629);
      var1.writeString2Array(this.field5629);

      System.out.println("Writing string (field5630): " + this.field5630);
      var1.writeString2Array(this.field5630);

      System.out.println("Writing byte (field5610): " + this.field5610);
      var1.writeByte(this.field5610);

      System.out.println("Writing short (field5631): " + this.field5631);
      var1.writeShortBigEndian(this.field5631);

      System.out.println("Writing string (field5635): " + this.field5635);
      var1.writeString2Array(this.field5635);

      System.out.println("Writing string (field5621): " + this.field5621);
      var1.writeString2Array(this.field5621);

      System.out.println("Writing byte (field5633): " + this.field5633);
      var1.writeByte(this.field5633);

      System.out.println("Writing byte (field5634): " + this.field5634);
      var1.writeByte(this.field5634);

      for (int var2 = 0; var2 < this.field5637.length; ++var2) {
         System.out.println("Writing writeIntBigEndian sdsdsdsd for index " + var2 + ": " + this.field5637[var2]);
         var1.writeIntBigEndian(this.field5637[var2]);
      }

      System.out.println("Writing integer (field5638): " + this.field5638);
      var1.writeIntBigEndian(this.field5638);

      System.out.println("Writing string (field5639): " + this.field5639);
      var1.writeString2Array(this.field5639);

      System.out.println("Writing string (field5620): " + this.field5620);
      var1.writeString2Array(this.field5620);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "50500278"
   )
   public int method10578() {
      byte var1 = 39;
      String var4 = this.field5627;
      int var3 = var4.length() + 2;
      int var14 = var3 + var1;
      var14 += class514.method10262(this.field5611);
      String var7 = this.field5629;
      int var6 = var7.length() + 2;
      var14 += var6;
      String var10 = this.field5630;
      int var9 = var10.length() + 2;
      var14 += var9;
      var14 += class514.method10262(this.field5635);
      var14 += class514.method10262(this.field5621);
      var14 += class514.method10262(this.field5639);
      String var13 = this.field5620;
      int var12 = var13.length() + 2;
      var14 += var12;
      return var14;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/String;",
      garbageValue = "0"
   )
   public String method10585(int var1) {
      String var2 = "";
      String var3 = "12345678-0000-0000-0000-123456789012";
      switch(var1) {
      case 1:
         var2 = "wmic csproduct get UUID";
         break;
      case 2:
         var2 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
         break;
      case 3:
         var2 = "cat /etc/machine-id";
         break;
      default:
         return "Unknown";
      }

      BufferedReader var4 = null;

      try {
         Process var5 = Runtime.getRuntime().exec(var2);
         var4 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
         StringBuilder var6 = new StringBuilder();

         String var7;
         while((var7 = var4.readLine()) != null) {
            var6.append(var7 + "\n");
         }

         if (var1 == 1) {
            var3 = var6.substring(var6.indexOf("\n"), var6.length()).trim();
         } else if (var1 == 2) {
            int var8 = var6.indexOf("UUID: ") + 36;
            var3 = var6.substring(var6.indexOf("UUID: "), var8).replace("UUID: ", "");
         } else if (var1 == 3) {
            if (var6.length() == 33) {
               var6 = new StringBuilder(var6.substring(0, var6.length() - 1));
            }

            if (var6.length() == 32) {
               var6.insert(20, "-");
               var6.insert(16, "-");
               var6.insert(12, "-");
               var6.insert(8, "-");
               var3 = var6.toString();
            } else {
               var3 = "12345678-0000-0000-0000-123456789012";
            }
         }
      } catch (Exception var17) {
      } finally {
         try {
            if (var4 != null) {
               var4.close();
            }
         } catch (IOException var16) {
         }

      }

      return var3;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1272774764"
   )
   static void method10584(String var0) {
      String var1;
      if (var0 != null && !var0.isEmpty() && var0.charAt(0) != '#') {
         var1 = var0;
      } else {
         var1 = "";
      }

      class52.field747 = var1;
   }
}
