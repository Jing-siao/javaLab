public class TestStringBuilder {

	public static void main(String[] args) {
		//以下會在heap創很多個記憶體，因為有使+符號
		String temp = "";
		for (int i = 0;i < 10; i++) {
			temp = temp + i;
		}
		System.out.println(temp);
		//-----------
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0;i < 10; i++) {
			sb .append(i);
		}
		System.out.println(sb.toString());
	}

}
