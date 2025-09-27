package runescape;

import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
public class class66 implements Runnable {
   @ObfuscatedName("kf")
   @ObfuscatedSignature(
      descriptor = "Lpw;"
   )
   static class409 field913;
   @ObfuscatedName("af")
   boolean isRunning = true;
   @ObfuscatedName("aw")
   Object lock = new Object();
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 2103704019
   )
   int index = 0;
   @ObfuscatedName("ac")
   int[] field908 = new int[500];
   @ObfuscatedName("ap")
   int[] field910 = new int[500];
   @ObfuscatedName("aq")
   long[] field912 = new long[500];

   class66() {
   }

   public void run() {
      for(; this.isRunning; class164.method4001(50L)) {
         synchronized(this.lock) {
            if (this.index < 500) {
               this.field908[this.index] = class35.field231;
               this.field910[this.index] = class35.field220;
               this.field912[this.index] = class35.field232;
               ++this.index;
            }
         }
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "1908605701"
   )
   static void method2147(String var0, String var1, String var2) {
      class52.field744 = var0;
      class52.field745 = var1;
      class52.field746 = var2;
   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "-2105325665"
   )
   static int method2152(int var0, class55 var1, boolean var2) {
      int var3;
      Object var4;
      int var5;
      class578 var6;
      int var7;
      if (var0 == 7500) {
         var3 = class46.field659[--class124.field1569];
         var4 = class60.method2082(var3);
         var5 = class46.field659[--class124.field1569];
         var6 = class23.method333(var5);
         if (var6 == null) {
            throw new RuntimeException();
         } else {
            var7 = LoginType.method10882(var5);
            class334.field3837 = var6.method11060(var4, var7);
            if (class334.field3837 != null) {
               client.field316 = class456.method9207(var5);
               class255.field3064 = class334.field3837.iterator();
               if (var0 == 7500) {
                  class46.field659[++class124.field1569 - 1] = class334.field3837.size();
               }
            } else {
               client.field316 = -1;
               class255.field3064 = null;
               if (var0 == 7500) {
                  class46.field659[++class124.field1569 - 1] = 0;
               }
            }

            return 1;
         }
      } else if (var0 != 7501) {
         int var19;
         int var20;
         if (var0 == 7502) {
            class124.field1569 -= 3;
            var3 = class46.field659[class124.field1569];
            var19 = class46.field659[class124.field1569 + 1];
            var5 = class46.field659[class124.field1569 + 2];
            var20 = class456.method9207(var19);
            var7 = class512.method10223(var19);
            int var21 = LoginType.method10882(var19);
            class579 var26 = class454.method9162(var3);
            class577 var27 = class574.method11019(var20);
            int[] var28 = var27.field5829[var7];
            int var12 = 0;
            int var13 = var28.length;
            if (var21 >= 0) {
               if (var21 >= var13) {
                  throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var21 + ", Max: " + var13);
               }

               var12 = var21;
               var13 = var21 + 1;
            }

            Object[] var14 = var26.method11068(var7);
            if (var14 == null && var27.field5828 != null) {
               var14 = var27.field5828[var7];
            }

            int var15;
            int var16;
            if (var14 == null) {
               for(var15 = var12; var15 < var13; ++var15) {
                  var16 = var28[var15];
                  class574 var22 = class491.method9850(var16);
                  if (var22 == class574.field5824) {
                     class46.field660[++class46.field658 - 1] = "";
                  } else {
                     class46.field659[++class124.field1569 - 1] = class555.method10840(var16);
                  }
               }

               return 1;
            } else {
               var15 = var14.length / var28.length;
               if (var5 >= 0 && var5 < var15) {
                  for(var16 = var12; var16 < var13; ++var16) {
                     int var17 = var16 + var28.length * var5;
                     class574 var18 = class491.method9850(var28[var16]);
                     if (var18 == class574.field5824) {
                        class46.field660[++class46.field658 - 1] = var14[var17];
                     } else {
                        class46.field659[++class124.field1569 - 1] = (Integer)var14[var17];
                     }
                  }

                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         } else if (var0 == 7503) {
            class124.field1569 -= 2;
            var3 = class46.field659[class124.field1569];
            var19 = class46.field659[class124.field1569 + 1];
            var5 = 0;
            var20 = class456.method9207(var19);
            var7 = class512.method10223(var19);
            class579 var25 = class454.method9162(var3);
            class577 var9 = class574.method11019(var20);
            int[] var10 = var9.field5829[var7];
            Object[] var11 = var25.method11068(var7);
            if (var11 == null && var9.field5828 != null) {
               var11 = var9.field5828[var7];
            }

            if (var11 != null) {
               var5 = var11.length / var10.length;
            }

            class46.field659[++class124.field1569 - 1] = var5;
            return 1;
         } else if (var0 == 7504) {
            --class124.field1569;
            var3 = class46.field659[class124.field1569];
            class578 var24 = InterfaceParent.method187(var3);
            if (var24 == null) {
               throw new RuntimeException();
            } else {
               class334.field3837 = var24.method11060(0, 0);
               var5 = 0;
               if (class334.field3837 != null) {
                  client.field316 = var3;
                  class255.field3064 = class334.field3837.iterator();
                  var5 = class334.field3837.size();
               }

               if (var0 == 7504) {
                  class46.field659[++class124.field1569 - 1] = var5;
               }

               return 1;
            }
         } else if (var0 == 7505) {
            var3 = class46.field659[--class124.field1569];
            class579 var23 = class454.method9162(var3);
            class46.field659[++class124.field1569 - 1] = var23.field5843;
            return 1;
         } else if (var0 == 7506) {
            var3 = class46.field659[--class124.field1569];
            var19 = -1;
            if (class334.field3837 != null && var3 >= 0 && var3 < class334.field3837.size()) {
               var19 = (Integer)class334.field3837.get(var3);
            }

            class46.field659[++class124.field1569 - 1] = var19;
            return 1;
         } else if (var0 == 7507) {
            var3 = class46.field659[--class124.field1569];
            var4 = class60.method2082(var3);
            var5 = class46.field659[--class124.field1569];
            var6 = class23.method333(var5);
            if (var6 == null) {
               throw new RuntimeException();
            } else if (class456.method9207(var5) != client.field316) {
               throw new RuntimeException();
            } else if (class334.field3837 == null && class334.field3837.isEmpty()) {
               throw new RuntimeException();
            } else {
               var7 = LoginType.method10882(var5);
               List var8 = var6.method11060(var4, var7);
               class334.field3837 = new LinkedList(class334.field3837);
               if (var8 != null) {
                  class334.field3837.retainAll(var8);
               } else {
                  class334.field3837.clear();
               }

               class255.field3064 = class334.field3837.iterator();
               if (var0 == 7507) {
                  class46.field659[++class124.field1569 - 1] = class334.field3837.size();
               }

               return 1;
            }
         } else {
            return 2;
         }
      } else {
         if (class255.field3064 != null && class255.field3064.hasNext()) {
            class46.field659[++class124.field1569 - 1] = (Integer)class255.field3064.next();
         } else {
            class46.field659[++class124.field1569 - 1] = -1;
         }

         return 1;
      }
   }
}
