package code.datas;

public abstract class Animal {
    
    private String name;

    private void move(int x, int y) {
        String msg = String.format("%d, %d로 이동합니다.", x, y);
        System.out.println(msg);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

}
