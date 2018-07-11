package za.co.tman.integration.service.messaging.googlepubsub;

import java.util.List;

import za.co.tman.integration.enums.PubSubMessageType;
import za.co.tman.integration.service.messaging.InterModulePubSubMessage;


public interface GooglePubSubHandler {

    void subscribeToSubscription(String subscriptionName);
    void publishMessage(InterModulePubSubMessage interModulePubSubMessage);
    List<String> getTargetTopicNames(PubSubMessageType pubSubMessageType);
    List<String> getSubscriptionsForModule();
}