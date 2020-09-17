package cn.ifengkou.spi;

import java.util.List;

/**
 * @author shenlongguang<https://github.com/ifengkou>
 * @date: 2020/9/16
 */
public interface Pusher {

    /**
     * 向 mobiles 推送 msg 消息
     * @param mobiles
     * @param msg
     * @return
     */
    int push(List<String> mobiles, String msg);
}
