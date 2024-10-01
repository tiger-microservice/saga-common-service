package vn.tiger.sagacommon.config;

import org.axonframework.serialization.Serializer;
import org.axonframework.serialization.xml.XStreamSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.thoughtworks.xstream.XStream;

@Configuration
public class SagaCommonConfig {

    @Bean
    @Primary
    public Serializer serializer() {
        XStream xStream = new XStream();
        // Thiết lập bảo mật mặc định
        XStream.setupDefaultSecurity(xStream);
        // Cho phép các lớp cần thiết
        xStream.allowTypesByWildcard(new String[] {
            "vn.tiger.**", "com.tiger.**",
        });
        return XStreamSerializer.builder().xStream(xStream).build();
    }
}
