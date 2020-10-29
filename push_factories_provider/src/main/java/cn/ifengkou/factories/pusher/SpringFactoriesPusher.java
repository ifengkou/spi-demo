package cn.ifengkou.factories.pusher;

import cn.ifengkou.spi.Pusher;

/**
 * @author shenlongguang<https://github.com/ifengkou>
 * @date: 2020/10/27
 */
//@Configuration
//@ConditionalOnClass(Pusher.class)
public class SpringFactoriesPusher implements Pusher {
    @Override
    public int push(String[] mobiles, String msg) {
        System.out.println("SpringFactories推送，推送消息:"+msg);
        return mobiles.length;
    }

    //@Bean
    //@ConditionalOnMissingBean
    public Pusher initPusher(){
        return new SpringFactoriesPusher();
    }
}
