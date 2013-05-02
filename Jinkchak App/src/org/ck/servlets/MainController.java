package org.ck.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ck.gui.Constants;

/**
 * Servlet implementation class MainController
 * This is the main controller that gets requests from JSP pages, generates results through beans 
 * 		and forwards them to other jsp pages
 */
@WebServlet("/MainController")
public class MainController extends HttpServlet implements Constants
{
	private static final long serialVersionUID = 1L;
	
	private Logger log = Logger.getLogger(MainController.class.getName());
       
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{				
		//runAlgorithm(tsBean, request, response);
		
		
		//If control comes here, that means no forwarding took place
		response.getWriter().println("NOT FORWARDED");
	}
//
//	/**
//	 * Categorizes tsBean based on Task
//	 * @param tsBean
//	 * @param response 
//	 * @param request 
//	 * @throws IOException 
//	 * @throws ServletException 
//	 */
//	private void runAlgorithm(TimeSeriesBean tsBean, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
//	{
//		String address = "";
//		
//		switch(tsBean.getTaskType())
//		{
//		case SIMILARITY:
//			address = runSimilarityAlgorithm(tsBean);			
//			break;
//		case FORTUNE_TELLER:
//			address = runFortuneTellingAlgorithm(tsBean);
//			break;
//		case ANOMALY_DETECTIVE:			
//			address = runAnomalyDetectorAlgorithm(tsBean,Double.parseDouble(request.getParameter("anomalyThreshold")));
//			break;
//		case TEMPORAL_PATTERN_MINER:
//			address = runTemporalMinerAlgorithm(tsBean);
//			break;
//		default:
//			//Forward to errorPage.jsp ---- to be created
//			address = PATH_PREFIX + "../error_page.jsp";
//		}
//		
//		request.getSession().setAttribute("tsBean", tsBean);
//		
//		if(!address.isEmpty())
//		{
//			RequestDispatcher dispatcher = request.getRequestDispatcher(address);
//			dispatcher.forward(request, response);
//		}
//	}
}
