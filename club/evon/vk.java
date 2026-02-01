package club.evon;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.Proxy.Type;
import java.util.List;

class vk extends ProxySelector {
   final String f;
   final int z;

   vk(Ja var1, String var2, int var3) {
      this.f = var2;
      this.z = var3;
   }

   public List<Proxy> select(URI uri) {
      return List.of(new Proxy(Type.HTTP, new InetSocketAddress(this.f, this.z)));
   }

   public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
      var3.printStackTrace();
   }
}
