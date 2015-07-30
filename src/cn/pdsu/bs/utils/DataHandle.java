package cn.pdsu.bs.utils;

public class DataHandle implements IDataHandle {
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.utils.IDataHandle#arryToStr(java.lang.String[])
	 */
	public  String arryToStr(String[] str,String[] str2){
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < str.length; i++){
		 sb. append(str[i]+":"+str2[i]+"¸ö,");
		}
		return sb.toString();
	}
	public  String arry2Str(String[] str){
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < str.length; i++){
		 sb. append(str[i]+",");
		}
		return sb.toString();
	}
	
	public  static void arryToStr1(String[] str,String[] str2){
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < str.length; i++){
		 sb. append(str[i]+":"+str2[i]+"¸ö,");
		}
		System.out.println( sb.toString());
	}

	public static void main(String args[]){
		String[] str = {"abc", "bcd", "def"};
		String[] str2 = {"2", "1", "5"};
		/*String s=new String("xyz");
		int n=java.lang.reflect.Array.getLength(str);
		System.out.println(n);
		System.out.println(s.length());*/
		arryToStr1(str,str2);
	
	}
}
