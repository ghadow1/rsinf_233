package runescape;

import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
public class class409 extends class412 {
   @ObfuscatedName("af")
   static int[] field4911;
   @ObfuscatedName("as")
   static CRC32 field4914 = new CRC32();
   @ObfuscatedName("al")
   boolean field4915 = false;
   @ObfuscatedName("au")
   boolean field4916 = false;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lto;"
   )
   class515 field4917;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lto;"
   )
   class515 field4918;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -726769123
   )
   int field4919;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1447802299
   )
   volatile int field4920 = 0;
   @ObfuscatedName("ar")
   boolean field4921 = false;
   @ObfuscatedName("ae")
   volatile boolean[] field4922;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -41025361
   )
   int field4923;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1181815205
   )
   int field4924;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 2035495681
   )
   int field4910 = -1;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lpk;"
   )
   class413 field4926;

   @ObfuscatedSignature(
      descriptor = "(Lto;Lto;Lpk;IZZZZZ)V"
   )
   public class409(class515 var1, class515 var2, class413 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      super(var5, var6);
      this.field4917 = var1;
      this.field4918 = var2;
      this.field4919 = var4;
      this.field4921 = var7;
      this.field4916 = var8;
      this.field4915 = var9;
      this.field4926 = var3;
      this.field4926.method8438(this, this.field4919);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1750148097"
   )
   public boolean method8287() {
      return this.field4920 == 1;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1333805331"
   )
   public int method8288() {
      if (this.field4920 == 1 || this.field4916 && this.field4920 == 2) {
         return 100;
      } else if (super.field4977 != null) {
         return 99;
      } else {
         int var1 = this.field4926.method8442(class410.field4947.field4954, this.field4919);
         if (var1 >= 100) {
            var1 = 99;
         }

         return var1;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "979975584"
   )
   void vmethod8334(int var1) {
      this.field4926.method8440(this.field4919, var1);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "948719152"
   )
   void vmethod8345(int var1) {
      if (this.field4917 != null && this.field4922 != null && this.field4922[var1]) {
         class175.method4119(var1, this.field4917, this);
      } else {
         this.field4926.method8437(this, this.field4919, var1, super.field4963[var1], (byte)4, true);
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "14"
   )
   void method8290() {
      this.field4920 = 2;
      super.field4967 = new int[0];
      super.field4963 = new int[0];
      super.field4981 = new int[0];
      super.field4962 = new int[0];
      super.field4976 = new int[0][];
      super.field4977 = new Object[0];
      super.field4980 = new Object[0][];
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-41"
   )
   void method8294(int var1, int var2) {
      this.field4923 = var1;
      this.field4924 = var2;
      if (this.field4918 != null) {
         class175.method4119(this.field4919, this.field4918, this);
      } else {
         this.field4926.method8437(this, class410.field4947.field4954, this.field4919, this.field4923, (byte)0, true);
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I[BZZB)V",
      garbageValue = "71"
   )
   void method8293(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.field4920 == 1) {
            throw new RuntimeException();
         }

         if (this.field4918 != null) {
            int var5 = this.field4919;
            class515 var6 = this.field4918;
            class407 var7 = new class407();
            var7.field4898 = 0;
            var7.field5600 = (long)var5;
            var7.field4896 = var2;
            var7.field4897 = var6;
            synchronized(class408.field4904) {
               class408.field4904.method8689(var7);
            }

            synchronized(class408.field4903) {
               if (class408.field4901 == 0) {
                  class408.field4906 = new Thread(new class408());
                  class408.field4906.setDaemon(true);
                  class408.field4906.start();
                  class408.field4906.setPriority(5);
               }

               class408.field4901 = 600;
            }
         }

         this.method8333(var2);
         this.method8309();
      } else {
         var2[var2.length - 4] = (byte)(super.field4981[var1] >> 24);
         var2[var2.length - 3] = (byte)(super.field4981[var1] >> 16);
         var2[var2.length - 2] = (byte)(super.field4981[var1] >> 8);
         var2[var2.length - 1] = (byte)super.field4981[var1];
         if (this.field4917 != null) {
            class515 var13 = this.field4917;
            class407 var18 = new class407();
            var18.field4898 = 0;
            var18.field5600 = (long)var1;
            var18.field4896 = var2;
            var18.field4897 = var13;
            synchronized(class408.field4904) {
               class408.field4904.method8689(var18);
            }

            synchronized(class408.field4903) {
               if (class408.field4901 == 0) {
                  class408.field4906 = new Thread(new class408());
                  class408.field4906.setDaemon(true);
                  class408.field4906.start();
                  class408.field4906.setPriority(5);
               }

               class408.field4901 = 600;
            }

            this.field4922[var1] = true;
         }

         if (var4) {
            super.field4977[var1] = class382.method8182(var2, false);
         }
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Lto;I[BZI)V",
      garbageValue = "-1570337334"
   )
   public void method8286(class515 var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if (var1 == this.field4918) {
         if (this.field4920 == 1) {
            throw new RuntimeException();
         } else if (var3 == null) {
            this.field4926.method8437(this, class410.field4947.field4954, this.field4919, this.field4923, (byte)0, true);
         } else {
            field4914.reset();
            field4914.update(var3, 0, var3.length);
            var5 = (int)field4914.getValue();
            if (var5 != this.field4923) {
               this.field4926.method8437(this, class410.field4947.field4954, this.field4919, this.field4923, (byte)0, true);
            } else {
               Buffer var9 = new Buffer(class551.method10616(var3));
               int var7 = var9.method11196();
               if (var7 < 5 || var7 > 7) {
                  throw new RuntimeException(var7 + "," + this.field4919 + "," + var2);
               } else {
                  int var8 = 0;
                  if (var7 >= 6) {
                     var8 = var9.read32BitArray();
                  }

                  if (var8 != this.field4924) {
                     this.field4926.method8437(this, class410.field4947.field4954, this.field4919, this.field4923, (byte)0, true);
                  } else {
                     this.method8333(var3);
                     this.method8309();
                  }
               }
            }
         }
      } else {
         if (!var4 && var2 == this.field4910) {
            this.field4920 = 1;
         }

         if (var3 != null && var3.length > 2) {
            field4914.reset();
            field4914.update(var3, 0, var3.length - 4);
            var5 = (int)field4914.getValue();
            int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255) + ((var3[var3.length - 4] & 255) << 24) + ((var3[var3.length - 3] & 255) << 16);
            if (var5 != super.field4963[var2] || var6 != super.field4981[var2]) {
               field4914.reset();
               field4914.update(var3, 0, var3.length - 2);
               var5 = (int)field4914.getValue();
               var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
            }

            if (var5 == super.field4963[var2] && var6 == super.field4981[var2]) {
               this.field4922[var2] = true;
               if (var4) {
                  super.field4977[var2] = class382.method8182(var3, false);
               }

            } else {
               this.field4922[var2] = false;
               if (this.field4921 || var4) {
                  this.field4926.method8437(this, this.field4919, var2, super.field4963[var2], (byte)4, var4);
               }

            }
         } else {
            this.field4922[var2] = false;
            if (this.field4921 || var4) {
               this.field4926.method8437(this, this.field4919, var2, super.field4963[var2], (byte)4, var4);
            }

         }
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "90"
   )
   void method8309() {
      this.field4922 = new boolean[super.field4977.length];

      int var1;
      for(var1 = 0; var1 < this.field4922.length; ++var1) {
         this.field4922[var1] = false;
      }

      if (this.field4917 == null) {
         this.field4920 = 1;
      } else {
         this.field4910 = -1;

         for(var1 = 0; var1 < this.field4922.length; ++var1) {
            if (super.field4962[var1] > 0) {
               class515 var2 = this.field4917;
               class407 var4 = new class407();
               var4.field4898 = 1;
               var4.field5600 = (long)var1;
               var4.field4897 = var2;
               var4.field4899 = this;
               synchronized(class408.field4904) {
                  class408.field4904.method8689(var4);
               }

               synchronized(class408.field4903) {
                  if (class408.field4901 == 0) {
                     class408.field4906 = new Thread(new class408());
                     class408.field4906.setDaemon(true);
                     class408.field4906.start();
                     class408.field4906.setPriority(5);
                  }

                  class408.field4901 = 600;
               }

               this.field4910 = var1;
            }
         }

         if (this.field4910 == -1) {
            this.field4920 = 1;
         }

      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "603200064"
   )
   int vmethod8356(int var1) {
      if (super.field4977[var1] != null) {
         return 100;
      } else {
         return this.field4922[var1] ? 100 : this.field4926.method8442(this.field4919, var1);
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "14"
   )
   public boolean method8297(int var1) {
      return this.field4922[var1];
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "0"
   )
   public boolean method8298(int var1) {
      return this.method8353(var1) != null;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-868218566"
   )
   public int method8299() {
      int var1 = 0;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < super.field4977.length; ++var3) {
         if (super.field4962[var3] > 0) {
            var1 += 100;
            var2 += this.vmethod8356(var3);
         }
      }

      if (var1 == 0) {
         return 100;
      } else {
         var3 = var2 * 100 / var1;
         return var3;
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "2078596780"
   )
   static int method8327(int var0, class55 var1, boolean var2) {
      class369 var3;
      int var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class46.field659[--class124.field1569];
         var3 = class119.field1554.method7476(var4);
      } else {
         var3 = var2 ? class19.field81 : class141.field1714;
      }

      if (var0 == 1100) {
         class124.field1569 -= 2;
         var4 = class46.field659[class124.field1569];
         int var15 = class46.field659[class124.field1569 + 1];
         if (var3.field4147 == 12) {
            class366 var16 = var3.method7971();
            if (var16 != null && var16.method7859(var4, var15)) {
               class89.method2877(var3);
            }
         } else {
            var3.field4260 = var4;
            if (var3.field4260 > var3.field4193 - var3.field4160 * 469894397) {
               var3.field4260 = var3.field4193 - var3.field4160 * 469894397;
            }

            if (var3.field4260 < 0) {
               var3.field4260 = 0;
            }

            var3.field4170 = var15;
            if (var3.field4170 > var3.field4172 - var3.field4149 * 1156037777) {
               var3.field4170 = var3.field4172 - var3.field4149 * 1156037777;
            }

            if (var3.field4170 < 0) {
               var3.field4170 = 0;
            }

            class89.method2877(var3);
         }

         return 1;
      } else if (var0 == 1101) {
         var3.field4173 = class46.field659[--class124.field1569];
         class89.method2877(var3);
         return 1;
      } else if (var0 == 1102) {
         var3.field4177 = class46.field659[--class124.field1569] == 1;
         class89.method2877(var3);
         return 1;
      } else if (var0 == 1103) {
         var3.field4179 = class46.field659[--class124.field1569];
         class89.method2877(var3);
         return 1;
      } else if (var0 == 1104) {
         var3.field4181 = class46.field659[--class124.field1569];
         class89.method2877(var3);
         return 1;
      } else if (var0 == 1105) {
         var3.field4183 = class46.field659[--class124.field1569];
         class89.method2877(var3);
         return 1;
      } else if (var0 == 1106) {
         var3.field4201 = class46.field659[--class124.field1569];
         class89.method2877(var3);
         return 1;
      } else if (var0 == 1107) {
         var3.field4187 = class46.field659[--class124.field1569] == 1;
         class89.method2877(var3);
         return 1;
      } else if (var0 == 1108) {
         var3.field4192 = 1;
         var3.field4277 = class46.field659[--class124.field1569];
         class89.method2877(var3);
         return 1;
      } else if (var0 == 1109) {
         class124.field1569 -= 6;
         var3.field4226 = class46.field659[class124.field1569];
         var3.field4199 = class46.field659[class124.field1569 + 1];
         var3.field4200 = class46.field659[class124.field1569 + 2];
         var3.field4235 = class46.field659[class124.field1569 + 3];
         var3.field4202 = class46.field659[class124.field1569 + 4];
         var3.field4203 = class46.field659[class124.field1569 + 5];
         class89.method2877(var3);
         return 1;
      } else if (var0 == 1110) {
         var4 = class46.field659[--class124.field1569];
         if (var4 != var3.field4196) {
            var3.field4196 = var4;
            var3.field4284 = 0;
            var3.field4135 = 0;
            class89.method2877(var3);
         }

         return 1;
      } else if (var0 == 1111) {
         var3.field4207 = class46.field659[--class124.field1569] == 1;
         class89.method2877(var3);
         return 1;
      } else {
         String var17;
         class366 var18;
         if (var0 == 1112) {
            var17 = (String)class46.field660[--class46.field658];
            if (var3.field4147 == 12) {
               var18 = var3.method7971();
               if (var18 != null && var18.method7658()) {
                  var18.method7607(var17);
               } else {
                  var3.field4211 = var17;
               }

               class89.method2877(var3);
            } else if (!var17.equals(var3.field4211)) {
               var3.field4211 = var17;
               class89.method2877(var3);
            }

            return 1;
         } else {
            class366 var21;
            if (var0 == 1113) {
               var3.field4210 = class46.field659[--class124.field1569];
               if (var3.field4147 == 12) {
                  var21 = var3.method7971();
                  if (var21 != null) {
                     var21.method7618();
                  }
               }

               class89.method2877(var3);
               return 1;
            } else if (var0 == 1114) {
               class124.field1569 -= 3;
               if (var3.field4147 == 12) {
                  var21 = var3.method7971();
                  if (var21 != null) {
                     var21.method7865(class46.field659[class124.field1569], class46.field659[class124.field1569 + 1]);
                     var21.method7616(class46.field659[class124.field1569 + 2]);
                  }
               } else {
                  var3.field4167 = class46.field659[class124.field1569];
                  var3.field4215 = class46.field659[class124.field1569 + 1];
                  var3.field4213 = class46.field659[class124.field1569 + 2];
               }

               class89.method2877(var3);
               return 1;
            } else if (var0 == 1115) {
               var3.field4216 = class46.field659[--class124.field1569] == 1;
               class89.method2877(var3);
               return 1;
            } else if (var0 == 1116) {
               var3.field4188 = class46.field659[--class124.field1569];
               class89.method2877(var3);
               return 1;
            } else if (var0 == 1117) {
               var3.field4134 = class46.field659[--class124.field1569];
               class89.method2877(var3);
               return 1;
            } else if (var0 == 1118) {
               var3.field4190 = class46.field659[--class124.field1569] == 1;
               class89.method2877(var3);
               return 1;
            } else if (var0 == 1119) {
               var3.field4272 = class46.field659[--class124.field1569] == 1;
               class89.method2877(var3);
               return 1;
            } else if (var0 == 1120) {
               class124.field1569 -= 2;
               var3.field4193 = class46.field659[class124.field1569];
               var3.field4172 = class46.field659[class124.field1569 + 1];
               class89.method2877(var3);
               if (var3.field4147 == 0) {
                  class369[] var23 = var3.field4145 * -217986249 == -1 ? class119.field1554.field4037[var3.field4144 >> 16] : class119.field1554.method7476(var3.field4164).field4286;
                  class23.method337(var23, var3, false);
               }

               return 1;
            } else if (var0 == 1121) {
               class115.method3468(var3.field4144, var3.field4145 * -217986249);
               client.field564 = var3;
               class89.method2877(var3);
               return 1;
            } else if (var0 == 1122) {
               var3.field4184 = class46.field659[--class124.field1569];
               class89.method2877(var3);
               return 1;
            } else if (var0 == 1123) {
               var3.field4174 = class46.field659[--class124.field1569];
               class89.method2877(var3);
               return 1;
            } else if (var0 == 1124) {
               var3.field4180 = class46.field659[--class124.field1569];
               class89.method2877(var3);
               return 1;
            } else if (var0 == 1125) {
               var4 = class46.field659[--class124.field1569];
               class603 var19 = (class603)class173.findEnumerated(class420.method8510(), var4);
               if (var19 != null) {
                  var3.field4178 = var19;
                  class89.method2877(var3);
               }

               return 1;
            } else {
               boolean var14;
               if (var0 == 1126) {
                  var14 = class46.field659[--class124.field1569] == 1;
                  var3.field4182 = var14;
                  return 1;
               } else if (var0 == 1127) {
                  var14 = class46.field659[--class124.field1569] == 1;
                  var3.field4208 = var14;
                  return 1;
               } else if (var0 == 1129) {
                  var3.field4185 = (String)class46.field660[--class46.field658];
                  class89.method2877(var3);
                  return 1;
               } else if (var0 == 1130) {
                  var3.method8012((String)class46.field660[--class46.field658], "", class114.field1507, class284.method6363());
                  return 1;
               } else if (var0 == 1131) {
                  class124.field1569 -= 2;
                  var3.method7957(class46.field659[class124.field1569], class46.field659[class124.field1569 + 1]);
                  return 1;
               } else if (var0 == 1132) {
                  var3.method8056((String)class46.field660[--class46.field658], class46.field659[--class124.field1569]);
                  return 1;
               } else {
                  class360 var22;
                  if (var0 == 1133) {
                     --class124.field1569;
                     var22 = var3.method8088();
                     if (var22 != null) {
                        var22.field4052 = class46.field659[class124.field1569];
                        class89.method2877(var3);
                     }

                     return 1;
                  } else if (var0 == 1134) {
                     --class124.field1569;
                     var22 = var3.method8088();
                     if (var22 != null) {
                        var22.field4053 = class46.field659[class124.field1569];
                        class89.method2877(var3);
                     }

                     return 1;
                  } else if (var0 == 1135) {
                     --class46.field658;
                     var21 = var3.method7971();
                     if (var21 != null) {
                        var3.field4212 = (String)class46.field660[class46.field658];
                     }

                     return 1;
                  } else if (var0 == 1136) {
                     --class124.field1569;
                     var22 = var3.method8088();
                     if (var22 != null) {
                        var22.field4055 = class46.field659[class124.field1569];
                        class89.method2877(var3);
                     }

                     return 1;
                  } else if (var0 == 1137) {
                     --class124.field1569;
                     var21 = var3.method7971();
                     if (var21 != null && var21.method7832(class46.field659[class124.field1569])) {
                        class89.method2877(var3);
                     }

                     return 1;
                  } else if (var0 == 1138) {
                     --class124.field1569;
                     var21 = var3.method7971();
                     if (var21 != null && var21.method7612(class46.field659[class124.field1569])) {
                        class89.method2877(var3);
                     }

                     return 1;
                  } else if (var0 == 1139) {
                     --class124.field1569;
                     var21 = var3.method7971();
                     if (var21 != null && var21.method7613(class46.field659[class124.field1569])) {
                        class89.method2877(var3);
                     }

                     return 1;
                  } else if (var0 == 1140) {
                     var14 = class46.field659[--class124.field1569] == 1;
                     client.field598.method6085();
                     var18 = var3.method7971();
                     if (var18 != null && var18.method7605(var14)) {
                        if (var14) {
                           client.field598.method6104(var3);
                        }

                        class89.method2877(var3);
                     }

                     return 1;
                  } else if (var0 == 1141) {
                     var14 = class46.field659[--class124.field1569] == 1;
                     if (!var14 && client.field598.method6084() == var3) {
                        client.field598.method6085();
                        class89.method2877(var3);
                     }

                     var18 = var3.method7971();
                     if (var18 != null) {
                        var18.method7606(var14);
                     }

                     return 1;
                  } else if (var0 == 1142) {
                     class124.field1569 -= 2;
                     var21 = var3.method7971();
                     if (var21 != null && var21.method7604(class46.field659[class124.field1569], class46.field659[class124.field1569 + 1])) {
                        class89.method2877(var3);
                     }

                     return 1;
                  } else if (var0 == 1143) {
                     --class124.field1569;
                     var21 = var3.method7971();
                     if (var21 != null && var21.method7604(class46.field659[class124.field1569], class46.field659[class124.field1569])) {
                        class89.method2877(var3);
                     }

                     return 1;
                  } else if (var0 == 1144) {
                     --class124.field1569;
                     var21 = var3.method7971();
                     if (var21 != null) {
                        var21.method7667(class46.field659[class124.field1569]);
                        class89.method2877(var3);
                     }

                     return 1;
                  } else if (var0 == 1145) {
                     --class124.field1569;
                     var21 = var3.method7971();
                     if (var21 != null) {
                        var21.method7665(class46.field659[class124.field1569]);
                     }

                     return 1;
                  } else if (var0 == 1146) {
                     --class124.field1569;
                     var21 = var3.method7971();
                     if (var21 != null) {
                        var21.method7716(class46.field659[class124.field1569]);
                     }

                     return 1;
                  } else if (var0 == 1147) {
                     --class124.field1569;
                     var21 = var3.method7971();
                     if (var21 != null) {
                        var21.method7670(class46.field659[class124.field1569]);
                        class89.method2877(var3);
                     }

                     return 1;
                  } else {
                     class28 var20;
                     if (var0 == 1148) {
                        class124.field1569 -= 2;
                        var20 = var3.method7973();
                        if (var20 != null) {
                           var20.method417(class46.field659[class124.field1569], class46.field659[class124.field1569 + 1]);
                        }

                        return 1;
                     } else if (var0 == 1149) {
                        class124.field1569 -= 2;
                        var20 = var3.method7973();
                        if (var20 != null) {
                           var20.method418((char)class46.field659[class124.field1569], class46.field659[class124.field1569 + 1]);
                        }

                        return 1;
                     } else if (var0 == 1150) {
                        var3.method8057((String)class46.field660[--class46.field658], class114.field1507);
                        return 1;
                     } else if (var0 == 1151) {
                        class46.field658 -= 3;
                        var17 = (String)class46.field660[class46.field658];
                        String var13 = (String)class46.field660[class46.field658 + 1];
                        String var6 = (String)class46.field660[class46.field658 + 2];
                        long var7 = class284.method6363();
                        long var9 = class274.method6140();
                        String var11 = class432.method8661().method10585(class432.method8661().field5615);
                        if (var7 != -1L) {
                           var17 = var17.replaceAll("%userid%", Long.toString(var7));
                        }

                        if (-1L != var9) {
                           var17 = var17.replaceAll("%userhash%", Long.toString(var9));
                        }

                        if (!var11.isEmpty()) {
                           var17 = var17.replaceAll("%deviceid%", var11);
                        }

                        var3.method7932(var17, var13, var6, var11, Long.toString(var9), class114.field1507);
                        return 1;
                     } else if (var0 == 1152) {
                        if (var3.field4147 != 11) {
                           throw new RuntimeException();
                        } else {
                           class256 var12 = var3.method7967();
                           boolean var5 = var12 != null && var12.method5821() && class259.method5905().method5992(var12.method5825());
                           class46.field659[++class124.field1569 - 1] = var5 ? 1 : 0;
                           return 1;
                        }
                     } else {
                        return 2;
                     }
                  }
               }
            }
         }
      }
   }
}
