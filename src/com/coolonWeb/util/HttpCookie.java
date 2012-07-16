/**
 *  Copyright 2012 by Pierre-Henry SORIA, All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.coolonWeb.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coolonWeb.beans.Config;

public class HttpCookie {
    
	private Config config;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	public HttpCookie(Config config, HttpServletRequest request, HttpServletResponse response) {
		this.config = config;
		this.request = request;
		this.response = response;
	}
	
	public String get(String name) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(config.getCookiePrefix() + name)) {
                    return cookie.getValue();
                }
            }
        }
        return null;
	}
	
	public void set(String name, String value) {
		final String DOMAIN_COOKIE = "." + request.getServerName().replace("www.", "");
		
        Cookie cookie = new Cookie(config.getCookiePrefix() + name, value);
        
        // Check if we are not in localhost mode, otherwise may not work.
        if(!Http.isLocalHost(request)) cookie.setDomain(DOMAIN_COOKIE);
        cookie.setPath(config.getCookiePath());
        cookie.setMaxAge(config.getCookieExpiration());
        response.addCookie(cookie);
	}
}
