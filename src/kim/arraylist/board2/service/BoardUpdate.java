package kim.arraylist.board2.service;

import java.util.Scanner;

import kim.arraylist.board2.control.BoardAction;
import kim.arraylist.board2.model.BoardCommand;

public class BoardUpdate implements BoardAction {

	@Override
	public BoardCommand execute(Scanner scanner) {
		BoardCommand command = new BoardCommand();
		System.out.println("수정하실글의 제목과 비밀번호를 입력하세요.");
		System.out.print("제목: ");
		String title = scanner.next();
		System.out.println();

		System.out.print("비밀번호: ");
		String password = scanner.next();
		System.out.println();
		if (arrayList.size() > 0) {

			int index = -1;
			// 리스트 전체를 돌려봄
			for (int i = 0; i < arrayList.size(); i++) {
				// 사용가자 수정하길 원하는 제목이있는지
				if (arrayList.get(i).getTitle().equals(title)) {
					// 그 제목의 비밀번호가 맞는지확인
					if (arrayList.get(i).getPassword().equals(password)) {
						// 만약 제목과 비밀번호가 맞으면 그글을 삭제하고 세로 적을 준비를 한다.
						arrayList.remove(arrayList.get(i));
						index = i;

					}

				}
				if (index == -1) {
					System.out.println("원하시는 글이 없거나 비밀번호가 클렸습니다.");
				} else {
					System.out.print("수정할 이메일:");
					String email = scanner.next();
					System.out.println();

					System.out.print("수정할 글제목: ");
					String title1 = scanner.next();
					System.out.println();

					System.out.print("수정할 글내용:");
					String content = scanner.next();
					System.out.println();

					command.setEmail(email);
					command.setTitle(title1);
					command.setContent(content);
					command.setPassword(password);
					command.setWriter(arrayList.get(i).getWriter());

					System.out.println("수정이 완료되었습니다.");

				}

			}
		}
		// TODO Auto-generated method stub
		return command;
	}

}
