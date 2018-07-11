package za.co.tman.integration.service.messaging;

public interface IMMessageProcessor {
    
    void processMessageReceived(InterModulePubSubMessage interModulePubSubMessage);

}
