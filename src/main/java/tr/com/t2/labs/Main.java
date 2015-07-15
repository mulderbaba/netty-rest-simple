package tr.com.t2.labs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tr.com.t2.labs.netty.NettyServer;

/**
 * Created by mertcaliskan
 * on 27/03/15.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext spring = new AnnotationConfigApplicationContext(Config.class);
        NettyServer nettyServer = spring.getBean(NettyServer.class);
        nettyServer.start();
    }
}