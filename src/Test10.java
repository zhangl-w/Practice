



	public class Test10 {

	    public static void main(String[] args) {
	        String srcStr1 = "��ABC";
	        String srcStr2 = "��ABC��DEF";

	        splitString(srcStr1, 4);
	        splitString(srcStr2, 6);
	        char a = 'a';
	        System.out.println(a==0);
	    }

	    public static void splitString(String src, int len) {
	        int byteNum = 0;

	        if (null == src) {
	            System.out.println("The source String is null!");
	            return;
	        }

	        byteNum = src.length();
	        byte bt[] = src.getBytes(); // ��Stringת����byte�ֽ�����

	        if (len > byteNum) {
	            len = byteNum;
	        }

	        // �ж��Ƿ�����˽ذ룬�ذ�Ļ��ֽڶ��ڵ�ASC����С��0��ֵ
	        if (bt[len] < 0) {
	            String subStrx = new String(bt, 0, --len);
	            System.out.println("subStrx==" + subStrx);
	        } else {
	            String subStrx = new String(bt, 0, len);
	            System.out.println("subStrx==" + subStrx);
	        }
	    }

	
}
