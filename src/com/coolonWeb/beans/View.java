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

import java.util.Date;
import java.text.SimpleDateFormat;

import com.coolonWeb.beans.Config;

public class View {
	
	private Config config;
	private String msg, currentLink;
	
	public View(Config config) {
		this.config = config;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void setCurrentLink(String currentLink) {
		this.currentLink = currentLink;
	}
	
	public String getMsg() {
		return this.msg;
	}
	
	public String getCurrentLink() {
		return this.currentLink;
	}
	
	public String getLangLink() {
		if(this.currentLink.indexOf("l=") > -1) {
			String langSlug = (this.currentLink.indexOf("?l=") > -1) ? "?l=" : "&l=";
			this.currentLink = this.currentLink.replace(langSlug + config.getDefLang(), "");
		}
		
		String slug = (this.currentLink.indexOf("?") > -1) ? "&" : "?";
		
		return this.currentLink + slug;
	}
	
	public String getYear() {
    	Date date = new Date();
    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
    	return dateFormat.format(date);	
    }

}
