package com.example.myapplication.Service;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * author: xpf
 * date: 2020/1/3 10:51
 * description: udp协议通信服务端
 */
public class UdpServer {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket 指定一个端口
        DatagramSocket datagramSocket = new DatagramSocket(12307);
        byte[] bytes = new byte[1024];
        //消息数据包
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);

        datagramSocket.receive(datagramPacket);

        System.out.println("接收到的数据：" + new String(datagramPacket.getData()));
    }

}
