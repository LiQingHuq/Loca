package zen_ze;

public interface Zen_Test1 {
/*
 * 治疗口吃：呜呜呜呜呜呜呜呜呜呜呜我我我我我我我我我我我卜卜卜卜卜卜卜卜开开开开开心心寻寻寻寻寻寻寻寻寻寻寻寻寻寻寻
 *对ip地址排序
 *对邮件地址校验
 *
 *
 */
	public static void main(String[] args) {
		String str="我我我我。。。。。我我我。。我。。我我。。。不。。。不不不不开。。。。。开开开开。。。开开开心心心";

		KouChi(str);
	}

	public static void KouChi(String str){
		String regex1=str.replaceAll("。", "");
		
		System.out.println(regex1);
		String regex=regex1.replaceAll("(.)\\1+","$1");

		System.out.println(regex);
	}
}
