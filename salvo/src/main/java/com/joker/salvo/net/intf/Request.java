package com.joker.salvo.net.intf;

import com.joker.salvo.net.error.SalvoError;

import java.util.Map;

/**
 * Request
 * Created by joker on 2017/6/23.
 */

public interface Request<T> extends Comparable<Request<T>> {


    interface Method {
        int GET = 0;
        int POST = 1;
    }


    /**
     *
     * @return
     * @throws SalvoError
     */
    Map<String, String> getHeaders() throws SalvoError;


    /**
     *
     * @return
     * @throws SalvoError
     */
    byte[] getBody() throws SalvoError;


    /**
     * <p>
     *
     *
     * </p>
     */
    void cancel();


    /**
     * <p>
     *
     *
     * </p>
     * @return
     */
    boolean isCanceled();


    /**
     *
     * @return
     */
    String getBodyContentType();


    /**
     *
     * @param tag
     * @return
     */
    Request<?> setTag(Object tag);

    /**
     *
     * @return
     */
    Object getTag();


    /**
     *
     * @param tag
     */
    void finish(Object tag);






}
