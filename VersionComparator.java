package win.zhangkang.webappdemo.service;

import java.util.Comparator;

public class VersionComparator<T> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        String str1 = (String) o1;
        String str2 = (String) o2;
        String[] str1Arr = str1.split("\\.");
        String[] str2Arr = str2.split("\\.");
        int len = str1Arr.length >= str2Arr.length ? str2Arr.length : str1Arr.length;
        for (int i = 0; i < len; i++) {
            int str1Num = Integer.parseInt(str1Arr[i]);
            int str2Num = Integer.parseInt(str2Arr[i]);
            if (str1Num != str2Num) {
                return str1Num - str2Num;
            }
        }
        return 0;
    }

}
