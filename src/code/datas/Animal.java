package code.datas;

public abstract class Animal {

	private String name;
		
	public void move(int x, int y) {
		
		String msg = String.format("%d, %d로 이동합니다", x, y);
		System.out.println("msg");
	}
	
}
