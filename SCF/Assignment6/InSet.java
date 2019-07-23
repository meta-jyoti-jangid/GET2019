package inSet;

import java.util.ArrayList;

public final class InSet {

	private final int set[];

	public InSet(int a[]) throws Exception {
		this.set = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0 || a[i] > 1000)
				throw new Exception("Value out of range");
			set[i] = a[i];
		}
	}

	/**
	 * @param x element to be check in set
	 * 
	 * @return true if element found else return false
	 */
	public boolean isMember(int x) throws Exception {
		for (int i = 0; i < set.length; i++)
			if (set[i] == x)
				return true;
		return false;
	}

	/**
	 * @return size of the set
	 */
	public int size() throws Exception {
		return set.length;
	}

	/**
	 * @param InSet s is the object to check the subset
	 * 
	 * @return true if it is a subset else false
	 */
	public boolean isSubSet(InSet s) throws Exception {
		int j;
		for (int i = 0; i < s.set.length; i++) {
			for (j = 0; j <set.length; j++) {
				if (s.set[i] == set[j])
					break;
			}
			if (j == set.length)
				return false;
		}
		return true;
	}

	/**
	 * * @return complement set of the given set
	 */
	public int[] getComplement() throws Exception {
		int carray[] = new int[1000 - set.length], f, index = 0;
		for (int i = 0; i < 1000; i++) {
			f = 0;
			for (int j = 0; j < set.length; j++) {
				if (set[j] == i) {
					f = 1;
					break;
				}
			}
			if (f == 0) {
				carray[index] = i;
				index++;
			}
		}
		return carray;

	}

	/**
	 * @param InSet s1 , @param InSet s2 are taken to find the union of the sets
	 * 
	 * @return union set of the given two sets.
	 */
	public int[] unionSet(InSet s1, InSet s2) throws Exception {

		int f = 0, j, i;
		ArrayList<Integer> union = new ArrayList<Integer>();
		for (i = 0; i < s1.set.length; i++) {
			union.add(s1.set[i]);

		}
		for (i = 0; i < s2.set.length; i++) {
			for (j = 0; j < s1.set.length; j++) {
				if (s2.set[i] != s1.set[j]) {
					f = 1;
				} else {
					f = 0;
					break;
				}
			}
			if (f == 1) {
				union.add(s2.set[i]);

			}
		}
		int[] unionset = new int[union.size()];
		for (i = 0; i < unionset.length; i++) {
			unionset[i] = union.get(i).intValue();
		}
		return unionset;
	}
	public static void main(String args[]) throws Exception{
		 InSet setarray= new InSet( new int[]{1,2,3,4,5});
		 InSet setarray1 = new InSet(new int[]{1,2,3,4,5,6});
		 System.out.println(setarray.isMember(2));
		 System.out.println(setarray.isSubSet(setarray1));
		 int[] a= setarray.unionSet(setarray, setarray1);
		 for(int ele:a){
			 System.out.print(ele);
		 }
	}

}