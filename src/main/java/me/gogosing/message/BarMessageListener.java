package me.gogosing.message;

import me.gogosing.model.message.BarMessage;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by JinBum Jeong on 2020/03/02.
 */
@Component
@EnableBinding(BarBinding.class)
public class BarMessageListener {

    private final BarBinding barBinding;

    public BarMessageListener(BarBinding barBinding) {
        this.barBinding = barBinding;
    }

    @StreamListener(target = BarBinding.Subscribe)
    public void getBarMessage(BarMessage message) {
        barBinding.publish()
            .send(
                MessageBuilder
                        .withPayload(new BarMessage(String.format("%s from bar", message.getContents())))
                        .build()
            );
    }
}
