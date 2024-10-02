package vn.tiger.sagacommon;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({SagaCoreConfig.class})
public @interface EnableSagaCore {}
