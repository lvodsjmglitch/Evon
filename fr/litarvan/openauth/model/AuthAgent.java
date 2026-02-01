package fr.litarvan.openauth.model;

public class AuthAgent {
   public static final AuthAgent MINECRAFT = new AuthAgent("Minecraft", 1);
   public static final AuthAgent SCROLLS = new AuthAgent("Scrolls", 1);
   private String name;
   private int version;

   public AuthAgent(String name, int version) {
      this.name = var1;
      this.version = var2;
   }

   public void setName(String name) {
      this.name = var1;
   }

   public String getName() {
      return this.name;
   }

   public void setVersion(int version) {
      this.version = var1;
   }

   public int getVersion() {
      return this.version;
   }
}
