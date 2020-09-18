package cn.ifengkou.spi.invoker;

import cn.ifengkou.spi.Pusher;

import java.util.List;
import java.util.ServiceLoader;

/**
 * @author shenlongguang<https://github.com/ifengkou>
 * @date: 2020/9/18
 */
public class Invoker {
    private List<String> mobiles;
    private String msg;

    public int push(){
        ServiceLoader<Pusher> printerLoader = ServiceLoader.load(Pusher.class);
        for (Pusher pusher : printerLoader) {
            int cnt = pusher.push(mobiles, msg);
            return cnt;
            /*String className = pusher.getClass().getName();
            System.out.println(className);
            if(className.equals("cn.ifengkou.spi.provider.JiguangPusher")) {
                pusher.push(mobiles, msg);
            }*/
        }
        return 0;
    }

    public List<String> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<String> mobiles) {
        this.mobiles = mobiles;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
