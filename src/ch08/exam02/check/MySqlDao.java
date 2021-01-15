package ch08.exam02.check;

public class MySqlDao implements DaraAccessObject{

	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("MySql DB에서 삽입");
		
	}

	@Override
	public void update() {
		System.out.println("MySql DB에서 갱신");
	}

	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
		
	}
}
