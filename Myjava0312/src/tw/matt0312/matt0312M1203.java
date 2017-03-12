package tw.matt0312;
/*
 * exchange array element
 */
public class matt0312M1203 {

	public static void main(String[] args) {
		 //int[]a = new int[52];  //0-51:0
		// for(int i=0; i<a.leangth;i++) a[i]=i++  文具行買的牌子 陣列的長度是小於
		   int[]a = {0,1,2,3,4,5};   //這邊的值都是0
		   //metood1: 尋訪方式 傳統尋訪
		   for(int i=0 ; i<a.length;i++){    
			   System.out.println(a[i]);  //這個可以不跑完整個陣列 LENGTH-3 ,或找出i的位置
		   }
		   System.out.println("------");
		   //metood2:  
		   for(int v:a){         //for each方法:巡防目標在冒號右手邊 每次找到元素都繪擺在V ;V是A中的每個元素 但是是值 如果宣告示
			                     //V是A中的每個元素 但是V是值 ,如果宣告陣列才是參考
			   System.out.println(v);
		   }
		   //exchange  2<--->5
			   int temp =a[2];
			   a[2] = a[5];
			   a[5] =temp ;
			   
			 //metood2:  
			   for(int v:a){        
				                     
				   System.out.println(v);
			   }
		   System.out.println("-----------------------------");
		   int[][] b ={{1,2,3,4},{5,6,7},{8,9},{10},{11,12,13}};   //
		   //  尋訪! 尋訪2為陣列
		   for(int i=0;i<b.length;i++){
			   for(int j=0;j<b[i].length;j++){
				   System.out.println(b[i][j]+"");
			   }
			   System.out.println();
		   }
		   //方法2   因為是int
		   for(int []v1:b){    //因為視為這是一個1為陣列要 找裡面的值
			   for(int v2: v1){     //這邊視為一個值
				   System.out.println(v2+" ");
			   }
			   System.out.println();
		   }
			   
			  

		   
	}

}
