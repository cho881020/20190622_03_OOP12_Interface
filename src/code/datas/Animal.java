package code.datas;

public abstract class Animal { //추상 클래스

	private String name;

	public void move(int x, int y) {
		String msg = String.format("%d,%d로 이동합니다.", x, y);
		System.out.println(msg);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
