package zen_ze;

public interface Zen_Test1 {
/*
 * ���ƿڳԣ��������������������������������������������Ҳ�����������������������������ѰѰѰѰѰѰѰѰѰѰѰѰѰѰѰ
 *��ip��ַ����
 *���ʼ���ַУ��
 *
 *
 */
	public static void main(String[] args) {
		String str="�������ҡ��������������ҡ����ҡ������ҡ�����������������������������������������������������������";

		KouChi(str);
	}

	public static void KouChi(String str){
		String regex1=str.replaceAll("��", "");
		
		System.out.println(regex1);
		String regex=regex1.replaceAll("(.)\\1+","$1");

		System.out.println(regex);
	}
}
