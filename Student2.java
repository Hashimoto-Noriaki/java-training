// Student2.java
class Student {
  String name = "大谷"; // フィールド名 name

  // メソッド calculateAvg
  public void calculateAvg(int math, int english) {
      System.out.println((math + english) / 2);
  }
}

public class Student2 {
  public static void main(String[] args) {
      Student a001 = new Student(); // インスタンス化
      a001.name = "大谷"; // フィールド name に値を代入
      System.out.println(a001.name); // フィールド name の値を出力
      // calculateAvg メソッドを呼び出し、平均を計算して出力
      a001.calculateAvg(80, 70); // 例として、数学80点、英語70点を渡す

      Student a002 = new Student();
      a002.name = "田中";
      System.out.println(a002.name);
  }
}

//$ java-training % javac Student2.java   コンパイル

//$ java-training % java Student2

// 大谷
// 75
// 田中



//クラスの便利なとこ
//一度定義しておけば、後からいくらでもオブジェクトを作れる　　(オブジェクト指向)　　
