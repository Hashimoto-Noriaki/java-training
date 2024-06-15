//実践
//テスト結果を判定するプログラム

//Studentクラス
//nameフィールド追加
//メソッド定義　　calculateAvg(5教科平均)　　judge(結果)

class Student {
    String name;

    public double calculateAvg(double[] data) {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        double avg = sum / data.length;
        return avg;
    }

    public String judge(double avg) {
        if (avg >= 60) {
            return "passed";
        } else {
            return "failed";
        }
    }
}

// プログラムを開始するためのメインメソッド
public class Practice {
    public static void main(String[] args) {
        Student a001 = new Student(); // インスタンス化
        a001.name = "大谷"; // フィールド name に値を代入
        double[] data = {70, 65, 50, 90, 30};

        double avg = a001.calculateAvg(data);
        String result = a001.judge(avg);

        System.out.println("Average: " + avg);
        System.out.println(a001.name + " " + result);
    }
}

//$ javac Practice.java
//$ java Practice

// Average: 61.0
// 大谷 passed
