class Test12{
	public static void main(String[] args) {
		//문자열을 다루는 String의 메서드 중 split을 알아보자
		//참고로 js와 java는 서로다른 기술이지만, 일반적인
		//프로그래밍 언어에서 문자열을 다루는 메서드들은
		//거의 비슷하기  때문에, java api와 js api는 문자열에
		//대해서는 거의같다.
		String filename=args[0];
		/*1)split으로 처리하는 방법
		String[] arr=filename.split("\\.");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		*/

		//2)substring()메서드로 처리
		//filename.substring(0,점이 발견된 index);
		String name=filename.substring(0,filename.indexOf("."));
		System.out.println("파일의 이름만"+name);

		//확장자만추출하여 출력
		String ext=filename.substring((filename.indexOf(".")+1),filename.length());
		System.out.println("확장자명"+ext);
	}
}
