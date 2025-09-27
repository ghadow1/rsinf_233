package runescape;

import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
public abstract class class314 implements class316 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 1224007117
   )
   protected int field3515;

   @ObfuscatedSignature(
      descriptor = "(Lop;Lqh;I)V"
   )
   protected class314(class387 var1, class432 var2, int var3) {
      this.field3515 = var3;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Loi;ZI)V",
      garbageValue = "-1879972674"
   )
   static void method6971(class369 var0, boolean var1) {
      if (var0 != null) {
         class46.field659[++class124.field1569 - 1] = 1;
         if (var1) {
            class19.field81 = var0;
         } else {
            class141.field1714 = var0;
         }
      } else {
         class46.field659[++class124.field1569 - 1] = 0;
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZI)I",
      garbageValue = "-1981637714"
   )
   static int method6972(int var0, class55 var1, boolean var2) {
      class369 var3;
      if (var0 >= 2000) {
         var0 -= 1000;
         var3 = class119.field1554.method7476(class46.field659[--class124.field1569]);
      } else {
         var3 = var2 ? class19.field81 : class141.field1714;
      }

      String var4 = (String)class46.field660[--class46.field658];
      int[] var5 = null;
      if (!var4.isEmpty() && var4.charAt(var4.length() - 1) == 'Y') {
         int var6 = class46.field659[--class124.field1569];
         if (var6 > 0) {
            for(var5 = new int[var6]; var6-- > 0; var5[var6] = class46.field659[--class124.field1569]) {
            }
         }

         var4 = var4.substring(0, var4.length() - 1);
      }

      Object[] var9 = new Object[var4.length() + 1];

      int var7;
      for(var7 = var9.length - 1; var7 >= 1; --var7) {
         switch(var4.charAt(var7 - 1)) {
         case 'W':
         case 'X':
         case 's':
            var9[var7] = class46.field660[--class46.field658];
            break;
         default:
            var9[var7] = new Integer(class46.field659[--class124.field1569]);
         }
      }

      var7 = class46.field659[--class124.field1569];
      if (var7 != -1) {
         var9[0] = new Integer(var7);
      } else {
         var9 = null;
      }

      if (var0 == 1400) {
         var3.field4238 = var9;
      } else if (var0 == 1401) {
         var3.field4241 = var9;
      } else if (var0 == 1402) {
         var3.field4240 = var9;
      } else if (var0 == 1403) {
         var3.field4242 = var9;
      } else if (var0 == 1404) {
         var3.field4244 = var9;
      } else if (var0 == 1405) {
         var3.field4291 = var9;
      } else if (var0 == 1406) {
         var3.field4189 = var9;
      } else if (var0 == 1407) {
         var3.field4217 = var9;
         var3.field4250 = var5;
      } else if (var0 == 1408) {
         var3.field4255 = var9;
      } else if (var0 == 1409) {
         var3.field4256 = var9;
      } else if (var0 == 1410) {
         var3.field4288 = var9;
      } else if (var0 == 1411) {
         var3.field4239 = var9;
      } else if (var0 == 1412) {
         var3.field4243 = var9;
      } else if (var0 == 1414) {
         var3.field4304 = var9;
         var3.field4252 = var5;
      } else if (var0 == 1415) {
         var3.field4253 = var9;
         var3.field4254 = var5;
      } else if (var0 == 1416) {
         var3.field4247 = var9;
      } else if (var0 == 1417) {
         var3.field4258 = var9;
      } else if (var0 == 1418) {
         var3.field4154 = var9;
      } else if (var0 == 1419) {
         var3.field4151 = var9;
      } else if (var0 == 1420) {
         var3.field4263 = var9;
      } else if (var0 == 1421) {
         var3.field4264 = var9;
      } else if (var0 == 1422) {
         var3.field4296 = var9;
      } else if (var0 == 1423) {
         var3.field4268 = var9;
      } else if (var0 == 1424) {
         var3.field4269 = var9;
      } else if (var0 == 1425) {
         var3.field4271 = var9;
      } else if (var0 == 1426) {
         var3.field4273 = var9;
      } else if (var0 == 1427) {
         var3.field4270 = var9;
      } else if (var0 == 1428) {
         var3.field4280 = var9;
      } else if (var0 == 1429) {
         var3.field4266 = var9;
      } else if (var0 == 1430) {
         var3.field4261 = var9;
      } else if (var0 == 1431) {
         var3.field4159 = var9;
      } else if (var0 == 1434) {
         var3.field4176 = var9;
      } else if (var0 == 1435) {
         var3.field4302 = var9;
      } else {
         if (var0 < 1436 || var0 > 1439) {
            return 2;
         }

         class364 var8 = var3.method7974();
         if (var8 != null) {
            if (var0 == 1436) {
               var8.field4068 = var9;
            } else if (var0 == 1437) {
               var8.field4069 = var9;
            } else if (var0 == 1438) {
               var8.field4070 = var9;
            } else if (var0 == 1439) {
               var8.field4067 = var9;
            }
         }
      }

      var3.field4236 = true;
      return 1;
   }
}
