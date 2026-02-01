package club.evon.launch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Loader {
   public static native void attachNatives(int var0, Class<?> var1);

   static {
      String osName = System.getProperty("os.name").toLowerCase();
      String libFileName = "/club/evon/launch/";
      if (!osName.contains("nix") && !osName.contains("nux") && !osName.contains("aix")) {
         if (osName.contains("win")) {
            libFileName = libFileName + "x64-windows.dll";
         } else {
            if (!osName.contains("mac")) {
               throw new UnsupportedOperationException("Operating system not supported");
            }

            libFileName = libFileName + "natives.dylib";
         }
      } else {
         libFileName = libFileName + "x64-linux.so";
      }

      File libFile;
      try {
         libFile = File.createTempFile("lib", (String)null);
         libFile.deleteOnExit();
         if (!libFile.exists()) {
            throw new IOException();
         }
      } catch (IOException var13) {
         throw new UnsatisfiedLinkError("Failed to create temp file");
      }

      byte[] arrayOfByte = new byte[2048];

      try {
         InputStream inputStream = Loader.class.getResourceAsStream(libFileName);
         if (inputStream == null) {
            throw new UnsatisfiedLinkError(String.format("Failed to open lib file: %s", libFileName));
         }

         try {
            FileOutputStream fileOutputStream = new FileOutputStream(libFile);

            try {
               int size;
               while((size = inputStream.read(arrayOfByte)) != -1) {
                  fileOutputStream.write(arrayOfByte, 0, size);
               }

               fileOutputStream.close();
            } catch (Throwable var10) {
               try {
                  fileOutputStream.close();
               } catch (Throwable var9) {
                  var10.addSuppressed(var9);
               }

               throw var10;
            }

            inputStream.close();
         } catch (Throwable var11) {
            try {
               inputStream.close();
            } catch (Throwable var8) {
               var11.addSuppressed(var8);
            }

            throw var11;
         }
      } catch (IOException var12) {
         throw new UnsatisfiedLinkError(String.format("Failed to copy file: %s", var12.getMessage()));
      }

      System.load(libFile.getAbsolutePath());
   }
}
