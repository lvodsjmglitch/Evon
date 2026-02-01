package club.evon.mixins;

import club.evon.C;
import club.evon.JC;
import club.evon.JD;
import club.evon.Jl;
import club.evon.v3;
import club.evon.vG;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import net.minecraft.class_2535;
import net.minecraft.class_2547;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2598;
import net.minecraft.class_2987;
import net.minecraft.class_8042;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_2535.class})
public abstract class ClientConnectionMixin implements JC {
   @Shadow
   @Nullable
   private volatile class_2547 field_11652;
   @Shadow
   @Final
   private static Logger field_11642;
   @Shadow
   private int field_11658;
   @Shadow
   public Channel field_11651;
   private static final String[] a;

   @Shadow
   private static <T extends class_2547> void method_10759(class_2596<T> var0, class_2547 var1) {
   }

   @Shadow
   public abstract void method_10747(class_2561 var1);

   @Shadow
   protected abstract void method_10770(ChannelHandlerContext var1, class_2596<?> var2);

   @Shadow
   public abstract class_2598 method_36121();

   private ClientConnectionMixin() {
   }

   @Inject(
      method = {"<init>(Lnet/minecraft/class_2598;)V"},
      at = {@At("TAIL")}
   )
   private void init(class_2598 var1, CallbackInfo var2) {
      Jl.h().o();
      JD.M().o();
   }

