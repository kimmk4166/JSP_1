package com.project.mentoring.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.mentoring.dao.BDao;
import com.project.mentoring.dto.BDto;



public class BListCommand implements BCommand {

	int numOfTuplesPerPage = 5;
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		int requestPage = 1;
		BDao dao=new BDao();
		HttpSession session = request.getSession();
		
		if ( request.getParameter("page") != null) {
			requestPage = Integer.parseInt(request.getParameter("page"));

			session.setAttribute("courrentPage", requestPage);
		}

		int countedTuple = dao.countTuple();

		ArrayList<Integer> pageList = calcNumOfPage(countedTuple);

		session.setAttribute("pageList", pageList);
		ArrayList<BDto> dtos = dao.list(requestPage, numOfTuplesPerPage);
		request.setAttribute("list", dtos);
	}

	public ArrayList<Integer> calcNumOfPage(int countedTuple) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int calcPage = 0;
		if (countedTuple % numOfTuplesPerPage == 0) {
			calcPage = countedTuple / numOfTuplesPerPage;
		} else {
			calcPage = countedTuple / numOfTuplesPerPage + 1;
		}
		
		for (int i = 1; i <= calcPage; i++) {
			System.out.println(i);
			arr.add(i);
		}
		return arr;
		
	}

}
