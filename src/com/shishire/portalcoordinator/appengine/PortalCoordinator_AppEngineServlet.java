package com.shishire.portalcoordinator.appengine;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class PortalCoordinator_AppEngineServlet extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
