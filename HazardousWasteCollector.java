public class HazardousWasteCollector implements WasteHandler {
    private WasteHandler nextHandler;

    @Override
    public void setNextHandler(WasteHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("hazardous")) {
            System.out.println("HazardousWasteCollector: Safely disposing of hazardous waste. "
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