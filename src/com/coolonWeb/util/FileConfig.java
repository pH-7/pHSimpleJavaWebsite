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

import com.coolonWeb.beans.Config;

public class FileConfig {
	
	private String file;
	
	public FileConfig(String file) {
		this.file = file;
	}

    public Config run() {
        
    	XmlFile xml = new XmlFile(file);
        Config config = new Config();

        boolean rewriteUrl = Boolean.parseBoolean(xml.getTagValue("url", "rewrite"));
        int cookieExpiration = Integer.parseInt(xml.getTagValue("cookie", "expiration"));

        config.setDefMainPage(xml.getTagValue("app", "def-main-page"));
        config.setNotFoundPage(xml.getTagValue("app", "not-found-page"));
        config.setDefLang(xml.getTagValue("app", "def-lang"));
        config.setViewDir(xml.getTagValue("app", "view-dir"));
        config.setThemeName(xml.getTagValue("app", "theme-name"));
        config.setAnalyticsId(xml.getTagValue("app", "analytics-id"));
        config.setContactEmail(xml.getTagValue("email", "contact-address"));
        config.setPath(xml.getTagValue("path", "public-root"));
        config.setSiteUrl(xml.getTagValue("url", "site"));
        config.setStaticUrl(xml.getTagValue("url", "static"));
        config.setCookiePath(xml.getTagValue("cookie", "path"));
        config.setCookiePrefix(xml.getTagValue("cookie", "prefix"));
        config.setCookieExpiration(cookieExpiration);
        config.setRewriteUrl(rewriteUrl);

        /**
         * Default value, it can be defined in the jsp page
         */
        config.setSiteName(xml.getTagValue("site", "name"));
        config.setPageTitle(xml.getTagValue("site", "title"));
        config.setMetaDescription(xml.getTagValue("site", "meta-description"));
        config.setMetaKeywords(xml.getTagValue("site", "meta-keywords"));

        return config;
    }

}