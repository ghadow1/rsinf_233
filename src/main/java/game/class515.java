package game;

import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("to")
public final class class515 {
   @ObfuscatedName("af")
   static byte[] field5470 = new byte[520];
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lvv;"
   )
   class566 field5469 = null;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lvv;"
   )
   class566 field5472 = null;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1079099507
   )
   int field5471;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 857823363
   )
   int field5473 = 65000;

   @ObfuscatedSignature(
      descriptor = "(ILvv;Lvv;I)V"
   )
   public class515(int var1, class566 var2, class566 var3, int var4) {
      this.field5471 = var1;
      this.field5469 = var2;
      this.field5472 = var3;
      this.field5473 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)[B",
      garbageValue = "-1347382812"
   )
   public byte[] method10265(int var1) {
      synchronized(this.field5469) {
         try {
            Object var10000;
            if (this.field5472.method10917() < (long)(var1 * 6 + 6)) {
               var10000 = null;
               return (byte[])var10000;
            } else {
               this.field5472.method10916((long)(var1 * 6));
               this.field5472.method10920(field5470, 0, 6);
               int var3 = ((field5470[0] & 255) << 16) + (field5470[2] & 255) + ((field5470[1] & 255) << 8);
               int var4 = (field5470[5] & 255) + ((field5470[3] & 255) << 16) + ((field5470[4] & 255) << 8);
               if (var3 < 0 || var3 > this.field5473) {
                  var10000 = null;
                  return (byte[])var10000;
               } else if (var4 <= 0 || (long)var4 > this.field5469.method10917() / 520L) {
                  var10000 = null;
                  return (byte[])var10000;
               } else {
                  byte[] var5 = new byte[var3];
                  int var6 = 0;
                  int var7 = 0;

                  while(var6 < var3) {
                     if (var4 == 0) {
                        var10000 = null;
                        return (byte[])var10000;
                     }

                     this.field5469.method10916((long)var4 * 520L);
                     int var8 = var3 - var6;
                     int var9;
                     int var10;
                     int var11;
                     int var12;
                     byte var13;
                     if (var1 > 65535) {
                        if (var8 > 510) {
                           var8 = 510;
                        }

                        var13 = 10;
                        this.field5469.method10920(field5470, 0, var13 + var8);
                        var9 = ((field5470[1] & 255) << 16) + ((field5470[0] & 255) << 24) + (field5470[3] & 255) + ((field5470[2] & 255) << 8);
                        var10 = (field5470[5] & 255) + ((field5470[4] & 255) << 8);
                        var11 = (field5470[8] & 255) + ((field5470[7] & 255) << 8) + ((field5470[6] & 255) << 16);
                        var12 = field5470[9] & 255;
                     } else {
                        if (var8 > 512) {
                           var8 = 512;
                        }

                        var13 = 8;
                        this.field5469.method10920(field5470, 0, var13 + var8);
                        var9 = (field5470[1] & 255) + ((field5470[0] & 255) << 8);
                        var10 = (field5470[3] & 255) + ((field5470[2] & 255) << 8);
                        var11 = ((field5470[5] & 255) << 8) + ((field5470[4] & 255) << 16) + (field5470[6] & 255);
                        var12 = field5470[7] & 255;
                     }

                     if (var9 == var1 && var10 == var7 && var12 == this.field5471) {
                        if (var11 >= 0 && (long)var11 <= this.field5469.method10917() / 520L) {
                           int var14 = var13 + var8;

                           for(int var15 = var13; var15 < var14; ++var15) {
                              var5[var6++] = field5470[var15];
                           }

                           var4 = var11;
                           ++var7;
                           continue;
                        }

                        var10000 = null;
                        return (byte[])var10000;
                     }

                     var10000 = null;
                     return (byte[])var10000;
                  }

                  byte[] var20 = var5;
                  return var20;
               }
            }
         } catch (IOException var18) {
            return null;
         }
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I[BIB)Z",
      garbageValue = "116"
   )
   public boolean method10266(int var1, byte[] var2, int var3) {
      synchronized(this.field5469) {
         if (var3 >= 0 && var3 <= this.field5473) {
            boolean var5 = this.method10267(var1, var2, var3, true);
            if (!var5) {
               var5 = this.method10267(var1, var2, var3, false);
            }

            return var5;
         } else {
            throw new IllegalArgumentException("" + this.field5471 + ',' + var1 + ',' + var3);
         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I[BIZB)Z",
      garbageValue = "-23"
   )
   boolean method10267(int var1, byte[] var2, int var3, boolean var4) {
      synchronized(this.field5469) {
         try {
            int var6;
            boolean var10000;
            if (var4) {
               if (this.field5472.method10917() < (long)(var1 * 6 + 6)) {
                  var10000 = false;
                  return var10000;
               }

               this.field5472.method10916((long)(var1 * 6));
               this.field5472.method10920(field5470, 0, 6);
               var6 = (field5470[5] & 255) + ((field5470[3] & 255) << 16) + ((field5470[4] & 255) << 8);
               if (var6 <= 0 || (long)var6 > this.field5469.method10917() / 520L) {
                  var10000 = false;
                  return var10000;
               }
            } else {
               var6 = (int)((this.field5469.method10918().length() + 519L) / 520L);
               if (var6 == 0) {
                  var6 = 1;
               }
            }

            int var7 = 0;
            int var8 = 0;

            for(int var9 = var6; var7 < var3; ++var8) {
               int var10 = 0;
               int var11;
               if (var4) {
                  this.field5469.method10916((long)var9 * 520L);
                  int var12;
                  int var13;
                  if (var1 > 65535) {
                     this.field5469.method10920(field5470, 0, 10);
                     var11 = ((field5470[1] & 255) << 16) + ((field5470[0] & 255) << 24) + (field5470[3] & 255) + ((field5470[2] & 255) << 8);
                     var12 = (field5470[5] & 255) + ((field5470[4] & 255) << 8);
                     var10 = (field5470[8] & 255) + ((field5470[7] & 255) << 8) + ((field5470[6] & 255) << 16);
                     var13 = field5470[9] & 255;
                  } else {
                     this.field5469.method10920(field5470, 0, 8);
                     var11 = (field5470[1] & 255) + ((field5470[0] & 255) << 8);
                     var12 = (field5470[3] & 255) + ((field5470[2] & 255) << 8);
                     var10 = ((field5470[5] & 255) << 8) + ((field5470[4] & 255) << 16) + (field5470[6] & 255);
                     var13 = field5470[7] & 255;
                  }

                  if (var11 != var1 || var8 != var12 || var13 != this.field5471) {
                     var10000 = false;
                     return var10000;
                  }

                  if (var10 < 0 || (long)var10 > this.field5469.method10917() / 520L) {
                     var10000 = false;
                     return var10000;
                  }
               }

               if (var10 == 0) {
                  var4 = false;
                  var10 = (int)((this.field5469.method10918().length() + 519L) / 520L);
                  if (var10 == 0) {
                     ++var10;
                  }

                  if (var9 == var10) {
                     ++var10;
                  }
               }

               if (var1 > 65535) {
                  if (var3 - var7 <= 510) {
                     var10 = 0;
                  }

                  field5470[0] = (byte)(var1 >> 24);
                  field5470[1] = (byte)(var1 >> 16);
                  field5470[2] = (byte)(var1 >> 8);
                  field5470[3] = (byte)var1;
                  field5470[4] = (byte)(var8 >> 8);
                  field5470[5] = (byte)var8;
                  field5470[6] = (byte)(var10 >> 16);
                  field5470[7] = (byte)(var10 >> 8);
                  field5470[8] = (byte)var10;
                  field5470[9] = (byte)this.field5471;
                  this.field5469.method10916((long)var9 * 520L);
                  this.field5469.method10937(field5470, 0, 10);
                  var11 = var3 - var7;
                  if (var11 > 510) {
                     var11 = 510;
                  }

                  this.field5469.method10937(var2, var7, var11);
                  var7 += var11;
               } else {
                  if (var3 - var7 <= 512) {
                     var10 = 0;
                  }

                  field5470[0] = (byte)(var1 >> 8);
                  field5470[1] = (byte)var1;
                  field5470[2] = (byte)(var8 >> 8);
                  field5470[3] = (byte)var8;
                  field5470[4] = (byte)(var10 >> 16);
                  field5470[5] = (byte)(var10 >> 8);
                  field5470[6] = (byte)var10;
                  field5470[7] = (byte)this.field5471;
                  this.field5469.method10916(520L * (long)var9);
                  this.field5469.method10937(field5470, 0, 8);
                  var11 = var3 - var7;
                  if (var11 > 512) {
                     var11 = 512;
                  }

                  this.field5469.method10937(var2, var7, var11);
                  var7 += var11;
               }

               var9 = var10;
            }

            field5470[0] = (byte)(var3 >> 16);
            field5470[1] = (byte)(var3 >> 8);
            field5470[2] = (byte)var3;
            field5470[3] = (byte)(var6 >> 16);
            field5470[4] = (byte)(var6 >> 8);
            field5470[5] = (byte)var6;
            this.field5472.method10916((long)(var1 * 6));
            this.field5472.method10937(field5470, 0, 6);
            var10000 = true;
            return var10000;
         } catch (IOException var16) {
            return false;
         }
      }
   }

   public String toString() {
      return "" + this.field5471;
   }
}
