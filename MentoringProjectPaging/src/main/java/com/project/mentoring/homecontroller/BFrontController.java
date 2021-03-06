package com.project.mentoring.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.mentoring.command.BCommand;
import com.project.mentoring.command.BContentCommand;
import com.project.mentoring.command.BDeleteCommand;
import com.project.mentoring.command.BListCommand;
import com.project.mentoring.command.BModifyCommand;
import com.project.mentoring.command.BWriteCommand;




@WebServlet("*.do")
public class BFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BFrontController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		actionDo(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
		actionDo(request,response);
	}

	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("actionDo()");
		
		request.setCharacterEncoding("UTF-8");
		
		String uri=request.getRequestURI();
		String conPath=request.getContextPath();
		String com=uri.substring(conPath.length());
		
		String viewPage=null;
		BCommand command=null;
		
		switch(com) {
			case("/list.do"):
				command=new BListCommand();
				command.execute(request, response);
				viewPage="list.jsp";
				break;
			case("/write_view.do"):
				viewPage="write_view.jsp";
				break;
			case("/write.do"):
				System.out.println("작성 들어옴");
				command=new BWriteCommand();
				command.execute(request, response);
				viewPage="list.do";
				break;
			case("/content_view.do"):
				command=new BContentCommand();
				command.execute(request, response);
				viewPage="content_view.jsp";
				break;
			case("/modify.do"):
				System.out.println("수정 들어옴");
				command=new BModifyCommand();
				command.execute(request, response);
				viewPage="list.do";
				break;
			case("/delete.do"):
				command=new BDeleteCommand();
				command.execute(request, response);
				viewPage="list.do";
				break;
		}
		
		RequestDispatcher dispatcher=request.getRequestDispatcher(viewPage);
		dispatcher.forward(request,response);
	}
}
