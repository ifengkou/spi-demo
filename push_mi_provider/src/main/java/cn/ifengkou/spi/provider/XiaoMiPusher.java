package cn.ifengkou.spi.provider;

import cn.ifengkou.spi.Pusher;

import java.util.List;

/**
 * @author shenlongguang<https://github.com/ifengkou>
 * @date: 2020/9/16
 */
public class XiaoMiPusher implements Pusher {

    public int push(List<String> mobiles, String msg) {
        System.out.println("小米推送，推送消息:"+msg);
        //TODO 实现小米推送的逻辑
        return mobiles.size();
    }
}
