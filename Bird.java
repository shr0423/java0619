class Bird{
	int wing=2;
		//자바클래스 정의시 main은 필수가 아닌 선택이다.
		//즉,현재 프로젝트의 시작점인 entry point를
		//누가 부담할지에 대한 문제일뿐이지, 모든 클래스내에
		//main을 두려고 하지 말자
		public static void main(String[] args){
		Cat c=new Cat();
		System.out.println(c.name);
	}
}
