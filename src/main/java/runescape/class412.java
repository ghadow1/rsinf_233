package runescape;

import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
public abstract class class412 {
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 1707816521
   )
   static int field4961 = 0;
   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "Lxs;"
   )
   static class612 field4968 = new class612();
   @ObfuscatedName("oa")
   @ObfuscatedSignature(
      descriptor = "Lku;"
   )
   static class266 field4979;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -610906425
   )
   public int field4959;
   @ObfuscatedName("bd")
   boolean field4975;
   @ObfuscatedName("ba")
   boolean field4973;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = -2105439429
   )
   int field4966;
   @ObfuscatedName("bo")
   int[] field4967;
   @ObfuscatedName("bl")
   int[] field4974;
   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "Lsm;"
   )
   class487 field4969;
   @ObfuscatedName("bg")
   int[] field4970;
   @ObfuscatedName("bx")
   int[] field4971;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 902128281
   )
   int field4972;
   @ObfuscatedName("bz")
   int[] field4963;
   @ObfuscatedName("bn")
   int[] field4981;
   @ObfuscatedName("be")
   int[] field4962;
   @ObfuscatedName("bh")
   int[][] field4976;
   @ObfuscatedName("bk")
   int[][] field4964;
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "[Lsm;"
   )
   class487[] field4978;
   @ObfuscatedName("br")
   Object[] field4977;
   @ObfuscatedName("bv")
   Object[][] field4980;

   class412(boolean var1, boolean var2) {
      this.field4975 = var1;
      this.field4973 = var2;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "979975584"
   )
   void vmethod8334(int var1) {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "948719152"
   )
   void vmethod8345(int var1) {
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "603200064"
   )
   int vmethod8356(int var1) {
      return this.field4977[var1] != null ? 100 : 0;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "-1992841576"
   )
   void method8333(byte[] var1) {
      this.field4959 = Players.method9805(var1, var1.length);
      Buffer var2 = new Buffer(class551.method10616(var1));
      int var3 = var2.method11196();
      if (var3 >= 5 && var3 <= 7) {
         if (var3 >= 6) {
            var2.read32BitArray();
         }

         int var4 = var2.method11196();
         boolean var5 = (var4 & 1) != 0;
         boolean var6 = (var4 & 2) != 0;
         boolean var7 = (var4 & 4) != 0;
         boolean var8 = (var4 & 8) != 0;
         if (var6) {
            throw new UnsupportedOperationException("");
         } else if (var8) {
            throw new UnsupportedOperationException("");
         } else {
            if (var3 >= 7) {
               this.field4966 = var2.method11215();
            } else {
               this.field4966 = var2.readUnsignedShort();
            }

            int var9 = 0;
            int var10 = -1;
            this.field4967 = new int[this.field4966];
            int var11;
            if (var3 >= 7) {
               for(var11 = 0; var11 < this.field4966; ++var11) {
                  this.field4967[var11] = var9 += var2.method11215();
                  if (this.field4967[var11] > var10) {
                     var10 = this.field4967[var11];
                  }
               }
            } else {
               for(var11 = 0; var11 < this.field4966; ++var11) {
                  this.field4967[var11] = var9 += var2.readUnsignedShort();
                  if (this.field4967[var11] > var10) {
                     var10 = this.field4967[var11];
                  }
               }
            }

            this.field4972 = var10 + 1;
            this.field4963 = new int[this.field4972];
            this.field4981 = new int[this.field4972];
            this.field4962 = new int[this.field4972];
            this.field4976 = new int[this.field4972][];
            this.field4977 = new Object[this.field4972];
            this.field4980 = new Object[this.field4972][];
            if (var5) {
               this.field4974 = new int[this.field4972];
               Arrays.fill(this.field4974, -1);

               for(var11 = 0; var11 < this.field4966; ++var11) {
                  this.field4974[this.field4967[var11]] = var2.read32BitArray();
               }

               this.field4969 = new class487(this.field4974);
            }

            for(var11 = 0; var11 < this.field4966; ++var11) {
               this.field4963[this.field4967[var11]] = var2.read32BitArray();
            }

            if (var7) {
               this.field4970 = new int[this.field4972];
               this.field4971 = new int[this.field4972];

               for(var11 = 0; var11 < this.field4966; ++var11) {
                  this.field4970[this.field4967[var11]] = var2.read32BitArray();
                  this.field4971[this.field4967[var11]] = var2.read32BitArray();
               }
            }

            for(var11 = 0; var11 < this.field4966; ++var11) {
               this.field4981[this.field4967[var11]] = var2.read32BitArray();
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            if (var3 >= 7) {
               for(var11 = 0; var11 < this.field4966; ++var11) {
                  this.field4962[this.field4967[var11]] = var2.method11215();
               }

               for(var11 = 0; var11 < this.field4966; ++var11) {
                  var12 = this.field4967[var11];
                  var13 = this.field4962[var12];
                  var9 = 0;
                  var14 = -1;
                  this.field4976[var12] = new int[var13];

                  for(var15 = 0; var15 < var13; ++var15) {
                     var16 = this.field4976[var12][var15] = var9 += var2.method11215();
                     if (var16 > var14) {
                        var14 = var16;
                     }
                  }

                  this.field4980[var12] = new Object[var14 + 1];
               }
            } else {
               for(var11 = 0; var11 < this.field4966; ++var11) {
                  this.field4962[this.field4967[var11]] = var2.readUnsignedShort();
               }

               for(var11 = 0; var11 < this.field4966; ++var11) {
                  var12 = this.field4967[var11];
                  var13 = this.field4962[var12];
                  var9 = 0;
                  var14 = -1;
                  this.field4976[var12] = new int[var13];

                  for(var15 = 0; var15 < var13; ++var15) {
                     var16 = this.field4976[var12][var15] = var9 += var2.readUnsignedShort();
                     if (var16 > var14) {
                        var14 = var16;
                     }
                  }

                  this.field4980[var12] = new Object[var14 + 1];
               }
            }

            if (var5) {
               this.field4964 = new int[var10 + 1][];
               this.field4978 = new class487[var10 + 1];

               for(var11 = 0; var11 < this.field4966; ++var11) {
                  var12 = this.field4967[var11];
                  var13 = this.field4962[var12];
                  this.field4964[var12] = new int[this.field4980[var12].length];
                  Arrays.fill(this.field4964[var12], -1);

                  for(var14 = 0; var14 < var13; ++var14) {
                     var15 = this.field4976[var12] != null ? this.field4976[var12][var14] : var14;
                     this.field4964[var12][var15] = var2.read32BitArray();
                  }

                  this.field4978[var12] = new class487(this.field4964[var12]);
               }
            }

         }
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(IIB)[B",
      garbageValue = "0"
   )
   public byte[] method8335(int var1, int var2) {
      return this.method8336(var1, var2, (int[])null);
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(II[IB)[B",
      garbageValue = "65"
   )
   public byte[] method8336(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.field4980.length && this.field4980[var1] != null && var2 >= 0 && var2 < this.field4980[var1].length) {
         if (this.field4980[var1][var2] == null) {
            boolean var4 = this.method8352(var1, var3);
            if (!var4) {
               this.vmethod8345(var1);
               var4 = this.method8352(var1, var3);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class200.method4403(this.field4980[var1][var2], false);
         if (this.field4973) {
            this.field4980[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "2046771972"
   )
   public boolean method8337(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field4980.length && this.field4980[var1] != null && var2 >= 0 && var2 < this.field4980[var1].length) {
         if (this.field4980[var1][var2] != null) {
            return true;
         } else if (this.field4977[var1] != null) {
            return true;
         } else {
            this.vmethod8345(var1);
            return this.field4977[var1] != null;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "870373580"
   )
   public boolean method8381(int var1) {
      if (var1 > 5607){
         var1 = 5606;
      }
      if (this.field4980.length == 1) {
         return this.method8337(0, var1);
      } else if (this.field4980[var1].length == 1) {
         return this.method8337(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "83"
   )
   public boolean method8411(int var1) {
      if (this.field4977[var1] != null) {
         return true;
      } else {
         this.vmethod8345(var1);
         return this.field4977[var1] != null;
      }
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1957183820"
   )
   public boolean method8340() {
      boolean var1 = true;

      for(int var2 = 0; var2 < this.field4967.length; ++var2) {
         int var3 = this.field4967[var2];
         if (this.field4977[var3] == null) {
            this.vmethod8345(var3);
            if (this.field4977[var3] == null) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(II)[B",
      garbageValue = "1557908280"
   )
   public byte[] method8425(int var1) {
      if (this.field4980.length == 1) {
         return this.method8335(0, var1);
      } else if (this.field4980[var1].length == 1) {
         return this.method8335(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(III)[B",
      garbageValue = "1800570773"
   )
   public byte[] method8343(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field4980.length && this.field4980[var1] != null && var2 >= 0 && var2 < this.field4980[var1].length) {
         if (this.field4980[var1][var2] == null) {
            boolean var3 = this.method8352(var1, (int[])null);
            if (!var3) {
               this.vmethod8345(var1);
               var3 = this.method8352(var1, (int[])null);
               if (!var3) {
                  return null;
               }
            }
         }

         byte[] var4 = class200.method4403(this.field4980[var1][var2], false);
         return var4;
      } else {
         return null;
      }
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(II)[B",
      garbageValue = "-1775609491"
   )
   public byte[] method8403(int var1) {
      if (this.field4980.length == 1) {
         return this.method8343(0, var1);
      } else if (this.field4980[var1].length == 1) {
         return this.method8343(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "(II)[I",
      garbageValue = "1830862682"
   )
   public int[] method8353(int var1) {
      return var1 >= 0 && var1 < this.field4976.length ? this.field4976[var1] : null;
   }

   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1774572236"
   )
   public int method8347(int var1) {
      return this.field4980 != null && var1 < this.field4980.length && this.field4980[var1] != null ? this.field4980[var1].length : 0;
   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1820206791"
   )
   public int method8344() {
      return this.field4972;
   }

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "676566421"
   )
   public void method8349() {
      for(int var1 = 0; var1 < this.field4977.length; ++var1) {
         this.field4977[var1] = null;
      }

   }

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-34"
   )
   public void method8350(int var1) {
      for(int var2 = 0; var2 < this.field4980[var1].length; ++var2) {
         this.field4980[var1][var2] = null;
      }

   }

   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1223532830"
   )
   public void method8429() {
      for(int var1 = 0; var1 < this.field4980.length; ++var1) {
         if (this.field4980[var1] != null) {
            for(int var2 = 0; var2 < this.field4980[var1].length; ++var2) {
               this.field4980[var1][var2] = null;
            }
         }
      }

   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "(I[IB)Z",
      garbageValue = "-58"
   )
   boolean method8352(int var1, int[] var2) {
      if (this.field4977[var1] == null) {
         return false;
      } else {
         int var3 = this.field4962[var1];
         int[] var4 = this.field4976[var1];
         Object[] var5 = this.field4980[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if (var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var18;
            if (var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) {
               var18 = class200.method4403(this.field4977[var1], true);
               Buffer var8 = new Buffer(var18);
               var8.method11223(var2, 5, var8.array.length);
            } else {
               var18 = class200.method4403(this.field4977[var1], false);
            }

            byte[] var20 = class551.method10616(var18);
            if (this.field4975) {
               this.field4977[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= var10 * var3 * 4;
               Buffer var11 = new Buffer(var20);
               int[] var12 = new int[var3];
               var11.offset = var9 * -290410379;

               int var14;
               int var15;
               for(int var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var14 += var11.read32BitArray();
                     var12[var15] += var14;
                  }
               }

               byte[][] var19 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var19[var14] = new byte[var12[var14]];
                  var12[var14] = 0;
               }

               var11.offset = var9 * -290410379;
               var14 = 0;

               for(var15 = 0; var15 < var10; ++var15) {
                  int var16 = 0;

                  for(int var17 = 0; var17 < var3; ++var17) {
                     var16 += var11.read32BitArray();
                     System.arraycopy(var20, var14, var19[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if (!this.field4973) {
                     var5[var4[var15]] = class382.method8182(var19[var15], false);
                  } else {
                     var5[var4[var15]] = var19[var15];
                  }
               }
            } else if (!this.field4973) {
               var5[var4[0]] = class382.method8182(var20, false);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "-1022700798"
   )
   public int method8361(String var1) {
      var1 = var1.toLowerCase();
      return this.field4969.method9800(class141.method3728(var1));
   }

   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;S)I",
      garbageValue = "-756"
   )
   public int method8354(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.field4978[var1].method9800(class141.method3728(var2));
   }

   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
      garbageValue = "-7"
   )
   public boolean method8355(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field4969.method9800(class141.method3728(var1));
      if (var3 < 0) {
         return false;
      } else {
         int var4 = this.field4978[var3].method9800(class141.method3728(var2));
         return var4 >= 0;
      }
   }

   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
      garbageValue = "2027512969"
   )
   public byte[] method8371(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field4969.method9800(class141.method3728(var1));
      int var4 = this.field4978[var3].method9800(class141.method3728(var2));
      return this.method8335(var3, var4);
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z",
      garbageValue = "-92"
   )
   public boolean method8357(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.field4969.method9800(class141.method3728(var1));
      int var4 = this.field4978[var3].method9800(class141.method3728(var2));
      return this.method8337(var3, var4);
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)Z",
      garbageValue = "1"
   )
   public boolean method8358(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field4969.method9800(class141.method3728(var1));
      return this.method8411(var2);
   }

   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1690689417"
   )
   public void method8390(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field4969.method9800(class141.method3728(var1));
      if (var2 >= 0) {
         this.vmethod8334(var2);
      }
   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)I",
      garbageValue = "126"
   )
   public int method8360(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.field4969.method9800(class141.method3728(var1));
      return this.vmethod8356(var2);
   }
}
