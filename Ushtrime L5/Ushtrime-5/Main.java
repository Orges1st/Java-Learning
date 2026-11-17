void main() {
    char c = 'A';
	// c = A
    IO.println(c);
	// A
    IO.println(c + 1);
	//65 + 1  = 66
    char d = 66;
	// d = B
    IO.println(d);
	// B
    IO.println("" + c + 1);
	//            1   2
	//         "" + A + 1
	//         "A" + 1
	//          "A1"
}