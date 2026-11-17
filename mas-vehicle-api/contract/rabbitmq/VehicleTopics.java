package pl.es8it.mas.contract.vehicle;

public final class VehicleTopics {

    public static final String EXCHANGE = "amq.topic";

    public static final String IGNITION_REQUEST_ROUTING_KEY = "vehicle.ignition.request";
    public static final String IGNITION_RESPONSE_ROUTING_KEY = "vehicle.ignition.response";
    public static final String IGNITION_RESPONSE_QUEUE = "mas.vehicle.ignition.response";

    private VehicleTopics() {
    }
}
