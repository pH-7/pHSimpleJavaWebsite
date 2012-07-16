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

package com.coolonWeb.servlets;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coolonWeb.beans.Config;
import com.coolonWeb.beans.View;
import com.coolonWeb.i18n.Lang;
import com.coolonWeb.util.FileConfig;

public class PageRouter extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    public static final String VIEW_EXT = ".jsp";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Config config = new FileConfig(request.getSession().getServletContext().getRealPath("/WEB-INF/ph-config.xml")).run();
        
        /***** Language *****/
        new Lang(config, request, response).initialize();

        /***** View *****/
        View view = new View(config);
        String queryString = request.getQueryString();

        String queryUrl = (queryString != null) ? "?" + queryString : "";
        view.setCurrentLink(queryUrl);
        request.setAttribute("view", view);

        request.setAttribute("config", config);

        /***** Page *****/
        String page = request.getParameter("p");

        if (page == null) {
            page = config.getDefMainPage();
        }

        File file = new File(config.getPath() + config.getViewDir() + page + VIEW_EXT);

        if (!file.exists()) {
            // Set error message with 404 HTTP status
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            view.setMsg("Not Found Page: " + page);
            page = config.getNotFoundPage();
        }

        this.getServletContext().getRequestDispatcher(config.getViewDir() + page + VIEW_EXT).forward(request, response);
    }
}