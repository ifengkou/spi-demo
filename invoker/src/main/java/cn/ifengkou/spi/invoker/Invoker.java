package cn.ifengkou.spi.invoker;

import cn.ifengkou.spi.Pusher;

import java.util.ServiceLoader;

/**
 * @author shenlongguang<https://github.com/ifengkou>
 * @date: 2020/9/18
 */
public class Invoker {
    private String[] mobiles;
    private String msg;

    public void push(){
        ServiceLoader<Pusher> printerLoader = ServiceLoader.load(Pusher.class);
        for (Pusher pusher : printerLoader) {
            pusher.push(mobiles, msg);
            /*String className = pusher.getClass().getName();
            System.out.println(className);
            if(className.equals("cn.ifengkou.spi.provider.JiguangPusher")) {
                pusher.push(mobiles, msg);
            }*/
        }
    }

    public Invoker(String[] mobiles, String msg) {
        this.mobiles = mobiles;
        this.msg = msg;
    }
}
