package com.likou.Code1_40;

/**
 * @author: wyh
 * 解数独
 * @Day: 2020/4/2
 */
public class Code37 {
    public static boolean[][] rows;
    public static boolean[][] columns;
    public static boolean[][] boxs;

    public static void initMaps(char[][] board){
        rows = new boolean[9][10];
        columns = new boolean[9][10];
        boxs = new boolean[9][10];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    int index = i/3*3+j/3;
                    int k = board[i][j]-'0';
                    rows[i][k]=true;
                    columns[j][k] = true;
                    boxs[index][k] = true;
                }
            }
        }
    }

    public static boolean shudu(char[][] board, int i, int j){
        if(i==9){
            i=0;
            j+=1;
            if(j==9){
                return true;
            }
        }
        if(board[i][j]=='.'){
            int index = i/3*3+j/3;
            for(int k=1;k<10;k++){
                if(rows[i][k]==false && columns[j][k]==false && boxs[index][k]==false){
                    board[i][j] = (char) ('0' + k);
                    rows[i][k] = true;
                    columns[j][k] = true;
                    boxs[index][k] = true;
                    if (shudu(board, i+1, j)) {
                        return true;
                    }
                    board[i][j] = '.';
                    rows[i][k] = false;
                    columns[j][k] = false;
                    boxs[index][k] = false;
                }
            }
        }else {
            return shudu(board, i + 1, j);
        }
        return false;
    }

    public static void solveSudoku(char[][] board) {
        char[][] board1 = {
                {'.','.','9','7','4','8','.','.','.'},
                {'7','.','.','.','.','.','.','.','.'},
                {'.','2','.','1','.','9','.','.','.'},
                {'.','.','7','.','.','.','2','4','.'},
                {'.','6','4','.','1','.','5','9','.'},
                {'.','9','8','.','.','.','3','.','.'},
                {'.','.','.','8','.','3','.','2','.'},
                {'.','.','.','.','.','.','.','.','6'},
                {'.','.','.','2','7','5','9','.','.'}
        };
        initMaps(board1);
        shudu(board1,0,0);
        System.out.println();
    }
}
