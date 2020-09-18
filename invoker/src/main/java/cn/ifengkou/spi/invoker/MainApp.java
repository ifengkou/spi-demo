package cn.ifengkou.spi.invoker;

import cn.ifengkou.spi.Pusher;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * @author shenlongguang<https://github.com/ifengkou>
 * @date: 2020/9/16
 */
public class MainApp {
    public static void main(String[] args) {
        List<String> mobiles = new ArrayList<>(1);
        mobiles.add("18900000000");
        String msg = "你好 Spi";

        Invoker invoker = new Invoker();
        invoker.setMobiles(mobiles);
        invoker.setMsg(msg);

        invoker.push();

    }
}
