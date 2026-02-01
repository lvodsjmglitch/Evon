package fr.litarvan.openauth.microsoft.model.response;

public class MinecraftStoreResponse {
   private final MinecraftStoreResponse$StoreProduct[] items;
   private final String signature;
   private final String keyId;

   public MinecraftStoreResponse(MinecraftStoreResponse$StoreProduct[] items, String signature, String keyId) {
      this.items = var1;
      this.signature = var2;
      this.keyId = var3;
   }

   public MinecraftStoreResponse$StoreProduct[] getItems() {
      return this.items;
   }

   public String getSignature() {
      return this.signature;
   }

   public String getKeyId() {
      return this.keyId;
   }
}
