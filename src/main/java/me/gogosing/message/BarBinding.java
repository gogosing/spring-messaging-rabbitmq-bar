package me.gogosing.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by JinBum Jeong on 2020/03/02.
 */
public interface BarBinding {

    String Publish = "barOutput";

    String Subscribe = "barInput";

    /**
     * bar service 의 output 메시지를 listen.
     */
    @Input(Subscribe)
    SubscribableChannel subscribe();

    /**
     * bar service 에 메시지 발신.
     */
    @Output(Publish)
    MessageChannel publish();
}
