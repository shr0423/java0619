class Test11{
	public static void main(String[] args) {
		String str=args[0];//������ ���ڿ�
		String target=args[1];//������ ���ڿ����� index�� ���� ����
		
		int index=str.indexOf(target);//target���ڿ��� ���° ����ִ��� ��ȯ����
	
		System.out.println(target+"�̶�� ���ڿ��� "+index+" �� ��ġ�մϴ�");
	}
}
