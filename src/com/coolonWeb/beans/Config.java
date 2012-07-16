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

package com.coolonWeb.beans;

import java.security.InvalidParameterException;

public class Config {
    
	private String siteName, pageTitle, metaDescription, metaKeywords, defMainPage, notFoundPage, defLang, viewDir, themeName, siteUrl, staticUrl, path, contactEmail, analyticsId, cookiePath, cookiePrefix;
	private int cookieExpiration;
	private boolean rewrite;
	
	public void setSiteName(String name) {
		this.siteName = name;
	}
	
	public void setPageTitle(String title) {
		this.pageTitle = title;
	}
	
	public void setMetaDescription(String description) {
		this.metaDescription = description;
	}
	
	public void setMetaKeywords(String keywords) {
		this.metaKeywords = keywords;
	}
	
	public void setDefMainPage(String mainPage) {
		this.defMainPage = mainPage; 
	}
	
	public void setNotFoundPage(String notFoundPage) {
		this.notFoundPage = notFoundPage;
	}
	
	public void setDefLang(String lang) {
		if(lang.length() == 2)
		    this.defLang = lang;
		else
			throw new InvalidParameterException("The language code must contain two characters (e.g. en, it, es, ru , jp, fr, gr, de, ...).");
	}
	
	public void setViewDir(String dir) {
		this.viewDir = dir;
	}
	
	public void setThemeName(String theme) {
		this.themeName = theme;
	}
	
	public void setSiteUrl(String url) {
		this.siteUrl = url;
	}
	
	public void setStaticUrl(String url) {
		this.staticUrl = url;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public void setContactEmail(String email) {
		this.contactEmail = email;
	}
	
	public void setAnalyticsId(String analyticsId) {
		this.analyticsId = analyticsId;
	}
	
	public void setCookiePath(String path) {
		this.cookiePath = path;
	}
	
	public void setCookiePrefix(String prefix) {
		this.cookiePrefix = prefix;
	}
	
	public void setCookieExpiration(int expiration) {
		this.cookieExpiration = expiration;
	}
	
	public void setRewriteUrl(boolean rewrite) {
		this.rewrite = rewrite;
	}
	
	public String getSiteName() {
		return this.siteName;
	}
	
	public String getPageTitle() {
		return this.pageTitle;
	}
	
	public String getMetaDescription() {
		return this.metaDescription;
	}
	
	public String getMetaKeywords() {
		return this.metaKeywords;
	}
	
	public String getDefMainPage() {
		return this.defMainPage;
	}
	
	public String getNotFoundPage() {
		return this.notFoundPage;
	}
	
	public String getDefLang() {
		return this.defLang;
	}
	
	public String getViewDir() {
		return this.viewDir;
	}
	
	public String getThemeName() {
		return this.themeName;
	}
	
	public String getSiteUrl() {
		return this.siteUrl;
	}
	
	public String getStaticUrl() {
		return this.staticUrl;
	}
	
	public String getPath() {
		return this.path;
	}
	
	public String getContactEmail() {
		return this.contactEmail;
	}
	
	public String getAnalyticsId() {
		return this.analyticsId;
	}
	
	public String getCookiePath() {
		return this.cookiePath;
	}
	
	public String getCookiePrefix() {
		return this.cookiePrefix;
	}
	
	public int getCookieExpiration() {
		return this.cookieExpiration;
	}
	
	public String getRewriteUrl() {
		return (!this.rewrite) ? "?p=" : "";
	}
}