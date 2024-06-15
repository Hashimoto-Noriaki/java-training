class Calculate{
    public static void main(String[] args){
        int x = 100;
        int y = 20;
        int z = 100;
        int a = 8;
        int b = 8;
        a++;
        b--;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        //関係演算子
        System.out.println(x > y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x <= z);
        //等価
        System.out.println(x == y);
        System.out.println(x != y);
        //論理演算子
        System.out.println(x >= 50 && x <= 100);
        System.out.println(y >= 50 && y <= 100);
        //or条件
        System.out.println(x == 50 || y == 20);
        System.out.println(x == 30 || y == 10);
        //代入演算子　複合代入演算子
        System.out.println(x +=20);
        System.out.println(z += y);
        //インクリメント　デクリメント
        System.out.println(a);
        System.out.println(b);


    }
}
// 120
// 80
// 2000
// 5
// 0
// true
// true
// false
// true
// false
// true
// true
// false
//true
//false
//120
//120
//9
//7