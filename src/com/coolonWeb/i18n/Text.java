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

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

public class Text extends ResourceBundle {

    private static final String TEXT_ATTRIBUTE_NAME = "bundle";
    private static final String TEXT_BASE_NAME = "com.coolonWeb.i18n.resources.text";

    private Text(Locale locale) {
        setLocale(locale);
    }

    public static void setFor(HttpServletRequest request) {
        if (request.getSession().getAttribute(TEXT_ATTRIBUTE_NAME) == null) {
            request.getSession().setAttribute(TEXT_ATTRIBUTE_NAME, new Text(request.getLocale()));
        }
    }

    public static Text getCurrentInstance(HttpServletRequest request) {
        return (Text) request.getSession().getAttribute(TEXT_ATTRIBUTE_NAME);
    }

    public void setLocale(Locale locale) {
        if (parent == null || !parent.getLocale().equals(locale)) {
            setParent(getBundle(TEXT_BASE_NAME, locale));
        }
    }    

    @Override
    public Enumeration<String> getKeys() {
        return parent.getKeys();
    }

    @Override
    protected Object handleGetObject(String key) {
        return parent.getObject(key);
    }

}