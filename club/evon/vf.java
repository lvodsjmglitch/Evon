package club.evon;

public final class ChatMessageEvent extends Event {
   private final String message;

   public String getMessage() {
      return this.message;
   }

   public ChatMessageEvent(String message) {
      this.message = message;
   }
}
