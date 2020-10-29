package cn.ifengkou.spi.provider;

import cn.ifengkou.spi.Pusher;

/**
 * @author shenlongguang<https://github.com/ifengkou>
 * @date: 2020/9/16
 */
public class XiaoMiPusher implements Pusher {

    @Override
    public int push(String[] mobiles, String msg) {
        System.out.println("小米推送，推送消息:"+msg);
        //TODO 实现小米推送的逻辑
        return mobiles.length;
    }
}
