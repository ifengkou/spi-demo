package cn.ifengkou.spi;

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
    int push(String[] mobiles, String msg);
}
