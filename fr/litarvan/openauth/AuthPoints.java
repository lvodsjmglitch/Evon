package fr.litarvan.openauth;

public class AuthPoints {
   public static final AuthPoints NORMAL_AUTH_POINTS = new AuthPoints("authenticate", "refresh", "validate", "signout", "invalidate");
   private String authenticatePoint;
   private String refreshPoint;
   private String validatePoint;
   private String signoutPoint;
   private String invalidatePoint;

   public AuthPoints(String authenticatePoint, String refreshPoint, String validatePoint, String signoutPoint, String invalidatePoint) {
      this.authenticatePoint = var1;
      this.refreshPoint = var2;
      this.validatePoint = var3;
      this.signoutPoint = var4;
      this.invalidatePoint = var5;
   }

   public String getAuthenticatePoint() {
      return this.authenticatePoint;
   }

   public String getRefreshPoint() {
      return this.refreshPoint;
   }

   public String getValidatePoint() {
      return this.validatePoint;
   }

   public String getSignoutPoint() {
      return this.signoutPoint;
   }

   public String getInvalidatePoint() {
      return this.invalidatePoint;
   }
}
