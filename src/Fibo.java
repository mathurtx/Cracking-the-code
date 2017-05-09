class Fibo {
	public int calculateFibonacci(int n) {
		if(n == 0){
			return 1;
		}
		if(n==1) {
			return 1;
		}
		if(n>1) {
			return calculateFibonnaci(n-1) + calculateFibonnaci(n-2);
		}
		if(n<0 || n == null) {
			return -1;
		}
	}

	public int iteratecalculateFibonacci(int n) {
		if(n < 0) {
			return -1;
		}
		if(n == 1) {
			return 1;
		}
		int a = 1, b = 1;
		for(int i = 3; i <=n; i++) {
			int c = a+b;
			a = b;
			b = c;
		}
		return b;
	}
}