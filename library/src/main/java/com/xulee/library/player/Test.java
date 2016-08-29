package com.xulee.library.player;

/**
 * Created by LX on 2016/8/23.
 */
public class Test {
    public static void main(String[] args) {
        String p1 = "#EXT-X-STREAM-INF:PROGRAM-ID=1, BANDWIDTH=524000";
        String p2 = "#EXT-X-STREAM-INF:PROGRAM-ID=1, BANDWIDTH=64000";

        String content = "#EXTM3U #EXT-X-STREAM-INF:PROGRAM-ID=1, BANDWIDTH=524000 http://videofile2.cutv.com/mg/010062_t/2016/08/17/G15/G15fgfflhgjmgiojfjh04r_cug.mp4.m3u8 #EXT-X-STREAM-INF:PROGRAM-ID=1, BANDWIDTH=64000 http://videofile2.cutv.com/mg/010062_t/2016/08/17/G15/G15fgfflhgjmgiojfjh04r_cua.mp4.m3u8";
        int index1 = content.indexOf(p1);
        int index2 = content.indexOf(p2);
        content = content.substring((index1 + p1.length()), index2).trim();
        System.out.print(content);
    }

}
