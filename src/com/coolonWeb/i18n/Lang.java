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

package com.coolonWeb.i18n;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coolonWeb.beans.Config;
import com.coolonWeb.util.HttpCookie;

public class Lang {

	private Config config;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
    public static final String LANG_COOKIE = "prefLang";
	
	public Lang(Config config, HttpServletRequest request, HttpServletResponse response) {
		this.config = config;
		this.request = request;
		this.response = response;
	}
	
	public void initialize() {
        String lang;
        HttpCookie cookie = new HttpCookie(config, request, response);
        String acceptLang = request.getHeader("Accept-Language");
        String requestLang = request.getParameter("l");
        
        if(requestLang != null && requestLang.length() == 2)
        {   // Set language in the Get Query
        	lang = requestLang;
            cookie.set(LANG_COOKIE, lang);
        } 
        else if(cookie.get(LANG_COOKIE) != null) 
        {   // Set language in the Cookie
        	lang = cookie.get(LANG_COOKIE);
        }
        else if(acceptLang != null && acceptLang.indexOf(",") > 0) 
        {   // Set language in the Web Browser
        	lang = acceptLang.substring(0, 2).trim();
            cookie.set(LANG_COOKIE, lang);
        }
        else 
        {   // Get Default Language
        	lang = config.getDefLang(); // Default Language
        }
        
        config.setDefLang(lang); // Set the new language

        Text.getCurrentInstance(request).setLocale(new Locale(lang));
	}
	
}
