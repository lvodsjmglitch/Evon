package club.evon;

public final class MovementEvent extends Event {
   private double x;
   private double y;
   private double z;
   private float yaw;
   private float pitch;
   private float prevYaw;
   private float prevPitch;
   private boolean onGround;

   public double getX() {
      return this.x;
   }

   public double getY() {
      return this.y;
   }

   public double getZ() {
      return this.z;
   }

   public float getYaw() {
      return this.yaw;
   }

   public float getPitch() {
      return this.pitch;
   }

   public float getPrevYaw() {
      return this.prevYaw;
   }

   public float getPrevPitch() {
      return this.prevPitch;
   }

   public boolean isOnGround() {
      return this.onGround;
   }

   public void setX(double x) {
      this.x = x;
   }

   public void setY(double y) {
      this.y = y;
   }

   public void setZ(double z) {
      this.z = z;
   }

   public void setYaw(float yaw) {
      this.yaw = yaw;
   }

   public void setPitch(float pitch) {
      this.pitch = pitch;
   }

   public void setPrevYaw(float prevYaw) {
      this.prevYaw = prevYaw;
   }

   public void setPrevPitch(float prevPitch) {
      this.prevPitch = prevPitch;
   }

   public void setOnGround(boolean onGround) {
      this.onGround = onGround;
   }

   public MovementEvent(double x, double y, double z, float yaw, float pitch, float prevYaw, float prevPitch, boolean onGround) {
      this.x = x;
      this.y = y;
      this.z = z;
      this.yaw = yaw;
      this.pitch = pitch;
      this.prevYaw = prevYaw;
      this.prevPitch = prevPitch;
      this.onGround = onGround;
   }
}
