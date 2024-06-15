//メソッド　処理
//使い回しができるので同じことを2回書く必要ない　他の場面でも使えて、他の人も使える

//メソッド種類
//1.自分で作るメソッド
//2.Javaが用意してくれているメソッド　　ex) println 1行で変数の中身を表示

class Kurikaeshi1 {
    //publicからがメソッド。メソッドの定義。
    //publicがアクセス修飾子(どこからアクセスできるか決めるもの)
    //static その他の修飾子
    //void 戻り値の型
    //mainがメソッド名
    //String[] argsは引数の型
    public static void main(String[] args){
        for(int i = 0; i <=4; i ++){
            System.out.println(i);
        }
    }
}

//アクセス修飾子
//public  他のクラスからアクセス可能
//protected 同じパッケージ、サブクラスからアクセス可能
//指定なし　だと同じパッケージ
//private 同じクラスからアクセス可能


//その他修飾子
//static クラスから直接呼び出し可
//abstract インスタンス不可
//final 上書き不可

//戻り値の型
//void 戻り値なし
//int 数値型
//String型　　文字列

//メソッド名
//mainメソッド　　　Javaのメソッドには必ず書く
//自作のメソッド名を書く　　　ex) avg
