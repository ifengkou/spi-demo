package cn.ifengkou.spi.invoker;

/**
 * @author shenlongguang<https://github.com/ifengkou>
 * @date: 2020/9/16
 */
public class MainApp {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new String[]{"1890000000"},"你好 Spi");
        invoker.push();
    }
}
