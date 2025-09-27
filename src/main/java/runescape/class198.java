package runescape;

import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public enum class198 implements class430 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lhx;"
   )
   field2172(1, 0),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lhx;"
   )
   field2169(2, 1),
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lhx;"
   )
   field2167(0, 2);

   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1187839087
   )
   public final int field2166;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 649050899
   )
   final int field2165;

   class198(int var3, int var4) {
      this.field2166 = var3;
      this.field2165 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1935172756"
   )
   public int vmethod11658() {
      return this.field2165;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
      garbageValue = "1787603990"
   )
   static File method4392(String var0) {
      if (!class262.field3115) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)class262.field3116.get(var0);
         if (var1 != null) {
            return var1;
         } else {
            File var2 = new File(class262.field3117, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if (!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  class262.field3116.put(var0, var2);
                  return var2;
               }
            } catch (Exception var8) {
               try {
                  if (var3 != null) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var7) {
               }

               throw new RuntimeException();
            }
         }
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IB)Lha;",
      garbageValue = "-26"
   )
   public static class184 method4395(int var0) {
      return var0 >= 0 && var0 < class255.field3066.length && class255.field3066[var0] != null ? class255.field3066[var0] : new class184(var0);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ILcg;ZB)I",
      garbageValue = "0"
   )
   static int method4393(int var0, class55 var1, boolean var2) {
      if (var0 < 1000) {
         return class268.method6044(var0, var1, var2);
      } else if (var0 < 1100) {
         return class182.method4175(var0, var1, var2);
      } else if (var0 < 1200) {
         return class409.method8327(var0, var1, var2);
      } else if (var0 < 1300) {
         return class355.method7403(var0, var1, var2);
      } else if (var0 < 1400) {
         return class302.method6828(var0, var1, var2);
      } else if (var0 < 1500) {
         return class314.method6972(var0, var1, var2);
      } else if (var0 < 1600) {
         return class10.method98(var0, var1, var2);
      } else if (var0 < 1700) {
         return class27.method414(var0, var1, var2);
      } else if (var0 < 1800) {
         return class30.method473(var0, var1, var2);
      } else if (var0 < 1900) {
         return class77.method2532(var0, var1, var2);
      } else if (var0 < 2000) {
         return class83.method2795(var0, var1, var2);
      } else if (var0 < 2100) {
         return class182.method4175(var0, var1, var2);
      } else if (var0 < 2200) {
         return class409.method8327(var0, var1, var2);
      } else if (var0 < 2300) {
         return class355.method7403(var0, var1, var2);
      } else if (var0 < 2400) {
         return class302.method6828(var0, var1, var2);
      } else if (var0 < 2500) {
         return class314.method6972(var0, var1, var2);
      } else if (var0 < 2600) {
         return class33.method504(var0, var1, var2);
      } else if (var0 < 2700) {
         return class50.method1891(var0, var1, var2);
      } else if (var0 < 2800) {
         return class471.method9643(var0, var1, var2);
      } else if (var0 < 2900) {
         return class54.method1982(var0, var1, var2);
      } else if (var0 < 3000) {
         return class83.method2795(var0, var1, var2);
      } else if (var0 < 3200) {
         return class556.method10849(var0, var1, var2);
      } else if (var0 < 3300) {
         return class197.method4389(var0, var1, var2);
      } else if (var0 < 3400) {
         return class144.method3739(var0, var1, var2);
      } else if (var0 < 3500) {
         return class479.method9675(var0, var1, var2);
      } else if (var0 < 3600) {
         return class42.method789(var0, var1, var2);
      } else if (var0 < 3700) {
         return class207.method4514(var0, var1, var2);
      } else if (var0 < 3800) {
         return class408.method8285(var0, var1, var2);
      } else if (var0 < 3900) {
         return class486.method9789(var0, var1, var2);
      } else if (var0 < 4000) {
         return class88.method2871(var0, var1, var2);
      } else if (var0 < 4100) {
         return class39.method766(var0, var1, var2);
      } else if (var0 < 4200) {
         return class64.method2131(var0, var1, var2);
      } else if (var0 < 4300) {
         return class274.method6160(var0, var1, var2);
      } else if (var0 < 5100) {
         return class146.method3752(var0, var1, var2);
      } else if (var0 < 5400) {
         return class475.method9652(var0, var1, var2);
      } else if (var0 < 5600) {
         return class268.method6043(var0, var1, var2);
      } else if (var0 < 5700) {
         return class115.method3460(var0, var1, var2);
      } else if (var0 < 6300) {
         return class256.method5829(var0, var1, var2);
      } else if (var0 < 6600) {
         return class34.method528(var0, var1, var2);
      } else if (var0 < 6700) {
         return class390.method8217(var0, var1, var2);
      } else if (var0 < 6800) {
         return class160.method3896(var0, var1, var2);
      } else if (var0 < 6900) {
         return class369.method8101(var0, var1, var2);
      } else if (var0 < 7000) {
         return class34.method686(var0, var1, var2);
      } else if (var0 < 7100) {
         return class354.method7397(var0, var1, var2);
      } else if (var0 < 7200) {
         return class525.method10444(var0, var1, var2);
      } else if (var0 < 7500) {
         return class240.method5444(var0, var1, var2);
      } else if (var0 < 7600) {
         return class66.method2152(var0, var1, var2);
      } else if (var0 < 7700) {
         return class376.method8155(var0, var1, var2);
      } else if (var0 < 8000) {
         return class108.method3378(var0, var1, var2);
      } else if (var0 < 8100) {
         return class183.method4176(var0, var1, var2);
      } else {
         return var0 >= 13000 && var0 < 14000 ? class410.method8330(var0, var1, var2) : 2;
      }
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Lbp;B)V",
      garbageValue = "-4"
   )
   static void method4391(class44 var0) {
      if (var0.method1490() != client.field326) {
         client.field326 = var0.method1490();
         boolean var1 = var0.method1490();
         if (var1 != class303.field3465) {
            class167.method4031();
            class303.field3465 = var1;
         }
      }

      if (var0.field632 != client.field385) {
         class125.method3559(class496.field5387, var0.field632);
      }

      class35.worldHost = var0.field634;
      client.worldId = var0.field640;
      client.field385 = var0.field632;
      class184.field1997 = var0.field638;
      class431.field5089 = client.field354 == 0 ? 'ꩊ' : var0.field640 + '鱀';
      class545.field5606 = client.field354 == 0 ? 443 : var0.field640 + '썐';
      class151.field1770 = class431.field5089;
   }
}
