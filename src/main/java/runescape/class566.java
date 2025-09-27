package runescape;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vv")
public class class566 {
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lvx;"
   )
   class565 field5793;
   @ObfuscatedName("at")
   byte[] field5797;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      longValue = -6851907837653920915L
   )
   long field5795 = -1L;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1582590597
   )
   int field5796;
   @ObfuscatedName("aq")
   byte[] field5798;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      longValue = 6174500122297115795L
   )
   long field5792 = -1L;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 677300503
   )
   int field5799 = 0;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      longValue = -5825309593361177935L
   )
   long field5803;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      longValue = -5290086545413914453L
   )
   long field5801;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      longValue = 1390861569221004347L
   )
   long field5804;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      longValue = 1174260547301708595L
   )
   long field5794;

   @ObfuscatedSignature(
      descriptor = "(Lvx;II)V"
   )
   public class566(class565 var1, int var2, int var3) throws IOException {
      this.field5793 = var1;
      this.field5804 = this.field5801 = var1.method10905();
      this.field5797 = new byte[var2];
      this.field5798 = new byte[var3];
      this.field5803 = 0L;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-365245121"
   )
   public void method10915() throws IOException {
      this.method10914();
      this.field5793.method10891();
   }

   @ObfuscatedName("aw")
   public void method10916(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.field5803 = var1;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(B)J",
      garbageValue = "34"
   )
   public long method10917() {
      return this.field5804;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/io/File;",
      garbageValue = "1744867207"
   )
   public final File method10918() {
      return this.field5793.method10888();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "1152036084"
   )
   public void method10919(byte[] var1) throws IOException {
      this.method10920(var1, 0, var1.length);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "-69763938"
   )
   public void method10920(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if (-1L != this.field5792 && this.field5803 >= this.field5792 && (long)var3 + this.field5803 <= (long)this.field5799 + this.field5792) {
            System.arraycopy(this.field5798, (int)(this.field5803 - this.field5792), var1, var2, var3);
            this.field5803 += (long)var3;
            return;
         }

         long var4 = this.field5803;
         int var7 = var3;
         int var8;
         if (this.field5803 >= this.field5795 && this.field5803 < this.field5795 + (long)this.field5796) {
            var8 = (int)((long)this.field5796 - (this.field5803 - this.field5795));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.field5797, (int)(this.field5803 - this.field5795), var1, var2, var8);
            this.field5803 += (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > this.field5797.length) {
            this.field5793.method10889(this.field5803);

            for(this.field5794 = this.field5803; var3 > 0; var3 -= var8) {
               var8 = this.field5793.method10894(var1, var2, var3);
               if (var8 == -1) {
                  break;
               }

               this.field5794 += (long)var8;
               this.field5803 += (long)var8;
               var2 += var8;
            }
         } else if (var3 > 0) {
            this.method10921();
            var8 = var3;
            if (var3 > this.field5796) {
               var8 = this.field5796;
            }

            System.arraycopy(this.field5797, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.field5803 += (long)var8;
         }

         if (-1L != this.field5792) {
            if (this.field5792 > this.field5803 && var3 > 0) {
               var8 = var2 + (int)(this.field5792 - this.field5803);
               if (var8 > var3 + var2) {
                  var8 = var3 + var2;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.field5803;
               }
            }

            long var13 = -1L;
            long var10 = -1L;
            if (this.field5792 >= var4 && this.field5792 < (long)var7 + var4) {
               var13 = this.field5792;
            } else if (var4 >= this.field5792 && var4 < this.field5792 + (long)this.field5799) {
               var13 = var4;
            }

            if (this.field5792 + (long)this.field5799 > var4 && (long)this.field5799 + this.field5792 <= (long)var7 + var4) {
               var10 = this.field5792 + (long)this.field5799;
            } else if (var4 + (long)var7 > this.field5792 && (long)var7 + var4 <= this.field5792 + (long)this.field5799) {
               var10 = (long)var7 + var4;
            }

            if (var13 > -1L && var10 > var13) {
               int var12 = (int)(var10 - var13);
               System.arraycopy(this.field5798, (int)(var13 - this.field5792), var1, (int)(var13 - var4) + var2, var12);
               if (var10 > this.field5803) {
                  var3 = (int)((long)var3 - (var10 - this.field5803));
                  this.field5803 = var10;
               }
            }
         }
      } catch (IOException var16) {
         this.field5794 = -1L;
         throw var16;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
   )
   void method10921() throws IOException {
      this.field5796 = 0;
      if (this.field5794 != this.field5803) {
         this.field5793.method10889(this.field5803);
         this.field5794 = this.field5803;
      }

      int var2;
      for(this.field5795 = this.field5803; this.field5796 < this.field5797.length; this.field5796 += var2) {
         int var1 = this.field5797.length - this.field5796;
         if (var1 > 200000000) {
            var1 = 200000000;
         }

         var2 = this.field5793.method10894(this.field5797, this.field5796, var1);
         if (var2 == -1) {
            break;
         }

         this.field5794 += (long)var2;
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "1911750088"
   )
   public void method10937(byte[] var1, int var2, int var3) throws IOException {
      try {
         if ((long)var3 + this.field5803 > this.field5804) {
            this.field5804 = this.field5803 + (long)var3;
         }

         if (-1L != this.field5792 && (this.field5803 < this.field5792 || this.field5803 > this.field5792 + (long)this.field5799)) {
            this.method10914();
         }

         if (-1L != this.field5792 && this.field5803 + (long)var3 > (long)this.field5798.length + this.field5792) {
            int var4 = (int)((long)this.field5798.length - (this.field5803 - this.field5792));
            System.arraycopy(var1, var2, this.field5798, (int)(this.field5803 - this.field5792), var4);
            this.field5803 += (long)var4;
            var2 += var4;
            var3 -= var4;
            this.field5799 = this.field5798.length;
            this.method10914();
         }

         if (var3 <= this.field5798.length) {
            if (var3 > 0) {
               if (-1L == this.field5792) {
                  this.field5792 = this.field5803;
               }

               System.arraycopy(var1, var2, this.field5798, (int)(this.field5803 - this.field5792), var3);
               this.field5803 += (long)var3;
               if (this.field5803 - this.field5792 > (long)this.field5799) {
                  this.field5799 = (int)(this.field5803 - this.field5792);
               }

            }
         } else {
            if (this.field5794 != this.field5803) {
               this.field5793.method10889(this.field5803);
               this.field5794 = this.field5803;
            }

            this.field5793.method10909(var1, var2, var3);
            this.field5794 += (long)var3;
            if (this.field5794 > this.field5801) {
               this.field5801 = this.field5794;
            }

            long var9 = -1L;
            long var6 = -1L;
            if (this.field5803 >= this.field5795 && this.field5803 < (long)this.field5796 + this.field5795) {
               var9 = this.field5803;
            } else if (this.field5795 >= this.field5803 && this.field5795 < (long)var3 + this.field5803) {
               var9 = this.field5795;
            }

            if (this.field5803 + (long)var3 > this.field5795 && this.field5803 + (long)var3 <= this.field5795 + (long)this.field5796) {
               var6 = this.field5803 + (long)var3;
            } else if (this.field5795 + (long)this.field5796 > this.field5803 && (long)this.field5796 + this.field5795 <= (long)var3 + this.field5803) {
               var6 = this.field5795 + (long)this.field5796;
            }

            if (var9 > -1L && var6 > var9) {
               int var8 = (int)(var6 - var9);
               System.arraycopy(var1, (int)(var9 + (long)var2 - this.field5803), this.field5797, (int)(var9 - this.field5795), var8);
            }

            this.field5803 += (long)var3;
         }
      } catch (IOException var12) {
         this.field5794 = -1L;
         throw var12;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1725984290"
   )
   void method10914() throws IOException {
      if (-1L != this.field5792) {
         if (this.field5792 != this.field5794) {
            this.field5793.method10889(this.field5792);
            this.field5794 = this.field5792;
         }

         this.field5793.method10909(this.field5798, 0, this.field5799);
         this.field5794 += 677300503L * (long)(this.field5799 * 843775655);
         if (this.field5794 > this.field5801) {
            this.field5801 = this.field5794;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.field5792 >= this.field5795 && this.field5792 < (long)this.field5796 + this.field5795) {
            var1 = this.field5792;
         } else if (this.field5795 >= this.field5792 && this.field5795 < (long)this.field5799 + this.field5792) {
            var1 = this.field5795;
         }

         if ((long)this.field5799 + this.field5792 > this.field5795 && this.field5792 + (long)this.field5799 <= this.field5795 + (long)this.field5796) {
            var3 = (long)this.field5799 + this.field5792;
         } else if (this.field5795 + (long)this.field5796 > this.field5792 && this.field5795 + (long)this.field5796 <= (long)this.field5799 + this.field5792) {
            var3 = (long)this.field5796 + this.field5795;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.field5798, (int)(var1 - this.field5792), this.field5797, (int)(var1 - this.field5795), var5);
         }

         this.field5792 = -1L;
         this.field5799 = 0;
      }

   }
}
