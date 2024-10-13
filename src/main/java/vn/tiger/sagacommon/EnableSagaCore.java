package vn.tiger.sagacommon;

import java.lang.annotation.*;

import org.springframework.context.annotation.Import;

@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({SagaCoreConfig.class})
public @interface EnableSagaCore {}
