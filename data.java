//データ型

//整数 数値の範囲の違い
// byte　  -100~100  
//short  -3万~+3万 
//int 　　　　　　　-20万億　+ 20億
//long　　「京」の桁以上

//少数(少数点以下の桁数)
//float  double(多い)

//文字
//chat(文字1つ)  String(文字2つ以上)

//Boolean型
//True or False

class Data {
    public static void main(String[] args){
        byte var01 = 1;
        short var02 = 12345;
        int var03 = 1234567890;
        long var04 = 123456789000L;
        //int var04 = 123456789000L; エラー

        double var05 = 1.23456789;
        float var06 = 1.2345F;

        char var07 = 'C';
        String var08 = "Hello Java";

        int var_a = 100;
        int var_b = 10;
        boolean var_bool;

        var_bool = (var_a > var_b);

        System.out.println(var01);
        System.out.println(var02);
        System.out.println(var03);
        System.out.println(var04);
        System.out.println(var05);
        System.out.println(var06);
        System.out.println(var07);
        System.out.println(var08);
        System.out.println(var_bool);
    }
}
// 1   var01
// 12345   var02
// 1234567890   var03
// 123456789000  var04
//1.23456789      var05
//1.2345      var06
//C           var07
//Hello Java      var08
//true var_bool;

