package kim.arraylist.board2.service;

import java.util.Scanner;

import kim.arraylist.board2.control.BoardAction;
import kim.arraylist.board2.model.BoardCommand;

public class BoardWrite implements BoardAction {

	@Override
	public BoardCommand execute(Scanner scanner) {
		System.out.println("글을 입력하세요");

		System.out.print("글쓴이:");
		String writer = scanner.next();
		System.out.println();

		System.out.print("이메일:");
		String email = scanner.next();
		System.out.println();

		System.out.print("제목:");
		String title = scanner.next();
		System.out.println();

		System.out.print("내용:");
		String content = scanner.next();
		System.out.println();

		System.out.print("비밀번호:");
		String password = scanner.next();
		System.out.println();

		// 변수 넣기위해 인스턴스 생성
		BoardCommand command = new BoardCommand();

		command.setWriter(writer);
		command.setEmail(email);
		command.setTitle(title);
		command.setContent(content);
		command.setPassword(password);
		
		arrayList.add(command);
		System.out.println("글 등록이 완료되었습니다.");

		// TODO Auto-generated method stub
		return command;
	}

}
