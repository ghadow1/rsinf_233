package game;

import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
public class class438 implements Iterable, Collection {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Luk;"
   )
   class544 field5127 = new class544();
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Luk;"
   )
   class544 field5128;

   public class438() {
      this.field5127.field5599 = this.field5127;
      this.field5127.field5598 = this.field5127;
   }

   @ObfuscatedName("aw")
   public void method8738() {
      while(this.field5127.field5599 != this.field5127) {
         this.field5127.field5599.vmethod10557();
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Luk;)V"
   )
   public void method8749(class544 var1) {
      if (var1.field5598 != null) {
         var1.vmethod10557();
      }

      var1.field5598 = this.field5127.field5598;
      var1.field5599 = this.field5127;
      var1.field5598.field5599 = var1;
      var1.field5599.field5598 = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Luk;)V"
   )
   public void method8739(class544 var1) {
      if (var1.field5598 != null) {
         var1.vmethod10557();
      }

      var1.field5598 = this.field5127;
      var1.field5599 = this.field5127.field5599;
      var1.field5598.field5599 = var1;
      var1.field5599.field5598 = var1;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "()Luk;"
   )
   public class544 method8748() {
      return this.method8773((class544)null);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(Luk;)Luk;"
   )
   class544 method8773(class544 var1) {
      class544 var2;
      if (var1 == null) {
         var2 = this.field5127.field5599;
      } else {
         var2 = var1;
      }

      if (var2 == this.field5127) {
         this.field5128 = null;
         return null;
      } else {
         this.field5128 = var2.field5599;
         return var2;
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "()Luk;"
   )
   public class544 method8762() {
      class544 var1 = this.field5128;
      if (var1 == this.field5127) {
         this.field5128 = null;
         return null;
      } else {
         this.field5128 = var1.field5599;
         return var1;
      }
   }

   @ObfuscatedName("as")
   int method8754() {
      int var1 = 0;

      for(class544 var2 = this.field5127.field5599; var2 != this.field5127; var2 = var2.field5599) {
         ++var1;
      }

      return var1;
   }

   @ObfuscatedName("al")
   public boolean method8743() {
      return this.field5127.field5599 == this.field5127;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "()[Luk;"
   )
   class544[] method8744() {
      class544[] var1 = new class544[this.method8754()];
      int var2 = 0;

      for(class544 var3 = this.field5127.field5599; var3 != this.field5127; var3 = var3.field5599) {
         var1[var2++] = var3;
      }

      return var1;
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Luk;)Z"
   )
   boolean method8752(class544 var1) {
      this.method8749(var1);
      return true;
   }

   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean isEmpty() {
      return this.method8743();
   }

   public Iterator iterator() {
      return new class437(this);
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(class544 var3 = this.field5127.field5599; var3 != this.field5127; var3 = var3.field5599) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int size() {
      return this.method8754();
   }

   public boolean add(Object var1) {
      return this.method8752((class544)var1);
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public void clear() {
      this.method8738();
   }

   public Object[] toArray() {
      return this.method8744();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Luk;Luk;)V"
   )
   public static void method8737(class544 var0, class544 var1) {
      if (var0.field5598 != null) {
         var0.vmethod10557();
      }

      var0.field5598 = var1;
      var0.field5599 = var1.field5599;
      var0.field5598.field5599 = var0;
      var0.field5599.field5598 = var0;
   }
}
