package cn.ifengkou.boot;

import cn.ifengkou.spi.Pusher;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

/**
 * @author shenlongguang<https://github.com/ifengkou>
 * @date: 2020/10/27
 */
@Configuration
@ConditionalOnClass(Pusher.class)
public class PusherConfiguration {
    @Bean
    public Pusher getPusher() {
        List<Pusher> pushers = SpringFactoriesLoader.loadFactories(Pusher.class, null);
        if (pushers != null && pushers.size() > 0) {
            return pushers.get(0);
        }
        return null;
    }
}
