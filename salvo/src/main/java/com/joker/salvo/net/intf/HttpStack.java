package com.joker.salvo.net.intf;

import com.joker.salvo.net.error.SalvoError;
import com.joker.salvo.net.response.HttpResponse;

import java.util.Map;

/**
 * Http
 *
 * Created by joker on 2017/6/23.
 */

public interface HttpStack {


    /**
     *
     * @param request
     * @param additionalHeaders
     * @return
     * @throws SalvoError
     */
    HttpResponse performRequest(Request<?> request, Map<String, String> additionalHeaders) throws SalvoError;


}
