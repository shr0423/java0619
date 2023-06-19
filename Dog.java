class Dog {

	int x=3;

	public static void main(String[] args) {
		//Dog이 보유한 x를 출력하시오
		//class라는 단위는 실제 사물이 아닌 거푸집이므로
		//직접 사용할 수 없다..따라서 거푸집으로부터 인스턴스를
		//생성해야만, 클래스가 보유한 변수와 메서드를 접근할수있다. 
		Dog d=new Dog();
		System.out.println(d.x);
	}
}
