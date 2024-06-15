//配列

//配列の作り方
//データ[] 配列変数名;
//配列変数名　= new データ型[要素数];

//宣言と同時に代入
//データ型配列変数　= {"データ1","データ2"};

class Array {
    public static void main(String[] args){
        String[] arr;//配列変数名を記述
        arr = new String[3];//配列変数名　= new データ型[要素数];

        arr[0] = "犬";
        arr[1] = "猫";
        arr[2] = "猿";

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        String[] arr02 = {"ライオン","トナカイ","ゾウ"};
        System.out.println(arr02[0]);
        System.out.println(arr02[1]);
        System.out.println(arr02[2]);

        //配列のデータ変更
        String[] arr03 = {"シカ","白熊","リス"};
        arr03[1] = "雉";

        System.out.println(arr03[0]);
        System.out.println(arr03[1]);
        System.out.println(arr03[2]);

        //多次元配列
        String [][] arr04 = {{"ワンピース","名探偵コナン"},{"ドラゴンボール","スラムダンク"}};

        System.out.println(arr04[0][0]);
        System.out.println(arr04[0][1]);
        System.out.println(arr04[1][0]);
        System.out.println(arr04[1][1]);
    }
}
// 犬
// 猫
// 猿
//ライオン
//トナカイ
//ゾウ
//シカ
//雉
//リス
//ワンピース
//名探偵コナン
//ドラゴンボール
//スラムダンク