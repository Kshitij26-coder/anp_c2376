package question2;

import java.util.Scanner;

public  class RBI {
	int withLimit,n;
	double A,P,r;
	float t;
	long avg,tot,mb;
   int widrawalLimit() {
	   Scanner sc=new Scanner(System.in);
	   String accountType=sc.nextLine();
	   String branchType=sc.nextLine();
	   if (accountType=="Saving"&&branchType=="City") {
		   withLimit=5000;
		   	   }
	   else {
		   withLimit=4000;
	   }
	   return withLimit;
	   
   }
   double setInterestRate() {
	   A=(P+r)/n*t;
	   return A;
   }
   long setMAB() {
	   mb=(avg*tot)/31;
	   return mb;
   }
   
}
