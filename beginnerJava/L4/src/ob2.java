public class ob2 {
    public static void main(String[] args) {
        int[][] a = { {-9, 97, 5, 97}, {2, 99, 33, 99}, {51, 97, -45, 97}, {85, 97, 122, 100} };
      boolean haspoint = false;
      for (int index = 0; index < a.length; index++) {
		int rowMax = -1,colMin = -1;
		for (int n = 0; n < a[index].length; n++) {
			if(n == 0){
				rowMax = a[index][n];
			}else if(rowMax < a[index][n]){
				rowMax = a[index][n];
			}
		}
		for (int n = 0; n < a[index].length; n++) {
			if(rowMax == a[index][n]){
				for (int suf = 0; suf < a.length; suf++) {
					if(suf == 0){
						colMin = a[suf][n];
					}
					else if(colMin > a[suf][n]){
						colMin = a[suf][n];
					}
				}
				if(rowMax == colMin){
					haspoint = true;
					System.out.println(a[index][n]+"为鞍点,位置:["+index+"]["+n+"]");

				}
			}
		}
	}
      if(!haspoint){
    	  System.out.println("无鞍点");
      }
    }
}
