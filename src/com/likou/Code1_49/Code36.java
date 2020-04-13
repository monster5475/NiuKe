package com.likou.Code1_49;

/**
 * @author: wyh
 * 有效的数独
 * @Day: 2020/4/1
 */
public class Code36 {
    public boolean isValidSudoku(char[][] board) {
        int length=9;
        for(int i=0;i<length;i++){
            int[] count= new int[10];
            for(int j=0;j<length;j++){
                if(board[i][j]!='.'){
                    count[board[i][j]-'0'] += 1;
                }
            }
            for(int j=0;j<10;j++){
                if(count[j] >1){
                    return false;
                }
            }
        }
        for(int i=0;i<length;i++){
            int[] count= new int[10];
            for(int j=0;j<length;j++){
                if(board[j][i]!='.'){
                    count[board[j][i]-'0'] += 1;
                }
            }
            for(int j=0;j<10;j++){
                if(count[j] >1){
                    return false;
                }
            }
        }
        for(int ii=0;ii<3;ii++) {
            for(int jj=0;jj<3;jj++) {
                int[] count = new int[10];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int iii = ii*3+i;
                        int jjj = jj*3+j;
                        if (board[iii][jjj] != '.') {
                            count[board[iii][jjj] - '0'] += 1;
                        }
                    }
                }
                for (int j = 0; j < 10; j++) {
                    if (count[j] > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
