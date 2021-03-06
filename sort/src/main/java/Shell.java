import com.huazhou.utils.Model;

/**
 * 算法2.3 希尔排序
 * @author huazhou
 *
 */
public class Shell extends Model{

	public void sort(Comparable[] a){
//		System.out.println("Shell");
		//将a[]按升序排列
		int N = a.length;
		int h = 1;
		//1,4,13,40,121,364,1093,...
		while(h < N/3){
			h = 3*h + 1;
		}
		//将数组变为h有序
		while(h >= 1){
			//将a[i]插入到a[i-h],a[i-2*h],a[i-3*h]...之中
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && less(a[j],a[j-h]); j-=h) {
					exch(a, j, j-h);
				}
			}
			h = h/3;
		}
	}
}
