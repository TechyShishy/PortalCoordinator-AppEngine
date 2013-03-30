package com.shishire.portalcoordinator.appengine;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class PortalCoordinator_AppEngineServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("application/json");
		resp.getWriter().println("{ \"Shishire\" : [ { \"portal-name\" : \"Cooper's Tavern\", \"deploy-octant\" : \"NE\" }, { \"portal-name\" : \"Reagent Theater\", \"deploy-octant\" : \"SW\" }  ] }");
	}
}
