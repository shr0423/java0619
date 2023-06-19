class Test11{
	public static void main(String[] args) {
		String str=args[0];//조사대상 문자열
		String target=args[1];//조사대상 문자열내의 index를 구할 문자
		
		int index=str.indexOf(target);//target문자열이 몇번째 들어있는지 반환받자
	
		System.out.println(target+"이라는 문자열은 "+index+" 에 위치합니다");
	}
}
