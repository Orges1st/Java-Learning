void main(){
	int a = 4;
	++a; // 5
	//int c = a; //5
	 // a = 6
	int d = --a + a++ + ++a;
	     //  4 + 4 + 6
	IO.println(d);
}