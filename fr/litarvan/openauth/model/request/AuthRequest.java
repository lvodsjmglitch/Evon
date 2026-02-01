package fr.litarvan.openauth.model.request;

import fr.litarvan.openauth.model.AuthAgent;

public class AuthRequest {
   private AuthAgent agent;
   private String username;
   private String password;
   private String clientToken;

   public AuthRequest(AuthAgent agent, String username, String password, String clientToken) {
      this.agent = var1;
      this.username = var2;
      this.password = var3;
      this.clientToken = var4;
   }

   public void setAgent(AuthAgent agent) {
      this.agent = var1;
   }

   public AuthAgent getAgent() {
      return this.agent;
   }

   public void setUsername(String username) {
      this.username = var1;
   }

   public String getUsername() {
      return this.username;
   }

   public void setPassword(String password) {
      this.password = var1;
   }

   public String getPassword() {
      return this.password;
   }

   public void setClientToken(String clientToken) {
      this.clientToken = var1;
   }

   public String getClientToken() {
      return this.clientToken;
   }
}
