import java.util.*;
import java.util.Scanner;

public class puzzle{

	static int [][] input = new int [4][4];

	public static void move_left(){
		for(int i = 0; i < 4; i++){// line 0,1,2,3
			for(int j = 0; j < 3; j++){ //算到倒数第二位

				if(input[i][j]==0){
					int idx = j+1;
					while(input[i][idx]==0 && idx <= 2){idx++;}
					input[i][j] = input[i][idx];
					input[i][idx] = 0;
				}		
			}

			for(int n = 0; n < 3; n++){
				if((input[i][n] == input[i][n+1])){
					input[i][n] += input[i][n];
					input[i][n+1] = 0;
				}			
			}

			for(int j = 0; j < 3; j++){ 
				if(input[i][j]==0){
					input[i][j] = input[i][j+1];
					input[i][j+1] = 0;
				}		
			}
		}
	}

	public static void move_right(){
		for(int i = 0; i < 4; i++){
			for(int j = 3; j > 0; j--){
				if(input[i][j]==0){
					int idx = j-1;
					while(input[i][idx]==0 && idx >0){idx--;}
					input[i][j] = input[i][idx];
					input[i][idx] = 0;
				}
			}

			for(int n = 3; n > 0; n--){
				if((input[i][n] == input[i][n-1])){
					input[i][n] +=input[i][n];
					input[i][n-1] = 0;
				}
			}

			for(int j = 3; j >0; j--){
				if(input[i][j]==0){
					input[i][j] = input[i][j-1];
					input[i][j-1] = 0;
				}
			}
		}
	}

	public static void move_up(){
		for(int j = 0; j < 4; j++){
			for(int i = 0; i < 3; i++){
				if(input[i][j] == 0){
					int idx = i+1;
					while(input[idx][j]==0 && idx <=2){idx++;}
					input[i][j] = input[idx][j];
					input[idx][j] = 0;
				}

			}
			
			for(int n = 0; n < 3; n++){
				if((input[n][j] == input[n+1][j])){
					input[n][j] += input[n][j];
					input[n+1][j] = 0;
				}			
			}

			for(int i = 0; i < 3; i++){ 
				if(input[i][j]==0){
					input[i][j] = input[i+1][j];
					input[i+1][j] = 0;
				}		
			}
		}
	}

	public static void move_down(){
		for(int j = 0; j < 4 ; j++){
			for(int i = 3; i >0; i--){
				if(input[i][j] == 0){
					int idx = i-1;
					while(input[idx][j]==0 && idx > 0){idx--;}
					input[i][j] = input[idx][j];
					input[idx][j] = 0;
				}

			}
			
			for(int n = 3; n > 0; n--){
				if((input[n][j] == input[n-1][j])){
					input[n][j] += input[n][j];
					input[n-1][j] = 0;
				}			
			}

			for(int i = 3; i > 0; i--){ 
				if(input[i][j]==0){
					input[i][j] = input[i-1][j];
					input[i-1][j] = 0;
				}		
			}
		}
	}

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		int move = 0;

		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				input[i][j] = (int)sc.nextInt();
			}
		}
		
		move = (int)sc.nextInt();
		
		if(move == 0){
			move_left();
		}else if(move == 1){
			move_up();
		}else if(move == 2){
			move_right();
		}else if(move == 3){
			move_down();
		}
		

		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}
}
