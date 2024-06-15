//繰り返し処理

//for文
//for(スタート値;継続条件;増減式)；　スタート値がカウンター変数
//for(int i = 0; i <=4;i++){

//}

//break
//繰り返し処理を終了

//continue文
//繰り返し処理である条件になったらスキップ

class Kurikaeshi {
    public static void main(String[] args){
        for(int i = 0; i <=4; i ++){
            System.out.println(i);
        }

        //indexは本来ならi
        for(int index = 0; index <=4; index ++){
            if(index==3){
                break;
            }
            System.out.println(index);
        }

        //indは本来ならi 3をスキップ
        for(int ind = 0; ind <=4; ind ++){
            if(ind==3){
                continue;
            }
            System.out.println(ind);
        }

        //for文のネスト　forの中にfor
        for(int j = 0; j <=2; j ++){
            for(int k = 0; k <=2; k ++)
            System.out.println(j + "-" + k);
        }

        //配列
        int arr[] = {2,4,6,8,10};

        for( int i = 0; i <= 4; i++){
            System.out.println(arr[i]);
        }

        //配列でsumを使う
        int arr2[] = {2,4,6,8,10};
        int sum = 0;

        for( int i = 0; i <= 4; i++){
            sum += arr2[i];
        }
        System.out.println(sum);
    }
}
// 0
// 1
// 2
// 3
// 4
// 0  indexはここから
// 1
// 2
// 0　　indはここから　　3をスキップ
// 1
// 2
// 4
// 0-0  nestはここから
// 0-1
// 0-2
// 1-0
// 1-1
// 1-2
// 2-0
// 2-1
// 2-2
// 2  配列はここから
// 4
// 6
// 8
// 10
//30 sumを使った配列