package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class TestFile {

	public static void main(String[] args) {
		File dir = new File("D:\\Java");
		System.out.println(dir.getName());
		File[] files = dir.listFiles();
		int num = 0;
		long sum =0;
		Comparator<File> c = new Comparator<File>() {

			@Override
			public int compare(File o1, File o2) {
				if(o1.length() < o2.length()) {
					//如果o1的大小 < o2 o1排前面
					return -1;
				}
				//其他情況放後面
				return 1;
			}
		};
		Set<File> fileSet = new TreeSet<File>(c);
		for (File file : files) {
			System.out.printf("名稱:%s,是否為目錄:%s%n",file.getName(),file.isDirectory());
			long lastModified = file.lastModified();
			Date d = new Date(lastModified);
			SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			System.out.println("修改日期:"+format.format(d));
			if (!file.isDirectory()) {
				num+=1;
				sum+=file.length();
				fileSet.add(file);
			}
		}
		System.out.printf("所有檔案個數:%d,檔案大小總和:%d bytes%n",num,sum);
		System.out.println("===排序檔案===");
		for (File f : fileSet) {
			System.out.printf("名稱:%s,大小:%d%n",f.getName(),f.length());
		}
		
	}

}
