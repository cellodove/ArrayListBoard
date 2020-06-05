package kim.arraylist.board2.view;

import java.util.Scanner;

import kim.arraylist.board2.service.BoardDelete;
import kim.arraylist.board2.service.BoardList;
import kim.arraylist.board2.service.BoardUpdate;
import kim.arraylist.board2.service.BoardWrite;

public class BoardMain {

	public static void main(String[] args) {
		boolean onOff = false;
		Scanner scanner = new Scanner(System.in);
		//여기에 do를써야 온전하게 돌아감 확인할것
		do {
			System.out.println("원하시는 내용을 입력하세요");
			System.out.print(" 1.게시판 목록");
			System.out.print(" 2.글 작성");
			System.out.print(" 3.글 수정");
			System.out.print(" 4.글 삭제");
			System.out.println(" 5.종료");
			System.out.print("숫자를 입력하세요");
			int menu = scanner.nextInt();

			switch (menu) {
			case 1:
				BoardList boardList = new BoardList();
				boardList.execute(scanner);
				break;

			case 2:
				BoardWrite boardWrite = new BoardWrite();
				boardWrite.execute(scanner);
				break;

			case 3:
				BoardUpdate boardUpdate = new BoardUpdate();
				boardUpdate.execute(scanner);
				break;

			case 4:
				BoardDelete boardDelete = new BoardDelete();
				boardDelete.execute(scanner);
				break;

			case 5:
				onOff = true;
			}
		} while (!onOff);

		scanner.close();
	}

}
