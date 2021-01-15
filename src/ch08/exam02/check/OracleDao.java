package ch08.exam02.check;

public class OracleDao implements DaraAccessObject{

	@Override
	public void select() {
		System.out.println("오라클 DB에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("오라클 DB에서 삽입");
		
	}

	@Override
	public void update() {
		System.out.println("오라클 DB에서 갱신");
	}

	@Override
	public void delete() {
		System.out.println("오라클 DB에서 삭제");
		
	}

	
	
}
