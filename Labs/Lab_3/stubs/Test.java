class Test {
    //CASE 1
    static void swap(MyInteger a, MyInteger b) {
        //INSERT YOUR CODE HERE - CASE 1
        int temp = a.getValue();
        a.setValue(b.getValue());
        b.setValue(temp);
    }
	/*
	* This case and the next case will not change the values because of the demonstration of reference VS value.
	* when the variables are of primitive types, they will not reflect the change as the changes are in different
	* memory locations.
	* However, when the variables are not of the primitive type, they are referenced and will reflect the changes
	* as the changes are made at the referenced locations*/
	//CASE 2
    static void swap(Integer a, Integer b) {
        //INSERT YOUR CODE HERE - CASE 2
		Integer temp = a;
		a = b;
		b = temp;

    }

    //CASE 3
    static void swap(int a, int b) {
        //INSERT YOUR CODE HERE - CASE 3
		int temp = a;
		a = b;
		b = temp;
	}

    //CASE 4
    static void swap(int[] arr) {
        //INSERT YOUR CODE HERE - CASE 4
        int temp = arr[1];
        arr[1] = arr[0];
        arr[0] = temp;
    }

    static void printHeader(int caseID) {

        System.out.println("\n.....................................................");
        System.out.println("........................CASE " + caseID + ".......................");
        System.out.println(".....................................................");
    }

    public static void main(String[] args) {

        //CASE 1
        MyInteger a, b;
        a = new MyInteger(5);
        b = new MyInteger(10);
        printHeader(1);
        System.out.println("Before: a = " + a.getValue() + " and b = " + b.getValue());
        swap(a, b);
        System.out.println("After: a = " + a.getValue() + " and b = " + b.getValue());

        //CASE 2
        Integer c, d;
        c = 5;
        d = 10;
        printHeader(2);
        System.out.println("Before: c = " + c + " and b = " + d);
        swap(c, d);
        System.out.println("After: c = " + c + " and b = " + d);

        //CASE 3
        int e, f;
        e = 5;
        f = 10;
        printHeader(3);
        System.out.println("Before: e = " + e + " and f = " + f);
        swap(e, f);
        System.out.println("After: e = " + e + " and f = " + f);

        //CASE 4
        int[] arr;
        arr = new int[2];
        arr[0] = 5;
        arr[1] = 10;
        printHeader(4);
        System.out.println("Before: arr[0] = " + arr[0] + " and arr[1] = " + arr[1]);
        swap(arr);
        System.out.println("After: arr[0] = " + arr[0] + " and arr[1] = " + arr[1]);
    }
}