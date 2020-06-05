package kim.arraylist.board2.control;

import java.util.ArrayList;
import java.util.Scanner;

import kim.arraylist.board2.model.BoardCommand;

public interface BoardAction {
	
	//어레이리스트 인스턴스 생성
	ArrayList<BoardCommand> arrayList = new ArrayList<BoardCommand>();
	//1
	//추상메소드 생성
	public BoardCommand execute(Scanner scanner);
	
	
	

}
