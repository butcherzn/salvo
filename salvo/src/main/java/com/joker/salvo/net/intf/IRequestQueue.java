package com.joker.salvo.net.intf;

/**
 * Created by joker on 2017/6/23.
 */

public interface IRequestQueue {

    /**
     * 开启队列
     * @return
     */
    boolean start();

    /**
     * 销毁
     * @return
     */
    boolean stop();




}
