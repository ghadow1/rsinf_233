package runescape;

import java.util.Random;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ri")
public abstract class class465 extends class601 {
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "[Lxc;"
   )
   public static class604[] field5246;
   @ObfuscatedName("at")
   static int field5258 = -1;
   @ObfuscatedName("ac")
   static int field5248 = -1;
   @ObfuscatedName("ap")
   static int field5263 = -1;
   @ObfuscatedName("aq")
   static int field5250 = -1;
   @ObfuscatedName("ao")
   static int field5262 = 0;
   @ObfuscatedName("as")
   static int field5252 = 0;
   @ObfuscatedName("al")
   static int field5253 = 256;
   @ObfuscatedName("au")
   static int field5254 = 0;
   @ObfuscatedName("ai")
   static int field5255 = 0;
   @ObfuscatedName("aa")
   static Random field5256 = new Random();
   @ObfuscatedName("am")
   static String[] field5261 = new String[100];
   @ObfuscatedName("an")
   public int field5251 = 0;
   @ObfuscatedName("ar")
   public int field5257;
   @ObfuscatedName("ae")
   public int field5260;
   @ObfuscatedName("ay")
   byte[][] field5249 = new byte[256][];
   @ObfuscatedName("ad")
   int[] field5245;
   @ObfuscatedName("ag")
   int[] field5259;
   @ObfuscatedName("av")
   int[] field5264;
   @ObfuscatedName("ah")
   int[] field5265;
   @ObfuscatedName("ab")
   int[] field5266;
   @ObfuscatedName("ax")
   byte[] field5267;

   class465(byte[] var1) {
      this.method9413(var1);
   }

   class465(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, byte[][] var6) {
      this.field5265 = var2;
      this.field5266 = var3;
      this.field5259 = var4;
      this.field5264 = var5;
      this.method9413(var1);
      this.field5249 = var6;
      int var7 = Integer.MAX_VALUE;
      int var8 = Integer.MIN_VALUE;

      for(int var9 = 0; var9 < 256; ++var9) {
         if (this.field5266[var9] < var7 && this.field5264[var9] != 0) {
            var7 = this.field5266[var9];
         }

         if (this.field5266[var9] + this.field5264[var9] > var8) {
            var8 = this.field5266[var9] + this.field5264[var9];
         }
      }

      this.field5257 = this.field5251 - var7;
      this.field5260 = var8 - this.field5251;
   }

   @ObfuscatedName("af")
   abstract void vmethod9440(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   @ObfuscatedName("aw")
   abstract void vmethod9486(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   @ObfuscatedName("ae")
   void method9413(byte[] var1) {
      this.field5245 = new int[256];
      int var2;
      if (var1.length == 257) {
         for(var2 = 0; var2 < this.field5245.length; ++var2) {
            this.field5245[var2] = var1[var2] & 255;
         }

         this.field5251 = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.field5245[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[256][];

         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[256][];

         int var13;
         for(var13 = 0; var13 < 256; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.field5267 = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if (var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if (var8 != 32 && var8 != 160) {
                     this.field5267[var8 + (var13 << 8)] = (byte)method9407(var11, var12, var4, this.field5245, var10, var13, var8);
                  }
               }
            }
         }

         this.field5251 = var4[32] + var10[32];
      }

   }

   @ObfuscatedName("ay")
   public int method9414(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.field5245[class121.method3526(var1) & 255];
   }

   @ObfuscatedName("ad")
   public int method9415(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
               var2 = var5;
            } else {
               if (var6 == '>' && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if (var7.equals("lt")) {
                     var6 = '<';
                  } else {
                     if (!var7.equals("gt")) {
                        if (var7.startsWith("img=")) {
                           try {
                              int var8 = class190.method4308(var7.substring(4));
                              var4 += field5246[var8].field6005;
                              var3 = -1;
                           } catch (Exception var10) {
                           }
                        }
                        continue;
                     }

                     var6 = '>';
                  }
               }

               if (var6 == 160) {
                  var6 = ' ';
               }

               if (var2 == -1) {
                  var4 += this.field5245[(char)(class121.method3526(var6) & 255)];
                  if (this.field5267 != null && var3 != -1) {
                     var4 += this.field5267[var6 + (var3 << 8)];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("ag")
   public int method9416(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if (var15 == '<') {
               var10 = var14;
            } else {
               if (var15 == '>' && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if (var16.equals("br")) {
                     var3[var12++] = var6.substring(var5);
                     var6.setLength(0);
                     var5 = 0;
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if (var16.equals("lt")) {
                     var4 += this.method9414('<');
                     if (this.field5267 != null && var11 != -1) {
                        var4 += this.field5267[(var11 << 8) + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.method9414('>');
                     if (this.field5267 != null && var11 != -1) {
                        var4 += this.field5267[(var11 << 8) + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = class190.method4308(var16.substring(4));
                        var4 += field5246[var17].field6005;
                        var11 = 0;
                     } catch (Exception var19) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.method9414(var15);
                     if (this.field5267 != null && var11 != -1) {
                        var4 += this.field5267[var15 + (var11 << 8)];
                     }

                     var11 = var15;
                  }

                  if (var15 == ' ') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
                     var3[var12++] = var6.substring(var5, var7 - var9);
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if (var15 == '-') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         if (var6.length() > var5) {
            var3[var12++] = var6.substring(var5);
         }

         return var12;
      }
   }

   @ObfuscatedName("av")
   public int method9445(String var1, int var2) {
      int var3 = this.method9416(var1, new int[]{var2}, field5261);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.method9415(field5261[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   @ObfuscatedName("ah")
   public int method9418(String var1, int var2) {
      return this.method9416(var1, new int[]{var2}, field5261);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IILjava/lang/String;II)Lrw;"
   )
   public class449 method9419(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var2 + var1) {
         int var6 = var4 - this.method9415(var3) / 2;
         var6 += this.method9415(var3.substring(0, var1));
         int var7 = var5 - this.field5257;
         int var8 = this.method9415(var3.substring(var1, var2 + var1));
         int var9 = this.field5257 + this.field5260;
         return new class449(var6, var7, var8, var9);
      } else {
         return new class449(var4, var5, 0, 0);
      }
   }

   @ObfuscatedName("ax")
   public void method9420(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method9435(var4, var5);
         this.method9438(var1, var2, var3);
      }
   }

   @ObfuscatedName("ak")
   public void method9421(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method9435(var4, var5);
         field5253 = var6;
         this.method9438(var1, var2, var3);
      }
   }

   @ObfuscatedName("aj")
   public void method9477(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method9435(var4, var5);
         this.method9438(var1, var2 - this.method9415(var1), var3);
      }
   }

   @ObfuscatedName("az")
   public void method9506(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.method9435(var4, var5);
         this.method9438(var1, var2 - this.method9415(var1) / 2, var3);
      }
   }

   @ObfuscatedName("bt")
   public int method9424(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.method9425(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   @ObfuscatedName("bs")
   public int method9425(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 255) {
            var8 = 256;
         }

         this.method9435(var6, var7);
         field5253 = var8;
         if (var11 == 0) {
            var11 = this.field5251;
         }

         int[] var12 = new int[]{var4};
         if (var5 < var11 + this.field5257 + this.field5260 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.method9416(var1, var12, field5261);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         int var15;
         if (var10 == 0) {
            var14 = var3 + this.field5257;
         } else if (var10 == 1) {
            var14 = var3 + this.field5257 + (var5 - this.field5257 - this.field5260 - var11 * (var13 - 1)) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - this.field5260 - var11 * (var13 - 1);
         } else {
            var15 = (var5 - this.field5257 - this.field5260 - var11 * (var13 - 1)) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + var15 + this.field5257;
            var11 += var15;
         }

         for(var15 = 0; var15 < var13; ++var15) {
            if (var9 == 0) {
               this.method9438(field5261[var15], var2, var14);
            } else if (var9 == 1) {
               this.method9438(field5261[var15], var2 + (var4 - this.method9415(field5261[var15])) / 2, var14);
            } else if (var9 == 2) {
               this.method9438(field5261[var15], var2 + var4 - this.method9415(field5261[var15]), var14);
            } else if (var15 == var13 - 1) {
               this.method9438(field5261[var15], var2, var14);
            } else {
               this.method9441(field5261[var15], var4);
               this.method9438(field5261[var15], var2, var14);
               field5254 = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(Lrh;IIIII)Lvt;"
   )
   public class557 method9426(class466 var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var1.method9533()) {
         this.method9435(var4, var5);
         var3 -= this.field5251;

         for(int var7 = 0; var7 < var1.method9532(); ++var7) {
            class464 var8 = var1.method9525(var7);
            if (var6 != -1 && var8.field5244 > var6) {
               return new class557(var8.field5241, var8.field5244);
            }

            char var9 = var8.field5242;
            if (var9 != '\n') {
               if (var1.method9517(var7)) {
                  var9 = '*';
               }

               if (var9 != '\t') {
                  if (var9 == 160) {
                     var9 = ' ';
                  }

                  int var10 = var2 + var8.field5241;
                  int var11 = var3 + var8.field5244;
                  int var12 = this.field5259[var9];
                  int var13 = this.field5264[var9];
                  if (field5250 != -1) {
                     this.vmethod9440(this.field5249[var9], var10 + this.field5265[var9] + 1, var11 + this.field5266[var9] + 1, var12, var13, field5250);
                  }

                  this.vmethod9440(this.field5249[var9], var10 + this.field5265[var9], var11 + this.field5266[var9], var12, var13, field5252);
               }
            }
         }
      }

      return var1.method9524();
   }

   @ObfuscatedName("bi")
   public void method9427(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.method9435(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method9432(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];

         for(int var10 = 0; var10 < var1.length(); ++var10) {
            var9[var10] = (int)(Math.sin((double)var10 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method9439(var1, var2 - this.method9415(var1) / 2, var3, var8, (int[])null, var9);
      }
   }

   @ObfuscatedName("bd")
   public void method9428(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.method9435(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.method9432(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var10[var11] = (int)(Math.sin((double)var11 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method9439(var1, var2 - this.method9415(var1) / 2, var3, var8, var9, var10);
      }
   }

   @ObfuscatedName("ba")
   public void method9463(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
      if (var1 != null) {
         this.method9435(var4, var5);
         int[] var9 = null;
         if (var8 != null) {
            var9 = this.method9432(var8, var1.length());
         }

         double var10 = 7.0D - (double)var7 / 8.0D;
         if (var10 < 0.0D) {
            var10 = 0.0D;
         }

         int[] var12 = new int[var1.length()];

         for(int var13 = 0; var13 < var1.length(); ++var13) {
            var12[var13] = (int)(Math.sin((double)var13 / 1.5D + (double)var6 / 1.0D) * var10);
         }

         this.method9439(var1, var2 - this.method9415(var1) / 2, var3, var9, (int[])null, var12);
      }
   }

   @ObfuscatedName("bb")
   public void method9430(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.method9435(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.method9432(var6, var1.length());
         }

         this.method9439(var1, var2 - this.method9415(var1) / 2, var3, var7, (int[])null, (int[])null);
      }
   }

   @ObfuscatedName("bo")
   public void method9431(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.method9435(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.method9432(var6, var1.length());
         }

         this.method9439(var1, var2, var3, var7, (int[])null, (int[])null);
      }
   }

   @ObfuscatedName("bl")
   int[] method9432(int[] var1, int var2) {
      if (var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];
         float var4 = (float)var1.length / (float)var2;

         for(int var5 = 0; var5 < var2; ++var5) {
            var3[var5] = var1[(int)((float)var5 * var4)];
         }

         return var3;
      }
   }

   @ObfuscatedName("by")
   public void method9468(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.method9435(var4, var5);
         field5256.setSeed((long)var6);
         field5253 = 192 + (field5256.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if ((field5256.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.method9439(var1, var2, var3, (int[])null, var7, (int[])null);
      }
   }

   @ObfuscatedName("bg")
   public void method9434(int var1, int var2, int var3, int var4) {
      var3 -= this.field5251;
      int var5 = var1 & 255;
      if (var5 != 32) {
         this.vmethod9440(this.field5249[var5], var2 + this.field5265[var5], var3 + this.field5266[var5], this.field5259[var5], this.field5264[var5], var4);
      }

   }

   @ObfuscatedName("bx")
   void method9435(int var1, int var2) {
      field5258 = -1;
      field5248 = -1;
      field5263 = var2;
      field5250 = var2;
      field5262 = var1;
      field5252 = var1;
      field5253 = 256;
      field5254 = 0;
      field5255 = 0;
   }

   @ObfuscatedName("bq")
   void method9436(String var1) {
      try {
         if (var1.startsWith("col=")) {
            field5252 = class30.method469(var1.substring(4), 16);
         } else if (var1.equals("/col")) {
            field5252 = field5262;
         } else if (var1.startsWith("str=")) {
            field5258 = class30.method469(var1.substring(4), 16);
         } else if (var1.equals("str")) {
            field5258 = 8388608;
         } else if (var1.equals("/str")) {
            field5258 = -1;
         } else if (var1.startsWith("u=")) {
            field5248 = class30.method469(var1.substring(2), 16);
         } else if (var1.equals("u")) {
            field5248 = 0;
         } else if (var1.equals("/u")) {
            field5248 = -1;
         } else if (var1.startsWith("shad=")) {
            field5250 = class30.method469(var1.substring(5), 16);
         } else if (var1.equals("shad")) {
            field5250 = 0;
         } else if (var1.equals("/shad")) {
            field5250 = field5263;
         } else if (var1.equals("br")) {
            this.method9435(field5262, field5263);
         }
      } catch (Exception var3) {
      }

   }

   @ObfuscatedName("bz")
   void method9441(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            ++var3;
         }
      }

      if (var3 > 0) {
         field5254 = (var2 - this.method9415(var1) << 8) / var3;
      }

   }

   @ObfuscatedName("bn")
   void method9438(String var1, int var2, int var3) {
      var3 -= this.field5251;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(class121.method3526(var1.charAt(var6)) & 255);
            if (var7 == '<') {
               var4 = var6;
            } else {
               int var9;
               if (var7 == '>' && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var8.equals("lt")) {
                     var7 = '<';
                  } else {
                     if (!var8.equals("gt")) {
                        if (var8.startsWith("img=")) {
                           try {
                              var9 = class190.method4308(var8.substring(4));
                              class604 var10 = field5246[var9];
                              var10.method11667(var2, var3 + this.field5251 - var10.field6008);
                              var2 += var10.field6005;
                              var5 = -1;
                           } catch (Exception var14) {
                           }
                        } else {
                           this.method9436(var8);
                        }
                        continue;
                     }

                     var7 = '>';
                  }
               }

               if (var7 == 160) {
                  var7 = ' ';
               }

               if (var4 == -1) {
                  if (this.field5267 != null && var5 != -1) {
                     var2 += this.field5267[var7 + (var5 << 8)];
                  }

                  int var12 = this.field5259[var7];
                  var9 = this.field5264[var7];
                  if (var7 != ' ') {
                     if (field5253 == 256) {
                        if (field5250 != -1) {
                           method9405(this.field5249[var7], var2 + this.field5265[var7] + 1, var3 + this.field5266[var7] + 1, var12, var9, field5250);
                        }

                        this.vmethod9440(this.field5249[var7], var2 + this.field5265[var7], var3 + this.field5266[var7], var12, var9, field5252);
                     } else {
                        if (field5250 != -1) {
                           method9411(this.field5249[var7], var2 + this.field5265[var7] + 1, var3 + this.field5266[var7] + 1, var12, var9, field5250, field5253);
                        }

                        this.vmethod9486(this.field5249[var7], var2 + this.field5265[var7], var3 + this.field5266[var7], var12, var9, field5252, field5253);
                     }
                  } else if (field5254 > 0) {
                     field5255 += field5254;
                     var2 += field5255 >> 8;
                     field5255 &= 255;
                  }

                  int var13 = this.field5245[var7];
                  if (field5258 != -1) {
                     class601.method11561(var2, var3 + (int)((double)this.field5251 * 0.7D), var13, field5258);
                  }

                  if (field5248 != -1) {
                     class601.method11561(var2, var3 + this.field5251 + 1, var13, field5248);
                  }

                  var2 += var13;
                  var5 = var7;
               }
            }
         }
      }

   }

   @ObfuscatedName("be")
   void method9439(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
      var3 -= this.field5251;
      int var7 = -1;
      int var8 = -1;
      int var9 = 0;

      for(int var10 = 0; var10 < var1.length(); ++var10) {
         if (var1.charAt(var10) != 0) {
            char var11 = (char)(class121.method3526(var1.charAt(var10)) & 255);
            if (var11 == '<') {
               var7 = var10;
            } else {
               int var13;
               int var14;
               int var15;
               if (var11 == '>' && var7 != -1) {
                  String var12 = var1.substring(var7 + 1, var10);
                  var7 = -1;
                  if (var12.equals("lt")) {
                     var11 = '<';
                  } else {
                     if (!var12.equals("gt")) {
                        if (var12.startsWith("img=")) {
                           try {
                              if (var5 != null) {
                                 var13 = var5[var9];
                              } else {
                                 var13 = 0;
                              }

                              if (var6 != null) {
                                 var14 = var6[var9];
                              } else {
                                 var14 = 0;
                              }

                              ++var9;
                              var15 = class190.method4308(var12.substring(4));
                              class604 var16 = field5246[var15];
                              var16.method11667(var13 + var2, var14 + (var3 + this.field5251 - var16.field6008));
                              var2 += var16.field6005;
                              var8 = -1;
                           } catch (Exception var21) {
                           }
                        } else {
                           this.method9436(var12);
                        }
                        continue;
                     }

                     var11 = '>';
                  }
               }

               if (var11 == 160) {
                  var11 = ' ';
               }

               if (var7 == -1) {
                  if (this.field5267 != null && var8 != -1) {
                     var2 += this.field5267[var11 + (var8 << 8)];
                  }

                  int var19 = this.field5259[var11];
                  var13 = this.field5264[var11];
                  if (var5 != null) {
                     var14 = var5[var9];
                  } else {
                     var14 = 0;
                  }

                  if (var6 != null) {
                     var15 = var6[var9];
                  } else {
                     var15 = 0;
                  }

                  int var20;
                  if (var4 != null) {
                     var20 = var4[var9];
                  } else {
                     var20 = field5252;
                  }

                  ++var9;
                  if (var11 != ' ') {
                     if (field5253 == 256) {
                        if (field5250 != -1) {
                           method9405(this.field5249[var11], var14 + var2 + this.field5265[var11] + 1, var3 + var15 + this.field5266[var11] + 1, var19, var13, field5250);
                        }

                        this.vmethod9440(this.field5249[var11], var14 + var2 + this.field5265[var11], var3 + var15 + this.field5266[var11], var19, var13, var20);
                     } else {
                        if (field5250 != -1) {
                           method9411(this.field5249[var11], var14 + var2 + this.field5265[var11] + 1, var3 + var15 + this.field5266[var11] + 1, var19, var13, field5250, field5253);
                        }

                        this.vmethod9486(this.field5249[var11], var14 + var2 + this.field5265[var11], var3 + var15 + this.field5266[var11], var19, var13, var20, field5253);
                     }
                  } else if (field5254 > 0) {
                     field5255 += field5254;
                     var2 += field5255 >> 8;
                     field5255 &= 255;
                  }

                  int var17 = this.field5245[var11];
                  if (field5258 != -1) {
                     class601.method11561(var2, var3 + (int)((double)this.field5251 * 0.7D), var17, field5258);
                  }

                  if (field5248 != -1) {
                     class601.method11561(var2, var3 + this.field5251, var17, field5248);
                  }

                  var2 += var17;
                  var8 = var11;
               }
            }
         }
      }

   }

   @ObfuscatedName("au")
   static int method9407(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   @ObfuscatedName("ai")
   public static String method9500(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 == '<' || var4 == '>') {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(int var7 = 0; var7 < var1; ++var7) {
         char var5 = var0.charAt(var7);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == '>') {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   @ObfuscatedName("aa")
   static void method9405(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * class601.field5989;
      int var7 = class601.field5989 - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if (var2 < class601.field5992) {
         var10 = class601.field5992 - var2;
         var4 -= var10;
         var2 = class601.field5992;
         var9 += var3 * var10;
         var6 += var10 * class601.field5989;
      }

      if (var2 + var4 > class601.field5993) {
         var4 -= var2 + var4 - class601.field5993;
      }

      if (var1 < class601.field5994) {
         var10 = class601.field5994 - var1;
         var3 -= var10;
         var1 = class601.field5994;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 + var1 > class601.field5995) {
         var10 = var3 + var1 - class601.field5995;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 > 0 && var4 > 0) {
         method9410(class601.field5988, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   @ObfuscatedName("am")
   static void method9410(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfuscatedName("an")
   static void method9411(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * class601.field5989;
      int var8 = class601.field5989 - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < class601.field5992) {
         var11 = class601.field5992 - var2;
         var4 -= var11;
         var2 = class601.field5992;
         var10 += var3 * var11;
         var7 += var11 * class601.field5989;
      }

      if (var2 + var4 > class601.field5993) {
         var4 -= var2 + var4 - class601.field5993;
      }

      if (var1 < class601.field5994) {
         var11 = class601.field5994 - var1;
         var3 -= var11;
         var1 = class601.field5994;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 + var1 > class601.field5995) {
         var11 = var3 + var1 - class601.field5995;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         method9459(class601.field5988, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   @ObfuscatedName("ar")
   static void method9459(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & '\uff00') * var9 & 16711680) + (var9 * (var2 & 16711935) & -16711936) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & '\uff00') * var9 & 16711680) + ((var12 & 16711935) * var9 & -16711936) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }
}
