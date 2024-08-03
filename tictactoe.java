import java.util.*;
class Tictactoe{
    public static void main(String args[]) {
        char board [][] = new char[3][3];
        for(int row = 0;row < board.length; row++){
            for(int col = 0;col < board[row].length; col++){
                board[row][col] = ' ';
            }
        }
        char player = 'X';
        boolean gameover = false;
        Scanner sc = new Scanner(System.in);
        while(!gameover){
            printboard(board);
            System.out.print(" Player " + player + " enter: ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(board[row][col] == ' '){
                board[row][col] = player;// palce element 
                gameover = haveWon(board, player);
                if(gameover){
                    System.out.println(" Player " + player + " has won: ");
                }else{
                    player = (player == 'X') ? 'O' : 'X';
                }

            }else{
                System.out.println("Invalid move! please trygain");
            }}
            printboard(board);
        }
    
    public static boolean haveWon(char board[][], char player){
        //check the rows
        for(int row = 0;row < board.length; row++){
            if(board[row][0] == player && board[row][1]== player && board[row][2] == player){
                return true;
            }
        }
            //check for columns
        for(int col = 0;col < board.length; col++){
            if(board[0][col] == player && board[1][col]== player && board[2][col] == player){
                return true;
            }
        }
        //check for the diagonal
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }

        if(board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }

    public static void printboard(char board[][]){
        for(int row = 0;row < board.length; row++){
            for(int col = 0;col < board[row].length; col++){
                System.out.print(board[row][col] + " | ");
                //System.out.print(board[row][col] + " -- ");
            }
            System.out.println();
        }

    }
}