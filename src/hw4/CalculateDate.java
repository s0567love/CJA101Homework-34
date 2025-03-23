package hw4;

import java.util.Scanner;

public class CalculateDate {
	
	public static void main(String args[]) {
		
	  System.out.println("請輸入年,月,日:");
	  Scanner sc=new Scanner(System .in);	
	  int data[]= {sc.nextInt(),sc.nextInt(),sc.nextInt()};	
	  
	  while(data[0]<0){
			if(data[0]<0) {
				System.out.println("西元年不能輸入<0的值");
			}
		    System.out.println("請重新輸入西元年:");
		    data[0]=sc.nextInt();
		    }
		  //年
	  
	  while(data[1]<0 ||data[1]>13){
			if(data[1]<0 ||data[1]>13) {
				System.out.println("月份不能輸入<0或>13的值");
			}
		    System.out.println("請重新輸入月份:");
		    data[1]=sc.nextInt();
		    }
	        //月
	  
	  while(data[2]<0 || data[2]>31 || data[1]==4 && data[2]>30 || (data[1]==2&&data[2]>29) ||  data[1]==6 && data[2]>30 || data[1]==9 && data[2]>30 || data[1]==11 && data[2]>30 ||
			  !( (data[0] % 400 == 0) || ((data[0] % 4 == 0) && (data[0] % 100 != 0)) ) &&data[1]==2&&data[2]>28
		   ){
		   if(data[2]<0 || data[2]>31 || data[1]==4 && data[2]>30 || (data[1]==2&&data[2]>29) ||  data[1]==6 && data[2]>30 || data[1]==9 && data[2]>30 || data[1]==11 && data[2]>30 ||
					  !( (data[0] % 400 == 0) || ((data[0] % 4 == 0) && (data[0] % 100 != 0)) ) &&data[1]==2&&data[2]>28) {
			  System.out.println("日期不能輸入錯誤的日期");
	  	  }
	      System.out.println("請重新輸入日期:");
	      data[2]=sc.nextInt();
	      }
	      //日
	  int adata=0;
	  
	  for(int k=data[1]-1;k>0;k--) {
		  
		  switch(k) {
		  
		  case 1:
			  adata=adata+31;
			  break;
		  case 2:
			  if(!( (data[0] % 400 == 0) || ((data[0] % 4 == 0) && (data[0] % 100 != 0)))){
				  adata=adata+28; 
			  }else {adata=adata+29;}
			  break;
		  case 3:
			  adata=adata+31;
			  break;
		  case 4:
			  adata=adata+30;
			  break;
		  case 5:
			  adata=adata+31;
			  break;
		  case 6:
			  adata=adata+30;
			  break;
		  case 7:
			  adata=adata+31;
			  break;
		  case 8:
			  adata=adata+31;
			  break;
		  case 9:
			  adata=adata+30;
			  break;
		  case 10:
			  adata=adata+31;
			  break;
		  case 11:
			  adata=adata+30;
			  break;
		  case 12:
			  adata=adata+31;
			  break;
			  
		  }

		  
	  }
	  adata=adata+data[2];
      System.out.println("輸入的日期為該年第"+adata+"天");
	} 
	
}
