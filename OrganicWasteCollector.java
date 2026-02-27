public class OrganicWasteCollector implements WasteHandler {
    private WasteHandler nextHandler;

    @Override
    public void setNextHandler(WasteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("organic")) {
            System.out.println("OrganicWasteCollector: Collecting and composting organic waste. "
                + "Container capacity: " + container.getCapacity() + "%");
        } else {
            if (nextHandler != null) {
                nextHandler.handle(container);
            } else {
                System.out.println("No handler found for waste type: " + container.getType());
            }
        }
    }
}