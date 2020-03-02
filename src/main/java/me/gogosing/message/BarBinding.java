package me.gogosing.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by JinBum Jeong on 2020/03/02.
 */
public interface BarBinding {

    String Subscribe = "barInput";

    String Publish = "barOutput";

    /**
     * 다른 서비스의 output 메시지를 listen.
     */
    @Input(Subscribe)
    SubscribableChannel subscribe();

    /**
     * 다른 서비스에 메시지 발신.
     */
    @Output(Publish)
    MessageChannel publish();
}
