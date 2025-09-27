package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class162 {
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      longValue = 5136877431086231005L
   )
   long field1845;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 1414997907
   )
   public int field1870 = 0;
   @ObfuscatedName("al")
   public String field1860 = null;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1465200835
   )
   int field1848 = 0;
   @ObfuscatedName("ai")
   public boolean field1847;
   @ObfuscatedName("aa")
   public byte field1850;
   @ObfuscatedName("am")
   public byte field1846;
   @ObfuscatedName("an")
   public byte field1852;
   @ObfuscatedName("ar")
   public byte field1853;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -2058643207
   )
   public int field1854;
   @ObfuscatedName("ay")
   long[] field1855;
   @ObfuscatedName("ad")
   public byte[] field1856;
   @ObfuscatedName("ag")
   int[] field1857;
   @ObfuscatedName("av")
   public int[] field1858;
   @ObfuscatedName("ah")
   public boolean[] field1859;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 55400707
   )
   public int field1865 = -1;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -483201461
   )
   public int field1861 = -1;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1425260297
   )
   public int field1862;
   @ObfuscatedName("aj")
   long[] field1863;
   @ObfuscatedName("az")
   public String[] field1864;
   @ObfuscatedName("bt")
   public String[] field1866;
   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "Lqm;"
   )
   class426 field1849;
   @ObfuscatedName("bu")
   boolean field1851;
   @ObfuscatedName("bi")
   boolean field1868;
   @ObfuscatedName("bd")
   int[] field1840;

   @ObfuscatedSignature(
      descriptor = "(Lwb;)V"
   )
   public class162(Buffer var1) {
      this.method3982(var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "1"
   )
   void method3915(int var1) {
      if (this.field1851) {
         if (this.field1855 != null) {
            System.arraycopy(this.field1855, 0, this.field1855 = new long[var1], 0, this.field1854);
         } else {
            this.field1855 = new long[var1];
         }
      }

      if (this.field1868) {
         if (this.field1864 != null) {
            System.arraycopy(this.field1864, 0, this.field1864 = new String[var1], 0, this.field1854);
         } else {
            this.field1864 = new String[var1];
         }
      }

      if (this.field1856 != null) {
         System.arraycopy(this.field1856, 0, this.field1856 = new byte[var1], 0, this.field1854);
      } else {
         this.field1856 = new byte[var1];
      }

      if (this.field1857 != null) {
         System.arraycopy(this.field1857, 0, this.field1857 = new int[var1], 0, this.field1854);
      } else {
         this.field1857 = new int[var1];
      }

      if (this.field1858 != null) {
         System.arraycopy(this.field1858, 0, this.field1858 = new int[var1], 0, this.field1854);
      } else {
         this.field1858 = new int[var1];
      }

      if (this.field1859 != null) {
         System.arraycopy(this.field1859, 0, this.field1859 = new boolean[var1], 0, this.field1854);
      } else {
         this.field1859 = new boolean[var1];
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "-32092"
   )
   void method3940(int var1) {
      if (this.field1851) {
         if (this.field1863 != null) {
            System.arraycopy(this.field1863, 0, this.field1863 = new long[var1], 0, this.field1862);
         } else {
            this.field1863 = new long[var1];
         }
      }

      if (this.field1868) {
         if (this.field1866 != null) {
            System.arraycopy(this.field1866, 0, this.field1866 = new String[var1], 0, this.field1862);
         } else {
            this.field1866 = new String[var1];
         }
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)I",
      garbageValue = "0"
   )
   public int method3921(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         for(int var2 = 0; var2 < this.field1854; ++var2) {
            if (this.field1864[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-809615358"
   )
   public int method3943(int var1, int var2, int var3) {
      int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
      return (this.field1857[var1] & var4) >>> var2;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/Integer;",
      garbageValue = "1412765109"
   )
   public Integer method3968(int var1) {
      if (this.field1849 == null) {
         return null;
      } else {
         class544 var2 = this.field1849.method8596((long)var1);
         return var2 != null && var2 instanceof class543 ? new Integer(((class543)var2).field5597) : null;
      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "-1878010314"
   )
   public int[] method3920() {
      if (this.field1840 == null) {
         String[] var1 = new String[this.field1854];
         this.field1840 = new int[this.field1854];

         for(int var2 = 0; var2 < this.field1854; this.field1840[var2] = var2++) {
            var1[var2] = this.field1864[var2];
            if (var1[var2] != null) {
               var1[var2] = var1[var2].toLowerCase();
            }
         }

         class253.method5795(var1, this.field1840);
      }

      return this.field1840;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(JLjava/lang/String;IB)V",
      garbageValue = "57"
   )
   void method3962(long var1, String var3, int var4) {
      if (var3 != null && var3.isEmpty()) {
         var3 = null;
      }

      if (this.field1851 != var1 > 0L) {
         throw new RuntimeException("");
      } else if (this.field1868 != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.field1855 == null || this.field1854 >= this.field1855.length) || var3 != null && (this.field1864 == null || this.field1854 >= this.field1864.length)) {
            this.method3915(this.field1854 + 5);
         }

         if (this.field1855 != null) {
            this.field1855[this.field1854] = var1;
         }

         if (this.field1864 != null) {
            this.field1864[this.field1854] = var3;
         }

         if (this.field1865 == -1) {
            this.field1865 = this.field1854;
            this.field1856[this.field1854] = 126;
         } else {
            this.field1856[this.field1854] = 0;
         }

         this.field1857[this.field1854] = 0;
         this.field1858[this.field1854] = var4;
         this.field1859[this.field1854] = false;
         ++this.field1854;
         this.field1840 = null;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "27669713"
   )
   void method3922(int var1) {
      if (var1 >= 0 && var1 < this.field1854) {
         --this.field1854;
         this.field1840 = null;
         if (this.field1854 == 0) {
            this.field1855 = null;
            this.field1864 = null;
            this.field1856 = null;
            this.field1857 = null;
            this.field1858 = null;
            this.field1859 = null;
            this.field1865 = -1;
            this.field1861 = -1;
         } else {
            System.arraycopy(this.field1856, var1 + 1, this.field1856, var1, this.field1854 - var1);
            System.arraycopy(this.field1857, var1 + 1, this.field1857, var1, this.field1854 - var1);
            System.arraycopy(this.field1858, var1 + 1, this.field1858, var1, this.field1854 - var1);
            System.arraycopy(this.field1859, var1 + 1, this.field1859, var1, this.field1854 - var1);
            if (this.field1855 != null) {
               System.arraycopy(this.field1855, var1 + 1, this.field1855, var1, this.field1854 - var1);
            }

            if (this.field1864 != null) {
               System.arraycopy(this.field1864, var1 + 1, this.field1864, var1, this.field1854 - var1);
            }

            this.method3923();
         }

      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1728183582"
   )
   void method3923() {
      if (this.field1854 == 0) {
         this.field1865 = -1;
         this.field1861 = -1;
      } else {
         this.field1865 = -1;
         this.field1861 = -1;
         int var1 = 0;
         byte var2 = this.field1856[0];

         for(int var3 = 1; var3 < this.field1854; ++var3) {
            if (this.field1856[var3] > var2) {
               if (var2 == 125) {
                  this.field1861 = var1;
               }

               var1 = var3;
               var2 = this.field1856[var3];
            } else if (this.field1861 == -1 && this.field1856[var3] == 125) {
               this.field1861 = var3;
            }
         }

         this.field1865 = var1;
         if (this.field1865 != -1) {
            this.field1856[this.field1865] = 126;
         }

      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(JLjava/lang/String;S)V",
      garbageValue = "5628"
   )
   void method3987(long var1, String var3) {
      if (var3 != null && var3.isEmpty()) {
         var3 = null;
      }

      if (this.field1851 != var1 > 0L) {
         throw new RuntimeException("");
      } else if (var3 != null != this.field1868) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.field1863 == null || this.field1862 >= this.field1863.length) || var3 != null && (this.field1866 == null || this.field1862 >= this.field1866.length)) {
            this.method3940(this.field1862 + 5);
         }

         if (this.field1863 != null) {
            this.field1863[this.field1862] = var1;
         }

         if (this.field1866 != null) {
            this.field1866[this.field1862] = var3;
         }

         ++this.field1862;
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "920796095"
   )
   void method3925(int var1) {
      --this.field1862;
      if (this.field1862 == 0) {
         this.field1863 = null;
         this.field1866 = null;
      } else {
         if (this.field1863 != null) {
            System.arraycopy(this.field1863, var1 + 1, this.field1863, var1, this.field1862 - var1);
         }

         if (this.field1866 != null) {
            System.arraycopy(this.field1866, var1 + 1, this.field1866, var1, this.field1862 - var1);
         }
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(IBB)I",
      garbageValue = "-83"
   )
   int method3926(int var1, byte var2) {
      if (var2 != 126 && var2 != 127) {
         if (this.field1865 == var1 && (this.field1861 == -1 || this.field1856[this.field1861] < 125)) {
            return -1;
         } else if (this.field1856[var1] == var2) {
            return -1;
         } else {
            this.field1856[var1] = var2;
            this.method3923();
            return var1;
         }
      } else {
         return -1;
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-476088721"
   )
   boolean method3927(int var1) {
      if (this.field1865 != var1 && this.field1856[var1] != 126) {
         this.field1856[this.field1865] = 125;
         this.field1861 = this.field1865;
         this.field1856[var1] = 126;
         this.field1865 = var1;
         return true;
      } else {
         return false;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IZI)I",
      garbageValue = "-1006641339"
   )
   int method3928(int var1, boolean var2) {
      if (this.field1859[var1] == var2) {
         return -1;
      } else {
         this.field1859[var1] = var2;
         return var1;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(IIIII)I",
      garbageValue = "-1425604658"
   )
   int method3929(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      int var8 = this.field1857[var1];
      if ((var8 & var7) == var2) {
         return -1;
      } else {
         var8 &= ~var7;
         this.field1857[var1] = var8 | var2;
         return var1;
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "-20"
   )
   boolean method3981(int var1, int var2) {
      if (this.field1849 != null) {
         class544 var3 = this.field1849.method8596((long)var1);
         if (var3 != null) {
            if (var3 instanceof class543) {
               class543 var4 = (class543)var3;
               if (var2 == var4.field5597) {
                  return false;
               }

               var4.field5597 = var2;
               return true;
            }

            var3.vmethod10557();
         }
      } else {
         this.field1849 = new class426(4);
      }

      this.field1849.method8590(new class543(var2), (long)var1);
      return true;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)Z",
      garbageValue = "66"
   )
   boolean method3931(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      if (this.field1849 != null) {
         class544 var8 = this.field1849.method8596((long)var1);
         if (var8 != null) {
            if (var8 instanceof class543) {
               class543 var9 = (class543)var8;
               if ((var9.field5597 & var7) == var2) {
                  return false;
               }

               var9.field5597 &= ~var7;
               var9.field5597 |= var2;
               return true;
            }

            var8.vmethod10557();
         }
      } else {
         this.field1849 = new class426(4);
      }

      this.field1849.method8590(new class543(var2), (long)var1);
      return true;
   }

   @ObfuscatedName("ad")
   boolean method3974(int var1, long var2) {
      if (this.field1849 != null) {
         class544 var4 = this.field1849.method8596((long)var1);
         if (var4 != null) {
            if (var4 instanceof class542) {
               class542 var5 = (class542)var4;
               if (var5.field5596 == var2) {
                  return false;
               }

               var5.field5596 = var2;
               return true;
            }

            var4.vmethod10557();
         }
      } else {
         this.field1849 = new class426(4);
      }

      this.field1849.method8590(new class542(var2), (long)var1);
      return true;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;B)Z",
      garbageValue = "64"
   )
   boolean method3933(int var1, String var2) {
      if (var2 == null) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (this.field1849 != null) {
         class544 var3 = this.field1849.method8596((long)var1);
         if (var3 != null) {
            if (var3 instanceof class541) {
               class541 var4 = (class541)var3;
               if (var4.field5595 instanceof String) {
                  if (var2.equals(var4.field5595)) {
                     return false;
                  }

                  var4.vmethod10557();
                  this.field1849.method8590(new class541(var2), var4.field5600);
                  return true;
               }
            }

            var3.vmethod10557();
         }
      } else {
         this.field1849 = new class426(4);
      }

      this.field1849.method8590(new class541(var2), (long)var1);
      return true;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)V",
      garbageValue = "773148583"
   )
   void method3982(Buffer var1) {
      int var2 = var1.method11196();
      if (var2 >= 1 && var2 <= 6) {
         int var3 = var1.method11196();
         if ((var3 & 1) != 0) {
            this.field1851 = true;
         }

         if ((var3 & 2) != 0) {
            this.field1868 = true;
         }

         if (!this.field1851) {
            this.field1855 = null;
            this.field1863 = null;
         }

         if (!this.field1868) {
            this.field1864 = null;
            this.field1866 = null;
         }

         this.field1870 = var1.read32BitArray();
         this.field1848 = var1.read32BitArray();
         if (var2 <= 3 && this.field1848 != 0) {
            this.field1848 += 16912800;
         }

         this.field1854 = var1.readUnsignedShort();
         this.field1862 = var1.method11196();
         this.field1860 = var1.method11207();
         if (var2 >= 4) {
            var1.read32BitArray();
         }

         this.field1847 = var1.method11196() == 1;
         this.field1850 = var1.method11197();
         this.field1846 = var1.method11197();
         this.field1852 = var1.method11197();
         this.field1853 = var1.method11197();
         int var4;
         if (this.field1854 > 0) {
            if (this.field1851 && (this.field1855 == null || this.field1855.length < this.field1854)) {
               this.field1855 = new long[this.field1854];
            }

            if (this.field1868 && (this.field1864 == null || this.field1864.length < this.field1854)) {
               this.field1864 = new String[this.field1854];
            }

            if (this.field1856 == null || this.field1856.length < this.field1854) {
               this.field1856 = new byte[this.field1854];
            }

            if (this.field1857 == null || this.field1857.length < this.field1854) {
               this.field1857 = new int[this.field1854];
            }

            if (this.field1858 == null || this.field1858.length < this.field1854) {
               this.field1858 = new int[this.field1854];
            }

            if (this.field1859 == null || this.field1859.length < this.field1854) {
               this.field1859 = new boolean[this.field1854];
            }

            for(var4 = 0; var4 < this.field1854; ++var4) {
               if (this.field1851) {
                  this.field1855[var4] = var1.method11203();
               }

               if (this.field1868) {
                  this.field1864[var4] = var1.method11206();
               }

               this.field1856[var4] = var1.method11197();
               if (var2 >= 2) {
                  this.field1857[var4] = var1.read32BitArray();
               }

               if (var2 >= 5) {
                  this.field1858[var4] = var1.readUnsignedShort();
               } else {
                  this.field1858[var4] = 0;
               }

               if (var2 >= 6) {
                  this.field1859[var4] = var1.method11196() == 1;
               } else {
                  this.field1859[var4] = false;
               }
            }

            this.method3923();
         }

         if (this.field1862 > 0) {
            if (this.field1851 && (this.field1863 == null || this.field1863.length < this.field1862)) {
               this.field1863 = new long[this.field1862];
            }

            if (this.field1868 && (this.field1866 == null || this.field1866.length < this.field1862)) {
               this.field1866 = new String[this.field1862];
            }

            for(var4 = 0; var4 < this.field1862; ++var4) {
               if (this.field1851) {
                  this.field1863[var4] = var1.method11203();
               }

               if (this.field1868) {
                  this.field1866[var4] = var1.method11206();
               }
            }
         }

         if (var2 >= 3) {
            var4 = var1.readUnsignedShort();
            if (var4 > 0) {
               this.field1849 = new class426(var4 < 16 ? class165.method4019(var4) : 16);

               while(var4-- > 0) {
                  int var5 = var1.read32BitArray();
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if (var7 == 0) {
                     int var12 = var1.read32BitArray();
                     this.field1849.method8590(new class543(var12), (long)var6);
                  } else if (var7 == 1) {
                     long var10 = var1.method11203();
                     this.field1849.method8590(new class542(var10), (long)var6);
                  } else if (var7 == 2) {
                     String var8 = var1.method11207();
                     this.field1849.method8590(new class541(var8), (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "([BB)Ljava/lang/String;",
      garbageValue = "73"
   )
   public static String method3992(byte[] var0) {
      int var2 = var0.length;
      StringBuilder var3 = new StringBuilder();

      for(int var4 = 0; var4 < var2 + 0; var4 += 3) {
         int var5 = var0[var4] & 255;
         var3.append(class444.field5143[var5 >>> 2]);
         if (var4 < var2 - 1) {
            int var6 = var0[var4 + 1] & 255;
            var3.append(class444.field5143[(var5 & 3) << 4 | var6 >>> 4]);
            if (var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & 255;
               var3.append(class444.field5143[(var6 & 15) << 2 | var7 >>> 6]).append(class444.field5143[var7 & 63]);
            } else {
               var3.append(class444.field5143[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(class444.field5143[(var5 & 3) << 4]).append("==");
         }
      }

      String var1 = var3.toString();
      return var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-876787762"
   )
   public static void method3991() {
      class207.field2267.method7011();
   }
}
