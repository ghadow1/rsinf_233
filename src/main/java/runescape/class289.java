package runescape;

import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
public class class289 {
   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "Lxc;"
   )
   static class604 field3340;
   @ObfuscatedName("ra")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   static class241 field3341;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1921573561
   )
   int field3327 = -1;
   @ObfuscatedName("aw")
   String field3334;
   @ObfuscatedName("at")
   String field3333;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1212235085
   )
   int field3329 = -1;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -284745817
   )
   int field3330 = -16777216;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1935146689
   )
   int field3331 = -1;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lna;"
   )
   class356 field3332 = null;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1772867871
   )
   int field3337 = Integer.MAX_VALUE;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1634868523
   )
   int field3335 = 0;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 82083805
   )
   int field3326 = Integer.MAX_VALUE;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -990520379
   )
   int field3336 = 0;
   @ObfuscatedName("aa")
   boolean field3328 = false;
   @ObfuscatedName("am")
   LinkedList field3338;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lwb;II)V",
      garbageValue = "-1591303387"
   )
   public void method6420(Buffer var1, int var2) {
      this.field3327 = var2;
      this.field3334 = var1.method11207();
      this.field3333 = var1.method11207();
      this.field3332 = new class356(var1.read32BitArray());
      this.field3329 = var1.read32BitArray();
      this.field3330 = var1.read32BitArray();
      var1.method11196();
      this.field3328 = var1.method11196() == 1;
      this.field3331 = var1.method11196();
      int var3 = var1.method11196();
      this.field3338 = new LinkedList();

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field3338.add(this.method6493(var1));
      }

      this.method6419();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lwb;I)Llz;",
      garbageValue = "-763380047"
   )
   class309 method6493(Buffer var1) {
      int var2 = var1.method11196();
      class297 var3 = (class297)class173.findEnumerated(class297.method6777(), var2);
      Object var4 = null;
      switch(var3.field3417) {
      case 0:
         var4 = new class306();
         break;
      case 1:
         var4 = new class288();
         break;
      case 2:
         var4 = new class296();
         break;
      case 3:
         var4 = new class293();
         break;
      default:
         throw new IllegalStateException("");
      }

      ((class309)var4).vmethod6901(var1);
      return (class309)var4;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "0"
   )
   public boolean method6422(int var1, int var2, int var3) {
      Iterator var4 = this.field3338.iterator();

      class309 var5;
      do {
         if (!var4.hasNext()) {
            return false;
         }

         var5 = (class309)var4.next();
      } while(!var5.vmethod6897(var1, var2, var3));

      return true;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-96026724"
   )
   public boolean method6492(int var1, int var2) {
      int var3 = var1 / 64;
      int var4 = var2 / 64;
      if (var3 >= this.field3337 && var3 <= this.field3335) {
         if (var4 >= this.field3326 && var4 <= this.field3336) {
            Iterator var5 = this.field3338.iterator();

            class309 var6;
            do {
               if (!var5.hasNext()) {
                  return false;
               }

               var6 = (class309)var5.next();
            } while(!var6.vmethod6896(var1, var2));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IIIB)[I",
      garbageValue = "25"
   )
   public int[] method6424(int var1, int var2, int var3) {
      Iterator var4 = this.field3338.iterator();

      class309 var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (class309)var4.next();
      } while(!var5.vmethod6897(var1, var2, var3));

      return var5.vmethod6899(var1, var2, var3);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(III)Lna;",
      garbageValue = "1881155856"
   )
   public class356 method6425(int var1, int var2) {
      Iterator var3 = this.field3338.iterator();

      class309 var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (class309)var3.next();
      } while(!var4.vmethod6896(var1, var2));

      return var4.vmethod6898(var1, var2);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1997876744"
   )
   void method6419() {
      Iterator var1 = this.field3338.iterator();

      while(var1.hasNext()) {
         class309 var2 = (class309)var1.next();
         var2.vmethod6913(this);
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "746994103"
   )
   public int method6438() {
      return this.field3327;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2077580040"
   )
   public boolean method6428() {
      return this.field3328;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "2005093727"
   )
   public String method6429() {
      return this.field3334;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-2008599195"
   )
   public String method6430() {
      return this.field3333;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "151"
   )
   int method6421() {
      return this.field3329;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1799851290"
   )
   int method6431() {
      return this.field3330;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2029327651"
   )
   public int method6432() {
      return this.field3331;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1247089458"
   )
   public int method6433() {
      return this.field3337;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "76"
   )
   public int method6455() {
      return this.field3335;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1403990632"
   )
   public int method6435() {
      return this.field3326;
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "111"
   )
   public int method6436() {
      return this.field3336;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1908017815"
   )
   public int method6482() {
      return this.field3332.field4026;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "610421929"
   )
   public int method6439() {
      return this.field3332.field4027;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1878979757"
   )
   public int method6497() {
      return this.field3332.field4025;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)Lna;",
      garbageValue = "115"
   )
   public class356 method6440() {
      return new class356(this.field3332);
   }
}
