package kim.arraylist.board2.service;

import java.util.Scanner;

import kim.arraylist.board2.control.BoardAction;
import kim.arraylist.board2.model.BoardCommand;

public class BoardDelete implements BoardAction {

	@Override
	public BoardCommand execute(Scanner scanner) {

		System.out.println("삭제하실글의 제목과 비밀번호를 입력하세요.");
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
						// 만약 제목과 비밀번호가 맞으면 그글을 삭제한다.
						arrayList.remove(arrayList.get(i));
						index = i;

					}

				}
				if (index == -1) {
					System.out.println("원하시는 글이 없거나 비밀번호가 클렸습니다.");
				}
			}

		}
		return null;
	}

}
