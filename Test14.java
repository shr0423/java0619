class Test14{
	public static void main(String[] args) {
		//파일명뿐만아니라, 디렉토리 경로까지 포함된 문자열에서
		//확장자만 추출하기
		//경로에 .점이 여러개 존재한다
		String path="d:/html_workspace/day06.13/mario.png";
		
		int index=path.lastIndexOf(".");// 가장 마지막점의 index위치반환
		System.out.println("마지막점의위치는"+index);

		String result=path.substring(index+1,path.length());
		System.out.println("확장자는"+result);
	}
}
