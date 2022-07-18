object main extends App{
    def buyingCost(n:Int):Double = n*24.95*40/100;
    def shippingCost(n:Int):Double= if (n<=50) 3*n else 50*3+(n-50)*0.75;  
    def totalWholesaleCost(n:Int):Double = buyingCost(n)+shippingCost(n);

    println("Wholesale cost for 60 copies= Rs."+totalWholesaleCost(60));
}