package org.lili.structural.proxy.ex3.statics;

import java.util.Scanner;

/**
 * Created by lili on 2017/7/14.
 */
public class ProxyDemo {
    public static void main( String[] args ) {
        // 3. The client deals with the wrapper
        SocketInterface socket = new SocketProxy( "127.0.0.1",
                8081,
                args[0].equals("first") ? true : false );
        String  str;
        boolean skip = true;
        while (true) {
            if (args[0].equals("second") && skip) {
                skip = !skip;
            } else {
                // 代理方法
                str = socket.readLine();
                System.out.println("Receive - " + str);
                if (str.equals(null)) {
                    break;
                }
            }
            System.out.print( "Send ---- " );
            str = new Scanner(System.in).nextLine();
            // 代理方法
            socket.writeLine( str );
            if (str.equals("quit")) {
                break;
            }
        }
        // 代理方法
        socket.dispose();
    }
}