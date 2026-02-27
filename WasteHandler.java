public interface WasteHandler {
    void setNextHandler(WasteHandler nextHandler);
    void handle(WasteContainer container);
}