   @Inject(
      method = {"method_10743(Lnet/minecraft/class_2596;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hookSendPacket(class_2596<?> param1, CallbackInfo param2) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_10752(Lnet/minecraft/class_2596;Lio/netty/channel/ChannelFutureListener;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hookSendPacket(class_2596<?> var1, @Nullable ChannelFutureListener var2, CallbackInfo var3) {
      vG var4 = new vG(var1);

      try {
         C.Z(var4);
         if (var4.e()) {
            var3.cancel();
         }

      } catch (class_2987 var5) {
         throw a(var5);
      }
   }

   @Inject(
      method = {"method_10759(Lnet/minecraft/class_2596;Lnet/minecraft/class_2547;)V"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1
   )
   private static void hookReceivePacket(class_2596<?> var0, class_2547 var1, CallbackInfo var2) {
      if (!(var0 instanceof class_8042)) {
         v3 var9 = new v3(var0);

         try {
            C.Z(var9);
            if (var9.e()) {
               var2.cancel();
            }

         } catch (class_2987 var8) {
            throw a(var8);
         }
      } else {
         class_8042 var3 = (class_8042)var0;
         var2.cancel();
         Iterator var4 = var3.method_48324().iterator();

         while(var4.hasNext()) {
            class_2596 var5 = (class_2596)var4.next();

            try {
               method_10759(var5, var1);
            } catch (class_2987 var7) {
            }
         }

      }
   }

   @Inject(
      method = {"method_10770(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/class_2596;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lio/netty/channel/Channel;isOpen()Z",
   remap = false
)},
      cancellable = true
   )
   private void hookChannelRead(ChannelHandlerContext param1, class_2596<?> param2, CallbackInfo param3) {
      // $FF: Couldn't be decompiled
   }

   @Unique
   public void evon$channelReadSilent(class_2596<?> packet) {
      if (this.field_11651.isOpen()) {
         class_2547 var2 = this.field_11652;

         try {
            if (var2 == null) {
               throw new IllegalStateException(a[2]);
            }
         } catch (class_2987 var5) {
            throw a(var5);
         }

         label38: {
            String[] var4;
            label37: {
               ClassCastException var3;
               try {
                  if (!var2.method_52413(var1)) {
                     return;
                  }

                  try {
                     method_10759(var1, var2);
                     break label38;
                  } catch (class_2987 var6) {
                     break label38;
                  } catch (RejectedExecutionException var7) {
                     break label37;
                  } catch (ClassCastException var8) {
                     var3 = var8;
                  }
               } catch (IllegalStateException var9) {
                  throw a(var9);
               }

               var4 = a;
               field_11642.error(var4[3], var1.getClass(), var3);
               this.method_10747(class_2561.method_43471(var4[0]));
               break label38;
            }

            var4 = a;
            this.method_10747(class_2561.method_43471(var4[1]));
         }

         ++this.field_11658;
      }

   }

   private static RuntimeException a(RuntimeException var0) {
      return var0;
   }

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "43D\u000e-\u000e\u00048?M\bj\u001a\u0001*%G\u0014*\u001b\u000b-hA\u00142\u001f\u00040\"w\n%\u001d\u0003<2&43D\u000e-\u000e\u00048?M\bj\u001a\u0001*%G\u0014*\u001b\u000b-h[\u001f6\b\r+\u0019[\u00121\n\f61F";
      int var4 = "43D\u000e-\u000e\u00048?M\bj\u001a\u0001*%G\u0014*\u001b\u000b-hA\u00142\u001f\u00040\"w\n%\u001d\u0003<2&43D\u000e-\u000e\u00048?M\bj\u001a\u0001*%G\u0014*\u001b\u000b-h[\u001f6\b\r+\u0019[\u00121\n\f61F".length();
      char var1 = '%';
      int var0 = -1;

      label55:
      while(true) {
         byte var10000 = 66;
         ++var0;
         String var10001 = var2.substring(var0, var0 + var1);
         byte var10002 = -1;

         while(true) {
            char[] var13;
            label50: {
               char[] var14 = var10001.toCharArray();
               int var10004 = var14.length;
               int var6 = 0;
               byte var17 = var10000;
               byte var16 = var10000;
               var13 = var14;
               int var10 = var10004;
               char[] var18;
               int var10006;
               if (var10004 <= 1) {
                  var18 = var14;
                  var10006 = var6;
               } else {
                  var16 = var10000;
                  var10 = var10004;
                  if (var10004 <= var6) {
                     break label50;
                  }

                  var18 = var14;
                  var10006 = var6;
               }

               while(true) {
                  char var27 = var18[var10006];
                  byte var28;
                  switch(var6 % 7) {
                  case 0:
                     var28 = 27;
                     break;
                  case 1:
                     var28 = 4;
                     break;
                  case 2:
                     var28 = 106;
                     break;
                  case 3:
                     var28 = 56;
                     break;
                  case 4:
                     var28 = 6;
                     break;
                  case 5:
                     var28 = 60;
                     break;
                  default:
                     var28 = 42;
                  }

                  var18[var10006] = (char)(var27 ^ var17 ^ var28);
                  ++var6;
                  if (var16 == 0) {
                     var10006 = var16;
                     var18 = var13;
                     var17 = var16;
                  } else {
                     if (var10 <= var6) {
                        break;
                     }

                     var18 = var13;
                     var17 = var16;
                     var10006 = var6;
                  }
               }
            }

            String var20 = (new String(var13)).intern();
            switch(var10002) {
            case 0:
               var5[var3++] = var20;
               if ((var0 += var1) >= var4) {
                  a = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            default:
               var5[var3++] = var20;
               if ((var0 += var1) < var4) {
                  var1 = var2.charAt(var0);
                  continue label55;
               }

               var2 = "1\u0019q%\u001727\u0007\\s`\u000e%1\b\u0019f`\u001c!4\f\u000ew`\n,7C\fs#\u0015!&C\u0010{3\n!<\u0006\u000e27\u001f7r\n\u0012{4\u0017%>\n\u0006w$&1\u0019q%\u001727\u0007\\i=^0:\u0002\b2#\u00111>\u0007\u001254^&7C\f`/\u001d!!\u0010\u0019v";
               var4 = "1\u0019q%\u001727\u0007\\s`\u000e%1\b\u0019f`\u001c!4\f\u000ew`\n,7C\fs#\u0015!&C\u0010{3\n!<\u0006\u000e27\u001f7r\n\u0012{4\u0017%>\n\u0006w$&1\u0019q%\u001727\u0007\\i=^0:\u0002\b2#\u00111>\u0007\u001254^&7C\f`/\u001d!!\u0010\u0019v".length();
               var1 = '<';
               var0 = -1;
            }

            var10000 = 120;
            ++var0;
            var10001 = var2.substring(var0, var0 + var1);
            var10002 = 0;
         }
      }
   }
}
