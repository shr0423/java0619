class Test14{
	public static void main(String[] args) {
		//���ϸ�Ӹ��ƴ϶�, ���丮 ��α��� ���Ե� ���ڿ�����
		//Ȯ���ڸ� �����ϱ�
		//��ο� .���� ������ �����Ѵ�
		String path="d:/html_workspace/day06.13/mario.png";
		
		int index=path.lastIndexOf(".");// ���� ���������� index��ġ��ȯ
		System.out.println("������������ġ��"+index);

		String result=path.substring(index+1,path.length());
		System.out.println("Ȯ���ڴ�"+result);
	}
}
