package demo8;

public class H {
   double profitOrLoss(double sp, double cp) {
	   double profit = sp - cp;
	   double loss = cp- sp;

	   if(profit>loss) {
		   return profit;
	   }
	   else {
		   return loss;
	   }
   }
}
