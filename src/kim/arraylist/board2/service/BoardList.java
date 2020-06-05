package kim.arraylist.board2.service;

import java.util.Scanner;

import kim.arraylist.board2.control.BoardAction;
import kim.arraylist.board2.model.BoardCommand;

public class BoardList implements BoardAction {

	@Override
	public BoardCommand execute(Scanner scanner) {
		if (arrayList.size() > 0) {
			for (int i = 0; i < arrayList.size(); i++) {
				System.out.println(arrayList.get(i).getWriter());
				System.out.println(arrayList.get(i).getEmail());
				System.out.println(arrayList.get(i).getTitle());
				System.out.println(arrayList.get(i).getContent());

			}

		} else {
			System.out.println("게시판에 글이없습니다.!");

		}

		// TODO Auto-generated method stub
		return null;
	}

}
